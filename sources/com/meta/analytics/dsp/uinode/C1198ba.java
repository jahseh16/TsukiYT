package com.meta.analytics.dsp.uinode;

import java.util.Collection;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1198ba implements InterfaceC02240k {
    public final /* synthetic */ C1064Yn A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C1198ba(JSONObject jSONObject, C1064Yn c1064Yn, String str) {
        this.A02 = jSONObject;
        this.A00 = c1064Yn;
        this.A01 = str;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02240k
    public final String A6T() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02240k
    public final Collection<String> A6n() {
        return AbstractC02250l.A03(this.A00, this.A02);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02240k
    public final EnumC02230j A7E() {
        return AbstractC02250l.A00(this.A02);
    }
}
