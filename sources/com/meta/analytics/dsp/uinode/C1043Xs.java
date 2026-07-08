package com.meta.analytics.dsp.uinode;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1043Xs implements InterfaceC0459Ab {
    public int A01;
    public int A02;
    public int A04;
    public int A05;
    public boolean A08;
    public boolean A09;
    public ByteBuffer A06 = InterfaceC0459Ab.A00;
    public ByteBuffer A07 = InterfaceC0459Ab.A00;
    public int A00 = -1;
    public int A03 = -1;
    public byte[] A0A = new byte[0];

    public final void A00(int i, int i5) {
        this.A05 = i;
        this.A04 = i5;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final boolean A4Q(int i, int i5, int i8) throws C0458Aa {
        if (i8 == 2) {
            this.A00 = i5;
            this.A03 = i;
            int i10 = this.A04;
            this.A0A = new byte[i10 * i5 * 2];
            this.A01 = 0;
            int i11 = this.A05;
            this.A02 = i11 * i5 * 2;
            boolean z = this.A09;
            boolean wasActive = (i11 == 0 && i10 == 0) ? false : true;
            this.A09 = wasActive;
            return z != wasActive;
        }
        throw new C0458Aa(i, i5, i8);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final ByteBuffer A7W() {
        ByteBuffer byteBuffer = this.A07;
        ByteBuffer outputBuffer = InterfaceC0459Ab.A00;
        this.A07 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final int A7X() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final int A7Y() {
        return 2;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final int A7Z() {
        return this.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final boolean A8w() {
        return this.A09;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final boolean A91() {
        return this.A08 && this.A07 == InterfaceC0459Ab.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final void AEE() {
        this.A08 = true;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final void AEF(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.position();
        int endBufferBytesToOutput = byteBuffer.limit();
        int i = endBufferBytesToOutput - remaining;
        int position = this.A02;
        int limit = Math.min(i, position);
        int position2 = this.A02;
        this.A02 = position2 - limit;
        byteBuffer.position(remaining + limit);
        int position3 = this.A02;
        if (position3 > 0) {
            return;
        }
        int remainingBytesToOutput = i - limit;
        int i5 = this.A01 + remainingBytesToOutput;
        int position4 = this.A0A.length;
        int i8 = i5 - position4;
        int position5 = this.A06.capacity();
        if (position5 < i8) {
            this.A06 = ByteBuffer.allocateDirect(i8).order(ByteOrder.nativeOrder());
        } else {
            this.A06.clear();
        }
        int position6 = this.A01;
        int remaining2 = IF.A06(i8, 0, position6);
        this.A06.put(this.A0A, 0, remaining2);
        int limit2 = IF.A06(i8 - remaining2, 0, remainingBytesToOutput);
        int position7 = byteBuffer.position();
        byteBuffer.limit(position7 + limit2);
        this.A06.put(byteBuffer);
        byteBuffer.limit(endBufferBytesToOutput);
        int remainingBytesToOutput2 = remainingBytesToOutput - limit2;
        int limit3 = this.A01 - remaining2;
        this.A01 = limit3;
        byte[] bArr = this.A0A;
        System.arraycopy(bArr, remaining2, bArr, 0, limit3);
        byte[] bArr2 = this.A0A;
        int position8 = this.A01;
        byteBuffer.get(bArr2, position8, remainingBytesToOutput2);
        int position9 = this.A01;
        this.A01 = position9 + remainingBytesToOutput2;
        this.A06.flip();
        this.A07 = this.A06;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final void flush() {
        this.A07 = InterfaceC0459Ab.A00;
        this.A08 = false;
        this.A02 = 0;
        this.A01 = 0;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0459Ab
    public final void reset() {
        flush();
        this.A06 = InterfaceC0459Ab.A00;
        this.A00 = -1;
        this.A03 = -1;
        this.A0A = new byte[0];
    }
}
