package ft;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class t implements v0.i4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5042f = true;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public hk f5043fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public v0.i4 f5044s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5045t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y f5046v;
    public final v0.b y;

    public interface y {
        void onPlaybackParametersChanged(uo uoVar);
    }

    public t(y yVar, v0.v vVar) {
        this.f5046v = yVar;
        this.y = new v0.b(vVar);
    }

    public final boolean a(boolean z) {
        hk hkVar = this.f5043fb;
        return hkVar == null || hkVar.a() || (!this.f5043fb.isReady() && (z || this.f5043fb.c5()));
    }

    public long c5(boolean z) {
        i9(z);
        return xc();
    }

    public void fb() {
        this.f5045t = true;
        this.y.n3();
    }

    public void gv(long j) {
        this.y.y(j);
    }

    public final void i9(boolean z) {
        if (a(z)) {
            this.f5042f = true;
            if (this.f5045t) {
                this.y.n3();
                return;
            }
            return;
        }
        v0.i4 i4Var = (v0.i4) v0.y.v(this.f5044s);
        long jXc = i4Var.xc();
        if (this.f5042f) {
            if (jXc < this.y.xc()) {
                this.y.gv();
                return;
            } else {
                this.f5042f = false;
                if (this.f5045t) {
                    this.y.n3();
                }
            }
        }
        this.y.y(jXc);
        uo uoVarV = i4Var.v();
        if (uoVarV.equals(this.y.v())) {
            return;
        }
        this.y.zn(uoVarV);
        this.f5046v.onPlaybackParametersChanged(uoVarV);
    }

    public void n3(hk hkVar) throws p {
        v0.i4 i4Var;
        v0.i4 i4VarI4 = hkVar.i4();
        if (i4VarI4 == null || i4VarI4 == (i4Var = this.f5044s)) {
            return;
        }
        if (i4Var != null) {
            throw p.f3(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f5044s = i4VarI4;
        this.f5043fb = hkVar;
        i4VarI4.zn(this.y.v());
    }

    public void s() {
        this.f5045t = false;
        this.y.gv();
    }

    @Override // v0.i4
    public uo v() {
        v0.i4 i4Var = this.f5044s;
        return i4Var != null ? i4Var.v() : this.y.v();
    }

    @Override // v0.i4
    public long xc() {
        return this.f5042f ? this.y.xc() : ((v0.i4) v0.y.v(this.f5044s)).xc();
    }

    public void y(hk hkVar) {
        if (hkVar == this.f5043fb) {
            this.f5044s = null;
            this.f5043fb = null;
            this.f5042f = true;
        }
    }

    @Override // v0.i4
    public void zn(uo uoVar) {
        v0.i4 i4Var = this.f5044s;
        if (i4Var != null) {
            i4Var.zn(uoVar);
            uoVar = this.f5044s.v();
        }
        this.y.zn(uoVar);
    }
}
