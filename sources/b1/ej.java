package b1;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import ft.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class ej {

    public static final class gv {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1265a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public final boolean f1266c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int f1267fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f1268gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public final byte[] f1269i9;
        public final int n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f1270s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f1271v;
        public final int y;
        public final int zn;

        public gv(int i, int i5, int i8, int i10, int i11, int i12, int i13, int i14, boolean z, byte[] bArr) {
            this.y = i;
            this.n3 = i5;
            this.zn = i8;
            this.f1268gv = i10;
            this.f1271v = i11;
            this.f1265a = i12;
            this.f1267fb = i13;
            this.f1270s = i14;
            this.f1266c5 = z;
            this.f1269i9 = bArr;
        }
    }

    public static final class n3 {
        public final String[] n3;
        public final String y;
        public final int zn;

        public n3(String str, String[] strArr, int i) {
            this.y = str;
            this.n3 = strArr;
            this.zn = i;
        }
    }

    public static final class y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f1272gv;
        public final int n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f1273v;
        public final int y;
        public final long[] zn;

        public y(int i, int i5, long[] jArr, int i8, boolean z) {
            this.y = i;
            this.n3 = i5;
            this.zn = jArr;
            this.f1272gv = i8;
            this.f1273v = z;
        }
    }

    public static final class zn {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f1274gv;
        public final int n3;
        public final boolean y;
        public final int zn;

        public zn(boolean z, int i, int i5, int i8) {
            this.y = z;
            this.n3 = i;
            this.zn = i5;
            this.f1274gv = i8;
        }
    }

    public static void a(int i, z6 z6Var) throws q {
        int iGv = z6Var.gv(6) + 1;
        for (int i5 = 0; i5 < iGv; i5++) {
            int iGv2 = z6Var.gv(16);
            if (iGv2 != 0) {
                v0.r.zn("VorbisUtil", "mapping type other than 0 not supported: " + iGv2);
            } else {
                int iGv3 = z6Var.zn() ? z6Var.gv(4) + 1 : 1;
                if (z6Var.zn()) {
                    int iGv4 = z6Var.gv(8) + 1;
                    for (int i8 = 0; i8 < iGv4; i8++) {
                        int i10 = i - 1;
                        z6Var.v(y(i10));
                        z6Var.v(y(i10));
                    }
                }
                if (z6Var.gv(2) != 0) {
                    throw q.y("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iGv3 > 1) {
                    for (int i11 = 0; i11 < i; i11++) {
                        z6Var.v(4);
                    }
                }
                for (int i12 = 0; i12 < iGv3; i12++) {
                    z6Var.v(8);
                    z6Var.v(8);
                    z6Var.v(8);
                }
            }
        }
    }

    public static n3 c5(v0.d dVar) throws q {
        return i9(dVar, true, true);
    }

    public static gv f(v0.d dVar) throws q {
        tl(1, dVar, false);
        int iN = dVar.n();
        int iEj = dVar.ej();
        int iN2 = dVar.n();
        int iR = dVar.r();
        if (iR <= 0) {
            iR = -1;
        }
        int iR2 = dVar.r();
        if (iR2 <= 0) {
            iR2 = -1;
        }
        int iR3 = dVar.r();
        if (iR3 <= 0) {
            iR3 = -1;
        }
        int iEj2 = dVar.ej();
        return new gv(iN, iEj, iN2, iR, iR2, iR3, (int) Math.pow(2.0d, iEj2 & 15), (int) Math.pow(2.0d, (iEj2 & 240) >> 4), (dVar.ej() & 1) > 0, Arrays.copyOf(dVar.v(), dVar.fb()));
    }

    public static zn[] fb(z6 z6Var) {
        int iGv = z6Var.gv(6) + 1;
        zn[] znVarArr = new zn[iGv];
        for (int i = 0; i < iGv; i++) {
            znVarArr[i] = new zn(z6Var.zn(), z6Var.gv(16), z6Var.gv(16), z6Var.gv(8));
        }
        return znVarArr;
    }

    public static y gv(z6 z6Var) throws q {
        if (z6Var.gv(24) != 5653314) {
            throw q.y("expected code book to start with [0x56, 0x43, 0x42] at " + z6Var.n3(), null);
        }
        int iGv = z6Var.gv(16);
        int iGv2 = z6Var.gv(24);
        long[] jArr = new long[iGv2];
        boolean zZn = z6Var.zn();
        long jN3 = 0;
        if (zZn) {
            int iGv3 = z6Var.gv(5) + 1;
            int i = 0;
            while (i < iGv2) {
                int iGv4 = z6Var.gv(y(iGv2 - i));
                for (int i5 = 0; i5 < iGv4 && i < iGv2; i5++) {
                    jArr[i] = iGv3;
                    i++;
                }
                iGv3++;
            }
        } else {
            boolean zZn2 = z6Var.zn();
            for (int i8 = 0; i8 < iGv2; i8++) {
                if (!zZn2) {
                    jArr[i8] = z6Var.gv(5) + 1;
                } else if (z6Var.zn()) {
                    jArr[i8] = z6Var.gv(5) + 1;
                } else {
                    jArr[i8] = 0;
                }
            }
        }
        int iGv5 = z6Var.gv(4);
        if (iGv5 > 2) {
            throw q.y("lookup type greater than 2 not decodable: " + iGv5, null);
        }
        if (iGv5 == 1 || iGv5 == 2) {
            z6Var.v(32);
            z6Var.v(32);
            int iGv6 = z6Var.gv(4) + 1;
            z6Var.v(1);
            if (iGv5 != 1) {
                jN3 = ((long) iGv2) * ((long) iGv);
            } else if (iGv != 0) {
                jN3 = n3(iGv2, iGv);
            }
            z6Var.v((int) (jN3 * ((long) iGv6)));
        }
        return new y(iGv, iGv2, jArr, iGv5, zZn);
    }

    public static n3 i9(v0.d dVar, boolean z, boolean z5) throws q {
        if (z) {
            tl(3, dVar, false);
        }
        String strTa = dVar.ta((int) dVar.f3());
        int length = strTa.length();
        long jF3 = dVar.f3();
        String[] strArr = new String[(int) jF3];
        int length2 = length + 15;
        for (int i = 0; i < jF3; i++) {
            String strTa2 = dVar.ta((int) dVar.f3());
            strArr[i] = strTa2;
            length2 = length2 + 4 + strTa2.length();
        }
        if (z5 && (dVar.ej() & 1) == 0) {
            throw q.y("framing bit expected to be set", null);
        }
        return new n3(strTa, strArr, length2 + 1);
    }

    public static long n3(long j, long j4) {
        return (long) Math.floor(Math.pow(j, 1.0d / j4));
    }

    public static void s(z6 z6Var) throws q {
        int iGv = z6Var.gv(6) + 1;
        for (int i = 0; i < iGv; i++) {
            if (z6Var.gv(16) > 2) {
                throw q.y("residueType greater than 2 is not decodable", null);
            }
            z6Var.v(24);
            z6Var.v(24);
            z6Var.v(24);
            int iGv2 = z6Var.gv(6) + 1;
            z6Var.v(8);
            int[] iArr = new int[iGv2];
            for (int i5 = 0; i5 < iGv2; i5++) {
                iArr[i5] = ((z6Var.zn() ? z6Var.gv(5) : 0) * 8) + z6Var.gv(3);
            }
            for (int i8 = 0; i8 < iGv2; i8++) {
                for (int i10 = 0; i10 < 8; i10++) {
                    if ((iArr[i8] & (1 << i10)) != 0) {
                        z6Var.v(8);
                    }
                }
            }
        }
    }

    public static zn[] t(v0.d dVar, int i) throws q {
        tl(5, dVar, false);
        int iEj = dVar.ej() + 1;
        z6 z6Var = new z6(dVar.v());
        z6Var.v(dVar.a() * 8);
        for (int i5 = 0; i5 < iEj; i5++) {
            gv(z6Var);
        }
        int iGv = z6Var.gv(6) + 1;
        for (int i8 = 0; i8 < iGv; i8++) {
            if (z6Var.gv(16) != 0) {
                throw q.y("placeholder of time domain transforms not zeroed out", null);
            }
        }
        v(z6Var);
        s(z6Var);
        a(i, z6Var);
        zn[] znVarArrFb = fb(z6Var);
        if (z6Var.zn()) {
            return znVarArrFb;
        }
        throw q.y("framing bit after modes not set as expected", null);
    }

    public static boolean tl(int i, v0.d dVar, boolean z) throws q {
        if (dVar.y() < 7) {
            if (z) {
                return false;
            }
            throw q.y("too short header: " + dVar.y(), null);
        }
        if (dVar.ej() != i) {
            if (z) {
                return false;
            }
            throw q.y("expected header type " + Integer.toHexString(i), null);
        }
        if (dVar.ej() == 118 && dVar.ej() == 111 && dVar.ej() == 114 && dVar.ej() == 98 && dVar.ej() == 105 && dVar.ej() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw q.y("expected characters 'vorbis'", null);
    }

    public static void v(z6 z6Var) throws q {
        int iGv = z6Var.gv(6) + 1;
        for (int i = 0; i < iGv; i++) {
            int iGv2 = z6Var.gv(16);
            if (iGv2 == 0) {
                z6Var.v(8);
                z6Var.v(16);
                z6Var.v(16);
                z6Var.v(6);
                z6Var.v(8);
                int iGv3 = z6Var.gv(4) + 1;
                for (int i5 = 0; i5 < iGv3; i5++) {
                    z6Var.v(8);
                }
            } else {
                if (iGv2 != 1) {
                    throw q.y("floor type greater than 1 not decodable: " + iGv2, null);
                }
                int iGv4 = z6Var.gv(5);
                int[] iArr = new int[iGv4];
                int i8 = -1;
                for (int i10 = 0; i10 < iGv4; i10++) {
                    int iGv5 = z6Var.gv(4);
                    iArr[i10] = iGv5;
                    if (iGv5 > i8) {
                        i8 = iGv5;
                    }
                }
                int i11 = i8 + 1;
                int[] iArr2 = new int[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    iArr2[i12] = z6Var.gv(3) + 1;
                    int iGv6 = z6Var.gv(2);
                    if (iGv6 > 0) {
                        z6Var.v(8);
                    }
                    for (int i13 = 0; i13 < (1 << iGv6); i13++) {
                        z6Var.v(8);
                    }
                }
                z6Var.v(2);
                int iGv7 = z6Var.gv(4);
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < iGv4; i16++) {
                    i14 += iArr2[iArr[i16]];
                    while (i15 < i14) {
                        z6Var.v(iGv7);
                        i15++;
                    }
                }
            }
        }
    }

    public static int y(int i) {
        int i5 = 0;
        while (i > 0) {
            i5++;
            i >>>= 1;
        }
        return i5;
    }

    @Nullable
    public static Metadata zn(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] strArrIx = ut.ix(str, "=");
            if (strArrIx.length != 2) {
                v0.r.c5("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrIx[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.y(new v0.d(Base64.decode(strArrIx[1], 0))));
                } catch (RuntimeException e4) {
                    v0.r.i9("VorbisUtil", "Failed to parse vorbis picture", e4);
                }
            } else {
                arrayList.add(new VorbisComment(strArrIx[0], strArrIx[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}
