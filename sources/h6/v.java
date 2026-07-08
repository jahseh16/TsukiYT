package h6;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import b1.d0;
import b1.fh;
import b1.mg;
import b1.ta;
import ft.g;
import h6.fb;
import java.io.IOException;
import java.util.List;
import v0.d;
import v0.n;
import v0.ut;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public final class v implements b1.wz, fb {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public g[] f5321co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5322f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final g f5323fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public fh f5324p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SparseArray<y> f5325s = new SparseArray<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public fb.n3 f5326t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f5327v;
    public long w;
    public final b1.t y;
    public static final fb.y z = new fb.y() { // from class: h6.gv
        @Override // h6.fb.y
        public final fb y(int i, g gVar, boolean z5, List list, ta taVar, gn gnVar) {
            return v.fb(i, gVar, z5, list, taVar, gnVar);
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d0 f5320r = new d0();

    public static final class y implements ta {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ta f5328a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public long f5329fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final b1.f f5330gv = new b1.f();
        public final int n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public g f5331v;
        public final int y;

        @Nullable
        public final g zn;

        public y(int i, int i5, @Nullable g gVar) {
            this.y = i;
            this.n3 = i5;
            this.zn = gVar;
        }

        @Override // b1.ta
        public void a(long j, int i, int i5, int i8, @Nullable ta.y yVar) {
            long j4 = this.f5329fb;
            if (j4 != -9223372036854775807L && j >= j4) {
                this.f5328a = this.f5330gv;
            }
            ((ta) ut.i9(this.f5328a)).a(j, i, i5, i8, yVar);
        }

        public void fb(@Nullable fb.n3 n3Var, long j) {
            if (n3Var == null) {
                this.f5328a = this.f5330gv;
                return;
            }
            this.f5329fb = j;
            ta taVarA = n3Var.a(this.y, this.n3);
            this.f5328a = taVarA;
            g gVar = this.f5331v;
            if (gVar != null) {
                taVarA.y(gVar);
            }
        }

        @Override // b1.ta
        public int gv(r0.c5 c5Var, int i, boolean z, int i5) throws IOException {
            return ((ta) ut.i9(this.f5328a)).v(c5Var, i, z);
        }

        @Override // b1.ta
        public /* synthetic */ void n3(d dVar, int i) {
            mg.n3(this, dVar, i);
        }

        @Override // b1.ta
        public /* synthetic */ int v(r0.c5 c5Var, int i, boolean z) {
            return mg.y(this, c5Var, i, z);
        }

        @Override // b1.ta
        public void y(g gVar) {
            g gVar2 = this.zn;
            if (gVar2 != null) {
                gVar = gVar.f(gVar2);
            }
            this.f5331v = gVar;
            ((ta) ut.i9(this.f5328a)).y(this.f5331v);
        }

        @Override // b1.ta
        public void zn(d dVar, int i, int i5) {
            ((ta) ut.i9(this.f5328a)).n3(dVar, i);
        }
    }

    public v(b1.t tVar, int i, g gVar) {
        this.y = tVar;
        this.f5327v = i;
        this.f5323fb = gVar;
    }

    public static /* synthetic */ fb fb(int i, g gVar, boolean z5, List list, ta taVar, gn gnVar) {
        b1.t fbVar;
        String str = gVar.f4787r;
        if (n.mt(str)) {
            return null;
        }
        if (n.p(str)) {
            fbVar = new x9.v(1);
        } else {
            fbVar = new tn.fb(z5 ? 4 : 0, null, null, list, taVar);
        }
        return new v(fbVar, i, gVar);
    }

    @Override // b1.wz
    public ta a(int i, int i5) {
        y yVar = this.f5325s.get(i);
        if (yVar == null) {
            v0.y.fb(this.f5321co == null);
            yVar = new y(i, i5, i5 == this.f5327v ? this.f5323fb : null);
            yVar.fb(this.f5326t, this.w);
            this.f5325s.put(i, yVar);
        }
        return yVar;
    }

    @Override // h6.fb
    public void gv(@Nullable fb.n3 n3Var, long j, long j4) {
        this.f5326t = n3Var;
        this.w = j4;
        if (!this.f5322f) {
            this.y.zn(this);
            if (j != -9223372036854775807L) {
                this.y.y(0L, j);
            }
            this.f5322f = true;
            return;
        }
        b1.t tVar = this.y;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        tVar.y(0L, j);
        for (int i = 0; i < this.f5325s.size(); i++) {
            this.f5325s.valueAt(i).fb(n3Var, j4);
        }
    }

    @Override // h6.fb
    public boolean n3(b1.tl tlVar) throws IOException {
        int iFb = this.y.fb(tlVar, f5320r);
        v0.y.fb(iFb != 1);
        return iFb == 0;
    }

    @Override // b1.wz
    public void p() {
        g[] gVarArr = new g[this.f5325s.size()];
        for (int i = 0; i < this.f5325s.size(); i++) {
            gVarArr[i] = (g) v0.y.c5(this.f5325s.valueAt(i).f5331v);
        }
        this.f5321co = gVarArr;
    }

    @Override // h6.fb
    public void release() {
        this.y.release();
    }

    @Override // h6.fb
    @Nullable
    public g[] v() {
        return this.f5321co;
    }

    @Override // b1.wz
    public void z(fh fhVar) {
        this.f5324p = fhVar;
    }

    @Override // h6.fb
    @Nullable
    public b1.gv zn() {
        fh fhVar = this.f5324p;
        if (fhVar instanceof b1.gv) {
            return (b1.gv) fhVar;
        }
        return null;
    }
}
