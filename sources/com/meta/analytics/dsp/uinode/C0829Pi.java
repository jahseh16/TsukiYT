package com.meta.analytics.dsp.uinode;

import android.util.SparseArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0829Pi {
    public final SparseArray<int[]> A00 = new SparseArray<>();

    public final void A00(int i, int[] iArr) {
        this.A00.put(i, iArr);
    }

    public final boolean A01(int i) {
        return this.A00.indexOfKey(i) >= 0;
    }

    public final int[] A02(int i) {
        return this.A00.get(i);
    }
}
