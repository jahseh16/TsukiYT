package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TF extends KT {
    public static byte[] A02;
    public final /* synthetic */ P3 A00;
    public final /* synthetic */ AnonymousClass93 A01;

    static {
        A02();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 46);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{93, 106, 121, 121, 122, 109, 118, 113, 120, 63, 118, 113, 123, 122, 121, 118, 113, 118, 107, 122, 115, 102};
    }

    public TF(P3 p3, AnonymousClass93 anonymousClass93) {
        this.A00 = p3;
        this.A01 = anonymousClass93;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        if (this.A00.A0D.getState() == RB.A02 && this.A00.A0D.getCurrentPositionInMillis() == A00()) {
            this.A00.A0I(A00(0, 22, 49));
        }
    }
}
