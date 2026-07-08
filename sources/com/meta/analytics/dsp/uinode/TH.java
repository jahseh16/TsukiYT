package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TH extends KT {
    public static byte[] A01;
    public final /* synthetic */ P3 A00;

    static {
        A02();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{5, 58, 55, 54, 60, 115, 61, 54, 37, 54, 33, 115, 32, 39, 50, 33, 39, 54, 55, 115, 35, 63, 50, 42, 58, 61, 52};
    }

    public TH(P3 p3) {
        this.A00 = p3;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        if (!this.A00.A04) {
            this.A00.A0I(A00(0, 27, 122));
        }
    }
}
