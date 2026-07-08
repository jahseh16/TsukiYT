package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface ConfigUpdateListener {
    void onError(@NonNull FirebaseRemoteConfigException firebaseRemoteConfigException);

    void onUpdate(@NonNull ConfigUpdate configUpdate);
}
