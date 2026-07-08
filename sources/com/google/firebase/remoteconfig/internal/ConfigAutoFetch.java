package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import j6.y;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ConfigAutoFetch {
    private static final int MAXIMUM_FETCH_ATTEMPTS = 3;
    private static final String REALTIME_DISABLED_KEY = "featureDisabled";
    private static final String TEMPLATE_VERSION_KEY = "latestTemplateVersionNumber";
    private final ConfigCacheClient activatedCache;
    private final ConfigFetchHandler configFetchHandler;
    private final Set<ConfigUpdateListener> eventListeners;
    private final HttpURLConnection httpURLConnection;
    private final Random random = new Random();
    private final ConfigUpdateListener retryCallback;
    private final ScheduledExecutorService scheduledExecutorService;

    public ConfigAutoFetch(HttpURLConnection httpURLConnection, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Set<ConfigUpdateListener> set, ConfigUpdateListener configUpdateListener, ScheduledExecutorService scheduledExecutorService) {
        this.httpURLConnection = httpURLConnection;
        this.configFetchHandler = configFetchHandler;
        this.activatedCache = configCacheClient;
        this.eventListeners = set;
        this.retryCallback = configUpdateListener;
        this.scheduledExecutorService = scheduledExecutorService;
    }

    private void autoFetch(int i, long j) {
        if (i == 0) {
            propagateErrors(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.scheduledExecutorService.schedule((Runnable) new 1(this, i, j), this.random.nextInt(4), TimeUnit.SECONDS);
        }
    }

    private synchronized void executeAllListenerCallbacks(ConfigUpdate configUpdate) {
        Iterator<ConfigUpdateListener> it = this.eventListeners.iterator();
        while (it.hasNext()) {
            it.next().onUpdate(configUpdate);
        }
    }

    private static Boolean fetchResponseIsUpToDate(ConfigFetchHandler.FetchResponse fetchResponse, long j) {
        if (fetchResponse.getFetchedConfigs() != null) {
            return Boolean.valueOf(fetchResponse.getFetchedConfigs().getTemplateVersionNumber() >= j);
        }
        return Boolean.valueOf(fetchResponse.getStatus() == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r5 = new org.json.JSONObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r5.has(com.google.firebase.remoteconfig.internal.ConfigAutoFetch.REALTIME_DISABLED_KEY) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r5.getBoolean(com.google.firebase.remoteconfig.internal.ConfigAutoFetch.REALTIME_DISABLED_KEY) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        r9.retryCallback.onError(new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (isEventListenersEmpty() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r5.has(com.google.firebase.remoteconfig.internal.ConfigAutoFetch.TEMPLATE_VERSION_KEY) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        r6 = r9.configFetchHandler.getTemplateVersionNumber();
        r4 = r5.getLong(com.google.firebase.remoteconfig.internal.ConfigAutoFetch.TEMPLATE_VERSION_KEY);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r4 <= r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        autoFetch(3, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void handleNotifications(java.io.InputStream r10) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = "latestTemplateVersionNumber"
            java.lang.String r1 = "featureDisabled"
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.lang.String r4 = "utf-8"
            r3.<init>(r10, r4)
            r2.<init>(r3)
            java.lang.String r3 = ""
        L12:
            r4 = r3
        L13:
            java.lang.String r5 = r2.readLine()
            if (r5 == 0) goto L96
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "}"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L13
            java.lang.String r4 = r9.parseAndValidateConfigUpdateMessage(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L3b
            goto L13
        L3b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5b
            r5.<init>(r4)     // Catch: org.json.JSONException -> L5b
            boolean r4 = r5.has(r1)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L5d
            boolean r4 = r5.getBoolean(r1)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L5d
            com.google.firebase.remoteconfig.ConfigUpdateListener r4 = r9.retryCallback     // Catch: org.json.JSONException -> L5b
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException     // Catch: org.json.JSONException -> L5b
            java.lang.String r6 = "The server is temporarily unavailable. Try again in a few minutes."
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code r7 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_UNAVAILABLE     // Catch: org.json.JSONException -> L5b
            r5.<init>(r6, r7)     // Catch: org.json.JSONException -> L5b
            r4.onError(r5)     // Catch: org.json.JSONException -> L5b
            goto L96
        L5b:
            r4 = move-exception
            goto L7d
        L5d:
            boolean r4 = r9.isEventListenersEmpty()     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L64
            goto L96
        L64:
            boolean r4 = r5.has(r0)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L12
            com.google.firebase.remoteconfig.internal.ConfigFetchHandler r4 = r9.configFetchHandler     // Catch: org.json.JSONException -> L5b
            long r6 = r4.getTemplateVersionNumber()     // Catch: org.json.JSONException -> L5b
            long r4 = r5.getLong(r0)     // Catch: org.json.JSONException -> L5b
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L12
            r6 = 3
            r9.autoFetch(r6, r4)     // Catch: org.json.JSONException -> L5b
            goto L12
        L7d:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException
            java.lang.Throwable r6 = r4.getCause()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code r7 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_MESSAGE_INVALID
            java.lang.String r8 = "Unable to parse config update message."
            r5.<init>(r8, r6, r7)
            r9.propagateErrors(r5)
            java.lang.String r5 = "FirebaseRemoteConfig"
            java.lang.String r6 = "Unable to parse latest config update message."
            android.util.Log.e(r5, r6, r4)
            goto L12
        L96:
            r2.close()
            r10.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigAutoFetch.handleNotifications(java.io.InputStream):void");
    }

    private synchronized boolean isEventListenersEmpty() {
        return this.eventListeners.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$fetchLatestConfig$0(Task task, Task task2, long j, int i, Task task3) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task2.getException()));
        }
        ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) task.getResult();
        ConfigContainer configContainerBuild = (ConfigContainer) task2.getResult();
        if (!fetchResponseIsUpToDate(fetchResponse, j).booleanValue()) {
            Log.d(FirebaseRemoteConfig.TAG, "Fetched template version is the same as SDK's current version. Retrying fetch.");
            autoFetch(i, j);
            return Tasks.forResult(null);
        }
        if (fetchResponse.getFetchedConfigs() == null) {
            Log.d(FirebaseRemoteConfig.TAG, "The fetch succeeded, but the backend had no updates.");
            return Tasks.forResult(null);
        }
        if (configContainerBuild == null) {
            configContainerBuild = ConfigContainer.newBuilder().build();
        }
        Set<String> changedParams = configContainerBuild.getChangedParams(fetchResponse.getFetchedConfigs());
        if (changedParams.isEmpty()) {
            Log.d(FirebaseRemoteConfig.TAG, "Config was fetched, but no params changed.");
            return Tasks.forResult(null);
        }
        executeAllListenerCallbacks(ConfigUpdate.create(changedParams));
        return Tasks.forResult(null);
    }

    private String parseAndValidateConfigUpdateMessage(String str) {
        int iIndexOf = str.indexOf(123);
        int iLastIndexOf = str.lastIndexOf(125);
        return (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : str.substring(iIndexOf, iLastIndexOf + 1);
    }

    private synchronized void propagateErrors(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<ConfigUpdateListener> it = this.eventListeners.iterator();
        while (it.hasNext()) {
            it.next().onError(firebaseRemoteConfigException);
        }
    }

    public synchronized Task<Void> fetchLatestConfig(int i, long j) {
        int i5;
        Task<ConfigFetchHandler.FetchResponse> taskFetchNowWithTypeAndAttemptNumber;
        Task<ConfigContainer> task;
        i5 = i - 1;
        taskFetchNowWithTypeAndAttemptNumber = this.configFetchHandler.fetchNowWithTypeAndAttemptNumber(ConfigFetchHandler.FetchType.REALTIME, 3 - i5);
        task = this.activatedCache.get();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskFetchNowWithTypeAndAttemptNumber, task}).continueWithTask(this.scheduledExecutorService, new y(this, taskFetchNowWithTypeAndAttemptNumber, task, j, i5));
    }

    public void listenForNotifications() {
        HttpURLConnection httpURLConnection = this.httpURLConnection;
        if (httpURLConnection == null) {
            return;
        }
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                handleNotifications(inputStream);
                inputStream.close();
            } catch (IOException e4) {
                Log.d(FirebaseRemoteConfig.TAG, "Stream was cancelled due to an exception. Retrying the connection...", e4);
            }
        } finally {
            this.httpURLConnection.disconnect();
        }
    }
}
