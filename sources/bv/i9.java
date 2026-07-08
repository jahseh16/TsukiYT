package bv;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i9 {
    public static final String y = yk.f.a("ProcessUtils");

    public static boolean n3(@NonNull Context context, @NonNull androidx.work.y yVar) {
        String strY = y(context);
        return !TextUtils.isEmpty(yVar.zn()) ? TextUtils.equals(strY, yVar.zn()) : TextUtils.equals(strY, context.getApplicationInfo().processName);
    }

    @Nullable
    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    public static String y(@NonNull Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, i9.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable th) {
            yk.f.zn().y(y, "Unable to check ActivityThread for processName", th);
        }
        int iMyPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }
}
