package nr;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import ft.g;
import ft.p1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k4.r;
import n0.c;
import os.fb;
import r0.o;
import r0.p;
import ur.rs;
import v0.qn;
import v0.ut;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g[] f6976a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public final List<g> f6977c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public boolean f6978co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gn f6979f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final os.t f6980fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final co f6981gv;
    public final r0.tl n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f6984p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final rs f6985s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6986t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Uri[] f6988v;
    public boolean w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    @Nullable
    public IOException f6989wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    @Nullable
    public Uri f6990xc;
    public final s y;
    public final r0.tl zn;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final nr.v f6982i9 = new nr.v(4);

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public byte[] f6987tl = ut.f8757a;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public long f6983mt = -9223372036854775807L;

    public static final class gv extends n0.zn {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f6991s;

        public gv(rs rsVar, int[] iArr) {
            super(rsVar, iArr);
            this.f6991s = s(rsVar.zn(iArr[0]));
        }

        @Override // n0.c
        public int co() {
            return 0;
        }

        @Override // n0.c
        @Nullable
        public Object i9() {
            return null;
        }

        @Override // n0.c
        public int n3() {
            return this.f6991s;
        }

        @Override // n0.c
        public void z(long j, long j4, long j7, List<? extends h6.wz> list, h6.xc[] xcVarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (gv(this.f6991s, jElapsedRealtime)) {
                for (int i = this.n3 - 1; i >= 0; i--) {
                    if (!gv(i, jElapsedRealtime)) {
                        this.f6991s = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }
    }

    public static final class n3 {
        public boolean n3;

        @Nullable
        public h6.a y;

        @Nullable
        public Uri zn;

        public n3() {
            y();
        }

        public void y() {
            this.y = null;
            this.n3 = false;
            this.zn = null;
        }
    }

    public static final class v {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final boolean f6992gv;
        public final long n3;
        public final fb.v y;
        public final int zn;

        public v(fb.v vVar, long j, int i) {
            this.y = vVar;
            this.n3 = j;
            this.zn = i;
            this.f6992gv = (vVar instanceof fb.n3) && ((fb.n3) vVar).n;
        }
    }

    public static final class y extends h6.t {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public byte[] f6993t;

        public y(r0.tl tlVar, r0.p pVar, g gVar, int i, @Nullable Object obj, byte[] bArr) {
            super(tlVar, pVar, 3, gVar, i, obj, bArr);
        }

        @Nullable
        public byte[] s() {
            return this.f6993t;
        }

        @Override // h6.t
        public void v(byte[] bArr, int i) {
            this.f6993t = Arrays.copyOf(bArr, i);
        }
    }

    public static final class zn extends h6.n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6994a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final String f6995fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final List<fb.v> f6996v;

        public zn(String str, long j, List<fb.v> list) {
            super(0L, list.size() - 1);
            this.f6995fb = str;
            this.f6994a = j;
            this.f6996v = list;
        }

        @Override // h6.xc
        public long n3() {
            zn();
            fb.v vVar = this.f6996v.get((int) gv());
            return this.f6994a + vVar.f7213f + vVar.f7214fb;
        }

        @Override // h6.xc
        public long y() {
            zn();
            return this.f6994a + this.f6996v.get((int) gv()).f7213f;
        }
    }

    public a(s sVar, os.t tVar, Uri[] uriArr, g[] gVarArr, fb fbVar, @Nullable o oVar, co coVar, @Nullable List<g> list, gn gnVar) {
        this.y = sVar;
        this.f6980fb = tVar;
        this.f6988v = uriArr;
        this.f6976a = gVarArr;
        this.f6981gv = coVar;
        this.f6977c5 = list;
        this.f6979f = gnVar;
        r0.tl tlVarY = fbVar.y(1);
        this.n3 = tlVarY;
        if (oVar != null) {
            tlVarY.co(oVar);
        }
        this.zn = fbVar.y(3);
        this.f6985s = new rs(gVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((gVarArr[i].f4781f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.f6984p = new gv(this.f6985s, n4.a.wz(arrayList));
    }

    public static List<fb.v> c5(os.fb fbVar, long j, int i) {
        int i5 = (int) (j - fbVar.f7196f);
        if (i5 < 0 || fbVar.f7200mt.size() < i5) {
            return r.yt();
        }
        ArrayList arrayList = new ArrayList();
        if (i5 < fbVar.f7200mt.size()) {
            if (i != -1) {
                fb.gv gvVar = fbVar.f7200mt.get(i5);
                if (i == 0) {
                    arrayList.add(gvVar);
                } else if (i < gvVar.n.size()) {
                    List<fb.n3> list = gvVar.n;
                    arrayList.addAll(list.subList(i, list.size()));
                }
                i5++;
            }
            List<fb.gv> list2 = fbVar.f7200mt;
            arrayList.addAll(list2.subList(i5, list2.size()));
            i = 0;
        }
        if (fbVar.f7207wz != -9223372036854775807L) {
            int i8 = i != -1 ? i : 0;
            if (i8 < fbVar.f7195co.size()) {
                List<fb.n3> list3 = fbVar.f7195co;
                arrayList.addAll(list3.subList(i8, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Nullable
    public static v fb(os.fb fbVar, long j, int i) {
        int i5 = (int) (j - fbVar.f7196f);
        if (i5 == fbVar.f7200mt.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < fbVar.f7195co.size()) {
                return new v(fbVar.f7195co.get(i), j, i);
            }
            return null;
        }
        fb.gv gvVar = fbVar.f7200mt.get(i5);
        if (i == -1) {
            return new v(gvVar, j, -1);
        }
        if (i < gvVar.n.size()) {
            return new v(gvVar.n.get(i), j, i);
        }
        int i8 = i5 + 1;
        if (i8 < fbVar.f7200mt.size()) {
            return new v(fbVar.f7200mt.get(i8), j + 1, -1);
        }
        if (fbVar.f7195co.isEmpty()) {
            return null;
        }
        return new v(fbVar.f7195co.get(0), j + 1, 0);
    }

    @Nullable
    public static Uri gv(os.fb fbVar, @Nullable fb.v vVar) {
        String str;
        if (vVar == null || (str = vVar.w) == null) {
            return null;
        }
        return qn.v(fbVar.y, str);
    }

    public final Pair<Long, Integer> a(@Nullable i9 i9Var, boolean z, os.fb fbVar, long j, long j4) {
        if (i9Var != null && !z) {
            if (!i9Var.a()) {
                return new Pair<>(Long.valueOf(i9Var.f5335i9), Integer.valueOf(i9Var.f7016xc));
            }
            Long lValueOf = Long.valueOf(i9Var.f7016xc == -1 ? i9Var.v() : i9Var.f5335i9);
            int i = i9Var.f7016xc;
            return new Pair<>(lValueOf, Integer.valueOf(i != -1 ? i + 1 : -1));
        }
        long j7 = fbVar.f7202r + j;
        if (i9Var != null && !this.w) {
            j4 = i9Var.f5287fb;
        }
        if (!fbVar.f7209xc && j4 >= j7) {
            return new Pair<>(Long.valueOf(fbVar.f7196f + ((long) fbVar.f7200mt.size())), -1);
        }
        long j8 = j4 - j;
        int i5 = 0;
        int iA = ut.a(fbVar.f7200mt, Long.valueOf(j8), true, !this.f6980fb.isLive() || i9Var == null);
        long j9 = ((long) iA) + fbVar.f7196f;
        if (iA >= 0) {
            fb.gv gvVar = fbVar.f7200mt.get(iA);
            List<fb.n3> list = j8 < gvVar.f7213f + gvVar.f7214fb ? gvVar.n : fbVar.f7195co;
            while (true) {
                if (i5 >= list.size()) {
                    break;
                }
                fb.n3 n3Var = list.get(i5);
                if (j8 >= n3Var.f7213f + n3Var.f7214fb) {
                    i5++;
                } else if (n3Var.f3) {
                    j9 += list == fbVar.f7195co ? 1L : 0L;
                    i = i5;
                }
            }
        }
        return new Pair<>(Long.valueOf(j9), Integer.valueOf(i));
    }

    public final long co(long j) {
        long j4 = this.f6983mt;
        if (j4 != -9223372036854775807L) {
            return j4 - j;
        }
        return -9223372036854775807L;
    }

    public c f() {
        return this.f6984p;
    }

    public final void i4(os.fb fbVar) {
        this.f6983mt = fbVar.f7209xc ? -9223372036854775807L : fbVar.v() - this.f6980fb.zn();
    }

    public rs i9() {
        return this.f6985s;
    }

    public void mt() {
        this.f6989wz = null;
    }

    public long n3(long j, p1 p1Var) {
        int iN3 = this.f6984p.n3();
        Uri[] uriArr = this.f6988v;
        os.fb fbVarF = (iN3 >= uriArr.length || iN3 == -1) ? null : this.f6980fb.f(uriArr[this.f6984p.p()], true);
        if (fbVarF == null || fbVarF.f7200mt.isEmpty() || !fbVarF.zn) {
            return j;
        }
        long jZn = fbVarF.f7203s - this.f6980fb.zn();
        long j4 = j - jZn;
        int iA = ut.a(fbVarF.f7200mt, Long.valueOf(j4), true, true);
        long j7 = fbVarF.f7200mt.get(iA).f7213f;
        return p1Var.y(j4, j7, iA != fbVarF.f7200mt.size() - 1 ? fbVarF.f7200mt.get(iA + 1).f7213f : j7) + jZn;
    }

    public boolean p(Uri uri, long j) {
        int iT;
        int i = 0;
        while (true) {
            Uri[] uriArr = this.f6988v;
            if (i >= uriArr.length) {
                i = -1;
                break;
            }
            if (uriArr[i].equals(uri)) {
                break;
            }
            i++;
        }
        if (i == -1 || (iT = this.f6984p.t(i)) == -1) {
            return true;
        }
        this.f6978co |= uri.equals(this.f6990xc);
        return j == -9223372036854775807L || (this.f6984p.zn(iT, j) && this.f6980fb.c5(uri, j));
    }

    public void r(c cVar) {
        this.f6984p = cVar;
    }

    public int s(long j, List<? extends h6.wz> list) {
        return (this.f6989wz != null || this.f6984p.length() < 2) ? list.size() : this.f6984p.xc(j, list);
    }

    @Nullable
    public final h6.a t(@Nullable Uri uri, int i) {
        if (uri == null) {
            return null;
        }
        byte[] bArrZn = this.f6982i9.zn(uri);
        if (bArrZn != null) {
            this.f6982i9.n3(uri, bArrZn);
            return null;
        }
        return new y(this.zn, new p.n3().c5(uri).n3(1).y(), this.f6976a[i], this.f6984p.co(), this.f6984p.i9(), this.f6987tl);
    }

    public boolean tl(h6.a aVar, long j) {
        c cVar = this.f6984p;
        return cVar.zn(cVar.t(this.f6985s.gv(aVar.f5288gv)), j);
    }

    public void v(long j, long j4, List<i9> list, boolean z, n3 n3Var) {
        os.fb fbVar;
        long jZn;
        Uri uri;
        int i;
        i9 i9Var = list.isEmpty() ? null : (i9) k4.c.gv(list);
        int iGv = i9Var == null ? -1 : this.f6985s.gv(i9Var.f5288gv);
        long jMax = j4 - j;
        long jCo = co(j);
        if (i9Var != null && !this.w) {
            long jN3 = i9Var.n3();
            jMax = Math.max(0L, jMax - jN3);
            if (jCo != -9223372036854775807L) {
                jCo = Math.max(0L, jCo - jN3);
            }
        }
        this.f6984p.z(j, jMax, jCo, list, y(i9Var, j4));
        int iP = this.f6984p.p();
        boolean z5 = iGv != iP;
        Uri uri2 = this.f6988v[iP];
        if (!this.f6980fb.fb(uri2)) {
            n3Var.zn = uri2;
            this.f6978co &= uri2.equals(this.f6990xc);
            this.f6990xc = uri2;
            return;
        }
        os.fb fbVarF = this.f6980fb.f(uri2, true);
        v0.y.v(fbVarF);
        this.w = fbVarF.zn;
        i4(fbVarF);
        long jZn2 = fbVarF.f7203s - this.f6980fb.zn();
        Pair<Long, Integer> pairA = a(i9Var, z5, fbVarF, jZn2, j4);
        long jLongValue = ((Long) pairA.first).longValue();
        int iIntValue = ((Integer) pairA.second).intValue();
        if (jLongValue >= fbVarF.f7196f || i9Var == null || !z5) {
            fbVar = fbVarF;
            jZn = jZn2;
            uri = uri2;
            i = iP;
        } else {
            Uri uri3 = this.f6988v[iGv];
            os.fb fbVarF2 = this.f6980fb.f(uri3, true);
            v0.y.v(fbVarF2);
            jZn = fbVarF2.f7203s - this.f6980fb.zn();
            Pair<Long, Integer> pairA2 = a(i9Var, false, fbVarF2, jZn, j4);
            jLongValue = ((Long) pairA2.first).longValue();
            iIntValue = ((Integer) pairA2.second).intValue();
            i = iGv;
            uri = uri3;
            fbVar = fbVarF2;
        }
        if (jLongValue < fbVar.f7196f) {
            this.f6989wz = new ur.n3();
            return;
        }
        v vVarFb = fb(fbVar, jLongValue, iIntValue);
        if (vVarFb == null) {
            if (!fbVar.f7209xc) {
                n3Var.zn = uri;
                this.f6978co &= uri.equals(this.f6990xc);
                this.f6990xc = uri;
                return;
            } else {
                if (z || fbVar.f7200mt.isEmpty()) {
                    n3Var.n3 = true;
                    return;
                }
                vVarFb = new v((fb.v) k4.c.gv(fbVar.f7200mt), (fbVar.f7196f + ((long) fbVar.f7200mt.size())) - 1, -1);
            }
        }
        this.f6978co = false;
        this.f6990xc = null;
        Uri uriGv = gv(fbVar, vVarFb.y.f7219v);
        h6.a aVarT = t(uriGv, i);
        n3Var.y = aVarT;
        if (aVarT != null) {
            return;
        }
        Uri uriGv2 = gv(fbVar, vVarFb.y);
        h6.a aVarT2 = t(uriGv2, i);
        n3Var.y = aVarT2;
        if (aVarT2 != null) {
            return;
        }
        boolean zI4 = i9.i4(i9Var, uri, fbVar, vVarFb, jZn);
        if (zI4 && vVarFb.f6992gv) {
            return;
        }
        n3Var.y = i9.s(this.y, this.n3, this.f6976a[i], jZn, fbVar, vVarFb, uri, this.f6977c5, this.f6984p.co(), this.f6984p.i9(), this.f6986t, this.f6981gv, i9Var, this.f6982i9.y(uriGv2), this.f6982i9.y(uriGv), zI4, this.f6979f);
    }

    public void w(h6.a aVar) {
        if (aVar instanceof y) {
            y yVar = (y) aVar;
            this.f6987tl = yVar.a();
            this.f6982i9.n3(yVar.n3.y, (byte[]) v0.y.v(yVar.s()));
        }
    }

    public void wz() throws IOException {
        IOException iOException = this.f6989wz;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f6990xc;
        if (uri == null || !this.f6978co) {
            return;
        }
        this.f6980fb.y(uri);
    }

    public boolean x4(long j, h6.a aVar, List<? extends h6.wz> list) {
        if (this.f6989wz != null) {
            return false;
        }
        return this.f6984p.w(j, aVar, list);
    }

    public boolean xc(Uri uri) {
        return ut.co(this.f6988v, uri);
    }

    public h6.xc[] y(@Nullable i9 i9Var, long j) {
        int i;
        int iGv = i9Var == null ? -1 : this.f6985s.gv(i9Var.f5288gv);
        int length = this.f6984p.length();
        h6.xc[] xcVarArr = new h6.xc[length];
        boolean z = false;
        int i5 = 0;
        while (i5 < length) {
            int iA = this.f6984p.a(i5);
            Uri uri = this.f6988v[iA];
            if (this.f6980fb.fb(uri)) {
                os.fb fbVarF = this.f6980fb.f(uri, z);
                v0.y.v(fbVarF);
                long jZn = fbVarF.f7203s - this.f6980fb.zn();
                i = i5;
                Pair<Long, Integer> pairA = a(i9Var, iA != iGv, fbVarF, jZn, j);
                xcVarArr[i] = new zn(fbVarF.y, jZn, c5(fbVarF, ((Long) pairA.first).longValue(), ((Integer) pairA.second).intValue()));
            } else {
                xcVarArr[i5] = h6.xc.y;
                i = i5;
            }
            i5 = i + 1;
            z = false;
        }
        return xcVarArr;
    }

    public void z(boolean z) {
        this.f6986t = z;
    }

    public int zn(i9 i9Var) {
        if (i9Var.f7016xc == -1) {
            return 1;
        }
        os.fb fbVar = (os.fb) v0.y.v(this.f6980fb.f(this.f6988v[this.f6985s.gv(i9Var.f5288gv)], false));
        int i = (int) (i9Var.f5335i9 - fbVar.f7196f);
        if (i < 0) {
            return 1;
        }
        List<fb.n3> list = i < fbVar.f7200mt.size() ? fbVar.f7200mt.get(i).n : fbVar.f7195co;
        if (i9Var.f7016xc >= list.size()) {
            return 2;
        }
        fb.n3 n3Var = list.get(i9Var.f7016xc);
        if (n3Var.n) {
            return 0;
        }
        return ut.zn(Uri.parse(qn.gv(fbVar.y, n3Var.y)), i9Var.n3.y) ? 1 : 2;
    }
}
