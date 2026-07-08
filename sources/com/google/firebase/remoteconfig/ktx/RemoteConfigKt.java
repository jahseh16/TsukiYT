package com.google.firebase.remoteconfig.ktx;

import com.google.firebase.FirebaseApp;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteConfigKt {
    public static final FirebaseRemoteConfigValue get(FirebaseRemoteConfig firebaseRemoteConfig, String key) {
        Intrinsics.checkNotNullParameter(firebaseRemoteConfig, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        FirebaseRemoteConfigValue value = firebaseRemoteConfig.getValue(key);
        Intrinsics.checkNotNullExpressionValue(value, "this.getValue(key)");
        return value;
    }

    public static final Flow<ConfigUpdate> getConfigUpdates(FirebaseRemoteConfig firebaseRemoteConfig) {
        Intrinsics.checkNotNullParameter(firebaseRemoteConfig, "<this>");
        return FlowKt.callbackFlow(new RemoteConfigKt$configUpdates$1(firebaseRemoteConfig, null));
    }

    public static /* synthetic */ void getConfigUpdates$annotations(FirebaseRemoteConfig firebaseRemoteConfig) {
    }

    public static final FirebaseRemoteConfig getRemoteConfig(Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "getInstance()");
        return firebaseRemoteConfig;
    }

    public static final FirebaseRemoteConfig remoteConfig(Firebase firebase, FirebaseApp app) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(app, "app");
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance(app);
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "getInstance(app)");
        return firebaseRemoteConfig;
    }

    public static final FirebaseRemoteConfigSettings remoteConfigSettings(Function1<? super FirebaseRemoteConfigSettings.Builder, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        FirebaseRemoteConfigSettings.Builder builder = new FirebaseRemoteConfigSettings.Builder();
        init.invoke(builder);
        FirebaseRemoteConfigSettings firebaseRemoteConfigSettingsBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfigSettingsBuild, "builder.build()");
        return firebaseRemoteConfigSettingsBuild;
    }
}
