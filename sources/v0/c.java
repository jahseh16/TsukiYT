package v0;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final byte[] y = {0, 0, 0, 1};
    public static final float[] n3 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object zn = new Object();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static int[] f8716gv = new int[10];

    public static final class n3 {
        public final int n3;
        public final int y;
        public final boolean zn;

        public n3(int i, int i5, boolean z) {
            this.y = i;
            this.n3 = i5;
            this.zn = z;
        }
    }

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8717a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public final int f8718c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f8719f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int f8720fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f8721gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public final float f8722i9;
        public final boolean n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f8723s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f8724t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public final int f8725tl;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int[] f8726v;
        public final int y;
        public final int zn;

        public y(int i, boolean z, int i5, int i8, int[] iArr, int i10, int i11, int i12, int i13, float f3, int i14, int i15, int i16) {
            this.y = i;
            this.n3 = z;
            this.zn = i5;
            this.f8721gv = i8;
            this.f8726v = iArr;
            this.f8717a = i10;
            this.f8720fb = i11;
            this.f8723s = i12;
            this.f8718c5 = i13;
            this.f8722i9 = f3;
            this.f8719f = i14;
            this.f8724t = i15;
            this.f8725tl = i16;
        }
    }

    public static final class zn {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8727a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public final boolean f8728c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f8729f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int f8730fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f8731gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public final boolean f8732i9;
        public final int n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final float f8733s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f8734t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public final int f8735tl;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f8736v;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public final boolean f8737wz;
        public final int y;
        public final int zn;

        public zn(int i, int i5, int i8, int i10, int i11, int i12, int i13, float f3, boolean z, boolean z5, int i14, int i15, int i16, boolean z7) {
            this.y = i;
            this.n3 = i5;
            this.zn = i8;
            this.f8731gv = i10;
            this.f8736v = i11;
            this.f8727a = i12;
            this.f8730fb = i13;
            this.f8733s = f3;
            this.f8728c5 = z;
            this.f8732i9 = z5;
            this.f8729f = i14;
            this.f8734t = i15;
            this.f8735tl = i16;
            this.f8737wz = z7;
        }
    }

    public static int a(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static v0.c.y c5(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.c.c5(byte[], int, int):v0.c$y");
    }

    public static n3 f(byte[] bArr, int i, int i5) {
        z6 z6Var = new z6(bArr, i, i5);
        int iS = z6Var.s();
        int iS2 = z6Var.s();
        z6Var.f();
        return new n3(iS, iS2, z6Var.gv());
    }

    public static boolean fb(@Nullable String str, byte b4) {
        if ("video/avc".equals(str) && (b4 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b4 & 126) >> 1) == 39;
    }

    public static int gv(byte[] bArr, int i, int i5) {
        while (i < i5 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i5;
    }

    public static n3 i9(byte[] bArr, int i, int i5) {
        return f(bArr, i + 1, i5);
    }

    public static void n3(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i = 0;
        int i5 = 0;
        while (true) {
            int i8 = i + 1;
            if (i8 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i10 = byteBuffer.get(i) & 255;
            if (i5 == 3) {
                if (i10 == 1 && (byteBuffer.get(i8) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i10 == 0) {
                i5++;
            }
            if (i10 != 0) {
                i5 = 0;
            }
            i = i8;
        }
    }

    public static int p(byte[] bArr, int i) {
        int i5;
        synchronized (zn) {
            int iGv = 0;
            int i8 = 0;
            while (iGv < i) {
                try {
                    iGv = gv(bArr, iGv, i);
                    if (iGv < i) {
                        int[] iArr = f8716gv;
                        if (iArr.length <= i8) {
                            f8716gv = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f8716gv[i8] = iGv;
                        iGv += 3;
                        i8++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i5 = i - i8;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                int i13 = f8716gv[i12] - i11;
                System.arraycopy(bArr, i11, bArr, i10, i13);
                int i14 = i10 + i13;
                int i15 = i14 + 1;
                bArr[i14] = 0;
                i10 = i14 + 2;
                bArr[i15] = 0;
                i11 += i13 + 3;
            }
            System.arraycopy(bArr, i11, bArr, i10, i5 - i10);
        }
        return i5;
    }

    public static y s(byte[] bArr, int i, int i5) {
        return c5(bArr, i + 2, i5);
    }

    public static zn t(byte[] bArr, int i, int i5) {
        return tl(bArr, i + 1, i5);
    }

    public static zn tl(byte[] bArr, int i, int i5) {
        int iS;
        boolean zGv;
        int i8;
        boolean z;
        boolean z5;
        int iS2;
        float f3;
        int i10;
        z6 z6Var = new z6(bArr, i, i5);
        int iV = z6Var.v(8);
        int iV2 = z6Var.v(8);
        int iV3 = z6Var.v(8);
        int iS3 = z6Var.s();
        if (iV == 100 || iV == 110 || iV == 122 || iV == 244 || iV == 44 || iV == 83 || iV == 86 || iV == 118 || iV == 128 || iV == 138) {
            iS = z6Var.s();
            zGv = iS == 3 ? z6Var.gv() : false;
            z6Var.s();
            z6Var.s();
            z6Var.f();
            if (z6Var.gv()) {
                int i11 = iS != 3 ? 8 : 12;
                int i12 = 0;
                while (i12 < i11) {
                    if (z6Var.gv()) {
                        xc(z6Var, i12 < 6 ? 16 : 64);
                    }
                    i12++;
                }
            }
        } else {
            iS = 1;
            zGv = false;
        }
        int iS4 = z6Var.s() + 4;
        int iS5 = z6Var.s();
        if (iS5 == 0) {
            i8 = iS;
            z = zGv;
            iS2 = z6Var.s() + 4;
            z5 = false;
        } else {
            if (iS5 == 1) {
                boolean zGv2 = z6Var.gv();
                z6Var.fb();
                z6Var.fb();
                z = zGv;
                long jS = z6Var.s();
                i8 = iS;
                for (int i13 = 0; i13 < jS; i13++) {
                    z6Var.s();
                }
                z5 = zGv2;
            } else {
                i8 = iS;
                z = zGv;
                z5 = false;
            }
            iS2 = 0;
        }
        int iS6 = z6Var.s();
        z6Var.f();
        int iS7 = z6Var.s() + 1;
        int iS8 = z6Var.s() + 1;
        boolean zGv3 = z6Var.gv();
        int i14 = (2 - (zGv3 ? 1 : 0)) * iS8;
        if (!zGv3) {
            z6Var.f();
        }
        z6Var.f();
        int i15 = iS7 * 16;
        int i16 = i14 * 16;
        if (z6Var.gv()) {
            int iS9 = z6Var.s();
            int iS10 = z6Var.s();
            int iS11 = z6Var.s();
            int iS12 = z6Var.s();
            if (i8 == 0) {
                i10 = 2 - (zGv3 ? 1 : 0);
            } else {
                int i17 = i8;
                i = i17 == 3 ? 1 : 2;
                i10 = (2 - (zGv3 ? 1 : 0)) * (i17 == 1 ? 2 : 1);
            }
            i15 -= (iS9 + iS10) * i;
            i16 -= (iS11 + iS12) * i10;
        }
        int i18 = i15;
        int i19 = i16;
        float f4 = 1.0f;
        if (z6Var.gv() && z6Var.gv()) {
            int iV4 = z6Var.v(8);
            if (iV4 == 255) {
                int iV5 = z6Var.v(16);
                int iV6 = z6Var.v(16);
                if (iV5 != 0 && iV6 != 0) {
                    f4 = iV5 / iV6;
                }
                f3 = f4;
            } else {
                float[] fArr = n3;
                if (iV4 < fArr.length) {
                    f3 = fArr[iV4];
                } else {
                    r.c5("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iV4);
                    f3 = 1.0f;
                }
            }
        } else {
            f3 = 1.0f;
        }
        return new zn(iV, iV2, iV3, iS3, iS6, i18, i19, f3, z, zGv3, iS4, iS5, iS2, z5);
    }

    public static int v(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static void w(z6 z6Var) {
        int iS = z6Var.s();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i = -1;
        int i5 = -1;
        for (int i8 = 0; i8 < iS; i8++) {
            if (i8 == 0 || !z6Var.gv()) {
                int iS2 = z6Var.s();
                int iS3 = z6Var.s();
                int[] iArr2 = new int[iS2];
                for (int i10 = 0; i10 < iS2; i10++) {
                    iArr2[i10] = z6Var.s() + 1;
                    z6Var.f();
                }
                int[] iArr3 = new int[iS3];
                for (int i11 = 0; i11 < iS3; i11++) {
                    iArr3[i11] = z6Var.s() + 1;
                    z6Var.f();
                }
                i = iS2;
                iArr = iArr2;
                i5 = iS3;
                iArrCopyOf = iArr3;
            } else {
                int i12 = i + i5;
                int iS4 = (1 - ((z6Var.gv() ? 1 : 0) * 2)) * (z6Var.s() + 1);
                int i13 = i12 + 1;
                boolean[] zArr = new boolean[i13];
                for (int i14 = 0; i14 <= i12; i14++) {
                    if (z6Var.gv()) {
                        zArr[i14] = true;
                    } else {
                        zArr[i14] = z6Var.gv();
                    }
                }
                int[] iArr4 = new int[i13];
                int[] iArr5 = new int[i13];
                int i15 = 0;
                for (int i16 = i5 - 1; i16 >= 0; i16--) {
                    int i17 = iArrCopyOf[i16] + iS4;
                    if (i17 < 0 && zArr[i + i16]) {
                        iArr4[i15] = i17;
                        i15++;
                    }
                }
                if (iS4 < 0 && zArr[i12]) {
                    iArr4[i15] = iS4;
                    i15++;
                }
                for (int i18 = 0; i18 < i; i18++) {
                    int i19 = iArr[i18] + iS4;
                    if (i19 < 0 && zArr[i18]) {
                        iArr4[i15] = i19;
                        i15++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i15);
                int i20 = 0;
                for (int i21 = i - 1; i21 >= 0; i21--) {
                    int i22 = iArr[i21] + iS4;
                    if (i22 > 0 && zArr[i21]) {
                        iArr5[i20] = i22;
                        i20++;
                    }
                }
                if (iS4 > 0 && zArr[i12]) {
                    iArr5[i20] = iS4;
                    i20++;
                }
                for (int i23 = 0; i23 < i5; i23++) {
                    int i24 = iArrCopyOf[i23] + iS4;
                    if (i24 > 0 && zArr[i + i23]) {
                        iArr5[i20] = i24;
                        i20++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i20);
                iArr = iArrCopyOf2;
                i = i15;
                i5 = i20;
            }
        }
    }

    public static void wz(z6 z6Var) {
        for (int i = 0; i < 4; i++) {
            int i5 = 0;
            while (i5 < 6) {
                int i8 = 1;
                if (z6Var.gv()) {
                    int iMin = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        z6Var.fb();
                    }
                    for (int i10 = 0; i10 < iMin; i10++) {
                        z6Var.fb();
                    }
                } else {
                    z6Var.s();
                }
                if (i == 3) {
                    i8 = 3;
                }
                i5 += i8;
            }
        }
    }

    public static void xc(z6 z6Var, int i) {
        int iFb = 8;
        int i5 = 8;
        for (int i8 = 0; i8 < i; i8++) {
            if (iFb != 0) {
                iFb = ((z6Var.fb() + i5) + NotificationCompat.FLAG_LOCAL_ONLY) % NotificationCompat.FLAG_LOCAL_ONLY;
            }
            if (iFb != 0) {
                i5 = iFb;
            }
        }
    }

    public static void y(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int zn(byte[] bArr, int i, int i5, boolean[] zArr) {
        int i8 = i5 - i;
        v0.y.fb(i8 >= 0);
        if (i8 == 0) {
            return i5;
        }
        if (zArr[0]) {
            y(zArr);
            return i - 3;
        }
        if (i8 > 1 && zArr[1] && bArr[i] == 1) {
            y(zArr);
            return i - 2;
        }
        if (i8 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            y(zArr);
            return i - 1;
        }
        int i10 = i5 - 1;
        int i11 = i + 2;
        while (i11 < i10) {
            byte b4 = bArr[i11];
            if ((b4 & 254) == 0) {
                int i12 = i11 - 2;
                if (bArr[i12] == 0 && bArr[i11 - 1] == 0 && b4 == 1) {
                    y(zArr);
                    return i12;
                }
                i11 -= 2;
            }
            i11 += 3;
        }
        zArr[0] = i8 <= 2 ? !(i8 != 2 ? !(zArr[1] && bArr[i10] == 1) : !(zArr[2] && bArr[i5 + (-2)] == 0 && bArr[i10] == 1)) : bArr[i5 + (-3)] == 0 && bArr[i5 + (-2)] == 0 && bArr[i10] == 1;
        zArr[1] = i8 <= 1 ? zArr[2] && bArr[i10] == 0 : bArr[i5 + (-2)] == 0 && bArr[i10] == 0;
        zArr[2] = bArr[i10] == 0;
        return i5;
    }
}
