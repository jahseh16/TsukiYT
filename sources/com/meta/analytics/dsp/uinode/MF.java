package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MF implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ ViewOnClickListenerC0492Bi A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 54);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{62, 56, 46, 57, 20, 41, 62, 45, 45, 46, 57, 46, 47, 20, 40, 39, 34, 40, 32, 20, 42, 45, 63, 46, 57, 20, 47, 46, 39, 42, 50};
    }

    public MF(ViewOnClickListenerC0492Bi viewOnClickListenerC0492Bi) {
        this.A00 = viewOnClickListenerC0492Bi;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0H(A00(0, 31, 125));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
