package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C02330u {
    public static InterfaceC02280p A00;

    public final InterfaceC02280p A00(C1064Yn c1064Yn, AdPlacementType adPlacementType) {
        InterfaceC02280p interfaceC02280p = A00;
        if (interfaceC02280p != null) {
            return interfaceC02280p;
        }
        switch (C02320t.A00[adPlacementType.ordinal()]) {
            case 1:
                return new C1185bN();
            case 2:
                return new C1184bM();
            case 3:
                return new C1182bK(c1064Yn);
            case 4:
                return new C0573Fb(c1064Yn);
            case 5:
                return new FY();
            default:
                return null;
        }
    }
}
