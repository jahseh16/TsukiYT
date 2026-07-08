package com.meta.analytics.dsp.uinode;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XF implements InterfaceC0502Bs {
    public static byte[] A03;
    public static final InterfaceC0505Bv A04;
    public InterfaceC0504Bu A00;
    public AbstractC0521Co A01;
    public boolean A02;

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{108, -121, -113, -110, -117, -118, 70, -102, -107, 70, -118, -117, -102, -117, -104, -109, -113, -108, -117, 70, -120, -113, -102, -103, -102, -104, -117, -121, -109, 70, -102, -97, -106, -117};
    }

    static {
        A02();
        A04 = new XG();
    }

    public static C0645Hz A00(C0645Hz c0645Hz) {
        c0645Hz.A0Y(0);
        return c0645Hz;
    }

    private boolean A03(InterfaceC0503Bt interfaceC0503Bt) throws InterruptedException, IOException {
        C0517Ck c0517Ck = new C0517Ck();
        if (!c0517Ck.A03(interfaceC0503Bt, true) || (c0517Ck.A04 & 2) != 2) {
            return false;
        }
        int length = Math.min(c0517Ck.A00, 8);
        C0645Hz c0645Hz = new C0645Hz(length);
        interfaceC0503Bt.ADv(c0645Hz.A00, 0, length);
        if (XH.A04(A00(c0645Hz))) {
            this.A01 = new XH();
        } else if (XC.A06(A00(c0645Hz))) {
            this.A01 = new XC();
        } else {
            if (!XE.A04(A00(c0645Hz))) {
                return false;
            }
            this.A01 = new XE();
        }
        return true;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0502Bs
    public final void A8o(InterfaceC0504Bu interfaceC0504Bu) {
        this.A00 = interfaceC0504Bu;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0502Bs
    public final int AEH(InterfaceC0503Bt interfaceC0503Bt, C0507Bz c0507Bz) throws InterruptedException, IOException {
        if (this.A01 == null) {
            if (A03(interfaceC0503Bt)) {
                interfaceC0503Bt.AFM();
            } else {
                throw new C04539v(A01(0, 34, 1));
            }
        }
        if (!this.A02) {
            C4 c4AGi = this.A00.AGi(0, 1);
            this.A00.A5Y();
            this.A01.A06(this.A00, c4AGi);
            this.A02 = true;
        }
        return this.A01.A02(interfaceC0503Bt, c0507Bz);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0502Bs
    public final void AFh(long j, long j4) {
        AbstractC0521Co abstractC0521Co = this.A01;
        if (abstractC0521Co != null) {
            abstractC0521Co.A05(j, j4);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0502Bs
    public final boolean AGR(InterfaceC0503Bt interfaceC0503Bt) throws InterruptedException, IOException {
        try {
            return A03(interfaceC0503Bt);
        } catch (C04539v unused) {
            return false;
        }
    }
}
