package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0985Vj implements InterfaceC0614Gt {
    public static byte[] A06;
    public final int A00;
    public final InterfaceC0612Gr A01;
    public final InterfaceC0614Gt A02;
    public final InterfaceC0614Gt A03;
    public final HK A04;
    public final HM A05;

    static {
        A02();
    }

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{106, 123, 108, 104, 125, 108, 77, 104, 125, 104, 90, 96, 103, 98};
    }

    public C0985Vj(HK hk2, InterfaceC0614Gt interfaceC0614Gt, InterfaceC0614Gt interfaceC0614Gt2, InterfaceC0612Gr interfaceC0612Gr, int i, HM hm) {
        this.A04 = hk2;
        this.A03 = interfaceC0614Gt;
        this.A02 = interfaceC0614Gt2;
        this.A01 = interfaceC0612Gr;
        this.A00 = i;
        this.A05 = hm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0614Gt
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0986Vk A4X() {
        HK hk2 = this.A04;
        InterfaceC0615Gu interfaceC0615GuA4X = this.A03.A4X();
        InterfaceC0615Gu interfaceC0615GuA4X2 = this.A02.A4X();
        if (0 != 0) {
            throw new NullPointerException(A01(0, 14, 37));
        }
        return new C0986Vk(hk2, interfaceC0615GuA4X, interfaceC0615GuA4X2, null, this.A00, null);
    }
}
