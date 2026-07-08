package com.google.firebase.crashlytics.internal.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface CrashlyticsReport$Architecture {
    public static final int ARM64 = 9;
    public static final int ARMV6 = 5;
    public static final int ARMV7 = 6;
    public static final int UNKNOWN = 7;
    public static final int X86_32 = 0;
    public static final int X86_64 = 1;
}
