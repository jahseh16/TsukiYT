package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04429j implements Comparable<C04429j> {
    public int A00;
    public long A01;
    public Object A02;
    public final A8 A03;

    public C04429j(A8 a82) {
        this.A03 = a82;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C04429j c04429j) {
        Object obj = this.A02;
        if ((obj == null) != (c04429j.A02 == null)) {
            return obj != null ? -1 : 1;
        }
        if (obj == null) {
            return 0;
        }
        int i = this.A00 - c04429j.A00;
        if (i != 0) {
            return i;
        }
        int comparePeriodIndex = IF.A07(this.A01, c04429j.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i, long j, Object obj) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}
