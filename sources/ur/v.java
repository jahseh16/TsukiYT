package ur;

import androidx.annotation.Nullable;
import ft.xq;
import java.io.IOException;
import java.util.ArrayList;
import ur.mg;

/* JADX INFO: loaded from: classes.dex */
public final class v extends ra {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public y f8643b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8644d;
    public final boolean d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final ArrayList<gv> f8645ej;
    public final boolean fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    @Nullable
    public n3 f8646hw;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public long f8647j5;
    public final long n;
    public long qn;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final xq.gv f8648x;

    public static final class n3 extends IOException {
        public final int reason;

        public n3(int i) {
            super("Illegal clipping: " + y(i));
            this.reason = i;
        }

        public static String y(int i) {
            return i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public static final class y extends r {

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public final long f8649co;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final long f8650p;
        public final long w;
        public final boolean z;

        public y(xq xqVar, long j, long j4) throws n3 {
            super(xqVar);
            boolean z = false;
            if (xqVar.tl() != 1) {
                throw new n3(0);
            }
            xq.gv gvVarMt = xqVar.mt(0, new xq.gv());
            long jMax = Math.max(0L, j);
            if (!gvVarMt.f3 && jMax != 0 && !gvVarMt.f5163p) {
                throw new n3(1);
            }
            long jMax2 = j4 == Long.MIN_VALUE ? gvVarMt.c : Math.max(0L, j4);
            long j7 = gvVarMt.c;
            if (j7 != -9223372036854775807L) {
                jMax2 = jMax2 > j7 ? j7 : jMax2;
                if (jMax > jMax2) {
                    throw new n3(2);
                }
            }
            this.w = jMax;
            this.f8650p = jMax2;
            this.f8649co = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (gvVarMt.f5159co && (jMax2 == -9223372036854775807L || (j7 != -9223372036854775807L && jMax2 == j7))) {
                z = true;
            }
            this.z = z;
        }

        @Override // ur.r, ft.xq
        public xq.gv co(int i, xq.gv gvVar, long j) {
            this.f8632t.co(0, gvVar, 0L);
            long j4 = gvVar.f5160d;
            long j7 = this.w;
            gvVar.f5160d = j4 + j7;
            gvVar.c = this.f8649co;
            gvVar.f5159co = this.z;
            long j8 = gvVar.n;
            if (j8 != -9223372036854775807L) {
                long jMax = Math.max(j8, j7);
                gvVar.n = jMax;
                long j9 = this.f8650p;
                if (j9 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j9);
                }
                gvVar.n = jMax - this.w;
            }
            long jGf = v0.ut.gf(this.w);
            long j10 = gvVar.f5161f;
            if (j10 != -9223372036854775807L) {
                gvVar.f5161f = j10 + jGf;
            }
            long j11 = gvVar.f5166t;
            if (j11 != -9223372036854775807L) {
                gvVar.f5166t = j11 + jGf;
            }
            return gvVar;
        }

        @Override // ur.r, ft.xq
        public xq.n3 f(int i, xq.n3 n3Var, boolean z) {
            this.f8632t.f(0, n3Var, z);
            long jP = n3Var.p() - this.w;
            long j = this.f8649co;
            return n3Var.r(n3Var.y, n3Var.f5175v, 0, j == -9223372036854775807L ? -9223372036854775807L : j - jP, jP);
        }
    }

    public v(mg mgVar, long j, long j4, boolean z, boolean z5, boolean z7) {
        super((mg) v0.y.v(mgVar));
        v0.y.y(j >= 0);
        this.n = j;
        this.c = j4;
        this.d0 = z;
        this.fh = z5;
        this.f8644d = z7;
        this.f8645ej = new ArrayList<>();
        this.f8648x = new xq.gv();
    }

    @Override // ur.fb, ur.y
    public void ap() {
        super.ap();
        this.f8646hw = null;
        this.f8643b = null;
    }

    @Override // ur.mg
    public void d(d0 d0Var) {
        v0.y.fb(this.f8645ej.remove(d0Var));
        this.f8633r.d(((gv) d0Var).y);
        if (!this.f8645ej.isEmpty() || this.fh) {
            return;
        }
        qj(((y) v0.y.v(this.f8643b)).f8632t);
    }

    @Override // ur.fb, ur.mg
    public void oz() throws IOException {
        n3 n3Var = this.f8646hw;
        if (n3Var != null) {
            throw n3Var;
        }
        super.oz();
    }

    public final void qj(xq xqVar) {
        long j;
        long j4;
        xqVar.mt(0, this.f8648x);
        long jFb = this.f8648x.fb();
        if (this.f8643b == null || this.f8645ej.isEmpty() || this.fh) {
            long j7 = this.n;
            long j8 = this.c;
            if (this.f8644d) {
                long jV = this.f8648x.v();
                j7 += jV;
                j8 += jV;
            }
            this.f8647j5 = jFb + j7;
            this.qn = this.c != Long.MIN_VALUE ? jFb + j8 : Long.MIN_VALUE;
            int size = this.f8645ej.size();
            for (int i = 0; i < size; i++) {
                this.f8645ej.get(i).x4(this.f8647j5, this.qn);
            }
            j = j7;
            j4 = j8;
        } else {
            long j9 = this.f8647j5 - jFb;
            j4 = this.c != Long.MIN_VALUE ? this.qn - jFb : Long.MIN_VALUE;
            j = j9;
        }
        try {
            y yVar = new y(xqVar, j, j4);
            this.f8643b = yVar;
            s8(yVar);
        } catch (n3 e4) {
            this.f8646hw = e4;
            for (int i5 = 0; i5 < this.f8645ej.size(); i5++) {
                this.f8645ej.get(i5).z(this.f8646hw);
            }
        }
    }

    @Override // ur.ra
    public void wf(xq xqVar) {
        if (this.f8646hw != null) {
            return;
        }
        qj(xqVar);
    }

    @Override // ur.mg
    public d0 zn(mg.n3 n3Var, r0.n3 n3Var2, long j) {
        gv gvVar = new gv(this.f8633r.zn(n3Var, n3Var2, j), this.d0, this.f8647j5, this.qn);
        this.f8645ej.add(gvVar);
        return gvVar;
    }
}
