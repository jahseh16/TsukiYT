package com.meta.analytics.dsp.uinode;

import android.content.Context;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1001Vz implements InterfaceC0614Gt {
    public final Context A00;
    public final InterfaceC0614Gt A01;
    public final HG<? super InterfaceC0615Gu> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C1001Vz(Context context, HG<? super InterfaceC0615Gu> hg, InterfaceC0614Gt interfaceC0614Gt) {
        this.A00 = context.getApplicationContext();
        this.A02 = hg;
        this.A01 = interfaceC0614Gt;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C1001Vz(Context context, String str, HG<? super InterfaceC0615Gu> hg) {
        this(context, hg, new AnonymousClass41(str, hg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0614Gt
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final W0 A4X() {
        return new W0(this.A00, this.A02, this.A01.A4X());
    }
}
