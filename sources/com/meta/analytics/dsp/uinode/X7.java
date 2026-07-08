package com.meta.analytics.dsp.uinode;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class X7 implements InterfaceC0502Bs {
    public static byte[] A04;
    public static String[] A05 = {"zdP8mq1V4qx9ZCdsfAD4NG7cLFVpQAAe", "koAkuIv", "fyRTvmHGGGsRl9BV6D3JToZwd0QymLEV", "Ol6FmQC", "pWzJ4KWOtVeOprDRKRooJjLfCIz1i7Yl", "FaGWZpOEFJ3DEiDU22ljd64Ld5pUV9HD", "txEKQBUTk3v9kOkzxdvVTnLo1IME9gDG", "VQ1knBpCfCAoSCLl3kVfN2N5wBdN5LBp"};
    public static final InterfaceC0505Bv A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final X6 A02;
    public final C0645Hz A03;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i5);
        int i10 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A05;
            if (strArr[2].charAt(21) == strArr[4].charAt(21)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[6] = "6nR4pRT1Z5KTQHbqvhpghrBhlvQkSoKV";
            strArr2[5] = "SkXTa4uQceGhkSQtr6wVij7rDC15CMq5";
            if (i10 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 67);
            i10++;
        }
    }

    public static void A01() {
        A04 = new byte[]{66, 79, 56};
    }

    static {
        A01();
        A06 = new X8();
        A07 = IF.A08(A00(0, 3, 72));
    }

    public X7() {
        this(0L);
    }

    public X7(long j) {
        this.A01 = j;
        this.A02 = new X6(true);
        this.A03 = new C0645Hz(200);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0502Bs
    public final void A8o(InterfaceC0504Bu interfaceC0504Bu) {
        this.A02.A4p(interfaceC0504Bu, new DC(0, 1));
        interfaceC0504Bu.A5Y();
        interfaceC0504Bu.AFi(new C1034Xj(-9223372036854775807L));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0502Bs
    public final int AEH(InterfaceC0503Bt interfaceC0503Bt, C0507Bz c0507Bz) throws InterruptedException, IOException {
        int i = interfaceC0503Bt.read(this.A03.A00, 0, 200);
        if (i == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(i);
        if (!this.A00) {
            this.A02.ADt(this.A01, true);
            this.A00 = true;
        }
        this.A02.A4R(this.A03);
        return 0;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0502Bs
    public final void AFh(long j, long j4) {
        this.A00 = false;
        this.A02.AFg();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0502Bs
    public final boolean AGR(InterfaceC0503Bt interfaceC0503Bt) throws InterruptedException, IOException {
        C0645Hz c0645Hz = new C0645Hz(10);
        C0644Hy c0644Hy = new C0644Hy(c0645Hz.A00);
        int startPosition = 0;
        while (true) {
            interfaceC0503Bt.ADv(c0645Hz.A00, 0, 10);
            c0645Hz.A0Y(0);
            if (c0645Hz.A0G() != A07) {
                break;
            }
            c0645Hz.A0Z(3);
            int iA0D = c0645Hz.A0D();
            startPosition += iA0D + 10;
            interfaceC0503Bt.A3W(iA0D);
        }
        interfaceC0503Bt.AFM();
        interfaceC0503Bt.A3W(startPosition);
        int syncBytes = startPosition;
        int validFramesCount = 0;
        int i = 0;
        while (true) {
            interfaceC0503Bt.ADv(c0645Hz.A00, 0, 2);
            c0645Hz.A0Y(0);
            int headerPosition = 65526 & c0645Hz.A0I();
            if (headerPosition != 65520) {
                i = 0;
                validFramesCount = 0;
                interfaceC0503Bt.AFM();
                syncBytes++;
                int headerPosition2 = syncBytes - startPosition;
                if (headerPosition2 >= 8192) {
                    return false;
                }
                interfaceC0503Bt.A3W(syncBytes);
            } else {
                i++;
                if (i >= 4 && validFramesCount > 188) {
                    return true;
                }
                interfaceC0503Bt.ADv(c0645Hz.A00, 0, 4);
                c0644Hy.A07(14);
                int headerPosition3 = c0644Hy.A04(13);
                if (headerPosition3 <= 6) {
                    return false;
                }
                interfaceC0503Bt.A3W(headerPosition3 - 6);
                validFramesCount += headerPosition3;
            }
        }
    }
}
