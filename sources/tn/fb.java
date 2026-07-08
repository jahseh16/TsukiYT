package tn;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import b1.d0;
import b1.f3;
import b1.fh;
import b1.ta;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.Reader;
import ft.g;
import ft.q;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tn.y;
import v0.c;
import v0.d;
import v0.hw;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public class fb implements b1.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f8240a;

    @Nullable
    public n3 c;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final d f8241c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f8242co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ta[] f8243d;
    public int d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public boolean f8244ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qg.n3 f8245f;
    public long f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final d f8246fb;
    public int fh;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final SparseArray<n3> f8247gv;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public long f8248i4;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public final hw f8249i9;
    public boolean mg;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public long f8250mt;
    public long n;

    @Nullable
    public final xc n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8251p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f8252r;
    public int rz;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final byte[] f8253s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f8254t;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public b1.wz f8255ta;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final ArrayDeque<y.C0180y> f8256tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d f8257v;
    public int w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public final ArrayDeque<y> f8258wz;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public int f8259x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    @Nullable
    public final ta f8260xc;
    public final int y;

    @Nullable
    public d z;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public ta[] f8261z6;
    public final List<g> zn;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static final b1.mt f8238ud = new b1.mt() { // from class: tn.v
        @Override // b1.mt
        public final b1.t[] createExtractors() {
            return fb.tl();
        }

        @Override // b1.mt
        public /* synthetic */ b1.t[] y(Uri uri, Map map) {
            return b1.p.y(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: a8, reason: collision with root package name */
    public static final byte[] f8237a8 = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final g f8239x = new g.n3().o4("application/x-emsg").z6();

    public static final class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8262a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public int f8263c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f8265fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public mt f8266gv;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f8268s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f8269t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public zn f8270v;
        public final ta y;
        public final p n3 = new p();
        public final d zn = new d();

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public final d f8267i9 = new d(1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final d f8264f = new d();

        public n3(ta taVar, mt mtVar, zn znVar) {
            this.y = taVar;
            this.f8266gv = mtVar;
            this.f8270v = znVar;
            i9(mtVar, znVar);
        }

        public int a() {
            return !this.f8269t ? this.f8266gv.f8276gv[this.f8262a] : this.n3.f8290c5[this.f8262a];
        }

        public int c5(int i, int i5) {
            d dVar;
            w wVarFb = fb();
            if (wVarFb == null) {
                return 0;
            }
            int length = wVarFb.f8305gv;
            if (length != 0) {
                dVar = this.n3.f8302xc;
            } else {
                byte[] bArr = (byte[]) ut.i9(wVarFb.f8306v);
                this.f8264f.o(bArr, bArr.length);
                d dVar2 = this.f8264f;
                length = bArr.length;
                dVar = dVar2;
            }
            boolean zFb = this.n3.fb(this.f8262a);
            boolean z = zFb || i5 != 0;
            this.f8267i9.v()[0] = (byte) ((z ? 128 : 0) | length);
            this.f8267i9.oz(0);
            this.y.zn(this.f8267i9, 1, 1);
            this.y.zn(dVar, length, 1);
            if (!z) {
                return length + 1;
            }
            if (!zFb) {
                this.zn.j5(8);
                byte[] bArrV = this.zn.v();
                bArrV[0] = 0;
                bArrV[1] = 1;
                bArrV[2] = (byte) ((i5 >> 8) & 255);
                bArrV[3] = (byte) (i5 & 255);
                bArrV[4] = (byte) ((i >> 24) & 255);
                bArrV[5] = (byte) ((i >> 16) & 255);
                bArrV[6] = (byte) ((i >> 8) & 255);
                bArrV[7] = (byte) (i & 255);
                this.y.zn(this.zn, 8, 1);
                return length + 9;
            }
            d dVar3 = this.n3.f8302xc;
            int iYt = dVar3.yt();
            dVar3.ut(-2);
            int i8 = (iYt * 6) + 2;
            if (i5 != 0) {
                this.zn.j5(i8);
                byte[] bArrV2 = this.zn.v();
                dVar3.t(bArrV2, 0, i8);
                int i10 = (((bArrV2[2] & 255) << 8) | (bArrV2[3] & 255)) + i5;
                bArrV2[2] = (byte) ((i10 >> 8) & 255);
                bArrV2[3] = (byte) (i10 & 255);
                dVar3 = this.zn;
            }
            this.y.zn(dVar3, i8, 1);
            return length + 1 + i8;
        }

        public void f() {
            this.n3.a();
            this.f8262a = 0;
            this.f8268s = 0;
            this.f8265fb = 0;
            this.f8263c5 = 0;
            this.f8269t = false;
        }

        @Nullable
        public w fb() {
            if (!this.f8269t) {
                return null;
            }
            int i = ((zn) ut.i9(this.n3.y)).y;
            w wVarY = this.n3.f8301wz;
            if (wVarY == null) {
                wVarY = this.f8266gv.y.y(i);
            }
            if (wVarY == null || !wVarY.y) {
                return null;
            }
            return wVarY;
        }

        public long gv() {
            return !this.f8269t ? this.f8266gv.zn[this.f8262a] : this.n3.f8292fb[this.f8268s];
        }

        public void i9(mt mtVar, zn znVar) {
            this.f8266gv = mtVar;
            this.f8270v = znVar;
            this.y.y(mtVar.y.f8307a);
            f();
        }

        public boolean s() {
            this.f8262a++;
            if (!this.f8269t) {
                return false;
            }
            int i = this.f8265fb + 1;
            this.f8265fb = i;
            int[] iArr = this.n3.f8297s;
            int i5 = this.f8268s;
            if (i != iArr[i5]) {
                return true;
            }
            this.f8268s = i5 + 1;
            this.f8265fb = 0;
            return false;
        }

        public void t(long j) {
            int i = this.f8262a;
            while (true) {
                p pVar = this.n3;
                if (i >= pVar.f8289a || pVar.zn(i) > j) {
                    return;
                }
                if (this.n3.f8291f[i]) {
                    this.f8263c5 = i;
                }
                i++;
            }
        }

        public void tl() {
            w wVarFb = fb();
            if (wVarFb == null) {
                return;
            }
            d dVar = this.n3.f8302xc;
            int i = wVarFb.f8305gv;
            if (i != 0) {
                dVar.ut(i);
            }
            if (this.n3.fb(this.f8262a)) {
                dVar.ut(dVar.yt() * 6);
            }
        }

        public long v() {
            return !this.f8269t ? this.f8266gv.f8274a[this.f8262a] : this.n3.zn(this.f8262a);
        }

        public void wz(DrmInitData drmInitData) {
            w wVarY = this.f8266gv.y.y(((zn) ut.i9(this.n3.y)).y);
            this.y.y(this.f8266gv.y.f8307a.n3().vl(drmInitData.zn(wVarY != null ? wVarY.n3 : null)).z6());
        }

        public int zn() {
            int i = !this.f8269t ? this.f8266gv.f8275fb[this.f8262a] : this.n3.f8291f[this.f8262a] ? 1 : 0;
            return fb() != null ? i | 1073741824 : i;
        }
    }

    public static final class y {
        public final boolean n3;
        public final long y;
        public final int zn;

        public y(long j, boolean z, int i) {
            this.y = j;
            this.n3 = z;
            this.zn = i;
        }
    }

    public fb() {
        this(0);
    }

    private void a() {
        this.w = 0;
        this.f8242co = 0;
    }

    private void a8(long j) throws q {
        while (!this.f8256tl.isEmpty() && this.f8256tl.peek().n3 == j) {
            xc(this.f8256tl.pop());
        }
        a();
    }

    public static void c(d dVar, int i, p pVar) throws q {
        dVar.oz(i + 8);
        int iN3 = tn.y.n3(dVar.p());
        if ((iN3 & 1) != 0) {
            throw q.f("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iN3 & 2) != 0;
        int iB = dVar.b();
        if (iB == 0) {
            Arrays.fill(pVar.f8299tl, 0, pVar.f8289a, false);
            return;
        }
        if (iB == pVar.f8289a) {
            Arrays.fill(pVar.f8299tl, 0, iB, z);
            pVar.gv(dVar.y());
            pVar.n3(dVar);
        } else {
            throw q.y("Senc sample count " + iB + " is different from fragment sample count" + pVar.f8289a, null);
        }
    }

    @Nullable
    public static DrmInitData c5(List<y.n3> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            y.n3 n3Var = list.get(i);
            if (n3Var.y == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrV = n3Var.n3.v();
                UUID uuidA = t.a(bArrV);
                if (uuidA == null) {
                    r.c5("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidA, "video/mp4", bArrV));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    public static Pair<Integer, zn> d(d dVar) {
        dVar.oz(12);
        return Pair.create(Integer.valueOf(dVar.p()), new zn(dVar.p() - 1, dVar.p(), dVar.p(), dVar.p()));
    }

    public static void d0(d dVar, p pVar) throws q {
        c(dVar, 0, pVar);
    }

    public static void ej(y.C0180y c0180y, n3 n3Var, int i) throws q {
        List<y.n3> list = c0180y.zn;
        int size = list.size();
        int i5 = 0;
        int i8 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            y.n3 n3Var2 = list.get(i10);
            if (n3Var2.y == 1953658222) {
                d dVar = n3Var2.n3;
                dVar.oz(12);
                int iB = dVar.b();
                if (iB > 0) {
                    i8 += iB;
                    i5++;
                }
            }
        }
        n3Var.f8268s = 0;
        n3Var.f8265fb = 0;
        n3Var.f8262a = 0;
        n3Var.n3.v(i5, i8);
        int i11 = 0;
        int iZ6 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            y.n3 n3Var3 = list.get(i12);
            if (n3Var3.y == 1953658222) {
                iZ6 = z6(n3Var, i11, i, n3Var3.n3, iZ6);
                i11++;
            }
        }
    }

    public static void f3(w wVar, d dVar, p pVar) throws q {
        int i;
        int i5 = wVar.f8305gv;
        dVar.oz(8);
        if ((tn.y.n3(dVar.p()) & 1) == 1) {
            dVar.ut(8);
        }
        int iEj = dVar.ej();
        int iB = dVar.b();
        if (iB > pVar.f8289a) {
            throw q.y("Saiz sample count " + iB + " is greater than fragment sample count" + pVar.f8289a, null);
        }
        if (iEj == 0) {
            boolean[] zArr = pVar.f8299tl;
            i = 0;
            for (int i8 = 0; i8 < iB; i8++) {
                int iEj2 = dVar.ej();
                i += iEj2;
                zArr[i8] = iEj2 > i5;
            }
        } else {
            i = iEj * iB;
            Arrays.fill(pVar.f8299tl, 0, iB, iEj > i5);
        }
        Arrays.fill(pVar.f8299tl, iB, pVar.f8289a, false);
        if (i > 0) {
            pVar.gv(i);
        }
    }

    public static Pair<Long, b1.gv> fh(d dVar, long j) throws q {
        long jK5;
        long jK52;
        dVar.oz(8);
        int iZn = tn.y.zn(dVar.p());
        dVar.ut(4);
        long jA8 = dVar.a8();
        if (iZn == 0) {
            jK5 = dVar.a8();
            jK52 = dVar.a8();
        } else {
            jK5 = dVar.k5();
            jK52 = dVar.k5();
        }
        long j4 = jK5;
        long j7 = j + jK52;
        long jX5 = ut.x5(j4, 1000000L, jA8);
        dVar.ut(2);
        int iYt = dVar.yt();
        int[] iArr = new int[iYt];
        long[] jArr = new long[iYt];
        long[] jArr2 = new long[iYt];
        long[] jArr3 = new long[iYt];
        long j8 = j4;
        long j9 = jX5;
        int i = 0;
        while (i < iYt) {
            int iP = dVar.p();
            if ((iP & Integer.MIN_VALUE) != 0) {
                throw q.y("Unhandled indirect reference", null);
            }
            long jA82 = dVar.a8();
            iArr[i] = iP & Reader.READ_DONE;
            jArr[i] = j7;
            jArr3[i] = j9;
            long j10 = j8 + jA82;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i5 = iYt;
            int[] iArr2 = iArr;
            long jX52 = ut.x5(j10, 1000000L, jA8);
            jArr4[i] = jX52 - jArr5[i];
            dVar.ut(4);
            j7 += (long) iArr2[i];
            i++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            iYt = i5;
            j8 = j10;
            j9 = jX52;
        }
        return Pair.create(Long.valueOf(jX5), new b1.gv(iArr, jArr, jArr2, jArr3));
    }

    private static boolean hw(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    public static void i4(d dVar, p pVar) throws q {
        dVar.oz(8);
        int iP = dVar.p();
        if ((tn.y.n3(iP) & 1) == 1) {
            dVar.ut(8);
        }
        int iB = dVar.b();
        if (iB == 1) {
            pVar.f8293gv += tn.y.zn(iP) == 0 ? dVar.a8() : dVar.k5();
        } else {
            throw q.y("Unexpected saio entry count: " + iB, null);
        }
    }

    @Nullable
    public static n3 i9(SparseArray<n3> sparseArray) {
        int size = sparseArray.size();
        n3 n3Var = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            n3 n3VarValueAt = sparseArray.valueAt(i);
            if ((n3VarValueAt.f8269t || n3VarValueAt.f8262a != n3VarValueAt.f8266gv.n3) && (!n3VarValueAt.f8269t || n3VarValueAt.f8268s != n3VarValueAt.n3.f8300v)) {
                long jGv = n3VarValueAt.gv();
                if (jGv < j) {
                    n3Var = n3VarValueAt;
                    j = jGv;
                }
            }
        }
        return n3Var;
    }

    @Nullable
    public static n3 mg(d dVar, SparseArray<n3> sparseArray, boolean z) {
        dVar.oz(8);
        int iN3 = tn.y.n3(dVar.p());
        n3 n3VarValueAt = z ? sparseArray.valueAt(0) : sparseArray.get(dVar.p());
        if (n3VarValueAt == null) {
            return null;
        }
        if ((iN3 & 1) != 0) {
            long jK5 = dVar.k5();
            p pVar = n3VarValueAt.n3;
            pVar.zn = jK5;
            pVar.f8293gv = jK5;
        }
        zn znVar = n3VarValueAt.f8270v;
        n3VarValueAt.n3.y = new zn((iN3 & 2) != 0 ? dVar.p() - 1 : znVar.y, (iN3 & 8) != 0 ? dVar.p() : znVar.n3, (iN3 & 16) != 0 ? dVar.p() : znVar.zn, (iN3 & 32) != 0 ? dVar.p() : znVar.f8316gv);
        return n3VarValueAt;
    }

    public static void n(y.C0180y c0180y, @Nullable String str, p pVar) throws q {
        byte[] bArr = null;
        d dVar = null;
        d dVar2 = null;
        for (int i = 0; i < c0180y.zn.size(); i++) {
            y.n3 n3Var = c0180y.zn.get(i);
            d dVar3 = n3Var.n3;
            int i5 = n3Var.y;
            if (i5 == 1935828848) {
                dVar3.oz(12);
                if (dVar3.p() == 1936025959) {
                    dVar = dVar3;
                }
            } else if (i5 == 1936158820) {
                dVar3.oz(12);
                if (dVar3.p() == 1936025959) {
                    dVar2 = dVar3;
                }
            }
        }
        if (dVar == null || dVar2 == null) {
            return;
        }
        dVar.oz(8);
        int iZn = tn.y.zn(dVar.p());
        dVar.ut(4);
        if (iZn == 1) {
            dVar.ut(4);
        }
        if (dVar.p() != 1) {
            throw q.f("Entry count in sbgp != 1 (unsupported).");
        }
        dVar2.oz(8);
        int iZn2 = tn.y.zn(dVar2.p());
        dVar2.ut(4);
        if (iZn2 == 1) {
            if (dVar2.a8() == 0) {
                throw q.f("Variable length description in sgpd found (unsupported)");
            }
        } else if (iZn2 >= 2) {
            dVar2.ut(4);
        }
        if (dVar2.a8() != 1) {
            throw q.f("Entry count in sgpd != 1 (unsupported).");
        }
        dVar2.ut(1);
        int iEj = dVar2.ej();
        int i8 = (iEj & 240) >> 4;
        int i10 = iEj & 15;
        boolean z = dVar2.ej() == 1;
        if (z) {
            int iEj2 = dVar2.ej();
            byte[] bArr2 = new byte[16];
            dVar2.t(bArr2, 0, 16);
            if (iEj2 == 0) {
                int iEj3 = dVar2.ej();
                bArr = new byte[iEj3];
                dVar2.t(bArr, 0, iEj3);
            }
            pVar.f8298t = true;
            pVar.f8301wz = new w(z, str, iEj2, bArr2, i8, i10, bArr);
        }
    }

    public static long r(d dVar) {
        dVar.oz(8);
        return tn.y.zn(dVar.p()) == 0 ? dVar.a8() : dVar.k5();
    }

    public static long rz(d dVar) {
        dVar.oz(8);
        return tn.y.zn(dVar.p()) == 1 ? dVar.k5() : dVar.a8();
    }

    public static boolean t(xc xcVar) {
        long[] jArr;
        long[] jArr2 = xcVar.f8313s;
        if (jArr2 == null || jArr2.length != 1 || (jArr = xcVar.f8308c5) == null) {
            return false;
        }
        long j = jArr2[0];
        return j == 0 || ut.x5(j + jArr[0], 1000000L, xcVar.f8311gv) >= xcVar.f8314v;
    }

    public static void ta(y.C0180y c0180y, SparseArray<n3> sparseArray, boolean z, int i, byte[] bArr) throws q {
        n3 n3VarMg = mg(((y.n3) v0.y.v(c0180y.fb(1952868452))).n3, sparseArray, z);
        if (n3VarMg == null) {
            return;
        }
        p pVar = n3VarMg.n3;
        long j = pVar.f8296p;
        boolean z5 = pVar.f8295mt;
        n3VarMg.f();
        n3VarMg.f8269t = true;
        y.n3 n3VarFb = c0180y.fb(1952867444);
        if (n3VarFb == null || (i & 2) != 0) {
            pVar.f8296p = j;
            pVar.f8295mt = z5;
        } else {
            pVar.f8296p = rz(n3VarFb.n3);
            pVar.f8295mt = true;
        }
        ej(c0180y, n3VarMg, i);
        w wVarY = n3VarMg.f8266gv.y.y(((zn) v0.y.v(pVar.y)).y);
        y.n3 n3VarFb2 = c0180y.fb(1935763834);
        if (n3VarFb2 != null) {
            f3((w) v0.y.v(wVarY), n3VarFb2.n3, pVar);
        }
        y.n3 n3VarFb3 = c0180y.fb(1935763823);
        if (n3VarFb3 != null) {
            i4(n3VarFb3.n3, pVar);
        }
        y.n3 n3VarFb4 = c0180y.fb(1936027235);
        if (n3VarFb4 != null) {
            d0(n3VarFb4.n3, pVar);
        }
        n(c0180y, wVarY != null ? wVarY.n3 : null, pVar);
        int size = c0180y.zn.size();
        for (int i5 = 0; i5 < size; i5++) {
            y.n3 n3Var = c0180y.zn.get(i5);
            if (n3Var.y == 1970628964) {
                ud(n3Var.n3, pVar, bArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b1.t[] tl() {
        return new b1.t[]{new fb()};
    }

    public static void ud(d dVar, p pVar, byte[] bArr) throws q {
        dVar.oz(8);
        dVar.t(bArr, 0, 16);
        if (Arrays.equals(bArr, f8237a8)) {
            c(dVar, 16, pVar);
        }
    }

    public static int v(int i) throws q {
        if (i >= 0) {
            return i;
        }
        throw q.y("Unexpected negative value: " + i, null);
    }

    private static boolean vl(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    private boolean x(b1.tl tlVar) throws IOException {
        if (this.f8242co == 0) {
            if (!tlVar.i9(this.f8254t.v(), 0, 8, true)) {
                return false;
            }
            this.f8242co = 8;
            this.f8254t.oz(0);
            this.f8250mt = this.f8254t.a8();
            this.f8251p = this.f8254t.p();
        }
        long j = this.f8250mt;
        if (j == 1) {
            tlVar.readFully(this.f8254t.v(), 8, 8);
            this.f8242co += 8;
            this.f8250mt = this.f8254t.k5();
        } else if (j == 0) {
            long length = tlVar.getLength();
            if (length == -1 && !this.f8256tl.isEmpty()) {
                length = this.f8256tl.peek().n3;
            }
            if (length != -1) {
                this.f8250mt = (length - tlVar.getPosition()) + ((long) this.f8242co);
            }
        }
        if (this.f8250mt < this.f8242co) {
            throw q.f("Atom size less than header length (unsupported).");
        }
        long position = tlVar.getPosition() - ((long) this.f8242co);
        int i = this.f8251p;
        if ((i == 1836019558 || i == 1835295092) && !this.f8244ej) {
            this.f8255ta.z(new fh.n3(this.f3, position));
            this.f8244ej = true;
        }
        if (this.f8251p == 1836019558) {
            int size = this.f8247gv.size();
            for (int i5 = 0; i5 < size; i5++) {
                p pVar = this.f8247gv.valueAt(i5).n3;
                pVar.n3 = position;
                pVar.f8293gv = position;
                pVar.zn = position;
            }
        }
        int i8 = this.f8251p;
        if (i8 == 1835295092) {
            this.c = null;
            this.f8252r = position + this.f8250mt;
            this.w = 2;
            return true;
        }
        if (vl(i8)) {
            long position2 = (tlVar.getPosition() + this.f8250mt) - 8;
            this.f8256tl.push(new y.C0180y(this.f8251p, position2));
            if (this.f8250mt == this.f8242co) {
                a8(position2);
            } else {
                a();
            }
        } else if (hw(this.f8251p)) {
            if (this.f8242co != 8) {
                throw q.f("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f8250mt > 2147483647L) {
                throw q.f("Leaf atom with length > 2147483647 (unsupported).");
            }
            d dVar = new d((int) this.f8250mt);
            System.arraycopy(this.f8254t.v(), 0, dVar.v(), 0, 8);
            this.z = dVar;
            this.w = 1;
        } else {
            if (this.f8250mt > 2147483647L) {
                throw q.f("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.z = null;
            this.w = 1;
        }
        return true;
    }

    public static void x4(y.C0180y c0180y, SparseArray<n3> sparseArray, boolean z, int i, byte[] bArr) throws q {
        int size = c0180y.f8315gv.size();
        for (int i5 = 0; i5 < size; i5++) {
            y.C0180y c0180y2 = c0180y.f8315gv.get(i5);
            if (c0180y2.y == 1953653094) {
                ta(c0180y2, sparseArray, z, i, bArr);
            }
        }
    }

    public static int z6(n3 n3Var, int i, int i5, d dVar, int i8) throws q {
        boolean z;
        int iP;
        boolean z5;
        int iP2;
        boolean z7;
        boolean z8;
        boolean z9;
        int iP3;
        n3 n3Var2 = n3Var;
        dVar.oz(8);
        int iN3 = tn.y.n3(dVar.p());
        xc xcVar = n3Var2.f8266gv.y;
        p pVar = n3Var2.n3;
        zn znVar = (zn) ut.i9(pVar.y);
        pVar.f8297s[i] = dVar.b();
        long[] jArr = pVar.f8292fb;
        long j = pVar.zn;
        jArr[i] = j;
        if ((iN3 & 1) != 0) {
            jArr[i] = j + ((long) dVar.p());
        }
        boolean z10 = (iN3 & 4) != 0;
        int iP4 = znVar.f8316gv;
        if (z10) {
            iP4 = dVar.p();
        }
        boolean z11 = (iN3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        boolean z12 = (iN3 & NotificationCompat.FLAG_GROUP_SUMMARY) != 0;
        boolean z13 = (iN3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0;
        boolean z14 = (iN3 & 2048) != 0;
        long j4 = t(xcVar) ? ((long[]) ut.i9(xcVar.f8308c5))[0] : 0L;
        int[] iArr = pVar.f8290c5;
        long[] jArr2 = pVar.f8294i9;
        boolean[] zArr = pVar.f8291f;
        int i10 = iP4;
        boolean z15 = xcVar.n3 == 2 && (i5 & 1) != 0;
        int i11 = i8 + pVar.f8297s[i];
        boolean z16 = z15;
        long j7 = xcVar.zn;
        long j8 = pVar.f8296p;
        int i12 = i8;
        while (i12 < i11) {
            int iV = v(z11 ? dVar.p() : znVar.n3);
            if (z12) {
                iP = dVar.p();
                z = z11;
            } else {
                z = z11;
                iP = znVar.zn;
            }
            int iV2 = v(iP);
            if (z13) {
                z5 = z10;
                iP2 = dVar.p();
            } else if (i12 == 0 && z10) {
                z5 = z10;
                iP2 = i10;
            } else {
                z5 = z10;
                iP2 = znVar.f8316gv;
            }
            if (z14) {
                z7 = z14;
                z8 = z12;
                z9 = z13;
                iP3 = dVar.p();
            } else {
                z7 = z14;
                z8 = z12;
                z9 = z13;
                iP3 = 0;
            }
            long jX5 = ut.x5((((long) iP3) + j8) - j4, 1000000L, j7);
            jArr2[i12] = jX5;
            if (!pVar.f8295mt) {
                jArr2[i12] = jX5 + n3Var2.f8266gv.f8277s;
            }
            iArr[i12] = iV2;
            zArr[i12] = ((iP2 >> 16) & 1) == 0 && (!z16 || i12 == 0);
            j8 += (long) iV;
            i12++;
            n3Var2 = n3Var;
            z11 = z;
            z10 = z5;
            z14 = z7;
            z12 = z8;
            z13 = z9;
        }
        pVar.f8296p = j8;
        return i11;
    }

    public final void b(b1.tl tlVar) throws IOException {
        int i = ((int) this.f8250mt) - this.f8242co;
        d dVar = this.z;
        if (dVar != null) {
            tlVar.readFully(dVar.v(), 8, i);
            p(new y.n3(this.f8251p, dVar), tlVar.getPosition());
        } else {
            tlVar.w(i);
        }
        a8(tlVar.getPosition());
    }

    public final void co(y.C0180y c0180y) throws q {
        int i = 0;
        v0.y.s(this.n3 == null, "Unexpected moov box.");
        DrmInitData drmInitDataC5 = c5(c0180y.zn);
        y.C0180y c0180y2 = (y.C0180y) v0.y.v(c0180y.a(1836475768));
        SparseArray<zn> sparseArray = new SparseArray<>();
        int size = c0180y2.zn.size();
        long jR = -9223372036854775807L;
        for (int i5 = 0; i5 < size; i5++) {
            y.n3 n3Var = c0180y2.zn.get(i5);
            int i8 = n3Var.y;
            if (i8 == 1953654136) {
                Pair<Integer, zn> pairD = d(n3Var.n3);
                sparseArray.put(((Integer) pairD.first).intValue(), (zn) pairD.second);
            } else if (i8 == 1835362404) {
                jR = r(n3Var.n3);
            }
        }
        List<mt> listD0 = tn.n3.d0(c0180y, new f3(), jR, drmInitDataC5, (this.y & 16) != 0, false, new g4.fb() { // from class: tn.a
            @Override // g4.fb
            public final Object apply(Object obj) {
                return this.y.wz((xc) obj);
            }
        });
        int size2 = listD0.size();
        if (this.f8247gv.size() != 0) {
            v0.y.fb(this.f8247gv.size() == size2);
            while (i < size2) {
                mt mtVar = listD0.get(i);
                xc xcVar = mtVar.y;
                this.f8247gv.get(xcVar.y).i9(mtVar, s(sparseArray, xcVar.y));
                i++;
            }
            return;
        }
        while (i < size2) {
            mt mtVar2 = listD0.get(i);
            xc xcVar2 = mtVar2.y;
            this.f8247gv.put(xcVar2.y, new n3(this.f8255ta.a(i, xcVar2.n3), mtVar2, s(sparseArray, xcVar2.y)));
            this.f3 = Math.max(this.f3, xcVar2.f8314v);
            i++;
        }
        this.f8255ta.p();
    }

    public final void f() {
        int i;
        ta[] taVarArr = new ta[2];
        this.f8243d = taVarArr;
        ta taVar = this.f8260xc;
        int i5 = 0;
        if (taVar != null) {
            taVarArr[0] = taVar;
            i = 1;
        } else {
            i = 0;
        }
        int i8 = 100;
        if ((this.y & 4) != 0) {
            taVarArr[i] = this.f8255ta.a(100, 5);
            i8 = 101;
            i++;
        }
        ta[] taVarArr2 = (ta[]) ut.qj(this.f8243d, i);
        this.f8243d = taVarArr2;
        for (ta taVar2 : taVarArr2) {
            taVar2.y(f8239x);
        }
        this.f8261z6 = new ta[this.zn.size()];
        while (i5 < this.f8261z6.length) {
            ta taVarA = this.f8255ta.a(i8, 3);
            taVarA.y(this.zn.get(i5));
            this.f8261z6[i5] = taVarA;
            i5++;
            i8++;
        }
    }

    @Override // b1.t
    public int fb(b1.tl tlVar, d0 d0Var) throws IOException {
        while (true) {
            int i = this.w;
            if (i != 0) {
                if (i == 1) {
                    b(tlVar);
                } else if (i == 2) {
                    k5(tlVar);
                } else if (yt(tlVar)) {
                    return 0;
                }
            } else if (!x(tlVar)) {
                return -1;
            }
        }
    }

    @Override // b1.t
    public boolean gv(b1.tl tlVar) throws IOException {
        return wz.n3(tlVar);
    }

    public final void k5(b1.tl tlVar) throws IOException {
        int size = this.f8247gv.size();
        long j = Long.MAX_VALUE;
        n3 n3VarValueAt = null;
        for (int i = 0; i < size; i++) {
            p pVar = this.f8247gv.valueAt(i).n3;
            if (pVar.w) {
                long j4 = pVar.f8293gv;
                if (j4 < j) {
                    n3VarValueAt = this.f8247gv.valueAt(i);
                    j = j4;
                }
            }
        }
        if (n3VarValueAt == null) {
            this.w = 3;
            return;
        }
        int position = (int) (j - tlVar.getPosition());
        if (position < 0) {
            throw q.y("Offset to encryption data was negative.", null);
        }
        tlVar.w(position);
        n3VarValueAt.n3.y(tlVar);
    }

    public final void mt(y.C0180y c0180y) throws q {
        x4(c0180y, this.f8247gv, this.n3 != null, this.y, this.f8253s);
        DrmInitData drmInitDataC5 = c5(c0180y.zn);
        if (drmInitDataC5 != null) {
            int size = this.f8247gv.size();
            for (int i = 0; i < size; i++) {
                this.f8247gv.valueAt(i).wz(drmInitDataC5);
            }
        }
        if (this.f8248i4 != -9223372036854775807L) {
            int size2 = this.f8247gv.size();
            for (int i5 = 0; i5 < size2; i5++) {
                this.f8247gv.valueAt(i5).t(this.f8248i4);
            }
            this.f8248i4 = -9223372036854775807L;
        }
    }

    public final void p(y.n3 n3Var, long j) throws q {
        if (!this.f8256tl.isEmpty()) {
            this.f8256tl.peek().v(n3Var);
            return;
        }
        int i = n3Var.y;
        if (i != 1936286840) {
            if (i == 1701671783) {
                w(n3Var.n3);
            }
        } else {
            Pair<Long, b1.gv> pairFh = fh(n3Var.n3, j);
            this.n = ((Long) pairFh.first).longValue();
            this.f8255ta.z((fh) pairFh.second);
            this.f8244ej = true;
        }
    }

    public final zn s(SparseArray<zn> sparseArray, int i) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (zn) v0.y.v(sparseArray.get(i));
    }

    public final void w(d dVar) {
        long jX5;
        String str;
        long jX52;
        String str2;
        long jA8;
        long jY;
        if (this.f8243d.length == 0) {
            return;
        }
        dVar.oz(8);
        int iZn = tn.y.zn(dVar.p());
        if (iZn == 0) {
            String str3 = (String) v0.y.v(dVar.fh());
            String str4 = (String) v0.y.v(dVar.fh());
            long jA82 = dVar.a8();
            jX5 = ut.x5(dVar.a8(), 1000000L, jA82);
            long j = this.n;
            long j4 = j != -9223372036854775807L ? j + jX5 : -9223372036854775807L;
            str = str3;
            jX52 = ut.x5(dVar.a8(), 1000L, jA82);
            str2 = str4;
            jA8 = dVar.a8();
            jY = j4;
        } else {
            if (iZn != 1) {
                r.c5("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iZn);
                return;
            }
            long jA83 = dVar.a8();
            jY = ut.x5(dVar.k5(), 1000000L, jA83);
            long jX53 = ut.x5(dVar.a8(), 1000L, jA83);
            long jA84 = dVar.a8();
            str = (String) v0.y.v(dVar.fh());
            jX52 = jX53;
            jA8 = jA84;
            str2 = (String) v0.y.v(dVar.fh());
            jX5 = -9223372036854775807L;
        }
        byte[] bArr = new byte[dVar.y()];
        dVar.t(bArr, 0, dVar.y());
        d dVar2 = new d(this.f8245f.y(new EventMessage(str, str2, jX52, jA8, bArr)));
        int iY = dVar2.y();
        for (ta taVar : this.f8243d) {
            dVar2.oz(0);
            taVar.n3(dVar2, iY);
        }
        if (jY == -9223372036854775807L) {
            this.f8258wz.addLast(new y(jX5, true, iY));
            this.f8259x4 += iY;
            return;
        }
        if (!this.f8258wz.isEmpty()) {
            this.f8258wz.addLast(new y(jY, false, iY));
            this.f8259x4 += iY;
            return;
        }
        hw hwVar = this.f8249i9;
        if (hwVar != null) {
            jY = hwVar.y(jY);
        }
        for (ta taVar2 : this.f8243d) {
            taVar2.a(jY, 1, iY, 0, null);
        }
    }

    public final void xc(y.C0180y c0180y) throws q {
        int i = c0180y.y;
        if (i == 1836019574) {
            co(c0180y);
        } else if (i == 1836019558) {
            mt(c0180y);
        } else {
            if (this.f8256tl.isEmpty()) {
                return;
            }
            this.f8256tl.peek().gv(c0180y);
        }
    }

    @Override // b1.t
    public void y(long j, long j4) {
        int size = this.f8247gv.size();
        for (int i = 0; i < size; i++) {
            this.f8247gv.valueAt(i).f();
        }
        this.f8258wz.clear();
        this.f8259x4 = 0;
        this.f8248i4 = j4;
        this.f8256tl.clear();
        a();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean yt(b1.tl tlVar) throws IOException {
        int iV;
        n3 n3VarI9 = this.c;
        Throwable th = null;
        if (n3VarI9 == null) {
            n3VarI9 = i9(this.f8247gv);
            if (n3VarI9 == null) {
                int position = (int) (this.f8252r - tlVar.getPosition());
                if (position < 0) {
                    throw q.y("Offset to end of mdat was negative.", null);
                }
                tlVar.w(position);
                a();
                return false;
            }
            int iGv = (int) (n3VarI9.gv() - tlVar.getPosition());
            if (iGv < 0) {
                r.c5("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iGv = 0;
            }
            tlVar.w(iGv);
            this.c = n3VarI9;
        }
        int i = 4;
        int i5 = 1;
        if (this.w == 3) {
            int iA = n3VarI9.a();
            this.d0 = iA;
            if (n3VarI9.f8262a < n3VarI9.f8263c5) {
                tlVar.w(iA);
                n3VarI9.tl();
                if (!n3VarI9.s()) {
                    this.c = null;
                }
                this.w = 3;
                return true;
            }
            if (n3VarI9.f8266gv.y.f8310fb == 1) {
                this.d0 = iA - 8;
                tlVar.w(8);
            }
            if ("audio/ac4".equals(n3VarI9.f8266gv.y.f8307a.f3)) {
                this.fh = n3VarI9.c5(this.d0, 7);
                mn.zn.y(this.d0, this.f8241c5);
                n3VarI9.y.n3(this.f8241c5, 7);
                this.fh += 7;
            } else {
                this.fh = n3VarI9.c5(this.d0, 0);
            }
            this.d0 += this.fh;
            this.w = 4;
            this.rz = 0;
        }
        xc xcVar = n3VarI9.f8266gv.y;
        ta taVar = n3VarI9.y;
        long jV = n3VarI9.v();
        hw hwVar = this.f8249i9;
        if (hwVar != null) {
            jV = hwVar.y(jV);
        }
        long j = jV;
        if (xcVar.f8312i9 == 0) {
            while (true) {
                int i8 = this.fh;
                int i10 = this.d0;
                if (i8 >= i10) {
                    break;
                }
                this.fh += taVar.v(tlVar, i10 - i8, false);
            }
        } else {
            byte[] bArrV = this.f8240a.v();
            bArrV[0] = 0;
            bArrV[1] = 0;
            bArrV[2] = 0;
            int i11 = xcVar.f8312i9;
            int i12 = i11 + 1;
            int i13 = 4 - i11;
            while (this.fh < this.d0) {
                int i14 = this.rz;
                if (i14 == 0) {
                    tlVar.readFully(bArrV, i13, i12);
                    this.f8240a.oz(0);
                    int iP = this.f8240a.p();
                    if (iP < i5) {
                        throw q.y("Invalid NAL length", th);
                    }
                    this.rz = iP - 1;
                    this.f8257v.oz(0);
                    taVar.n3(this.f8257v, i);
                    taVar.n3(this.f8240a, i5);
                    this.mg = this.f8261z6.length > 0 && c.fb(xcVar.f8307a.f3, bArrV[i]);
                    this.fh += 5;
                    this.d0 += i13;
                } else {
                    if (this.mg) {
                        this.f8246fb.j5(i14);
                        tlVar.readFully(this.f8246fb.v(), 0, this.rz);
                        taVar.n3(this.f8246fb, this.rz);
                        iV = this.rz;
                        int iP2 = c.p(this.f8246fb.v(), this.f8246fb.fb());
                        this.f8246fb.oz("video/hevc".equals(xcVar.f8307a.f3) ? 1 : 0);
                        this.f8246fb.j(iP2);
                        b1.zn.y(j, this.f8246fb, this.f8261z6);
                    } else {
                        iV = taVar.v(tlVar, i14, false);
                    }
                    this.fh += iV;
                    this.rz -= iV;
                    th = null;
                    i = 4;
                    i5 = 1;
                }
            }
        }
        int iZn = n3VarI9.zn();
        w wVarFb = n3VarI9.fb();
        taVar.a(j, iZn, this.d0, 0, wVarFb != null ? wVarFb.zn : null);
        z(j);
        if (!n3VarI9.s()) {
            this.c = null;
        }
        this.w = 3;
        return true;
    }

    public final void z(long j) {
        while (!this.f8258wz.isEmpty()) {
            y yVarRemoveFirst = this.f8258wz.removeFirst();
            this.f8259x4 -= yVarRemoveFirst.zn;
            long jY = yVarRemoveFirst.y;
            if (yVarRemoveFirst.n3) {
                jY += j;
            }
            hw hwVar = this.f8249i9;
            if (hwVar != null) {
                jY = hwVar.y(jY);
            }
            for (ta taVar : this.f8243d) {
                taVar.a(jY, 1, yVarRemoveFirst.zn, this.f8259x4, null);
            }
        }
    }

    @Override // b1.t
    public void zn(b1.wz wzVar) {
        this.f8255ta = wzVar;
        a();
        f();
        xc xcVar = this.n3;
        if (xcVar != null) {
            this.f8247gv.put(0, new n3(wzVar.a(0, xcVar.n3), new mt(this.n3, new long[0], new int[0], 0, new long[0], new int[0], 0L), new zn(0, 0, 0, 0)));
            this.f8255ta.p();
        }
    }

    public fb(int i) {
        this(i, null);
    }

    public fb(int i, @Nullable hw hwVar) {
        this(i, hwVar, null, Collections.emptyList());
    }

    public fb(int i, @Nullable hw hwVar, @Nullable xc xcVar) {
        this(i, hwVar, xcVar, Collections.emptyList());
    }

    public fb(int i, @Nullable hw hwVar, @Nullable xc xcVar, List<g> list) {
        this(i, hwVar, xcVar, list, null);
    }

    public fb(int i, @Nullable hw hwVar, @Nullable xc xcVar, List<g> list, @Nullable ta taVar) {
        this.y = i;
        this.f8249i9 = hwVar;
        this.n3 = xcVar;
        this.zn = Collections.unmodifiableList(list);
        this.f8260xc = taVar;
        this.f8245f = new qg.n3();
        this.f8254t = new d(16);
        this.f8257v = new d(c.y);
        this.f8240a = new d(5);
        this.f8246fb = new d();
        byte[] bArr = new byte[16];
        this.f8253s = bArr;
        this.f8241c5 = new d(bArr);
        this.f8256tl = new ArrayDeque<>();
        this.f8258wz = new ArrayDeque<>();
        this.f8247gv = new SparseArray<>();
        this.f3 = -9223372036854775807L;
        this.f8248i4 = -9223372036854775807L;
        this.n = -9223372036854775807L;
        this.f8255ta = b1.wz.f1283c5;
        this.f8243d = new ta[0];
        this.f8261z6 = new ta[0];
    }

    @Override // b1.t
    public void release() {
    }

    @Nullable
    public xc wz(@Nullable xc xcVar) {
        return xcVar;
    }
}
