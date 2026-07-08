package com.uv.v7;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.uv.v7.h;
import free.daily.tube.background.dtoapp.MxApp;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import pm.zn;
import qb.a;
import qb.c5;
import qb.gv;
import qb.s;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static AtomicBoolean f3126gv = new AtomicBoolean(false);
    public static boolean n3 = false;
    public static int y;
    public static String zn;

    public class n3 implements h.y {
        @Override // com.uv.v7.h.y
        public void f() {
            MxApp.f4634v = true;
        }
    }

    /* JADX INFO: renamed from: com.uv.v7.y$y, reason: collision with other inner class name */
    public class C0076y implements h.y {
        @Override // com.uv.v7.h.y
        public void f() {
            MxApp.f4634v = true;
        }
    }

    public static void a(Context context, int i, String str, String str2) throws Exception {
        if (zn.f7373a.booleanValue()) {
            if (!n3) {
                a4.n3.y(context, "llock");
                n3 = true;
            }
            File externalFilesDir = context.getExternalFilesDir("mmkv_" + zn(context));
            if (externalFilesDir == null || !new File(externalFilesDir, str).exists()) {
                y = i;
                if (i == 0) {
                    File file = new File(context.getFilesDir(), "mmkv_" + zn(context));
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    externalFilesDir = file;
                }
            } else {
                y = 1;
            }
            if (externalFilesDir == null || !externalFilesDir.exists()) {
                throw new qb.y(i);
            }
            File file2 = new File(externalFilesDir, str);
            if (!file2.exists()) {
                int iB = new h(str, externalFilesDir, "/" + str2 + "%d.zip", file2, context.getAssets(), new n3()).b();
                if (iB != 0) {
                    if (iB != 2) {
                        throw new c5(i, iB);
                    }
                    throw new qb.n3(i);
                }
            }
            File[] fileArrListFiles = externalFilesDir.listFiles();
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < fileArrListFiles.length; i5++) {
                if (fileArrListFiles[i5].getName().startsWith(str2) && fileArrListFiles[i5].getName().endsWith(".zip")) {
                    arrayList.add(fileArrListFiles[i5]);
                }
            }
            Collections.sort(arrayList);
            if (arrayList.size() == 0) {
                throw new RuntimeException("try load mmkv file but fail, mode = " + y);
            }
            try {
                s.y(context.getClassLoader(), externalFilesDir, arrayList, Boolean.FALSE);
            } catch (Throwable th) {
                throw new a(fileArrListFiles.length, th, y);
            }
        }
    }

    public static void fb(Context context) {
        int i;
        if (zn.f7373a.booleanValue() && (i = Build.VERSION.SDK_INT) < 29 && i >= 23) {
            Log.i("Dex2oatTest", "speedUpMMKV");
            if (f3126gv.compareAndSet(false, true)) {
                try {
                    v(context, y, Boolean.TRUE);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    public static String gv(Application application) throws RuntimeException {
        File externalFilesDir;
        if (!zn.f7373a.booleanValue()) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        if (y == 0) {
            externalFilesDir = new File(application.getFilesDir(), "mmkv_" + zn(application));
            if (!externalFilesDir.exists()) {
                externalFilesDir.mkdirs();
            }
        } else {
            externalFilesDir = application.getExternalFilesDir("mmkv_" + zn(application));
        }
        if (externalFilesDir == null) {
            return "cannot getMMKVInfo because mmkvDir is not existed, mode = " + y;
        }
        File file = new File(externalFilesDir, "l2lfjzh.4");
        StringBuilder sb = new StringBuilder();
        sb.append("mmkv mode = " + y + " , ");
        sb.append("mmkv asset name = l2lfjzh.4 , ");
        sb.append("verifyFile is exists = " + file.exists() + " , ");
        sb.append("mmkvDir is exists = " + externalFilesDir.exists() + " , ");
        if (externalFilesDir.exists()) {
            try {
                File[] fileArrListFiles = externalFilesDir.listFiles();
                sb.append("dex name =");
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        sb.append(" " + file2.getName() + " , ");
                    }
                }
            } catch (RuntimeException unused) {
                sb.append("get dexes error");
            }
        }
        sb.append(";");
        return sb.toString();
    }

    public static void n3(Context context, File file) {
        File[] fileArrListFiles;
        if (file == null || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (int i = 0; i < fileArrListFiles.length; i++) {
            if (fileArrListFiles[i].getName().startsWith("l2l") && fileArrListFiles[i].length() > 1024) {
                gv.y(fileArrListFiles[i]);
            }
            if (fileArrListFiles[i].isDirectory() && fileArrListFiles[i].getName().endsWith("_mmkv") && !TextUtils.equals("mxkv", fileArrListFiles[i].getName())) {
                gv.y(fileArrListFiles[i]);
            }
        }
    }

    public static void v(Context context, int i, Boolean bool) throws Exception {
        File file;
        if (zn.f7373a.booleanValue()) {
            if (!n3) {
                try {
                    a4.n3.y(context, "llock");
                    n3 = true;
                } catch (UnsatisfiedLinkError unused) {
                }
            }
            File externalFilesDir = context.getExternalFilesDir("mmkv_" + zn(context));
            if (externalFilesDir == null || !new File(externalFilesDir, "l2lfjzh.4").exists()) {
                y = i;
                if (i == 0) {
                    file = new File(context.getFilesDir(), "mmkv_" + zn(context));
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                }
                if (file != null || !file.exists()) {
                    throw new qb.y(i);
                }
                File file2 = new File(file, "l2lfjzh.4");
                if (!file2.exists()) {
                    n3(context, context.getFilesDir());
                    n3(context, externalFilesDir);
                    for (File file3 : file.listFiles()) {
                        gv.y(file3);
                    }
                    int iB = new h("l2lfjzh.4", file, "/mmkv%d.zip", file2, context.getAssets(), new C0076y()).b();
                    if (iB != 0) {
                        if (iB != 2) {
                            throw new c5(i, iB);
                        }
                        throw new qb.n3(i);
                    }
                }
                File[] fileArrListFiles = file.listFiles();
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < fileArrListFiles.length; i5++) {
                    if (fileArrListFiles[i5].getName().startsWith("mmkv") && fileArrListFiles[i5].getName().endsWith(".zip")) {
                        arrayList.add(fileArrListFiles[i5]);
                    }
                }
                Collections.sort(arrayList);
                if (arrayList.isEmpty()) {
                    throw new qb.zn(i);
                }
                try {
                    s.y(context.getClassLoader(), file, arrayList, bool);
                    return;
                } catch (Throwable th) {
                    throw new a(fileArrListFiles.length, th, y);
                }
            }
            y = 1;
            file = externalFilesDir;
            if (file != null) {
            }
            throw new qb.y(i);
        }
    }

    public static void y(Application application, int i) {
        if (zn.f7373a.booleanValue()) {
            int i5 = 0;
            if (i == 0) {
                File file = new File(application.getFilesDir(), "mmkv_" + zn(application));
                if (file.exists()) {
                    try {
                        File[] fileArrListFiles = file.listFiles();
                        if (fileArrListFiles != null) {
                            while (i5 < fileArrListFiles.length) {
                                gv.y(fileArrListFiles[i5]);
                                i5++;
                            }
                            return;
                        }
                        return;
                    } catch (RuntimeException e4) {
                        e4.printStackTrace();
                        return;
                    }
                }
                return;
            }
            if (i == 1) {
                File externalFilesDir = application.getExternalFilesDir("mmkv_" + zn(application));
                if (externalFilesDir == null || !externalFilesDir.exists()) {
                    return;
                }
                try {
                    File[] fileArrListFiles2 = externalFilesDir.listFiles();
                    if (fileArrListFiles2 != null) {
                        while (i5 < fileArrListFiles2.length) {
                            gv.y(fileArrListFiles2[i5]);
                            i5++;
                        }
                    }
                } catch (RuntimeException e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    public static String zn(Context context) {
        String str = zn;
        if (str != null) {
            return str;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            int iMyPid = Process.myPid();
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    if (packageName.equals(runningAppProcessInfo.processName)) {
                        zn = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
                    } else {
                        zn = String.valueOf(runningAppProcessInfo.processName.hashCode());
                    }
                }
            }
        } catch (Exception unused) {
            zn = "error";
        }
        return zn;
    }
}
