package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class BT extends AbstractC0808On {
    public static byte[] A01;
    public final /* synthetic */ UA A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{72, 87, 90, 91, 81, 119, 80, 74, 91, 76, 77, 74, 87, 74, 95, 82, 123, 72, 91, 80, 74};
    }

    public BT(UA ua2) {
        this.A00 = ua2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(AnonymousClass98 anonymousClass98) {
        this.A00.A06.A44(A00(0, 21, 1), anonymousClass98);
    }
}
