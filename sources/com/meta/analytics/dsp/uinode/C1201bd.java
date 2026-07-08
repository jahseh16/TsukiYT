package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1201bd implements C0W {
    public final C0T A00;

    public C1201bd(C0T c0t) {
        this.A00 = c0t;
    }

    public final C0T A00() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.C0W
    public final GE AAH() {
        return new GE(this);
    }

    @Override // com.meta.analytics.dsp.uinode.C0W
    public final C1203bf AAI() {
        return new C1203bf(this);
    }

    @Override // com.meta.analytics.dsp.uinode.C0W
    public final C1203bf AAJ(String str) {
        return new C1203bf(this, str);
    }
}
