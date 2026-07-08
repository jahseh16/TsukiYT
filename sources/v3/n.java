package v3;

import android.os.Build;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static x4 y() {
        switch (Build.VERSION.SDK_INT) {
            case 21:
                return new mg();
            case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND /* 22 */:
                return new ta();
            case ConnectionResult.API_DISABLED /* 23 */:
                return new ud();
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return new a8();
            case 25:
                return new x();
            case 26:
                return new yt();
            case 27:
                if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                    return new vl();
                }
                break;
        }
        return new j5();
    }
}
