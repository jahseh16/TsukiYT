package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0904Sf extends KT {
    public static byte[] A01;
    public final /* synthetic */ C9Q A00;

    static {
        A02();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{100, 91, 86, 87, 93, 18, 69, 83, 65, 18, 92, 87, 68, 87, 64, 18, 66, 64, 87, 66, 83, 64, 87, 86};
    }

    public C0904Sf(C9Q c9q) {
        this.A00 = c9q;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        if (!this.A00.A07) {
            this.A00.A0G(A00(0, 24, 76));
        }
    }
}
