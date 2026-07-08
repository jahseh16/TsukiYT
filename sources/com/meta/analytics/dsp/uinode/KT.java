package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class KT implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<KJ> A04;
    public final KH A00;

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{124, 91, 64, 64, 79, 76, 66, 75, 14, 77, 92, 75, 79, 90, 75, 74, 0, 14, 122, 70, 92, 75, 79, 74, 20, 14};
    }

    public abstract void A06();

    static {
        A02();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public KT() {
        if (A03.get()) {
            this.A00 = KY.A01(new KX(A01(0, 26, 90) + Thread.currentThread().getName()));
        } else {
            this.A00 = null;
        }
    }

    public static void A03(boolean z) {
        A03.set(z);
    }

    public static void A04(boolean z, KJ kj) {
        A02.set(z);
        A04.set(kj);
    }

    public final KH A05() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                KY.A03(this);
            }
            try {
                A06();
            } catch (Throwable th) {
                if (A02.get()) {
                    AbstractC0694Ka.A00().A9S(3301, th);
                    KJ kj = A04.get();
                    if (kj != null) {
                        kj.AFC(th, this);
                    }
                } else {
                    throw th;
                }
            }
            if (A03.get()) {
                KY.A04(this);
            }
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
