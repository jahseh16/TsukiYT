package ta;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    public static class y {
        public static boolean n3(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        public static Intent y(Activity activity) {
            return activity.getParentActivityIntent();
        }

        public static boolean zn(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    public static boolean a(@NonNull Activity activity, @NonNull Intent intent) {
        return y.zn(activity, intent);
    }

    @Nullable
    public static String gv(@NonNull Context context, @NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i >= 29 ? 269222528 : i >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    @Nullable
    public static Intent n3(@NonNull Context context, @NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strGv = gv(context, componentName);
        if (strGv == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strGv);
        return gv(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static void v(@NonNull Activity activity, @NonNull Intent intent) {
        y.n3(activity, intent);
    }

    @Nullable
    public static Intent y(@NonNull Activity activity) {
        Intent intentY = y.y(activity);
        if (intentY != null) {
            return intentY;
        }
        String strZn = zn(activity);
        if (strZn == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strZn);
        try {
            return gv(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strZn + "' in manifest");
            return null;
        }
    }

    @Nullable
    public static String zn(@NonNull Activity activity) {
        try {
            return gv(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e4) {
            throw new IllegalArgumentException(e4);
        }
    }
}
