package com.google.firebase.crashlytics.internal;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import d5.n3;
import d5.y;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class CrashlyticsNativeComponentDeferredProxy implements CrashlyticsNativeComponent {
    private static final NativeSessionFileProvider MISSING_NATIVE_SESSION_FILE_PROVIDER = new MissingNativeSessionFileProvider((1) null);
    private final AtomicReference<CrashlyticsNativeComponent> availableNativeComponent = new AtomicReference<>(null);
    private final Deferred<CrashlyticsNativeComponent> deferredNativeComponent;

    public CrashlyticsNativeComponentDeferredProxy(Deferred<CrashlyticsNativeComponent> deferred) {
        this.deferredNativeComponent = deferred;
        deferred.whenAvailable(new y(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Provider provider) {
        Logger.getLogger().d("Crashlytics native component now available.");
        this.availableNativeComponent.set((CrashlyticsNativeComponent) provider.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepareNativeSession$1(String str, String str2, long j, StaticSessionData staticSessionData, Provider provider) {
        ((CrashlyticsNativeComponent) provider.get()).prepareNativeSession(str, str2, j, staticSessionData);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    @NonNull
    public NativeSessionFileProvider getSessionFileProvider(@NonNull String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.availableNativeComponent.get();
        return crashlyticsNativeComponent == null ? MISSING_NATIVE_SESSION_FILE_PROVIDER : crashlyticsNativeComponent.getSessionFileProvider(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForCurrentSession() {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.availableNativeComponent.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.hasCrashDataForCurrentSession();
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForSession(@NonNull String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.availableNativeComponent.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.hasCrashDataForSession(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public void prepareNativeSession(@NonNull String str, @NonNull String str2, long j, @NonNull StaticSessionData staticSessionData) {
        Logger.getLogger().v("Deferring native open session: " + str);
        this.deferredNativeComponent.whenAvailable(new n3(str, str2, j, staticSessionData));
    }
}
