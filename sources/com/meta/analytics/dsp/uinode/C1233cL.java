package com.meta.analytics.dsp.uinode;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1233cL {
    public final InterfaceC1237cP A00;
    public final String A01;
    public final Collection<C1247ca> A02;
    public final Collection<C1247ca> A03;
    public final List<Rect> A04;

    public C1233cL(String str, InterfaceC1237cP interfaceC1237cP, List<Rect> rects, Collection<C1247ca> collection, Collection<C1247ca> collection2) {
        this.A01 = str;
        this.A00 = interfaceC1237cP;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
