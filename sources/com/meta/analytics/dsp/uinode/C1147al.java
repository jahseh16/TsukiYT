package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.al, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1147al extends KT {
    public final /* synthetic */ C1184bM A00;
    public final /* synthetic */ C02601v A01;
    public final /* synthetic */ FQ A02;

    public C1147al(FQ fq, C02601v c02601v, C1184bM c1184bM) {
        this.A02 = fq;
        this.A01 = c02601v;
        this.A00 = c1184bM;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        this.A02.A0Q(this.A01);
        this.A02.A0N(this.A00);
        this.A02.A00 = null;
        C0670Jb c0670JbA00 = C0670Jb.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0E().A4t(c0670JbA00.A03().getErrorCode(), c0670JbA00.A04());
        this.A02.A06.A0G(c0670JbA00);
    }
}
