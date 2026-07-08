package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0830Pj {
    public final int[] A00(View view, int i, int i5) {
        C03314p c03314p = (C03314p) view.getLayoutParams();
        int childHeightSpec = ViewGroup.getChildMeasureSpec(i, view.getPaddingLeft() + view.getPaddingRight(), c03314p.width);
        int childWidthSpec = view.getPaddingTop();
        view.measure(childHeightSpec, ViewGroup.getChildMeasureSpec(i5, childWidthSpec + view.getPaddingBottom(), c03314p.height));
        int childWidthSpec2 = view.getMeasuredWidth();
        int childWidthSpec3 = view.getMeasuredHeight();
        return new int[]{childWidthSpec2 + c03314p.leftMargin + c03314p.rightMargin, childWidthSpec3 + c03314p.bottomMargin + c03314p.topMargin};
    }
}
