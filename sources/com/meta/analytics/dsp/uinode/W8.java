package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W8 implements InterfaceC0600Gf {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final InterfaceC0610Gp A06;
    public final InterfaceC0623Hd A07;

    public W8(InterfaceC0610Gp interfaceC0610Gp) {
        this(interfaceC0610Gp, 10000, 25000, 25000, 0.75f, 0.75f, 2000L, InterfaceC0623Hd.A00);
    }

    public W8(InterfaceC0610Gp interfaceC0610Gp, int i, int i5, int i8, float f3, float f4, long j, InterfaceC0623Hd interfaceC0623Hd) {
        this.A06 = interfaceC0610Gp;
        this.A03 = i;
        this.A02 = i5;
        this.A04 = i8;
        this.A00 = f3;
        this.A01 = f4;
        this.A05 = j;
        this.A07 = interfaceC0623Hd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0600Gf
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0499Bp A4o(TrackGroup trackGroup, int... iArr) {
        return new C0499Bp(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}
