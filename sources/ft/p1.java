package ft;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1 f4972a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final p1 f4973fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final p1 f4974gv;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final p1 f4975v;
    public static final p1 zn;
    public final long n3;
    public final long y;

    static {
        p1 p1Var = new p1(0L, 0L);
        zn = p1Var;
        f4974gv = new p1(Long.MAX_VALUE, Long.MAX_VALUE);
        f4975v = new p1(Long.MAX_VALUE, 0L);
        f4972a = new p1(0L, Long.MAX_VALUE);
        f4973fb = p1Var;
    }

    public p1(long j, long j4) {
        v0.y.y(j >= 0);
        v0.y.y(j4 >= 0);
        this.y = j;
        this.n3 = j4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p1.class != obj.getClass()) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.y == p1Var.y && this.n3 == p1Var.n3;
    }

    public int hashCode() {
        return (((int) this.y) * 31) + ((int) this.n3);
    }

    public long y(long j, long j4, long j7) {
        long j8 = this.y;
        if (j8 == 0 && this.n3 == 0) {
            return j;
        }
        long jI2 = v0.ut.i2(j, j8, Long.MIN_VALUE);
        long jN3 = v0.ut.n3(j, this.n3, Long.MAX_VALUE);
        boolean z = false;
        boolean z5 = jI2 <= j4 && j4 <= jN3;
        if (jI2 <= j7 && j7 <= jN3) {
            z = true;
        }
        return (z5 && z) ? Math.abs(j4 - j) <= Math.abs(j7 - j) ? j4 : j7 : z5 ? j4 : z ? j7 : jI2;
    }
}
