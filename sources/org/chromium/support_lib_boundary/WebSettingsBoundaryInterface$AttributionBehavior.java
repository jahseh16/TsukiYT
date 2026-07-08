package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface WebSettingsBoundaryInterface$AttributionBehavior {
    public static final int APP_SOURCE_AND_APP_TRIGGER = 3;
    public static final int APP_SOURCE_AND_WEB_TRIGGER = 1;
    public static final int DISABLED = 0;
    public static final int WEB_SOURCE_AND_WEB_TRIGGER = 2;
}
