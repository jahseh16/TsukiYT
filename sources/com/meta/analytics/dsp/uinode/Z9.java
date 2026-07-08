package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Z9 implements InterfaceC03555o {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C03575q A01;
    public final /* synthetic */ V2 A02;

    public Z9(C03575q c03575q, ImageView imageView, V2 v22) {
        this.A01 = c03575q;
        this.A00 = imageView;
        this.A02 = v22;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03555o
    public final void ABi(Drawable drawable) {
        V2.A0e(drawable, this.A00);
        this.A02.A1J(drawable);
    }
}
