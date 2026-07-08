package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1107a7 implements InterfaceC02712g {
    public final RectF A00 = new RectF();

    private C02742j A00(Context context, ColorStateList colorStateList, float f3, float f4, float f5) {
        return new C02742j(context.getResources(), colorStateList, f3, f4, f5);
    }

    private C02742j A01(InterfaceC02702f interfaceC02702f) {
        return (C02742j) interfaceC02702f.A6J();
    }

    public final void A02(InterfaceC02702f interfaceC02702f) {
        Rect rect = new Rect();
        A01(interfaceC02702f).A0K(rect);
        interfaceC02702f.AG7((int) Math.ceil(A7S(interfaceC02702f)), (int) Math.ceil(A7R(interfaceC02702f)));
        interfaceC02702f.AGE(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final ColorStateList A66(InterfaceC02702f interfaceC02702f) {
        return A01(interfaceC02702f).A0F();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final float A6t(InterfaceC02702f interfaceC02702f) {
        return A01(interfaceC02702f).A0E();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final float A7M(InterfaceC02702f interfaceC02702f) {
        return A01(interfaceC02702f).A0B();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final float A7R(InterfaceC02702f interfaceC02702f) {
        return A01(interfaceC02702f).A0C();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final float A7S(InterfaceC02702f interfaceC02702f) {
        return A01(interfaceC02702f).A0D();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final float A7m(InterfaceC02702f interfaceC02702f) {
        return A01(interfaceC02702f).A0A();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public void A8r() {
        C02742j.A0G = new C1108a8(this);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final void A8s(InterfaceC02702f interfaceC02702f, Context context, ColorStateList colorStateList, float f3, float f4, float f5) {
        C02742j c02742jA00 = A00(context, colorStateList, f3, f4, f5);
        c02742jA00.A0L(interfaceC02702f.A7l());
        interfaceC02702f.AFu(c02742jA00);
        A02(interfaceC02702f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final void AB7(InterfaceC02702f interfaceC02702f) {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final void ACk(InterfaceC02702f interfaceC02702f) {
        A01(interfaceC02702f).A0L(interfaceC02702f.A7l());
        A02(interfaceC02702f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final void AFt(InterfaceC02702f interfaceC02702f, ColorStateList colorStateList) {
        A01(interfaceC02702f).A0J(colorStateList);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final void AFz(InterfaceC02702f interfaceC02702f, float f3) {
        A01(interfaceC02702f).A0I(f3);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final void AG6(InterfaceC02702f interfaceC02702f, float f3) {
        A01(interfaceC02702f).A0H(f3);
        A02(interfaceC02702f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02712g
    public final void AGC(InterfaceC02702f interfaceC02702f, float f3) {
        A01(interfaceC02702f).A0G(f3);
        A02(interfaceC02702f);
    }
}
