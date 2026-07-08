package ft;

import androidx.annotation.Nullable;
import ft.xq;
import k4.r;
import ur.mg;

/* JADX INFO: loaded from: classes.dex */
public final class oa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4958a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public l f4959c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4960f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f4961fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final v0.p f4962gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public l f4963i9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public l f4964s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public Object f4965t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public long f4966tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f4967v;
    public final zo.y zn;
    public final xq.n3 y = new xq.n3();
    public final xq.gv n3 = new xq.gv();

    public oa(zo.y yVar, v0.p pVar) {
        this.zn = yVar;
        this.f4962gv = pVar;
    }

    public static mg.n3 d0(xq xqVar, Object obj, long j, long j4, xq.gv gvVar, xq.n3 n3Var) {
        xqVar.t(obj, n3Var);
        xqVar.mt(n3Var.f5172fb, gvVar);
        int iA = xqVar.a(obj);
        Object objV = obj;
        while (n3Var.f5173s == 0 && n3Var.a() > 0 && n3Var.z(n3Var.mt()) && n3Var.s(0L) == -1) {
            int i = iA + 1;
            if (iA >= gvVar.fh) {
                break;
            }
            xqVar.f(i, n3Var, true);
            objV = v0.y.v(n3Var.f5175v);
            iA = i;
        }
        xqVar.t(objV, n3Var);
        int iS = n3Var.s(j);
        return iS == -1 ? new mg.n3(objV, j4, n3Var.fb(j)) : new mg.n3(objV, iS, n3Var.wz(iS), j4);
    }

    public void a() {
        if (this.f4960f == 0) {
            return;
        }
        l lVarI9 = (l) v0.y.c5(this.f4964s);
        this.f4965t = lVarI9.n3;
        this.f4966tl = lVarI9.f4925a.y.f8549gv;
        while (lVarI9 != null) {
            lVarI9.z();
            lVarI9 = lVarI9.i9();
        }
        this.f4964s = null;
        this.f4963i9 = null;
        this.f4959c5 = null;
        this.f4960f = 0;
        f3();
    }

    public boolean c(l lVar) {
        boolean z = false;
        v0.y.fb(lVar != null);
        if (lVar.equals(this.f4963i9)) {
            return false;
        }
        this.f4963i9 = lVar;
        while (lVar.i9() != null) {
            lVar = lVar.i9();
            if (lVar == this.f4959c5) {
                this.f4959c5 = this.f4964s;
                z = true;
            }
            lVar.z();
            this.f4960f--;
        }
        this.f4963i9.i4(null);
        f3();
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ft.gq c5(ft.xq r20, ft.l r21, long r22) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ft.oa.c5(ft.xq, ft.l, long):ft.gq");
    }

    public final boolean co(mg.n3 n3Var) {
        return !n3Var.n3() && n3Var.f8550v == -1;
    }

    public boolean d(xq xqVar, long j, long j4) {
        gq gqVarMt;
        l lVarI9 = this.f4964s;
        l lVar = null;
        while (lVarI9 != null) {
            gq gqVar = lVarI9.f4925a;
            if (lVar == null) {
                gqVarMt = mt(xqVar, gqVar);
            } else {
                gq gqVarC5 = c5(xqVar, lVar, j);
                if (gqVarC5 == null) {
                    return !c(lVar);
                }
                if (!v(gqVar, gqVarC5)) {
                    return !c(lVar);
                }
                gqVarMt = gqVarC5;
            }
            lVarI9.f4925a = gqVarMt.y(gqVar.zn);
            if (!gv(gqVar.f4828v, gqVarMt.f4828v)) {
                lVarI9.d0();
                long j7 = gqVarMt.f4828v;
                return (c(lVarI9) || (lVarI9 == this.f4959c5 && !lVarI9.f4925a.f4823a && ((j4 > Long.MIN_VALUE ? 1 : (j4 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j4 > ((j7 > (-9223372036854775807L) ? 1 : (j7 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : lVarI9.c(j7)) ? 1 : (j4 == ((j7 > (-9223372036854775807L) ? 1 : (j7 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : lVarI9.c(j7)) ? 0 : -1)) >= 0))) ? false : true;
            }
            lVar = lVarI9;
            lVarI9 = lVarI9.i9();
        }
        return true;
    }

    public boolean ej(xq xqVar, boolean z) {
        this.f4961fb = z;
        return ta(xqVar);
    }

    @Nullable
    public final gq f(xq xqVar, mg.n3 n3Var, long j, long j4) {
        xqVar.t(n3Var.y, this.y);
        return n3Var.n3() ? t(xqVar, n3Var.y, n3Var.n3, n3Var.zn, j, n3Var.f8549gv) : tl(xqVar, n3Var.y, j4, j, n3Var.f8549gv);
    }

    public final void f3() {
        final r.y yVarN = k4.r.n();
        for (l lVarI9 = this.f4964s; lVarI9 != null; lVarI9 = lVarI9.i9()) {
            yVarN.y(lVarI9.f4925a.y);
        }
        l lVar = this.f4959c5;
        final mg.n3 n3Var = lVar == null ? null : lVar.f4925a.y;
        this.f4962gv.c5(new Runnable() { // from class: ft.vp
            @Override // java.lang.Runnable
            public final void run() {
                this.y.i4(yVarN, n3Var);
            }
        });
    }

    public l fb(ic[] icVarArr, n0.ud udVar, r0.n3 n3Var, ne neVar, gq gqVar, n0.a8 a8Var) {
        l lVar = this.f4963i9;
        l lVar2 = new l(icVarArr, lVar == null ? 1000000000000L : (lVar.t() + this.f4963i9.f4925a.f4828v) - gqVar.n3, udVar, n3Var, neVar, gqVar, a8Var);
        l lVar3 = this.f4963i9;
        if (lVar3 != null) {
            lVar3.i4(lVar2);
        } else {
            this.f4964s = lVar2;
            this.f4959c5 = lVar2;
        }
        this.f4965t = null;
        this.f4963i9 = lVar2;
        this.f4960f++;
        f3();
        return lVar2;
    }

    public mg.n3 fh(xq xqVar, Object obj, long j) {
        long jRz = rz(xqVar, obj);
        xqVar.t(obj, this.y);
        xqVar.mt(this.y.f5172fb, this.n3);
        boolean z = false;
        for (int iA = xqVar.a(obj); iA >= this.n3.d0; iA--) {
            xqVar.f(iA, this.y, true);
            boolean z5 = this.y.a() > 0;
            z |= z5;
            xq.n3 n3Var = this.y;
            if (n3Var.s(n3Var.f5173s) != -1) {
                obj = v0.y.v(this.y.f5175v);
            }
            if (z && (!z5 || this.y.f5173s != 0)) {
                break;
            }
        }
        return d0(xqVar, obj, j, jRz, this.n3, this.y);
    }

    public final boolean gv(long j, long j4) {
        return j == -9223372036854775807L || j == j4;
    }

    public final /* synthetic */ void i4(r.y yVar, mg.n3 n3Var) {
        this.zn.ta(yVar.f(), n3Var);
    }

    @Nullable
    public l i9() {
        return this.f4963i9;
    }

    public boolean mg() {
        l lVar = this.f4963i9;
        return lVar == null || (!lVar.f4925a.f4824c5 && lVar.p() && this.f4963i9.f4925a.f4828v != -9223372036854775807L && this.f4960f < 100);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ft.gq mt(ft.xq r19, ft.gq r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            ur.mg$n3 r3 = r2.y
            boolean r12 = r0.co(r3)
            boolean r13 = r0.r(r1, r3)
            boolean r14 = r0.z(r1, r3, r12)
            ur.mg$n3 r4 = r2.y
            java.lang.Object r4 = r4.y
            ft.xq$n3 r5 = r0.y
            r1.t(r4, r5)
            boolean r1 = r3.n3()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L35
            int r1 = r3.f8550v
            if (r1 != r6) goto L2e
            goto L35
        L2e:
            ft.xq$n3 r7 = r0.y
            long r7 = r7.c5(r1)
            goto L36
        L35:
            r7 = r4
        L36:
            boolean r1 = r3.n3()
            if (r1 == 0) goto L48
            ft.xq$n3 r1 = r0.y
            int r4 = r3.n3
            int r5 = r3.zn
            long r4 = r1.v(r4, r5)
        L46:
            r9 = r4
            goto L5c
        L48:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L55
            r4 = -9223372036854775808
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            ft.xq$n3 r1 = r0.y
            long r4 = r1.tl()
            goto L46
        L5c:
            boolean r1 = r3.n3()
            if (r1 == 0) goto L6c
            ft.xq$n3 r1 = r0.y
            int r4 = r3.n3
            boolean r1 = r1.z(r4)
            r11 = r1
            goto L7d
        L6c:
            int r1 = r3.f8550v
            if (r1 == r6) goto L7b
            ft.xq$n3 r4 = r0.y
            boolean r1 = r4.z(r1)
            if (r1 == 0) goto L7b
            r1 = 1
            r11 = 1
            goto L7d
        L7b:
            r1 = 0
            r11 = 0
        L7d:
            ft.gq r15 = new ft.gq
            long r4 = r2.n3
            long r1 = r2.zn
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ft.oa.mt(ft.xq, ft.gq):ft.gq");
    }

    public void n(long j) {
        l lVar = this.f4963i9;
        if (lVar != null) {
            lVar.co(j);
        }
    }

    @Nullable
    public l n3() {
        l lVar = this.f4964s;
        if (lVar == null) {
            return null;
        }
        if (lVar == this.f4959c5) {
            this.f4959c5 = lVar.i9();
        }
        this.f4964s.z();
        int i = this.f4960f - 1;
        this.f4960f = i;
        if (i == 0) {
            this.f4963i9 = null;
            l lVar2 = this.f4964s;
            this.f4965t = lVar2.n3;
            this.f4966tl = lVar2.f4925a.y.f8549gv;
        }
        this.f4964s = this.f4964s.i9();
        f3();
        return this.f4964s;
    }

    @Nullable
    public l p() {
        return this.f4959c5;
    }

    public final boolean r(xq xqVar, mg.n3 n3Var) {
        if (co(n3Var)) {
            return xqVar.mt(xqVar.t(n3Var.y, this.y).f5172fb, this.n3).fh == xqVar.a(n3Var.y);
        }
        return false;
    }

    public final long rz(xq xqVar, Object obj) {
        int iA;
        int i = xqVar.t(obj, this.y).f5172fb;
        Object obj2 = this.f4965t;
        if (obj2 != null && (iA = xqVar.a(obj2)) != -1 && xqVar.i9(iA, this.y).f5172fb == i) {
            return this.f4966tl;
        }
        for (l lVarI9 = this.f4964s; lVarI9 != null; lVarI9 = lVarI9.i9()) {
            if (lVarI9.n3.equals(obj)) {
                return lVarI9.f4925a.y.f8549gv;
            }
        }
        for (l lVarI92 = this.f4964s; lVarI92 != null; lVarI92 = lVarI92.i9()) {
            int iA2 = xqVar.a(lVarI92.n3);
            if (iA2 != -1 && xqVar.i9(iA2, this.y).f5172fb == i) {
                return lVarI92.f4925a.y.f8549gv;
            }
        }
        long j = this.f4967v;
        this.f4967v = 1 + j;
        if (this.f4964s == null) {
            this.f4965t = obj;
            this.f4966tl = j;
        }
        return j;
    }

    @Nullable
    public final gq s(fc fcVar) {
        return f(fcVar.y, fcVar.n3, fcVar.zn, fcVar.f4748mt);
    }

    public final gq t(xq xqVar, Object obj, int i, int i5, long j, long j4) {
        mg.n3 n3Var = new mg.n3(obj, i, i5, j4);
        long jV = xqVar.t(n3Var.y, this.y).v(n3Var.n3, n3Var.zn);
        long jI9 = i5 == this.y.wz(i) ? this.y.i9() : 0L;
        return new gq(n3Var, (jV == -9223372036854775807L || jI9 < jV) ? jI9 : Math.max(0L, jV - 1), j, -9223372036854775807L, jV, this.y.z(n3Var.n3), false, false, false);
    }

    public final boolean ta(xq xqVar) {
        l lVarI9 = this.f4964s;
        if (lVarI9 == null) {
            return true;
        }
        int iA = xqVar.a(lVarI9.n3);
        while (true) {
            iA = xqVar.s(iA, this.y, this.n3, this.f4958a, this.f4961fb);
            while (lVarI9.i9() != null && !lVarI9.f4925a.f4825fb) {
                lVarI9 = lVarI9.i9();
            }
            l lVarI92 = lVarI9.i9();
            if (iA == -1 || lVarI92 == null || xqVar.a(lVarI92.n3) != iA) {
                break;
            }
            lVarI9 = lVarI92;
        }
        boolean zC = c(lVarI9);
        lVarI9.f4925a = mt(xqVar, lVarI9.f4925a);
        return !zC;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ft.gq tl(ft.xq r25, java.lang.Object r26, long r27, long r29, long r31) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            ft.xq$n3 r5 = r0.y
            r1.t(r2, r5)
            ft.xq$n3 r5 = r0.y
            int r5 = r5.fb(r3)
            r6 = 1
            r7 = 0
            r8 = -1
            if (r5 != r8) goto L2d
            ft.xq$n3 r9 = r0.y
            int r9 = r9.a()
            if (r9 <= 0) goto L4c
            ft.xq$n3 r9 = r0.y
            int r10 = r9.mt()
            boolean r9 = r9.z(r10)
            if (r9 == 0) goto L4c
            goto L4a
        L2d:
            ft.xq$n3 r9 = r0.y
            boolean r9 = r9.z(r5)
            if (r9 == 0) goto L4c
            ft.xq$n3 r9 = r0.y
            long r9 = r9.c5(r5)
            ft.xq$n3 r11 = r0.y
            long r12 = r11.f5173s
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 != 0) goto L4c
            boolean r9 = r11.co(r5)
            if (r9 == 0) goto L4c
            r5 = -1
        L4a:
            r9 = 1
            goto L4d
        L4c:
            r9 = 0
        L4d:
            ur.mg$n3 r11 = new ur.mg$n3
            r12 = r31
            r11.<init>(r2, r12, r5)
            boolean r2 = r0.co(r11)
            boolean r22 = r0.r(r1, r11)
            boolean r23 = r0.z(r1, r11, r2)
            if (r5 == r8) goto L6d
            ft.xq$n3 r1 = r0.y
            boolean r1 = r1.z(r5)
            if (r1 == 0) goto L6d
            r20 = 1
            goto L6f
        L6d:
            r20 = 0
        L6f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == r8) goto L7f
            ft.xq$n3 r1 = r0.y
            long r14 = r1.c5(r5)
        L7c:
            r16 = r14
            goto L88
        L7f:
            if (r9 == 0) goto L86
            ft.xq$n3 r1 = r0.y
            long r14 = r1.f5173s
            goto L7c
        L86:
            r16 = r12
        L88:
            int r1 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r1 == 0) goto L96
            r14 = -9223372036854775808
            int r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r1 != 0) goto L93
            goto L96
        L93:
            r18 = r16
            goto L9c
        L96:
            ft.xq$n3 r1 = r0.y
            long r14 = r1.f5173s
            r18 = r14
        L9c:
            int r1 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r1 == 0) goto Lb3
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 < 0) goto Lb3
            if (r23 != 0) goto Laa
            if (r9 != 0) goto La9
            goto Laa
        La9:
            r6 = 0
        Laa:
            long r3 = (long) r6
            long r3 = r18 - r3
            r5 = 0
            long r3 = java.lang.Math.max(r5, r3)
        Lb3:
            r12 = r3
            ft.gq r1 = new ft.gq
            r10 = r1
            r14 = r29
            r21 = r2
            r10.<init>(r11, r12, r14, r16, r18, r20, r21, r22, r23)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ft.oa.tl(ft.xq, java.lang.Object, long, long, long):ft.gq");
    }

    public final boolean v(gq gqVar, gq gqVar2) {
        return gqVar.n3 == gqVar2.n3 && gqVar.y.equals(gqVar2.y);
    }

    @Nullable
    public l w() {
        return this.f4964s;
    }

    public final long wz(xq xqVar, Object obj, int i) {
        xqVar.t(obj, this.y);
        long jC5 = this.y.c5(i);
        return jC5 == Long.MIN_VALUE ? this.y.f5173s : jC5 + this.y.t(i);
    }

    public boolean x4(ur.d0 d0Var) {
        l lVar = this.f4963i9;
        return lVar != null && lVar.y == d0Var;
    }

    @Nullable
    public gq xc(long j, fc fcVar) {
        l lVar = this.f4963i9;
        return lVar == null ? s(fcVar) : c5(fcVar.y, lVar, j);
    }

    public final boolean z(xq xqVar, mg.n3 n3Var, boolean z) {
        int iA = xqVar.a(n3Var.y);
        return !xqVar.mt(xqVar.i9(iA, this.y).f5172fb, this.n3).f5159co && xqVar.x4(iA, this.y, this.n3, this.f4958a, this.f4961fb) && z;
    }

    public boolean z6(xq xqVar, int i) {
        this.f4958a = i;
        return ta(xqVar);
    }

    public l zn() {
        l lVar = this.f4959c5;
        v0.y.fb((lVar == null || lVar.i9() == null) ? false : true);
        this.f4959c5 = this.f4959c5.i9();
        f3();
        return this.f4959c5;
    }
}
