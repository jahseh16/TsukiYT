package com.google.android.gms.common.moduleinstall;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.CLASS)
public @interface ModuleInstallStatusUpdate$InstallState {
    public static final int STATE_CANCELED = 3;
    public static final int STATE_COMPLETED = 4;
    public static final int STATE_DOWNLOADING = 2;
    public static final int STATE_DOWNLOAD_PAUSED = 7;
    public static final int STATE_FAILED = 5;
    public static final int STATE_INSTALLING = 6;
    public static final int STATE_PENDING = 1;
    public static final int STATE_UNKNOWN = 0;
}
