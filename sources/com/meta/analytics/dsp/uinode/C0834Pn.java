package com.meta.analytics.dsp.uinode;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0834Pn extends RelativeLayout {
    public final Paint A00;
    public final RectF A01;

    public C0834Pn(C1064Yn c1064Yn, String str) {
        super(c1064Yn);
        float f3 = c1064Yn.getResources().getDisplayMetrics().density;
        TextView textView = new TextView(c1064Yn);
        textView.setTextColor(-16777216);
        textView.setTextSize(16.0f);
        textView.setText(str);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        setGravity(17);
        float density = 6.0f * f3;
        int i = (int) density;
        textView.setPadding(i, i, i, i);
        addView(textView);
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.A01 = new RectF();
        AbstractC0731Lo.A0M(this, 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f3 = getContext().getResources().getDisplayMetrics().density;
        this.A01.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(this.A01, f3 * 10.0f, 10.0f * f3, this.A00);
        super.onDraw(canvas);
    }
}
