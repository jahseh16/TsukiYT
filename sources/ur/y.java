package ur;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.v;
import ft.xq;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import ur.b;
import ur.mg;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public abstract class y implements mg {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Looper f8669f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public xq f8672t;

    @Nullable
    public gn w;
    public final ArrayList<mg.zn> y = new ArrayList<>(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HashSet<mg.zn> f8673v = new HashSet<>(1);

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final b.y f8670fb = new b.y();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v.y f8671s = new v.y();

    public abstract void ap();

    public final b.y ct(int i, @Nullable mg.n3 n3Var, long j) {
        return this.f8670fb.d(i, n3Var, j);
    }

    public final v.y dm(@Nullable mg.n3 n3Var) {
        return this.f8671s.r(0, n3Var);
    }

    public abstract void e(@Nullable r0.o oVar);

    @Override // ur.mg
    public final void ej(mg.zn znVar) {
        boolean zIsEmpty = this.f8673v.isEmpty();
        this.f8673v.remove(znVar);
        if (zIsEmpty || !this.f8673v.isEmpty()) {
            return;
        }
        eb();
    }

    @Override // ur.mg
    public final void f7(b bVar) {
        this.f8670fb.rz(bVar);
    }

    @Override // ur.mg
    public final void hw(mg.zn znVar, @Nullable r0.o oVar, gn gnVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f8669f;
        v0.y.y(looper == null || looper == looperMyLooper);
        this.w = gnVar;
        xq xqVar = this.f8672t;
        this.y.add(znVar);
        if (this.f8669f == null) {
            this.f8669f = looperMyLooper;
            this.f8673v.add(znVar);
            e(oVar);
        } else if (xqVar != null) {
            w(znVar);
            znVar.y(this, xqVar);
        }
    }

    @Override // ur.mg
    public final void j(com.google.android.exoplayer2.drm.v vVar) {
        this.f8671s.z(vVar);
    }

    @Override // ur.mg
    public final void k(Handler handler, b bVar) {
        v0.y.v(handler);
        v0.y.v(bVar);
        this.f8670fb.fb(handler, bVar);
    }

    public final gn nf() {
        return (gn) v0.y.c5(this.w);
    }

    @Override // ur.mg
    public final void o(Handler handler, com.google.android.exoplayer2.drm.v vVar) {
        v0.y.v(handler);
        v0.y.v(vVar);
        this.f8671s.fb(handler, vVar);
    }

    public final b.y o4(@Nullable mg.n3 n3Var) {
        return this.f8670fb.d(0, n3Var, 0L);
    }

    @Override // ur.mg
    public /* synthetic */ xq q9() {
        return rz.y(this);
    }

    public final boolean ra() {
        return !this.f8673v.isEmpty();
    }

    public final b.y rs(mg.n3 n3Var, long j) {
        v0.y.v(n3Var);
        return this.f8670fb.d(0, n3Var, j);
    }

    public final void s8(xq xqVar) {
        this.f8672t = xqVar;
        Iterator<mg.zn> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().y(this, xqVar);
        }
    }

    @Override // ur.mg
    public /* synthetic */ boolean ut() {
        return rz.n3(this);
    }

    @Override // ur.mg
    public final void w(mg.zn znVar) {
        v0.y.v(this.f8669f);
        boolean zIsEmpty = this.f8673v.isEmpty();
        this.f8673v.add(znVar);
        if (zIsEmpty) {
            lc();
        }
    }

    public final v.y xg(int i, @Nullable mg.n3 n3Var) {
        return this.f8671s.r(i, n3Var);
    }

    @Override // ur.mg
    public final void y5(mg.zn znVar) {
        this.y.remove(znVar);
        if (!this.y.isEmpty()) {
            ej(znVar);
            return;
        }
        this.f8669f = null;
        this.f8672t = null;
        this.w = null;
        this.f8673v.clear();
        ap();
    }

    public void eb() {
    }

    public void lc() {
    }
}
