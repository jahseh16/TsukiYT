package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ws, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1017Ws implements D6 {
    public static byte[] A03;
    public C4 A00;
    public IB A01;
    public boolean A02;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{90, 75, 75, 87, 82, 88, 90, 79, 82, 84, 85, 20, 67, 22, 72, 88, 79, 94, 8, 14};
    }

    @Override // com.meta.analytics.dsp.uinode.D6
    public final void A4R(C0645Hz c0645Hz) {
        if (!this.A02) {
            if (this.A01.A05() == -9223372036854775807L) {
                return;
            }
            this.A00.A5n(Format.A02(null, A00(0, 20, 99), this.A01.A05()));
            this.A02 = true;
        }
        int iA04 = c0645Hz.A04();
        this.A00.AFR(c0645Hz, iA04);
        this.A00.AFS(this.A01.A04(), 1, iA04, 0, null);
    }

    @Override // com.meta.analytics.dsp.uinode.D6
    public final void A8q(IB ib, InterfaceC0504Bu interfaceC0504Bu, DC dc) {
        this.A01 = ib;
        dc.A05();
        C4 c4AGi = interfaceC0504Bu.AGi(dc.A03(), 4);
        this.A00 = c4AGi;
        c4AGi.A5n(Format.A0B(dc.A04(), A00(0, 20, 99), null, -1, null));
    }
}
