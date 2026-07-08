package nr;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.v;
import com.google.android.exoplayer2.metadata.Metadata;
import ft.g;
import ft.p1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import nr.p;
import os.s;
import os.t;
import r0.mg;
import r0.o;
import ur.b;
import ur.d0;
import ur.en;
import ur.jz;
import ur.lc;
import ur.rs;
import v0.n;
import v0.ut;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public final class t implements d0, t.n3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lc f7053b;
    public final int c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final r0.n3 f7054co;
    public final boolean d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    @Nullable
    public d0.y f7056ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.a f7057f;
    public final ur.c5 f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final fb f7058fb;
    public final gn fh;
    public jz j;
    public final boolean n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b.y f7061p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final o f7063s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v.y f7064t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final os.t f7065v;
    public final mg w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7066x;
    public final s y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p.n3 f7055d = new n3();
    public final IdentityHashMap<en, Integer> z = new IdentityHashMap<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final co f7062r = new co();

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public p[] f7059hw = new p[0];

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public p[] f7060j5 = new p[0];
    public int[][] qn = new int[0][];

    public class n3 implements p.n3 {
        public n3() {
        }

        @Override // nr.p.n3
        public void onPrepared() {
            if (t.tl(t.this) > 0) {
                return;
            }
            int i = 0;
            for (p pVar : t.this.f7059hw) {
                i += pVar.mt().y;
            }
            rs[] rsVarArr = new rs[i];
            int i5 = 0;
            for (p pVar2 : t.this.f7059hw) {
                int i8 = pVar2.mt().y;
                int i10 = 0;
                while (i10 < i8) {
                    rsVarArr[i5] = pVar2.mt().n3(i10);
                    i10++;
                    i5++;
                }
            }
            t.this.f7053b = new lc(rsVarArr);
            t.this.f7056ej.xc(t.this);
        }

        @Override // nr.p.n3
        public void tl(Uri uri) {
            t.this.f7065v.v(uri);
        }

        @Override // ur.jz.y
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void a(p pVar) {
            t.this.f7056ej.a(t.this);
        }
    }

    public t(s sVar, os.t tVar, fb fbVar, @Nullable o oVar, com.google.android.exoplayer2.drm.a aVar, v.y yVar, mg mgVar, b.y yVar2, r0.n3 n3Var, ur.c5 c5Var, boolean z, int i, boolean z5, gn gnVar) {
        this.y = sVar;
        this.f7065v = tVar;
        this.f7058fb = fbVar;
        this.f7063s = oVar;
        this.f7057f = aVar;
        this.f7064t = yVar;
        this.w = mgVar;
        this.f7061p = yVar2;
        this.f7054co = n3Var;
        this.f3 = c5Var;
        this.n = z;
        this.c = i;
        this.d0 = z5;
        this.fh = gnVar;
        this.j = c5Var.y(new jz[0]);
    }

    public static Map<String, DrmInitData> c(List<DrmInitData> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i = 0;
        while (i < arrayList.size()) {
            DrmInitData drmInitDataA = list.get(i);
            String str = drmInitDataA.f1510fb;
            i++;
            int i5 = i;
            while (i5 < arrayList.size()) {
                DrmInitData drmInitData = (DrmInitData) arrayList.get(i5);
                if (TextUtils.equals(drmInitData.f1510fb, str)) {
                    drmInitDataA = drmInitDataA.a(drmInitData);
                    arrayList.remove(i5);
                } else {
                    i5++;
                }
            }
            map.put(str, drmInitDataA);
        }
        return map;
    }

    public static g d0(g gVar) {
        String strB = ut.b(gVar.f4778co, 2);
        return new g.n3().oz(gVar.y).q9(gVar.f4791v).k5(gVar.f4787r).o4(n.fb(strB)).x(strB).en(gVar.z).ud(gVar.f4789t).u(gVar.w).s8(gVar.f4779d).o(gVar.f4780ej).qn(gVar.f4792x).eb(gVar.f4788s).dm(gVar.f4781f).z6();
    }

    public static g n(g gVar, @Nullable g gVar2, boolean z) {
        String strB;
        Metadata metadata;
        int i;
        String str;
        String str2;
        int i5;
        int i8;
        if (gVar2 != null) {
            strB = gVar2.f4778co;
            metadata = gVar2.z;
            i5 = gVar2.j;
            i = gVar2.f4788s;
            i8 = gVar2.f4781f;
            str = gVar2.f4782fb;
            str2 = gVar2.f4791v;
        } else {
            strB = ut.b(gVar.f4778co, 1);
            metadata = gVar.z;
            if (z) {
                i5 = gVar.j;
                i = gVar.f4788s;
                i8 = gVar.f4781f;
                str = gVar.f4782fb;
                str2 = gVar.f4791v;
            } else {
                i = 0;
                str = null;
                str2 = null;
                i5 = -1;
                i8 = 0;
            }
        }
        return new g.n3().oz(gVar.y).q9(str2).k5(gVar.f4787r).o4(n.fb(strB)).x(strB).en(metadata).ud(z ? gVar.f4789t : -1).u(z ? gVar.w : -1).a8(i5).eb(i).dm(i8).k(str).z6();
    }

    public static /* synthetic */ int tl(t tVar) {
        int i = tVar.f7066x - 1;
        tVar.f7066x = i;
        return i;
    }

    @Override // os.t.n3
    public void a() {
        for (p pVar : this.f7059hw) {
            pVar.u();
        }
        this.f7056ej.a(this);
    }

    @Override // ur.d0
    public void c5(d0.y yVar, long j) {
        this.f7056ej = yVar;
        this.f7065v.a(this);
        i4(j);
    }

    @Override // ur.d0
    public void co(long j, boolean z) {
        for (p pVar : this.f7060j5) {
            pVar.co(j, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    @Override // ur.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long f(n0.c[] r22, boolean[] r23, ur.en[] r24, boolean[] r25, long r26) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr.t.f(n0.c[], boolean[], ur.en[], boolean[], long):long");
    }

    public final p f3(String str, int i, Uri[] uriArr, g[] gVarArr, @Nullable g gVar, @Nullable List<g> list, Map<String, DrmInitData> map, long j) {
        return new p(str, i, this.f7055d, new a(this.y, this.f7065v, uriArr, gVarArr, this.f7058fb, this.f7063s, this.f7062r, list, this.fh), map, this.f7054co, j, gVar, this.f7057f, this.f7064t, this.w, this.f7061p, this.c);
    }

    @Override // ur.d0, ur.jz
    public long fb() {
        return this.j.fb();
    }

    public void fh() {
        this.f7065v.n3(this);
        for (p pVar : this.f7059hw) {
            pVar.ct();
        }
        this.f7056ej = null;
    }

    @Override // ur.d0
    public long gv(long j, p1 p1Var) {
        for (p pVar : this.f7060j5) {
            if (pVar.qn()) {
                return pVar.gv(j, p1Var);
            }
        }
        return j;
    }

    public final void i4(long j) {
        char c = 0;
        int i = 1;
        os.s sVar = (os.s) v0.y.v(this.f7065v.gv());
        Map<String, DrmInitData> mapC = this.d0 ? c(sVar.f7260tl) : Collections.emptyMap();
        boolean zIsEmpty = sVar.f7261v.isEmpty();
        List<s.y> list = sVar.f7255fb;
        List<s.y> list2 = sVar.f7258s;
        this.f7066x = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!zIsEmpty) {
            x4(sVar, j, arrayList, arrayList2, mapC);
        }
        r(j, list, arrayList, arrayList2, mapC);
        this.o = arrayList.size();
        int i5 = 0;
        while (i5 < list2.size()) {
            s.y yVar = list2.get(i5);
            String str = "subtitle:" + i5 + ":" + yVar.f7265gv;
            Uri[] uriArr = new Uri[i];
            uriArr[c] = yVar.y;
            g[] gVarArr = new g[i];
            gVarArr[c] = yVar.n3;
            ArrayList arrayList3 = arrayList2;
            int i8 = i5;
            p pVarF3 = f3(str, 3, uriArr, gVarArr, null, Collections.emptyList(), mapC, j);
            arrayList3.add(new int[]{i8});
            arrayList.add(pVarF3);
            pVarF3.xg(new rs[]{new rs(str, yVar.n3)}, 0, new int[0]);
            i5 = i8 + 1;
            arrayList2 = arrayList3;
            c = 0;
            i = 1;
        }
        this.f7059hw = (p[]) arrayList.toArray(new p[0]);
        this.qn = (int[][]) arrayList2.toArray(new int[0][]);
        this.f7066x = this.f7059hw.length;
        for (int i10 = 0; i10 < this.o; i10++) {
            this.f7059hw[i10].e(true);
        }
        for (p pVar : this.f7059hw) {
            pVar.c();
        }
        this.f7060j5 = this.f7059hw;
    }

    @Override // ur.d0
    public long i9(long j) {
        p[] pVarArr = this.f7060j5;
        if (pVarArr.length > 0) {
            boolean zEb = pVarArr[0].eb(j, false);
            int i = 1;
            while (true) {
                p[] pVarArr2 = this.f7060j5;
                if (i >= pVarArr2.length) {
                    break;
                }
                pVarArr2[i].eb(j, zEb);
                i++;
            }
            if (zEb) {
                this.f7062r.n3();
            }
        }
        return j;
    }

    @Override // ur.d0
    public lc mt() {
        return (lc) v0.y.v(this.f7053b);
    }

    @Override // os.t.n3
    public boolean n3(Uri uri, mg.zn znVar, boolean z) {
        boolean zJz = true;
        for (p pVar : this.f7059hw) {
            zJz &= pVar.jz(uri, znVar, z);
        }
        this.f7056ej.a(this);
        return zJz;
    }

    public final void r(long j, List<s.y> list, List<p> list2, List<int[]> list3, Map<String, DrmInitData> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).f7265gv;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z = true;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    if (ut.zn(str, list.get(i5).f7265gv)) {
                        s.y yVar = list.get(i5);
                        arrayList3.add(Integer.valueOf(i5));
                        arrayList.add(yVar.y);
                        arrayList2.add(yVar.n3);
                        z &= ut.x(yVar.n3.f4778co, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                p pVarF3 = f3(str2, 1, (Uri[]) arrayList.toArray((Uri[]) ut.f(new Uri[0])), (g[]) arrayList2.toArray(new g[0]), null, Collections.emptyList(), map, j);
                list3.add(n4.a.wz(arrayList3));
                list2.add(pVarF3);
                if (this.n && z) {
                    pVarF3.xg(new rs[]{new rs(str2, (g[]) arrayList2.toArray(new g[0]))}, 0, new int[0]);
                }
            }
        }
    }

    @Override // ur.d0, ur.jz
    public void s(long j) {
        this.j.s(j);
    }

    @Override // ur.d0
    public long t() {
        return -9223372036854775807L;
    }

    @Override // ur.d0, ur.jz
    public boolean v(long j) {
        if (this.f7053b != null) {
            return this.j.v(j);
        }
        for (p pVar : this.f7059hw) {
            pVar.c();
        }
        return false;
    }

    @Override // ur.d0
    public void wz() throws IOException {
        for (p pVar : this.f7059hw) {
            pVar.wz();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x4(os.s r21, long r22, java.util.List<nr.p> r24, java.util.List<int[]> r25, java.util.Map<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData> r26) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr.t.x4(os.s, long, java.util.List, java.util.List, java.util.Map):void");
    }

    @Override // ur.d0, ur.jz
    public boolean y() {
        return this.j.y();
    }

    @Override // ur.d0, ur.jz
    public long zn() {
        return this.j.zn();
    }
}
