package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1036Xl implements C4 {
    @Override // com.meta.analytics.dsp.uinode.C4
    public final void A5n(Format format) {
    }

    @Override // com.meta.analytics.dsp.uinode.C4
    public final int AFQ(InterfaceC0503Bt interfaceC0503Bt, int i, boolean z) throws InterruptedException, IOException {
        int iAGM = interfaceC0503Bt.AGM(i);
        if (iAGM == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return iAGM;
    }

    @Override // com.meta.analytics.dsp.uinode.C4
    public final void AFR(C0645Hz c0645Hz, int i) {
        c0645Hz.A0Z(i);
    }

    @Override // com.meta.analytics.dsp.uinode.C4
    public final void AFS(long j, int i, int i5, int i8, C3 c3) {
    }
}
