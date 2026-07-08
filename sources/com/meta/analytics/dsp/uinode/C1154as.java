package com.meta.analytics.dsp.uinode;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.as, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1154as implements C6U {
    public final C02411c A00;
    public final InterfaceC02551q A01;
    public final C03696c A02;
    public final C1064Yn A03;
    public final boolean A04;

    public C1154as(C1064Yn c1064Yn, InterfaceC02551q interfaceC02551q, C03696c c03696c, C02411c c02411c, boolean z) {
        this.A03 = c1064Yn;
        this.A01 = interfaceC02551q;
        this.A02 = c03696c;
        this.A00 = c02411c;
        this.A04 = z;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new C02561r(this.A00, this.A01, this.A04));
        webView.loadUrl(this.A00.A0E());
    }

    private void A01(boolean z) {
        if (this.A00.A09() == EnumC02421d.A05) {
            A00();
            return;
        }
        String strA0E = this.A00.A0E();
        if (z) {
            C03696c c03696c = this.A02;
            String markupUrlResult = this.A00.A0E();
            strA0E = c03696c.A0R(markupUrlResult);
        }
        this.A00.A0H(strA0E);
        this.A01.ACa();
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void AB2() {
        if (this.A04) {
            this.A01.ACZ(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void ABB() {
        A01(true);
    }
}
