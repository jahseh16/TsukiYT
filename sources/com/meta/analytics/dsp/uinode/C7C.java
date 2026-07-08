package com.meta.analytics.dsp.uinode;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7C, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7C extends QQ {
    public final Paint A00;
    public final C1064Yn A01;
    public final JA A02;
    public final AbstractC0841Pu A03;
    public final AbstractC0808On A04;
    public final O7 A05;
    public final C0854Qh A06;

    public C7C(C1064Yn c1064Yn, boolean z, JA ja) {
        super(c1064Yn);
        this.A04 = new AbstractC0808On() { // from class: com.facebook.ads.redexgen.X.7F
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass98 anonymousClass98) {
                this.A00.A06.setChecked(true);
            }
        };
        this.A05 = new O7() { // from class: com.facebook.ads.redexgen.X.7E
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(O8 o8) {
                this.A00.A06.setChecked(false);
            }
        };
        this.A03 = new AbstractC0841Pu() { // from class: com.facebook.ads.redexgen.X.7D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9H c9h) {
                this.A00.A06.setChecked(true);
            }
        };
        this.A02 = ja;
        this.A01 = c1064Yn;
        C0854Qh c0854Qh = new C0854Qh(c1064Yn, z);
        this.A06 = c0854Qh;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (((double) displayMetrics.density) * 23.76d), (int) (((double) displayMetrics.density) * 23.76d));
        layoutParams.addRule(13);
        c0854Qh.setLayoutParams(layoutParams);
        c0854Qh.setChecked(true);
        c0854Qh.setClickable(false);
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setStyle(Paint.Style.FILL);
        if (z) {
            paint.setColor(-1728053248);
        } else {
            paint.setColor(-1);
            paint.setAlpha(204);
        }
        AbstractC0731Lo.A0M(this, 0);
        addView(c0854Qh);
        setGravity(17);
        RelativeLayout.LayoutParams layout = new RelativeLayout.LayoutParams((int) (((double) displayMetrics.density) * 72.0d), (int) (((double) displayMetrics.density) * 72.0d));
        layout.addRule(13);
        setLayoutParams(layout);
        AbstractC0731Lo.A0G(1004, this);
    }

    @Override // com.meta.analytics.dsp.uinode.QQ
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A04, this.A05, this.A03);
        }
        View.OnClickListener clickListener = new ViewOnClickListenerC0851Qe(this);
        setOnClickListener(clickListener);
    }

    @Override // com.meta.analytics.dsp.uinode.QQ
    public final void A08() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A03, this.A05, this.A04);
        }
        super.A08();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = getHeight();
        int width2 = getPaddingTop();
        int i = height - width2;
        int width3 = getPaddingBottom();
        int height2 = i - width3;
        int width4 = Math.min(width, height2);
        int centerY = width4 / 2;
        int height3 = width4 / 2;
        int width5 = getPaddingLeft();
        float f3 = width5 + centerY;
        int width6 = getPaddingTop();
        canvas.drawCircle(f3, width6 + height3, centerY, this.A00);
        super.onDraw(canvas);
    }
}
