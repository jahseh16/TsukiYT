package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1174bC extends KT {
    public static byte[] A01;
    public final /* synthetic */ C1173bB A00;

    static {
        A02();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-20, -29, -8, -29, -11, -27, -12, -21, -14, -10, -68};
    }

    public C1174bC(C1173bB c1173bB) {
        this.A00 = c1173bB;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        this.A00.A02.A0E().AH4();
        this.A00.A04.loadUrl(A00(0, 11, 35) + this.A00.A00.A03());
    }
}
