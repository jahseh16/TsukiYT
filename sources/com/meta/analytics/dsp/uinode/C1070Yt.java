package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1070Yt extends KT {
    public static byte[] A02;
    public final /* synthetic */ C1069Ys A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A02();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, 87, 85, 94, 83, 22, 80, 87, 95, 90, 24, 77, 111, 109, 102, 107, 46, 125, 123, 109, 109, 107, 125, 125, 32};
    }

    public C1070Yt(C1069Ys c1069Ys, AtomicBoolean atomicBoolean) {
        this.A00 = c1069Ys;
        this.A01 = atomicBoolean;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(J9.A0H);
                C03726f.A02(this.A00.A02.A04, this.A00.A01, C03726f.A00, A00(11, 14, 17), this.A00.A02.A00);
                this.A00.A02.A0T();
                this.A00.A00.ABB();
                return;
            }
            this.A00.A02.A0I(J9.A0G);
            C03726f.A02(this.A00.A02.A04, this.A00.A01, C03726f.A04, A00(0, 11, 41), this.A00.A02.A00);
            this.A00.A02.A0U();
            this.A00.A00.AB2();
        }
    }
}
