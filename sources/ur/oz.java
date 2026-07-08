package ur;

import android.os.Looper;
import androidx.annotation.Nullable;
import ft.xb;
import ft.xq;
import r0.tl;
import ur.j;
import ur.mg;
import ur.oz;
import ur.vl;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public final class oz extends ur.y implements j.n3 {
    public final int c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final xb.s f8617co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8618d;
    public boolean d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public boolean f8619ej;
    public final com.google.android.exoplayer2.drm.a f3;
    public long fh;
    public final r0.mg n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xb f8620p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vl.y f8621r;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public r0.o f8622x;
    public final tl.y z;

    public static final class n3 implements mg.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f8623a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Nullable
        public Object f8624fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public r0.mg f8625gv;
        public vl.y n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f8626v;
        public final tl.y y;
        public v5.r zn;

        public n3(tl.y yVar) {
            this(yVar, new b1.c5());
        }

        public static /* synthetic */ vl a(b1.mt mtVar, gn gnVar) {
            return new zn(mtVar);
        }

        @Override // ur.mg.y
        /* JADX INFO: renamed from: fb, reason: merged with bridge method [inline-methods] */
        public n3 n3(v5.r rVar) {
            this.zn = (v5.r) v0.y.a(rVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // ur.mg.y
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public n3 zn(r0.mg mgVar) {
            this.f8625gv = (r0.mg) v0.y.a(mgVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // ur.mg.y
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public oz y(xb xbVar) {
            v0.y.v(xbVar.f5080v);
            xb.s sVar = xbVar.f5080v;
            boolean z = false;
            boolean z5 = sVar.f5123s == null && this.f8624fb != null;
            if (sVar.f5124v == null && this.f8623a != null) {
                z = true;
            }
            if (z5 && z) {
                xbVar = xbVar.n3().fb(this.f8624fb).n3(this.f8623a).y();
            } else if (z5) {
                xbVar = xbVar.n3().fb(this.f8624fb).y();
            } else if (z) {
                xbVar = xbVar.n3().n3(this.f8623a).y();
            }
            xb xbVar2 = xbVar;
            return new oz(xbVar2, this.y, this.n3, this.zn.y(xbVar2), this.f8625gv, this.f8626v, null);
        }

        public n3(tl.y yVar, final b1.mt mtVar) {
            this(yVar, new vl.y() { // from class: ur.ut
                @Override // ur.vl.y
                public final vl y(gn gnVar) {
                    return oz.n3.a(mtVar, gnVar);
                }
            });
        }

        public n3(tl.y yVar, vl.y yVar2) {
            this(yVar, yVar2, new com.google.android.exoplayer2.drm.zn(), new r0.n(), 1048576);
        }

        public n3(tl.y yVar, vl.y yVar2, v5.r rVar, r0.mg mgVar, int i) {
            this.y = yVar;
            this.n3 = yVar2;
            this.zn = rVar;
            this.f8625gv = mgVar;
            this.f8626v = i;
        }
    }

    public class y extends r {
        public y(oz ozVar, xq xqVar) {
            super(xqVar);
        }

        @Override // ur.r, ft.xq
        public xq.gv co(int i, xq.gv gvVar, long j) {
            super.co(i, gvVar, j);
            gvVar.f3 = true;
            return gvVar;
        }

        @Override // ur.r, ft.xq
        public xq.n3 f(int i, xq.n3 n3Var, boolean z) {
            super.f(i, n3Var, z);
            n3Var.f5174t = true;
            return n3Var;
        }
    }

    public /* synthetic */ oz(xb xbVar, tl.y yVar, vl.y yVar2, com.google.android.exoplayer2.drm.a aVar, r0.mg mgVar, int i, y yVar3) {
        this(xbVar, yVar, yVar2, aVar, mgVar, i);
    }

    @Override // ur.y
    public void ap() {
        this.f3.release();
    }

    @Override // ur.mg
    public xb c() {
        return this.f8620p;
    }

    @Override // ur.mg
    public void d(d0 d0Var) {
        ((j) d0Var).ct();
    }

    @Override // ur.y
    public void e(@Nullable r0.o oVar) {
        this.f8622x = oVar;
        this.f3.n3((Looper) v0.y.v(Looper.myLooper()), nf());
        this.f3.prepare();
        yg();
    }

    @Override // ur.j.n3
    public void y(long j, boolean z, boolean z5) {
        if (j == -9223372036854775807L) {
            j = this.fh;
        }
        if (!this.d0 && this.fh == j && this.f8618d == z && this.f8619ej == z5) {
            return;
        }
        this.fh = j;
        this.f8618d = z;
        this.f8619ej = z5;
        this.d0 = false;
        yg();
    }

    public final void yg() {
        xq y5Var = new y5(this.fh, this.f8618d, false, this.f8619ej, null, this.f8620p);
        if (this.d0) {
            y5Var = new y(this, y5Var);
        }
        s8(y5Var);
    }

    @Override // ur.mg
    public d0 zn(mg.n3 n3Var, r0.n3 n3Var2, long j) {
        r0.tl tlVarY = this.z.y();
        r0.o oVar = this.f8622x;
        if (oVar != null) {
            tlVarY.co(oVar);
        }
        return new j(this.f8617co.y, tlVarY, this.f8621r.y(nf()), this.f3, dm(n3Var), this.n, o4(n3Var), this, n3Var2, this.f8617co.f5124v, this.c);
    }

    public oz(xb xbVar, tl.y yVar, vl.y yVar2, com.google.android.exoplayer2.drm.a aVar, r0.mg mgVar, int i) {
        this.f8617co = (xb.s) v0.y.v(xbVar.f5080v);
        this.f8620p = xbVar;
        this.z = yVar;
        this.f8621r = yVar2;
        this.f3 = aVar;
        this.n = mgVar;
        this.c = i;
        this.d0 = true;
        this.fh = -9223372036854775807L;
    }

    @Override // ur.mg
    public void oz() {
    }
}
