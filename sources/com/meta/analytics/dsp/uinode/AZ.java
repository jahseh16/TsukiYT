package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class AZ extends AbstractC0808On {
    public static byte[] A01;
    public final /* synthetic */ P3 A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{28, 13, 25, 31, 9};
    }

    public AZ(P3 p3) {
        this.A00 = p3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(AnonymousClass98 anonymousClass98) {
        this.A00.A0B.ADY(A00(0, 5, 49), this.A00.A03());
    }
}
