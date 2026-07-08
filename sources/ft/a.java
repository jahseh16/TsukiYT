package ft;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements hk, ic {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public long f4637co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zo.gn f4638f;
    public boolean f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public gn f4639fb;
    public boolean n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public g[] f4640p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4642s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4643t;

    @Nullable
    public ur.en w;
    public final int y;
    public long z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u0 f4644v = new u0();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f4641r = Long.MIN_VALUE;

    public a(int i) {
        this.y = i;
    }

    public abstract void b(g[] gVarArr, long j, long j4) throws p;

    public final gn c() {
        return (gn) v0.y.v(this.f4639fb);
    }

    @Override // ft.hk
    public final boolean c5() {
        return this.f4641r == Long.MIN_VALUE;
    }

    public abstract void d();

    public final u0 d0() {
        this.f4644v.y();
        return this.f4644v;
    }

    public abstract void ej(long j, boolean z) throws p;

    public final p f3(Throwable th, @Nullable g gVar, int i) {
        return n(th, gVar, false, i);
    }

    @Override // ft.hk
    public final void fb() {
        v0.y.fb(this.f4643t == 1);
        this.f4644v.y();
        this.f4643t = 0;
        this.w = null;
        this.f4640p = null;
        this.f3 = false;
        d();
    }

    public final int fh() {
        return this.f4642s;
    }

    @Override // ft.hk
    public final int getState() {
        return this.f4643t;
    }

    @Override // ft.hk
    @Nullable
    public final ur.en getStream() {
        return this.w;
    }

    @Override // ft.hk
    @Nullable
    public v0.i4 i4() {
        return null;
    }

    @Override // ft.hk
    public final void i9() {
        this.f3 = true;
    }

    public final int k5(u0 u0Var, di.fb fbVar, int i) {
        int iA = ((ur.en) v0.y.v(this.w)).a(u0Var, fbVar, i);
        if (iA == -4) {
            if (fbVar.t()) {
                this.f4641r = Long.MIN_VALUE;
                return this.f3 ? -4 : -3;
            }
            long j = fbVar.f3178f + this.f4637co;
            fbVar.f3178f = j;
            this.f4641r = Math.max(this.f4641r, j);
        } else if (iA == -5) {
            g gVar = (g) v0.y.v(u0Var.n3);
            if (gVar.fh != Long.MAX_VALUE) {
                u0Var.n3 = gVar.n3().nf(gVar.fh + this.f4637co).z6();
            }
        }
        return iA;
    }

    public final g[] mg() {
        return (g[]) v0.y.v(this.f4640p);
    }

    @Override // ft.ic
    public int mt() throws p {
        return 0;
    }

    public final p n(Throwable th, @Nullable g gVar, boolean z, int i) {
        int i5;
        if (gVar == null || this.n) {
            i5 = 4;
        } else {
            this.n = true;
            try {
                int iA = k3.a(n3(gVar));
                this.n = false;
                i5 = iA;
            } catch (p unused) {
                this.n = false;
                i5 = 4;
            } catch (Throwable th2) {
                this.n = false;
                throw th2;
            }
        }
        return p.z(th, getName(), fh(), gVar, i5, z, i);
    }

    @Override // ft.hk
    public final void p(g[] gVarArr, ur.en enVar, long j, long j4) throws p {
        v0.y.fb(!this.f3);
        this.w = enVar;
        if (this.f4641r == Long.MIN_VALUE) {
            this.f4641r = j;
        }
        this.f4640p = gVarArr;
        this.f4637co = j4;
        b(gVarArr, j, j4);
    }

    @Override // ft.hk
    public final void r(long j) throws p {
        yt(j, false);
    }

    public final zo.gn rz() {
        return (zo.gn) v0.y.v(this.f4638f);
    }

    @Override // ft.hk, ft.ic
    public final int s() {
        return this.y;
    }

    @Override // ft.hk
    public final void start() throws p {
        v0.y.fb(this.f4643t == 1);
        this.f4643t = 2;
        a8();
    }

    @Override // ft.hk
    public final void stop() {
        v0.y.fb(this.f4643t == 2);
        this.f4643t = 1;
        x();
    }

    @Override // ft.hk
    public final void t(gn gnVar, g[] gVarArr, ur.en enVar, long j, boolean z, boolean z5, long j4, long j7) throws p {
        v0.y.fb(this.f4643t == 0);
        this.f4639fb = gnVar;
        this.f4643t = 1;
        z6(z, z5);
        p(gVarArr, enVar, j4, j7);
        yt(j, z);
    }

    public final boolean ta() {
        return c5() ? this.f3 : ((ur.en) v0.y.v(this.w)).isReady();
    }

    @Override // ft.hk
    public final void tl() throws IOException {
        ((ur.en) v0.y.v(this.w)).n3();
    }

    public int vl(long j) {
        return ((ur.en) v0.y.v(this.w)).w(j - this.f4637co);
    }

    @Override // ft.hk
    public /* synthetic */ void w(float f3, float f4) throws p {
        zq.y(this, f3, f4);
    }

    @Override // ft.hk
    public final boolean wz() {
        return this.f3;
    }

    @Override // ft.hk
    public final void x4(int i, zo.gn gnVar) {
        this.f4642s = i;
        this.f4638f = gnVar;
    }

    @Override // ft.hk
    public final void y() {
        v0.y.fb(this.f4643t == 0);
        this.f4644v.y();
        ud();
    }

    public final void yt(long j, boolean z) throws p {
        this.f3 = false;
        this.z = j;
        this.f4641r = j;
        ej(j, z);
    }

    @Override // ft.hk
    public final long z() {
        return this.f4641r;
    }

    public void a8() throws p {
    }

    @Override // ft.hk
    public final ic gv() {
        return this;
    }

    public void ud() {
    }

    public void x() {
    }

    @Override // ft.h.n3
    public void f(int i, @Nullable Object obj) throws p {
    }

    public void z6(boolean z, boolean z5) throws p {
    }
}
