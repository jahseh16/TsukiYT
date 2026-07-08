package com.meta.analytics.dsp.uinode;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0493Bj implements V1 {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C0493Bj(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.meta.analytics.dsp.uinode.JH
    public final void AAc() {
        KK.A00(new C0973Ux(this));
    }

    @Override // com.meta.analytics.dsp.uinode.JH
    public final void AAg() {
        KK.A00(new C0974Uy(this));
    }

    @Override // com.meta.analytics.dsp.uinode.JH
    public final void ABR(C0670Jb c0670Jb) {
        KK.A00(new V0(this, c0670Jb));
    }

    @Override // com.meta.analytics.dsp.uinode.JH
    public final void ACA() {
        KK.A00(new C0972Uw(this));
    }

    @Override // com.meta.analytics.dsp.uinode.V1
    public final void ACF() {
        KK.A00(new C0975Uz(this));
    }
}
