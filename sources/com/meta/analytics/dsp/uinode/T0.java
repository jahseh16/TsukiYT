package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class T0 extends KT {
    public static byte[] A01;
    public final /* synthetic */ C0922Sx A00;

    static {
        A02();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{35, 54, 49, 50, 60, -19, 68, 46, 64, -19, 59, 50, 67, 50, 63, -19, 61, 63, 50, 61, 46, 63, 50, 49};
    }

    public T0(C0922Sx c0922Sx) {
        this.A00 = c0922Sx;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        if (!this.A00.A0S) {
            this.A00.A0X.ADX(A00(0, 24, 79));
        }
    }
}
