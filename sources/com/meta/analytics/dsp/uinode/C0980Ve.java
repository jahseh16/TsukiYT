package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0980Ve implements InterfaceC0636Hq {
    public long A00;
    public long A01;
    public C04559x A02 = C04559x.A04;
    public boolean A03;
    public final InterfaceC0623Hd A04;

    public C0980Ve(InterfaceC0623Hd interfaceC0623Hd) {
        this.A04 = interfaceC0623Hd;
    }

    public final void A00() {
        if (!this.A03) {
            this.A00 = this.A04.A5T();
            this.A03 = true;
        }
    }

    public final void A01() {
        if (this.A03) {
            A02(A7k());
            this.A03 = false;
        }
    }

    public final void A02(long j) {
        this.A01 = j;
        if (this.A03) {
            this.A00 = this.A04.A5T();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0636Hq
    public final C04559x A7h() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0636Hq
    public final long A7k() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long jA5T = this.A04.A5T();
            long positionUs = this.A00;
            long j = jA5T - positionUs;
            if (this.A02.A01 == 1.0f) {
                long positionUs2 = C9W.A00(j);
                return elapsedSinceBaseMs + positionUs2;
            }
            long positionUs3 = this.A02.A00(j);
            return elapsedSinceBaseMs + positionUs3;
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0636Hq
    public final C04559x AGA(C04559x c04559x) {
        if (this.A03) {
            A02(A7k());
        }
        this.A02 = c04559x;
        return c04559x;
    }
}
