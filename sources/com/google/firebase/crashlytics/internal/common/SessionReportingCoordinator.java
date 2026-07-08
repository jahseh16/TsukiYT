package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import bv.gv;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import g5.co;
import g5.i4;
import g5.mt;
import g5.p;
import g5.r;
import g5.tl;
import g5.w;
import g5.wz;
import g5.x4;
import g5.xc;
import g5.z;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class SessionReportingCoordinator {
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    private static final int EVENT_THREAD_IMPORTANCE = 4;
    private static final String EVENT_TYPE_CRASH = "crash";
    private static final String EVENT_TYPE_LOGGED = "error";
    private static final int MAX_CHAINED_EXCEPTION_DEPTH = 8;
    private final CrashlyticsWorkers crashlyticsWorkers;
    private final CrashlyticsReportDataCapture dataCapture;
    private final IdManager idManager;
    private final LogFileManager logFileManager;
    private final UserMetadata reportMetadata;
    private final CrashlyticsReportPersistence reportPersistence;
    private final DataTransportCrashlyticsReportSender reportsSender;

    public SessionReportingCoordinator(CrashlyticsReportDataCapture crashlyticsReportDataCapture, CrashlyticsReportPersistence crashlyticsReportPersistence, DataTransportCrashlyticsReportSender dataTransportCrashlyticsReportSender, LogFileManager logFileManager, UserMetadata userMetadata, IdManager idManager, CrashlyticsWorkers crashlyticsWorkers) {
        this.dataCapture = crashlyticsReportDataCapture;
        this.reportPersistence = crashlyticsReportPersistence;
        this.reportsSender = dataTransportCrashlyticsReportSender;
        this.logFileManager = logFileManager;
        this.reportMetadata = userMetadata;
        this.idManager = idManager;
        this.crashlyticsWorkers = crashlyticsWorkers;
    }

    private CrashlyticsReport.Session.Event addLogsAndCustomKeysToEvent(CrashlyticsReport.Session.Event event, LogFileManager logFileManager, UserMetadata userMetadata) {
        return addLogsCustomKeysAndEventKeysToEvent(event, logFileManager, userMetadata, Collections.emptyMap());
    }

    private CrashlyticsReport.Session.Event addLogsCustomKeysAndEventKeysToEvent(CrashlyticsReport.Session.Event event, LogFileManager logFileManager, UserMetadata userMetadata, Map<String, String> map) {
        CrashlyticsReport.Session.Event.Builder builder = event.toBuilder();
        String logString = logFileManager.getLogString();
        if (logString != null) {
            builder.setLog(CrashlyticsReport.Session.Event.Log.builder().setContent(logString).build());
        } else {
            Logger.getLogger().v("No log data to include with this event.");
        }
        List<CrashlyticsReport.CustomAttribute> sortedCustomAttributes = getSortedCustomAttributes(userMetadata.getCustomKeys(map));
        List<CrashlyticsReport.CustomAttribute> sortedCustomAttributes2 = getSortedCustomAttributes(userMetadata.getInternalKeys());
        if (!sortedCustomAttributes.isEmpty() || !sortedCustomAttributes2.isEmpty()) {
            builder.setApp(event.getApp().toBuilder().setCustomAttributes(sortedCustomAttributes).setInternalKeys(sortedCustomAttributes2).build());
        }
        return builder.build();
    }

    private CrashlyticsReport.Session.Event addMetaDataToEvent(CrashlyticsReport.Session.Event event, Map<String, String> map) {
        return addRolloutsStateToEvent(addLogsCustomKeysAndEventKeysToEvent(event, this.logFileManager, this.reportMetadata, map), this.reportMetadata);
    }

    private CrashlyticsReport.Session.Event addRolloutsStateToEvent(CrashlyticsReport.Session.Event event, UserMetadata userMetadata) {
        List<CrashlyticsReport.Session.Event.RolloutAssignment> rolloutsState = userMetadata.getRolloutsState();
        if (rolloutsState.isEmpty()) {
            return event;
        }
        CrashlyticsReport.Session.Event.Builder builder = event.toBuilder();
        builder.setRollouts(CrashlyticsReport.Session.Event.RolloutsState.builder().setRolloutAssignments(rolloutsState).build());
        return builder.build();
    }

    private static CrashlyticsReport.ApplicationExitInfo convertApplicationExitInfo(ApplicationExitInfo applicationExitInfo) {
        String strConvertInputStreamToString = null;
        try {
            InputStream inputStreamY = wz.y(applicationExitInfo);
            if (inputStreamY != null) {
                strConvertInputStreamToString = convertInputStreamToString(inputStreamY);
            }
        } catch (IOException e4) {
            Logger.getLogger().w("Could not get input trace in application exit info: " + xc.y(applicationExitInfo) + " Error: " + e4);
        }
        return CrashlyticsReport.ApplicationExitInfo.builder().setImportance(w.y(applicationExitInfo)).setProcessName(p.y(applicationExitInfo)).setReasonCode(applicationExitInfo.getReason()).setTimestamp(tl.y(applicationExitInfo)).setPid(mt.y(applicationExitInfo)).setPss(co.y(applicationExitInfo)).setRss(z.y(applicationExitInfo)).setTraceFile(strConvertInputStreamToString).build();
    }

    public static String convertInputStreamToString(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static SessionReportingCoordinator create(Context context, IdManager idManager, FileStore fileStore, AppData appData, LogFileManager logFileManager, UserMetadata userMetadata, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, CrashlyticsWorkers crashlyticsWorkers) {
        return new SessionReportingCoordinator(new CrashlyticsReportDataCapture(context, idManager, appData, stackTraceTrimmingStrategy, settingsProvider), new CrashlyticsReportPersistence(fileStore, settingsProvider, crashlyticsAppQualitySessionsSubscriber), DataTransportCrashlyticsReportSender.create(context, settingsProvider, onDemandCounter), logFileManager, userMetadata, idManager, crashlyticsWorkers);
    }

    private CrashlyticsReportWithSessionId ensureHasFid(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        if (crashlyticsReportWithSessionId.getReport().getFirebaseInstallationId() != null && crashlyticsReportWithSessionId.getReport().getFirebaseAuthenticationToken() != null) {
            return crashlyticsReportWithSessionId;
        }
        FirebaseInstallationId firebaseInstallationIdFetchTrueFid = this.idManager.fetchTrueFid(true);
        return CrashlyticsReportWithSessionId.create(crashlyticsReportWithSessionId.getReport().withFirebaseInstallationId(firebaseInstallationIdFetchTrueFid.getFid()).withFirebaseAuthenticationToken(firebaseInstallationIdFetchTrueFid.getAuthToken()), crashlyticsReportWithSessionId.getSessionId(), crashlyticsReportWithSessionId.getReportFile());
    }

    @Nullable
    private ApplicationExitInfo findRelevantApplicationExitInfo(String str, List<ApplicationExitInfo> list) {
        long startTimestampMillis = this.reportPersistence.getStartTimestampMillis(str);
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoY = gv.y(it.next());
            if (tl.y(applicationExitInfoY) < startTimestampMillis) {
                return null;
            }
            if (applicationExitInfoY.getReason() == 6) {
                return applicationExitInfoY;
            }
        }
        return null;
    }

    @NonNull
    private static List<CrashlyticsReport.CustomAttribute> getSortedCustomAttributes(@NonNull Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(CrashlyticsReport.CustomAttribute.builder().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }
        Collections.sort(arrayList, new i4());
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getSortedCustomAttributes$1(CrashlyticsReport.CustomAttribute customAttribute, CrashlyticsReport.CustomAttribute customAttribute2) {
        return customAttribute.getKey().compareTo(customAttribute2.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$persistEvent$0(CrashlyticsReport.Session.Event event, EventMetadata eventMetadata, boolean z) {
        Logger.getLogger().d("disk worker: log non-fatal event to persistence");
        this.reportPersistence.persistEvent(event, eventMetadata.getSessionId(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onReportSendComplete(@NonNull Task<CrashlyticsReportWithSessionId> task) {
        if (!task.isSuccessful()) {
            Logger.getLogger().w("Crashlytics report could not be enqueued to DataTransport", task.getException());
            return false;
        }
        CrashlyticsReportWithSessionId result = task.getResult();
        Logger.getLogger().d("Crashlytics report successfully enqueued to DataTransport: " + result.getSessionId());
        File reportFile = result.getReportFile();
        if (reportFile.delete()) {
            Logger.getLogger().d("Deleted report file: " + reportFile.getPath());
            return true;
        }
        Logger.getLogger().w("Crashlytics could not delete report file: " + reportFile.getPath());
        return true;
    }

    private void persistEvent(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, @NonNull EventMetadata eventMetadata, boolean z) {
        boolean zEquals = str.equals(EVENT_TYPE_CRASH);
        CrashlyticsReport.Session.Event eventAddMetaDataToEvent = addMetaDataToEvent(this.dataCapture.captureEventData(th, thread, str, eventMetadata.getTimestamp(), 4, 8, z), eventMetadata.getAdditionalCustomKeys());
        if (z) {
            this.reportPersistence.persistEvent(eventAddMetaDataToEvent, eventMetadata.getSessionId(), zEquals);
        } else {
            this.crashlyticsWorkers.diskWrite.submit((Runnable) new x4(this, eventAddMetaDataToEvent, eventMetadata, zEquals));
        }
    }

    public void finalizeSessionWithNativeEvent(@NonNull String str, @NonNull List<NativeSessionFile> list, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        Logger.getLogger().d("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator<NativeSessionFile> it = list.iterator();
        while (it.hasNext()) {
            CrashlyticsReport.FilesPayload.File fileAsFilePayload = it.next().asFilePayload();
            if (fileAsFilePayload != null) {
                arrayList.add(fileAsFilePayload);
            }
        }
        this.reportPersistence.finalizeSessionWithNativeEvent(str, CrashlyticsReport.FilesPayload.builder().setFiles(Collections.unmodifiableList(arrayList)).build(), applicationExitInfo);
    }

    public void finalizeSessions(long j, @Nullable String str) {
        this.reportPersistence.finalizeReports(str, j);
    }

    public boolean hasReportsToSend() {
        return this.reportPersistence.hasFinalizedReports();
    }

    public SortedSet<String> listSortedOpenSessionIds() {
        return this.reportPersistence.getOpenSessionIds();
    }

    public void onBeginSession(@NonNull String str, long j) {
        this.reportPersistence.persistReport(this.dataCapture.captureReportData(str, j));
    }

    public void persistFatalEvent(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, long j) {
        Logger.getLogger().v("Persisting fatal event for session " + str);
        persistEvent(th, thread, EVENT_TYPE_CRASH, new EventMetadata(str, j), true);
    }

    public void persistNonFatalEvent(@NonNull Throwable th, @NonNull Thread thread, @NonNull EventMetadata eventMetadata) {
        Logger.getLogger().v("Persisting non-fatal event for session " + eventMetadata.getSessionId());
        persistEvent(th, thread, EVENT_TYPE_LOGGED, eventMetadata, false);
    }

    public void persistRelevantAppExitInfoEvent(String str, List<ApplicationExitInfo> list, LogFileManager logFileManager, UserMetadata userMetadata) {
        ApplicationExitInfo applicationExitInfoFindRelevantApplicationExitInfo = findRelevantApplicationExitInfo(str, list);
        if (applicationExitInfoFindRelevantApplicationExitInfo == null) {
            Logger.getLogger().v("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        CrashlyticsReport.Session.Event eventCaptureAnrEventData = this.dataCapture.captureAnrEventData(convertApplicationExitInfo(applicationExitInfoFindRelevantApplicationExitInfo));
        Logger.getLogger().d("Persisting anr for session " + str);
        this.reportPersistence.persistEvent(addRolloutsStateToEvent(addLogsAndCustomKeysToEvent(eventCaptureAnrEventData, logFileManager, userMetadata), userMetadata), str, true);
    }

    public void removeAllReports() {
        this.reportPersistence.deleteAllReports();
    }

    public Task<Void> sendReports(@NonNull Executor executor) {
        return sendReports(executor, null);
    }

    public Task<Void> sendReports(@NonNull Executor executor, @Nullable String str) {
        List<CrashlyticsReportWithSessionId> listLoadFinalizedReports = this.reportPersistence.loadFinalizedReports();
        ArrayList arrayList = new ArrayList();
        for (CrashlyticsReportWithSessionId crashlyticsReportWithSessionId : listLoadFinalizedReports) {
            if (str == null || str.equals(crashlyticsReportWithSessionId.getSessionId())) {
                arrayList.add(this.reportsSender.enqueueReport(ensureHasFid(crashlyticsReportWithSessionId), str != null).continueWith(executor, new r(this)));
            }
        }
        return Tasks.whenAll(arrayList);
    }
}
