package hw;

import com.google.android.gms.common.ConnectionResult;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x4 f5345a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final x4 f5346gv;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final x4 f5347v;
    public static final x4 zn;
    public static final x4 y = new v(null, false);
    public static final x4 n3 = new v(null, true);

    public static class a extends gv {
        public static final a n3 = new a();

        public a() {
            super(null);
        }

        @Override // hw.i4.gv
        public boolean n3() {
            return f3.y(Locale.getDefault()) == 1;
        }
    }

    public static abstract class gv implements x4 {
        public final zn y;

        public gv(zn znVar) {
            this.y = znVar;
        }

        public abstract boolean n3();

        @Override // hw.x4
        public boolean y(CharSequence charSequence, int i, int i5) {
            if (charSequence == null || i < 0 || i5 < 0 || charSequence.length() - i5 < i) {
                throw new IllegalArgumentException();
            }
            return this.y == null ? n3() : zn(charSequence, i, i5);
        }

        public final boolean zn(CharSequence charSequence, int i, int i5) {
            int iY = this.y.y(charSequence, i, i5);
            if (iY == 0) {
                return true;
            }
            if (iY != 1) {
                return n3();
            }
            return false;
        }
    }

    public static class n3 implements zn {
        public static final n3 y = new n3();

        @Override // hw.i4.zn
        public int y(CharSequence charSequence, int i, int i5) {
            int i8 = i5 + i;
            int iN3 = 2;
            while (i < i8 && iN3 == 2) {
                iN3 = i4.n3(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return iN3;
        }
    }

    public static class v extends gv {
        public final boolean n3;

        public v(zn znVar, boolean z) {
            super(znVar);
            this.n3 = z;
        }

        @Override // hw.i4.gv
        public boolean n3() {
            return this.n3;
        }
    }

    public static class y implements zn {
        public static final y n3 = new y(true);
        public final boolean y;

        public y(boolean z) {
            this.y = z;
        }

        @Override // hw.i4.zn
        public int y(CharSequence charSequence, int i, int i5) {
            int i8 = i5 + i;
            boolean z = false;
            while (i < i8) {
                int iY = i4.y(Character.getDirectionality(charSequence.charAt(i)));
                if (iY != 0) {
                    if (iY != 1) {
                        continue;
                        i++;
                    } else if (!this.y) {
                        return 1;
                    }
                } else if (this.y) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.y ? 1 : 0;
            }
            return 2;
        }
    }

    public interface zn {
        int y(CharSequence charSequence, int i, int i5);
    }

    static {
        n3 n3Var = n3.y;
        zn = new v(n3Var, false);
        f5346gv = new v(n3Var, true);
        f5347v = new v(y.n3, false);
        f5345a = a.n3;
    }

    public static int n3(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }

    public static int y(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }
}
