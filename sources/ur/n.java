package ur;

import androidx.annotation.Nullable;
import ft.xb;
import ft.xq;
import ur.mg;

/* JADX INFO: loaded from: classes.dex */
public final class n extends ra {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8609b;
    public final xq.gv c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public f3 f8610d;
    public final xq.n3 d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public boolean f8611ej;
    public y fh;
    public final boolean n;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8612x;

    public static final class n3 extends xq {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final xb f8613t;

        public n3(xb xbVar) {
            this.f8613t = xbVar;
        }

        @Override // ft.xq
        public int a(Object obj) {
            return obj == y.f8614co ? 0 : -1;
        }

        @Override // ft.xq
        public xq.gv co(int i, xq.gv gvVar, long j) {
            gvVar.c5(xq.gv.f5153ej, this.f8613t, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            gvVar.f3 = true;
            return gvVar;
        }

        @Override // ft.xq
        public xq.n3 f(int i, xq.n3 n3Var, boolean z) {
            n3Var.x4(z ? 0 : null, z ? y.f8614co : null, 0, -9223372036854775807L, 0L, s6.zn.w, true);
            return n3Var;
        }

        @Override // ft.xq
        public Object p(int i) {
            return y.f8614co;
        }

        @Override // ft.xq
        public int tl() {
            return 1;
        }

        @Override // ft.xq
        public int z() {
            return 1;
        }
    }

    public static final class y extends r {

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public static final Object f8614co = new Object();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @Nullable
        public final Object f8615p;

        @Nullable
        public final Object w;

        public y(xq xqVar, @Nullable Object obj, @Nullable Object obj2) {
            super(xqVar);
            this.w = obj;
            this.f8615p = obj2;
        }

        public static y c(xq xqVar, @Nullable Object obj, @Nullable Object obj2) {
            return new y(xqVar, obj, obj2);
        }

        public static y n(xb xbVar) {
            return new y(new n3(xbVar), xq.gv.f5153ej, f8614co);
        }

        @Override // ur.r, ft.xq
        public int a(Object obj) {
            Object obj2;
            xq xqVar = this.f8632t;
            if (f8614co.equals(obj) && (obj2 = this.f8615p) != null) {
                obj = obj2;
            }
            return xqVar.a(obj);
        }

        @Override // ur.r, ft.xq
        public xq.gv co(int i, xq.gv gvVar, long j) {
            this.f8632t.co(i, gvVar, j);
            if (v0.ut.zn(gvVar.y, this.w)) {
                gvVar.y = xq.gv.f5153ej;
            }
            return gvVar;
        }

        @Override // ur.r, ft.xq
        public xq.n3 f(int i, xq.n3 n3Var, boolean z) {
            this.f8632t.f(i, n3Var, z);
            if (v0.ut.zn(n3Var.f5175v, this.f8615p) && z) {
                n3Var.f5175v = f8614co;
            }
            return n3Var;
        }

        public y f3(xq xqVar) {
            return new y(xqVar, this.w, this.f8615p);
        }

        @Override // ur.r, ft.xq
        public Object p(int i) {
            Object objP = this.f8632t.p(i);
            return v0.ut.zn(objP, this.f8615p) ? f8614co : objP;
        }
    }

    public n(mg mgVar, boolean z) {
        super(mgVar);
        this.n = z && mgVar.ut();
        this.c = new xq.gv();
        this.d0 = new xq.n3();
        xq xqVarQ9 = mgVar.q9();
        if (xqVarQ9 == null) {
            this.fh = y.n(mgVar.c());
        } else {
            this.fh = y.c(xqVarQ9, null, null);
            this.f8609b = true;
        }
    }

    @Override // ur.fb, ur.y
    public void ap() {
        this.f8612x = false;
        this.f8611ej = false;
        super.ap();
    }

    @Override // ur.mg
    public void d(d0 d0Var) {
        ((f3) d0Var).i4();
        if (d0Var == this.f8610d) {
            this.f8610d = null;
        }
    }

    public final Object gq(Object obj) {
        return (this.fh.f8615p == null || !obj.equals(y.f8614co)) ? obj : this.fh.f8615p;
    }

    public final Object l(Object obj) {
        return (this.fh.f8615p == null || !this.fh.f8615p.equals(obj)) ? obj : y.f8614co;
    }

    public final void oa(long j) {
        f3 f3Var = this.f8610d;
        int iA = this.fh.a(f3Var.y.y);
        if (iA == -1) {
            return;
        }
        long j4 = this.fh.i9(iA, this.d0).f5173s;
        if (j4 != -9223372036854775807L && j >= j4) {
            j = Math.max(0L, j4 - 1);
        }
        f3Var.x4(j);
    }

    @Override // ur.ra
    @Nullable
    public mg.n3 pz(mg.n3 n3Var) {
        return n3Var.zn(l(n3Var.y));
    }

    @Override // ur.mg
    /* JADX INFO: renamed from: qj, reason: merged with bridge method [inline-methods] */
    public f3 zn(mg.n3 n3Var, r0.n3 n3Var2, long j) {
        f3 f3Var = new f3(n3Var, n3Var2, j);
        f3Var.f3(this.f8633r);
        if (this.f8612x) {
            f3Var.n3(n3Var.zn(gq(n3Var.y)));
        } else {
            this.f8610d = f3Var;
            if (!this.f8611ej) {
                this.f8611ej = true;
                cy();
            }
        }
        return f3Var;
    }

    @Override // ur.ra
    public void qk() {
        if (this.n) {
            return;
        }
        this.f8611ej = true;
        cy();
    }

    public xq vp() {
        return this.fh;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // ur.ra
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void wf(ft.xq r15) {
        /*
            r14 = this;
            boolean r0 = r14.f8612x
            if (r0 == 0) goto L19
            ur.n$y r0 = r14.fh
            ur.n$y r15 = r0.f3(r15)
            r14.fh = r15
            ur.f3 r15 = r14.f8610d
            if (r15 == 0) goto Lae
            long r0 = r15.w()
            r14.oa(r0)
            goto Lae
        L19:
            boolean r0 = r15.r()
            if (r0 == 0) goto L36
            boolean r0 = r14.f8609b
            if (r0 == 0) goto L2a
            ur.n$y r0 = r14.fh
            ur.n$y r15 = r0.f3(r15)
            goto L32
        L2a:
            java.lang.Object r0 = ft.xq.gv.f5153ej
            java.lang.Object r1 = ur.n.y.f8614co
            ur.n$y r15 = ur.n.y.c(r15, r0, r1)
        L32:
            r14.fh = r15
            goto Lae
        L36:
            ft.xq$gv r0 = r14.c
            r1 = 0
            r15.mt(r1, r0)
            ft.xq$gv r0 = r14.c
            long r2 = r0.v()
            ft.xq$gv r0 = r14.c
            java.lang.Object r0 = r0.y
            ur.f3 r4 = r14.f8610d
            if (r4 == 0) goto L74
            long r4 = r4.p()
            ur.n$y r6 = r14.fh
            ur.f3 r7 = r14.f8610d
            ur.mg$n3 r7 = r7.y
            java.lang.Object r7 = r7.y
            ft.xq$n3 r8 = r14.d0
            r6.t(r7, r8)
            ft.xq$n3 r6 = r14.d0
            long r6 = r6.p()
            long r6 = r6 + r4
            ur.n$y r4 = r14.fh
            ft.xq$gv r5 = r14.c
            ft.xq$gv r1 = r4.mt(r1, r5)
            long r4 = r1.v()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            r12 = r6
            goto L75
        L74:
            r12 = r2
        L75:
            ft.xq$gv r9 = r14.c
            ft.xq$n3 r10 = r14.d0
            r11 = 0
            r8 = r15
            android.util.Pair r1 = r8.wz(r9, r10, r11, r12)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r14.f8609b
            if (r1 == 0) goto L94
            ur.n$y r0 = r14.fh
            ur.n$y r15 = r0.f3(r15)
            goto L98
        L94:
            ur.n$y r15 = ur.n.y.c(r15, r0, r2)
        L98:
            r14.fh = r15
            ur.f3 r15 = r14.f8610d
            if (r15 == 0) goto Lae
            r14.oa(r3)
            ur.mg$n3 r15 = r15.y
            java.lang.Object r0 = r15.y
            java.lang.Object r0 = r14.gq(r0)
            ur.mg$n3 r15 = r15.zn(r0)
            goto Laf
        Lae:
            r15 = 0
        Laf:
            r0 = 1
            r14.f8609b = r0
            r14.f8612x = r0
            ur.n$y r0 = r14.fh
            r14.s8(r0)
            if (r15 == 0) goto Lc6
            ur.f3 r0 = r14.f8610d
            java.lang.Object r0 = v0.y.v(r0)
            ur.f3 r0 = (ur.f3) r0
            r0.n3(r15)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ur.n.wf(ft.xq):void");
    }

    @Override // ur.fb, ur.mg
    public void oz() {
    }
}
