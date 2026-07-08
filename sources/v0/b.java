package v0;

import ft.uo;

/* JADX INFO: loaded from: classes.dex */
public final class b implements i4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public uo f8712f = uo.f5058s;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f8713fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f8714s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8715v;
    public final v y;

    public b(v vVar) {
        this.y = vVar;
    }

    public void gv() {
        if (this.f8715v) {
            y(xc());
            this.f8715v = false;
        }
    }

    public void n3() {
        if (this.f8715v) {
            return;
        }
        this.f8714s = this.y.elapsedRealtime();
        this.f8715v = true;
    }

    @Override // v0.i4
    public uo v() {
        return this.f8712f;
    }

    @Override // v0.i4
    public long xc() {
        long j = this.f8713fb;
        if (!this.f8715v) {
            return j;
        }
        long jElapsedRealtime = this.y.elapsedRealtime() - this.f8714s;
        uo uoVar = this.f8712f;
        return j + (uoVar.y == 1.0f ? ut.xb(jElapsedRealtime) : uoVar.n3(jElapsedRealtime));
    }

    public void y(long j) {
        this.f8713fb = j;
        if (this.f8715v) {
            this.f8714s = this.y.elapsedRealtime();
        }
    }

    @Override // v0.i4
    public void zn(uo uoVar) {
        if (this.f8715v) {
            y(xc());
        }
        this.f8712f = uoVar;
    }
}
