package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W2 implements InterfaceC0607Gm {
    public static byte[] A08;
    public int A00;
    public int A01;
    public int A02;
    public C0606Gl[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;
    public final C0606Gl[] A07;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{100, 104, 40, 19, 24, 5, 13, 24, 30, 9, 24, 25, 93, 28, 17, 17, 18, 30, 28, 9, 20, 18, 19, 71, 93};
    }

    public W2(boolean z, int i) {
        this(z, i, 0);
    }

    public W2(boolean z, int i, int i5) {
        AbstractC0620Ha.A03(i > 0);
        AbstractC0620Ha.A03(i5 >= 0);
        this.A05 = z;
        this.A04 = i;
        this.A01 = i5;
        this.A03 = new C0606Gl[i5 + 100];
        if (i5 > 0) {
            this.A06 = new byte[i5 * i];
            for (int i8 = 0; i8 < i5; i8++) {
                this.A03[i8] = new C0606Gl(this.A06, i8 * i);
            }
        } else {
            this.A06 = null;
        }
        this.A07 = new C0606Gl[1];
    }

    public final synchronized int A02() {
        return this.A00 * this.A04;
    }

    public final synchronized void A03() {
        if (this.A05) {
            A04(0);
        }
    }

    public final synchronized void A04(int i) {
        boolean targetBufferSizeReduced = i < this.A02;
        this.A02 = i;
        if (targetBufferSizeReduced) {
            AGj();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0607Gm
    public final synchronized C0606Gl A3X() {
        C0606Gl c0606Gl;
        this.A00++;
        int i = this.A01;
        if (i > 0) {
            C0606Gl[] c0606GlArr = this.A03;
            int i5 = i - 1;
            this.A01 = i5;
            c0606Gl = c0606GlArr[i5];
            c0606GlArr[i5] = null;
        } else {
            c0606Gl = new C0606Gl(new byte[this.A04], 0);
        }
        return c0606Gl;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0607Gm
    public final int A7D() {
        return this.A04;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0607Gm
    public final synchronized void AEW(C0606Gl c0606Gl) {
        C0606Gl[] c0606GlArr = this.A07;
        c0606GlArr[0] = c0606Gl;
        AEX(c0606GlArr);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0607Gm
    public final synchronized void AEX(C0606Gl[] c0606GlArr) {
        int i = this.A01;
        int length = c0606GlArr.length + i;
        C0606Gl[] c0606GlArr2 = this.A03;
        if (length >= c0606GlArr2.length) {
            this.A03 = (C0606Gl[]) Arrays.copyOf(c0606GlArr2, Math.max(c0606GlArr2.length * 2, i + c0606GlArr.length));
        }
        for (C0606Gl c0606Gl : c0606GlArr) {
            if (c0606Gl.A01 == this.A06 || c0606Gl.A01.length == this.A04) {
                C0606Gl[] c0606GlArr3 = this.A03;
                int i5 = this.A01;
                this.A01 = i5 + 1;
                c0606GlArr3[i5] = c0606Gl;
            } else {
                throw new IllegalArgumentException(A00(2, 23, 110) + System.identityHashCode(c0606Gl.A01) + A00(0, 2, 91) + System.identityHashCode(this.A06) + A00(0, 2, 91) + c0606Gl.A01.length + A00(0, 2, 91) + this.A04);
            }
        }
        this.A00 -= c0606GlArr.length;
        notifyAll();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0607Gm
    public final synchronized void AGj() {
        int iA04 = IF.A04(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int highIndex = Math.max(0, iA04 - targetAllocationCount);
        int targetAvailableCount = this.A01;
        if (highIndex >= targetAvailableCount) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int i = targetAvailableCount - 1;
            while (lowIndex <= i) {
                C0606Gl highAllocation = this.A03[lowIndex];
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    C0606Gl lowAllocation = this.A03[i];
                    if (lowAllocation.A01 != this.A06) {
                        i--;
                    } else {
                        C0606Gl[] c0606GlArr = this.A03;
                        c0606GlArr[lowIndex] = lowAllocation;
                        int targetAllocationCount2 = i - 1;
                        c0606GlArr[i] = highAllocation;
                        i = targetAllocationCount2;
                        lowIndex++;
                    }
                }
            }
            highIndex = Math.max(highIndex, lowIndex);
            int targetAllocationCount3 = this.A01;
            if (highIndex >= targetAllocationCount3) {
                return;
            }
        }
        Arrays.fill(this.A03, highIndex, this.A01, (Object) null);
        this.A01 = highIndex;
    }
}
