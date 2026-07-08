package com.meta.analytics.dsp.uinode;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BZ extends SA {
    public BZ(C1064Yn c1064Yn) {
        super(c1064Yn);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        int newWidthSpec = View.MeasureSpec.getMode(i);
        if (newWidthSpec == 1073741824) {
            i5 = i;
        } else {
            int newWidthSpec2 = View.MeasureSpec.getMode(i5);
            if (newWidthSpec2 == 1073741824) {
                i = i5;
            }
        }
        super.onMeasure(i, i5);
    }
}
