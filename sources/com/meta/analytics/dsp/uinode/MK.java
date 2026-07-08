package com.meta.analytics.dsp.uinode;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MK extends View {
    public int A00;
    public Paint A01;
    public Paint A02;
    public Paint A03;
    public boolean A04;

    public MK(C1064Yn c1064Yn) {
        this(c1064Yn, 60, true);
    }

    public MK(C1064Yn c1064Yn, int i, boolean z) {
        super(c1064Yn);
        this.A00 = i;
        this.A04 = z;
        if (z) {
            Paint paint = new Paint();
            this.A02 = paint;
            paint.setColor(-3355444);
            this.A02.setStyle(Paint.Style.STROKE);
            this.A02.setStrokeWidth(3.0f);
            this.A02.setAntiAlias(true);
            Paint paint2 = new Paint();
            this.A01 = paint2;
            paint2.setColor(-1287371708);
            this.A01.setStyle(Paint.Style.FILL);
            this.A01.setAntiAlias(true);
            Paint paint3 = new Paint();
            this.A03 = paint3;
            paint3.setColor(-1);
            this.A03.setStyle(Paint.Style.STROKE);
            this.A03.setStrokeWidth(6.0f);
            this.A03.setAntiAlias(true);
        }
    }

    public RelativeLayout.LayoutParams getDefaultLayoutParams() {
        float f3 = LD.A02;
        int i = this.A00;
        float density = i;
        int i5 = (int) (density * f3);
        float density2 = i;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i5, (int) (density2 * f3));
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        return layoutParams;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A04) {
            if (canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT < 17) {
                setLayerType(1, null);
            }
            int iMin = Math.min(canvas.getWidth(), canvas.getHeight());
            int i = iMin / 2;
            int i5 = iMin / 2;
            int edgeLength = i * 2;
            int i8 = edgeLength / 3;
            canvas.drawCircle(i, i5, i8, this.A02);
            int edgeLength2 = i8 - 2;
            canvas.drawCircle(i, i5, edgeLength2, this.A01);
            int centerY = iMin / 3;
            int centerX = iMin / 3;
            int edgeLength3 = centerY * 2;
            float f3 = edgeLength3;
            int edgeLength4 = centerX * 2;
            canvas.drawLine(centerY, centerX, f3, edgeLength4, this.A03);
            int edgeLength5 = centerY * 2;
            int edgeLength6 = centerX * 2;
            canvas.drawLine(edgeLength5, centerX, centerY, edgeLength6, this.A03);
        }
        super.onDraw(canvas);
    }
}
