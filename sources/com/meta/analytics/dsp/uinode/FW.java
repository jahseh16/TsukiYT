package com.meta.analytics.dsp.uinode;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FW extends AbstractC1168b6 {
    public final C1064Yn A00;

    public FW(C3C c3c, List<V2> list, C1064Yn c1064Yn) {
        super(c3c, list, c1064Yn);
        this.A00 = c1064Yn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03184c
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final UR A0C(ViewGroup viewGroup, int i) {
        return new UR(new MN(this.A00));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, com.facebook.ads.internal.api.AdNativeComponentView, com.facebook.ads.redexgen.X.MN] */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03184c
    /* JADX INFO: renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final void A0D(UR ur2, int i) {
        super.A0D(ur2, i);
        ?? r3 = (MN) ur2.A0j();
        MZ imageView = (MZ) r3.getImageCardView();
        imageView.setImageDrawable(null);
        A0F(imageView, i);
        V2 v22 = ((AbstractC1168b6) this).A01.get(i);
        v22.A11().A0K(this.A00);
        v22.A1N(r3, r3);
    }
}
