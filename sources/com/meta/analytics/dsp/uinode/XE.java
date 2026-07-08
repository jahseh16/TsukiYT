package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XE extends AbstractC0521Co {
    public static byte[] A01;
    public static String[] A02 = {"sf1snlIsJ6W0T2FnClxHrZdECoWprGfm", "N", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "r2HEyqcTBk5ynLpIwHNeKGT5pvsr0hUz", "VJBF4MChRorpvGWaO0TH3IkbIinT6ci", "gVX", "V2gxFGplaBAwDTpDKBzIrO8nmlXbG3Ru", "XRqJkaMKHgiwUJro7qWKl9bCL3sckU6K"};
    public static final int A03;
    public static final byte[] A04;
    public boolean A00;

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{42, 21, 16, 22, 79, 91, 74, 71, 65, 1, 65, 94, 91, 93};
    }

    static {
        A02();
        A03 = IF.A08(A01(0, 4, 111));
        A04 = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
    }

    private long A00(byte[] bArr) {
        int i;
        int i5;
        int frames = bArr[0] & 255;
        int toc = frames & 3;
        switch (toc) {
            case 0:
                i = 1;
                break;
            case 1:
            case 2:
                i = 2;
                break;
            default:
                int toc2 = bArr[1];
                i = toc2 & 63;
                break;
        }
        int frames2 = frames >> 3;
        int i8 = frames2 & 3;
        if (frames2 >= 16) {
            if (A02[5].length() != 3) {
                throw new RuntimeException();
            }
            A02[5] = "Fg3";
            i5 = 2500 << i8;
        } else if (frames2 >= 12) {
            int toc3 = i8 & 1;
            i5 = 10000 << toc3;
        } else {
            if (A02[2].length() == 12) {
                throw new RuntimeException();
            }
            A02[2] = "pnsJXiCpejNcXc3iNsNdzofu9hZ";
            if (i8 == 3) {
                i5 = 60000;
            } else {
                i5 = 10000 << i8;
            }
        }
        return ((long) i) * ((long) i5);
    }

    private void A03(List<byte[]> initializationData, int i) {
        initializationData.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }

    public static boolean A04(C0645Hz c0645Hz) {
        int iA04 = c0645Hz.A04();
        byte[] bArr = A04;
        if (iA04 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        c0645Hz.A0c(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0521Co
    public final long A07(C0645Hz c0645Hz) {
        return A04(A00(c0645Hz.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0521Co
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A00 = false;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0521Co
    public final boolean A0A(C0645Hz c0645Hz, long j, C0520Cn c0520Cn) throws InterruptedException, IOException {
        if (!this.A00) {
            byte[] bArrCopyOf = Arrays.copyOf(c0645Hz.A00, c0645Hz.A07());
            int i = bArrCopyOf[9] & 255;
            int i5 = ((bArrCopyOf[11] & 255) << 8) | (bArrCopyOf[10] & 255);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(bArrCopyOf);
            A03(arrayList, i5);
            A03(arrayList, 3840);
            c0520Cn.A00 = Format.A07(null, A01(4, 10, 36), null, -1, -1, i, 48000, arrayList, null, 0, null);
            this.A00 = true;
            return true;
        }
        boolean z = c0645Hz.A08() == A03;
        c0645Hz.A0Y(0);
        return z;
    }
}
