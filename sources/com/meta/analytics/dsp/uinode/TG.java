package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TG extends KT {
    public static byte[] A01;
    public final /* synthetic */ P3 A00;

    static {
        A02();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-78, -59, -64, -63, -53, 124, -45, -67, -49, 124, -54, -63, -46, -63, -50, 124, -52, -50, -63, -52, -67, -50, -63, -64};
    }

    public TG(P3 p3) {
        this.A00 = p3;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        if (!this.A00.A03) {
            this.A00.A0I(A00(0, 24, 12));
        }
    }
}
