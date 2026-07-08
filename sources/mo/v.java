package mo;

import b1.fh;
import b1.rz;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class v implements fh {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final long f6730gv;
    public final int n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f6731v;
    public final zn y;
    public final long zn;

    public v(zn znVar, int i, long j, long j4) {
        this.y = znVar;
        this.n3 = i;
        this.zn = j;
        long j7 = (j4 - j) / ((long) znVar.f6735v);
        this.f6730gv = j7;
        this.f6731v = y(j7);
    }

    @Override // b1.fh
    public long c5() {
        return this.f6731v;
    }

    @Override // b1.fh
    public boolean s() {
        return true;
    }

    @Override // b1.fh
    public fh.y v(long j) {
        long jMt = ut.mt((((long) this.y.zn) * j) / (((long) this.n3) * 1000000), 0L, this.f6730gv - 1);
        long j4 = this.zn + (((long) this.y.f6735v) * jMt);
        long jY = y(jMt);
        rz rzVar = new rz(jY, j4);
        if (jY >= j || jMt == this.f6730gv - 1) {
            return new fh.y(rzVar);
        }
        long j7 = jMt + 1;
        return new fh.y(rzVar, new rz(y(j7), this.zn + (((long) this.y.f6735v) * j7)));
    }

    public final long y(long j) {
        return ut.x5(j * ((long) this.n3), 1000000L, this.y.zn);
    }
}
