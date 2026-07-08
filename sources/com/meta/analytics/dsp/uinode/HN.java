package com.meta.analytics.dsp.uinode;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class HN implements S1 {
    public final C0642Hw A00;
    public final S6 A01;

    public HN(C0642Hw c0642Hw, S6 s62) {
        this.A00 = c0642Hw;
        this.A01 = s62;
    }

    @Override // com.meta.analytics.dsp.uinode.S1
    public void A3Z(Map<InterfaceC0882Rj, S6> map, Map<SyncModifiableBundle, EnumC0892Rt> map2) {
        map.put(this.A00, this.A01);
    }
}
