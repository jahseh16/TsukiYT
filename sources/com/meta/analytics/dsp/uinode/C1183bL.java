package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1183bL extends KT {
    public final /* synthetic */ C1182bK A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C1183bL(C1182bK c1182bK, Map map, Map map2) {
        this.A00 = c1182bK;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        if (!TextUtils.isEmpty(this.A00.A01.A0Y())) {
            HashMap map = new HashMap();
            Map<String, String> extraData = this.A02;
            map.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            map.putAll(extraData2);
            this.A00.A0A.A09().AA4(this.A00.A01.A0Y(), map);
        }
    }
}
