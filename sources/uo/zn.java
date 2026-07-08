package uo;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class zn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long[] f8465a = null;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static zq.a f8466c5 = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile zq.s f8467f = null;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static int f8468fb = 0;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static boolean f8469gv = true;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static zq.v f8470i9 = null;
    public static boolean n3 = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f8471s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static volatile zq.fb f8472t = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static String[] f8473v = null;
    public static boolean y = false;
    public static boolean zn = true;

    @Nullable
    public static zq.fb gv(@NonNull Context context) {
        if (!zn) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        zq.fb fbVar = f8472t;
        if (fbVar == null) {
            synchronized (zq.fb.class) {
                try {
                    fbVar = f8472t;
                    if (fbVar == null) {
                        zq.v yVar = f8470i9;
                        if (yVar == null) {
                            yVar = new y(applicationContext);
                        }
                        fbVar = new zq.fb(yVar);
                        f8472t = fbVar;
                    }
                } finally {
                }
            }
        }
        return fbVar;
    }

    public static float n3(String str) {
        int i = f8471s;
        if (i > 0) {
            f8471s = i - 1;
            return 0.0f;
        }
        if (!n3) {
            return 0.0f;
        }
        int i5 = f8468fb - 1;
        f8468fb = i5;
        if (i5 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(f8473v[i5])) {
            yt.x4.n3();
            return (System.nanoTime() - f8465a[f8468fb]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f8473v[f8468fb] + ".");
    }

    @NonNull
    public static zq.s v(@NonNull Context context) {
        zq.s sVar = f8467f;
        if (sVar == null) {
            synchronized (zq.s.class) {
                try {
                    sVar = f8467f;
                    if (sVar == null) {
                        zq.fb fbVarGv = gv(context);
                        zq.a n3Var = f8466c5;
                        if (n3Var == null) {
                            n3Var = new zq.n3();
                        }
                        sVar = new zq.s(fbVarGv, n3Var);
                        f8467f = sVar;
                    }
                } finally {
                }
            }
        }
        return sVar;
    }

    public static void y(String str) {
        if (n3) {
            int i = f8468fb;
            if (i == 20) {
                f8471s++;
                return;
            }
            f8473v[i] = str;
            f8465a[i] = System.nanoTime();
            yt.x4.y(str);
            f8468fb++;
        }
    }

    public static boolean zn() {
        return f8469gv;
    }
}
