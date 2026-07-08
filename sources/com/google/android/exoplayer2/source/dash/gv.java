package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.dash.v;
import com.google.android.exoplayer2.source.dash.y;
import ft.g;
import ft.p1;
import h6.a;
import h6.f;
import h6.fb;
import h6.s;
import h6.w;
import h6.wz;
import h6.xc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import n0.c;
import r0.d;
import r0.d0;
import r0.mg;
import r0.o;
import r0.tl;
import sd.t;
import v0.ut;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public class gv implements com.google.android.exoplayer2.source.dash.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1697a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final n3[] f1698c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pv.zn f1699f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f1700fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f1701gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public c f1702i9;
    public final sd.n3 n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final v.zn f1703s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1704t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    @Nullable
    public IOException f1705tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final tl f1706v;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public boolean f1707wz;
    public final d y;
    public final int[] zn;

    public static final class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1708a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Nullable
        public final t f1709gv;
        public final pv.tl n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final long f1710v;

        @Nullable
        public final fb y;
        public final pv.n3 zn;

        public n3(long j, pv.tl tlVar, pv.n3 n3Var, @Nullable fb fbVar, long j4, @Nullable t tVar) {
            this.f1710v = j;
            this.n3 = tlVar;
            this.zn = n3Var;
            this.f1708a = j4;
            this.y = fbVar;
            this.f1709gv = tVar;
        }

        public long a() {
            return this.f1709gv.c5() + this.f1708a;
        }

        public long c5(long j) {
            return f(j) + this.f1709gv.y(j - this.f1708a, this.f1710v);
        }

        public long f(long j) {
            return this.f1709gv.n3(j - this.f1708a);
        }

        public long fb(long j) {
            return (v(j) + this.f1709gv.i9(this.f1710v, j)) - 1;
        }

        @CheckResult
        public n3 gv(pv.n3 n3Var) {
            return new n3(this.f1710v, this.n3, n3Var, this.y, this.f1708a, this.f1709gv);
        }

        public long i9(long j) {
            return this.f1709gv.a(j, this.f1710v) + this.f1708a;
        }

        @CheckResult
        public n3 n3(long j, pv.tl tlVar) throws ur.n3 {
            long jA;
            t tVarT = this.n3.t();
            t tVarT2 = tlVar.t();
            if (tVarT == null) {
                return new n3(j, tlVar, this.zn, this.y, this.f1708a, tVarT);
            }
            if (!tVarT.s()) {
                return new n3(j, tlVar, this.zn, this.y, this.f1708a, tVarT2);
            }
            long jFb = tVarT.fb(j);
            if (jFb == 0) {
                return new n3(j, tlVar, this.zn, this.y, this.f1708a, tVarT2);
            }
            long jC5 = tVarT.c5();
            long jN3 = tVarT.n3(jC5);
            long jA2 = jFb + jC5;
            long j4 = jA2 - 1;
            long jN32 = tVarT.n3(j4) + tVarT.y(j4, j);
            long jC52 = tVarT2.c5();
            long jN33 = tVarT2.n3(jC52);
            long j7 = this.f1708a;
            if (jN32 == jN33) {
                jA = j7 + (jA2 - jC52);
            } else {
                if (jN32 < jN33) {
                    throw new ur.n3();
                }
                if (jN33 < jN3) {
                    jA = j7 - (tVarT2.a(jN3, j) - jC5);
                } else {
                    jA2 = tVarT.a(jN33, j);
                    jA = j7 + (jA2 - jC52);
                }
            }
            return new n3(j, tlVar, this.zn, this.y, jA, tVarT2);
        }

        public long s() {
            return this.f1709gv.fb(this.f1710v);
        }

        public pv.t t(long j) {
            return this.f1709gv.v(j - this.f1708a);
        }

        public boolean tl(long j, long j4) {
            return this.f1709gv.s() || j4 == -9223372036854775807L || c5(j) <= j4;
        }

        public long v(long j) {
            return this.f1709gv.zn(this.f1710v, j) + this.f1708a;
        }

        @CheckResult
        public n3 zn(t tVar) {
            return new n3(this.f1710v, this.n3, this.zn, this.y, this.f1708a, tVar);
        }
    }

    public static final class y implements y.InterfaceC0052y {
        public final int n3;
        public final tl.y y;
        public final fb.y zn;

        public y(tl.y yVar) {
            this(yVar, 1);
        }

        @Override // com.google.android.exoplayer2.source.dash.y.InterfaceC0052y
        public com.google.android.exoplayer2.source.dash.y y(d dVar, pv.zn znVar, sd.n3 n3Var, int i, int[] iArr, c cVar, int i5, long j, boolean z, List<g> list, @Nullable v.zn znVar2, @Nullable o oVar, gn gnVar) {
            tl tlVarY = this.y.y();
            if (oVar != null) {
                tlVarY.co(oVar);
            }
            return new gv(this.zn, dVar, znVar, n3Var, i, iArr, cVar, i5, tlVarY, j, this.n3, z, list, znVar2, gnVar);
        }

        public y(tl.y yVar, int i) {
            this(h6.v.z, yVar, i);
        }

        public y(fb.y yVar, tl.y yVar2, int i) {
            this.zn = yVar;
            this.y = yVar2;
            this.n3 = i;
        }
    }

    public static final class zn extends h6.n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1711a;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final n3 f1712v;

        public zn(n3 n3Var, long j, long j4, long j7) {
            super(j, j4);
            this.f1712v = n3Var;
            this.f1711a = j7;
        }

        @Override // h6.xc
        public long n3() {
            zn();
            return this.f1712v.c5(gv());
        }

        @Override // h6.xc
        public long y() {
            zn();
            return this.f1712v.f(gv());
        }
    }

    public gv(fb.y yVar, d dVar, pv.zn znVar, sd.n3 n3Var, int i, int[] iArr, c cVar, int i5, tl tlVar, long j, int i8, boolean z, List<g> list, @Nullable v.zn znVar2, gn gnVar) {
        this.y = dVar;
        this.f1699f = znVar;
        this.n3 = n3Var;
        this.zn = iArr;
        this.f1702i9 = cVar;
        this.f1701gv = i5;
        this.f1706v = tlVar;
        this.f1704t = i;
        this.f1697a = j;
        this.f1700fb = i8;
        this.f1703s = znVar2;
        long jFb = znVar.fb(i);
        ArrayList<pv.tl> arrayListWz = wz();
        this.f1698c5 = new n3[cVar.length()];
        int i10 = 0;
        while (i10 < this.f1698c5.length) {
            pv.tl tlVar2 = arrayListWz.get(cVar.a(i10));
            pv.n3 n3VarI9 = n3Var.i9(tlVar2.zn);
            int i11 = i10;
            this.f1698c5[i11] = new n3(jFb, tlVar2, n3VarI9 == null ? tlVar2.zn.get(0) : n3VarI9, yVar.y(i5, tlVar2.n3, z, list, znVar2, gnVar), 0L, tlVar2.t());
            i10 = i11 + 1;
        }
    }

    @Override // h6.i9
    public boolean a(long j, a aVar, List<? extends wz> list) {
        if (this.f1705tl != null) {
            return false;
        }
        return this.f1702i9.w(j, aVar, list);
    }

    @Override // h6.i9
    public int c5(long j, List<? extends wz> list) {
        return (this.f1705tl != null || this.f1702i9.length() < 2) ? list.size() : this.f1702i9.xc(j, list);
    }

    public final mg.y f(c cVar, List<pv.n3> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = cVar.length();
        int i = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (cVar.gv(i5, jElapsedRealtime)) {
                i++;
            }
        }
        int iA = sd.n3.a(list);
        return new mg.y(iA, iA - this.n3.fb(list), length, i);
    }

    @Override // com.google.android.exoplayer2.source.dash.y
    public void fb(pv.zn znVar, int i) {
        try {
            this.f1699f = znVar;
            this.f1704t = i;
            long jFb = znVar.fb(i);
            ArrayList<pv.tl> arrayListWz = wz();
            for (int i5 = 0; i5 < this.f1698c5.length; i5++) {
                pv.tl tlVar = arrayListWz.get(this.f1702i9.a(i5));
                n3[] n3VarArr = this.f1698c5;
                n3VarArr[i5] = n3VarArr[i5].n3(jFb, tlVar);
            }
        } catch (ur.n3 e4) {
            this.f1705tl = e4;
        }
    }

    @Override // h6.i9
    public long gv(long j, p1 p1Var) {
        for (n3 n3Var : this.f1698c5) {
            if (n3Var.f1709gv != null) {
                long jS = n3Var.s();
                if (jS != 0) {
                    long jI9 = n3Var.i9(j);
                    long jF = n3Var.f(jI9);
                    return p1Var.y(j, jF, (jF >= j || (jS != -1 && jI9 >= (n3Var.a() + jS) - 1)) ? jF : n3Var.f(jI9 + 1));
                }
            }
        }
        return j;
    }

    @Override // h6.i9
    public boolean i9(a aVar, boolean z, mg.zn znVar, mg mgVar) {
        mg.n3 n3VarN3;
        if (!z) {
            return false;
        }
        v.zn znVar2 = this.f1703s;
        if (znVar2 != null && znVar2.i9(aVar)) {
            return true;
        }
        if (!this.f1699f.f7429gv && (aVar instanceof wz)) {
            IOException iOException = znVar.zn;
            if ((iOException instanceof d0.v) && ((d0.v) iOException).responseCode == 404) {
                n3 n3Var = this.f1698c5[this.f1702i9.s(aVar.f5288gv)];
                long jS = n3Var.s();
                if (jS != -1 && jS != 0) {
                    if (((wz) aVar).v() > (n3Var.a() + jS) - 1) {
                        this.f1707wz = true;
                        return true;
                    }
                }
            }
        }
        n3 n3Var2 = this.f1698c5[this.f1702i9.s(aVar.f5288gv)];
        pv.n3 n3VarI9 = this.n3.i9(n3Var2.n3.zn);
        if (n3VarI9 != null && !n3Var2.zn.equals(n3VarI9)) {
            return true;
        }
        mg.y yVarF = f(this.f1702i9, n3Var2.n3.zn);
        if ((!yVarF.y(2) && !yVarF.y(1)) || (n3VarN3 = mgVar.n3(yVarF, znVar)) == null || !yVarF.y(n3VarN3.y)) {
            return false;
        }
        int i = n3VarN3.y;
        if (i == 2) {
            c cVar = this.f1702i9;
            return cVar.zn(cVar.s(aVar.f5288gv), n3VarN3.n3);
        }
        if (i != 1) {
            return false;
        }
        this.n3.v(n3Var2.zn, n3VarN3.n3);
        return true;
    }

    public final n3 mt(int i) {
        n3 n3Var = this.f1698c5[i];
        pv.n3 n3VarI9 = this.n3.i9(n3Var.n3.zn);
        if (n3VarI9 == null || n3VarI9.equals(n3Var.zn)) {
            return n3Var;
        }
        n3 n3VarGv = n3Var.gv(n3VarI9);
        this.f1698c5[i] = n3VarGv;
        return n3VarGv;
    }

    @Override // h6.i9
    public void n3() throws IOException {
        IOException iOException = this.f1705tl;
        if (iOException != null) {
            throw iOException;
        }
        this.y.n3();
    }

    public a p(n3 n3Var, tl tlVar, int i, g gVar, int i5, Object obj, long j, int i8, long j4, long j7) {
        pv.tl tlVar2 = n3Var.n3;
        long jF = n3Var.f(j);
        pv.t tVarT = n3Var.t(j);
        if (n3Var.y == null) {
            return new w(tlVar, sd.tl.y(tlVar2, n3Var.zn.y, tVarT, n3Var.tl(j, j7) ? 0 : 8), gVar, i5, obj, jF, n3Var.c5(j), j, i, gVar);
        }
        int i10 = 1;
        int i11 = 1;
        while (i10 < i8) {
            pv.t tVarY = tVarT.y(n3Var.t(((long) i10) + j), n3Var.zn.y);
            if (tVarY == null) {
                break;
            }
            i11++;
            i10++;
            tVarT = tVarY;
        }
        long j8 = (((long) i11) + j) - 1;
        long jC5 = n3Var.c5(j8);
        long j9 = n3Var.f1710v;
        return new f(tlVar, sd.tl.y(tlVar2, n3Var.zn.y, tVarT, n3Var.tl(j8, j7) ? 0 : 8), gVar, i5, obj, jF, jC5, j4, (j9 == -9223372036854775807L || j9 > jC5) ? -9223372036854775807L : j9, j, i11, -tlVar2.f7399gv, n3Var.y);
    }

    @Override // h6.i9
    public void release() {
        for (n3 n3Var : this.f1698c5) {
            fb fbVar = n3Var.y;
            if (fbVar != null) {
                fbVar.release();
            }
        }
    }

    @Override // h6.i9
    public void s(long j, long j4, List<? extends wz> list, s sVar) {
        int i;
        int i5;
        xc[] xcVarArr;
        long j7;
        long j8;
        if (this.f1705tl != null) {
            return;
        }
        long j9 = j4 - j;
        long jXb = ut.xb(this.f1699f.y) + ut.xb(this.f1699f.gv(this.f1704t).n3) + j4;
        v.zn znVar = this.f1703s;
        if (znVar == null || !znVar.s(jXb)) {
            long jXb2 = ut.xb(ut.y5(this.f1697a));
            long jTl = tl(jXb2);
            wz wzVar = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = this.f1702i9.length();
            xc[] xcVarArr2 = new xc[length];
            int i8 = 0;
            while (i8 < length) {
                n3 n3Var = this.f1698c5[i8];
                if (n3Var.f1709gv == null) {
                    xcVarArr2[i8] = xc.y;
                    i = i8;
                    i5 = length;
                    xcVarArr = xcVarArr2;
                    j7 = j9;
                    j8 = jXb2;
                } else {
                    long jV = n3Var.v(jXb2);
                    long jFb = n3Var.fb(jXb2);
                    i = i8;
                    i5 = length;
                    xcVarArr = xcVarArr2;
                    j7 = j9;
                    j8 = jXb2;
                    long jXc = xc(n3Var, wzVar, j4, jV, jFb);
                    if (jXc < jV) {
                        xcVarArr[i] = xc.y;
                    } else {
                        xcVarArr[i] = new zn(mt(i), jXc, jFb, jTl);
                    }
                }
                i8 = i + 1;
                jXb2 = j8;
                length = i5;
                xcVarArr2 = xcVarArr;
                j9 = j7;
            }
            long j10 = j9;
            long j11 = jXb2;
            this.f1702i9.z(j, j10, t(j11, j), list, xcVarArr2);
            n3 n3VarMt = mt(this.f1702i9.n3());
            fb fbVar = n3VarMt.y;
            if (fbVar != null) {
                pv.tl tlVar = n3VarMt.n3;
                pv.t tVarWz = fbVar.v() == null ? tlVar.wz() : null;
                pv.t tVarTl = n3VarMt.f1709gv == null ? tlVar.tl() : null;
                if (tVarWz != null || tVarTl != null) {
                    sVar.y = w(n3VarMt, this.f1706v, this.f1702i9.mt(), this.f1702i9.co(), this.f1702i9.i9(), tVarWz, tVarTl);
                    return;
                }
            }
            long j12 = n3VarMt.f1710v;
            boolean z = j12 != -9223372036854775807L;
            if (n3VarMt.s() == 0) {
                sVar.n3 = z;
                return;
            }
            long jV2 = n3VarMt.v(j11);
            long jFb2 = n3VarMt.fb(j11);
            long jXc2 = xc(n3VarMt, wzVar, j4, jV2, jFb2);
            if (jXc2 < jV2) {
                this.f1705tl = new ur.n3();
                return;
            }
            if (jXc2 > jFb2 || (this.f1707wz && jXc2 >= jFb2)) {
                sVar.n3 = z;
                return;
            }
            if (z && n3VarMt.f(jXc2) >= j12) {
                sVar.n3 = true;
                return;
            }
            int iMin = (int) Math.min(this.f1700fb, (jFb2 - jXc2) + 1);
            if (j12 != -9223372036854775807L) {
                while (iMin > 1 && n3VarMt.f((((long) iMin) + jXc2) - 1) >= j12) {
                    iMin--;
                }
            }
            sVar.y = p(n3VarMt, this.f1706v, this.f1701gv, this.f1702i9.mt(), this.f1702i9.co(), this.f1702i9.i9(), jXc2, iMin, list.isEmpty() ? j4 : -9223372036854775807L, jTl);
        }
    }

    public final long t(long j, long j4) {
        if (!this.f1699f.f7429gv || this.f1698c5[0].s() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(tl(j), this.f1698c5[0].c5(this.f1698c5[0].fb(j))) - j4);
    }

    public final long tl(long j) {
        pv.zn znVar = this.f1699f;
        long j4 = znVar.y;
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - ut.xb(j4 + znVar.gv(this.f1704t).n3);
    }

    @Override // h6.i9
    public void v(a aVar) {
        b1.gv gvVarZn;
        if (aVar instanceof h6.tl) {
            int iS = this.f1702i9.s(((h6.tl) aVar).f5288gv);
            n3 n3Var = this.f1698c5[iS];
            if (n3Var.f1709gv == null && (gvVarZn = n3Var.y.zn()) != null) {
                this.f1698c5[iS] = n3Var.zn(new sd.wz(gvVarZn, n3Var.n3.f7399gv));
            }
        }
        v.zn znVar = this.f1703s;
        if (znVar != null) {
            znVar.c5(aVar);
        }
    }

    public a w(n3 n3Var, tl tlVar, g gVar, int i, @Nullable Object obj, @Nullable pv.t tVar, @Nullable pv.t tVar2) {
        pv.t tVar3 = tVar;
        pv.tl tlVar2 = n3Var.n3;
        if (tVar3 != null) {
            pv.t tVarY = tVar3.y(tVar2, n3Var.zn.y);
            if (tVarY != null) {
                tVar3 = tVarY;
            }
        } else {
            tVar3 = tVar2;
        }
        return new h6.tl(tlVar, sd.tl.y(tlVar2, n3Var.zn.y, tVar3, 0), gVar, i, obj, n3Var.y);
    }

    public final ArrayList<pv.tl> wz() {
        List<pv.y> list = this.f1699f.gv(this.f1704t).zn;
        ArrayList<pv.tl> arrayList = new ArrayList<>();
        for (int i : this.zn) {
            arrayList.addAll(list.get(i).zn);
        }
        return arrayList;
    }

    public final long xc(n3 n3Var, @Nullable wz wzVar, long j, long j4, long j7) {
        return wzVar != null ? wzVar.v() : ut.mt(n3Var.i9(j), j4, j7);
    }

    @Override // com.google.android.exoplayer2.source.dash.y
    public void y(c cVar) {
        this.f1702i9 = cVar;
    }
}
