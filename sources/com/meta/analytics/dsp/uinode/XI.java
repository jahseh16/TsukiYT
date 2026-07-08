package com.meta.analytics.dsp.uinode;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class XI implements InterfaceC0518Cl, C1 {
    public static String[] A05 = {"RxrevBHwZunvWtoC5v6V", "BM7NoIYIDKALVkWYBFUm4mgKfD4surZT", "wT545zonAETVeqcNIpSLQKDSBA4psZtT", "O6YerNOVuBIV8g4cn8DH", "f7xxxnJira03VIlY2bxNtwSQeXyrwxct", "8kRv9b0m26r6Uh6XKMOB9WasCMU5o07v", "0W8GSaK37PxtOyOV4bIEUVoiYe2UqjRN", "TYUMHNguvpgJeUJ5Wme9D9z4"};
    public long A00 = -1;
    public long A01 = -1;
    public long[] A02;
    public long[] A03;
    public final /* synthetic */ XH A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.C1
    public final C0 A7t(long j) {
        int iA0B = IF.A0B(this.A02, this.A04.A04(j), true, true);
        long jA03 = this.A04.A03(this.A02[iA0B]);
        C2 c22 = new C2(jA03, this.A00 + this.A03[iA0B]);
        if (jA03 < j) {
            long[] jArr = this.A02;
            if (iA0B != jArr.length - 1) {
                return new C0(c22, new C2(this.A04.A03(jArr[iA0B + 1]), this.A00 + this.A03[iA0B + 1]));
            }
        }
        return new C0(c22);
    }

    public XI(XH xh) {
        this.A04 = xh;
    }

    public final void A00(long j) {
        this.A00 = j;
    }

    public final void A01(C0645Hz c0645Hz) {
        c0645Hz.A0Z(1);
        int length = c0645Hz.A0G();
        int i = length / 18;
        this.A02 = new long[i];
        this.A03 = new long[i];
        for (int i5 = 0; i5 < i; i5++) {
            this.A02[i5] = c0645Hz.A0L();
            this.A03[i5] = c0645Hz.A0L();
            c0645Hz.A0Z(2);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0518Cl
    public final C1 A4m() {
        return this;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final long A6r() {
        return this.A04.A01.A01();
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final boolean A9I() {
        return true;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0518Cl
    public final long AEI(InterfaceC0503Bt interfaceC0503Bt) throws InterruptedException, IOException {
        long j = this.A01;
        if (j < 0) {
            return -1L;
        }
        long j4 = -(j + 2);
        this.A01 = -1L;
        if (A05[5].charAt(9) != '6') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[0] = "MeEp95NFLxRX8bxkfA2m";
        strArr[3] = "RwTpOb1Sie1PnKrI5U9E";
        return j4;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0518Cl
    public final long AGX(long j) {
        long jA04 = this.A04.A04(j);
        long granule = this.A02[IF.A0B(this.A02, jA04, true, true)];
        this.A01 = granule;
        return jA04;
    }
}
