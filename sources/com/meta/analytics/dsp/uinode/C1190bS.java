package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1190bS implements AnonymousClass61 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1185bN A01;
    public final /* synthetic */ C1185bN A02;
    public final /* synthetic */ C8T A03;

    public C1190bS(C1185bN c1185bN, int i, C8T c8t, C1185bN c1185bN2) {
        this.A01 = c1185bN;
        this.A00 = i;
        this.A03 = c8t;
        this.A02 = c1185bN2;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAl() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAm() {
        this.A01.A00.ABw(this.A02, C0670Jb.A00(AdErrorType.NO_FILL));
    }
}
