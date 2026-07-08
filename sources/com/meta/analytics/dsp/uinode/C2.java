package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2 {
    public static byte[] A02;
    public static final C2 A03;
    public final long A00;
    public final long A01;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{114, 126, 46, 49, 45, 55, 42, 55, 49, 48, 99, 50, 29, 0, 4, 12, 60, 26, 84, 102};
    }

    static {
        A01();
        A03 = new C2(0L, 0L);
    }

    public C2(long j, long j4) {
        this.A01 = j;
        this.A00 = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2 c22 = (C2) obj;
        return this.A01 == c22.A01 && this.A00 == c22.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public final String toString() {
        return A00(11, 8, 83) + this.A01 + A00(0, 11, 100) + this.A00 + A00(19, 1, 1);
    }
}
