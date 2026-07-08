package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0997Vv implements InterfaceC0614Gt {
    public final HG<? super C0998Vw> A00;

    public C0997Vv() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public C0997Vv(HG<? super C0998Vw> hg) {
        this.A00 = hg;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0614Gt
    public final InterfaceC0615Gu A4X() {
        return new C0998Vw(this.A00);
    }
}
