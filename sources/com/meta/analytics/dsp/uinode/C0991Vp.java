package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0991Vp implements InterfaceC0615Gu {
    public final int A00;
    public final InterfaceC0615Gu A01;
    public final I3 A02;

    public C0991Vp(InterfaceC0615Gu interfaceC0615Gu, I3 i32, int i) {
        this.A01 = (InterfaceC0615Gu) AbstractC0620Ha.A01(interfaceC0615Gu);
        this.A02 = (I3) AbstractC0620Ha.A01(i32);
        this.A00 = i;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0615Gu
    public final Uri A8E() {
        return this.A01.A8E();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0615Gu
    public final long ADl(C0619Gy c0619Gy) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.ADl(c0619Gy);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0615Gu
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0615Gu
    public final int read(byte[] bArr, int i, int i5) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i, i5);
    }
}
