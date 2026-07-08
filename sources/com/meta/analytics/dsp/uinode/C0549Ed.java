package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0549Ed extends C1089Zn {
    public final /* synthetic */ C0548Ec A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0549Ed(C0548Ec c0548Ec, Context context) {
        super(context);
        this.A00 = c0548Ec;
    }

    @Override // com.meta.analytics.dsp.uinode.C1089Zn, com.meta.analytics.dsp.uinode.AnonymousClass51
    public final void A0I(View view, AnonymousClass53 anonymousClass53, C03404z c03404z) {
        C0548Ec c0548Ec = this.A00;
        int[] iArrA0H = c0548Ec.A0H(((ZY) c0548Ec).A00.getLayoutManager(), view);
        int time = iArrA0H[0];
        int dy = iArrA0H[1];
        int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
        if (dx > 0) {
            c03404z.A04(time, dy, dx, ((C1089Zn) this).A04);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C1089Zn
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.meta.analytics.dsp.uinode.C1089Zn
    public final int A0L(int i) {
        return Math.min(100, super.A0L(i));
    }
}
