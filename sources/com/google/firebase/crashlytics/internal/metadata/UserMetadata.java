package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import l5.n3;
import l5.y;
import l5.zn;

/* JADX INFO: loaded from: classes.dex */
public class UserMetadata {
    public static final String INTERNAL_KEYDATA_FILENAME = "internal-keys";
    public static final String KEYDATA_FILENAME = "keys";
    public static final int MAX_ATTRIBUTES = 64;
    public static final int MAX_ATTRIBUTE_SIZE = 1024;
    public static final int MAX_INTERNAL_KEY_SIZE = 8192;
    public static final int MAX_ROLLOUT_ASSIGNMENTS = 128;
    public static final String ROLLOUTS_STATE_FILENAME = "rollouts-state";
    public static final String USERDATA_FILENAME = "user-data";
    private final CrashlyticsWorkers crashlyticsWorkers;
    private final MetaDataStore metaDataStore;
    private String sessionIdentifier;
    private final SerializeableKeysMap customKeys = new SerializeableKeysMap(this, false);
    private final SerializeableKeysMap internalKeys = new SerializeableKeysMap(this, true);
    private final RolloutAssignmentList rolloutsState = new RolloutAssignmentList(128);
    private final AtomicMarkableReference<String> userId = new AtomicMarkableReference<>(null, false);

    public UserMetadata(String str, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) {
        this.sessionIdentifier = str;
        this.metaDataStore = new MetaDataStore(fileStore);
        this.crashlyticsWorkers = crashlyticsWorkers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setNewSession$0(String str, Map map, List list) {
        if (getUserId() != null) {
            this.metaDataStore.writeUserData(str, getUserId());
        }
        if (!map.isEmpty()) {
            this.metaDataStore.writeKeyData(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        this.metaDataStore.writeRolloutState(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateRolloutsState$1(List list) {
        this.metaDataStore.writeRolloutState(this.sessionIdentifier, list);
    }

    public static UserMetadata loadFromExistingSession(String str, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) {
        MetaDataStore metaDataStore = new MetaDataStore(fileStore);
        UserMetadata userMetadata = new UserMetadata(str, fileStore, crashlyticsWorkers);
        ((KeysMap) userMetadata.customKeys.map.getReference()).setKeys(metaDataStore.readKeyData(str, false));
        ((KeysMap) userMetadata.internalKeys.map.getReference()).setKeys(metaDataStore.readKeyData(str, true));
        userMetadata.userId.set(metaDataStore.readUserId(str), false);
        userMetadata.rolloutsState.updateRolloutAssignmentList(metaDataStore.readRolloutsState(str));
        return userMetadata;
    }

    @Nullable
    public static String readUserId(String str, FileStore fileStore) {
        return new MetaDataStore(fileStore).readUserId(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serializeUserDataIfNeeded() {
        boolean z;
        String userId;
        synchronized (this.userId) {
            try {
                z = false;
                if (this.userId.isMarked()) {
                    userId = getUserId();
                    this.userId.set(userId, false);
                    z = true;
                } else {
                    userId = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.metaDataStore.writeUserData(this.sessionIdentifier, userId);
        }
    }

    public Map<String, String> getCustomKeys(Map<String, String> map) {
        if (map.isEmpty()) {
            return this.customKeys.getKeys();
        }
        HashMap map2 = new HashMap(this.customKeys.getKeys());
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strSanitizeString = KeysMap.sanitizeString(entry.getKey(), MAX_ATTRIBUTE_SIZE);
            if (map2.size() < 64 || map2.containsKey(strSanitizeString)) {
                map2.put(strSanitizeString, KeysMap.sanitizeString(entry.getValue(), MAX_ATTRIBUTE_SIZE));
            } else {
                i++;
            }
        }
        if (i > 0) {
            Logger.getLogger().w("Ignored " + i + " keys when adding event specific keys. Maximum allowable: " + MAX_ATTRIBUTE_SIZE);
        }
        return Collections.unmodifiableMap(map2);
    }

    public Map<String, String> getInternalKeys() {
        return this.internalKeys.getKeys();
    }

    public List<CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutsState() {
        return this.rolloutsState.getReportRolloutsState();
    }

    @Nullable
    public String getUserId() {
        return this.userId.getReference();
    }

    public boolean setCustomKey(String str, String str2) {
        return this.customKeys.setKey(str, str2);
    }

    public void setCustomKeys(Map<String, String> map) {
        this.customKeys.setKeys(map);
    }

    public boolean setInternalKey(String str, String str2) {
        return this.internalKeys.setKey(str, str2);
    }

    public void setNewSession(String str) {
        synchronized (this.sessionIdentifier) {
            this.sessionIdentifier = str;
            this.crashlyticsWorkers.diskWrite.submit((Runnable) new n3(this, str, this.customKeys.getKeys(), this.rolloutsState.getRolloutAssignmentList()));
        }
    }

    public void setUserId(String str) {
        String strSanitizeString = KeysMap.sanitizeString(str, MAX_ATTRIBUTE_SIZE);
        synchronized (this.userId) {
            try {
                if (CommonUtils.nullSafeEquals(strSanitizeString, this.userId.getReference())) {
                    return;
                }
                this.userId.set(strSanitizeString, true);
                this.crashlyticsWorkers.diskWrite.submit((Runnable) new zn(this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean updateRolloutsState(List<RolloutAssignment> list) {
        synchronized (this.rolloutsState) {
            try {
                if (!this.rolloutsState.updateRolloutAssignmentList(list)) {
                    return false;
                }
                this.crashlyticsWorkers.diskWrite.submit((Runnable) new y(this, this.rolloutsState.getRolloutAssignmentList()));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Map<String, String> getCustomKeys() {
        return this.customKeys.getKeys();
    }
}
