package com.meta.analytics.dsp.uinode;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeBannerAd;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EZ extends ZG {
    public QB A00;

    public final void A04(C1064Yn c1064Yn, NativeBannerAd nativeBannerAd, JR jr2, NativeAdLayout nativeAdLayout) {
        MediaView mediaView = new MediaView(nativeAdLayout.getContext());
        AdOptionsView adOptionsView = new AdOptionsView(nativeAdLayout.getContext(), nativeBannerAd, nativeAdLayout);
        jr2.A09(adOptionsView, 20);
        this.A00 = new SI(c1064Yn, nativeBannerAd, jr2, V2.A0L(nativeBannerAd.getInternalNativeAd()).A17(), mediaView, adOptionsView);
        AbstractC0731Lo.A0M(nativeAdLayout, jr2.A00());
        nativeBannerAd.registerViewForInteraction(nativeAdLayout, mediaView, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams contentParams = new FrameLayout.LayoutParams(-1, -1);
        contentParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), contentParams);
    }

    @Override // com.meta.analytics.dsp.uinode.C03415a
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
