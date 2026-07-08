package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.av, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1157av implements C6U {
    public static String[] A05 = {"udExhBBZigXHD765", "VCbgsgLtwNII3DWSf3Df", "sJ3cSki5Ts1gkpIy0", "hudoenMQ7OfQJqKUwYviTAHkC5956B", "3GiDDKpH2PPu7", "VAV0OzmNbR17K1ZAu", "eIBPlY8UdwZIA15YBWaPzTw3Re1i6Niv", "w6ShnqqW6c5InpRu2fdQvGfdyx0XiT7r"};
    public final /* synthetic */ AbstractC1167b5 A00;
    public final /* synthetic */ InterfaceC02461h A01;
    public final /* synthetic */ C02471i A02;
    public final /* synthetic */ C1064Yn A03;
    public final /* synthetic */ boolean A04;

    public C1157av(C02471i c02471i, C1064Yn c1064Yn, boolean z, AbstractC1167b5 abstractC1167b5, InterfaceC02461h interfaceC02461h) {
        this.A02 = c02471i;
        this.A03 = c1064Yn;
        this.A04 = z;
        this.A00 = abstractC1167b5;
        this.A01 = interfaceC02461h;
    }

    private void A00(boolean z) {
        if (z) {
            C1064Yn c1064Yn = this.A03;
            String[] strArr = A05;
            if (strArr[7].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ua1Hqbcww3qJrVJ6O";
            strArr2[2] = "2U70GzBDbPON7gkn8";
            if (C0653Ih.A1O(c1064Yn) && this.A04) {
                this.A02.A02.add(PC.A01(this.A03, this.A00, 1, new C1158aw(this)));
                return;
            } else {
                this.A01.AAf();
                return;
            }
        }
        this.A01.AAe(AdError.CACHE_ERROR);
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void AB2() {
        A00(false);
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void ABB() {
        A00(true);
    }
}
