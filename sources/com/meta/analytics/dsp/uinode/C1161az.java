package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.az, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1161az implements InterfaceC02461h {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1167b5 A01;
    public final /* synthetic */ C1165b3 A02;
    public final /* synthetic */ InterfaceC02461h A03;
    public final /* synthetic */ C02471i A04;
    public final /* synthetic */ C1064Yn A05;
    public final /* synthetic */ EnumSet A06;

    public C1161az(C02471i c02471i, C1064Yn c1064Yn, AbstractC1167b5 abstractC1167b5, C1165b3 c1165b3, int i, InterfaceC02461h interfaceC02461h, EnumSet enumSet) {
        this.A04 = c02471i;
        this.A05 = c1064Yn;
        this.A01 = abstractC1167b5;
        this.A02 = c1165b3;
        this.A00 = i;
        this.A03 = interfaceC02461h;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 >= this.A02.A0s()) {
            return;
        }
        C02471i c02471i = this.A04;
        C1064Yn c1064Yn = this.A05;
        EnumSet enumSet = this.A06;
        C1165b3 c1165b3 = this.A02;
        c02471i.A0A(c1064Yn, enumSet, c1165b3, c1165b3.A0v(this.A00 + 1), this.A00 + 1, this.A03);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02461h
    public final void AAe(AdError adError) {
        if (this.A00 == 0) {
            this.A03.AAe(adError);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02461h
    public final void AAf() {
        this.A05.A00().AFq(this.A01.A12(), this.A02.A0w());
        if (this.A00 == 0) {
            this.A03.AAf();
        }
        A00();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02461h
    public final void AES() {
        if (this.A00 == 0) {
            this.A03.AES();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02461h
    public final void AGm() {
        if (this.A00 == 0) {
            this.A03.AGm();
        }
    }
}
