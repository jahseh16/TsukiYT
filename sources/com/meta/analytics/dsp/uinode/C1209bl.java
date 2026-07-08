package com.meta.analytics.dsp.uinode;

import java.io.ByteArrayInputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1209bl implements C0K {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C1209bl(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.meta.analytics.dsp.uinode.C0K
    public final void ADm(int i) throws C1208bk {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.A01);
        this.A00 = byteArrayInputStream;
        byteArrayInputStream.skip(i);
    }

    @Override // com.meta.analytics.dsp.uinode.C0K
    public final void close() throws C1208bk {
    }

    @Override // com.meta.analytics.dsp.uinode.C0K
    public final int length() throws C1208bk {
        return this.A01.length;
    }

    @Override // com.meta.analytics.dsp.uinode.C0K
    public final int read(byte[] bArr) throws C1208bk {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
