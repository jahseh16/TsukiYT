package com.meta.analytics.dsp.uinode;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ly, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class CallableC0741Ly implements Callable<Void> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int[] A06;

    public CallableC0741Ly(int[] iArr, int i, int i5, int i8, int i10, int i11, int i12) {
        this.A06 = iArr;
        this.A05 = i;
        this.A01 = i5;
        this.A02 = i8;
        this.A04 = i10;
        this.A00 = i11;
        this.A03 = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Void call() throws Exception {
        C0951Ua.A00(this.A06, this.A05, this.A01, this.A02, this.A04, this.A00, this.A03);
        return null;
    }
}
