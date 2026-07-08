package com.google.firebase.crashlytics.ktx;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class KeyValueBuilder {
    private final FirebaseCrashlytics crashlytics;

    public KeyValueBuilder(FirebaseCrashlytics crashlytics) {
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.crashlytics = crashlytics;
    }

    public final void key(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, z);
    }

    public final void key(String key, double d4) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, d4);
    }

    public final void key(String key, float f3) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, f3);
    }

    public final void key(String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, i);
    }

    public final void key(String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, j);
    }

    public final void key(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.crashlytics.setCustomKey(key, value);
    }
}
