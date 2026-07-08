package com.google.android.gms.common.moduleinstall;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.CLASS)
public @interface ModuleAvailabilityResponse$AvailabilityStatus {
    public static final int STATUS_ALREADY_AVAILABLE = 0;
    public static final int STATUS_READY_TO_DOWNLOAD = 1;
    public static final int STATUS_UNKNOWN_MODULE = 2;
}
