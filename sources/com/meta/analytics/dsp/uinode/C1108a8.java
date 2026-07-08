package com.meta.analytics.dsp.uinode;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1108a8 implements InterfaceC02732i {
    public final /* synthetic */ C1107a7 A00;

    public C1108a8(C1107a7 c1107a7) {
        this.A00 = c1107a7;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02732i
    public final void A5E(Canvas canvas, RectF rectF, float f3, Paint paint) {
        float f4 = f3 * 2.0f;
        float fWidth = (rectF.width() - f4) - 1.0f;
        float fHeight = (rectF.height() - f4) - 1.0f;
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        if (f3 >= 1.0f) {
            float f5 = f3 + 0.5f;
            this.A00.A00.set(-f5, -f5, f5, f5);
            int iSave = canvas2.save();
            canvas2.translate(rectF.left + f5, rectF.top + f5);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(fWidth, 0.0f);
            canvas2.rotate(90.0f);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(fHeight, 0.0f);
            canvas2.rotate(90.0f);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(fWidth, 0.0f);
            canvas2.rotate(90.0f);
            canvas2 = canvas2;
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.restoreToCount(iSave);
            float f7 = (rectF.left + f5) - 1.0f;
            float innerWidth = rectF.top;
            float innerHeight = (rectF.right - f5) + 1.0f;
            float roundedCornerRadius = rectF.top + f5;
            canvas2.drawRect(f7, innerWidth, innerHeight, roundedCornerRadius, paint2);
            float f8 = (rectF.left + f5) - 1.0f;
            float innerWidth2 = rectF.bottom - f5;
            float innerHeight2 = (rectF.right - f5) + 1.0f;
            float roundedCornerRadius2 = rectF.bottom;
            paint2 = paint2;
            canvas2.drawRect(f8, innerWidth2, innerHeight2, roundedCornerRadius2, paint2);
        }
        float f9 = rectF.left;
        float innerWidth3 = rectF.top + f3;
        float innerHeight3 = rectF.right;
        canvas2.drawRect(f9, innerWidth3, innerHeight3, rectF.bottom - f3, paint2);
    }
}
