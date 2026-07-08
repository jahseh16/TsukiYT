package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0751Mi extends View {
    public InterfaceC0750Mh A00;

    public C0751Mi(C1064Yn c1064Yn, InterfaceC0750Mh interfaceC0750Mh) {
        super(c1064Yn);
        this.A00 = interfaceC0750Mh;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        InterfaceC0750Mh interfaceC0750Mh = this.A00;
    }
}
