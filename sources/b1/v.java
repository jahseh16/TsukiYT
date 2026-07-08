package b1;

import b1.fh;

/* JADX INFO: loaded from: classes.dex */
public class v implements fh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1279a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f1280fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final long f1281gv;
    public final long n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f1282v;
    public final long y;
    public final int zn;

    public v(long j, long j4, int i, int i5, boolean z) {
        this.y = j;
        this.n3 = j4;
        this.zn = i5 == -1 ? 1 : i5;
        this.f1282v = i;
        this.f1280fb = z;
        if (j == -1) {
            this.f1281gv = -1L;
            this.f1279a = -9223372036854775807L;
        } else {
            this.f1281gv = j - j4;
            this.f1279a = gv(j, j4, i);
        }
    }

    public static long gv(long j, long j4, int i) {
        return (Math.max(0L, j - j4) * 8000000) / ((long) i);
    }

    @Override // b1.fh
    public long c5() {
        return this.f1279a;
    }

    @Override // b1.fh
    public boolean s() {
        return this.f1281gv != -1 || this.f1280fb;
    }

    @Override // b1.fh
    public fh.y v(long j) {
        if (this.f1281gv == -1 && !this.f1280fb) {
            return new fh.y(new rz(0L, this.n3));
        }
        long jY = y(j);
        long jZn = zn(jY);
        rz rzVar = new rz(jZn, jY);
        if (this.f1281gv != -1 && jZn < j) {
            int i = this.zn;
            if (((long) i) + jY < this.y) {
                long j4 = jY + ((long) i);
                return new fh.y(rzVar, new rz(zn(j4), j4));
            }
        }
        return new fh.y(rzVar);
    }

    public final long y(long j) {
        long j4 = (j * ((long) this.f1282v)) / 8000000;
        int i = this.zn;
        long jMin = (j4 / ((long) i)) * ((long) i);
        long j7 = this.f1281gv;
        if (j7 != -1) {
            jMin = Math.min(jMin, j7 - ((long) i));
        }
        return this.n3 + Math.max(jMin, 0L);
    }

    public long zn(long j) {
        return gv(j, this.n3, this.f1282v);
    }
}
