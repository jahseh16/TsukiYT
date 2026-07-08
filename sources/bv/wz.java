package bv;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class wz {
    public static final String y = yk.f.a("WakeLocks");
    public static final WeakHashMap<PowerManager.WakeLock, String> n3 = new WeakHashMap<>();

    public static PowerManager.WakeLock n3(@NonNull Context context, @NonNull String str) {
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str2);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = n3;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, str2);
        }
        return wakeLockNewWakeLock;
    }

    public static void y() {
        HashMap map = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = n3;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                yk.f.zn().s(y, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
    }
}
