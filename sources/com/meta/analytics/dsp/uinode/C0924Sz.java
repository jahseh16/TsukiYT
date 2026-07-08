package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0924Sz extends KT {
    public static byte[] A02;
    public final /* synthetic */ C0922Sx A00;
    public final /* synthetic */ AnonymousClass93 A01;

    static {
        A02();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{127, -78, -93, -93, -94, -81, -90, -85, -92, 93, -90, -85, -95, -94, -93, -90, -85, -90, -79, -94, -87, -74};
    }

    public C0924Sz(C0922Sx c0922Sx, AnonymousClass93 anonymousClass93) {
        this.A00 = c0922Sx;
        this.A01 = anonymousClass93;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        if (this.A00.A0Z.getState() == RB.A02 && this.A00.A0Z.getCurrentPositionInMillis() == A00()) {
            this.A00.A0X.ADX(A00(0, 22, 43));
        }
    }
}
