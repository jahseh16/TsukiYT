package ao;

import androidx.annotation.Nullable;
import b1.fh;
import b1.rz;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import mn.yt;
import v0.d;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class c5 implements fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final long[] f1169a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final long f1170gv;
    public final int n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f1171v;
    public final long y;
    public final long zn;

    public c5(long j, int i, long j4) {
        this(j, i, j4, -1L, null);
    }

    @Nullable
    public static c5 y(long j, long j4, yt.y yVar, d dVar) {
        int iB;
        int i = yVar.f6703fb;
        int i5 = yVar.f6704gv;
        int iP = dVar.p();
        if ((iP & 1) != 1 || (iB = dVar.b()) == 0) {
            return null;
        }
        long jX5 = ut.x5(iB, ((long) i) * 1000000, i5);
        if ((iP & 6) != 6) {
            return new c5(j4, yVar.zn, jX5);
        }
        long jA8 = dVar.a8();
        long[] jArr = new long[100];
        for (int i8 = 0; i8 < 100; i8++) {
            jArr[i8] = dVar.ej();
        }
        if (j != -1) {
            long j7 = j4 + jA8;
            if (j != j7) {
                r.c5("XingSeeker", "XING data size mismatch: " + j + ", " + j7);
            }
        }
        return new c5(j4, yVar.zn, jX5, jA8, jArr);
    }

    @Override // ao.fb
    public long a() {
        return this.f1171v;
    }

    @Override // b1.fh
    public long c5() {
        return this.zn;
    }

    @Override // ao.fb
    public long n3(long j) {
        long j4 = j - this.y;
        if (!s() || j4 <= this.n3) {
            return 0L;
        }
        long[] jArr = (long[]) v0.y.c5(this.f1169a);
        double d4 = (j4 * 256.0d) / this.f1170gv;
        int iC5 = ut.c5(jArr, (long) d4, true, true);
        long jZn = zn(iC5);
        long j7 = jArr[iC5];
        int i = iC5 + 1;
        long jZn2 = zn(i);
        return jZn + Math.round((j7 == (iC5 == 99 ? 256L : jArr[i]) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (d4 - j7) / (r0 - j7)) * (jZn2 - jZn));
    }

    @Override // b1.fh
    public boolean s() {
        return this.f1169a != null;
    }

    @Override // b1.fh
    public fh.y v(long j) {
        if (!s()) {
            return new fh.y(new rz(0L, this.y + ((long) this.n3)));
        }
        long jMt = ut.mt(j, 0L, this.zn);
        double d4 = (jMt * 100.0d) / this.zn;
        double d5 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d4 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (d4 >= 100.0d) {
                d5 = 256.0d;
            } else {
                int i = (int) d4;
                double d6 = ((long[]) v0.y.c5(this.f1169a))[i];
                d5 = d6 + ((d4 - ((double) i)) * ((i == 99 ? 256.0d : r3[i + 1]) - d6));
            }
        }
        return new fh.y(new rz(jMt, this.y + ut.mt(Math.round((d5 / 256.0d) * this.f1170gv), this.n3, this.f1170gv - 1)));
    }

    public final long zn(int i) {
        return (this.zn * ((long) i)) / 100;
    }

    public c5(long j, int i, long j4, long j7, @Nullable long[] jArr) {
        this.y = j;
        this.n3 = i;
        this.zn = j4;
        this.f1169a = jArr;
        this.f1170gv = j7;
        this.f1171v = j7 != -1 ? j + j7 : -1L;
    }
}
