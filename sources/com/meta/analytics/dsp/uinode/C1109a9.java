package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1109a9 implements InterfaceC02712g {
    private C02722h A00(InterfaceC02702f interfaceC02702f) {
        return (C02722h) interfaceC02702f.A6J();
    }

    public final void A01(InterfaceC02702f interfaceC02702f) {
        if (!interfaceC02702f.A8G()) {
            interfaceC02702f.AGE(0, 0, 0, 0);
            return;
        }
        float fA7M = A7M(interfaceC02702f);
        float fA7m = A7m(interfaceC02702f);
        float elevation = C02742j.A00(fA7M, fA7m, interfaceC02702f.A7l());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = C02742j.A01(fA7M, fA7m, interfaceC02702f.A7l());
        int iCeil = (int) Math.ceil(elevation2);
        interfaceC02702f.AGE(vPadding, iCeil, vPadding, iCeil);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final ColorStateList A66(InterfaceC02702f interfaceC02702f) {
        return A00(interfaceC02702f).A05();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final float A6t(InterfaceC02702f interfaceC02702f) {
        return interfaceC02702f.A6K().getElevation();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final float A7M(InterfaceC02702f interfaceC02702f) {
        return A00(interfaceC02702f).A03();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final float A7R(InterfaceC02702f interfaceC02702f) {
        return A7m(interfaceC02702f) * 2.0f;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final float A7S(InterfaceC02702f interfaceC02702f) {
        return A7m(interfaceC02702f) * 2.0f;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final float A7m(InterfaceC02702f interfaceC02702f) {
        return A00(interfaceC02702f).A04();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final void A8r() {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final void A8s(InterfaceC02702f interfaceC02702f, Context context, ColorStateList colorStateList, float f3, float f4, float f5) {
        C02722h background = new C02722h(colorStateList, f3);
        interfaceC02702f.AFu(background);
        View view = interfaceC02702f.A6K();
        view.setClipToOutline(true);
        view.setElevation(f4);
        AG6(interfaceC02702f, f5);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final void AB7(InterfaceC02702f interfaceC02702f) {
        AG6(interfaceC02702f, A7M(interfaceC02702f));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final void ACk(InterfaceC02702f interfaceC02702f) {
        AG6(interfaceC02702f, A7M(interfaceC02702f));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final void AFt(InterfaceC02702f interfaceC02702f, ColorStateList colorStateList) {
        A00(interfaceC02702f).A08(colorStateList);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final void AFz(InterfaceC02702f interfaceC02702f, float f3) {
        interfaceC02702f.A6K().setElevation(f3);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final void AG6(InterfaceC02702f interfaceC02702f, float f3) {
        A00(interfaceC02702f).A07(f3, interfaceC02702f.A8G(), interfaceC02702f.A7l());
        A01(interfaceC02702f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final void AGC(InterfaceC02702f interfaceC02702f, float f3) {
        A00(interfaceC02702f).A06(f3);
    }
}
