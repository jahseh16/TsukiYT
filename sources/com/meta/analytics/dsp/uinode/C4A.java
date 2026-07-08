package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4A, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C4A {
    public static byte[] A02;
    public static String[] A03 = {"bULQ32o9JJN83aCucFVWf9xMaMFfdsau", "BEVDZxUetTHXZyMQk8onv0fPj1ZBZ1Qa", "0vYpub5LBkfCpAgXclsnPo1", "vVWBcEJQjEsfNalmzVe1r7miASaPIW1B", "LFkzDQh", "g5RhG8eWHWtWI7ENz9qYtKd", "50dEOoYhOQRa91fvkd77j3svvS12NHRj", "eQbNRdF"};
    public long A00 = 0;
    public C4A A01;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 5);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-34, -34};
    }

    static {
        A02();
    }

    private void A01() {
        if (this.A01 == null) {
            this.A01 = new C4A();
        }
    }

    public final int A03(int i) {
        C4A c4a = this.A01;
        if (c4a == null) {
            if (i >= 64) {
                return Long.bitCount(this.A00);
            }
            return Long.bitCount(this.A00 & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.A00 & ((1 << i) - 1));
        }
        return c4a.A03(i - 64) + Long.bitCount(this.A00);
    }

    public final void A04() {
        this.A00 = 0L;
        C4A c4a = this.A01;
        if (c4a != null) {
            c4a.A04();
        }
    }

    public final void A05(int i) {
        if (i >= 64) {
            C4A c4a = this.A01;
            if (c4a != null) {
                c4a.A05(i - 64);
                return;
            }
            return;
        }
        long j = this.A00 & ((1 << i) ^ (-1));
        if (A03[1].charAt(31) != 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[6] = "FQtQPqX5zshXn4VmNwTVsnzPJS3Krcw4";
        strArr[3] = "mEVd87EgPvtBoIzzDeJnjIPIOSUL2jIs";
        this.A00 = j;
    }

    public final void A06(int i) {
        if (i >= 64) {
            A01();
            this.A01.A06(i - 64);
        } else {
            this.A00 |= 1 << i;
        }
    }

    public final void A07(int i, boolean z) {
        if (i >= 64) {
            A01();
            this.A01.A07(i - 64, z);
            return;
        }
        long j = this.A00;
        boolean z5 = (Long.MIN_VALUE & j) != 0;
        long j4 = (1 << i) - 1;
        this.A00 = (j & j4) | ((j & ((-1) ^ j4)) << 1);
        if (z) {
            A06(i);
        } else {
            A05(i);
        }
        if (!z5 && this.A01 == null) {
            return;
        }
        A01();
        this.A01.A07(0, z5);
    }

    public final boolean A08(int i) {
        if (i < 64) {
            return (this.A00 & (1 << i)) != 0;
        }
        A01();
        return this.A01.A08(i - 64);
    }

    public final boolean A09(int i) {
        if (i >= 64) {
            A01();
            return this.A01.A09(i - 64);
        }
        long j = 1 << i;
        long j4 = this.A00;
        boolean z = (j4 & j) != 0;
        long j7 = j4 & (j ^ (-1));
        this.A00 = j7;
        long j8 = j - 1;
        long mask = j7 & j8;
        long before = Long.rotateRight(j7 & ((-1) ^ j8), 1);
        this.A00 = mask | before;
        C4A c4a = this.A01;
        if (c4a != null) {
            if (c4a.A08(0)) {
                A06(63);
            }
            this.A01.A09(0);
        }
        return z;
    }

    public final String toString() {
        if (this.A01 != null) {
            return this.A01.toString() + A00(0, 2, 97) + Long.toBinaryString(this.A00);
        }
        long j = this.A00;
        if (A03[1].charAt(31) != 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[2] = "hJ9KUEYMHtIt6rT1Ez0KfdL";
        strArr[5] = "B6CHA8tZa8vt0H5l4hWvu9Y";
        return Long.toBinaryString(j);
    }
}
