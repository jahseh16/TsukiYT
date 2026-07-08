package nr;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import b1.fh;
import b1.ta;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.v;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import ft.g;
import ft.p1;
import ft.q;
import ft.u0;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k4.c;
import k4.r;
import n0.ej;
import nr.a;
import r0.d0;
import r0.mg;
import r0.ta;
import ur.b;
import ur.en;
import ur.f7;
import ur.i4;
import ur.jz;
import ur.lc;
import ur.rs;
import v0.d;
import v0.n;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class p implements ta.n3<h6.a>, ta.a, jz, b1.wz, f7.gv {

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final Set<Integer> f7019g3 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    public boolean f7020ap;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, DrmInitData> f7021b;
    public final ArrayList<i9> c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final mg f7022co;
    public int[] ct;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f7023d;
    public final List<i9> d0;
    public Set<rs> dm;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7024e;

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    public boolean[] f7025eb;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final Handler f7026ej;
    public int en;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r0.n3 f7027f;
    public final int f3;
    public boolean f7;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final n3 f7028fb;
    public final Runnable fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    @Nullable
    public h6.a f7029hw;
    public SparseIntArray j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public gv[] f7030j5;
    public g jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7031k;

    /* JADX INFO: renamed from: kp, reason: collision with root package name */
    @Nullable
    public DrmInitData f7032kp;

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    public boolean[] f7033lc;

    /* JADX INFO: renamed from: nf, reason: collision with root package name */
    public long f7034nf;
    public Set<Integer> o;
    public int o4;
    public b1.ta oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v.y f7035p;
    public int q9;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b.y f7036r;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public long f7037ra;

    /* JADX INFO: renamed from: rb, reason: collision with root package name */
    @Nullable
    public i9 f7038rb;
    public boolean rs;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f7039s;
    public boolean s8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final g f7040t;

    @Nullable
    public g u;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public int f7041ut;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f7042v;
    public final com.google.android.exoplayer2.drm.a w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList<tl> f7043x;
    public lc xg;
    public final String y;
    public boolean y5;

    /* JADX INFO: renamed from: yc, reason: collision with root package name */
    public long f7044yc;

    /* JADX INFO: renamed from: yg, reason: collision with root package name */
    public boolean f7045yg;
    public final ta z = new ta("Loader:HlsSampleStreamWrapper");
    public final a.n3 n = new a.n3();
    public int[] qn = new int[0];

    public static final class gv extends f7 {

        /* JADX INFO: renamed from: ej, reason: collision with root package name */
        public final Map<String, DrmInitData> f7046ej;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        @Nullable
        public DrmInitData f7047ud;

        @Override // ur.f7, b1.ta
        public void a(long j, int i, int i5, int i8, @Nullable ta.y yVar) {
            super.a(j, i, i5, i8, yVar);
        }

        public void eb(@Nullable DrmInitData drmInitData) {
            this.f7047ud = drmInitData;
            ud();
        }

        @Override // ur.f7
        public g i4(g gVar) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.f7047ud;
            if (drmInitData2 == null) {
                drmInitData2 = gVar.d0;
            }
            if (drmInitData2 != null && (drmInitData = this.f7046ej.get(drmInitData2.f1510fb)) != null) {
                drmInitData2 = drmInitData;
            }
            Metadata metadataRs = rs(gVar.z);
            if (drmInitData2 != gVar.d0 || metadataRs != gVar.z) {
                gVar = gVar.n3().vl(drmInitData2).en(metadataRs).z6();
            }
            return super.i4(gVar);
        }

        public void lc(i9 i9Var) {
            ct(i9Var.f7004f);
        }

        @Nullable
        public final Metadata rs(@Nullable Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int iV = metadata.v();
            int i = 0;
            int i5 = 0;
            while (true) {
                if (i5 >= iV) {
                    i5 = -1;
                    break;
                }
                Metadata.Entry entryGv = metadata.gv(i5);
                if ((entryGv instanceof PrivFrame) && "com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame) entryGv).f1628v)) {
                    break;
                }
                i5++;
            }
            if (i5 == -1) {
                return metadata;
            }
            if (iV == 1) {
                return null;
            }
            Metadata.Entry[] entryArr = new Metadata.Entry[iV - 1];
            while (i < iV) {
                if (i != i5) {
                    entryArr[i < i5 ? i : i - 1] = metadata.gv(i);
                }
                i++;
            }
            return new Metadata(entryArr);
        }

        public gv(r0.n3 n3Var, com.google.android.exoplayer2.drm.a aVar, v.y yVar, Map<String, DrmInitData> map) {
            super(n3Var, aVar, yVar);
            this.f7046ej = map;
        }
    }

    public interface n3 extends jz.y<p> {
        void onPrepared();

        void tl(Uri uri);
    }

    public static class zn implements b1.ta {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public static final g f7048fb = new g.n3().o4("application/id3").z6();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final g f7049s = new g.n3().o4("application/x-emsg").z6();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7050a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public g f7051gv;
        public final b1.ta n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public byte[] f7052v;
        public final qg.y y = new qg.y();
        public final g zn;

        public zn(b1.ta taVar, int i) {
            this.n3 = taVar;
            if (i == 1) {
                this.zn = f7048fb;
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i);
                }
                this.zn = f7049s;
            }
            this.f7052v = new byte[0];
            this.f7050a = 0;
        }

        @Override // b1.ta
        public void a(long j, int i, int i5, int i8, @Nullable ta.y yVar) {
            v0.y.v(this.f7051gv);
            d dVarC5 = c5(i5, i8);
            if (!ut.zn(this.f7051gv.f3, this.zn.f3)) {
                if (!"application/x-emsg".equals(this.f7051gv.f3)) {
                    r.c5("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f7051gv.f3);
                    return;
                }
                EventMessage eventMessageZn = this.y.zn(dVarC5);
                if (!fb(eventMessageZn)) {
                    r.c5("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.zn.f3, eventMessageZn.p()));
                    return;
                }
                dVarC5 = new d((byte[]) v0.y.v(eventMessageZn.tg()));
            }
            int iY = dVarC5.y();
            this.n3.n3(dVarC5, iY);
            this.n3.a(j, i, iY, i8, yVar);
        }

        public final d c5(int i, int i5) {
            int i8 = this.f7050a - i5;
            d dVar = new d(Arrays.copyOfRange(this.f7052v, i8 - i, i8));
            byte[] bArr = this.f7052v;
            System.arraycopy(bArr, i8, bArr, 0, i5);
            this.f7050a = i5;
            return dVar;
        }

        public final boolean fb(EventMessage eventMessage) {
            g gVarP = eventMessage.p();
            return gVarP != null && ut.zn(this.zn.f3, gVarP.f3);
        }

        @Override // b1.ta
        public int gv(r0.c5 c5Var, int i, boolean z, int i5) throws IOException {
            s(this.f7050a + i);
            int i8 = c5Var.read(this.f7052v, this.f7050a, i);
            if (i8 != -1) {
                this.f7050a += i8;
                return i8;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // b1.ta
        public /* synthetic */ void n3(d dVar, int i) {
            b1.mg.n3(this, dVar, i);
        }

        public final void s(int i) {
            byte[] bArr = this.f7052v;
            if (bArr.length < i) {
                this.f7052v = Arrays.copyOf(bArr, i + (i / 2));
            }
        }

        @Override // b1.ta
        public /* synthetic */ int v(r0.c5 c5Var, int i, boolean z) {
            return b1.mg.y(this, c5Var, i, z);
        }

        @Override // b1.ta
        public void y(g gVar) {
            this.f7051gv = gVar;
            this.n3.y(this.zn);
        }

        @Override // b1.ta
        public void zn(d dVar, int i, int i5) {
            s(this.f7050a + i);
            dVar.t(this.f7052v, this.f7050a, i);
            this.f7050a += i;
        }
    }

    public p(String str, int i, n3 n3Var, a aVar, Map<String, DrmInitData> map, r0.n3 n3Var2, long j, @Nullable g gVar, com.google.android.exoplayer2.drm.a aVar2, v.y yVar, mg mgVar, b.y yVar2, int i5) {
        this.y = str;
        this.f7042v = i;
        this.f7028fb = n3Var;
        this.f7039s = aVar;
        this.f7021b = map;
        this.f7027f = n3Var2;
        this.f7040t = gVar;
        this.w = aVar2;
        this.f7035p = yVar;
        this.f7022co = mgVar;
        this.f7036r = yVar2;
        this.f3 = i5;
        Set<Integer> set = f7019g3;
        this.o = new HashSet(set.size());
        this.j = new SparseIntArray(set.size());
        this.f7030j5 = new gv[0];
        this.f7033lc = new boolean[0];
        this.f7025eb = new boolean[0];
        ArrayList<i9> arrayList = new ArrayList<>();
        this.c = arrayList;
        this.d0 = Collections.unmodifiableList(arrayList);
        this.f7043x = new ArrayList<>();
        this.fh = new Runnable() { // from class: nr.xc
            @Override // java.lang.Runnable
            public final void run() {
                this.y.j();
            }
        };
        this.f7023d = new Runnable() { // from class: nr.w
            @Override // java.lang.Runnable
            public final void run() {
                this.y.y5();
            }
        };
        this.f7026ej = ut.i4();
        this.f7034nf = j;
        this.f7037ra = j;
    }

    public static int b(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    private void d(int i) {
        v0.y.fb(!this.z.i9());
        while (true) {
            if (i >= this.c.size()) {
                i = -1;
                break;
            } else if (n(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = a8().f5289s;
        i9 i9VarZ6 = z6(i);
        if (this.c.isEmpty()) {
            this.f7037ra = this.f7034nf;
        } else {
            ((i9) c.gv(this.c)).xc();
        }
        this.f7020ap = false;
        this.f7036r.mg(this.f7041ut, i9VarZ6.f5287fb, j);
    }

    public static b1.f d0(int i, int i5) {
        r.c5("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i5);
        return new b1.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (!this.y5 && this.ct == null && this.f7031k) {
            for (gv gvVar : this.f7030j5) {
                if (gvVar.d() == null) {
                    return;
                }
            }
            if (this.xg != null) {
                o();
                return;
            }
            f3();
            ra();
            this.f7028fb.onPrepared();
        }
    }

    private void o4() {
        for (gv gvVar : this.f7030j5) {
            gvVar.q9(this.f7024e);
        }
        this.f7024e = false;
    }

    public static g ta(@Nullable g gVar, g gVar2, boolean z) {
        String strGv;
        String strFb;
        if (gVar == null) {
            return gVar2;
        }
        int iF = n.f(gVar2.f3);
        if (ut.x(gVar.f4778co, iF) == 1) {
            strGv = ut.b(gVar.f4778co, iF);
            strFb = n.fb(strGv);
        } else {
            strGv = n.gv(gVar.f4778co, gVar2.f3);
            strFb = gVar2.f3;
        }
        g.n3 n3VarX = gVar2.n3().oz(gVar.y).q9(gVar.f4791v).k(gVar.f4782fb).eb(gVar.f4788s).dm(gVar.f4781f).ud(z ? gVar.f4789t : -1).u(z ? gVar.w : -1).x(strGv);
        if (iF == 2) {
            n3VarX.s8(gVar.f4779d).o(gVar.f4780ej).qn(gVar.f4792x);
        }
        if (strFb != null) {
            n3VarX.o4(strFb);
        }
        int i = gVar.j;
        if (i != -1 && iF == 1) {
            n3VarX.a8(i);
        }
        Metadata metadataN3 = gVar.z;
        if (metadataN3 != null) {
            Metadata metadata = gVar2.z;
            if (metadata != null) {
                metadataN3 = metadata.n3(metadataN3);
            }
            n3VarX.en(metadataN3);
        }
        return n3VarX.z6();
    }

    public static boolean ud(g gVar, g gVar2) {
        String str = gVar.f3;
        String str2 = gVar2.f3;
        int iF = n.f(str);
        if (iF != 3) {
            return iF == n.f(str2);
        }
        if (ut.zn(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || gVar.f7 == gVar2.f7;
        }
        return false;
    }

    private boolean vl() {
        return this.f7037ra != -9223372036854775807L;
    }

    private static boolean yt(h6.a aVar) {
        return aVar instanceof i9;
    }

    @Override // b1.wz
    public b1.ta a(int i, int i5) {
        b1.ta taVarRz;
        if (!f7019g3.contains(Integer.valueOf(i5))) {
            int i8 = 0;
            while (true) {
                b1.ta[] taVarArr = this.f7030j5;
                if (i8 >= taVarArr.length) {
                    taVarRz = null;
                    break;
                }
                if (this.qn[i8] == i) {
                    taVarRz = taVarArr[i8];
                    break;
                }
                i8++;
            }
        } else {
            taVarRz = x(i, i5);
        }
        if (taVarRz == null) {
            if (this.f7045yg) {
                return d0(i, i5);
            }
            taVarRz = rz(i, i5);
        }
        if (i5 != 5) {
            return taVarRz;
        }
        if (this.oz == null) {
            this.oz = new zn(taVarRz, this.f3);
        }
        return this.oz;
    }

    public final i9 a8() {
        return this.c.get(r0.size() - 1);
    }

    public int ap(int i, long j) {
        if (vl()) {
            return 0;
        }
        gv gvVar = this.f7030j5[i];
        int iTa = gvVar.ta(j, this.f7020ap);
        i9 i9Var = (i9) c.v(this.c, null);
        if (i9Var != null && !i9Var.p()) {
            iTa = Math.min(iTa, i9Var.tl(i) - gvVar.rz());
        }
        gvVar.dm(iTa);
        return iTa;
    }

    public void c() {
        if (this.f7) {
            return;
        }
        v(this.f7034nf);
    }

    public void co(long j, boolean z) {
        if (!this.f7031k || vl()) {
            return;
        }
        int length = this.f7030j5.length;
        for (int i = 0; i < length; i++) {
            this.f7030j5[i].p(j, z, this.f7025eb[i]);
        }
    }

    public void ct() {
        if (this.f7) {
            for (gv gvVar : this.f7030j5) {
                gvVar.qn();
            }
        }
        this.z.tl(this);
        this.f7026ej.removeCallbacksAndMessages(null);
        this.y5 = true;
        this.f7043x.clear();
    }

    public int dm(int i, u0 u0Var, di.fb fbVar, int i5) {
        if (vl()) {
            return -3;
        }
        int i8 = 0;
        if (!this.c.isEmpty()) {
            int i10 = 0;
            while (i10 < this.c.size() - 1 && ej(this.c.get(i10))) {
                i10++;
            }
            ut.w2(this.c, 0, i10);
            i9 i9Var = this.c.get(0);
            g gVar = i9Var.f5288gv;
            if (!gVar.equals(this.u)) {
                this.f7036r.c5(this.f7042v, gVar, i9Var.f5290v, i9Var.f5285a, i9Var.f5287fb);
            }
            this.u = gVar;
        }
        if (!this.c.isEmpty() && !this.c.get(0).p()) {
            return -3;
        }
        int iO = this.f7030j5[i].o(u0Var, fbVar, i5, this.f7020ap);
        if (iO == -5) {
            g gVarF = (g) v0.y.v(u0Var.n3);
            if (i == this.q9) {
                int iJ5 = this.f7030j5[i].j5();
                while (i8 < this.c.size() && this.c.get(i8).f7004f != iJ5) {
                    i8++;
                }
                gVarF = gVarF.f(i8 < this.c.size() ? this.c.get(i8).f5288gv : (g) v0.y.v(this.jz));
            }
            u0Var.n3 = gVarF;
        }
        return iO;
    }

    public void e(boolean z) {
        this.f7039s.z(z);
    }

    public boolean eb(long j, boolean z) {
        this.f7034nf = j;
        if (vl()) {
            this.f7037ra = j;
            return true;
        }
        if (this.f7031k && !z && rs(j)) {
            return false;
        }
        this.f7037ra = j;
        this.f7020ap = false;
        this.c.clear();
        if (this.z.i9()) {
            if (this.f7031k) {
                for (gv gvVar : this.f7030j5) {
                    gvVar.mt();
                }
            }
            this.z.a();
        } else {
            this.z.fb();
            o4();
        }
        return true;
    }

    public final boolean ej(i9 i9Var) {
        int i = i9Var.f7004f;
        int length = this.f7030j5.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (this.f7025eb[i5] && this.f7030j5[i5].j5() == i) {
                return false;
            }
        }
        return true;
    }

    public void en() {
        this.o.clear();
    }

    public final void f3() {
        g gVar;
        int length = this.f7030j5.length;
        int i = 0;
        int i5 = -2;
        int i8 = -1;
        while (true) {
            if (i >= length) {
                break;
            }
            String str = ((g) v0.y.c5(this.f7030j5[i].d())).f3;
            int i10 = n.co(str) ? 2 : n.xc(str) ? 1 : n.mt(str) ? 3 : -2;
            if (b(i10) > b(i5)) {
                i8 = i;
                i5 = i10;
            } else if (i10 == i5 && i8 != -1) {
                i8 = -1;
            }
            i++;
        }
        rs rsVarI9 = this.f7039s.i9();
        int i11 = rsVarI9.y;
        this.o4 = -1;
        this.ct = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            this.ct[i12] = i12;
        }
        rs[] rsVarArr = new rs[length];
        int i13 = 0;
        while (i13 < length) {
            g gVar2 = (g) v0.y.c5(this.f7030j5[i13].d());
            if (i13 == i8) {
                g[] gVarArr = new g[i11];
                for (int i14 = 0; i14 < i11; i14++) {
                    g gVarZn = rsVarI9.zn(i14);
                    if (i5 == 1 && (gVar = this.f7040t) != null) {
                        gVarZn = gVarZn.f(gVar);
                    }
                    gVarArr[i14] = i11 == 1 ? gVar2.f(gVarZn) : ta(gVarZn, gVar2, true);
                }
                rsVarArr[i13] = new rs(this.y, gVarArr);
                this.o4 = i13;
            } else {
                g gVar3 = (i5 == 2 && n.xc(gVar2.f3)) ? this.f7040t : null;
                StringBuilder sb = new StringBuilder();
                sb.append(this.y);
                sb.append(":muxed:");
                sb.append(i13 < i8 ? i13 : i13 - 1);
                rsVarArr[i13] = new rs(sb.toString(), ta(gVar3, gVar2, false));
            }
            i13++;
        }
        this.xg = mg(rsVarArr);
        v0.y.fb(this.dm == null);
        this.dm = Collections.emptySet();
    }

    @Override // r0.ta.n3
    /* JADX INFO: renamed from: f7, reason: merged with bridge method [inline-methods] */
    public ta.zn fh(h6.a aVar, long j, long j4, IOException iOException, int i) {
        ta.zn znVarS;
        int i5;
        boolean zYt = yt(aVar);
        if (zYt && !((i9) aVar).p() && (iOException instanceof d0.v) && ((i5 = ((d0.v) iOException).responseCode) == 410 || i5 == 404)) {
            return r0.ta.f7550gv;
        }
        long jY = aVar.y();
        i4 i4Var = new i4(aVar.y, aVar.n3, aVar.gv(), aVar.zn(), j, j4, jY);
        mg.zn znVar = new mg.zn(i4Var, new ur.c(aVar.zn, this.f7042v, aVar.f5288gv, aVar.f5290v, aVar.f5285a, ut.gf(aVar.f5287fb), ut.gf(aVar.f5289s)), iOException, i);
        mg.n3 n3VarN3 = this.f7022co.n3(ej.zn(this.f7039s.f()), znVar);
        boolean zTl = (n3VarN3 == null || n3VarN3.y != 2) ? false : this.f7039s.tl(aVar, n3VarN3.n3);
        if (zTl) {
            if (zYt && jY == 0) {
                ArrayList<i9> arrayList = this.c;
                v0.y.fb(arrayList.remove(arrayList.size() - 1) == aVar);
                if (this.c.isEmpty()) {
                    this.f7037ra = this.f7034nf;
                } else {
                    ((i9) c.gv(this.c)).xc();
                }
            }
            znVarS = r0.ta.f7548a;
        } else {
            long jY2 = this.f7022co.y(znVar);
            znVarS = jY2 != -9223372036854775807L ? r0.ta.s(false, jY2) : r0.ta.f7549fb;
        }
        ta.zn znVar2 = znVarS;
        boolean zZn = znVar2.zn();
        this.f7036r.i4(i4Var, aVar.zn, this.f7042v, aVar.f5288gv, aVar.f5290v, aVar.f5285a, aVar.f5287fb, aVar.f5289s, iOException, !zZn);
        if (!zZn) {
            this.f7029hw = null;
            this.f7022co.gv(aVar.y);
        }
        if (zTl) {
            if (this.f7) {
                this.f7028fb.a(this);
            } else {
                v(this.f7034nf);
            }
        }
        return znVar2;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    @Override // ur.jz
    public long fb() {
        /*
            r7 = this;
            boolean r0 = r7.f7020ap
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.vl()
            if (r0 == 0) goto L10
            long r0 = r7.f7037ra
            return r0
        L10:
            long r0 = r7.f7034nf
            nr.i9 r2 = r7.a8()
            boolean r3 = r2.a()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList<nr.i9> r2 = r7.c
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList<nr.i9> r2 = r7.c
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            nr.i9 r2 = (nr.i9) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.f5289s
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r7.f7031k
            if (r2 == 0) goto L55
            nr.p$gv[] r2 = r7.f7030j5
            int r3 = r2.length
            r4 = 0
        L46:
            if (r4 >= r3) goto L55
            r5 = r2[r4]
            long r5 = r5.c()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L46
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nr.p.fb():long");
    }

    public long gv(long j, p1 p1Var) {
        return this.f7039s.n3(j, p1Var);
    }

    public boolean hw(int i) {
        return !vl() && this.f7030j5[i].x(this.f7020ap);
    }

    public int i4(int i) {
        x4();
        v0.y.v(this.ct);
        int i5 = this.ct[i];
        if (i5 == -1) {
            return this.dm.contains(this.xg.n3(i)) ? -3 : -2;
        }
        boolean[] zArr = this.f7025eb;
        if (zArr[i5]) {
            return -2;
        }
        zArr[i5] = true;
        return i5;
    }

    public boolean jz(Uri uri, mg.zn znVar, boolean z) {
        mg.n3 n3VarN3;
        if (!this.f7039s.xc(uri)) {
            return true;
        }
        long j = (z || (n3VarN3 = this.f7022co.n3(ej.zn(this.f7039s.f()), znVar)) == null || n3VarN3.y != 2) ? -9223372036854775807L : n3VarN3.n3;
        return this.f7039s.p(uri, j) && j != -9223372036854775807L;
    }

    @Override // r0.ta.n3
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void xc(h6.a aVar, long j, long j4) {
        this.f7029hw = null;
        this.f7039s.w(aVar);
        i4 i4Var = new i4(aVar.y, aVar.n3, aVar.gv(), aVar.zn(), j, j4, aVar.y());
        this.f7022co.gv(aVar.y);
        this.f7036r.r(i4Var, aVar.zn, this.f7042v, aVar.f5288gv, aVar.f5290v, aVar.f5285a, aVar.f5287fb, aVar.f5289s);
        if (this.f7) {
            this.f7028fb.a(this);
        } else {
            v(this.f7034nf);
        }
    }

    public final void k5(i9 i9Var) {
        this.f7038rb = i9Var;
        this.jz = i9Var.f5288gv;
        this.f7037ra = -9223372036854775807L;
        this.c.add(i9Var);
        r.y yVarN = k4.r.n();
        for (gv gvVar : this.f7030j5) {
            yVarN.y(Integer.valueOf(gvVar.z6()));
        }
        i9Var.wz(this, yVarN.f());
        for (gv gvVar2 : this.f7030j5) {
            gvVar2.lc(i9Var);
            if (i9Var.f7013wz) {
                gvVar2.o4();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean lc(n0.c[] r20, boolean[] r21, ur.en[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr.p.lc(n0.c[], boolean[], ur.en[], boolean[], long, boolean):boolean");
    }

    public final lc mg(rs[] rsVarArr) {
        for (int i = 0; i < rsVarArr.length; i++) {
            rs rsVar = rsVarArr[i];
            g[] gVarArr = new g[rsVar.y];
            for (int i5 = 0; i5 < rsVar.y; i5++) {
                g gVarZn = rsVar.zn(i5);
                gVarArr[i5] = gVarZn.zn(this.w.zn(gVarZn));
            }
            rsVarArr[i] = new rs(rsVar.f8639v, gVarArr);
        }
        return new lc(rsVarArr);
    }

    public lc mt() {
        x4();
        return this.xg;
    }

    public final boolean n(int i) {
        for (int i5 = i; i5 < this.c.size(); i5++) {
            if (this.c.get(i5).f7013wz) {
                return false;
            }
        }
        i9 i9Var = this.c.get(i);
        for (int i8 = 0; i8 < this.f7030j5.length; i8++) {
            if (this.f7030j5[i8].rz() > i9Var.tl(i8)) {
                return false;
            }
        }
        return true;
    }

    public void nf(@Nullable DrmInitData drmInitData) {
        if (ut.zn(this.f7032kp, drmInitData)) {
            return;
        }
        this.f7032kp = drmInitData;
        int i = 0;
        while (true) {
            gv[] gvVarArr = this.f7030j5;
            if (i >= gvVarArr.length) {
                return;
            }
            if (this.f7033lc[i]) {
                gvVarArr[i].eb(drmInitData);
            }
            i++;
        }
    }

    public final void o() {
        int i = this.xg.y;
        int[] iArr = new int[i];
        this.ct = iArr;
        Arrays.fill(iArr, -1);
        for (int i5 = 0; i5 < i; i5++) {
            int i8 = 0;
            while (true) {
                gv[] gvVarArr = this.f7030j5;
                if (i8 >= gvVarArr.length) {
                    break;
                }
                if (ud((g) v0.y.c5(gvVarArr[i8].d()), this.xg.n3(i5).zn(0))) {
                    this.ct[i5] = i8;
                    break;
                }
                i8++;
            }
        }
        Iterator<tl> it = this.f7043x.iterator();
        while (it.hasNext()) {
            it.next().y();
        }
    }

    public void oz() throws IOException {
        this.z.n3();
        this.f7039s.wz();
    }

    @Override // b1.wz
    public void p() {
        this.f7045yg = true;
        this.f7026ej.post(this.f7023d);
    }

    @Override // r0.ta.n3
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public void j5(h6.a aVar, long j, long j4, boolean z) {
        this.f7029hw = null;
        i4 i4Var = new i4(aVar.y, aVar.n3, aVar.gv(), aVar.zn(), j, j4, aVar.y());
        this.f7022co.gv(aVar.y);
        this.f7036r.mt(i4Var, aVar.zn, this.f7042v, aVar.f5288gv, aVar.f5290v, aVar.f5285a, aVar.f5287fb, aVar.f5289s);
        if (z) {
            return;
        }
        if (vl() || this.en == 0) {
            o4();
        }
        if (this.en > 0) {
            this.f7028fb.a(this);
        }
    }

    public boolean qn() {
        return this.f7041ut == 2;
    }

    public final void ra() {
        this.f7 = true;
    }

    public final boolean rs(long j) {
        int length = this.f7030j5.length;
        for (int i = 0; i < length; i++) {
            if (!this.f7030j5[i].en(j, false) && (this.f7033lc[i] || !this.rs)) {
                return false;
            }
        }
        return true;
    }

    public final f7 rz(int i, int i5) {
        int length = this.f7030j5.length;
        boolean z = true;
        if (i5 != 1 && i5 != 2) {
            z = false;
        }
        gv gvVar = new gv(this.f7027f, this.w, this.f7035p, this.f7021b);
        gvVar.u(this.f7034nf);
        if (z) {
            gvVar.eb(this.f7032kp);
        }
        gvVar.jz(this.f7044yc);
        i9 i9Var = this.f7038rb;
        if (i9Var != null) {
            gvVar.lc(i9Var);
        }
        gvVar.xg(this);
        int i8 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.qn, i8);
        this.qn = iArrCopyOf;
        iArrCopyOf[length] = i;
        this.f7030j5 = (gv[]) ut.cy(this.f7030j5, gvVar);
        boolean[] zArrCopyOf = Arrays.copyOf(this.f7033lc, i8);
        this.f7033lc = zArrCopyOf;
        zArrCopyOf[length] = z;
        this.rs |= z;
        this.o.add(Integer.valueOf(i5));
        this.j.append(i5, length);
        if (b(i5) > b(this.f7041ut)) {
            this.q9 = length;
            this.f7041ut = i5;
        }
        this.f7025eb = Arrays.copyOf(this.f7025eb, i8);
        return gvVar;
    }

    @Override // ur.jz
    public void s(long j) {
        if (this.z.c5() || vl()) {
            return;
        }
        if (this.z.i9()) {
            v0.y.v(this.f7029hw);
            if (this.f7039s.x4(j, this.f7029hw, this.d0)) {
                this.z.a();
                return;
            }
            return;
        }
        int size = this.d0.size();
        while (size > 0 && this.f7039s.zn(this.d0.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.d0.size()) {
            d(size);
        }
        int iS = this.f7039s.s(j, this.d0);
        if (iS < this.c.size()) {
            d(iS);
        }
    }

    public void s8(long j) {
        if (this.f7044yc != j) {
            this.f7044yc = j;
            for (gv gvVar : this.f7030j5) {
                gvVar.jz(j);
            }
        }
    }

    @Override // r0.ta.a
    public void tl() {
        for (gv gvVar : this.f7030j5) {
            gvVar.j();
        }
    }

    public void u() {
        if (this.c.isEmpty()) {
            return;
        }
        i9 i9Var = (i9) c.gv(this.c);
        int iZn = this.f7039s.zn(i9Var);
        if (iZn == 1) {
            i9Var.x4();
        } else if (iZn == 2 && !this.f7020ap && this.z.i9()) {
            this.z.a();
        }
    }

    public void ut(int i) throws IOException {
        oz();
        this.f7030j5[i].yt();
    }

    @Override // ur.jz
    public boolean v(long j) {
        List<i9> listEmptyList;
        long jMax;
        if (this.f7020ap || this.z.i9() || this.z.c5()) {
            return false;
        }
        if (vl()) {
            listEmptyList = Collections.emptyList();
            jMax = this.f7037ra;
            for (gv gvVar : this.f7030j5) {
                gvVar.u(this.f7037ra);
            }
        } else {
            listEmptyList = this.d0;
            i9 i9VarA8 = a8();
            jMax = i9VarA8.a() ? i9VarA8.f5289s : Math.max(this.f7034nf, i9VarA8.f5287fb);
        }
        List<i9> list = listEmptyList;
        long j4 = jMax;
        this.n.y();
        this.f7039s.v(j, j4, list, this.f7 || !list.isEmpty(), this.n);
        a.n3 n3Var = this.n;
        boolean z = n3Var.n3;
        h6.a aVar = n3Var.y;
        Uri uri = n3Var.zn;
        if (z) {
            this.f7037ra = -9223372036854775807L;
            this.f7020ap = true;
            return true;
        }
        if (aVar == null) {
            if (uri != null) {
                this.f7028fb.tl(uri);
            }
            return false;
        }
        if (yt(aVar)) {
            k5((i9) aVar);
        }
        this.f7029hw = aVar;
        this.f7036r.d0(new i4(aVar.y, aVar.n3, this.z.wz(aVar, this, this.f7022co.zn(aVar.zn))), aVar.zn, this.f7042v, aVar.f5288gv, aVar.f5290v, aVar.f5285a, aVar.f5287fb, aVar.f5289s);
        return true;
    }

    @Override // ur.f7.gv
    public void w(g gVar) {
        this.f7026ej.post(this.fh);
    }

    public void wz() throws IOException {
        oz();
        if (this.f7020ap && !this.f7) {
            throw q.y("Loading finished before preparation is complete.", null);
        }
    }

    @Nullable
    public final b1.ta x(int i, int i5) {
        v0.y.y(f7019g3.contains(Integer.valueOf(i5)));
        int i8 = this.j.get(i5, -1);
        if (i8 == -1) {
            return null;
        }
        if (this.o.add(Integer.valueOf(i5))) {
            this.qn[i8] = i;
        }
        return this.qn[i8] == i ? this.f7030j5[i8] : d0(i, i5);
    }

    public final void x4() {
        v0.y.fb(this.f7);
        v0.y.v(this.xg);
        v0.y.v(this.dm);
    }

    public void xg(rs[] rsVarArr, int i, int... iArr) {
        this.xg = mg(rsVarArr);
        this.dm = new HashSet();
        for (int i5 : iArr) {
            this.dm.add(this.xg.n3(i5));
        }
        this.o4 = i;
        Handler handler = this.f7026ej;
        final n3 n3Var = this.f7028fb;
        Objects.requireNonNull(n3Var);
        handler.post(new Runnable() { // from class: nr.wz
            @Override // java.lang.Runnable
            public final void run() {
                n3Var.onPrepared();
            }
        });
        ra();
    }

    @Override // ur.jz
    public boolean y() {
        return this.z.i9();
    }

    public final void y5() {
        this.f7031k = true;
        j();
    }

    public final void yc(en[] enVarArr) {
        this.f7043x.clear();
        for (en enVar : enVarArr) {
            if (enVar != null) {
                this.f7043x.add((tl) enVar);
            }
        }
    }

    public void yg(int i) {
        x4();
        v0.y.v(this.ct);
        int i5 = this.ct[i];
        v0.y.fb(this.f7025eb[i5]);
        this.f7025eb[i5] = false;
    }

    public final i9 z6(int i) {
        i9 i9Var = this.c.get(i);
        ArrayList<i9> arrayList = this.c;
        ut.w2(arrayList, i, arrayList.size());
        for (int i5 = 0; i5 < this.f7030j5.length; i5++) {
            this.f7030j5[i5].r(i9Var.tl(i5));
        }
        return i9Var;
    }

    @Override // ur.jz
    public long zn() {
        if (vl()) {
            return this.f7037ra;
        }
        if (this.f7020ap) {
            return Long.MIN_VALUE;
        }
        return a8().f5289s;
    }

    @Override // b1.wz
    public void z(fh fhVar) {
    }
}
