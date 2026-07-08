package com.meta.analytics.dsp.uinode;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0927Tc extends OL implements OE {
    public static byte[] A05;
    public static final int A06;
    public final AbstractC1167b5 A00;
    public final MC A01;
    public final OG A02;
    public final C0807Om A03;
    public final C0835Po A04;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{52, 48, 60, 58, 56};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public C0927Tc(OP op, boolean z) {
        int id;
        int iA01;
        super(op, z);
        this.A01 = op.A09();
        AbstractC1167b5 abstractC1167b5A04 = op.A04();
        this.A00 = abstractC1167b5A04;
        C0807Om c0807Om = new C0807Om(op.A05(), op.A02());
        this.A03 = c0807Om;
        c0807Om.A01(getTitleDescContainer(), z);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(OL.A07, OL.A07, OL.A07, OL.A07);
        getCtaButton().setLayoutParams(layoutParams);
        if (op.A0C()) {
            C0835Po c0835Po = new C0835Po(op.A05());
            this.A04 = c0835Po;
            c0835Po.setPageDetails(op.A04().A10());
            AbstractC0731Lo.A0G(1007, c0835Po);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(2, getCtaButton().getId());
            layoutParams2.setMargins(OL.A07, OL.A07 - (OL.A07 / 2), OL.A07, 0);
            c0835Po.setLayoutParams(layoutParams2);
            id = c0835Po.getId();
            iA01 = op.A01() - (OL.A07 / 2);
        } else {
            id = getCtaButton().getId();
            iA01 = op.A01();
            this.A04 = null;
        }
        FrameLayout frameLayout = new FrameLayout(op.A05());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(10);
        layoutParams3.addRule(2, id);
        layoutParams3.setMargins(0, iA01, 0, 0);
        frameLayout.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 17;
        layoutParams4.setMargins(OL.A07, 0, OL.A07, 0);
        frameLayout.addView(c0807Om, layoutParams4);
        addView(frameLayout);
        View view = this.A04;
        if (view != null) {
            addView(view);
        }
        addView(getCtaButton());
        getCtaButton().A0A(op.A04(), op.A08());
        View viewA02 = op.A02();
        OG ogA01 = OG.A01(op.A05(), abstractC1167b5A04, this);
        this.A02 = ogA01;
        OF ofA09 = ogA01.A09(abstractC1167b5A04);
        op.A05().A0F().A00(ofA09.A01);
        if (viewA02 != null && ofA09.A00) {
            getCtaButton().setCreativeAsCtaLoggingHelper(ogA01);
            viewA02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.OV
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.A00.A13(view2);
                }
            });
        } else if (viewA02 != null && C0653Ih.A16(getAdContextWrapper())) {
            AbstractC0780Nl.A00(viewA02, C0653Ih.A17(getAdContextWrapper()), new OW(this));
        }
        if (C0653Ih.A0y(op.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (op.A08() != null) {
                op.A08().setCTAClickListener(getCtaButton());
            }
        }
        if (this.A04 != null && C0653Ih.A0z(op.A05())) {
            this.A04.setOnClickListener(getCtaButton());
        }
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final boolean A02() {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final boolean A0D() {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final void A0v() {
        super.A0v();
        this.A02.A0A();
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final void A10(C1G c1g, String str, double d4, Bundle bundle) {
        super.A10(c1g, str, d4, bundle);
        if (d4 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            int mediaHeight = (int) (((double) (A06 - (OL.A07 * 2))) / d4);
            this.A03.A00(mediaHeight);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final boolean A11() {
        return false;
    }

    public final /* synthetic */ void A13(View view) {
        getCtaButton().A09(A00(0, 5, 75));
    }

    @Override // com.meta.analytics.dsp.uinode.OE
    public final void AC9() {
        this.A01.A43(this.A00.A0L());
    }
}
