package b1;

import androidx.annotation.Nullable;
import b1.fh;
import java.io.IOException;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f1293gv;
    public final a n3;
    public final C0036y y;

    @Nullable
    public zn zn;

    public interface a {
        void n3();

        v y(tl tlVar, long j) throws IOException;
    }

    public interface gv {
        long timeUsToTargetTime(long j);
    }

    public static final class v {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public static final v f1294gv = new v(-3, -9223372036854775807L, -1);
        public final long n3;
        public final int y;
        public final long zn;

        public v(int i, long j, long j4) {
            this.y = i;
            this.n3 = j;
            this.zn = j4;
        }

        public static v a(long j, long j4) {
            return new v(-2, j, j4);
        }

        public static v gv(long j, long j4) {
            return new v(-1, j, j4);
        }

        public static v v(long j) {
            return new v(0, -9223372036854775807L, j);
        }
    }

    /* JADX INFO: renamed from: b1.y$y, reason: collision with other inner class name */
    public static class C0036y implements fh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1295a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final long f1296fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final long f1297gv;
        public final long n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final long f1298v;
        public final gv y;
        public final long zn;

        public C0036y(gv gvVar, long j, long j4, long j7, long j8, long j9, long j10) {
            this.y = gvVar;
            this.n3 = j;
            this.zn = j4;
            this.f1297gv = j7;
            this.f1298v = j8;
            this.f1295a = j9;
            this.f1296fb = j10;
        }

        @Override // b1.fh
        public long c5() {
            return this.n3;
        }

        public long f(long j) {
            return this.y.timeUsToTargetTime(j);
        }

        @Override // b1.fh
        public boolean s() {
            return true;
        }

        @Override // b1.fh
        public fh.y v(long j) {
            return new fh.y(new rz(j, zn.s(this.y.timeUsToTargetTime(j), this.zn, this.f1297gv, this.f1298v, this.f1295a, this.f1296fb)));
        }
    }

    public static class zn {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1299a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public long f1300fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public long f1301gv;
        public final long n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public long f1302s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public long f1303v;
        public final long y;
        public final long zn;

        public zn(long j, long j4, long j7, long j8, long j9, long j10, long j11) {
            this.y = j;
            this.n3 = j4;
            this.f1301gv = j7;
            this.f1303v = j8;
            this.f1299a = j9;
            this.f1300fb = j10;
            this.zn = j11;
            this.f1302s = s(j4, j7, j8, j9, j10, j11);
        }

        public static long s(long j, long j4, long j7, long j8, long j9, long j10) {
            if (j8 + 1 >= j9 || j4 + 1 >= j7) {
                return j8;
            }
            long j11 = (long) ((j - j4) * ((j9 - j8) / (j7 - j4)));
            return ut.mt(((j11 + j8) - j10) - (j11 / 20), j8, j9 - 1);
        }

        public final long c5() {
            return this.f1300fb;
        }

        public final long f() {
            return this.f1302s;
        }

        public final long i9() {
            return this.f1299a;
        }

        public final long t() {
            return this.y;
        }

        public final long tl() {
            return this.n3;
        }

        public final void w(long j, long j4) {
            this.f1301gv = j;
            this.f1299a = j4;
            wz();
        }

        public final void wz() {
            this.f1302s = s(this.n3, this.f1301gv, this.f1303v, this.f1299a, this.f1300fb, this.zn);
        }

        public final void xc(long j, long j4) {
            this.f1303v = j;
            this.f1300fb = j4;
            wz();
        }
    }

    public y(gv gvVar, a aVar, long j, long j4, long j7, long j8, long j9, long j10, int i) {
        this.n3 = aVar;
        this.f1293gv = i;
        this.y = new C0036y(gvVar, j, j4, j7, j8, j9, j10);
    }

    public final boolean c5(tl tlVar, long j) throws IOException {
        long position = j - tlVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        tlVar.w((int) position);
        return true;
    }

    public final int fb(tl tlVar, long j, d0 d0Var) {
        if (j == tlVar.getPosition()) {
            return 0;
        }
        d0Var.y = j;
        return 1;
    }

    public final boolean gv() {
        return this.zn != null;
    }

    public final fh n3() {
        return this.y;
    }

    public final void s(long j) {
        zn znVar = this.zn;
        if (znVar == null || znVar.t() != j) {
            this.zn = y(j);
        }
    }

    public final void v(boolean z, long j) {
        this.zn = null;
        this.n3.n3();
        a(z, j);
    }

    public zn y(long j) {
        return new zn(j, this.y.f(j), this.y.zn, this.y.f1297gv, this.y.f1298v, this.y.f1295a, this.y.f1296fb);
    }

    public int zn(tl tlVar, d0 d0Var) throws IOException {
        while (true) {
            zn znVar = (zn) v0.y.c5(this.zn);
            long jI9 = znVar.i9();
            long jC5 = znVar.c5();
            long jF = znVar.f();
            if (jC5 - jI9 <= this.f1293gv) {
                v(false, jI9);
                return fb(tlVar, jI9, d0Var);
            }
            if (!c5(tlVar, jF)) {
                return fb(tlVar, jF, d0Var);
            }
            tlVar.s();
            v vVarY = this.n3.y(tlVar, znVar.tl());
            int i = vVarY.y;
            if (i == -3) {
                v(false, jF);
                return fb(tlVar, jF, d0Var);
            }
            if (i == -2) {
                znVar.w(vVarY.n3, vVarY.zn);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    c5(tlVar, vVarY.zn);
                    v(true, vVarY.zn);
                    return fb(tlVar, vVarY.zn, d0Var);
                }
                znVar.xc(vVarY.n3, vVarY.zn);
            }
        }
    }

    public static final class n3 implements gv {
        @Override // b1.y.gv
        public long timeUsToTargetTime(long j) {
            return j;
        }
    }

    public void a(boolean z, long j) {
    }
}
