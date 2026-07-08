package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PS implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ A2 A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{116, 75, 70, 71, 77, 114, 78, 67, 91, 64, 67, 65, 73, 103, 80, 80, 77, 80};
    }

    public PS(A2 a22) {
        this.A00 = a22;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0F.ADX(A00(0, 18, 116));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
