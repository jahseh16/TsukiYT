package com.meta.analytics.dsp.uinode;

import android.content.res.Configuration;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class PQ extends RelativeLayout {
    public boolean A00;
    public final int A01;
    public final RD A02;
    public final boolean A03;
    public final boolean A04;
    public final AbstractC1167b5 A05;
    public final C1064Yn A06;
    public final J2 A07;
    public final C0723Lg A08;
    public final MC A09;
    public final InterfaceC0752Mj A0A;
    public final RE A0B;

    public abstract void A0z();

    public abstract void A10();

    public abstract void A11();

    public abstract void A12(boolean z);

    public abstract void A13(boolean z);

    public abstract boolean A14();

    public abstract boolean A15();

    public abstract C0823Pc getFullScreenAdStyle();

    public PQ(C1064Yn c1064Yn, InterfaceC0752Mj interfaceC0752Mj, J2 j22, AbstractC1167b5 abstractC1167b5, int i, boolean z, boolean z5, MC mc) {
        super(c1064Yn);
        this.A08 = new C0723Lg();
        this.A00 = false;
        TB tb = new TB(this);
        this.A02 = tb;
        this.A01 = i;
        this.A06 = c1064Yn;
        this.A04 = z;
        this.A03 = z5;
        this.A09 = mc;
        this.A0A = interfaceC0752Mj;
        this.A05 = abstractC1167b5;
        this.A07 = j22;
        RE re = new RE(this, 1, new WeakReference(tb), c1064Yn);
        this.A0B = re;
        re.A0W(abstractC1167b5.A0C());
        re.A0X(abstractC1167b5.A0D());
    }

    public final void A03() {
        if (!this.A00) {
            this.A0B.A0U();
            this.A00 = true;
        }
    }

    public AbstractC1167b5 getAdDataBundle() {
        return this.A05;
    }

    public RE getAdViewabilityChecker() {
        return this.A0B;
    }

    public C0723Lg getTouchDataRecorder() {
        return this.A08;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
