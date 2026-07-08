package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.77, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass77 extends AbstractC0952Ub<RE> implements InterfaceC03887b {
    public static String[] A02 = {"iVby5wy6H7l4dzY0Hld0xs9tuHtnGk", "Nr0U5YnFPaRVMsCPPiWFbDdqiRS3TX59", "NmHEOi9mcJk9OQjZmIqLk3AYwOx5ICK3", "j6OxXppfxNxejmkkIb10P2S2ED13bfax", "YxA", "okdCTGqDBxOQkU", "XAA3rxsPdfTGxXL8JCFSxOB2RupP9g", "Mu"};
    public C1064Yn A00;
    public boolean A01;

    public AnonymousClass77(RE re, C1064Yn c1064Yn) {
        super(re);
        this.A00 = c1064Yn;
        this.A01 = false;
    }

    private void A00(int i) {
        if (!this.A01) {
            this.A00.A0E().A3K(i);
        }
        String[] strArr = A02;
        if (strArr[0].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        A02[1] = "k6Oe58jhR2JQ133LIP7LsY5lW6eco9l5";
        this.A01 = true;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        RE reA07 = A07();
        int iIntValue = 0;
        if (reA07 == null) {
            A00(0);
            return;
        }
        View view = reA07.A0C;
        RD rd = (RD) reA07.A0E.get();
        int i = 1;
        boolean z = view == null;
        if (!z && rd != null) {
            RF rfA0E = RE.A0E(view, reA07.A0A, this.A00);
            if (rfA0E.A04()) {
                RE.A05(reA07);
            } else {
                reA07.A00 = 0;
            }
            boolean z5 = reA07.A00 > reA07.A09;
            boolean wasViewable = reA07.A05 != null && reA07.A05.A04();
            if (z5 || !rfA0E.A04()) {
                reA07.A05 = rfA0E;
            }
            String strValueOf = String.valueOf(rfA0E.A01());
            synchronized (reA07) {
                if (reA07.A06.containsKey(strValueOf)) {
                    iIntValue = ((Integer) reA07.A06.get(strValueOf)).intValue();
                }
                reA07.A06.put(strValueOf, Integer.valueOf(iIntValue + 1));
            }
            if (z5 && !wasViewable) {
                this.A01 = true;
                reA07.A03 = System.currentTimeMillis();
                if (reA07.A07) {
                    this.A00.A0E().A3L();
                }
                rd.A03();
                if (BuildConfigApi.isDebug() && AdInternalSettings.isVisibleAnimation()) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(500L);
                    view.startAnimation(alphaAnimation);
                }
                if (!reA07.A0F) {
                    return;
                }
            } else if (!z5 && wasViewable) {
                this.A01 = true;
                if (reA07.A07) {
                    this.A00.A0E().A2r(rfA0E.A02());
                }
                rd.A00();
            } else {
                rd.A02();
                if (!this.A01 && reA07.A07) {
                    this.A00.A0E().A3J(rfA0E.A02());
                }
                this.A01 = true;
            }
            if (!reA07.A08 && reA07.A04 != null) {
                reA07.A0B.postDelayed(reA07.A04, reA07.A02);
                return;
            }
            return;
        }
        if (reA07.A07) {
            if (!z) {
                i = 2;
            }
            A00(i);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03887b
    public final C1064Yn A5t() {
        return this.A00;
    }
}
