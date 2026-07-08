package ur;

import androidx.annotation.Nullable;
import ft.xb;
import ft.xq;
import ur.mg;

/* JADX INFO: loaded from: classes.dex */
public abstract class ra extends fb<Void> {
    public static final Void f3 = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mg f8633r;

    public ra(mg mgVar) {
        this.f8633r = mgVar;
    }

    @Override // ur.fb
    /* JADX INFO: renamed from: ad, reason: merged with bridge method [inline-methods] */
    public final void g(Void r1, mg mgVar, xq xqVar) {
        wf(xqVar);
    }

    @Override // ur.mg
    public xb c() {
        return this.f8633r.c();
    }

    @Override // ur.fb
    /* JADX INFO: renamed from: cr, reason: merged with bridge method [inline-methods] */
    public final long g3(Void r1, long j) {
        return pq(j);
    }

    public final void cy() {
        bk(f3, this.f8633r);
    }

    @Override // ur.fb, ur.y
    public final void e(@Nullable r0.o oVar) {
        super.e(oVar);
        qk();
    }

    @Override // ur.y, ur.mg
    @Nullable
    public xq q9() {
        return this.f8633r.q9();
    }

    public void qk() {
        cy();
    }

    @Override // ur.fb
    @Nullable
    /* JADX INFO: renamed from: tg, reason: merged with bridge method [inline-methods] */
    public final mg.n3 rb(Void r1, mg.n3 n3Var) {
        return pz(n3Var);
    }

    @Override // ur.y, ur.mg
    public boolean ut() {
        return this.f8633r.ut();
    }

    public abstract void wf(xq xqVar);

    @Override // ur.fb
    /* JADX INFO: renamed from: xb, reason: merged with bridge method [inline-methods] */
    public final int m(Void r1, int i) {
        return o0(i);
    }

    public int o0(int i) {
        return i;
    }

    public long pq(long j) {
        return j;
    }

    @Nullable
    public mg.n3 pz(mg.n3 n3Var) {
        return n3Var;
    }
}
