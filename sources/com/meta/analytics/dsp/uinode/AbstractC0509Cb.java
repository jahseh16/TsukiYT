package com.meta.analytics.dsp.uinode;

import android.util.Log;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0509Cb {
    public static byte[] A00;
    public static String[] A01 = {"vniJFRP", "oJtPNZwcQG6hLH64wW6tXvk3sbQ9WwGW", "zry57w6QfhfaFpFxdZgKHC1xYn", "fo4QeY", "i9CLNlynjhorIFu8zs9NEh7lWGRKe1E6", "M5SbcVIJ6zX6bTvbAFwxovtl6mtBjy6T", "O1VKgn8XNf4GQEXWcT9RCCs6YBao3Pp0", "jcDd8FEzgCzhSc3FOh8Nko0kxmmUpCTh"};

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-28, 7, 7, -4, -43, 8, 3, 1, -23, 8, -3, 0, -85, -60, -55, -53, -58, -58, -59, -56, -54, -69, -70, 118, -58, -55, -55, -66, 118, -52, -69, -56, -55, -65, -59, -60, -112, 118};
    }

    static {
        A03();
    }

    public static C0508Ca A00(byte[] bArr) {
        C0645Hz c0645Hz = new C0645Hz(bArr);
        if (c0645Hz.A07() < 32) {
            return null;
        }
        c0645Hz.A0Y(0);
        if (c0645Hz.A08() != c0645Hz.A04() + 4 || c0645Hz.A08() != CJ.A0s) {
            return null;
        }
        int dataSize = CJ.A01(c0645Hz.A08());
        if (dataSize > 1) {
            Log.w(A01(0, 12, 98), A01(12, 26, 36) + dataSize);
            return null;
        }
        UUID uuid = new UUID(c0645Hz.A0L(), c0645Hz.A0L());
        if (dataSize == 1) {
            int atomType = c0645Hz.A0H() * 16;
            if (A01[0].length() == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "thpi9L";
            strArr[2] = "TMAT5NZ1bWTkNSNpNaLonMSfAF";
            c0645Hz.A0Z(atomType);
        }
        int atomSize = c0645Hz.A0H();
        if (atomSize != c0645Hz.A04()) {
            return null;
        }
        byte[] bArr2 = new byte[atomSize];
        c0645Hz.A0c(bArr2, 0, atomSize);
        return new C0508Ca(uuid, dataSize, bArr2);
    }

    public static UUID A02(byte[] bArr) {
        C0508Ca parsedAtom = A00(bArr);
        if (parsedAtom != null) {
            return parsedAtom.A01;
        }
        return null;
    }
}
