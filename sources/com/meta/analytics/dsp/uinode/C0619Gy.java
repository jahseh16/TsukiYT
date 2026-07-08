package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0619Gy {
    public static byte[] A07;
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final String A05;
    public final byte[] A06;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-125, 119, 105, -122, -103, -122, 120, -107, -118, -120, -128, -50};
    }

    public C0619Gy(Uri uri, long j, long j4, long j7, String str, int i) {
        this(uri, null, j, j4, j7, str, i);
    }

    public C0619Gy(Uri uri, long j, long j4, String str) {
        this(uri, j, j, j4, str, 0);
    }

    public C0619Gy(Uri uri, long j, long j4, String str, int i) {
        this(uri, j, j, j4, str, i);
    }

    public C0619Gy(Uri uri, byte[] bArr, long j, long j4, long j7, String str, int i) {
        boolean z = true;
        AbstractC0620Ha.A03(j >= 0);
        AbstractC0620Ha.A03(j4 >= 0);
        if (j7 <= 0 && j7 != -1) {
            z = false;
        }
        AbstractC0620Ha.A03(z);
        this.A04 = uri;
        this.A06 = bArr;
        this.A01 = j;
        this.A03 = j4;
        this.A02 = j7;
        this.A05 = str;
        this.A00 = i;
    }

    public final boolean A02(int i) {
        return (this.A00 & i) == i;
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder().append(A00(2, 9, 16)).append(this.A04);
        String strA00 = A00(0, 2, 66);
        return sbAppend.append(strA00).append(Arrays.toString(this.A06)).append(strA00).append(this.A01).append(strA00).append(this.A03).append(strA00).append(this.A02).append(strA00).append(this.A05).append(strA00).append(this.A00).append(A00(11, 1, 92)).toString();
    }
}
