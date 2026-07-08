package mn;

import com.google.android.gms.common.ConnectionResult;
import ft.q;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final int[] y = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] n3 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static final class n3 {
        public final int n3;
        public final int y;
        public final String zn;

        public n3(int i, int i5, String str) {
            this.y = i;
            this.n3 = i5;
            this.zn = str;
        }
    }

    public static n3 a(byte[] bArr) throws q {
        return v(new v0.ta(bArr), false);
    }

    public static void fb(v0.ta taVar, int i, int i5) {
        if (taVar.fb()) {
            v0.r.c5("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (taVar.fb()) {
            taVar.mt(14);
        }
        boolean zFb = taVar.fb();
        if (i5 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 6 || i == 20) {
            taVar.mt(3);
        }
        if (zFb) {
            if (i == 22) {
                taVar.mt(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                taVar.mt(3);
            }
            taVar.mt(1);
        }
    }

    public static int gv(v0.ta taVar) throws q {
        int iS = taVar.s(4);
        if (iS == 15) {
            if (taVar.n3() >= 24) {
                return taVar.s(24);
            }
            throw q.y("AAC header insufficient data", null);
        }
        if (iS < 13) {
            return y[iS];
        }
        throw q.y("AAC header wrong Sampling Frequency Index", null);
    }

    public static byte[] n3(int i, int i5, int i8) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i5 >> 1) & 7)), (byte) (((i5 << 7) & 128) | ((i8 << 3) & 120))};
    }

    public static n3 v(v0.ta taVar, boolean z) throws q {
        int iZn = zn(taVar);
        int iGv = gv(taVar);
        int iS = taVar.s(4);
        String str = "mp4a.40." + iZn;
        if (iZn == 5 || iZn == 29) {
            iGv = gv(taVar);
            iZn = zn(taVar);
            if (iZn == 22) {
                iS = taVar.s(4);
            }
        }
        if (z) {
            if (iZn != 1 && iZn != 2 && iZn != 3 && iZn != 4 && iZn != 6 && iZn != 7 && iZn != 17) {
                switch (iZn) {
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    case ConnectionResult.RESTRICTED_PROFILE /* 20 */:
                    case 21:
                    case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND /* 22 */:
                    case ConnectionResult.API_DISABLED /* 23 */:
                        break;
                    default:
                        throw q.f("Unsupported audio object type: " + iZn);
                }
            }
            fb(taVar, iZn, iS);
            switch (iZn) {
                case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                case ConnectionResult.RESTRICTED_PROFILE /* 20 */:
                case 21:
                case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND /* 22 */:
                case ConnectionResult.API_DISABLED /* 23 */:
                    int iS2 = taVar.s(2);
                    if (iS2 == 2 || iS2 == 3) {
                        throw q.f("Unsupported epConfig: " + iS2);
                    }
                    break;
            }
        }
        int i = n3[iS];
        if (i != -1) {
            return new n3(iGv, i, str);
        }
        throw q.y(null, null);
    }

    public static byte[] y(int i, int i5) {
        int i8 = 0;
        int i10 = 0;
        int i11 = -1;
        while (true) {
            int[] iArr = y;
            if (i10 >= iArr.length) {
                break;
            }
            if (i == iArr[i10]) {
                i11 = i10;
            }
            i10++;
        }
        int i12 = -1;
        while (true) {
            int[] iArr2 = n3;
            if (i8 >= iArr2.length) {
                break;
            }
            if (i5 == iArr2[i8]) {
                i12 = i8;
            }
            i8++;
        }
        if (i != -1 && i12 != -1) {
            return n3(2, i11, i12);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i + ", " + i5);
    }

    public static int zn(v0.ta taVar) {
        int iS = taVar.s(5);
        return iS == 31 ? taVar.s(6) + 32 : iS;
    }
}
