package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1111aB implements InterfaceC02702f {
    public Drawable A00;
    public final /* synthetic */ AbstractC02692e A01;

    public C1111aB(AbstractC02692e abstractC02692e) {
        this.A01 = abstractC02692e;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02702f
    public final Drawable A6J() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02702f
    public final AbstractC02692e A6K() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02702f
    public final boolean A7l() {
        return this.A01.getPreventCornerOverlap();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02702f
    public final boolean A8G() {
        return this.A01.getUseCompatPadding();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02702f
    public final void AFu(Drawable drawable) {
        this.A00 = drawable;
        this.A01.setBackgroundDrawable(drawable);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02702f
    public final void AG7(int i, int i5) {
        if (i > this.A01.A01) {
            super/*android.widget.FrameLayout*/.setMinimumWidth(i);
        }
        if (i5 > this.A01.A00) {
            super/*android.widget.FrameLayout*/.setMinimumHeight(i5);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02702f
    public final void AGE(int i, int i5, int i8, int i10) {
        this.A01.A05.set(i, i5, i8, i10);
        AbstractC02692e abstractC02692e = this.A01;
        super/*android.widget.FrameLayout*/.setPadding(abstractC02692e.A04.left + i, this.A01.A04.top + i5, this.A01.A04.right + i8, this.A01.A04.bottom + i10);
    }
}
