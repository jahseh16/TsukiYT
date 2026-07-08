package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1086Zk implements C5D {
    public final /* synthetic */ C0547Eb A00;

    public C1086Zk(C0547Eb c0547Eb) {
        this.A00 = c0547Eb;
    }

    @Override // com.meta.analytics.dsp.uinode.C5D
    public final void AE9(AnonymousClass56 anonymousClass56, C03254j c03254j, C03254j c03254j2) {
        this.A00.A1j(anonymousClass56, c03254j, c03254j2);
    }

    @Override // com.meta.analytics.dsp.uinode.C5D
    public final void AEB(AnonymousClass56 anonymousClass56, C03254j c03254j, C03254j c03254j2) {
        this.A00.A0r.A0Y(anonymousClass56);
        this.A00.A1k(anonymousClass56, c03254j, c03254j2);
    }

    @Override // com.meta.analytics.dsp.uinode.C5D
    public final void AED(AnonymousClass56 anonymousClass56, C03254j c03254j, C03254j c03254j2) {
        anonymousClass56.A0X(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0H(anonymousClass56, anonymousClass56, c03254j, c03254j2)) {
                this.A00.A1M();
            }
        } else {
            if (!this.A00.A05.A0G(anonymousClass56, c03254j, c03254j2)) {
                return;
            }
            this.A00.A1M();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C5D
    public final void AGo(AnonymousClass56 anonymousClass56) {
        this.A00.A06.A1D(anonymousClass56.A0H, this.A00.A0r);
    }
}
