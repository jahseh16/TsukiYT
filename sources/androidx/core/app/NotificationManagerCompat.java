package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import zn.y;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationManagerCompat {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static gv f767fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static String f768gv;
    public final NotificationManager n3;
    public final Context y;
    public static final Object zn = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static Set<String> f769v = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f766a = new Object();

    public static class gv implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final Handler f771fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final HandlerThread f773v;
        public final Context y;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Map<ComponentName, y> f772s = new HashMap();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Set<String> f770f = new HashSet();

        public gv(Context context) {
            this.y = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f773v = handlerThread;
            handlerThread.start();
            this.f771fb = new Handler(handlerThread.getLooper(), this);
        }

        public final void a(ComponentName componentName) {
            y yVar = this.f772s.get(componentName);
            if (yVar != null) {
                n3(yVar);
            }
        }

        public final void c5(y yVar) {
            if (this.f771fb.hasMessages(3, yVar.y)) {
                return;
            }
            int i = yVar.v;
            int i5 = i + 1;
            yVar.v = i5;
            if (i5 <= 6) {
                int i8 = (1 << i) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i8 + " ms");
                }
                this.f771fb.sendMessageDelayed(this.f771fb.obtainMessage(3, yVar.y), i8);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + yVar.gv.size() + " tasks to " + yVar.y + " after " + yVar.v + " retries");
            yVar.gv.clear();
        }

        public final void fb(y yVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + yVar.y + ", " + yVar.gv.size() + " queued tasks");
            }
            if (yVar.gv.isEmpty()) {
                return;
            }
            if (!y(yVar) || yVar.zn == null) {
                c5(yVar);
                return;
            }
            while (true) {
                v vVar = (v) yVar.gv.peek();
                if (vVar == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + vVar);
                    }
                    vVar.y(yVar.zn);
                    yVar.gv.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + yVar.y);
                    }
                } catch (RemoteException e4) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + yVar.y, e4);
                }
            }
            if (yVar.gv.isEmpty()) {
                return;
            }
            c5(yVar);
        }

        public final void gv(ComponentName componentName) {
            y yVar = this.f772s.get(componentName);
            if (yVar != null) {
                fb(yVar);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                zn((v) message.obj);
                return true;
            }
            if (i == 1) {
                zn znVar = (zn) message.obj;
                v(znVar.y, znVar.n3);
                return true;
            }
            if (i == 2) {
                a((ComponentName) message.obj);
                return true;
            }
            if (i != 3) {
                return false;
            }
            gv((ComponentName) message.obj);
            return true;
        }

        public final void i9() {
            Set<String> setZn = NotificationManagerCompat.zn(this.y);
            if (setZn.equals(this.f770f)) {
                return;
            }
            this.f770f = setZn;
            List<ResolveInfo> listQueryIntentServices = this.y.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setZn.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f772s.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f772s.put(componentName2, new y(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, y>> it = this.f772s.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, y> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    n3(next.getValue());
                    it.remove();
                }
            }
        }

        public final void n3(y yVar) {
            if (yVar.n3) {
                this.y.unbindService(this);
                yVar.n3 = false;
            }
            yVar.zn = null;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f771fb.obtainMessage(1, new zn(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f771fb.obtainMessage(2, componentName).sendToTarget();
        }

        public void s(v vVar) {
            this.f771fb.obtainMessage(0, vVar).sendToTarget();
        }

        public final void v(ComponentName componentName, IBinder iBinder) {
            y yVar = this.f772s.get(componentName);
            if (yVar != null) {
                yVar.zn = y.y.z(iBinder);
                yVar.v = 0;
                fb(yVar);
            }
        }

        public final boolean y(y yVar) {
            if (yVar.n3) {
                return true;
            }
            boolean zBindService = this.y.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(yVar.y), this, 33);
            yVar.n3 = zBindService;
            if (zBindService) {
                yVar.v = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + yVar.y);
                this.y.unbindService(this);
            }
            return yVar.n3;
        }

        public final void zn(v vVar) {
            i9();
            for (y yVar : this.f772s.values()) {
                yVar.gv.add(vVar);
                fb(yVar);
            }
        }
    }

    public static class n3 implements v {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final Notification f774gv;
        public final int n3;
        public final String y;
        public final String zn;

        public n3(String str, int i, String str2, Notification notification) {
            this.y = str;
            this.n3 = i;
            this.zn = str2;
            this.f774gv = notification;
        }

        @NonNull
        public String toString() {
            return "NotifyTask[packageName:" + this.y + ", id:" + this.n3 + ", tag:" + this.zn + "]";
        }

        @Override // androidx.core.app.NotificationManagerCompat.v
        public void y(zn.y yVar) throws RemoteException {
            yVar.q5(this.y, this.n3, this.zn, this.f774gv);
        }
    }

    public interface v {
        void y(zn.y yVar) throws RemoteException;
    }

    public static class y {
        public static int n3(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }

        public static boolean y(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    public NotificationManagerCompat(Context context) {
        this.y = context;
        this.n3 = (NotificationManager) context.getSystemService("notification");
    }

    public static boolean fb(Notification notification) {
        Bundle extras = NotificationCompat.getExtras(notification);
        return extras != null && extras.getBoolean("android.support.useSideChannel");
    }

    @NonNull
    public static NotificationManagerCompat from(@NonNull Context context) {
        return new NotificationManagerCompat(context);
    }

    @NonNull
    public static Set<String> zn(@NonNull Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (zn) {
            if (string != null) {
                try {
                    if (!string.equals(f768gv)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f769v = hashSet;
                        f768gv = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = f769v;
        }
        return set;
    }

    public final void a(v vVar) {
        synchronized (f766a) {
            try {
                if (f767fb == null) {
                    f767fb = new gv(this.y.getApplicationContext());
                }
                f767fb.s(vVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean areNotificationsEnabled() {
        if (Build.VERSION.SDK_INT >= 24) {
            return y.y(this.n3);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.y.getSystemService("appops");
        ApplicationInfo applicationInfo = this.y.getApplicationInfo();
        String packageName = this.y.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void gv(int i, @NonNull Notification notification) {
        v(null, i, notification);
    }

    public void n3(@Nullable String str, int i) {
        this.n3.cancel(str, i);
    }

    public void v(@Nullable String str, int i, @NonNull Notification notification) {
        if (!fb(notification)) {
            this.n3.notify(str, i, notification);
        } else {
            a(new n3(this.y.getPackageName(), i, str, notification));
            this.n3.cancel(str, i);
        }
    }

    public void y(int i) {
        n3(null, i);
    }
}
