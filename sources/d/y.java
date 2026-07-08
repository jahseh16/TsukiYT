package d;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.hjq.permissions.Permission;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class y {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sLock = new Object();
    private static final Object sSync = new Object();
    private static TypedValue sTempValue;

    public static class a {
        public static File n3(Context context) {
            return context.getDataDir();
        }

        public static Context y(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static boolean zn(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public static class c5 {
        public static Display n3(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Log.w(y.TAG, "The context:" + context + " is not associated with any display. Return a fallback display instead.");
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }

        public static String y(Context context) {
            return context.getAttributionTag();
        }
    }

    public static final class f {
        public static final HashMap<Class<?>, String> y;

        static {
            HashMap<Class<?>, String> map = new HashMap<>();
            y = map;
            if (Build.VERSION.SDK_INT >= 22) {
                map.put(d.n3.y(), "telephony_subscription_service");
                map.put(UsageStatsManager.class, "usagestats");
            }
            map.put(AppWidgetManager.class, "appwidget");
            map.put(BatteryManager.class, "batterymanager");
            map.put(CameraManager.class, "camera");
            map.put(JobScheduler.class, "jobscheduler");
            map.put(LauncherApps.class, "launcherapps");
            map.put(MediaProjectionManager.class, "media_projection");
            map.put(MediaSessionManager.class, "media_session");
            map.put(RestrictionsManager.class, "restrictions");
            map.put(TelecomManager.class, "telecom");
            map.put(TvInputManager.class, "tv_input");
            map.put(AppOpsManager.class, "appops");
            map.put(CaptioningManager.class, "captioning");
            map.put(ConsumerIrManager.class, "consumer_ir");
            map.put(PrintManager.class, "print");
            map.put(BluetoothManager.class, "bluetooth");
            map.put(DisplayManager.class, "display");
            map.put(UserManager.class, "user");
            map.put(InputManager.class, "input");
            map.put(MediaRouter.class, "media_router");
            map.put(NsdManager.class, "servicediscovery");
            map.put(AccessibilityManager.class, "accessibility");
            map.put(AccountManager.class, "account");
            map.put(ActivityManager.class, "activity");
            map.put(AlarmManager.class, NotificationCompat.CATEGORY_ALARM);
            map.put(AudioManager.class, "audio");
            map.put(ClipboardManager.class, "clipboard");
            map.put(ConnectivityManager.class, "connectivity");
            map.put(DevicePolicyManager.class, "device_policy");
            map.put(DownloadManager.class, "download");
            map.put(DropBoxManager.class, "dropbox");
            map.put(InputMethodManager.class, "input_method");
            map.put(KeyguardManager.class, "keyguard");
            map.put(LayoutInflater.class, "layout_inflater");
            map.put(LocationManager.class, "location");
            map.put(NfcManager.class, "nfc");
            map.put(NotificationManager.class, "notification");
            map.put(PowerManager.class, "power");
            map.put(SearchManager.class, "search");
            map.put(SensorManager.class, "sensor");
            map.put(StorageManager.class, "storage");
            map.put(TelephonyManager.class, "phone");
            map.put(TextServicesManager.class, "textservices");
            map.put(UiModeManager.class, "uimode");
            map.put(UsbManager.class, "usb");
            map.put(Vibrator.class, "vibrator");
            map.put(WallpaperManager.class, "wallpaper");
            map.put(WifiP2pManager.class, "wifip2p");
            map.put(WifiManager.class, "wifi");
            map.put(WindowManager.class, "window");
        }
    }

    public static class fb {
        public static ComponentName n3(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }

        public static Intent y(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return ((i & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1) : context.registerReceiver(broadcastReceiver, intentFilter, y.obtainAndCheckReceiverPermission(context), handler);
        }
    }

    public static class gv {
        public static Drawable n3(Context context, int i) {
            return context.getDrawable(i);
        }

        public static File y(Context context) {
            return context.getCodeCacheDir();
        }

        public static File zn(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    public static class i9 {
        public static Intent y(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }

    public static class n3 {
        public static Context y(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }
    }

    public static class s {
        public static Executor y(Context context) {
            return context.getMainExecutor();
        }
    }

    public static class v {
        public static <T> T n3(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static int y(Context context, int i) {
            return context.getColor(i);
        }

        public static String zn(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* JADX INFO: renamed from: d.y$y, reason: collision with other inner class name */
    public static class C0077y {
        public static void n3(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }

        public static void y(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }
    }

    public static class zn {
        public static File[] n3(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        public static File[] y(Context context) {
            return context.getExternalCacheDirs();
        }

        public static File[] zn(Context context) {
            return context.getObbDirs();
        }
    }

    public static int checkSelfPermission(@NonNull Context context, @NonNull String str) {
        j5.zn.gv(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals(Permission.POST_NOTIFICATIONS, str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : NotificationManagerCompat.from(context).areNotificationsEnabled() ? 0 : -1;
    }

    @Nullable
    public static Context createDeviceProtectedStorageContext(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.y(context);
        }
        return null;
    }

    private static File createFilesDir(File file) {
        synchronized (sSync) {
            try {
                if (!file.exists()) {
                    if (file.mkdirs()) {
                        return file;
                    }
                    Log.w(TAG, "Unable to create files subdir " + file.getPath());
                }
                return file;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public static String getAttributionTag(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return c5.y(context);
        }
        return null;
    }

    @NonNull
    public static File getCodeCacheDir(@NonNull Context context) {
        return gv.y(context);
    }

    public static int getColor(@NonNull Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? v.y(context, i) : context.getResources().getColor(i);
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Context context, int i) {
        return ej.s.v(context.getResources(), i, context.getTheme());
    }

    @NonNull
    public static Context getContextForLanguage(@NonNull Context context) {
        yt.f fVarY = ta.i9.y(context);
        if (Build.VERSION.SDK_INT > 32 || fVarY.fb()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        yt.fb.n3(configuration, fVarY);
        return n3.y(context, configuration);
    }

    @Nullable
    public static File getDataDir(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.n3(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    @NonNull
    public static Display getDisplayOrDefault(@NonNull Context context) {
        return Build.VERSION.SDK_INT >= 30 ? c5.n3(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Context context, int i) {
        return gv.n3(context, i);
    }

    @NonNull
    public static File[] getExternalCacheDirs(@NonNull Context context) {
        return zn.y(context);
    }

    @NonNull
    public static File[] getExternalFilesDirs(@NonNull Context context, @Nullable String str) {
        return zn.n3(context, str);
    }

    @NonNull
    public static Executor getMainExecutor(@NonNull Context context) {
        return Build.VERSION.SDK_INT >= 28 ? s.y(context) : yt.c5.y(new Handler(context.getMainLooper()));
    }

    @Nullable
    public static File getNoBackupFilesDir(@NonNull Context context) {
        return gv.zn(context);
    }

    @NonNull
    public static File[] getObbDirs(@NonNull Context context) {
        return zn.zn(context);
    }

    @NonNull
    public static String getString(@NonNull Context context, int i) {
        return getContextForLanguage(context).getString(i);
    }

    @Nullable
    public static <T> T getSystemService(@NonNull Context context, @NonNull Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return (T) v.n3(context, cls);
        }
        String systemServiceName = getSystemServiceName(context, cls);
        if (systemServiceName != null) {
            return (T) context.getSystemService(systemServiceName);
        }
        return null;
    }

    @Nullable
    public static String getSystemServiceName(@NonNull Context context, @NonNull Class<?> cls) {
        return Build.VERSION.SDK_INT >= 23 ? v.zn(context, cls) : f.y.get(cls);
    }

    public static boolean isDeviceProtectedStorage(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.zn(context);
        }
        return false;
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (d.a.n3(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    @Nullable
    public static Intent registerReceiver(@NonNull Context context, @Nullable BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, int i) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i);
    }

    public static boolean startActivities(@NonNull Context context, @NonNull Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static void startActivity(@NonNull Context context, @NonNull Intent intent, @Nullable Bundle bundle) {
        C0077y.n3(context, intent, bundle);
    }

    public static void startForegroundService(@NonNull Context context, @NonNull Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            fb.n3(context, intent);
        } else {
            context.startService(intent);
        }
    }

    @Nullable
    public static Intent registerReceiver(@NonNull Context context, @Nullable BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, @Nullable String str, @Nullable Handler handler, int i) {
        int i5 = i & 1;
        if (i5 != 0 && (i & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i5 != 0) {
            i |= 2;
        }
        int i8 = i;
        int i10 = i8 & 2;
        if (i10 == 0 && (i8 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i10 != 0 && (i8 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i11 = Build.VERSION.SDK_INT;
        return i11 >= 33 ? i9.y(context, broadcastReceiver, intentFilter, str, handler, i8) : i11 >= 26 ? fb.y(context, broadcastReceiver, intentFilter, str, handler, i8) : ((i8 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
    }

    public static boolean startActivities(@NonNull Context context, @NonNull Intent[] intentArr, @Nullable Bundle bundle) {
        C0077y.y(context, intentArr, bundle);
        return true;
    }
}
