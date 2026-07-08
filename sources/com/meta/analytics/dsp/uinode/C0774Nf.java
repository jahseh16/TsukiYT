package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0774Nf extends FrameLayout {
    public int A00;
    public int A01;
    public final ImageView A02;
    public final ImageView A03;

    public C0774Nf(C1064Yn c1064Yn) {
        super(c1064Yn);
        this.A03 = new ImageView(c1064Yn);
        this.A02 = new ImageView(c1064Yn);
        A00();
    }

    public C0774Nf(C1064Yn c1064Yn, AttributeSet attributeSet) {
        super(c1064Yn, attributeSet);
        this.A03 = new ImageView(c1064Yn, attributeSet);
        this.A02 = new ImageView(c1064Yn, attributeSet);
        A00();
    }

    public C0774Nf(C1064Yn c1064Yn, AttributeSet attributeSet, int i) {
        super(c1064Yn, attributeSet, i);
        this.A03 = new ImageView(c1064Yn, attributeSet, i);
        this.A02 = new ImageView(c1064Yn, attributeSet, i);
        A00();
    }

    public C0774Nf(C1064Yn c1064Yn, AttributeSet attributeSet, int i, int i5) {
        super(c1064Yn, attributeSet, i, i5);
        this.A03 = new ImageView(c1064Yn, attributeSet, i, i5);
        this.A02 = new ImageView(c1064Yn, attributeSet, i, i5);
        A00();
    }

    private void A00() {
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
        addView(this.A03, new FrameLayout.LayoutParams(-2, -2));
        LI.A04(this.A03, LI.A0A);
        setId(AbstractC0731Lo.A00());
    }

    public ImageView getBodyImageView() {
        return this.A03;
    }

    public int getImageHeight() {
        return this.A00;
    }

    public int getImageWidth() {
        return this.A01;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i5, int i8, int i10) {
        int i11;
        int i12 = this.A01;
        if (i12 <= 0 || (i11 = this.A00) <= 0) {
            super.onLayout(z, i, i5, i8, i10);
            return;
        }
        int i13 = i8 - i;
        int i14 = i10 - i5;
        float fMin = Math.min(i13 / i12, i14 / i11);
        int i15 = (int) (this.A01 * fMin);
        int blurBorderViewWidth = (int) (this.A00 * fMin);
        this.A02.layout(i, i5, i8, i10);
        int expectedImageWidth = (i13 / 2) + i;
        int i16 = (i14 / 2) + i5;
        this.A03.layout(expectedImageWidth - (i15 / 2), i16 - (blurBorderViewWidth / 2), (i15 / 2) + expectedImageWidth, i16 + (blurBorderViewWidth / 2));
        this.A02.setVisibility(0);
    }

    public void setImage(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 != null) {
            AbstractC0731Lo.A0S(this.A02, new BitmapDrawable(getContext().getResources(), bitmap2));
        } else {
            AbstractC0731Lo.A0M(this.A02, 0);
        }
        if (bitmap != null) {
            this.A01 = bitmap.getWidth();
            this.A00 = bitmap.getHeight();
            this.A03.setImageBitmap(Bitmap.createBitmap(bitmap));
            return;
        }
        this.A03.setImageDrawable(null);
    }
}
