package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1011Wm implements InterfaceC0502Bs {
    public static byte[] A05;
    public static String[] A06 = {"4UYaWsXN1cGpTlRGsO1EVWVYv3mJMVWU", "hbK8JAe0mxfaYRX1PJWZwY", "A0tXjRJ", "osk77A0r9", "0YYQ7Ec", "0ahCLR5uyRlwKx93emwBc8GJDT750HRT", "YIO", "F1mMZvBQ8EiEftVGCLgPL0zcj9avMacR"};
    public static final InterfaceC0505Bv A07;
    public int A00;
    public int A01;
    public InterfaceC0504Bu A02;
    public C4 A03;
    public C1010Wl A04;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{53, 78, 83, 85, 80, 80, 79, 82, 84, 69, 68, 0, 79, 82, 0, 85, 78, 82, 69, 67, 79, 71, 78, 73, 90, 69, 68, 0, 87, 65, 86, 0, 72, 69, 65, 68, 69, 82, 14, 52, 72, 55, 60, 66, 2, 69, 52, 74};
    }

    static {
        A01();
        A07 = new C1012Wn();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0502Bs
    public final void A8o(InterfaceC0504Bu interfaceC0504Bu) {
        this.A02 = interfaceC0504Bu;
        this.A03 = interfaceC0504Bu.AGi(0, 1);
        this.A04 = null;
        interfaceC0504Bu.A5Y();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0502Bs
    public final int AEH(InterfaceC0503Bt interfaceC0503Bt, C0507Bz c0507Bz) throws InterruptedException, IOException {
        if (this.A04 == null) {
            C1010Wl c1010WlA00 = DF.A00(interfaceC0503Bt);
            this.A04 = c1010WlA00;
            if (c1010WlA00 != null) {
                this.A03.A5n(Format.A06(null, A00(39, 9, 113), null, c1010WlA00.A00(), 32768, this.A04.A03(), this.A04.A04(), this.A04.A02(), null, null, 0, null));
                this.A00 = this.A04.A01();
            } else {
                throw new C04539v(A00(0, 39, 126));
            }
        }
        C1010Wl c1010Wl = this.A04;
        if (A06[0].charAt(24) != 'v') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[6] = "XBd";
        strArr[3] = "hS3DTCCH9";
        if (!c1010Wl.A07()) {
            DF.A03(interfaceC0503Bt, this.A04);
            this.A02.AFi(this.A04);
        }
        int iAFQ = this.A03.AFQ(interfaceC0503Bt, 32768 - this.A01, true);
        if (iAFQ != -1) {
            this.A01 += iAFQ;
        }
        int i = this.A01 / this.A00;
        if (i > 0) {
            long jA05 = this.A04.A05(interfaceC0503Bt.A7i() - ((long) this.A01));
            int i5 = this.A00 * i;
            int i8 = this.A01 - i5;
            this.A01 = i8;
            this.A03.AFS(jA05, 1, i5, i8, null);
        }
        return iAFQ == -1 ? -1 : 0;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0502Bs
    public final void AFh(long j, long j4) {
        this.A01 = 0;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0502Bs
    public final boolean AGR(InterfaceC0503Bt interfaceC0503Bt) throws InterruptedException, IOException {
        return DF.A00(interfaceC0503Bt) != null;
    }
}
