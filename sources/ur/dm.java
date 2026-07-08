package ur;

import android.net.Uri;
import androidx.annotation.Nullable;
import ft.g;
import ft.xb;
import ft.xq;
import r0.p;
import r0.tl;
import ur.mg;

/* JADX INFO: loaded from: classes.dex */
public final class dm extends ur.y {
    public final xq c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final tl.y f8496co;
    public final xb d0;
    public final r0.mg f3;

    @Nullable
    public r0.o fh;
    public final boolean n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r0.p f8497p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f8498r;
    public final g z;

    public static final class n3 {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Nullable
        public Object f8499gv;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        public String f8500v;
        public final tl.y y;
        public r0.mg n3 = new r0.n();
        public boolean zn = true;

        public n3(tl.y yVar) {
            this.y = (tl.y) v0.y.v(yVar);
        }

        public n3 n3(@Nullable r0.mg mgVar) {
            if (mgVar == null) {
                mgVar = new r0.n();
            }
            this.n3 = mgVar;
            return this;
        }

        public dm y(xb.t tVar, long j) {
            return new dm(this.f8500v, tVar, this.y, j, this.n3, this.zn, this.f8499gv);
        }
    }

    @Override // ur.mg
    public xb c() {
        return this.d0;
    }

    @Override // ur.mg
    public void d(d0 d0Var) {
        ((xg) d0Var).p();
    }

    @Override // ur.y
    public void e(@Nullable r0.o oVar) {
        this.fh = oVar;
        s8(this.c);
    }

    @Override // ur.mg
    public d0 zn(mg.n3 n3Var, r0.n3 n3Var2, long j) {
        return new xg(this.f8497p, this.f8496co, this.fh, this.z, this.f8498r, this.f3, o4(n3Var), this.n);
    }

    public dm(@Nullable String str, xb.t tVar, tl.y yVar, long j, r0.mg mgVar, boolean z, @Nullable Object obj) {
        this.f8496co = yVar;
        this.f8498r = j;
        this.f3 = mgVar;
        this.n = z;
        xb xbVarY = new xb.zn().s(Uri.EMPTY).gv(tVar.y.toString()).a(k4.r.j(tVar)).fb(obj).y();
        this.d0 = xbVarY;
        g.n3 n3VarQ9 = new g.n3().o4((String) g4.c5.y(tVar.n3, "text/x-unknown")).k(tVar.zn).eb(tVar.f5127gv).dm(tVar.f5128v).q9(tVar.f5125a);
        String str2 = tVar.f5126fb;
        this.z = n3VarQ9.oz(str2 == null ? str : str2).z6();
        this.f8497p = new p.n3().c5(tVar.y).n3(1).y();
        this.c = new y5(j, true, false, false, null, xbVarY);
    }

    @Override // ur.y
    public void ap() {
    }

    @Override // ur.mg
    public void oz() {
    }
}
