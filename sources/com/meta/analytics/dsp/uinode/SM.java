package com.meta.analytics.dsp.uinode;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SM extends AbstractC03184c<SK> {
    public final int A00;
    public final C1064Yn A01;
    public final ViewOnClickListenerC0936Tl A02;
    public final List<String> A03;

    public SM(C1064Yn c1064Yn, List<String> screenshotUrls, int i, ViewOnClickListenerC0936Tl viewOnClickListenerC0936Tl) {
        this.A03 = screenshotUrls;
        this.A00 = i;
        this.A01 = c1064Yn;
        this.A02 = viewOnClickListenerC0936Tl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03184c
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final SK A0C(ViewGroup viewGroup, int i) {
        SL sl = new SL(this.A01);
        if (C0653Ih.A12(this.A01)) {
            sl.setOnClickListener(new Q6(this));
        }
        return new SK(sl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03184c
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void A0D(SK sk, int i) {
        String str = this.A03.get(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int leftMargin = this.A00;
        int i5 = leftMargin * 4;
        if (i == 0) {
            leftMargin = i5;
        }
        marginLayoutParams.setMargins(leftMargin, 0, i >= A0E() + (-1) ? this.A00 * 4 : this.A00, 0);
        sk.A0j().setLayoutParams(marginLayoutParams);
        sk.A0j().A00(str);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03184c
    public final int A0E() {
        return this.A03.size();
    }
}
