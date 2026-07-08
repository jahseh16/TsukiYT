package tn;

import android.util.Pair;
import androidx.annotation.Nullable;
import b1.f3;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import ft.g;
import ft.q;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import tn.y;
import v0.d;
import v0.n;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public static final byte[] y = ut.ap("OpusHead");

    public static final class a implements zn {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f8279gv;
        public final int n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f8280v;
        public final d y;
        public final int zn;

        public a(y.n3 n3Var) {
            d dVar = n3Var.n3;
            this.y = dVar;
            dVar.oz(12);
            this.zn = dVar.b() & 255;
            this.n3 = dVar.b();
        }

        @Override // tn.n3.zn
        public int n3() {
            return -1;
        }

        @Override // tn.n3.zn
        public int y() {
            int i = this.zn;
            if (i == 8) {
                return this.y.ej();
            }
            if (i == 16) {
                return this.y.yt();
            }
            int i5 = this.f8279gv;
            this.f8279gv = i5 + 1;
            if (i5 % 2 != 0) {
                return this.f8280v & 15;
            }
            int iEj = this.y.ej();
            this.f8280v = iEj;
            return (iEj & 240) >> 4;
        }

        @Override // tn.n3.zn
        public int zn() {
            return this.n3;
        }
    }

    public static final class fb {
        public final long n3;
        public final int y;
        public final int zn;

        public fb(int i, long j, int i5) {
            this.y = i;
            this.n3 = j;
            this.zn = i5;
        }
    }

    public static final class gv {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f8281gv = 0;

        @Nullable
        public g n3;
        public final w[] y;
        public int zn;

        public gv(int i) {
            this.y = new w[i];
        }
    }

    /* JADX INFO: renamed from: tn.n3$n3, reason: collision with other inner class name */
    public static final class C0179n3 {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final long f8282gv;
        public final byte[] n3;
        public final String y;
        public final long zn;

        public C0179n3(String str, byte[] bArr, long j, long j4) {
            this.y = str;
            this.n3 = bArr;
            this.zn = j;
            this.f8282gv = j4;
        }
    }

    public static final class v implements zn {
        public final int n3;
        public final int y;
        public final d zn;

        public v(y.n3 n3Var, g gVar) {
            d dVar = n3Var.n3;
            this.zn = dVar;
            dVar.oz(12);
            int iB = dVar.b();
            if ("audio/raw".equals(gVar.f3)) {
                int iCt = ut.ct(gVar.f4790ut, gVar.j);
                if (iB == 0 || iB % iCt != 0) {
                    r.c5("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iCt + ", stsz sample size: " + iB);
                    iB = iCt;
                }
            }
            this.y = iB == 0 ? -1 : iB;
            this.n3 = dVar.b();
        }

        @Override // tn.n3.zn
        public int n3() {
            return this.y;
        }

        @Override // tn.n3.zn
        public int y() {
            int i = this.y;
            return i == -1 ? this.zn.b() : i;
        }

        @Override // tn.n3.zn
        public int zn() {
            return this.n3;
        }
    }

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f8283a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public int f8284c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final d f8285fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public long f8286gv;
        public int n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f8287s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f8288v;
        public final int y;
        public int zn;

        public y(d dVar, d dVar2, boolean z) throws q {
            this.f8285fb = dVar;
            this.f8283a = dVar2;
            this.f8288v = z;
            dVar2.oz(12);
            this.y = dVar2.b();
            dVar.oz(12);
            this.f8284c5 = dVar.b();
            b1.xc.y(dVar.p() == 1, "first_chunk must be 1");
            this.n3 = -1;
        }

        public boolean y() {
            int i = this.n3 + 1;
            this.n3 = i;
            if (i == this.y) {
                return false;
            }
            this.f8286gv = this.f8288v ? this.f8283a.k5() : this.f8283a.a8();
            if (this.n3 == this.f8287s) {
                this.zn = this.f8285fb.b();
                this.f8285fb.ut(4);
                int i5 = this.f8284c5 - 1;
                this.f8284c5 = i5;
                this.f8287s = i5 > 0 ? this.f8285fb.b() - 1 : -1;
            }
            return true;
        }
    }

    public interface zn {
        int n3();

        int y();

        int zn();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(v0.d r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r29, tn.n3.gv r30, int r31) throws ft.q {
        /*
            Method dump skipped, instruction units count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tn.n3.a(v0.d, int, int, int, int, java.lang.String, boolean, com.google.android.exoplayer2.drm.DrmInitData, tn.n3$gv, int):void");
    }

    @Nullable
    public static xc c(y.C0180y c0180y, y.n3 n3Var, long j, @Nullable DrmInitData drmInitData, boolean z, boolean z5) throws q {
        y.n3 n3Var2;
        long j4;
        long[] jArr;
        long[] jArr2;
        y.C0180y c0180yA;
        Pair<long[], long[]> pairS;
        y.C0180y c0180y2 = (y.C0180y) v0.y.v(c0180y.a(1835297121));
        int iGv = gv(f(((y.n3) v0.y.v(c0180y2.fb(1751411826))).n3));
        if (iGv == -1) {
            return null;
        }
        fb fbVarN = n(((y.n3) v0.y.v(c0180y.fb(1953196132))).n3);
        if (j == -9223372036854775807L) {
            n3Var2 = n3Var;
            j4 = fbVarN.n3;
        } else {
            n3Var2 = n3Var;
            j4 = j;
        }
        long jW = w(n3Var2.n3);
        long jX5 = j4 != -9223372036854775807L ? ut.x5(j4, 1000000L, jW) : -9223372036854775807L;
        y.C0180y c0180y3 = (y.C0180y) v0.y.v(((y.C0180y) v0.y.v(c0180y2.a(1835626086))).a(1937007212));
        Pair<Long, String> pairTl = tl(((y.n3) v0.y.v(c0180y2.fb(1835296868))).n3);
        y.n3 n3VarFb = c0180y3.fb(1937011556);
        if (n3VarFb == null) {
            throw q.y("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        gv gvVarI4 = i4(n3VarFb.n3, fbVarN.y, fbVarN.zn, (String) pairTl.second, drmInitData, z5);
        if (z || (c0180yA = c0180y.a(1701082227)) == null || (pairS = s(c0180yA)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairS.first;
            jArr2 = (long[]) pairS.second;
            jArr = jArr3;
        }
        if (gvVarI4.n3 == null) {
            return null;
        }
        return new xc(fbVarN.y, iGv, ((Long) pairTl.first).longValue(), jW, jX5, gvVarI4.n3, gvVarI4.f8281gv, gvVarI4.y, gvVarI4.zn, jArr, jArr2);
    }

    public static C0179n3 c5(d dVar, int i) {
        dVar.oz(i + 12);
        dVar.ut(1);
        i9(dVar);
        dVar.ut(2);
        int iEj = dVar.ej();
        if ((iEj & 128) != 0) {
            dVar.ut(2);
        }
        if ((iEj & 64) != 0) {
            dVar.ut(dVar.ej());
        }
        if ((iEj & 32) != 0) {
            dVar.ut(2);
        }
        dVar.ut(1);
        i9(dVar);
        String strS = n.s(dVar.ej());
        if ("audio/mpeg".equals(strS) || "audio/vnd.dts".equals(strS) || "audio/vnd.dts.hd".equals(strS)) {
            return new C0179n3(strS, null, -1L, -1L);
        }
        dVar.ut(4);
        long jA8 = dVar.a8();
        long jA82 = dVar.a8();
        dVar.ut(1);
        int iI9 = i9(dVar);
        byte[] bArr = new byte[iI9];
        dVar.t(bArr, 0, iI9);
        return new C0179n3(strS, bArr, jA82 > 0 ? jA82 : -1L, jA8 > 0 ? jA8 : -1L);
    }

    @Nullable
    public static Pair<Integer, w> co(d dVar, int i, int i5) throws q {
        Pair<Integer, w> pairFb;
        int iA = dVar.a();
        while (iA - i < i5) {
            dVar.oz(iA);
            int iP = dVar.p();
            b1.xc.y(iP > 0, "childAtomSize must be positive");
            if (dVar.p() == 1936289382 && (pairFb = fb(dVar, iA, iP)) != null) {
                return pairFb;
            }
            iA += iP;
        }
        return null;
    }

    public static List<mt> d0(y.C0180y c0180y, f3 f3Var, long j, @Nullable DrmInitData drmInitData, boolean z, boolean z5, g4.fb<xc, xc> fbVar) throws q {
        xc xcVarApply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c0180y.f8315gv.size(); i++) {
            y.C0180y c0180y2 = c0180y.f8315gv.get(i);
            if (c0180y2.y == 1953653099 && (xcVarApply = fbVar.apply(c(c0180y2, (y.n3) v0.y.v(c0180y.fb(1836476516)), j, drmInitData, z, z5))) != null) {
                arrayList.add(x4(xcVarApply, (y.C0180y) v0.y.v(((y.C0180y) v0.y.v(((y.C0180y) v0.y.v(c0180y2.a(1835297121))).a(1835626086))).a(1937007212)), f3Var));
            }
        }
        return arrayList;
    }

    public static int f(d dVar) {
        dVar.oz(16);
        return dVar.p();
    }

    public static void f3(d dVar, int i, int i5, int i8, int i10, String str, gv gvVar) {
        dVar.oz(i5 + 16);
        String str2 = "application/ttml+xml";
        k4.r rVarJ = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i11 = i8 - 16;
                byte[] bArr = new byte[i11];
                dVar.t(bArr, 0, i11);
                rVarJ = k4.r.j(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else {
                if (i != 1664495672) {
                    throw new IllegalStateException();
                }
                gvVar.f8281gv = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        gvVar.n3 = new g.n3().j(i10).o4(str2).k(str).nf(j).ut(rVarJ).z6();
    }

    @Nullable
    public static Pair<Integer, w> fb(d dVar, int i, int i5) throws q {
        int i8 = i + 8;
        String strTa = null;
        Integer numValueOf = null;
        int i10 = -1;
        int i11 = 0;
        while (i8 - i < i5) {
            dVar.oz(i8);
            int iP = dVar.p();
            int iP2 = dVar.p();
            if (iP2 == 1718775137) {
                numValueOf = Integer.valueOf(dVar.p());
            } else if (iP2 == 1935894637) {
                dVar.ut(4);
                strTa = dVar.ta(4);
            } else if (iP2 == 1935894633) {
                i10 = i8;
                i11 = iP;
            }
            i8 += iP;
        }
        if (!"cenc".equals(strTa) && !"cbc1".equals(strTa) && !"cens".equals(strTa) && !"cbcs".equals(strTa)) {
            return null;
        }
        b1.xc.y(numValueOf != null, "frma atom is mandatory");
        b1.xc.y(i10 != -1, "schi atom is mandatory");
        w wVarZ = z(dVar, i10, i11, strTa);
        b1.xc.y(wVarZ != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (w) ut.i9(wVarZ));
    }

    public static Pair<Metadata, Metadata> fh(y.n3 n3Var) {
        d dVar = n3Var.n3;
        dVar.oz(8);
        Metadata metadataRz = null;
        Metadata metadataR = null;
        while (dVar.y() >= 8) {
            int iA = dVar.a();
            int iP = dVar.p();
            int iP2 = dVar.p();
            if (iP2 == 1835365473) {
                dVar.oz(iA);
                metadataRz = rz(dVar, iA + iP);
            } else if (iP2 == 1936553057) {
                dVar.oz(iA);
                metadataR = r(dVar, iA + iP);
            }
            dVar.oz(iA + iP);
        }
        return Pair.create(metadataRz, metadataR);
    }

    public static int gv(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static gv i4(d dVar, int i, int i5, String str, @Nullable DrmInitData drmInitData, boolean z) throws q {
        int i8;
        dVar.oz(12);
        int iP = dVar.p();
        gv gvVar = new gv(iP);
        for (int i10 = 0; i10 < iP; i10++) {
            int iA = dVar.a();
            int iP2 = dVar.p();
            b1.xc.y(iP2 > 0, "childAtomSize must be positive");
            int iP3 = dVar.p();
            if (iP3 == 1635148593 || iP3 == 1635148595 || iP3 == 1701733238 || iP3 == 1831958048 || iP3 == 1836070006 || iP3 == 1752589105 || iP3 == 1751479857 || iP3 == 1932670515 || iP3 == 1211250227 || iP3 == 1987063864 || iP3 == 1987063865 || iP3 == 1635135537 || iP3 == 1685479798 || iP3 == 1685479729 || iP3 == 1685481573 || iP3 == 1685481521) {
                i8 = iA;
                mg(dVar, iP3, i8, iP2, i, i5, drmInitData, gvVar, i10);
            } else if (iP3 == 1836069985 || iP3 == 1701733217 || iP3 == 1633889587 || iP3 == 1700998451 || iP3 == 1633889588 || iP3 == 1835823201 || iP3 == 1685353315 || iP3 == 1685353317 || iP3 == 1685353320 || iP3 == 1685353324 || iP3 == 1685353336 || iP3 == 1935764850 || iP3 == 1935767394 || iP3 == 1819304813 || iP3 == 1936684916 || iP3 == 1953984371 || iP3 == 778924082 || iP3 == 778924083 || iP3 == 1835557169 || iP3 == 1835560241 || iP3 == 1634492771 || iP3 == 1634492791 || iP3 == 1970037111 || iP3 == 1332770163 || iP3 == 1716281667) {
                i8 = iA;
                a(dVar, iP3, iA, iP2, i, str, z, drmInitData, gvVar, i10);
            } else {
                if (iP3 == 1414810956 || iP3 == 1954034535 || iP3 == 2004251764 || iP3 == 1937010800 || iP3 == 1664495672) {
                    f3(dVar, iP3, iA, iP2, i, str, gvVar);
                } else if (iP3 == 1835365492) {
                    xc(dVar, iP3, iA, i, gvVar);
                } else if (iP3 == 1667329389) {
                    gvVar.n3 = new g.n3().j(i).o4("application/x-camera-motion").z6();
                }
                i8 = iA;
            }
            dVar.oz(i8 + iP2);
        }
        return gvVar;
    }

    public static int i9(d dVar) {
        int iEj = dVar.ej();
        int i = iEj & 127;
        while ((iEj & 128) == 128) {
            iEj = dVar.ej();
            i = (i << 7) | (iEj & 127);
        }
        return i;
    }

    public static void mg(d dVar, int i, int i5, int i8, int i10, int i11, @Nullable DrmInitData drmInitData, gv gvVar, int i12) throws q {
        String str;
        DrmInitData drmInitData2;
        int i13;
        int i14;
        float f3;
        List<byte[]> list;
        int i15;
        int i16;
        int i17;
        String str2;
        int i18 = i5;
        int i19 = i8;
        DrmInitData drmInitDataZn = drmInitData;
        gv gvVar2 = gvVar;
        dVar.oz(i18 + 16);
        dVar.ut(16);
        int iYt = dVar.yt();
        int iYt2 = dVar.yt();
        dVar.ut(50);
        int iA = dVar.a();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair<Integer, w> pairCo = co(dVar, i18, i19);
            if (pairCo != null) {
                iIntValue = ((Integer) pairCo.first).intValue();
                drmInitDataZn = drmInitDataZn == null ? null : drmInitDataZn.zn(((w) pairCo.second).n3);
                gvVar2.y[i12] = (w) pairCo.second;
            }
            dVar.oz(iA);
        }
        String str3 = "video/3gpp";
        String str4 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        float fP = 1.0f;
        String str5 = null;
        List<byte[]> listJ = null;
        byte[] bArrMt = null;
        int i20 = -1;
        int iN3 = -1;
        int i21 = -1;
        int iZn = -1;
        ByteBuffer byteBufferY = null;
        C0179n3 c0179n3C5 = null;
        boolean z = false;
        while (iA - i18 < i19) {
            dVar.oz(iA);
            int iA2 = dVar.a();
            int iP = dVar.p();
            if (iP == 0) {
                str = str3;
                if (dVar.a() - i18 == i19) {
                    break;
                }
            } else {
                str = str3;
            }
            b1.xc.y(iP > 0, "childAtomSize must be positive");
            int iP2 = dVar.p();
            if (iP2 == 1635148611) {
                b1.xc.y(str4 == null, null);
                dVar.oz(iA2 + 8);
                w0.y yVarN3 = w0.y.n3(dVar);
                listJ = yVarN3.y;
                gvVar2.zn = yVarN3.n3;
                if (!z) {
                    fP = yVarN3.f8945v;
                }
                str5 = yVarN3.f8943a;
                str2 = "video/avc";
            } else {
                if (iP2 == 1752589123) {
                    b1.xc.y(str4 == null, null);
                    dVar.oz(iA2 + 8);
                    w0.a aVarY = w0.a.y(dVar);
                    listJ = aVarY.y;
                    gvVar2.zn = aVarY.n3;
                    if (!z) {
                        fP = aVarY.f8862v;
                    }
                    str5 = aVarY.f8858c5;
                    int i22 = aVarY.f8857a;
                    int i23 = aVarY.f8859fb;
                    iZn = aVarY.f8861s;
                    drmInitData2 = drmInitDataZn;
                    i13 = iYt2;
                    iN3 = i22;
                    i14 = iIntValue;
                    i21 = i23;
                    str4 = "video/hevc";
                } else {
                    if (iP2 == 1685480259 || iP2 == 1685485123) {
                        drmInitData2 = drmInitDataZn;
                        i13 = iYt2;
                        i14 = iIntValue;
                        f3 = fP;
                        list = listJ;
                        i15 = iN3;
                        i16 = i21;
                        i17 = iZn;
                        w0.gv gvVarY = w0.gv.y(dVar);
                        if (gvVarY != null) {
                            str5 = gvVarY.zn;
                            str4 = "video/dolby-vision";
                        }
                    } else if (iP2 == 1987076931) {
                        b1.xc.y(str4 == null, null);
                        str2 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                        dVar.oz(iA2 + 12);
                        dVar.ut(2);
                        boolean z5 = (dVar.ej() & 1) != 0;
                        int iEj = dVar.ej();
                        int iEj2 = dVar.ej();
                        iN3 = w0.zn.n3(iEj);
                        i21 = z5 ? 1 : 2;
                        iZn = w0.zn.zn(iEj2);
                    } else if (iP2 == 1635135811) {
                        b1.xc.y(str4 == null, null);
                        str2 = "video/av01";
                    } else if (iP2 == 1668050025) {
                        if (byteBufferY == null) {
                            byteBufferY = y();
                        }
                        ByteBuffer byteBuffer = byteBufferY;
                        byteBuffer.position(21);
                        byteBuffer.putShort(dVar.mg());
                        byteBuffer.putShort(dVar.mg());
                        byteBufferY = byteBuffer;
                        drmInitData2 = drmInitDataZn;
                        i13 = iYt2;
                        i14 = iIntValue;
                    } else if (iP2 == 1835295606) {
                        if (byteBufferY == null) {
                            byteBufferY = y();
                        }
                        ByteBuffer byteBuffer2 = byteBufferY;
                        short sMg = dVar.mg();
                        short sMg2 = dVar.mg();
                        short sMg3 = dVar.mg();
                        i14 = iIntValue;
                        short sMg4 = dVar.mg();
                        short sMg5 = dVar.mg();
                        drmInitData2 = drmInitDataZn;
                        short sMg6 = dVar.mg();
                        List<byte[]> list2 = listJ;
                        short sMg7 = dVar.mg();
                        float f4 = fP;
                        short sMg8 = dVar.mg();
                        long jA8 = dVar.a8();
                        long jA82 = dVar.a8();
                        i13 = iYt2;
                        byteBuffer2.position(1);
                        byteBuffer2.putShort(sMg5);
                        byteBuffer2.putShort(sMg6);
                        byteBuffer2.putShort(sMg);
                        byteBuffer2.putShort(sMg2);
                        byteBuffer2.putShort(sMg3);
                        byteBuffer2.putShort(sMg4);
                        byteBuffer2.putShort(sMg7);
                        byteBuffer2.putShort(sMg8);
                        byteBuffer2.putShort((short) (jA8 / 10000));
                        byteBuffer2.putShort((short) (jA82 / 10000));
                        byteBufferY = byteBuffer2;
                        listJ = list2;
                        fP = f4;
                    } else {
                        drmInitData2 = drmInitDataZn;
                        i13 = iYt2;
                        i14 = iIntValue;
                        f3 = fP;
                        list = listJ;
                        if (iP2 == 1681012275) {
                            b1.xc.y(str4 == null, null);
                            str4 = str;
                        } else if (iP2 == 1702061171) {
                            b1.xc.y(str4 == null, null);
                            c0179n3C5 = c5(dVar, iA2);
                            String str6 = c0179n3C5.y;
                            byte[] bArr = c0179n3C5.n3;
                            listJ = bArr != null ? k4.r.j(bArr) : list;
                            str4 = str6;
                            fP = f3;
                            iA += iP;
                            i18 = i5;
                            i19 = i8;
                            gvVar2 = gvVar;
                            str3 = str;
                            iIntValue = i14;
                            drmInitDataZn = drmInitData2;
                            iYt2 = i13;
                        } else if (iP2 == 1885434736) {
                            fP = p(dVar, iA2);
                            listJ = list;
                            z = true;
                            iA += iP;
                            i18 = i5;
                            i19 = i8;
                            gvVar2 = gvVar;
                            str3 = str;
                            iIntValue = i14;
                            drmInitDataZn = drmInitData2;
                            iYt2 = i13;
                        } else if (iP2 == 1937126244) {
                            bArrMt = mt(dVar, iA2, iP);
                        } else if (iP2 == 1936995172) {
                            int iEj3 = dVar.ej();
                            dVar.ut(3);
                            if (iEj3 == 0) {
                                int iEj4 = dVar.ej();
                                if (iEj4 == 0) {
                                    i20 = 0;
                                } else if (iEj4 == 1) {
                                    i20 = 1;
                                } else if (iEj4 == 2) {
                                    i20 = 2;
                                } else if (iEj4 == 3) {
                                    i20 = 3;
                                }
                            }
                        } else {
                            i15 = iN3;
                            if (iP2 == 1668246642) {
                                i16 = i21;
                                if (i15 == -1) {
                                    i17 = iZn;
                                    if (i16 == -1 && i17 == -1) {
                                        int iP3 = dVar.p();
                                        if (iP3 == 1852009592 || iP3 == 1852009571) {
                                            int iYt3 = dVar.yt();
                                            int iYt4 = dVar.yt();
                                            dVar.ut(2);
                                            boolean z7 = iP == 19 && (dVar.ej() & 128) != 0;
                                            iN3 = w0.zn.n3(iYt3);
                                            i21 = z7 ? 1 : 2;
                                            iZn = w0.zn.zn(iYt4);
                                        } else {
                                            r.c5("AtomParsers", "Unsupported color type: " + tn.y.y(iP3));
                                        }
                                    }
                                    iA += iP;
                                    i18 = i5;
                                    i19 = i8;
                                    gvVar2 = gvVar;
                                    str3 = str;
                                    iIntValue = i14;
                                    drmInitDataZn = drmInitData2;
                                    iYt2 = i13;
                                }
                            } else {
                                i16 = i21;
                            }
                            i17 = iZn;
                        }
                        listJ = list;
                        fP = f3;
                        iA += iP;
                        i18 = i5;
                        i19 = i8;
                        gvVar2 = gvVar;
                        str3 = str;
                        iIntValue = i14;
                        drmInitDataZn = drmInitData2;
                        iYt2 = i13;
                    }
                    i21 = i16;
                    iZn = i17;
                    iN3 = i15;
                    listJ = list;
                    fP = f3;
                    iA += iP;
                    i18 = i5;
                    i19 = i8;
                    gvVar2 = gvVar;
                    str3 = str;
                    iIntValue = i14;
                    drmInitDataZn = drmInitData2;
                    iYt2 = i13;
                }
                iA += iP;
                i18 = i5;
                i19 = i8;
                gvVar2 = gvVar;
                str3 = str;
                iIntValue = i14;
                drmInitDataZn = drmInitData2;
                iYt2 = i13;
            }
            str4 = str2;
            drmInitData2 = drmInitDataZn;
            i13 = iYt2;
            i14 = iIntValue;
            iA += iP;
            i18 = i5;
            i19 = i8;
            gvVar2 = gvVar;
            str3 = str;
            iIntValue = i14;
            drmInitDataZn = drmInitData2;
            iYt2 = i13;
        }
        DrmInitData drmInitData3 = drmInitDataZn;
        int i24 = iYt2;
        float f5 = fP;
        List<byte[]> list3 = listJ;
        int i25 = iN3;
        int i26 = i21;
        int i27 = iZn;
        if (str4 == null) {
            return;
        }
        g.n3 n3VarVl = new g.n3().j(i10).o4(str4).x(str5).s8(iYt).o(i24).y5(f5).ct(i11).xg(bArrMt).lc(i20).ut(list3).vl(drmInitData3);
        if (i25 != -1 || i26 != -1 || i27 != -1 || byteBufferY != null) {
            n3VarVl.b(new w0.zn(i25, i26, i27, byteBufferY != null ? byteBufferY.array() : null));
        }
        if (c0179n3C5 != null) {
            n3VarVl.ud(n4.a.tl(c0179n3C5.zn)).u(n4.a.tl(c0179n3C5.f8282gv));
        }
        gvVar.n3 = n3VarVl.z6();
    }

    @Nullable
    public static byte[] mt(d dVar, int i, int i5) {
        int i8 = i + 8;
        while (i8 - i < i5) {
            dVar.oz(i8);
            int iP = dVar.p();
            if (dVar.p() == 1886547818) {
                return Arrays.copyOfRange(dVar.v(), i8, iP + i8);
            }
            i8 += iP;
        }
        return null;
    }

    public static fb n(d dVar) {
        long j;
        dVar.oz(8);
        int iZn = tn.y.zn(dVar.p());
        dVar.ut(iZn == 0 ? 8 : 16);
        int iP = dVar.p();
        dVar.ut(4);
        int iA = dVar.a();
        int i = iZn == 0 ? 4 : 8;
        int i5 = 0;
        int i8 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i8 >= i) {
                dVar.ut(i);
                break;
            }
            if (dVar.v()[iA + i8] != -1) {
                long jA8 = iZn == 0 ? dVar.a8() : dVar.k5();
                if (jA8 != 0) {
                    j = jA8;
                }
            } else {
                i8++;
            }
        }
        dVar.ut(16);
        int iP2 = dVar.p();
        int iP3 = dVar.p();
        dVar.ut(4);
        int iP4 = dVar.p();
        int iP5 = dVar.p();
        if (iP2 == 0 && iP3 == 65536 && iP4 == -65536 && iP5 == 0) {
            i5 = 90;
        } else if (iP2 == 0 && iP3 == -65536 && iP4 == 65536 && iP5 == 0) {
            i5 = 270;
        } else if (iP2 == -65536 && iP3 == 0 && iP4 == 0 && iP5 == -65536) {
            i5 = 180;
        }
        return new fb(iP, j, i5);
    }

    public static boolean n3(long[] jArr, long j, long j4, long j7) {
        int length = jArr.length - 1;
        return jArr[0] <= j4 && j4 < jArr[ut.p(4, 0, length)] && jArr[ut.p(jArr.length - 4, 0, length)] < j7 && j7 <= j;
    }

    public static float p(d dVar, int i) {
        dVar.oz(i + 8);
        return dVar.b() / dVar.b();
    }

    @Nullable
    public static Metadata r(d dVar, int i) {
        dVar.ut(12);
        while (dVar.a() < i) {
            int iA = dVar.a();
            int iP = dVar.p();
            if (dVar.p() == 1935766900) {
                if (iP < 14) {
                    return null;
                }
                dVar.ut(5);
                int iEj = dVar.ej();
                if (iEj != 12 && iEj != 13) {
                    return null;
                }
                float f3 = iEj == 12 ? 240.0f : 120.0f;
                dVar.ut(1);
                return new Metadata(new SmtaMetadataEntry(f3, dVar.ej()));
            }
            dVar.oz(iA + iP);
        }
        return null;
    }

    @Nullable
    public static Metadata rz(d dVar, int i) {
        dVar.ut(8);
        v(dVar);
        while (dVar.a() < i) {
            int iA = dVar.a();
            int iP = dVar.p();
            if (dVar.p() == 1768715124) {
                dVar.oz(iA);
                return t(dVar, iA + iP);
            }
            dVar.oz(iA + iP);
        }
        return null;
    }

    @Nullable
    public static Pair<long[], long[]> s(y.C0180y c0180y) {
        y.n3 n3VarFb = c0180y.fb(1701606260);
        if (n3VarFb == null) {
            return null;
        }
        d dVar = n3VarFb.n3;
        dVar.oz(8);
        int iZn = tn.y.zn(dVar.p());
        int iB = dVar.b();
        long[] jArr = new long[iB];
        long[] jArr2 = new long[iB];
        for (int i = 0; i < iB; i++) {
            jArr[i] = iZn == 1 ? dVar.k5() : dVar.a8();
            jArr2[i] = iZn == 1 ? dVar.d0() : dVar.p();
            if (dVar.mg() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            dVar.ut(2);
        }
        return Pair.create(jArr, jArr2);
    }

    @Nullable
    public static Metadata t(d dVar, int i) {
        dVar.ut(8);
        ArrayList arrayList = new ArrayList();
        while (dVar.a() < i) {
            Metadata.Entry entryZn = s.zn(dVar);
            if (entryZn != null) {
                arrayList.add(entryZn);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static Pair<Long, String> tl(d dVar) {
        dVar.oz(8);
        int iZn = tn.y.zn(dVar.p());
        dVar.ut(iZn == 0 ? 8 : 16);
        long jA8 = dVar.a8();
        dVar.ut(iZn == 0 ? 4 : 8);
        int iYt = dVar.yt();
        return Pair.create(Long.valueOf(jA8), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING + ((char) (((iYt >> 10) & 31) + 96)) + ((char) (((iYt >> 5) & 31) + 96)) + ((char) ((iYt & 31) + 96)));
    }

    public static void v(d dVar) {
        int iA = dVar.a();
        dVar.ut(4);
        if (dVar.p() != 1751411826) {
            iA += 4;
        }
        dVar.oz(iA);
    }

    public static long w(d dVar) {
        dVar.oz(8);
        dVar.ut(tn.y.zn(dVar.p()) != 0 ? 16 : 8);
        return dVar.a8();
    }

    @Nullable
    public static Metadata wz(y.C0180y c0180y) {
        y.n3 n3VarFb = c0180y.fb(1751411826);
        y.n3 n3VarFb2 = c0180y.fb(1801812339);
        y.n3 n3VarFb3 = c0180y.fb(1768715124);
        if (n3VarFb == null || n3VarFb2 == null || n3VarFb3 == null || f(n3VarFb.n3) != 1835299937) {
            return null;
        }
        d dVar = n3VarFb2.n3;
        dVar.oz(12);
        int iP = dVar.p();
        String[] strArr = new String[iP];
        for (int i = 0; i < iP; i++) {
            int iP2 = dVar.p();
            dVar.ut(4);
            strArr[i] = dVar.ta(iP2 - 8);
        }
        d dVar2 = n3VarFb3.n3;
        dVar2.oz(8);
        ArrayList arrayList = new ArrayList();
        while (dVar2.y() > 8) {
            int iA = dVar2.a();
            int iP3 = dVar2.p();
            int iP4 = dVar2.p() - 1;
            if (iP4 < 0 || iP4 >= iP) {
                r.c5("AtomParsers", "Skipped metadata with unknown key index: " + iP4);
            } else {
                MdtaMetadataEntry mdtaMetadataEntryA = s.a(dVar2, iA + iP3, strArr[iP4]);
                if (mdtaMetadataEntryA != null) {
                    arrayList.add(mdtaMetadataEntryA);
                }
            }
            dVar2.oz(iA + iP3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0428 A[EDGE_INSN: B:212:0x0428->B:171:0x0428 BREAK  A[LOOP:2: B:154:0x03c7->B:170:0x0421], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static tn.mt x4(tn.xc r38, tn.y.C0180y r39, b1.f3 r40) throws ft.q {
        /*
            Method dump skipped, instruction units count: 1310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tn.n3.x4(tn.xc, tn.y$y, b1.f3):tn.mt");
    }

    public static void xc(d dVar, int i, int i5, int i8, gv gvVar) {
        dVar.oz(i5 + 16);
        if (i == 1835365492) {
            dVar.fh();
            String strFh = dVar.fh();
            if (strFh != null) {
                gvVar.n3 = new g.n3().j(i8).o4(strFh).z6();
            }
        }
    }

    public static ByteBuffer y() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    @Nullable
    public static w z(d dVar, int i, int i5, String str) {
        int i8;
        int i10;
        int i11 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i11 - i >= i5) {
                return null;
            }
            dVar.oz(i11);
            int iP = dVar.p();
            if (dVar.p() == 1952804451) {
                int iZn = tn.y.zn(dVar.p());
                dVar.ut(1);
                if (iZn == 0) {
                    dVar.ut(1);
                    i10 = 0;
                    i8 = 0;
                } else {
                    int iEj = dVar.ej();
                    i8 = iEj & 15;
                    i10 = (iEj & 240) >> 4;
                }
                boolean z = dVar.ej() == 1;
                int iEj2 = dVar.ej();
                byte[] bArr2 = new byte[16];
                dVar.t(bArr2, 0, 16);
                if (z && iEj2 == 0) {
                    int iEj3 = dVar.ej();
                    bArr = new byte[iEj3];
                    dVar.t(bArr, 0, iEj3);
                }
                return new w(z, str, iEj2, bArr2, i10, i8, bArr);
            }
            i11 += iP;
        }
    }

    public static int zn(d dVar, int i, int i5, int i8) throws q {
        int iA = dVar.a();
        b1.xc.y(iA >= i5, null);
        while (iA - i5 < i8) {
            dVar.oz(iA);
            int iP = dVar.p();
            b1.xc.y(iP > 0, "childAtomSize must be positive");
            if (dVar.p() == i) {
                return iA;
            }
            iA += iP;
        }
        return -1;
    }
}
