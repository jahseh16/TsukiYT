package sd;

/* JADX INFO: loaded from: classes.dex */
public final class wz implements t {
    public final long n3;
    public final b1.gv y;

    public wz(b1.gv gvVar, long j) {
        this.y = gvVar;
        this.n3 = j;
    }

    @Override // sd.t
    public long a(long j, long j4) {
        return this.y.y(j + this.n3);
    }

    @Override // sd.t
    public long c5() {
        return 0L;
    }

    @Override // sd.t
    public long fb(long j) {
        return this.y.y;
    }

    @Override // sd.t
    public long gv(long j, long j4) {
        return -9223372036854775807L;
    }

    @Override // sd.t
    public long i9(long j, long j4) {
        return this.y.y;
    }

    @Override // sd.t
    public long n3(long j) {
        return this.y.f1277v[(int) j] - this.n3;
    }

    @Override // sd.t
    public boolean s() {
        return true;
    }

    @Override // sd.t
    public pv.t v(long j) {
        return new pv.t(null, this.y.zn[(int) j], r0.n3[r9]);
    }

    @Override // sd.t
    public long y(long j, long j4) {
        return this.y.f1276gv[(int) j];
    }

    @Override // sd.t
    public long zn(long j, long j4) {
        return 0L;
    }
}
