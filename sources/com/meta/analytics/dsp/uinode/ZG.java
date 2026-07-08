package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.NativeAdLayoutApi;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZG extends C03415a implements NativeAdLayoutApi {
    public View A02;
    public NativeAdLayout A03;
    public int A01 = 0;
    public int A00 = 0;

    public final void A02() {
        AbstractC0731Lo.A0T(this.A03);
        this.A03.removeView(this.A02);
        this.A02 = null;
    }

    public final void A03(AbstractC0757Mo abstractC0757Mo) {
        this.A02 = abstractC0757Mo;
        abstractC0757Mo.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC0731Lo.A0T(this.A03);
        this.A03.addView(this.A02);
    }

    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    public final void initialize(NativeAdLayout nativeAdLayout) {
        this.A03 = nativeAdLayout;
    }

    @Override // com.meta.analytics.dsp.uinode.C03415a
    public final void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        if (this.A00 > 0) {
            int measuredWidth = this.A03.getMeasuredWidth();
            int i8 = this.A00;
            if (measuredWidth > i8) {
                setMeasuredDimension(i8, this.A03.getMeasuredHeight());
                return;
            }
        }
        int measuredWidth2 = this.A03.getMeasuredWidth();
        int i10 = this.A01;
        if (measuredWidth2 >= i10) {
            return;
        }
        setMeasuredDimension(i10, this.A03.getMeasuredHeight());
    }

    public final void setMaxWidth(int i) {
        this.A00 = i;
    }

    public final void setMinWidth(int i) {
        this.A01 = i;
    }
}
