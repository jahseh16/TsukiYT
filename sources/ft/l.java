package ft;

import androidx.annotation.Nullable;
import ur.mg;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gq f4925a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final ic[] f4926c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ne f4927f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f4928fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public boolean f4929gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final n0.ud f4930i9;
    public final Object n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean[] f4931s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public l f4932t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public ur.lc f4933tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4934v;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public n0.a8 f4935wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public long f4936xc;
    public final ur.d0 y;
    public final ur.en[] zn;

    public l(ic[] icVarArr, long j, n0.ud udVar, r0.n3 n3Var, ne neVar, gq gqVar, n0.a8 a8Var) {
        this.f4926c5 = icVarArr;
        this.f4936xc = j;
        this.f4930i9 = udVar;
        this.f4927f = neVar;
        mg.n3 n3Var2 = gqVar.y;
        this.n3 = n3Var2.y;
        this.f4925a = gqVar;
        this.f4933tl = ur.lc.f8604s;
        this.f4935wz = a8Var;
        this.zn = new ur.en[icVarArr.length];
        this.f4931s = new boolean[icVarArr.length];
        this.y = v(n3Var2, neVar, n3Var, gqVar.n3, gqVar.f4826gv);
    }

    public static void r(ne neVar, ur.d0 d0Var) {
        try {
            if (d0Var instanceof ur.gv) {
                neVar.c(((ur.gv) d0Var).y);
            } else {
                neVar.c(d0Var);
            }
        } catch (RuntimeException e4) {
            v0.r.gv("MediaPeriodHolder", "Period release failed.", e4);
        }
    }

    public static ur.d0 v(mg.n3 n3Var, ne neVar, r0.n3 n3Var2, long j, long j4) {
        ur.d0 d0VarS = neVar.s(n3Var, n3Var2, j);
        return j4 != -9223372036854775807L ? new ur.gv(d0VarS, true, 0L, j4) : d0VarS;
    }

    public final void a() {
        if (!mt()) {
            return;
        }
        int i = 0;
        while (true) {
            n0.a8 a8Var = this.f4935wz;
            if (i >= a8Var.y) {
                return;
            }
            boolean zZn = a8Var.zn(i);
            n0.c cVar = this.f4935wz.zn[i];
            if (zZn && cVar != null) {
                cVar.fb();
            }
            i++;
        }
    }

    public long c(long j) {
        return j + t();
    }

    public long c5() {
        if (!this.f4929gv) {
            return this.f4925a.n3;
        }
        long jFb = this.f4934v ? this.y.fb() : Long.MIN_VALUE;
        return jFb == Long.MIN_VALUE ? this.f4925a.f4828v : jFb;
    }

    public void co(long j) {
        v0.y.fb(mt());
        if (this.f4929gv) {
            this.y.s(n(j));
        }
    }

    public void d0() {
        ur.d0 d0Var = this.y;
        if (d0Var instanceof ur.gv) {
            long j = this.f4925a.f4826gv;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((ur.gv) d0Var).x4(0L, j);
        }
    }

    public long f() {
        if (this.f4929gv) {
            return this.y.zn();
        }
        return 0L;
    }

    public void f3(long j) {
        this.f4936xc = j;
    }

    public final void fb(ur.en[] enVarArr) {
        int i = 0;
        while (true) {
            ic[] icVarArr = this.f4926c5;
            if (i >= icVarArr.length) {
                return;
            }
            if (icVarArr[i].s() == -2) {
                enVarArr[i] = null;
            }
            i++;
        }
    }

    public void gv(long j) {
        v0.y.fb(mt());
        this.y.v(n(j));
    }

    public void i4(@Nullable l lVar) {
        if (lVar == this.f4932t) {
            return;
        }
        a();
        this.f4932t = lVar;
        s();
    }

    @Nullable
    public l i9() {
        return this.f4932t;
    }

    public final boolean mt() {
        return this.f4932t == null;
    }

    public long n(long j) {
        return j - t();
    }

    public long n3(n0.a8 a8Var, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z5 = true;
            if (i >= a8Var.y) {
                break;
            }
            boolean[] zArr2 = this.f4931s;
            if (z || !a8Var.n3(this.f4935wz, i)) {
                z5 = false;
            }
            zArr2[i] = z5;
            i++;
        }
        fb(this.zn);
        a();
        this.f4935wz = a8Var;
        s();
        long jF = this.y.f(a8Var.zn, this.f4931s, this.zn, zArr, j);
        zn(this.zn);
        this.f4934v = false;
        int i5 = 0;
        while (true) {
            ur.en[] enVarArr = this.zn;
            if (i5 >= enVarArr.length) {
                return jF;
            }
            if (enVarArr[i5] != null) {
                v0.y.fb(a8Var.zn(i5));
                if (this.f4926c5[i5].s() != -2) {
                    this.f4934v = true;
                }
            } else {
                v0.y.fb(a8Var.zn[i5] == null);
            }
            i5++;
        }
    }

    public boolean p() {
        return this.f4929gv && (!this.f4934v || this.y.fb() == Long.MIN_VALUE);
    }

    public final void s() {
        if (!mt()) {
            return;
        }
        int i = 0;
        while (true) {
            n0.a8 a8Var = this.f4935wz;
            if (i >= a8Var.y) {
                return;
            }
            boolean zZn = a8Var.zn(i);
            n0.c cVar = this.f4935wz.zn[i];
            if (zZn && cVar != null) {
                cVar.y();
            }
            i++;
        }
    }

    public long t() {
        return this.f4936xc;
    }

    public long tl() {
        return this.f4925a.n3 + this.f4936xc;
    }

    public void w(float f3, xq xqVar) throws p {
        this.f4929gv = true;
        this.f4933tl = this.y.mt();
        n0.a8 a8VarX4 = x4(f3, xqVar);
        gq gqVar = this.f4925a;
        long jMax = gqVar.n3;
        long j = gqVar.f4828v;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jY = y(a8VarX4, jMax, false);
        long j4 = this.f4936xc;
        gq gqVar2 = this.f4925a;
        this.f4936xc = j4 + (gqVar2.n3 - jY);
        this.f4925a = gqVar2.n3(jY);
    }

    public ur.lc wz() {
        return this.f4933tl;
    }

    public n0.a8 x4(float f3, xq xqVar) throws p {
        n0.a8 a8VarF = this.f4930i9.f(this.f4926c5, wz(), this.f4925a.y, xqVar);
        for (n0.c cVar : a8VarF.zn) {
            if (cVar != null) {
                cVar.c5(f3);
            }
        }
        return a8VarF;
    }

    public n0.a8 xc() {
        return this.f4935wz;
    }

    public long y(n0.a8 a8Var, long j, boolean z) {
        return n3(a8Var, j, z, new boolean[this.f4926c5.length]);
    }

    public void z() {
        a();
        r(this.f4927f, this.y);
    }

    public final void zn(ur.en[] enVarArr) {
        int i = 0;
        while (true) {
            ic[] icVarArr = this.f4926c5;
            if (i >= icVarArr.length) {
                return;
            }
            if (icVarArr[i].s() == -2 && this.f4935wz.zn(i)) {
                enVarArr[i] = new ur.z();
            }
            i++;
        }
    }
}
