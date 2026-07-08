package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class OA {
    public static final int A00 = AbstractC0731Lo.A00();

    public static void A00(C1064Yn c1064Yn, ViewGroup viewGroup, String str) {
        new AsyncTaskC0941Tq(viewGroup, c1064Yn).A07(str);
        View view = new View(c1064Yn);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC0731Lo.A0R(view, c1064Yn);
        viewGroup.addView(view, 0);
    }
}
