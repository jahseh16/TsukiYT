package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Si, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0907Si extends KT {
    public static byte[] A02;
    public final /* synthetic */ C9Q A00;
    public final /* synthetic */ AnonymousClass93 A01;

    static {
        A02();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-126, -75, -90, -90, -91, -78, -87, -82, -89, 96, -87, -82, -92, -91, -90, -87, -82, -87, -76, -91, -84, -71};
    }

    public C0907Si(C9Q c9q, AnonymousClass93 anonymousClass93) {
        this.A00 = c9q;
        this.A01 = anonymousClass93;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        if (this.A00.A0B.getState() == RB.A02 && this.A00.A0B.getCurrentPositionInMillis() == A00()) {
            this.A00.A0G(A00(0, 22, 11));
        }
    }
}
