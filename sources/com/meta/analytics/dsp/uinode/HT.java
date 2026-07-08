package com.meta.analytics.dsp.uinode;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class HT implements S1 {
    public final EnumC0892Rt A00;
    public final AnonymousClass74 A01;

    public HT(AnonymousClass74 anonymousClass74, EnumC0892Rt enumC0892Rt) {
        this.A01 = anonymousClass74;
        this.A00 = enumC0892Rt;
    }

    @Override // com.meta.analytics.dsp.uinode.S1
    public void A3Z(Map<InterfaceC0882Rj, S6> map, Map<SyncModifiableBundle, EnumC0892Rt> map2) {
        map2.put(null, this.A00);
    }
}
