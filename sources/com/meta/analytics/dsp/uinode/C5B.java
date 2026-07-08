package com.meta.analytics.dsp.uinode;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5B, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C5B {
    public AnonymousClass58 A00 = new AnonymousClass58();
    public final AnonymousClass59 A01;

    public C5B(AnonymousClass59 anonymousClass59) {
        this.A01 = anonymousClass59;
    }

    public final View A00(int i, int i5, int i8, int i10) {
        int iA7b = this.A01.A7b();
        int next = this.A01.A7a();
        int childEnd = i5 > i ? 1 : -1;
        View view = null;
        while (i != i5) {
            View viewA6M = this.A01.A6M(i);
            int iA6P = this.A01.A6P(viewA6M);
            int i11 = this.A01.A6O(viewA6M);
            this.A00.A03(iA7b, next, iA6P, i11);
            if (i8 != 0) {
                this.A00.A01();
                this.A00.A02(i8);
                if (this.A00.A04()) {
                    return viewA6M;
                }
            }
            if (i10 != 0) {
                this.A00.A01();
                this.A00.A02(i10);
                if (this.A00.A04()) {
                    view = viewA6M;
                }
            }
            i += childEnd;
        }
        return view;
    }
}
