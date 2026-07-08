package yk;

import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final int n3 = 20;
    public static f y;

    public static class y extends f {
        public int zn;

        public y(int i) {
            super(i);
            this.zn = i;
        }

        @Override // yk.f
        public void fb(String str, String str2, Throwable... thArr) {
            if (this.zn <= 2) {
                if (thArr == null || thArr.length < 1) {
                    Log.v(str, str2);
                } else {
                    Log.v(str, str2, thArr[0]);
                }
            }
        }

        @Override // yk.f
        public void gv(String str, String str2, Throwable... thArr) {
            if (this.zn <= 4) {
                if (thArr == null || thArr.length < 1) {
                    Log.i(str, str2);
                } else {
                    Log.i(str, str2, thArr[0]);
                }
            }
        }

        @Override // yk.f
        public void n3(String str, String str2, Throwable... thArr) {
            if (this.zn <= 6) {
                if (thArr == null || thArr.length < 1) {
                    Log.e(str, str2);
                } else {
                    Log.e(str, str2, thArr[0]);
                }
            }
        }

        @Override // yk.f
        public void s(String str, String str2, Throwable... thArr) {
            if (this.zn <= 5) {
                if (thArr == null || thArr.length < 1) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, thArr[0]);
                }
            }
        }

        @Override // yk.f
        public void y(String str, String str2, Throwable... thArr) {
            if (this.zn <= 3) {
                if (thArr == null || thArr.length < 1) {
                    Log.d(str, str2);
                } else {
                    Log.d(str, str2, thArr[0]);
                }
            }
        }
    }

    public f(int i) {
    }

    public static String a(@NonNull String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = n3;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static synchronized void v(f fVar) {
        y = fVar;
    }

    public static synchronized f zn() {
        try {
            if (y == null) {
                y = new y(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return y;
    }

    public abstract void fb(String str, String str2, Throwable... thArr);

    public abstract void gv(String str, String str2, Throwable... thArr);

    public abstract void n3(String str, String str2, Throwable... thArr);

    public abstract void s(String str, String str2, Throwable... thArr);

    public abstract void y(String str, String str2, Throwable... thArr);
}
