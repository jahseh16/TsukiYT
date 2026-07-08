package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YZ extends KT {
    public final /* synthetic */ C1063Ym A00;

    public YZ(C1063Ym c1063Ym) {
        this.A00 = c1063Ym;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
