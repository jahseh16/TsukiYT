package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class VC extends AbstractC02290q {
    public static byte[] A01;
    public final /* synthetic */ V2 A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 109);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{23, 42, 61, 50, 63, 46, -23, 42, 45, 60, -23, 54, 42, 55, 42, 48, 46, 59, -23, 61, 49, 46, 50, 59, -23, 56, 64, 55, -23, 50, 54, 57, 59, 46, 60, 60, 50, 56, 55, 60, -9};
    }

    public VC(V2 v22) {
        this.A00 = v22;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02290q
    public final void A0B(C1182bK c1182bK) {
        this.A00.A1T(c1182bK);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02290q
    public final void A0C() {
        if (this.A00.A0G != null) {
            this.A00.A0G.AAc();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02290q
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 92));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02290q
    public final void A0F(InterfaceC02280p interfaceC02280p) {
        if (this.A00.A0A != null) {
            this.A00.A0A.A0J();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02290q
    public final void A0G(C0670Jb c0670Jb) {
        this.A00.A11().A0E().A2m(C0722Lf.A01(this.A00.A00), c0670Jb.A03().getErrorCode(), c0670Jb.A04());
        if (this.A00.A0G != null) {
            this.A00.A0G.ABR(c0670Jb);
        }
    }
}
