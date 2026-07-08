package com.meta.analytics.dsp.uinode;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FX extends AbstractC1168b6 {
    public final C1064Yn A00;
    public final JR A01;

    public FX(C1064Yn c1064Yn, C3C c3c, List<V2> list, JR jr2) {
        super(c3c, list, c1064Yn);
        this.A00 = c1064Yn;
        this.A01 = jr2 == null ? new JR() : jr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03184c
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final UR A0C(ViewGroup viewGroup, int i) {
        return new UR(new MI(this.A00, this.A01));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, com.facebook.ads.internal.api.AdNativeComponentView, com.facebook.ads.redexgen.X.MI, java.lang.Object] */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03184c
    /* JADX INFO: renamed from: A0H */
    public final void A0D(UR ur2, int i) {
        super.A0D(ur2, i);
        ?? r22 = (MI) ur2.A0j();
        A0F(r22.getImageCardView(), i);
        if (((AbstractC1168b6) this).A01.get(i) != null) {
            r22.setTitle(((AbstractC1168b6) this).A01.get(i).getAdHeadline());
            r22.setSubtitle(((AbstractC1168b6) this).A01.get(i).getAdLinkDescription());
            r22.setButtonText(((AbstractC1168b6) this).A01.get(i).getAdCallToAction());
        }
        V2 v22 = ((AbstractC1168b6) this).A01.get(i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(r22);
        v22.A1O(r22, r22, arrayList);
    }
}
