package ur;

import androidx.annotation.Nullable;
import ft.xb;
import ft.xq;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ur.mg;

/* JADX INFO: loaded from: classes.dex */
public final class yt extends fb<Integer> {

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public static final xb f8682j5 = new xb.zn().gv("MergingMediaSource").y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[][] f8683b;
    public final xq[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Object, Long> f8684d;
    public final ArrayList<mg> d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final k4.d<Object, gv> f8685ej;
    public final boolean f3;
    public final c5 fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    @Nullable
    public n3 f8686hw;
    public final mg[] n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f8687r;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8688x;

    public static final class n3 extends IOException {
        public final int reason;

        public n3(int i) {
            this.reason = i;
        }
    }

    public static final class y extends r {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final long[] f8689p;
        public final long[] w;

        public y(xq xqVar, Map<Object, Long> map) {
            super(xqVar);
            int iZ = xqVar.z();
            this.f8689p = new long[xqVar.z()];
            xq.gv gvVar = new xq.gv();
            for (int i = 0; i < iZ; i++) {
                this.f8689p[i] = xqVar.mt(i, gvVar).c;
            }
            int iTl = xqVar.tl();
            this.w = new long[iTl];
            xq.n3 n3Var = new xq.n3();
            for (int i5 = 0; i5 < iTl; i5++) {
                xqVar.f(i5, n3Var, true);
                long jLongValue = ((Long) v0.y.v(map.get(n3Var.f5175v))).longValue();
                long[] jArr = this.w;
                jLongValue = jLongValue == Long.MIN_VALUE ? n3Var.f5173s : jLongValue;
                jArr[i5] = jLongValue;
                long j = n3Var.f5173s;
                if (j != -9223372036854775807L) {
                    long[] jArr2 = this.f8689p;
                    int i8 = n3Var.f5172fb;
                    jArr2[i8] = jArr2[i8] - (j - jLongValue);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // ur.r, ft.xq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ft.xq.gv co(int r5, ft.xq.gv r6, long r7) {
            /*
                r4 = this;
                super.co(r5, r6, r7)
                long[] r7 = r4.f8689p
                r0 = r7[r5]
                r6.c = r0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r5 == 0) goto L1e
                long r2 = r6.n
                int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r5 != 0) goto L19
                goto L1e
            L19:
                long r7 = java.lang.Math.min(r2, r0)
                goto L20
            L1e:
                long r7 = r6.n
            L20:
                r6.n = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ur.yt.y.co(int, ft.xq$gv, long):ft.xq$gv");
        }

        @Override // ur.r, ft.xq
        public xq.n3 f(int i, xq.n3 n3Var, boolean z) {
            super.f(i, n3Var, z);
            n3Var.f5173s = this.w[i];
            return n3Var;
        }
    }

    public yt(mg... mgVarArr) {
        this(false, mgVarArr);
    }

    @Override // ur.fb, ur.y
    public void ap() {
        super.ap();
        Arrays.fill(this.c, (Object) null);
        this.f8688x = -1;
        this.f8686hw = null;
        this.d0.clear();
        Collections.addAll(this.d0, this.n);
    }

    @Override // ur.mg
    public xb c() {
        mg[] mgVarArr = this.n;
        return mgVarArr.length > 0 ? mgVarArr[0].c() : f8682j5;
    }

    public final void cr() {
        xq[] xqVarArr;
        xq.n3 n3Var = new xq.n3();
        for (int i = 0; i < this.f8688x; i++) {
            long j = Long.MIN_VALUE;
            int i5 = 0;
            while (true) {
                xqVarArr = this.c;
                if (i5 >= xqVarArr.length) {
                    break;
                }
                long jTl = xqVarArr[i5].i9(i, n3Var).tl();
                if (jTl != -9223372036854775807L) {
                    long j4 = jTl + this.f8683b[i][i5];
                    if (j == Long.MIN_VALUE || j4 < j) {
                        j = j4;
                    }
                }
                i5++;
            }
            Object objP = xqVarArr[0].p(i);
            this.f8684d.put(objP, Long.valueOf(j));
            Iterator<gv> it = this.f8685ej.get(objP).iterator();
            while (it.hasNext()) {
                it.next().x4(0L, j);
            }
        }
    }

    @Override // ur.mg
    public void d(d0 d0Var) {
        if (this.f3) {
            gv gvVar = (gv) d0Var;
            Iterator<Map.Entry<Object, gv>> it = this.f8685ej.y().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, gv> next = it.next();
                if (next.getValue().equals(gvVar)) {
                    this.f8685ej.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            d0Var = gvVar.y;
        }
        k5 k5Var = (k5) d0Var;
        int i = 0;
        while (true) {
            mg[] mgVarArr = this.n;
            if (i >= mgVarArr.length) {
                return;
            }
            mgVarArr[i].d(k5Var.n3(i));
            i++;
        }
    }

    @Override // ur.fb, ur.y
    public void e(@Nullable r0.o oVar) {
        super.e(oVar);
        for (int i = 0; i < this.n.length; i++) {
            bk(Integer.valueOf(i), this.n[i]);
        }
    }

    @Override // ur.fb, ur.mg
    public void oz() throws IOException {
        n3 n3Var = this.f8686hw;
        if (n3Var != null) {
            throw n3Var;
        }
        super.oz();
    }

    @Override // ur.fb
    /* JADX INFO: renamed from: pq, reason: merged with bridge method [inline-methods] */
    public void g(Integer num, mg mgVar, xq xqVar) {
        if (this.f8686hw != null) {
            return;
        }
        if (this.f8688x == -1) {
            this.f8688x = xqVar.tl();
        } else if (xqVar.tl() != this.f8688x) {
            this.f8686hw = new n3(0);
            return;
        }
        if (this.f8683b.length == 0) {
            this.f8683b = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f8688x, this.c.length);
        }
        this.d0.remove(mgVar);
        this.c[num.intValue()] = xqVar;
        if (this.d0.isEmpty()) {
            if (this.f8687r) {
                tg();
            }
            xq yVar = this.c[0];
            if (this.f3) {
                cr();
                yVar = new y(yVar, this.f8684d);
            }
            s8(yVar);
        }
    }

    @Override // ur.fb
    @Nullable
    /* JADX INFO: renamed from: pz, reason: merged with bridge method [inline-methods] */
    public mg.n3 rb(Integer num, mg.n3 n3Var) {
        if (num.intValue() == 0) {
            return n3Var;
        }
        return null;
    }

    public final void tg() {
        xq.n3 n3Var = new xq.n3();
        for (int i = 0; i < this.f8688x; i++) {
            long j = -this.c[0].i9(i, n3Var).p();
            int i5 = 1;
            while (true) {
                xq[] xqVarArr = this.c;
                if (i5 < xqVarArr.length) {
                    this.f8683b[i][i5] = j - (-xqVarArr[i5].i9(i, n3Var).p());
                    i5++;
                }
            }
        }
    }

    @Override // ur.mg
    public d0 zn(mg.n3 n3Var, r0.n3 n3Var2, long j) {
        int length = this.n.length;
        d0[] d0VarArr = new d0[length];
        int iA = this.c[0].a(n3Var.y);
        for (int i = 0; i < length; i++) {
            d0VarArr[i] = this.n[i].zn(n3Var.zn(this.c[i].p(iA)), n3Var2, j - this.f8683b[iA][i]);
        }
        k5 k5Var = new k5(this.fh, this.f8683b[iA], d0VarArr);
        if (!this.f3) {
            return k5Var;
        }
        gv gvVar = new gv(k5Var, true, 0L, ((Long) v0.y.v(this.f8684d.get(n3Var.y))).longValue());
        this.f8685ej.put(n3Var.y, gvVar);
        return gvVar;
    }

    public yt(boolean z, mg... mgVarArr) {
        this(z, false, mgVarArr);
    }

    public yt(boolean z, boolean z5, mg... mgVarArr) {
        this(z, z5, new t(), mgVarArr);
    }

    public yt(boolean z, boolean z5, c5 c5Var, mg... mgVarArr) {
        this.f8687r = z;
        this.f3 = z5;
        this.n = mgVarArr;
        this.fh = c5Var;
        this.d0 = new ArrayList<>(Arrays.asList(mgVarArr));
        this.f8688x = -1;
        this.c = new xq[mgVarArr.length];
        this.f8683b = new long[0][];
        this.f8684d = new HashMap();
        this.f8685ej = k4.z6.y().y().v();
    }
}
