package com.meta.analytics.dsp.uinode;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0838Pr extends FrameLayout {
    public static final int A08 = (int) (LD.A02 * 16.0f);
    public BZ A00;
    public SF A01;
    public C9I A02;
    public C0713Kw A03;
    public C7R A04;
    public C7C A05;
    public final C1064Yn A06;
    public final JA A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A04(J2 j22, String str, Map<String, String> map) {
        A02();
        this.A02 = new C9I(this.A06, j22, this.A00, str, map);
        if (C0653Ih.A1X(this.A06)) {
            this.A01 = new SF(this.A06, j22, this.A00, str, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public C0838Pr(C1064Yn c1064Yn, JA ja) {
        super(c1064Yn);
        this.A07 = ja;
        this.A06 = c1064Yn;
        setUpView(c1064Yn);
    }

    public final void A01() {
        this.A00.A0e(true, 10);
    }

    public final void A02() {
        SF sf = this.A01;
        if (sf != null) {
            sf.A0C();
            this.A01 = null;
        }
        C9I c9i = this.A02;
        if (c9i != null) {
            c9i.A0i();
            this.A02 = null;
        }
    }

    public final void A03(AbstractC04268s abstractC04268s) {
        this.A00.getEventBus().A05(abstractC04268s);
    }

    public final void A05(QM qm) {
        this.A00.A0b(qm, 13);
    }

    public final boolean A06() {
        return this.A00.A0k();
    }

    public SA getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return this.A00.getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C1064Yn c1064Yn) {
        this.A00.A0X();
        C7R c7r = new C7R(c1064Yn);
        this.A04 = c7r;
        this.A00.A0c(c7r);
        this.A03 = new C0713Kw(c1064Yn, this.A07);
        this.A00.A0c(new AnonymousClass86(c1064Yn));
        this.A00.A0c(this.A03);
        C7C c7c = new C7C(c1064Yn, true, this.A07);
        this.A05 = c7c;
        this.A00.A0c(c7c);
        this.A00.A0c(new L7(this.A05, QZ.A03, true, true));
        if (!this.A00.A0g()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i = A08;
        layoutParams.setMargins(i, i, i, i);
        this.A03.setLayoutParams(layoutParams);
        this.A00.addView(this.A03);
    }

    private void setUpVideo(C1064Yn c1064Yn) {
        BZ bz = new BZ(c1064Yn);
        this.A00 = bz;
        bz.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        AbstractC0731Lo.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC0837Pq(this));
    }

    private void setUpView(C1064Yn c1064Yn) {
        setUpVideo(c1064Yn);
        setUpPlugins(c1064Yn);
    }

    public void setVideoURI(String str) {
        this.A00.setVideoURI(str);
    }

    public void setVolume(float f3) {
        this.A00.setVolume(f3);
        this.A03.A09();
    }
}
