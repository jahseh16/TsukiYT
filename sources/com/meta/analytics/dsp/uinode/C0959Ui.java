package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ui, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0959Ui implements LU {
    public int A00;
    public final LU A01;
    public final LU A02;

    public C0959Ui(LU lu, int i, LU lu2) {
        this.A01 = lu;
        this.A00 = i;
        this.A02 = lu2;
    }

    @Override // com.meta.analytics.dsp.uinode.LU
    public final void AE8(String str) {
        if (this.A00 > 0) {
            this.A01.AE8(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.AE8(str);
    }

    @Override // com.meta.analytics.dsp.uinode.LU
    public final void flush() {
        this.A02.flush();
    }
}
