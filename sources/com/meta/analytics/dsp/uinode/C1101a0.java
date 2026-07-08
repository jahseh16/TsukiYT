package com.meta.analytics.dsp.uinode;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1101a0 implements C3D {
    public final Rect A00 = new Rect();
    public final /* synthetic */ C02983h A01;

    public C1101a0(C02983h c02983h) {
        this.A01 = c02983h;
    }

    @Override // com.meta.analytics.dsp.uinode.C3D
    public final C03013k AAk(View view, C03013k c03013k) {
        C03013k c03013kA06 = C3T.A06(view, c03013k);
        if (c03013kA06.A07()) {
            return c03013kA06;
        }
        Rect rect = this.A00;
        rect.left = c03013kA06.A03();
        rect.top = c03013kA06.A05();
        rect.right = c03013kA06.A04();
        rect.bottom = c03013kA06.A02();
        int i = this.A01.getChildCount();
        for (int count = 0; count < i; count++) {
            C03013k c03013kA05 = C3T.A05(this.A01.getChildAt(count), c03013kA06);
            rect.left = Math.min(c03013kA05.A03(), rect.left);
            rect.top = Math.min(c03013kA05.A05(), rect.top);
            rect.right = Math.min(c03013kA05.A04(), rect.right);
            rect.bottom = Math.min(c03013kA05.A02(), rect.bottom);
        }
        int count2 = rect.left;
        C03013k applied = c03013kA06.A06(count2, rect.top, rect.right, rect.bottom);
        return applied;
    }
}
