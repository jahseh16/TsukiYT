package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.41, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass41 extends AbstractC0495Bl {
    public final int A00;
    public final int A01;
    public final HG<? super InterfaceC0615Gu> A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public AnonymousClass41(String str, HG<? super InterfaceC0615Gu> hg) {
        this(str, hg, 8000, 8000, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public AnonymousClass41(String str, HG<? super InterfaceC0615Gu> hg, int i, int i5, boolean z) {
        this.A03 = str;
        this.A02 = hg;
        this.A00 = i;
        this.A01 = i5;
        this.A04 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC0495Bl
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0496Bm A01(H5 h5) {
        return new C0496Bm(this.A03, null, this.A02, this.A00, this.A01, this.A04, h5);
    }
}
