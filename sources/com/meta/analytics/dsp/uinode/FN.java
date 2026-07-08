package com.meta.analytics.dsp.uinode;

import android.net.Uri;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FN {
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final Uri[] A03;

    public FN() {
        this(-1, new int[0], new Uri[0], new long[0]);
    }

    public FN(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
        AbstractC0620Ha.A03(iArr.length == uriArr.length);
        this.A00 = i;
        this.A01 = iArr;
        this.A03 = uriArr;
        this.A02 = jArr;
    }

    public final int A00() {
        return A01(-1);
    }

    public final int A01(int i) {
        int i5;
        int i8 = i + 1;
        while (true) {
            int[] iArr = this.A01;
            int nextAdIndexToPlay = iArr.length;
            if (i8 >= nextAdIndexToPlay || (i5 = iArr[i8]) == 0 || i5 == 1) {
                break;
            }
            i8++;
        }
        return i8;
    }

    public final boolean A02() {
        return this.A00 == -1 || A00() < this.A00;
    }
}
