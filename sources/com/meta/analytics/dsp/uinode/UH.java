package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UH implements L8 {
    public static byte[] A01;
    public final /* synthetic */ UD A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{108, 120, 121, 98, 110, 97, 100, 110, 102};
    }

    public UH(UD ud2) {
        this.A00 = ud2;
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() {
        if (!this.A00.A0A && !this.A00.A09) {
            this.A00.A0U(false, A00(0, 9, 108));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f3) {
    }
}
