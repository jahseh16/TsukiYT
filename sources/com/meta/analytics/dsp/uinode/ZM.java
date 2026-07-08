package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAd;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZM implements P0 {
    public final /* synthetic */ NativeAd A00;
    public final /* synthetic */ ZH A01;
    public final /* synthetic */ V2 A02;

    public ZM(ZH zh, V2 v22, NativeAd nativeAd) {
        this.A01 = zh;
        this.A02 = v22;
        this.A00 = nativeAd;
    }

    @Override // com.meta.analytics.dsp.uinode.P0
    public final void A9L() {
    }

    @Override // com.meta.analytics.dsp.uinode.P0
    public final void ABO(B0 b02) {
        new Handler(Looper.getMainLooper()).postDelayed(new ZN(this, b02), 1L);
    }

    @Override // com.meta.analytics.dsp.uinode.P0
    public final void ABd() {
        if (this.A01.A0A != null) {
            this.A01.A0A.A08();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.P0
    public final void ADL(View view, MotionEvent motionEvent) throws Throwable {
        this.A02.A19().A06(this.A01.A07, motionEvent, view, view);
        if (motionEvent.getAction() == 1 && !this.A01.A0J(this.A00) && this.A02.A12() != null) {
            this.A02.A12().onClick(view);
        }
    }
}
