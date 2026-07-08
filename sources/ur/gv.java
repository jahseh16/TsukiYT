package ur;

import androidx.annotation.Nullable;
import ft.g;
import ft.p1;
import ft.u0;
import java.io.IOException;
import ur.d0;
import ur.v;

/* JADX INFO: loaded from: classes.dex */
public final class gv implements d0, d0.y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8551f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public y[] f8552fb = new y[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f8553s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f8554t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public d0.y f8555v;

    @Nullable
    public v.n3 w;
    public final d0 y;

    public final class y implements en {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f8557v;
        public final en y;

        public y(en enVar) {
            this.y = enVar;
        }

        @Override // ur.en
        public int a(u0 u0Var, di.fb fbVar, int i) {
            if (gv.this.w()) {
                return -3;
            }
            if (this.f8557v) {
                fbVar.w(4);
                return -4;
            }
            int iA = this.y.a(u0Var, fbVar, i);
            if (iA == -5) {
                g gVar = (g) v0.y.v(u0Var.n3);
                int i5 = gVar.q9;
                if (i5 != 0 || gVar.f4785k != 0) {
                    gv gvVar = gv.this;
                    if (gvVar.f8551f != 0) {
                        i5 = 0;
                    }
                    u0Var.n3 = gVar.n3().hw(i5).j5(gvVar.f8554t == Long.MIN_VALUE ? gVar.f4785k : 0).z6();
                }
                return -5;
            }
            gv gvVar2 = gv.this;
            long j = gvVar2.f8554t;
            if (j == Long.MIN_VALUE || ((iA != -4 || fbVar.f3178f < j) && !(iA == -3 && gvVar2.fb() == Long.MIN_VALUE && !fbVar.f3181s))) {
                return iA;
            }
            fbVar.a();
            fbVar.w(4);
            this.f8557v = true;
            return -4;
        }

        @Override // ur.en
        public boolean isReady() {
            return !gv.this.w() && this.y.isReady();
        }

        @Override // ur.en
        public void n3() throws IOException {
            this.y.n3();
        }

        @Override // ur.en
        public int w(long j) {
            if (gv.this.w()) {
                return -3;
            }
            return this.y.w(j);
        }

        public void y() {
            this.f8557v = false;
        }
    }

    public gv(d0 d0Var, boolean z, long j, long j4) {
        this.y = d0Var;
        this.f8553s = z ? j : -9223372036854775807L;
        this.f8551f = j;
        this.f8554t = j4;
    }

    public static boolean r(long j, n0.c[] cVarArr) {
        if (j != 0) {
            for (n0.c cVar : cVarArr) {
                if (cVar != null) {
                    g gVarMt = cVar.mt();
                    if (!v0.n.y(gVarMt.f3, gVarMt.f4778co)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // ur.d0
    public void c5(d0.y yVar, long j) {
        this.f8555v = yVar;
        this.y.c5(this, j);
    }

    @Override // ur.d0
    public void co(long j, boolean z) {
        this.y.co(j, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // ur.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long f(n0.c[] r13, boolean[] r14, ur.en[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            ur.gv$y[] r2 = new ur.gv.y[r2]
            r0.f8552fb = r2
            int r2 = r1.length
            ur.en[] r9 = new ur.en[r2]
            r10 = 0
            r2 = 0
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            ur.gv$y[] r3 = r0.f8552fb
            r4 = r1[r2]
            ur.gv$y r4 = (ur.gv.y) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            ur.en r11 = r4.y
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            ur.d0 r2 = r0.y
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.f(r3, r4, r5, r6, r7)
            boolean r4 = r12.w()
            if (r4 == 0) goto L43
            long r4 = r0.f8551f
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            r6 = r13
            boolean r4 = r(r4, r13)
            if (r4 == 0) goto L43
            r4 = r2
            goto L48
        L43:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            r0.f8553s = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L63
            long r4 = r0.f8551f
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L61
            long r4 = r0.f8554t
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L63
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L61
            goto L63
        L61:
            r4 = 0
            goto L64
        L63:
            r4 = 1
        L64:
            v0.y.fb(r4)
        L67:
            int r4 = r1.length
            if (r10 >= r4) goto L8d
            r4 = r9[r10]
            if (r4 != 0) goto L73
            ur.gv$y[] r4 = r0.f8552fb
            r4[r10] = r11
            goto L84
        L73:
            ur.gv$y[] r5 = r0.f8552fb
            r6 = r5[r10]
            if (r6 == 0) goto L7d
            ur.en r6 = r6.y
            if (r6 == r4) goto L84
        L7d:
            ur.gv$y r6 = new ur.gv$y
            r6.<init>(r4)
            r5[r10] = r6
        L84:
            ur.gv$y[] r4 = r0.f8552fb
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L67
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ur.gv.f(n0.c[], boolean[], ur.en[], boolean[], long):long");
    }

    @Override // ur.d0, ur.jz
    public long fb() {
        long jFb = this.y.fb();
        if (jFb != Long.MIN_VALUE) {
            long j = this.f8554t;
            if (j == Long.MIN_VALUE || jFb < j) {
                return jFb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // ur.d0
    public long gv(long j, p1 p1Var) {
        long j4 = this.f8551f;
        if (j == j4) {
            return j4;
        }
        return this.y.gv(j, n3(j, p1Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // ur.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long i9(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f8553s = r0
            ur.gv$y[] r0 = r6.f8552fb
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.y()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            ur.d0 r0 = r6.y
            long r0 = r0.i9(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L34
            long r7 = r6.f8551f
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L35
            long r7 = r6.f8554t
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L34
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L35
        L34:
            r2 = 1
        L35:
            v0.y.fb(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ur.gv.i9(long):long");
    }

    @Override // ur.d0
    public lc mt() {
        return this.y.mt();
    }

    public final p1 n3(long j, p1 p1Var) {
        long jMt = v0.ut.mt(p1Var.y, 0L, j - this.f8551f);
        long j4 = p1Var.n3;
        long j7 = this.f8554t;
        long jMt2 = v0.ut.mt(j4, 0L, j7 == Long.MIN_VALUE ? Long.MAX_VALUE : j7 - j);
        return (jMt == p1Var.y && jMt2 == p1Var.n3) ? p1Var : new p1(jMt, jMt2);
    }

    @Override // ur.jz.y
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void a(d0 d0Var) {
        ((d0.y) v0.y.v(this.f8555v)).a(this);
    }

    @Override // ur.d0, ur.jz
    public void s(long j) {
        this.y.s(j);
    }

    @Override // ur.d0
    public long t() {
        if (w()) {
            long j = this.f8553s;
            this.f8553s = -9223372036854775807L;
            long jT = t();
            return jT != -9223372036854775807L ? jT : j;
        }
        long jT2 = this.y.t();
        if (jT2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        v0.y.fb(jT2 >= this.f8551f);
        long j4 = this.f8554t;
        v0.y.fb(j4 == Long.MIN_VALUE || jT2 <= j4);
        return jT2;
    }

    @Override // ur.d0, ur.jz
    public boolean v(long j) {
        return this.y.v(j);
    }

    public boolean w() {
        return this.f8553s != -9223372036854775807L;
    }

    @Override // ur.d0
    public void wz() throws IOException {
        v.n3 n3Var = this.w;
        if (n3Var != null) {
            throw n3Var;
        }
        this.y.wz();
    }

    public void x4(long j, long j4) {
        this.f8551f = j;
        this.f8554t = j4;
    }

    @Override // ur.d0.y
    public void xc(d0 d0Var) {
        if (this.w != null) {
            return;
        }
        ((d0.y) v0.y.v(this.f8555v)).xc(this);
    }

    @Override // ur.d0, ur.jz
    public boolean y() {
        return this.y.y();
    }

    public void z(v.n3 n3Var) {
        this.w = n3Var;
    }

    @Override // ur.d0, ur.jz
    public long zn() {
        long jZn = this.y.zn();
        if (jZn != Long.MIN_VALUE) {
            long j = this.f8554t;
            if (j == Long.MIN_VALUE || jZn < j) {
                return jZn;
            }
        }
        return Long.MIN_VALUE;
    }
}
