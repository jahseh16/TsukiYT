package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CB extends WW implements InterfaceC0557El {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final InterfaceC0505Bv A05;
    public final InterfaceC0614Gt A06;
    public final Object A07;
    public final String A08;

    public CB(Uri uri, InterfaceC0614Gt interfaceC0614Gt, InterfaceC0505Bv interfaceC0505Bv, int i, String str, int i5, Object obj) {
        this.A04 = uri;
        this.A06 = interfaceC0614Gt;
        this.A05 = interfaceC0505Bv;
        this.A03 = i;
        this.A08 = str;
        this.A02 = i5;
        this.A00 = -9223372036854775807L;
        this.A07 = obj;
    }

    private void A00(long j, boolean z) {
        this.A00 = j;
        this.A01 = z;
        A01(new WN(this.A00, this.A01, false, this.A07), null);
    }

    @Override // com.meta.analytics.dsp.uinode.WW
    public final void A02() {
    }

    @Override // com.meta.analytics.dsp.uinode.WW
    public final void A03(Y6 y62, boolean z) {
        A00(this.A00, false);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0562Eq
    public final WP A4k(C0560Eo c0560Eo, InterfaceC0607Gm interfaceC0607Gm) {
        AbstractC0620Ha.A03(c0560Eo.A02 == 0);
        return new CD(this.A04, this.A06.A4X(), this.A05.A4b(), this.A03, A00(c0560Eo), this, interfaceC0607Gm, this.A08, this.A02);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0562Eq
    public final void AAO() throws IOException {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0557El
    public final void AD9(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (this.A00 == j && this.A01 == z) {
            return;
        }
        A00(j, z);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0562Eq
    public final void AEa(WP wp) {
        ((CD) wp).A0R();
    }
}
