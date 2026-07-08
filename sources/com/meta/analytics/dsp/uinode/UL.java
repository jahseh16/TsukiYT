package com.meta.analytics.dsp.uinode;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class UL extends RelativeLayout implements MD {
    public static byte[] A0F;
    public static String[] A0G = {"fqT9snXDZkE2N6bIU2twhbCcrvrF5wQR", "W8MK3buqarkLhDixdfnbfGeXuw3i87xB", "M5iWaw3OwwKxChS5bTa9KUrj63pwu1Od", "QKu8TlGQ3D7NsDDaY", "OUnrWL6BanKvWJF", "644mHU9zQQHAcSiNB", "MqQzuM0GD0HqxOL2854PPJvoiao7nama", "mSpdOD621tCilusEUOf234Jx9LR3KzyX"};
    public View A00;
    public L9 A01;
    public C0827Pg A02;
    public boolean A03;
    public boolean A04;
    public C1C A05;
    public Q7 A06;
    public boolean A07;
    public final ViewOnSystemUiVisibilityChangeListenerC0718Lb A08;
    public final MC A09;
    public final AbstractC1167b5 A0A;
    public final C1064Yn A0B;
    public final J2 A0C;
    public final JA A0D;
    public final MB A0E;

    public static String A0L(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0O() {
        A0F = new byte[]{88, 84, 86, 21, 93, 90, 88, 94, 89, 84, 84, 80, 21, 90, 95, 72, 21, 82, 85, 79, 94, 73, 72, 79, 82, 79, 82, 90, 87, 21, 82, 86, 75, 73, 94, 72, 72, 82, 84, 85, 21, 87, 84, 92, 92, 94, 95};
    }

    public abstract boolean A0a();

    public abstract int getCloseButtonStyle();

    static {
        A0O();
    }

    public UL(C1064Yn c1064Yn, J2 j22, MC mc, AbstractC1167b5 abstractC1167b5) {
        super(c1064Yn);
        this.A07 = false;
        this.A04 = false;
        this.A03 = false;
        this.A0B = c1064Yn;
        this.A0C = j22;
        this.A09 = mc;
        this.A08 = new ViewOnSystemUiVisibilityChangeListenerC0718Lb(this);
        this.A0A = abstractC1167b5;
        JA ja = new JA(abstractC1167b5.A12(), j22);
        this.A0D = ja;
        this.A0E = new FullScreenAdToolbar(c1064Yn, getAudienceNetworkListener(), ja, 0, abstractC1167b5.A0r());
    }

    private C1P A0J(int i) {
        if (i == 1) {
            return this.A05.A01();
        }
        C1C c1c = this.A05;
        if (A0G[2].charAt(7) != 'O') {
            throw new RuntimeException();
        }
        A0G[0] = "MYlveE6g4wScBr3MsnlZwbj0w3RA4Q0m";
        return c1c.A00();
    }

    private void A0M() {
        removeAllViews();
        AbstractC0731Lo.A0J(this);
    }

    private void A0N() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (A0X() && this.A02 == null) {
            this.A04 = true;
            C0827Pg c0827PgA0B = new C0825Pe(this.A0B, this.A0A.A0x().A0E(), this.A0A.A10()).A08(this.A0A.A0w().A01()).A0B();
            this.A02 = c0827PgA0B;
            JC.A04(c0827PgA0B, this.A0D, J9.A0U);
            this.A09.A3T(this, 0, layoutParams);
            this.A09.A3T(this.A02, 1, layoutParams);
            this.A02.A04(new UN(this));
            return;
        }
        this.A09.A3T(this, 0, layoutParams);
    }

    private void A0P(C1P c1p, boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0E.getToolbarHeight());
        layoutParams.addRule(10);
        this.A0E.A06(c1p, ViewOnClickListenerC0936Tl.A08(this.A0A));
        addView(this.A0E, layoutParams);
    }

    public final void A0S() {
        View view = this.A00;
        if (view == null || !(view instanceof OL)) {
            return;
        }
        if (A0Y()) {
            ((OL) this.A00).A0z();
        } else {
            ((OL) this.A00).A0y();
        }
    }

    public final void A0T(int i) {
        this.A01 = new L9(i, new UM(this, i));
        this.A03 = true;
        A0S();
        this.A01.A07();
    }

    public final void A0U(View view, boolean z, int i) {
        this.A0E.setFullscreen(z);
        this.A00 = view;
        this.A08.A05(EnumC0717La.A03);
        A0M();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, z ? 0 : this.A0E.getToolbarHeight(), 0, 0);
        layoutParams.addRule(12);
        addView(view, layoutParams);
        C1P c1pA0J = A0J(i);
        A0P(c1pA0J, z);
        AbstractC0731Lo.A0M(this, c1pA0J.A07(false));
        if (this.A09 != null) {
            A0N();
            String[] strArr = A0G;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0G[0] = "NsWlVTe7e8AxmZfep9MsD1WsEVvEb3lR";
            if (z && Build.VERSION.SDK_INT >= 19) {
                ViewOnSystemUiVisibilityChangeListenerC0718Lb viewOnSystemUiVisibilityChangeListenerC0718Lb = this.A08;
                if (A0G[0].charAt(10) == 'o') {
                    throw new RuntimeException();
                }
                A0G[2] = "LlUUcmlOaTawHlOzciUSj9DhXPbTXBAe";
                viewOnSystemUiVisibilityChangeListenerC0718Lb.A05(EnumC0717La.A04);
            }
        }
    }

    public final void A0V(C5V c5v) {
        this.A08.A04(c5v.A0J().getWindow());
        this.A05 = this.A0A.A0w();
        C1G c1gA0x = null;
        C1G adInfo = this.A0A.A0x();
        if (adInfo != null) {
            C1G adInfo2 = this.A0A.A0x();
            if (adInfo2 != null) {
                c1gA0x = this.A0A.A0x();
            }
        }
        this.A0E.setPageDetails(this.A0A.A10(), this.A0A.A12(), c1gA0x != null ? c1gA0x.A0D().A03() : 0, this.A0A.A11());
        this.A0E.setToolbarListener(new UP(this, c5v));
    }

    public final void A0W(C5V c5v) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new MO(this, this, c5v));
        startAnimation(alphaAnimation);
    }

    public final boolean A0X() {
        if (!this.A0A.A14().isEmpty()) {
            boolean zA0P = this.A0A.A0x().A0P();
            if (A0G[6].charAt(3) != 'z') {
                throw new RuntimeException();
            }
            A0G[2] = "rwsNokIOLx9Fj0KMvDMbhHWjcozH5rOe";
            if (zA0P) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0Y() {
        return this.A03;
    }

    public final boolean A0Z() {
        return this.A04;
    }

    public void ACW(boolean z) {
        L9 l9 = this.A01;
        if (l9 != null && l9.A05()) {
            this.A01.A06();
        }
    }

    public void ACu(boolean z) {
        L9 l9 = this.A01;
        if (l9 != null && !l9.A04()) {
            this.A01.A07();
        }
    }

    public J2 getAdEventManager() {
        return this.A0C;
    }

    public MC getAudienceNetworkListener() {
        return this.A09;
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public String getCurrentClientToken() {
        return this.A0A.A12();
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final boolean onActivityResult(int i, int i5, Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A08.A03();
        this.A0E.setToolbarListener(null);
        A0M();
    }

    public void setImpressionRecordingFlag(C0723Lg c0723Lg) {
        c0723Lg.A05();
        if (getAudienceNetworkListener() != null) {
            if (this.A07) {
                getAudienceNetworkListener().A43(new U8().A7B());
            } else {
                getAudienceNetworkListener().A43(A0L(0, 47, 106));
            }
        }
    }

    public void setListener(MC mc) {
    }

    public void setServerSideRewardHandler(Q7 q7) {
        this.A06 = q7;
    }
}
