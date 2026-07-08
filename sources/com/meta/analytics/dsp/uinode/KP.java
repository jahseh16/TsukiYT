package com.meta.analytics.dsp.uinode;

import android.R;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KP extends RelativeLayout implements QN {
    public static byte[] A08;
    public static final int A09;
    public int A00;
    public ObjectAnimator A01;
    public ProgressBar A02;
    public AbstractC04268s A03;
    public AbstractC04268s A04;
    public AbstractC04268s A05;
    public AbstractC04268s A06;
    public SA A07;

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 20);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{-71, -69, -72, -80, -69, -82, -68, -68};
    }

    static {
        A03();
        A09 = (int) (LD.A02 * 6.0f);
    }

    public KP(C1064Yn c1064Yn) {
        this(c1064Yn, A09, -12549889, 0);
    }

    public KP(C1064Yn c1064Yn, int i, int i5, int i8) {
        super(c1064Yn);
        this.A00 = -1;
        this.A06 = new NQ() { // from class: com.facebook.ads.redexgen.X.7B
            public static String[] A01 = {"5cZwmFwOCvoIimHKJKs7c8Wrfuwl5", "kR6Rx7ETQGlVhfpD5OxJcFg21Ovz094i", "oaAjYFLN3m9AYmyloxlSIBJp6ETHW3KF", "dCQrNLE74jmKWuOaqJJ4Sbhiwuuv5ad", "onBgfHhqxGhqxLvpU2wfKqg3mDsyExyq", "SCROov7hAW1gh5oss5LLtyUv0yBfa", "SAPoZVZ00ZwZwmL71sxtzrpJli3hIy2X", "TEn6j3AzMnGgqeyMrOghHZKrMbMLSMuC"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass93 anonymousClass93) {
                if (this.A00.A07 != null) {
                    KP kp2 = this.A00;
                    String[] strArr = A01;
                    if (strArr[2].charAt(14) == strArr[4].charAt(14)) {
                        throw new RuntimeException();
                    }
                    A01[1] = "B8raFzKF2tgWcMrESvgtBPeFcOBIsHL1";
                    kp2.A07(true);
                }
            }
        };
        this.A04 = new AbstractC0808On() { // from class: com.facebook.ads.redexgen.X.7A
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass98 anonymousClass98) {
                this.A00.A02();
            }
        };
        this.A05 = new O7() { // from class: com.facebook.ads.redexgen.X.79
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(O8 o8) {
                if (this.A00.A07 != null) {
                    this.A00.A07(true);
                }
            }
        };
        this.A03 = new AbstractC0841Pu() { // from class: com.facebook.ads.redexgen.X.78
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9H c9h) {
                if (this.A00.A07 != null) {
                    this.A00.A05();
                }
            }
        };
        this.A02 = new ProgressBar(c1064Yn, null, R.attr.progressBarStyleHorizontal);
        A06(i5, i8);
        this.A02.setMax(10000);
        addView(this.A02, new RelativeLayout.LayoutParams(-1, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        ObjectAnimator objectAnimator = this.A01;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.A01.setTarget(null);
            this.A01 = null;
            this.A02.clearAnimation();
        }
    }

    public final void A05() {
        A02();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), 0, 0);
        this.A01 = objectAnimatorOfInt;
        objectAnimatorOfInt.setDuration(0L);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.start();
        this.A00 = -1;
    }

    public final void A06(int i, int i5) {
        ColorDrawable colorDrawable = new ColorDrawable(i5);
        ColorDrawable colorDrawable2 = new ColorDrawable(i5);
        Drawable secProgressDr = new ScaleDrawable(new ColorDrawable(i), 8388611, 1.0f, -1.0f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{colorDrawable, colorDrawable2, secProgressDr});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        this.A02.setProgressDrawable(layerDrawable);
    }

    public final void A07(boolean z) {
        if (this.A07 == null) {
            return;
        }
        A02();
        int currentPositionInMillis = this.A07.getCurrentPositionInMillis();
        int duration = this.A07.getDuration();
        int i = duration > 0 ? (currentPositionInMillis * 10000) / duration : 0;
        int i5 = this.A00;
        if (i5 >= i || duration <= currentPositionInMillis) {
            return;
        }
        if (z) {
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), i5, i);
            this.A01 = objectAnimatorOfInt;
            int position = Math.min(250, duration - currentPositionInMillis);
            objectAnimatorOfInt.setDuration(position);
            this.A01.setInterpolator(new LinearInterpolator());
            this.A01.start();
        } else {
            this.A02.setProgress(i);
        }
        this.A00 = i;
    }

    @Override // com.meta.analytics.dsp.uinode.QN
    public final void A9R(SA sa) {
        this.A07 = sa;
        sa.getEventBus().A03(this.A04, this.A05, this.A06, this.A03);
    }

    @Override // com.meta.analytics.dsp.uinode.QN
    public final void AGl(SA sa) {
        sa.getEventBus().A04(this.A06, this.A05, this.A04, this.A03);
        this.A07 = null;
    }
}
