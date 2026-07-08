package com.meta.analytics.dsp.uinode;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SL extends O4 {
    public final ImageView A00;
    public final C1064Yn A01;

    public SL(C1064Yn c1064Yn) {
        super(c1064Yn);
        this.A01 = c1064Yn;
        ImageView imageView = new ImageView(c1064Yn);
        this.A00 = imageView;
        imageView.setAdjustViewBounds(true);
        addView(imageView, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC0941Tq downloadImageTask = new AsyncTaskC0941Tq(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
