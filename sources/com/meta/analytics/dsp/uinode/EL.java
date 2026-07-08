package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EL {
    public static byte[] A05;
    public static String[] A06 = {"ys79rflcZR", "JvXVVVa5NcPDQ", "Q89GAQFZPNwANkfCdiKH1gvUr6", "fZOyMOuChjfI9gOKYd90JCIRk18sz1rD", "OOW8UfRJew081BUdbBG5Pxzf0VO", "xPmLQSFy3SjaACTv6gu", "e8kFvK5VJCM4F", "4YvHW6"};
    public final InterfaceC0612Gr A00;
    public final InterfaceC0614Gt A01;
    public final InterfaceC0614Gt A02;
    public final HK A03;
    public final I3 A04;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            int i11 = (bArrCopyOfRange[i10] - i8) - 26;
            String[] strArr = A06;
            if (strArr[1].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A06[5] = "z6hEl1VDyGriGJRg";
            bArrCopyOfRange[i10] = (byte) i11;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{126, -115, -128, 124, -113, -128, 95, 124, -113, 124, 110, -124, -119, -122};
    }

    static {
        A01();
    }

    public EL(HK hk2, InterfaceC0614Gt interfaceC0614Gt) {
        this(hk2, interfaceC0614Gt, null, null, null);
    }

    public EL(HK hk2, InterfaceC0614Gt interfaceC0614Gt, InterfaceC0614Gt interfaceC0614Gt2, InterfaceC0612Gr interfaceC0612Gr, I3 i32) {
        AbstractC0620Ha.A01(interfaceC0614Gt);
        this.A03 = hk2;
        this.A02 = interfaceC0614Gt;
        this.A01 = interfaceC0614Gt2;
        this.A00 = interfaceC0612Gr;
        this.A04 = i32;
    }

    public final HK A02() {
        return this.A03;
    }

    public final C0986Vk A03(boolean z) {
        InterfaceC0615Gu c0998Vw;
        InterfaceC0614Gt interfaceC0614Gt = this.A01;
        if (interfaceC0614Gt != null) {
            c0998Vw = interfaceC0614Gt.A4X();
        } else {
            c0998Vw = new C0998Vw();
        }
        if (z) {
            return new C0986Vk(this.A03, C0999Vx.A02, c0998Vw, null, 1, null);
        }
        if (0 != 0) {
            throw new NullPointerException(A00(0, 14, 1));
        }
        C0987Vl c0987Vl = new C0987Vl(this.A03, 2097152L);
        InterfaceC0615Gu interfaceC0615GuA4X = this.A02.A4X();
        I3 i32 = this.A04;
        if (i32 != null) {
            interfaceC0615GuA4X = new C0991Vp(interfaceC0615GuA4X, i32, -1000);
        }
        InterfaceC0615Gu upstream = c0998Vw;
        return new C0986Vk(this.A03, interfaceC0615GuA4X, upstream, c0987Vl, 1, null);
    }

    public final I3 A04() {
        I3 i32 = this.A04;
        return i32 != null ? i32 : new I3();
    }
}
