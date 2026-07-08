package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ox, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0818Ox {
    public static B4 A00(final OP op, int i, final String str, final C0900Sb c0900Sb) {
        if (i == 1) {
            return new B4(op, str, c0900Sb) { // from class: com.facebook.ads.redexgen.X.3Q
                public static final int A00 = (int) (LD.A02 * 20.0f);
                public static final int A01 = (int) (LD.A02 * 16.0f);

                @Override // com.meta.analytics.dsp.uinode.OL
                public final boolean A01() {
                    return false;
                }

                @Override // com.meta.analytics.dsp.uinode.B4
                public final void A19(C1064Yn c1064Yn) {
                    O9 titleDescContainer = getTitleDescContainer();
                    titleDescContainer.setAlignment(3);
                    titleDescContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    titleDescContainer.setPadding(0, 0, 0, A00);
                    getCtaButton().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    LinearLayout linearLayout = new LinearLayout(c1064Yn);
                    AbstractC0731Lo.A0S(linearLayout, new ColorDrawable(-1));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(3, getMediaContainer().getId());
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setOrientation(1);
                    int i5 = A01;
                    linearLayout.setPadding(i5, i5, i5, i5);
                    linearLayout.addView(titleDescContainer);
                    linearLayout.addView(getCtaButton());
                    addView(getMediaContainer());
                    addView(linearLayout);
                }
            };
        }
        return new B4(op, str, c0900Sb) { // from class: com.facebook.ads.redexgen.X.3b
            public static final int A00 = (int) (LD.A02 * 12.0f);

            @Override // com.meta.analytics.dsp.uinode.OL
            public final boolean A00() {
                return false;
            }

            @Override // com.meta.analytics.dsp.uinode.B4, com.meta.analytics.dsp.uinode.OL
            public final boolean A0D() {
                return false;
            }

            @Override // com.meta.analytics.dsp.uinode.B4
            public final void A19(C1064Yn c1064Yn) {
                O9 titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                RelativeLayout.LayoutParams adTitleAndDescriptionLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                adTitleAndDescriptionLayoutParams.addRule(8, getMediaContainer().getId());
                titleDescContainer.setLayoutParams(adTitleAndDescriptionLayoutParams);
                int i5 = A00;
                titleDescContainer.setPadding(i5, i5, i5, i5);
                AbstractC0731Lo.A0R(titleDescContainer, getAdContextWrapper());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(3, getMediaContainer().getId());
                getCtaButton().setLayoutParams(layoutParams);
                addView(getMediaContainer());
                addView(titleDescContainer);
                addView(getCtaButton());
            }
        };
    }
}
