package com.meta.analytics.dsp.uinode;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0788Nt extends View {
    public static byte[] A09;
    public static String[] A0A = {"Nbc6Jmo5XxwoSf0WsC4pNUwvbxxmeuzU", "Es2t6BS2", "WUgCzt6qD3CB9cjx4HsVq0Jqaz41VBuo", "hkZRo5NTzxOFCAK6tj2hPIlun6a", "TTjuir0T4YhatH37Odlm7BF", "mNho4RFDELoa", "9llBB27OMv3OwRnb05oM", "XnRgJ28VorNH"};
    public static final int A0B;
    public float A00;
    public ObjectAnimator A01;
    public Bitmap A02;
    public final float A03;
    public final Paint A04;
    public final Paint A05;
    public final Paint A06;
    public final RectF A07;
    public final RectF A08;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{0, 2, 31, 23, 2, 21, 3, 3};
    }

    static {
        A01();
        A0B = (int) (LD.A02 * 5.0f);
    }

    public C0788Nt(C1064Yn c1064Yn) {
        super(c1064Yn);
        float f3 = Resources.getSystem().getDisplayMetrics().density * 3.0f;
        this.A03 = f3;
        this.A00 = 0.0f;
        this.A01 = null;
        this.A07 = new RectF();
        this.A08 = new RectF();
        Paint paint = new Paint(1);
        this.A04 = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f3);
        Paint paint2 = new Paint(1);
        this.A05 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(f3);
        this.A06 = new Paint(1);
    }

    public final void A02(int i, int i5, int i8) {
        this.A04.setColor(i);
        this.A05.setColor(i5);
        this.A06.setColorFilter(new PorterDuffColorFilter(AbstractC02802p.A01(i5, i8), PorterDuff.Mode.SRC_ATOP));
    }

    @Override // android.view.View
    public final void clearAnimation() {
        ObjectAnimator objectAnimator = this.A01;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            if (A0A[4].length() == 15) {
                throw new RuntimeException();
            }
            A0A[0] = "vMfsJaJNlQJ6eTU2cMKDLU2YSzRmfzEH";
            this.A01 = null;
        }
    }

    public float getProgress() {
        return this.A00;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.A07, 0.0f, 360.0f, false, this.A04);
        canvas.drawArc(this.A07, -90.0f, ((100.0f - this.A00) * 360.0f) / 100.0f, false, this.A05);
        Bitmap bitmap = this.A02;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, new Rect(0, 0, this.A02.getWidth(), this.A02.getHeight()), this.A08, this.A06);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        int iMin = Math.min(getDefaultSize(getSuggestedMinimumHeight(), i5), getDefaultSize(getSuggestedMinimumWidth(), i));
        setMeasuredDimension(iMin, iMin);
        RectF rectF = this.A07;
        float f3 = (this.A03 / 2.0f) + 0.0f;
        int min = getPaddingLeft();
        float f4 = f3 + min;
        float f5 = (this.A03 / 2.0f) + 0.0f;
        int min2 = getPaddingTop();
        float f7 = f5 + min2;
        float f8 = iMin - (this.A03 / 2.0f);
        int min3 = getPaddingRight();
        float f9 = f8 - min3;
        float f10 = iMin - (this.A03 / 2.0f);
        int min4 = getPaddingBottom();
        rectF.set(f4, f7, f9, f10 - min4);
        RectF rectF2 = this.A08;
        float f11 = this.A07.left;
        int i8 = A0B;
        rectF2.set(f11 + i8, this.A07.top + i8, this.A07.right - i8, this.A07.bottom - i8);
    }

    public void setImage(EnumC0739Lw enumC0739Lw) {
        this.A02 = enumC0739Lw == null ? null : AbstractC0740Lx.A01(enumC0739Lw);
        invalidate();
    }

    public void setProgress(float f3) {
        this.A00 = Math.min(f3, 100.0f);
        postInvalidate();
    }

    public void setProgressWithAnimation(float f3) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, A00(0, 8, 32), f3);
        this.A01 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(400L);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.start();
    }
}
