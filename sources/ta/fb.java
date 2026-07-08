package ta;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class fb {

    public static class n3 {
        @NonNull
        public static String n3(@NonNull Context context) {
            return context.getOpPackageName();
        }

        public static int y(@Nullable AppOpsManager appOpsManager, @NonNull String str, int i, @NonNull String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        @Nullable
        public static AppOpsManager zn(@NonNull Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    public static class y {
        public static String gv(String str) {
            return AppOpsManager.permissionToOp(str);
        }

        public static int n3(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        public static <T> T y(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static int zn(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }
    }

    public static int n3(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return y.zn((AppOpsManager) y.y(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    public static int y(@NonNull Context context, int i, @NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return n3(context, str, str2);
        }
        AppOpsManager appOpsManagerZn = n3.zn(context);
        int iY = n3.y(appOpsManagerZn, str, Binder.getCallingUid(), str2);
        return iY != 0 ? iY : n3.y(appOpsManagerZn, str, i, n3.n3(context));
    }

    @Nullable
    public static String zn(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return y.gv(str);
        }
        return null;
    }
}
