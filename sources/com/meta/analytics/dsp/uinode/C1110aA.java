package com.meta.analytics.dsp.uinode;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1110aA implements InterfaceC02732i {
    public final /* synthetic */ F6 A00;

    public C1110aA(F6 f62) {
        this.A00 = f62;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02732i
    public final void A5E(Canvas canvas, RectF rectF, float f3, Paint paint) {
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }
}
