package com.meta.analytics.dsp.uinode;

import android.text.Layout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WJ extends C0583Fn implements Comparable<WJ> {
    public final int A00;

    public WJ(CharSequence charSequence, Layout.Alignment alignment, float f3, int i, int i5, float f4, int i8, float f5, boolean z, int i10, int i11) {
        super(charSequence, alignment, f3, i, i5, f4, i8, f5, z, i10);
        this.A00 = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(WJ wj) {
        int i = wj.A00;
        int i5 = this.A00;
        if (i < i5) {
            return -1;
        }
        if (i > i5) {
            return 1;
        }
        return 0;
    }
}
