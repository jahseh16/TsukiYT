package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.RewardData;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class O1 extends FrameLayout {
    public static String[] A07 = {"Lu0oG19N", "JNY", "Ev6F9eDhg42RHlCeRuJfEtiFO07AluFn", "qSbaO4FE34QcNqD1YWxCxyT8wr5s9kWw", "hZddA1hSD7Y", "v9TnLSaOxYneacolptRVdRHaZQ0ab06L", "iyW9tyIIQvF7WQz3LOxNHXxa074IcWbN", "vzh"};
    public MB A00;
    public final AbstractC1167b5 A01;
    public final C1064Yn A02;
    public final MC A03;
    public final O0 A04;
    public final SA A05;
    public final View[] A06;

    public O1(OP op, AbstractC1167b5 abstractC1167b5, SA sa, KP kp2, AbstractC0783No abstractC0783No, MC mc, O0 o02) {
        this(op, abstractC1167b5, sa, mc, o02, kp2, abstractC0783No);
    }

    public O1(OP op, AbstractC1167b5 abstractC1167b5, SA sa, MC mc, O0 o02, View... viewArr) {
        this(op.A05(), op.A08(), abstractC1167b5, sa, mc, o02, viewArr);
    }

    public O1(C1064Yn c1064Yn, MB mb2, AbstractC1167b5 abstractC1167b5, SA sa, MC mc, O0 o02, View... viewArr) {
        super(c1064Yn);
        this.A02 = c1064Yn;
        this.A00 = mb2;
        this.A01 = abstractC1167b5;
        this.A06 = viewArr;
        this.A03 = mc;
        this.A05 = sa;
        this.A04 = o02;
        A03();
    }

    private void A03() {
        String title;
        RewardData rewardDataA0J = this.A01.A0J();
        if (rewardDataA0J == null) {
            title = this.A01.A0z().A05();
        } else {
            title = this.A01.A0z().A06(rewardDataA0J.getCurrency(), rewardDataA0J.getQuantity());
        }
        MQ mq = new MQ(this.A02, -1, -16777216, title, null, this.A01.A0z().A04(), this.A01.A0z().A03(), AbstractC0740Lx.A01(EnumC0739Lw.REWARD_ICON));
        mq.A02.setOnClickListener(new ViewOnClickListenerC0793Ny(this));
        mq.A01.setOnClickListener(new ViewOnClickListenerC0794Nz(this));
        addView(mq, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        SA sa = this.A05;
        if (sa != null) {
            sa.A0a(QH.A07);
        }
        this.A04.AAh();
        if (!this.A01.A0x().A0O()) {
            this.A01.A15(this.A03);
        }
    }

    public final void A07(ViewGroup viewGroup) {
        SA sa = this.A05;
        if (sa != null && !sa.A0j()) {
            this.A05.A0f(false, false, 11);
            AbstractC0731Lo.A0N(this.A05, 4);
        }
        MB mb2 = this.A00;
        String[] strArr = A07;
        if (strArr[7].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A07[0] = "vGH3jzSu";
        if (mb2 != null) {
            AbstractC0731Lo.A0H(mb2);
        }
        for (View view : this.A06) {
            view.clearAnimation();
            AbstractC0731Lo.A0N(view, 4);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        viewGroup.addView(this, layoutParams);
        this.A04.ACC();
    }
}
