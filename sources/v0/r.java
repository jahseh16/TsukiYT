package v0;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static int n3 = 0;
    public static boolean zn = true;
    public static final Object y = new Object();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static y f8755gv = y.y;

    public interface y {
        public static final y y = new C0185y();

        /* JADX INFO: renamed from: v0.r$y$y, reason: collision with other inner class name */
        public class C0185y implements y {
            @Override // v0.r.y
            public void n3(String str, String str2) {
                Log.d(str, str2);
            }

            @Override // v0.r.y
            public void w(String str, String str2) {
                Log.w(str, str2);
            }

            @Override // v0.r.y
            public void y(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // v0.r.y
            public void zn(String str, String str2) {
                Log.i(str, str2);
            }
        }

        void n3(String str, String str2);

        void w(String str, String str2);

        void y(String str, String str2);

        void zn(String str, String str2);
    }

    public static void a(String str, String str2) {
        synchronized (y) {
            try {
                if (n3 <= 1) {
                    f8755gv.zn(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c5(String str, String str2) {
        synchronized (y) {
            try {
                if (n3 <= 2) {
                    f8755gv.w(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void fb(String str, String str2, @Nullable Throwable th) {
        a(str, y(str2, th));
    }

    public static void gv(String str, String str2, @Nullable Throwable th) {
        zn(str, y(str2, th));
    }

    public static void i9(String str, String str2, @Nullable Throwable th) {
        c5(str, y(str2, th));
    }

    public static void n3(String str, String str2) {
        synchronized (y) {
            try {
                if (n3 == 0) {
                    f8755gv.n3(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean s(@Nullable Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    @Nullable
    public static String v(@Nullable Throwable th) {
        synchronized (y) {
            try {
                if (th == null) {
                    return null;
                }
                if (s(th)) {
                    return "UnknownHostException (no network)";
                }
                if (zn) {
                    return Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
                return th.getMessage();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String y(String str, @Nullable Throwable th) {
        String strV = v(th);
        if (TextUtils.isEmpty(strV)) {
            return str;
        }
        return str + "\n  " + strV.replace("\n", "\n  ") + '\n';
    }

    public static void zn(String str, String str2) {
        synchronized (y) {
            try {
                if (n3 <= 3) {
                    f8755gv.y(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
