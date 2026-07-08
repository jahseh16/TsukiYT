package ur;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.v;
import ft.xq;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import ur.b;
import ur.mg;

/* JADX INFO: loaded from: classes.dex */
public abstract class fb<T> extends ur.y {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    @Nullable
    public Handler f8544co;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashMap<T, n3<T>> f8545p = new HashMap<>();

    @Nullable
    public r0.o z;

    public static final class n3<T> {
        public final mg.zn n3;
        public final mg y;
        public final fb<T>.y zn;

        public n3(mg mgVar, mg.zn znVar, fb<T>.y yVar) {
            this.y = mgVar;
            this.n3 = znVar;
            this.zn = yVar;
        }
    }

    public final class y implements b, com.google.android.exoplayer2.drm.v {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public v.y f8546fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public b.y f8548v;
        public final T y;

        public y(T t3) {
            this.f8548v = fb.this.o4(null);
            this.f8546fb = fb.this.dm(null);
            this.y = t3;
        }

        @Override // ur.b
        public void a(int i, @Nullable mg.n3 n3Var, c cVar) {
            if (fh(i, n3Var)) {
                this.f8548v.ta(d(cVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.v
        public void c(int i, @Nullable mg.n3 n3Var) {
            if (fh(i, n3Var)) {
                this.f8546fb.c5();
            }
        }

        public final c d(c cVar) {
            long jG3 = fb.this.g3(this.y, cVar.f8478a);
            long jG32 = fb.this.g3(this.y, cVar.f8479fb);
            return (jG3 == cVar.f8478a && jG32 == cVar.f8479fb) ? cVar : new c(cVar.y, cVar.n3, cVar.zn, cVar.f8480gv, cVar.f8481v, jG3, jG32);
        }

        @Override // com.google.android.exoplayer2.drm.v
        public /* synthetic */ void d0(int i, mg.n3 n3Var) {
            v5.f.y(this, i, n3Var);
        }

        @Override // ur.b
        public void en(int i, @Nullable mg.n3 n3Var, c cVar) {
            if (fh(i, n3Var)) {
                this.f8548v.i9(d(cVar));
            }
        }

        public final boolean fh(int i, @Nullable mg.n3 n3Var) {
            mg.n3 n3VarRb;
            if (n3Var != null) {
                n3VarRb = fb.this.rb(this.y, n3Var);
                if (n3VarRb == null) {
                    return false;
                }
            } else {
                n3VarRb = null;
            }
            int iM = fb.this.m(this.y, i);
            b.y yVar = this.f8548v;
            if (yVar.y != iM || !v0.ut.zn(yVar.n3, n3VarRb)) {
                this.f8548v = fb.this.ct(iM, n3VarRb, 0L);
            }
            v.y yVar2 = this.f8546fb;
            if (yVar2.y == iM && v0.ut.zn(yVar2.n3, n3VarRb)) {
                return true;
            }
            this.f8546fb = fb.this.xg(iM, n3VarRb);
            return true;
        }

        @Override // ur.b
        public void jz(int i, @Nullable mg.n3 n3Var, i4 i4Var, c cVar) {
            if (fh(i, n3Var)) {
                this.f8548v.co(i4Var, d(cVar));
            }
        }

        @Override // ur.b
        public void mg(int i, @Nullable mg.n3 n3Var, i4 i4Var, c cVar) {
            if (fh(i, n3Var)) {
                this.f8548v.x4(i4Var, d(cVar));
            }
        }

        @Override // ur.b
        public void u(int i, @Nullable mg.n3 n3Var, i4 i4Var, c cVar, IOException iOException, boolean z) {
            if (fh(i, n3Var)) {
                this.f8548v.n(i4Var, d(cVar), iOException, z);
            }
        }

        @Override // com.google.android.exoplayer2.drm.v
        public void w(int i, @Nullable mg.n3 n3Var, Exception exc) {
            if (fh(i, n3Var)) {
                this.f8546fb.t(exc);
            }
        }

        @Override // com.google.android.exoplayer2.drm.v
        public void xc(int i, @Nullable mg.n3 n3Var) {
            if (fh(i, n3Var)) {
                this.f8546fb.tl();
            }
        }

        @Override // com.google.android.exoplayer2.drm.v
        public void y(int i, @Nullable mg.n3 n3Var, int i5) {
            if (fh(i, n3Var)) {
                this.f8546fb.f(i5);
            }
        }

        @Override // ur.b
        public void yt(int i, @Nullable mg.n3 n3Var, i4 i4Var, c cVar) {
            if (fh(i, n3Var)) {
                this.f8548v.fh(i4Var, d(cVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.v
        public void z(int i, @Nullable mg.n3 n3Var) {
            if (fh(i, n3Var)) {
                this.f8546fb.i9();
            }
        }

        @Override // com.google.android.exoplayer2.drm.v
        public void zn(int i, @Nullable mg.n3 n3Var) {
            if (fh(i, n3Var)) {
                this.f8546fb.s();
            }
        }
    }

    @Override // ur.y
    public void ap() {
        for (n3<T> n3Var : this.f8545p.values()) {
            n3Var.y.y5(n3Var.n3);
            n3Var.y.f7(n3Var.zn);
            n3Var.y.j(n3Var.zn);
        }
        this.f8545p.clear();
    }

    public final void bk(final T t3, mg mgVar) {
        v0.y.y(!this.f8545p.containsKey(t3));
        mg.zn znVar = new mg.zn() { // from class: ur.a
            @Override // ur.mg.zn
            public final void y(mg mgVar2, xq xqVar) {
                this.y.g(t3, mgVar2, xqVar);
            }
        };
        y yVar = new y(t3);
        this.f8545p.put(t3, new n3<>(mgVar, znVar, yVar));
        mgVar.k((Handler) v0.y.v(this.f8544co), yVar);
        mgVar.o((Handler) v0.y.v(this.f8544co), yVar);
        mgVar.hw(znVar, this.z, nf());
        if (ra()) {
            return;
        }
        mgVar.ej(znVar);
    }

    @Override // ur.y
    public void e(@Nullable r0.o oVar) {
        this.z = oVar;
        this.f8544co = v0.ut.i4();
    }

    @Override // ur.y
    public void eb() {
        for (n3<T> n3Var : this.f8545p.values()) {
            n3Var.y.ej(n3Var.n3);
        }
    }

    public final void kp(T t3) {
        n3 n3Var = (n3) v0.y.v(this.f8545p.get(t3));
        n3Var.y.w(n3Var.n3);
    }

    @Override // ur.y
    public void lc() {
        for (n3<T> n3Var : this.f8545p.values()) {
            n3Var.y.w(n3Var.n3);
        }
    }

    @Override // ur.mg
    public void oz() throws IOException {
        Iterator<n3<T>> it = this.f8545p.values().iterator();
        while (it.hasNext()) {
            it.next().y.oz();
        }
    }

    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public abstract void g(T t3, mg mgVar, xq xqVar);

    public final void y4(T t3) {
        n3 n3Var = (n3) v0.y.v(this.f8545p.remove(t3));
        n3Var.y.y5(n3Var.n3);
        n3Var.y.f7(n3Var.zn);
        n3Var.y.j(n3Var.zn);
    }

    public final void yc(T t3) {
        n3 n3Var = (n3) v0.y.v(this.f8545p.get(t3));
        n3Var.y.ej(n3Var.n3);
    }

    public long g3(T t3, long j) {
        return j;
    }

    public int m(T t3, int i) {
        return i;
    }

    @Nullable
    public mg.n3 rb(T t3, mg.n3 n3Var) {
        return n3Var;
    }
}
