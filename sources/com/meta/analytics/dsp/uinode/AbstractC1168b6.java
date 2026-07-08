package com.meta.analytics.dsp.uinode;

import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1168b6 extends AbstractC03184c<UR> {
    public static final int A05 = (int) (LD.A02 * 4.0f);
    public C1B A00;
    public final List<V2> A01;
    public final int A02;
    public final C1064Yn A03;
    public final RD A04 = new C1170b8(this);

    public AbstractC1168b6(C3C c3c, List<V2> list, C1064Yn c1064Yn) {
        this.A03 = c1064Yn;
        this.A02 = c3c.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A02(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i5 = this.A02;
        if (i == 0) {
            i5 *= 2;
        }
        marginLayoutParams.setMargins(i5, 0, i >= this.A01.size() + (-1) ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03184c
    public final int A0E() {
        return this.A01.size();
    }

    public final void A0F(ImageView imageView, int i) {
        V2 v22 = this.A01.get(i);
        JP adCoverImage = v22.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC0941Tq asyncTaskC0941TqA04 = new AsyncTaskC0941Tq(imageView, this.A03).A04();
            asyncTaskC0941TqA04.A06(new C1169b7(this, i, v22));
            asyncTaskC0941TqA04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0G(C1B c1b) {
        this.A00 = c1b;
    }

    public void A0H(UR ur2, int i) {
        ur2.A0j().setLayoutParams(A02(i));
    }
}
