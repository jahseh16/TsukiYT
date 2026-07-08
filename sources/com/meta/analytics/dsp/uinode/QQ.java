package com.meta.analytics.dsp.uinode;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class QQ extends RelativeLayout implements QN {
    public SA A00;

    public QQ(C1064Yn c1064Yn) {
        super(c1064Yn);
    }

    public QQ(C1064Yn c1064Yn, AttributeSet attributeSet, int i) {
        super(c1064Yn, attributeSet, i);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.meta.analytics.dsp.uinode.QN
    public final void A9R(SA sa) {
        this.A00 = sa;
        A07();
    }

    @Override // com.meta.analytics.dsp.uinode.QN
    public final void AGl(SA sa) {
        A08();
        this.A00 = null;
    }

    public SA getVideoView() {
        return this.A00;
    }
}
