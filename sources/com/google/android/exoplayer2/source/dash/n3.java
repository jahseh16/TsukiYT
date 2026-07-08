package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.a;
import com.google.android.exoplayer2.drm.v;
import com.google.android.exoplayer2.source.dash.v;
import com.google.android.exoplayer2.source.dash.y;
import ft.g;
import ft.p1;
import h6.c5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n0.c;
import pv.fb;
import pv.i9;
import pv.s;
import pv.tl;
import r0.d;
import r0.mg;
import r0.o;
import sd.xc;
import ur.b;
import ur.d0;
import ur.en;
import ur.jz;
import ur.lc;
import ur.rs;
import ur.z;
import v0.ut;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements d0, jz.y<c5<com.google.android.exoplayer2.source.dash.y>>, c5.n3<com.google.android.exoplayer2.source.dash.y> {
    public static final Pattern j = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern oz = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final r0.n3 f1714co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gn f1715d;
    public final b.y d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    @Nullable
    public d0.y f1716ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mg f1717f;
    public final ur.c5 f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public final o f1718fb;
    public final v.y fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public jz f1719hw;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public pv.zn f1720j5;
    public final v n;
    public List<s> o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f1721p;
    public int qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y[] f1722r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f1723s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sd.n3 f1724t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y.InterfaceC0052y f1725v;
    public final long w;
    public final int y;
    public final lc z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c5<com.google.android.exoplayer2.source.dash.y>[] f1726x = ta(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xc[] f1713b = new xc[0];
    public final IdentityHashMap<c5<com.google.android.exoplayer2.source.dash.y>, v.zn> c = new IdentityHashMap<>();

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1727a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int f1728fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f1729gv;
        public final int n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f1730v;
        public final int[] y;
        public final int zn;

        public y(int i, int i5, int[] iArr, int i8, int i10, int i11, int i12) {
            this.n3 = i;
            this.y = iArr;
            this.zn = i5;
            this.f1730v = i8;
            this.f1727a = i10;
            this.f1728fb = i11;
            this.f1729gv = i12;
        }

        public static y gv(int i, int[] iArr, int i5, int i8, int i10) {
            return new y(i, 0, iArr, i5, i8, i10, -1);
        }

        public static y n3(int[] iArr, int i) {
            return new y(5, 1, iArr, i, -1, -1, -1);
        }

        public static y y(int[] iArr, int i) {
            return new y(3, 1, iArr, i, -1, -1, -1);
        }

        public static y zn(int i) {
            return new y(5, 2, new int[0], -1, -1, -1, i);
        }
    }

    public n3(int i, pv.zn znVar, sd.n3 n3Var, int i5, y.InterfaceC0052y interfaceC0052y, @Nullable o oVar, a aVar, v.y yVar, mg mgVar, b.y yVar2, long j4, d dVar, r0.n3 n3Var2, ur.c5 c5Var, v.n3 n3Var3, gn gnVar) {
        this.y = i;
        this.f1720j5 = znVar;
        this.f1724t = n3Var;
        this.qn = i5;
        this.f1725v = interfaceC0052y;
        this.f1718fb = oVar;
        this.f1723s = aVar;
        this.fh = yVar;
        this.f1717f = mgVar;
        this.d0 = yVar2;
        this.w = j4;
        this.f1721p = dVar;
        this.f1714co = n3Var2;
        this.f3 = c5Var;
        this.f1715d = gnVar;
        this.n = new v(znVar, n3Var3, n3Var2);
        this.f1719hw = c5Var.y(this.f1726x);
        i9 i9VarGv = znVar.gv(i5);
        List<s> list = i9VarGv.f7390gv;
        this.o = list;
        Pair<lc, y[]> pairR = r(aVar, i9VarGv.zn, list);
        this.z = (lc) pairR.first;
        this.f1722r = (y[]) pairR.second;
    }

    public static int[][] c(List<pv.y> list) {
        int iMin;
        fb fbVarX4;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i = 0; i < size; i++) {
            sparseIntArray.put(list.get(i).y, i);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i));
            arrayList.add(arrayList2);
            sparseArray.put(i, arrayList2);
        }
        for (int i5 = 0; i5 < size; i5++) {
            pv.y yVar = list.get(i5);
            fb fbVarF3 = f3(yVar.f7424v);
            if (fbVarF3 == null) {
                fbVarF3 = f3(yVar.f7422a);
            }
            if (fbVarF3 == null || (iMin = sparseIntArray.get(Integer.parseInt(fbVarF3.n3), -1)) == -1) {
                iMin = i5;
            }
            if (iMin == i5 && (fbVarX4 = x4(yVar.f7422a)) != null) {
                for (String str : ut.ro(fbVarX4.n3, ",")) {
                    int i8 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i8 != -1) {
                        iMin = Math.min(iMin, i8);
                    }
                }
            }
            if (iMin != i5) {
                List list2 = (List) sparseArray.get(i5);
                List list3 = (List) sparseArray.get(iMin);
                list3.addAll(list2);
                sparseArray.put(i5, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i10 = 0; i10 < size2; i10++) {
            int[] iArrWz = n4.a.wz((Collection) arrayList.get(i10));
            iArr[i10] = iArrWz;
            Arrays.sort(iArrWz);
        }
        return iArr;
    }

    @Nullable
    public static fb f3(List<fb> list) {
        return i4(list, "http://dashif.org/guidelines/trickmode");
    }

    @Nullable
    public static fb i4(List<fb> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            fb fbVar = list.get(i);
            if (str.equals(fbVar.y)) {
                return fbVar;
            }
        }
        return null;
    }

    public static int mg(int i, List<pv.y> list, int[][] iArr, boolean[] zArr, g[][] gVarArr) {
        int i5 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            if (rz(list, iArr[i8])) {
                zArr[i8] = true;
                i5++;
            }
            g[] gVarArrN = n(list, iArr[i8]);
            gVarArr[i8] = gVarArrN;
            if (gVarArrN.length != 0) {
                i5++;
            }
        }
        return i5;
    }

    public static g[] n(List<pv.y> list, int[] iArr) {
        for (int i : iArr) {
            pv.y yVar = list.get(i);
            List<fb> list2 = list.get(i).f7423gv;
            for (int i5 = 0; i5 < list2.size(); i5++) {
                fb fbVar = list2.get(i5);
                if ("urn:scte:dash:cc:cea-608:2015".equals(fbVar.y)) {
                    return z6(fbVar, j, new g.n3().o4("application/cea-608").oz(yVar.y + ":cea608").z6());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(fbVar.y)) {
                    return z6(fbVar, oz, new g.n3().o4("application/cea-708").oz(yVar.y + ":cea708").z6());
                }
            }
        }
        return new g[0];
    }

    public static int p(a aVar, List<pv.y> list, int[][] iArr, int i, boolean[] zArr, g[][] gVarArr, rs[] rsVarArr, y[] yVarArr) {
        int i5;
        int i8;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            int[] iArr2 = iArr[i10];
            ArrayList arrayList = new ArrayList();
            for (int i12 : iArr2) {
                arrayList.addAll(list.get(i12).zn);
            }
            int size = arrayList.size();
            g[] gVarArr2 = new g[size];
            for (int i13 = 0; i13 < size; i13++) {
                g gVar = ((tl) arrayList.get(i13)).n3;
                gVarArr2[i13] = gVar.zn(aVar.zn(gVar));
            }
            pv.y yVar = list.get(iArr2[0]);
            int i14 = yVar.y;
            String string = i14 != -1 ? Integer.toString(i14) : "unset:" + i10;
            int i15 = i11 + 1;
            if (zArr[i10]) {
                i5 = i11 + 2;
            } else {
                i5 = i15;
                i15 = -1;
            }
            if (gVarArr[i10].length != 0) {
                i8 = i5 + 1;
            } else {
                i8 = i5;
                i5 = -1;
            }
            rsVarArr[i11] = new rs(string, gVarArr2);
            yVarArr[i11] = y.gv(yVar.n3, iArr2, i11, i15, i5);
            if (i15 != -1) {
                String str = string + ":emsg";
                rsVarArr[i15] = new rs(str, new g.n3().oz(str).o4("application/x-emsg").z6());
                yVarArr[i15] = y.n3(iArr2, i11);
            }
            if (i5 != -1) {
                rsVarArr[i5] = new rs(string + ":cc", gVarArr[i10]);
                yVarArr[i5] = y.y(iArr2, i11);
            }
            i10++;
            i11 = i8;
        }
        return i11;
    }

    public static Pair<lc, y[]> r(a aVar, List<pv.y> list, List<s> list2) {
        int[][] iArrC = c(list);
        int length = iArrC.length;
        boolean[] zArr = new boolean[length];
        g[][] gVarArr = new g[length][];
        int iMg = mg(length, list, iArrC, zArr, gVarArr) + length + list2.size();
        rs[] rsVarArr = new rs[iMg];
        y[] yVarArr = new y[iMg];
        w(list2, rsVarArr, yVarArr, p(aVar, list, iArrC, length, zArr, gVarArr, rsVarArr, yVarArr));
        return Pair.create(new lc(rsVarArr), yVarArr);
    }

    public static boolean rz(List<pv.y> list, int[] iArr) {
        for (int i : iArr) {
            List<tl> list2 = list.get(i).zn;
            for (int i5 = 0; i5 < list2.size(); i5++) {
                if (!list2.get(i5).f7401v.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static c5<com.google.android.exoplayer2.source.dash.y>[] ta(int i) {
        return new c5[i];
    }

    public static void w(List<s> list, rs[] rsVarArr, y[] yVarArr, int i) {
        int i5 = 0;
        while (i5 < list.size()) {
            s sVar = list.get(i5);
            rsVarArr[i] = new rs(sVar.y() + ":" + i5, new g.n3().oz(sVar.y()).o4("application/x-emsg").z6());
            yVarArr[i] = y.zn(i5);
            i5++;
            i++;
        }
    }

    @Nullable
    public static fb x4(List<fb> list) {
        return i4(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    public static g[] z6(fb fbVar, Pattern pattern, g gVar) {
        String str = fbVar.n3;
        if (str == null) {
            return new g[]{gVar};
        }
        String[] strArrRo = ut.ro(str, ";");
        g[] gVarArr = new g[strArrRo.length];
        for (int i = 0; i < strArrRo.length; i++) {
            Matcher matcher = pattern.matcher(strArrRo[i]);
            if (!matcher.matches()) {
                return new g[]{gVar};
            }
            int i5 = Integer.parseInt(matcher.group(1));
            gVarArr[i] = gVar.n3().oz(gVar.y + ":" + i5).ej(i5).k(matcher.group(2)).z6();
        }
        return gVarArr;
    }

    public final void a8(c[] cVarArr, en[] enVarArr, int[] iArr) {
        boolean z;
        for (int i = 0; i < cVarArr.length; i++) {
            en enVar = enVarArr[i];
            if ((enVar instanceof z) || (enVar instanceof c5.y)) {
                int iD0 = d0(i, iArr);
                if (iD0 == -1) {
                    z = enVarArr[i] instanceof z;
                } else {
                    en enVar2 = enVarArr[i];
                    z = (enVar2 instanceof c5.y) && ((c5.y) enVar2).y == enVarArr[iD0];
                }
                if (!z) {
                    en enVar3 = enVarArr[i];
                    if (enVar3 instanceof c5.y) {
                        ((c5.y) enVar3).zn();
                    }
                    enVarArr[i] = null;
                }
            }
        }
    }

    public void b(pv.zn znVar, int i) {
        this.f1720j5 = znVar;
        this.qn = i;
        this.n.p(znVar);
        c5<com.google.android.exoplayer2.source.dash.y>[] c5VarArr = this.f1726x;
        if (c5VarArr != null) {
            for (c5<com.google.android.exoplayer2.source.dash.y> c5Var : c5VarArr) {
                ((com.google.android.exoplayer2.source.dash.y) c5Var.rz()).fb(znVar, i);
            }
            this.f1716ej.a(this);
        }
        this.o = znVar.gv(i).f7390gv;
        for (xc xcVar : this.f1713b) {
            Iterator<s> it = this.o.iterator();
            while (true) {
                if (it.hasNext()) {
                    s next = it.next();
                    if (next.y().equals(xcVar.y())) {
                        xcVar.gv(next, znVar.f7429gv && i == znVar.v() - 1);
                    }
                }
            }
        }
    }

    @Override // ur.d0
    public void c5(d0.y yVar, long j4) {
        this.f1716ej = yVar;
        yVar.xc(this);
    }

    @Override // ur.d0
    public void co(long j4, boolean z) {
        for (c5<com.google.android.exoplayer2.source.dash.y> c5Var : this.f1726x) {
            c5Var.co(j4, z);
        }
    }

    @Override // ur.jz.y
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(c5<com.google.android.exoplayer2.source.dash.y> c5Var) {
        this.f1716ej.a(this);
    }

    public final int d0(int i, int[] iArr) {
        int i5 = iArr[i];
        if (i5 == -1) {
            return -1;
        }
        int i8 = this.f1722r[i5].f1730v;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 == i8 && this.f1722r[i11].zn == 0) {
                return i10;
            }
        }
        return -1;
    }

    public void ej() {
        this.n.xc();
        for (c5<com.google.android.exoplayer2.source.dash.y> c5Var : this.f1726x) {
            c5Var.vl(this);
        }
        this.f1716ej = null;
    }

    @Override // ur.d0
    public long f(c[] cVarArr, boolean[] zArr, en[] enVarArr, boolean[] zArr2, long j4) {
        int[] iArrFh = fh(cVarArr);
        ud(cVarArr, zArr, enVarArr);
        a8(cVarArr, enVarArr, iArrFh);
        x(cVarArr, enVarArr, zArr2, j4, iArrFh);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (en enVar : enVarArr) {
            if (enVar instanceof c5) {
                arrayList.add((c5) enVar);
            } else if (enVar instanceof xc) {
                arrayList2.add((xc) enVar);
            }
        }
        c5<com.google.android.exoplayer2.source.dash.y>[] c5VarArrTa = ta(arrayList.size());
        this.f1726x = c5VarArrTa;
        arrayList.toArray(c5VarArrTa);
        xc[] xcVarArr = new xc[arrayList2.size()];
        this.f1713b = xcVarArr;
        arrayList2.toArray(xcVarArr);
        this.f1719hw = this.f3.y(this.f1726x);
        return j4;
    }

    @Override // ur.d0, ur.jz
    public long fb() {
        return this.f1719hw.fb();
    }

    public final int[] fh(c[] cVarArr) {
        int[] iArr = new int[cVarArr.length];
        for (int i = 0; i < cVarArr.length; i++) {
            c cVar = cVarArr[i];
            if (cVar != null) {
                iArr[i] = this.z.zn(cVar.tl());
            } else {
                iArr[i] = -1;
            }
        }
        return iArr;
    }

    @Override // ur.d0
    public long gv(long j4, p1 p1Var) {
        for (c5<com.google.android.exoplayer2.source.dash.y> c5Var : this.f1726x) {
            if (c5Var.y == 2) {
                return c5Var.gv(j4, p1Var);
            }
        }
        return j4;
    }

    @Override // ur.d0
    public long i9(long j4) {
        for (c5<com.google.android.exoplayer2.source.dash.y> c5Var : this.f1726x) {
            c5Var.qn(j4);
        }
        for (xc xcVar : this.f1713b) {
            xcVar.zn(j4);
        }
        return j4;
    }

    @Override // ur.d0
    public lc mt() {
        return this.z;
    }

    @Override // h6.c5.n3
    public synchronized void n3(c5<com.google.android.exoplayer2.source.dash.y> c5Var) {
        v.zn znVarRemove = this.c.remove(c5Var);
        if (znVarRemove != null) {
            znVarRemove.wz();
        }
    }

    @Override // ur.d0, ur.jz
    public void s(long j4) {
        this.f1719hw.s(j4);
    }

    @Override // ur.d0
    public long t() {
        return -9223372036854775807L;
    }

    public final void ud(c[] cVarArr, boolean[] zArr, en[] enVarArr) {
        for (int i = 0; i < cVarArr.length; i++) {
            if (cVarArr[i] == null || !zArr[i]) {
                en enVar = enVarArr[i];
                if (enVar instanceof c5) {
                    ((c5) enVar).vl(this);
                } else if (enVar instanceof c5.y) {
                    ((c5.y) enVar).zn();
                }
                enVarArr[i] = null;
            }
        }
    }

    @Override // ur.d0, ur.jz
    public boolean v(long j4) {
        return this.f1719hw.v(j4);
    }

    @Override // ur.d0
    public void wz() throws IOException {
        this.f1721p.n3();
    }

    public final void x(c[] cVarArr, en[] enVarArr, boolean[] zArr, long j4, int[] iArr) {
        for (int i = 0; i < cVarArr.length; i++) {
            c cVar = cVarArr[i];
            if (cVar != null) {
                en enVar = enVarArr[i];
                if (enVar == null) {
                    zArr[i] = true;
                    y yVar = this.f1722r[iArr[i]];
                    int i5 = yVar.zn;
                    if (i5 == 0) {
                        enVarArr[i] = z(yVar, cVar, j4);
                    } else if (i5 == 2) {
                        enVarArr[i] = new xc(this.o.get(yVar.f1729gv), cVar.tl().zn(0), this.f1720j5.f7429gv);
                    }
                } else if (enVar instanceof c5) {
                    ((com.google.android.exoplayer2.source.dash.y) ((c5) enVar).rz()).y(cVar);
                }
            }
        }
        for (int i8 = 0; i8 < cVarArr.length; i8++) {
            if (enVarArr[i8] == null && cVarArr[i8] != null) {
                y yVar2 = this.f1722r[iArr[i8]];
                if (yVar2.zn == 1) {
                    int iD0 = d0(i8, iArr);
                    if (iD0 == -1) {
                        enVarArr[i8] = new z();
                    } else {
                        enVarArr[i8] = ((c5) enVarArr[iD0]).o(j4, yVar2.n3);
                    }
                }
            }
        }
    }

    @Override // ur.d0, ur.jz
    public boolean y() {
        return this.f1719hw.y();
    }

    public final c5<com.google.android.exoplayer2.source.dash.y> z(y yVar, c cVar, long j4) {
        rs rsVarN3;
        int i;
        rs rsVarN32;
        int i5;
        int i8 = yVar.f1727a;
        boolean z = i8 != -1;
        v.zn znVarF = null;
        if (z) {
            rsVarN3 = this.z.n3(i8);
            i = 1;
        } else {
            rsVarN3 = null;
            i = 0;
        }
        int i10 = yVar.f1728fb;
        boolean z5 = i10 != -1;
        if (z5) {
            rsVarN32 = this.z.n3(i10);
            i += rsVarN32.y;
        } else {
            rsVarN32 = null;
        }
        g[] gVarArr = new g[i];
        int[] iArr = new int[i];
        if (z) {
            gVarArr[0] = rsVarN3.zn(0);
            iArr[0] = 5;
            i5 = 1;
        } else {
            i5 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z5) {
            for (int i11 = 0; i11 < rsVarN32.y; i11++) {
                g gVarZn = rsVarN32.zn(i11);
                gVarArr[i5] = gVarZn;
                iArr[i5] = 3;
                arrayList.add(gVarZn);
                i5++;
            }
        }
        if (this.f1720j5.f7429gv && z) {
            znVarF = this.n.f();
        }
        v.zn znVar = znVarF;
        c5<com.google.android.exoplayer2.source.dash.y> c5Var = new c5<>(yVar.n3, iArr, gVarArr, this.f1725v.y(this.f1721p, this.f1720j5, this.f1724t, this.qn, yVar.y, cVar, yVar.n3, this.w, z, arrayList, znVar, this.f1718fb, this.f1715d), this, this.f1714co, j4, this.f1723s, this.fh, this.f1717f, this.d0);
        synchronized (this) {
            this.c.put(c5Var, znVar);
        }
        return c5Var;
    }

    @Override // ur.d0, ur.jz
    public long zn() {
        return this.f1719hw.zn();
    }
}
