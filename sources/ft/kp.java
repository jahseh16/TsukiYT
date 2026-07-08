package ft;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.gv;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.remoteconfig.internal.Code;
import ft.h;
import ft.hk;
import ft.ne;
import ft.t;
import ft.xb;
import ft.xq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k4.r;
import n0.ud;
import ur.d0;
import ur.mg;

/* JADX INFO: loaded from: classes.dex */
public final class kp implements Handler.Callback, d0.y, ud.y, ne.gv, t.y, h.y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne f4893b;
    public final boolean c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    @Nullable
    public final HandlerThread f4894co;

    @Nullable
    public s ct;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v0.v f4895d;
    public final t d0;
    public int dm;

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    public boolean f4896eb;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final a f4897ej;
    public int en;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0.a8 f4898f;
    public final xq.n3 f3;
    public boolean f7;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final ic[] f4899fb;
    public final ArrayList<gv> fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public final pq f4900hw;
    public v j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public final long f4901j5;
    public boolean jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4902k;

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    @Nullable
    public p f4903lc;
    public final long n;

    /* JADX INFO: renamed from: nf, reason: collision with root package name */
    public long f4904nf;
    public fc o;
    public long o4;
    public boolean oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v0.p f4905p;
    public boolean q9;
    public p1 qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xq.gv f4906r;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public long f4907ra = -9223372036854775807L;
    public int rs;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n0.ud f4908s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cr f4909t;
    public boolean u;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public boolean f4910ut;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Set<hk> f4911v;
    public final r0.a w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final oa f4912x;
    public boolean xg;
    public final hk[] y;
    public boolean y5;
    public final Looper z;

    public interface a {
        void y(v vVar);
    }

    public static final class fb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f4913a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final boolean f4914gv;
        public final long n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f4915v;
        public final mg.n3 y;
        public final long zn;

        public fb(mg.n3 n3Var, long j, long j4, boolean z, boolean z5, boolean z7) {
            this.y = n3Var;
            this.n3 = j;
            this.zn = j4;
            this.f4914gv = z;
            this.f4915v = z5;
            this.f4913a = z7;
        }
    }

    public static final class gv implements Comparable<gv> {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public long f4916fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public Object f4917s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f4918v;
        public final h y;

        public gv(h hVar) {
            this.y = hVar;
        }

        public void n3(int i, long j, Object obj) {
            this.f4918v = i;
            this.f4916fb = j;
            this.f4917s = obj;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public int compareTo(gv gvVar) {
            Object obj = this.f4917s;
            if ((obj == null) != (gvVar.f4917s == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.f4918v - gvVar.f4918v;
            return i != 0 ? i : v0.ut.xc(this.f4916fb, gvVar.f4916fb);
        }
    }

    public static final class n3 {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final long f4919gv;
        public final ur.u n3;
        public final List<ne.zn> y;
        public final int zn;

        public /* synthetic */ n3(List list, ur.u uVar, int i, long j, y yVar) {
            this(list, uVar, i, j);
        }

        public n3(List<ne.zn> list, ur.u uVar, int i, long j) {
            this.y = list;
            this.n3 = uVar;
            this.zn = i;
            this.f4919gv = j;
        }
    }

    public static final class s {
        public final int n3;
        public final xq y;
        public final long zn;

        public s(xq xqVar, int i, long j) {
            this.y = xqVar;
            this.n3 = i;
            this.zn = j;
        }
    }

    public static final class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f4920a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f4921fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public boolean f4922gv;
        public fc n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f4923v;
        public boolean y;
        public int zn;

        public v(fc fcVar) {
            this.n3 = fcVar;
        }

        public void gv(fc fcVar) {
            this.y |= this.n3 != fcVar;
            this.n3 = fcVar;
        }

        public void n3(int i) {
            this.y |= i > 0;
            this.zn += i;
        }

        public void v(int i) {
            if (this.f4922gv && this.f4923v != 5) {
                v0.y.y(i == 5);
                return;
            }
            this.y = true;
            this.f4922gv = true;
            this.f4923v = i;
        }

        public void zn(int i) {
            this.y = true;
            this.f4920a = true;
            this.f4921fb = i;
        }
    }

    public class y implements hk.y {
        public y() {
        }

        @Override // ft.hk.y
        public void n3() {
            kp.this.f4905p.i9(2);
        }

        @Override // ft.hk.y
        public void y() {
            kp.this.y5 = true;
        }
    }

    public static class zn {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final ur.u f4924gv;
        public final int n3;
        public final int y;
        public final int zn;
    }

    public kp(hk[] hkVarArr, n0.ud udVar, n0.a8 a8Var, cr crVar, r0.a aVar, int i, boolean z, zo.y yVar, p1 p1Var, pq pqVar, long j, boolean z5, Looper looper, v0.v vVar, a aVar2, zo.gn gnVar, Looper looper2) {
        this.f4897ej = aVar2;
        this.y = hkVarArr;
        this.f4908s = udVar;
        this.f4898f = a8Var;
        this.f4909t = crVar;
        this.w = aVar;
        this.en = i;
        this.jz = z;
        this.qn = p1Var;
        this.f4900hw = pqVar;
        this.f4901j5 = j;
        this.f4904nf = j;
        this.f4910ut = z5;
        this.f4895d = vVar;
        this.n = crVar.n3();
        this.c = crVar.y();
        fc fcVarI9 = fc.i9(a8Var);
        this.o = fcVarI9;
        this.j = new v(fcVarI9);
        this.f4899fb = new ic[hkVarArr.length];
        for (int i5 = 0; i5 < hkVarArr.length; i5++) {
            hkVarArr[i5].x4(i5, gnVar);
            this.f4899fb[i5] = hkVarArr[i5].gv();
        }
        this.d0 = new t(this, vVar);
        this.fh = new ArrayList<>();
        this.f4911v = k4.oz.s();
        this.f4906r = new xq.gv();
        this.f3 = new xq.n3();
        udVar.a(this, aVar);
        this.f4896eb = true;
        v0.p pVarN3 = vVar.n3(looper, null);
        this.f4912x = new oa(yVar, pVarN3);
        this.f4893b = new ne(this, yVar, pVarN3, gnVar);
        if (looper2 != null) {
            this.f4894co = null;
            this.z = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.f4894co = handlerThread;
            handlerThread.start();
            this.z = handlerThread.getLooper();
        }
        this.f4905p = vVar.n3(this.z, this);
    }

    @Nullable
    public static Pair<Object, Long> bk(xq xqVar, s sVar, boolean z, int i, boolean z5, xq.gv gvVar, xq.n3 n3Var) {
        Pair<Object, Long> pairWz;
        Object objY4;
        xq xqVar2 = sVar.y;
        if (xqVar.r()) {
            return null;
        }
        xq xqVar3 = xqVar2.r() ? xqVar : xqVar2;
        try {
            pairWz = xqVar3.wz(gvVar, n3Var, sVar.n3, sVar.zn);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (xqVar.equals(xqVar3)) {
            return pairWz;
        }
        if (xqVar.a(pairWz.first) != -1) {
            return (xqVar3.t(pairWz.first, n3Var).f5174t && xqVar3.mt(n3Var.f5172fb, gvVar).d0 == xqVar3.a(pairWz.first)) ? xqVar.wz(gvVar, n3Var, xqVar.t(pairWz.first, n3Var).f5172fb, sVar.zn) : pairWz;
        }
        if (z && (objY4 = y4(gvVar, n3Var, i, z5, pairWz.first, xqVar3, xqVar)) != null) {
            return xqVar.wz(gvVar, n3Var, xqVar.t(objY4, n3Var).f5172fb, -9223372036854775807L);
        }
        return null;
    }

    public static g[] f3(n0.c cVar) {
        int length = cVar != null ? cVar.length() : 0;
        g[] gVarArr = new g[length];
        for (int i = 0; i < length; i++) {
            gVarArr[i] = cVar.v(i);
        }
        return gVarArr;
    }

    public static void g3(xq xqVar, gv gvVar, xq.gv gvVar2, xq.n3 n3Var) {
        int i = xqVar.mt(xqVar.t(gvVar.f4917s, n3Var).f5172fb, gvVar2).fh;
        Object obj = xqVar.f(i, n3Var, true).f5175v;
        long j = n3Var.f5173s;
        gvVar.n3(i, j != -9223372036854775807L ? j - 1 : Long.MAX_VALUE, obj);
    }

    public static boolean j5(hk hkVar) {
        return hkVar.getState() != 0;
    }

    public static boolean m(gv gvVar, xq xqVar, xq xqVar2, int i, boolean z, xq.gv gvVar2, xq.n3 n3Var) {
        Object obj = gvVar.f4917s;
        if (obj == null) {
            Pair<Object, Long> pairBk = bk(xqVar, new s(gvVar.y.s(), gvVar.y.gv(), gvVar.y.a() == Long.MIN_VALUE ? -9223372036854775807L : v0.ut.xb(gvVar.y.a())), false, i, z, gvVar2, n3Var);
            if (pairBk == null) {
                return false;
            }
            gvVar.n3(xqVar.a(pairBk.first), ((Long) pairBk.second).longValue(), pairBk.first);
            if (gvVar.y.a() == Long.MIN_VALUE) {
                g3(xqVar, gvVar, gvVar2, n3Var);
            }
            return true;
        }
        int iA = xqVar.a(obj);
        if (iA == -1) {
            return false;
        }
        if (gvVar.y.a() == Long.MIN_VALUE) {
            g3(xqVar, gvVar, gvVar2, n3Var);
            return true;
        }
        gvVar.f4918v = iA;
        xqVar2.t(gvVar.f4917s, n3Var);
        if (n3Var.f5174t && xqVar2.mt(n3Var.f5172fb, gvVar2).d0 == xqVar2.a(gvVar.f4917s)) {
            Pair<Object, Long> pairWz = xqVar.wz(gvVar2, n3Var, xqVar.t(gvVar.f4917s, n3Var).f5172fb, gvVar.f4916fb + n3Var.p());
            gvVar.n3(xqVar.a(pairWz.first), ((Long) pairWz.second).longValue(), pairWz.first);
        }
        return true;
    }

    public static boolean o(fc fcVar, xq.n3 n3Var) {
        mg.n3 n3Var2 = fcVar.n3;
        xq xqVar = fcVar.y;
        return xqVar.r() || xqVar.t(n3Var2.y, n3Var).f5174t;
    }

    private void ra() {
        yc(true, false, true, false);
        this.f4909t.fb();
        j3(1);
        HandlerThread handlerThread = this.f4894co;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.oz = true;
            notifyAll();
        }
    }

    public static fb u0(xq xqVar, fc fcVar, @Nullable s sVar, oa oaVar, int i, boolean z, xq.gv gvVar, xq.n3 n3Var) {
        int i5;
        mg.n3 n3Var2;
        long jLongValue;
        int i8;
        boolean z5;
        boolean z7;
        boolean z8;
        int iV;
        int iV2;
        boolean z9;
        oa oaVar2;
        long j;
        int i10;
        boolean z10;
        int iV3;
        boolean z11;
        boolean z12;
        if (xqVar.r()) {
            return new fb(fc.f(), 0L, -9223372036854775807L, false, true, false);
        }
        mg.n3 n3Var3 = fcVar.n3;
        Object obj = n3Var3.y;
        boolean zO = o(fcVar, n3Var);
        long j4 = (fcVar.n3.n3() || zO) ? fcVar.zn : fcVar.f4748mt;
        if (sVar != null) {
            i5 = -1;
            Pair<Object, Long> pairBk = bk(xqVar, sVar, true, i, z, gvVar, n3Var);
            if (pairBk == null) {
                iV3 = xqVar.v(z);
                jLongValue = j4;
                z10 = false;
                z11 = false;
                z12 = true;
            } else {
                if (sVar.zn == -9223372036854775807L) {
                    iV3 = xqVar.t(pairBk.first, n3Var).f5172fb;
                    jLongValue = j4;
                    z10 = false;
                } else {
                    obj = pairBk.first;
                    jLongValue = ((Long) pairBk.second).longValue();
                    z10 = true;
                    iV3 = -1;
                }
                z11 = fcVar.f4753v == 4;
                z12 = false;
            }
            z8 = z10;
            z5 = z11;
            z7 = z12;
            i8 = iV3;
            n3Var2 = n3Var3;
        } else {
            i5 = -1;
            if (fcVar.y.r()) {
                iV = xqVar.v(z);
            } else if (xqVar.a(obj) == -1) {
                Object objY4 = y4(gvVar, n3Var, i, z, obj, fcVar.y, xqVar);
                if (objY4 == null) {
                    iV2 = xqVar.v(z);
                    z9 = true;
                } else {
                    iV2 = xqVar.t(objY4, n3Var).f5172fb;
                    z9 = false;
                }
                i8 = iV2;
                z7 = z9;
                jLongValue = j4;
                n3Var2 = n3Var3;
                z5 = false;
                z8 = false;
            } else if (j4 == -9223372036854775807L) {
                iV = xqVar.t(obj, n3Var).f5172fb;
            } else if (zO) {
                n3Var2 = n3Var3;
                fcVar.y.t(n3Var2.y, n3Var);
                if (fcVar.y.mt(n3Var.f5172fb, gvVar).d0 == fcVar.y.a(n3Var2.y)) {
                    Pair<Object, Long> pairWz = xqVar.wz(gvVar, n3Var, xqVar.t(obj, n3Var).f5172fb, j4 + n3Var.p());
                    obj = pairWz.first;
                    jLongValue = ((Long) pairWz.second).longValue();
                } else {
                    jLongValue = j4;
                }
                i8 = -1;
                z5 = false;
                z7 = false;
                z8 = true;
            } else {
                n3Var2 = n3Var3;
                jLongValue = j4;
                i8 = -1;
                z5 = false;
                z7 = false;
                z8 = false;
            }
            i8 = iV;
            jLongValue = j4;
            n3Var2 = n3Var3;
            z5 = false;
            z7 = false;
            z8 = false;
        }
        if (i8 != i5) {
            Pair<Object, Long> pairWz2 = xqVar.wz(gvVar, n3Var, i8, -9223372036854775807L);
            obj = pairWz2.first;
            jLongValue = ((Long) pairWz2.second).longValue();
            oaVar2 = oaVar;
            j = -9223372036854775807L;
        } else {
            oaVar2 = oaVar;
            j = jLongValue;
        }
        mg.n3 n3VarFh = oaVar2.fh(xqVar, obj, jLongValue);
        int i11 = n3VarFh.f8550v;
        boolean z13 = n3Var2.y.equals(obj) && !n3Var2.n3() && !n3VarFh.n3() && (i11 == i5 || ((i10 = n3Var2.f8550v) != i5 && i11 >= i10));
        mg.n3 n3Var4 = n3Var2;
        boolean zVl = vl(zO, n3Var2, j4, n3VarFh, xqVar.t(obj, n3Var), j);
        if (z13 || zVl) {
            n3VarFh = n3Var4;
        }
        if (n3VarFh.n3()) {
            if (n3VarFh.equals(n3Var4)) {
                jLongValue = fcVar.f4748mt;
            } else {
                xqVar.t(n3VarFh.y, n3Var);
                jLongValue = n3VarFh.zn == n3Var.wz(n3VarFh.n3) ? n3Var.i9() : 0L;
            }
        }
        return new fb(n3VarFh, jLongValue, j, z5, z7, z8);
    }

    public static boolean vl(boolean z, mg.n3 n3Var, long j, mg.n3 n3Var2, xq.n3 n3Var3, long j4) {
        if (!z && j == j4 && n3Var.y.equals(n3Var2.y)) {
            return (n3Var.n3() && n3Var3.z(n3Var.n3)) ? (n3Var3.f(n3Var.n3, n3Var.zn) == 4 || n3Var3.f(n3Var.n3, n3Var.zn) == 2) ? false : true : n3Var2.n3() && n3Var3.z(n3Var2.n3);
        }
        return false;
    }

    @Nullable
    public static Object y4(xq.gv gvVar, xq.n3 n3Var, int i, boolean z, Object obj, xq xqVar, xq xqVar2) {
        int iA = xqVar.a(obj);
        int iTl = xqVar.tl();
        int iS = iA;
        int iA2 = -1;
        for (int i5 = 0; i5 < iTl && iA2 == -1; i5++) {
            iS = xqVar.s(iS, n3Var, gvVar, i, z);
            if (iS == -1) {
                break;
            }
            iA2 = xqVar2.a(xqVar.p(iS));
        }
        if (iA2 == -1) {
            return null;
        }
        return xqVar2.p(iA2);
    }

    public final void a8(uo uoVar, float f3, boolean z, boolean z5) throws p {
        if (z) {
            if (z5) {
                this.j.n3(1);
            }
            this.o = this.o.a(uoVar);
        }
        ia(uoVar.y);
        for (hk hkVar : this.y) {
            if (hkVar != null) {
                hkVar.w(f3, uoVar.y);
            }
        }
    }

    public final void ad(h hVar) throws p {
        if (hVar.zn() != this.z) {
            this.f4905p.v(15, hVar).y();
            return;
        }
        t(hVar);
        int i = this.o.f4753v;
        if (i == 3 || i == 2) {
            this.f4905p.i9(2);
        }
    }

    public final boolean ap() throws p {
        l lVarP = this.f4912x.p();
        n0.a8 a8VarXc = lVarP.xc();
        int i = 0;
        boolean z = false;
        while (true) {
            hk[] hkVarArr = this.y;
            if (i >= hkVarArr.length) {
                return !z;
            }
            hk hkVar = hkVarArr[i];
            if (j5(hkVar)) {
                boolean z5 = hkVar.getStream() != lVarP.zn[i];
                if (!a8VarXc.zn(i) || z5) {
                    if (!hkVar.wz()) {
                        hkVar.p(f3(a8VarXc.zn[i]), lVarP.zn[i], lVarP.tl(), lVarP.t());
                    } else if (hkVar.a()) {
                        wz(hkVar);
                    } else {
                        z = true;
                    }
                }
            }
            i++;
        }
    }

    @CheckResult
    public final fc b(mg.n3 n3Var, long j, long j4, long j7, boolean z, int i) {
        List<Metadata> listYt;
        ur.lc lcVar;
        n0.a8 a8Var;
        this.f4896eb = (!this.f4896eb && j == this.o.f4748mt && n3Var.equals(this.o.n3)) ? false : true;
        kp();
        fc fcVar = this.o;
        ur.lc lcVar2 = fcVar.f4750s;
        n0.a8 a8Var2 = fcVar.f4743c5;
        List<Metadata> list = fcVar.f4747i9;
        if (this.f4893b.co()) {
            l lVarW = this.f4912x.w();
            ur.lc lcVarWz = lVarW == null ? ur.lc.f8604s : lVarW.wz();
            n0.a8 a8VarXc = lVarW == null ? this.f4898f : lVarW.xc();
            k4.r<Metadata> rVarX4 = x4(a8VarXc.zn);
            if (lVarW != null) {
                gq gqVar = lVarW.f4925a;
                if (gqVar.zn != j4) {
                    lVarW.f4925a = gqVar.y(j4);
                }
            }
            lcVar = lcVarWz;
            a8Var = a8VarXc;
            listYt = rVarX4;
        } else if (n3Var.equals(this.o.n3)) {
            listYt = list;
            lcVar = lcVar2;
            a8Var = a8Var2;
        } else {
            lcVar = ur.lc.f8604s;
            a8Var = this.f4898f;
            listYt = k4.r.yt();
        }
        if (z) {
            this.j.v(i);
        }
        return this.o.zn(n3Var, j, j4, j7, rz(), lcVar, a8Var, listYt);
    }

    public final void br(boolean z, boolean z5) {
        yc(z || !this.u, false, true, false);
        this.j.n3(z5 ? 1 : 0);
        this.f4909t.v();
        j3(1);
    }

    public final void bv() throws p {
        this.f4902k = false;
        this.d0.fb();
        for (hk hkVar : this.y) {
            if (j5(hkVar)) {
                hkVar.start();
            }
        }
    }

    public final long c() {
        l lVarP = this.f4912x.p();
        if (lVarP == null) {
            return 0L;
        }
        long jT = lVarP.t();
        if (!lVarP.f4929gv) {
            return jT;
        }
        int i = 0;
        while (true) {
            hk[] hkVarArr = this.y;
            if (i >= hkVarArr.length) {
                return jT;
            }
            if (j5(hkVarArr[i]) && this.y[i].getStream() == lVarP.zn[i]) {
                long jZ = this.y[i].z();
                if (jZ == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jT = Math.max(jZ, jT);
            }
            i++;
        }
    }

    public final void c5(n3 n3Var, int i) throws Throwable {
        this.j.n3(1);
        ne neVar = this.f4893b;
        if (i == -1) {
            i = neVar.p();
        }
        ej(neVar.a(i, n3Var.y, n3Var.n3), false);
    }

    public final void c8() throws p {
        l lVarW = this.f4912x.w();
        if (lVarW == null) {
            return;
        }
        long jT = lVarW.f4929gv ? lVarW.y.t() : -9223372036854775807L;
        if (jT != -9223372036854775807L) {
            rb(jT);
            if (jT != this.o.f4748mt) {
                fc fcVar = this.o;
                this.o = b(fcVar.n3, jT, fcVar.zn, jT, true, 5);
            }
        } else {
            long jC5 = this.d0.c5(lVarW != this.f4912x.p());
            this.o4 = jC5;
            long jN = lVarW.n(jC5);
            k(this.o.f4748mt, jN);
            this.o.f4748mt = jN;
        }
        this.o.w = this.f4912x.i9().c5();
        this.o.f4749p = rz();
        fc fcVar2 = this.o;
        if (fcVar2.f4751t && fcVar2.f4753v == 3 && gf(fcVar2.y, fcVar2.n3) && this.o.f4754wz.y == 1.0f) {
            float fY = this.f4900hw.y(i4(), rz());
            if (this.d0.v().y != fY) {
                gq(this.o.f4754wz.gv(fY));
                a8(this.o.f4754wz, this.d0.v().y, false, false);
            }
        }
    }

    public final void co(boolean[] zArr) throws p {
        l lVarP = this.f4912x.p();
        n0.a8 a8VarXc = lVarP.xc();
        for (int i = 0; i < this.y.length; i++) {
            if (!a8VarXc.zn(i) && this.f4911v.remove(this.y[i])) {
                this.y[i].y();
            }
        }
        for (int i5 = 0; i5 < this.y.length; i5++) {
            if (a8VarXc.zn(i5)) {
                p(i5, zArr[i5]);
            }
        }
        lVarP.f4928fb = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab A[Catch: all -> 0x00ae, TryCatch #1 {all -> 0x00ae, blocks: (B:22:0x00a1, B:24:0x00ab, B:29:0x00b5, B:31:0x00bb, B:32:0x00be, B:34:0x00c4, B:36:0x00ce, B:38:0x00d6, B:42:0x00de, B:44:0x00e8, B:46:0x00f8, B:50:0x0102, B:54:0x0114, B:58:0x011d), top: B:74:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cr(ft.kp.s r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ft.kp.cr(ft.kp$s):void");
    }

    public void cs(int i) {
        this.f4905p.s(11, i, 0).y();
    }

    public final void ct(boolean z) {
        for (l lVarW = this.f4912x.w(); lVarW != null; lVarW = lVarW.i9()) {
            for (n0.c cVar : lVarW.xc().zn) {
                if (cVar != null) {
                    cVar.wz(z);
                }
            }
        }
    }

    public final void cy(final h hVar) {
        Looper looperZn = hVar.zn();
        if (looperZn.getThread().isAlive()) {
            this.f4895d.n3(looperZn, null).c5(new Runnable() { // from class: ft.yc
                @Override // java.lang.Runnable
                public final void run() {
                    this.y.oz(hVar);
                }
            });
        } else {
            v0.r.c5("TAG", "Trying to send message on a dead thread.");
            hVar.f(false);
        }
    }

    public final void d(IOException iOException, int i) {
        p pVarR = p.r(iOException, i);
        l lVarW = this.f4912x.w();
        if (lVarW != null) {
            pVarR = pVarR.co(lVarW.f4925a.y);
        }
        v0.r.gv("ExoPlayerImplInternal", "Playback error", pVarR);
        br(false, false);
        this.o = this.o.v(pVarR);
    }

    public final Pair<mg.n3, Long> d0(xq xqVar) {
        if (xqVar.r()) {
            return Pair.create(fc.f(), 0L);
        }
        Pair<Object, Long> pairWz = xqVar.wz(this.f4906r, this.f3, xqVar.v(this.jz), -9223372036854775807L);
        mg.n3 n3VarFh = this.f4912x.fh(xqVar, pairWz.first, 0L);
        long jLongValue = ((Long) pairWz.second).longValue();
        if (n3VarFh.n3()) {
            xqVar.t(n3VarFh.y, this.f3);
            jLongValue = n3VarFh.zn == this.f3.wz(n3VarFh.n3) ? this.f3.i9() : 0L;
        }
        return Pair.create(n3VarFh, Long.valueOf(jLongValue));
    }

    public final void dm() {
        for (l lVarW = this.f4912x.w(); lVarW != null; lVarW = lVarW.i9()) {
            for (n0.c cVar : lVarW.xc().zn) {
                if (cVar != null) {
                    cVar.f();
                }
            }
        }
    }

    public final void e(int i, int i5, ur.u uVar) throws Throwable {
        this.j.n3(1);
        ej(this.f4893b.d0(i, i5, uVar), false);
    }

    public void eb() {
        this.f4905p.n3(0).y();
    }

    /* JADX WARN: Not initialized variable reg: 25, insn: 0x007c: MOVE (r5 I:??[long, double]) = (r25 I:??[long, double]) (LINE:125), block:B:26:0x007b */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ej(ft.xq r28, boolean r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ft.kp.ej(ft.xq, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void en() throws ft.p {
        /*
            r14 = this;
            r0 = 0
            r1 = 0
        L2:
            boolean r2 = r14.ne()
            if (r2 == 0) goto L61
            if (r1 == 0) goto Ld
            r14.q9()
        Ld:
            ft.oa r1 = r14.f4912x
            ft.l r1 = r1.n3()
            java.lang.Object r1 = v0.y.v(r1)
            ft.l r1 = (ft.l) r1
            ft.fc r2 = r14.o
            ur.mg$n3 r2 = r2.n3
            java.lang.Object r2 = r2.y
            ft.gq r3 = r1.f4925a
            ur.mg$n3 r3 = r3.y
            java.lang.Object r3 = r3.y
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L45
            ft.fc r2 = r14.o
            ur.mg$n3 r2 = r2.n3
            int r4 = r2.n3
            r5 = -1
            if (r4 != r5) goto L45
            ft.gq r4 = r1.f4925a
            ur.mg$n3 r4 = r4.y
            int r6 = r4.n3
            if (r6 != r5) goto L45
            int r2 = r2.f8550v
            int r4 = r4.f8550v
            if (r2 == r4) goto L45
            r2 = 1
            goto L46
        L45:
            r2 = 0
        L46:
            ft.gq r1 = r1.f4925a
            ur.mg$n3 r5 = r1.y
            long r10 = r1.n3
            long r8 = r1.zn
            r12 = r2 ^ 1
            r13 = 0
            r4 = r14
            r6 = r10
            ft.fc r1 = r4.b(r5, r6, r8, r10, r12, r13)
            r14.o = r1
            r14.kp()
            r14.c8()
            r1 = 1
            goto L2
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ft.kp.en():void");
    }

    public final void f() throws p {
        pq(true);
    }

    public final void f7() throws p {
        gq gqVarXc;
        this.f4912x.n(this.o4);
        if (this.f4912x.mg() && (gqVarXc = this.f4912x.xc(this.o4, this.o)) != null) {
            l lVarFb = this.f4912x.fb(this.f4899fb, this.f4908s, this.f4909t.gv(), this.f4893b, gqVarXc, this.f4898f);
            lVarFb.y.c5(this, gqVarXc.n3);
            if (this.f4912x.w() == lVarFb) {
                rb(gqVarXc.n3);
            }
            z6(false);
        }
        if (!this.f7) {
            ut();
        } else {
            this.f7 = hw();
            im();
        }
    }

    public void fc() {
        this.f4905p.n3(6).y();
    }

    public Looper fh() {
        return this.z;
    }

    public final void g(xq xqVar, xq xqVar2) {
        if (xqVar.r() && xqVar2.r()) {
            return;
        }
        for (int size = this.fh.size() - 1; size >= 0; size--) {
            if (!m(this.fh.get(size), xqVar, xqVar2, this.en, this.jz, this.f4906r, this.f3)) {
                this.fh.get(size).y.f(false);
                this.fh.remove(size);
            }
        }
        Collections.sort(this.fh);
    }

    public final boolean gf(xq xqVar, mg.n3 n3Var) {
        if (n3Var.n3() || xqVar.r()) {
            return false;
        }
        xqVar.mt(xqVar.t(n3Var.y, this.f3).f5172fb, this.f4906r);
        if (!this.f4906r.s()) {
            return false;
        }
        xq.gv gvVar = this.f4906r;
        return gvVar.f5159co && gvVar.f5166t != -9223372036854775807L;
    }

    public final void gq(uo uoVar) {
        this.f4905p.t(16);
        this.d0.zn(uoVar);
    }

    public final void h(xq xqVar, mg.n3 n3Var, xq xqVar2, mg.n3 n3Var2, long j, boolean z) throws p {
        if (!gf(xqVar, n3Var)) {
            uo uoVar = n3Var.n3() ? uo.f5058s : this.o.f4754wz;
            if (this.d0.v().equals(uoVar)) {
                return;
            }
            gq(uoVar);
            a8(this.o.f4754wz, uoVar.y, false, false);
            return;
        }
        xqVar.mt(xqVar.t(n3Var.y, this.f3).f5172fb, this.f4906r);
        this.f4900hw.gv((xb.fb) v0.ut.i9(this.f4906r.f5164r));
        if (j != -9223372036854775807L) {
            this.f4900hw.v(n(xqVar, n3Var.y, j));
            return;
        }
        if (!v0.ut.zn(!xqVar2.r() ? xqVar2.mt(xqVar2.t(n3Var2.y, this.f3).f5172fb, this.f4906r).y : null, this.f4906r.y) || z) {
            this.f4900hw.v(-9223372036854775807L);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        l lVarP;
        try {
            switch (message.what) {
                case 0:
                    lc();
                    break;
                case 1:
                    q5(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    w();
                    break;
                case 3:
                    cr((s) message.obj);
                    break;
                case 4:
                    le((uo) message.obj);
                    break;
                case 5:
                    yk((p1) message.obj);
                    break;
                case 6:
                    br(false, true);
                    break;
                case 7:
                    ra();
                    return true;
                case 8:
                    ud((ur.d0) message.obj);
                    break;
                case 9:
                    ta((ur.d0) message.obj);
                    break;
                case 10:
                    yg();
                    break;
                case 11:
                    ro(message.arg1);
                    break;
                case Code.UNIMPLEMENTED /* 12 */:
                    i3(message.arg1 != 0);
                    break;
                case 13:
                    l(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    wf((h) message.obj);
                    break;
                case 15:
                    cy((h) message.obj);
                    break;
                case 16:
                    x((uo) message.obj, false);
                    break;
                case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                    vp((n3) message.obj);
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    c5((n3) message.obj, message.arg1);
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    xg((zn) message.obj);
                    break;
                case ConnectionResult.RESTRICTED_PROFILE /* 20 */:
                    e(message.arg1, message.arg2, (ur.u) message.obj);
                    break;
                case 21:
                    vn((ur.u) message.obj);
                    break;
                case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND /* 22 */:
                    y5();
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    w2(message.arg1 != 0);
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    w9(message.arg1 == 1);
                    break;
                case 25:
                    f();
                    break;
                default:
                    return false;
            }
        } catch (gv.y e4) {
            d(e4, e4.errorCode);
        } catch (p e5) {
            e = e5;
            if (e.type == 1 && (lVarP = this.f4912x.p()) != null) {
                e = e.co(lVarP.f4925a.y);
            }
            if (e.isRecoverable && this.f4903lc == null) {
                v0.r.i9("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f4903lc = e;
                v0.p pVar = this.f4905p;
                pVar.y(pVar.v(25, e));
            } else {
                p pVar2 = this.f4903lc;
                if (pVar2 != null) {
                    pVar2.addSuppressed(e);
                    e = this.f4903lc;
                }
                v0.r.gv("ExoPlayerImplInternal", "Playback error", e);
                br(true, false);
                this.o = this.o.v(e);
            }
        } catch (q e6) {
            int i = e6.dataType;
            if (i == 1) {
                i = e6.contentIsMalformed ? 3001 : 3003;
            } else if (i == 4) {
                i = e6.contentIsMalformed ? 3002 : 3004;
            }
            d(e6, i);
        } catch (RuntimeException e8) {
            p pVarN = p.n(e8, ((e8 instanceof IllegalStateException) || (e8 instanceof IllegalArgumentException)) ? 1004 : 1000);
            v0.r.gv("ExoPlayerImplInternal", "Playback error", pVarN);
            br(true, false);
            this.o = this.o.v(pVarN);
        } catch (r0.wz e9) {
            d(e9, e9.reason);
        } catch (ur.n3 e10) {
            d(e10, 1002);
        } catch (IOException e11) {
            d(e11, 2000);
        }
        q9();
        return true;
    }

    public final boolean hw() {
        l lVarI9 = this.f4912x.i9();
        return (lVarI9 == null || lVarI9.f() == Long.MIN_VALUE) ? false : true;
    }

    public void i2(boolean z) {
        this.f4905p.s(12, z ? 1 : 0, 0).y();
    }

    public final void i3(boolean z) throws p {
        this.jz = z;
        if (!this.f4912x.ej(this.o.y, z)) {
            pq(true);
        }
        z6(false);
    }

    public final long i4() {
        fc fcVar = this.o;
        return n(fcVar.y, fcVar.n3.y, fcVar.f4748mt);
    }

    public void i9(int i, List<ne.zn> list, ur.u uVar) {
        this.f4905p.gv(18, i, 0, new n3(list, uVar, -1, -9223372036854775807L, null)).y();
    }

    public final void ia(float f3) {
        for (l lVarW = this.f4912x.w(); lVarW != null; lVarW = lVarW.i9()) {
            for (n0.c cVar : lVarW.xc().zn) {
                if (cVar != null) {
                    cVar.c5(f3);
                }
            }
        }
    }

    public final void im() {
        l lVarI9 = this.f4912x.i9();
        boolean z = this.f7 || (lVarI9 != null && lVarI9.y.y());
        fc fcVar = this.o;
        if (z != fcVar.f4745fb) {
            this.o = fcVar.y(z);
        }
    }

    public void ix(p1 p1Var) {
        this.f4905p.v(5, p1Var).y();
    }

    public final /* synthetic */ Boolean j() {
        return Boolean.valueOf(this.oz);
    }

    public final void j3(int i) {
        fc fcVar = this.o;
        if (fcVar.f4753v != i) {
            if (i != 2) {
                this.f4907ra = -9223372036854775807L;
            }
            this.o = fcVar.fb(i);
        }
    }

    public final void jz() throws p {
        l lVarP = this.f4912x.p();
        if (lVarP == null) {
            return;
        }
        int i = 0;
        if (lVarP.i9() != null && !this.q9) {
            if (yt()) {
                if (lVarP.i9().f4929gv || this.o4 >= lVarP.i9().tl()) {
                    n0.a8 a8VarXc = lVarP.xc();
                    l lVarZn = this.f4912x.zn();
                    n0.a8 a8VarXc2 = lVarZn.xc();
                    xq xqVar = this.o.y;
                    h(xqVar, lVarZn.f4925a.y, xqVar, lVarP.f4925a.y, -9223372036854775807L, false);
                    if (lVarZn.f4929gv && lVarZn.y.t() != -9223372036854775807L) {
                        qk(lVarZn.tl());
                        return;
                    }
                    for (int i5 = 0; i5 < this.y.length; i5++) {
                        boolean zZn = a8VarXc.zn(i5);
                        boolean zZn2 = a8VarXc2.zn(i5);
                        if (zZn && !this.y[i5].wz()) {
                            boolean z = this.f4899fb[i5].s() == -2;
                            gn gnVar = a8VarXc.n3[i5];
                            gn gnVar2 = a8VarXc2.n3[i5];
                            if (!zZn2 || !gnVar2.equals(gnVar) || z) {
                                qj(this.y[i5], lVarZn.tl());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!lVarP.f4925a.f4824c5 && !this.q9) {
            return;
        }
        while (true) {
            hk[] hkVarArr = this.y;
            if (i >= hkVarArr.length) {
                return;
            }
            hk hkVar = hkVarArr[i];
            ur.en enVar = lVarP.zn[i];
            if (enVar != null && hkVar.getStream() == enVar && hkVar.c5()) {
                long j = lVarP.f4925a.f4828v;
                qj(hkVar, (j == -9223372036854775807L || j == Long.MIN_VALUE) ? -9223372036854775807L : lVarP.t() + lVarP.f4925a.f4828v);
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(long r9, long r11) throws ft.p {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ft.kp.k(long, long):void");
    }

    public final boolean k5(hk hkVar, l lVar) {
        l lVarI9 = lVar.i9();
        return lVar.f4925a.f4823a && lVarI9.f4929gv && ((hkVar instanceof b0.p) || (hkVar instanceof com.google.android.exoplayer2.metadata.y) || hkVar.z() >= lVarI9.tl());
    }

    public final void kp() {
        l lVarW = this.f4912x.w();
        this.q9 = lVarW != null && lVarW.f4925a.f4827s && this.f4910ut;
    }

    public final void l(boolean z, @Nullable AtomicBoolean atomicBoolean) {
        if (this.u != z) {
            this.u = z;
            if (!z) {
                for (hk hkVar : this.y) {
                    if (!j5(hkVar) && this.f4911v.remove(hkVar)) {
                        hkVar.y();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void lc() {
        this.j.n3(1);
        yc(false, false, false, true);
        this.f4909t.onPrepared();
        j3(this.o.y.r() ? 4 : 2);
        this.f4893b.i4(this.w.gv());
        this.f4905p.i9(2);
    }

    public final void le(uo uoVar) throws p {
        gq(uoVar);
        x(this.d0.v(), true);
    }

    public final long mg(long j) {
        l lVarI9 = this.f4912x.i9();
        if (lVarI9 == null) {
            return 0L;
        }
        return Math.max(0L, j - lVarI9.n(this.o4));
    }

    public final void mh(ur.lc lcVar, n0.a8 a8Var) {
        this.f4909t.a(this.y, lcVar, a8Var.zn);
    }

    public void mp(uo uoVar) {
        this.f4905p.v(4, uoVar).y();
    }

    public final void mt() throws p {
        co(new boolean[this.y.length]);
    }

    public final long n(xq xqVar, Object obj, long j) {
        xqVar.mt(xqVar.t(obj, this.f3).f5172fb, this.f4906r);
        xq.gv gvVar = this.f4906r;
        if (gvVar.f5166t != -9223372036854775807L && gvVar.s()) {
            xq.gv gvVar2 = this.f4906r;
            if (gvVar2.f5159co) {
                return v0.ut.xb(gvVar2.zn() - this.f4906r.f5166t) - (j + this.f3.p());
            }
        }
        return -9223372036854775807L;
    }

    @Override // ft.ne.gv
    public void n3() {
        this.f4905p.i9(22);
    }

    public final void n7() throws p {
        if (this.o.y.r() || !this.f4893b.co()) {
            return;
        }
        f7();
        jz();
        u();
        en();
    }

    public final boolean nd(boolean z) {
        if (this.dm == 0) {
            return qn();
        }
        if (!z) {
            return false;
        }
        fc fcVar = this.o;
        if (!fcVar.f4745fb) {
            return true;
        }
        long jN3 = gf(fcVar.y, this.f4912x.w().f4925a.y) ? this.f4900hw.n3() : -9223372036854775807L;
        l lVarI9 = this.f4912x.i9();
        return (lVarI9.p() && lVarI9.f4925a.f4824c5) || (lVarI9.f4925a.y.n3() && !lVarI9.f4929gv) || this.f4909t.zn(rz(), this.d0.v().y, this.f4902k, jN3);
    }

    public final boolean ne() {
        l lVarW;
        l lVarI9;
        return wm() && !this.q9 && (lVarW = this.f4912x.w()) != null && (lVarI9 = lVarW.i9()) != null && this.o4 >= lVarI9.tl() && lVarI9.f4928fb;
    }

    public synchronized boolean nf() {
        if (!this.oz && this.z.getThread().isAlive()) {
            this.f4905p.i9(7);
            r6(new g4.r() { // from class: ft.yg
                @Override // g4.r
                public final Object get() {
                    return this.y.j();
                }
            }, this.f4901j5);
            return this.oz;
        }
        return true;
    }

    public final long o0(mg.n3 n3Var, long j, boolean z) throws p {
        return xb(n3Var, j, this.f4912x.w() != this.f4912x.p(), z);
    }

    public final void o4() {
        for (l lVarW = this.f4912x.w(); lVarW != null; lVarW = lVarW.i9()) {
            for (n0.c cVar : lVarW.xc().zn) {
                if (cVar != null) {
                    cVar.r();
                }
            }
        }
    }

    public void oa(List<ne.zn> list, int i, long j, ur.u uVar) {
        this.f4905p.v(17, new n3(list, uVar, i, j, null)).y();
    }

    @Override // ft.t.y
    public void onPlaybackParametersChanged(uo uoVar) {
        this.f4905p.v(16, uoVar).y();
    }

    public final /* synthetic */ void oz(h hVar) {
        try {
            t(hVar);
        } catch (p e4) {
            v0.r.gv("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e4);
            throw new RuntimeException(e4);
        }
    }

    public final void p(int i, boolean z) throws p {
        hk hkVar = this.y[i];
        if (j5(hkVar)) {
            return;
        }
        l lVarP = this.f4912x.p();
        boolean z5 = lVarP == this.f4912x.w();
        n0.a8 a8VarXc = lVarP.xc();
        gn gnVar = a8VarXc.n3[i];
        g[] gVarArrF3 = f3(a8VarXc.zn[i]);
        boolean z7 = wm() && this.o.f4753v == 3;
        boolean z8 = !z && z7;
        this.dm++;
        this.f4911v.add(hkVar);
        hkVar.t(gnVar, gVarArrF3, lVarP.zn[i], this.o4, z8, z5, lVarP.tl(), lVarP.t());
        hkVar.f(11, new y());
        this.d0.n3(hkVar);
        if (z7) {
            hkVar.start();
        }
    }

    public final void pq(boolean z) throws p {
        mg.n3 n3Var = this.f4912x.w().f4925a.y;
        long jXb = xb(n3Var, this.o.f4748mt, true, false);
        if (jXb != this.o.f4748mt) {
            fc fcVar = this.o;
            this.o = b(n3Var, jXb, fcVar.zn, fcVar.f4746gv, z, 5);
        }
    }

    public void pz(xq xqVar, int i, long j) {
        this.f4905p.v(3, new s(xqVar, i, j)).y();
    }

    public final boolean q() {
        if (!hw()) {
            return false;
        }
        l lVarI9 = this.f4912x.i9();
        long jMg = mg(lVarI9.f());
        long jN = lVarI9 == this.f4912x.w() ? lVarI9.n(this.o4) : lVarI9.n(this.o4) - lVarI9.f4925a.n3;
        boolean zS = this.f4909t.s(jN, jMg, this.d0.v().y);
        if (zS || jMg >= 500000) {
            return zS;
        }
        if (this.n <= 0 && !this.c) {
            return zS;
        }
        this.f4912x.w().y.co(this.o.f4748mt, false);
        return this.f4909t.s(jN, jMg, this.d0.v().y);
    }

    public final void q5(boolean z, int i, boolean z5, int i5) throws p {
        this.j.n3(z5 ? 1 : 0);
        this.j.zn(i5);
        this.o = this.o.gv(z, i);
        this.f4902k = false;
        ct(z);
        if (!wm()) {
            uo();
            c8();
            return;
        }
        int i8 = this.o.f4753v;
        if (i8 == 3) {
            bv();
            this.f4905p.i9(2);
        } else if (i8 == 2) {
            this.f4905p.i9(2);
        }
    }

    public final void q9() {
        this.j.gv(this.o);
        if (this.j.y) {
            this.f4897ej.y(this.j);
            this.j = new v(this.o);
        }
    }

    public final void qj(hk hkVar, long j) {
        hkVar.i9();
        if (hkVar instanceof b0.p) {
            ((b0.p) hkVar).en(j);
        }
    }

    public final void qk(long j) {
        for (hk hkVar : this.y) {
            if (hkVar.getStream() != null) {
                qj(hkVar, j);
            }
        }
    }

    public final boolean qn() {
        l lVarW = this.f4912x.w();
        long j = lVarW.f4925a.f4828v;
        return lVarW.f4929gv && (j == -9223372036854775807L || this.o.f4748mt < j || !wm());
    }

    public void r(long j) {
        this.f4904nf = j;
    }

    public final synchronized void r6(g4.r<Boolean> rVar, long j) {
        long jElapsedRealtime = this.f4895d.elapsedRealtime() + j;
        boolean z = false;
        while (!rVar.get().booleanValue() && j > 0) {
            try {
                this.f4895d.zn();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = jElapsedRealtime - this.f4895d.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final void rb(long j) throws p {
        l lVarW = this.f4912x.w();
        long jC = lVarW == null ? j + 1000000000000L : lVarW.c(j);
        this.o4 = jC;
        this.d0.gv(jC);
        for (hk hkVar : this.y) {
            if (j5(hkVar)) {
                hkVar.r(this.o4);
            }
        }
        dm();
    }

    public final void ro(int i) throws p {
        this.en = i;
        if (!this.f4912x.z6(this.o.y, i)) {
            pq(true);
        }
        z6(false);
    }

    @Override // ur.jz.y
    /* JADX INFO: renamed from: rs, reason: merged with bridge method [inline-methods] */
    public void a(ur.d0 d0Var) {
        this.f4905p.v(9, d0Var).y();
    }

    public final long rz() {
        return mg(this.o.w);
    }

    public void s8(int i, int i5, ur.u uVar) {
        this.f4905p.gv(20, i, i5, uVar).y();
    }

    public final void t(h hVar) throws p {
        if (hVar.i9()) {
            return;
        }
        try {
            hVar.fb().f(hVar.c5(), hVar.v());
        } finally {
            hVar.f(true);
        }
    }

    public final void ta(ur.d0 d0Var) {
        if (this.f4912x.x4(d0Var)) {
            this.f4912x.n(this.o4);
            ut();
        }
    }

    public final void tg(long j, long j4) {
        this.f4905p.f(2, j + j4);
    }

    public final void u() throws p {
        l lVarP = this.f4912x.p();
        if (lVarP == null || this.f4912x.w() == lVarP || lVarP.f4928fb || !ap()) {
            return;
        }
        mt();
    }

    public final void ud(ur.d0 d0Var) throws p {
        if (this.f4912x.x4(d0Var)) {
            l lVarI9 = this.f4912x.i9();
            lVarI9.w(this.d0.v().y, this.o.y);
            mh(lVarI9.wz(), lVarI9.xc());
            if (lVarI9 == this.f4912x.w()) {
                rb(lVarI9.f4925a.n3);
                mt();
                fc fcVar = this.o;
                mg.n3 n3Var = fcVar.n3;
                long j = lVarI9.f4925a.n3;
                this.o = b(n3Var, j, fcVar.zn, j, false, 5);
            }
            ut();
        }
    }

    public final void uo() throws p {
        this.d0.s();
        for (hk hkVar : this.y) {
            if (j5(hkVar)) {
                z(hkVar);
            }
        }
    }

    public final void ut() {
        boolean zQ = q();
        this.f7 = zQ;
        if (zQ) {
            this.f4912x.i9().gv(this.o4);
        }
        im();
    }

    public final void vn(ur.u uVar) throws Throwable {
        this.j.n3(1);
        ej(this.f4893b.mg(uVar), false);
    }

    public final void vp(n3 n3Var) throws Throwable {
        this.j.n3(1);
        if (n3Var.zn != -1) {
            this.ct = new s(new ia(n3Var.y, n3Var.n3), n3Var.zn, n3Var.f4919gv);
        }
        ej(this.f4893b.rz(n3Var.y, n3Var.n3), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() throws ft.p, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ft.kp.w():void");
    }

    public final void w2(boolean z) throws p {
        this.f4910ut = z;
        kp();
        if (!this.q9 || this.f4912x.p() == this.f4912x.w()) {
            return;
        }
        pq(true);
        z6(false);
    }

    public final void w9(boolean z) {
        if (z == this.xg) {
            return;
        }
        this.xg = z;
        if (z || !this.o.f4755xc) {
            return;
        }
        this.f4905p.i9(2);
    }

    public final void wf(h hVar) throws p {
        if (hVar.a() == -9223372036854775807L) {
            ad(hVar);
            return;
        }
        if (this.o.y.r()) {
            this.fh.add(new gv(hVar));
            return;
        }
        gv gvVar = new gv(hVar);
        xq xqVar = this.o.y;
        if (!m(gvVar, xqVar, xqVar, this.en, this.jz, this.f4906r, this.f3)) {
            hVar.f(false);
        } else {
            this.fh.add(gvVar);
            Collections.sort(this.fh);
        }
    }

    public final boolean wm() {
        fc fcVar = this.o;
        return fcVar.f4751t && fcVar.f4752tl == 0;
    }

    public final void wz(hk hkVar) throws p {
        if (j5(hkVar)) {
            this.d0.y(hkVar);
            z(hkVar);
            hkVar.fb();
            this.dm--;
        }
    }

    public final void x(uo uoVar, boolean z) throws p {
        a8(uoVar, uoVar.y, true, z);
    }

    public final k4.r<Metadata> x4(n0.c[] cVarArr) {
        r.y yVar = new r.y();
        boolean z = false;
        for (n0.c cVar : cVarArr) {
            if (cVar != null) {
                Metadata metadata = cVar.v(0).z;
                if (metadata == null) {
                    yVar.y(new Metadata(new Metadata.Entry[0]));
                } else {
                    yVar.y(metadata);
                    z = true;
                }
            }
        }
        return z ? yVar.f() : k4.r.yt();
    }

    public void x5(boolean z, int i) {
        this.f4905p.s(1, z ? 1 : 0, i).y();
    }

    public final long xb(mg.n3 n3Var, long j, boolean z, boolean z5) throws p {
        uo();
        this.f4902k = false;
        if (z5 || this.o.f4753v == 3) {
            j3(2);
        }
        l lVarW = this.f4912x.w();
        l lVarI9 = lVarW;
        while (lVarI9 != null && !n3Var.equals(lVarI9.f4925a.y)) {
            lVarI9 = lVarI9.i9();
        }
        if (z || lVarW != lVarI9 || (lVarI9 != null && lVarI9.c(j) < 0)) {
            for (hk hkVar : this.y) {
                wz(hkVar);
            }
            if (lVarI9 != null) {
                while (this.f4912x.w() != lVarI9) {
                    this.f4912x.n3();
                }
                this.f4912x.c(lVarI9);
                lVarI9.f3(1000000000000L);
                mt();
            }
        }
        if (lVarI9 != null) {
            this.f4912x.c(lVarI9);
            if (!lVarI9.f4929gv) {
                lVarI9.f4925a = lVarI9.f4925a.n3(j);
            } else if (lVarI9.f4934v) {
                j = lVarI9.y.i9(j);
                lVarI9.y.co(j - this.n, this.c);
            }
            rb(j);
            ut();
        } else {
            this.f4912x.a();
            rb(j);
        }
        z6(false);
        this.f4905p.i9(2);
        return j;
    }

    @Override // ur.d0.y
    public void xc(ur.d0 d0Var) {
        this.f4905p.v(8, d0Var).y();
    }

    public final void xg(zn znVar) throws Throwable {
        this.j.n3(1);
        ej(this.f4893b.x4(znVar.y, znVar.n3, znVar.zn, znVar.f4924gv), false);
    }

    @Override // n0.ud.y
    public void y() {
        this.f4905p.i9(10);
    }

    public final void y5() throws Throwable {
        ej(this.f4893b.c5(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[PHI: r4 r5 r7
      0x00a6: PHI (r4v3 ur.mg$n3) = (r4v2 ur.mg$n3), (r4v8 ur.mg$n3) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r5v2 long) = (r5v1 long), (r5v4 long) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r7v3 long) = (r7v2 long), (r7v5 long) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yc(boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ft.kp.yc(boolean, boolean, boolean, boolean):void");
    }

    public final void yg() throws p {
        float f3 = this.d0.v().y;
        l lVarP = this.f4912x.p();
        boolean z = true;
        for (l lVarW = this.f4912x.w(); lVarW != null && lVarW.f4929gv; lVarW = lVarW.i9()) {
            n0.a8 a8VarX4 = lVarW.x4(f3, this.o.y);
            if (!a8VarX4.y(lVarW.xc())) {
                if (z) {
                    l lVarW2 = this.f4912x.w();
                    boolean zC = this.f4912x.c(lVarW2);
                    boolean[] zArr = new boolean[this.y.length];
                    long jN3 = lVarW2.n3(a8VarX4, this.o.f4748mt, zC, zArr);
                    fc fcVar = this.o;
                    boolean z5 = (fcVar.f4753v == 4 || jN3 == fcVar.f4748mt) ? false : true;
                    fc fcVar2 = this.o;
                    this.o = b(fcVar2.n3, jN3, fcVar2.zn, fcVar2.f4746gv, z5, 5);
                    if (z5) {
                        rb(jN3);
                    }
                    boolean[] zArr2 = new boolean[this.y.length];
                    int i = 0;
                    while (true) {
                        hk[] hkVarArr = this.y;
                        if (i >= hkVarArr.length) {
                            break;
                        }
                        hk hkVar = hkVarArr[i];
                        boolean zJ5 = j5(hkVar);
                        zArr2[i] = zJ5;
                        ur.en enVar = lVarW2.zn[i];
                        if (zJ5) {
                            if (enVar != hkVar.getStream()) {
                                wz(hkVar);
                            } else if (zArr[i]) {
                                hkVar.r(this.o4);
                            }
                        }
                        i++;
                    }
                    co(zArr2);
                } else {
                    this.f4912x.c(lVarW);
                    if (lVarW.f4929gv) {
                        lVarW.y(a8VarX4, Math.max(lVarW.f4925a.n3, lVarW.n(this.o4)), false);
                    }
                }
                z6(true);
                if (this.o.f4753v != 4) {
                    ut();
                    c8();
                    this.f4905p.i9(2);
                    return;
                }
                return;
            }
            if (lVarW == lVarP) {
                z = false;
            }
        }
    }

    public final void yk(p1 p1Var) {
        this.qn = p1Var;
    }

    public final boolean yt() {
        l lVarP = this.f4912x.p();
        if (!lVarP.f4929gv) {
            return false;
        }
        int i = 0;
        while (true) {
            hk[] hkVarArr = this.y;
            if (i >= hkVarArr.length) {
                return true;
            }
            hk hkVar = hkVarArr[i];
            ur.en enVar = lVarP.zn[i];
            if (hkVar.getStream() != enVar || (enVar != null && !hkVar.c5() && !k5(hkVar, lVarP))) {
                break;
            }
            i++;
        }
        return false;
    }

    public final void z(hk hkVar) {
        if (hkVar.getState() == 2) {
            hkVar.stop();
        }
    }

    public final void z6(boolean z) {
        l lVarI9 = this.f4912x.i9();
        mg.n3 n3Var = lVarI9 == null ? this.o.n3 : lVarI9.f4925a.y;
        boolean zEquals = this.o.f4744f.equals(n3Var);
        if (!zEquals) {
            this.o = this.o.n3(n3Var);
        }
        fc fcVar = this.o;
        fcVar.w = lVarI9 == null ? fcVar.f4748mt : lVarI9.c5();
        this.o.f4749p = rz();
        if ((!zEquals || z) && lVarI9 != null && lVarI9.f4929gv) {
            mh(lVarI9.wz(), lVarI9.xc());
        }
    }

    @Override // ft.h.y
    public synchronized void zn(h hVar) {
        if (!this.oz && this.z.getThread().isAlive()) {
            this.f4905p.v(14, hVar).y();
            return;
        }
        v0.r.c5("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        hVar.f(false);
    }
}
