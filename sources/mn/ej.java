package mn;

import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.remoteconfig.internal.Code;
import java.math.RoundingMode;
import mn.mg;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public class ej implements mg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6541a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f6542fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f6543gv;
    public final int n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f6544v;
    public final int zn;

    public static class y {
        public int y = 250000;
        public int n3 = 750000;
        public int zn = 4;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f6546gv = 250000;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f6547v = 50000000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6545a = 2;

        public ej fb() {
            return new ej(this);
        }
    }

    public ej(y yVar) {
        this.n3 = yVar.y;
        this.zn = yVar.n3;
        this.f6543gv = yVar.zn;
        this.f6544v = yVar.f6546gv;
        this.f6541a = yVar.f6547v;
        this.f6542fb = yVar.f6545a;
    }

    public static int gv(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case Code.UNIMPLEMENTED /* 12 */:
                return 7000;
            case 13:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                return 336000;
            case ConnectionResult.RESTRICTED_PROFILE /* 20 */:
                return 63750;
        }
    }

    public static int n3(int i, int i5, int i8) {
        return n4.a.gv(((((long) i) * ((long) i5)) * ((long) i8)) / 1000000);
    }

    public int a(int i, int i5) {
        int i8 = this.f6544v;
        if (i == 5) {
            i8 *= this.f6542fb;
        }
        return n4.a.gv((((long) i8) * ((long) (i5 != -1 ? m4.n3.y(i5, 8, RoundingMode.CEILING) : gv(i)))) / 1000000);
    }

    public int fb(int i, int i5, int i8) {
        return ut.p(i * this.f6543gv, n3(this.n3, i5, i8), n3(this.zn, i5, i8));
    }

    public int v(int i) {
        return n4.a.gv((((long) this.f6541a) * ((long) gv(i))) / 1000000);
    }

    @Override // mn.mg.a
    public int y(int i, int i5, int i8, int i10, int i11, int i12, double d4) {
        return (((Math.max(i, (int) (((double) zn(i, i5, i8, i10, i11, i12)) * d4)) + i10) - 1) / i10) * i10;
    }

    public int zn(int i, int i5, int i8, int i10, int i11, int i12) {
        if (i8 == 0) {
            return fb(i, i11, i10);
        }
        if (i8 == 1) {
            return v(i5);
        }
        if (i8 == 2) {
            return a(i5, i12);
        }
        throw new IllegalArgumentException();
    }
}
