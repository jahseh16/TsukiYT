package com.meta.analytics.dsp.uinode;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0491Bh extends C1089Zn {
    public final /* synthetic */ C0490Bg A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.C1089Zn
    public final int A0O(View view, int i) {
        AbstractC03304o abstractC03304oA08 = A08();
        if (!abstractC03304oA08.A20()) {
            return 0;
        }
        C03314p c03314p = (C03314p) view.getLayoutParams();
        return A0N(abstractC03304oA08.A0k(view) - c03314p.leftMargin, abstractC03304oA08.A0n(view) + c03314p.rightMargin, abstractC03304oA08.A0e(), abstractC03304oA08.A0h() - abstractC03304oA08.A0f(), i) + this.A00.A02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0491Bh(C0490Bg c0490Bg, C1064Yn c1064Yn) {
        super(c1064Yn);
        this.A00 = c0490Bg;
    }

    @Override // com.meta.analytics.dsp.uinode.C1089Zn
    public final float A0J(DisplayMetrics displayMetrics) {
        return this.A00.A00 / displayMetrics.densityDpi;
    }

    @Override // com.meta.analytics.dsp.uinode.C1089Zn
    public final int A0K() {
        return -1;
    }

    @Override // com.meta.analytics.dsp.uinode.C1089Zn
    public final PointF A0P(int i) {
        return this.A00.A4O(i);
    }
}
