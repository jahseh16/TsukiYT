package com.meta.analytics.dsp.uinode;

import android.util.SparseArray;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class G4 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final SparseArray<G5> A09;
    public final boolean A0A;

    public G4(int i, boolean z, int i5, int i8, int i10, int i11, int i12, int i13, int i14, int i15, SparseArray<G5> sparseArray) {
        this.A03 = i;
        this.A0A = z;
        this.A08 = i5;
        this.A02 = i8;
        this.A04 = i10;
        this.A01 = i11;
        this.A00 = i12;
        this.A07 = i13;
        this.A06 = i14;
        this.A05 = i15;
        this.A09 = sparseArray;
    }

    public final void A00(G4 g42) {
        if (g42 == null) {
            return;
        }
        SparseArray<G5> sparseArray = g42.A09;
        for (int i = 0; i < sparseArray.size(); i++) {
            SparseArray<G5> sparseArray2 = this.A09;
            int i5 = sparseArray.keyAt(i);
            sparseArray2.put(i5, sparseArray.valueAt(i));
        }
    }
}
