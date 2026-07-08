package com.meta.analytics.dsp.uinode;

import android.os.Handler;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W1 implements InterfaceC0610Gp, HG<Object> {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public final Handler A06;
    public final InterfaceC0609Go A07;
    public final InterfaceC0623Hd A08;
    public final IA A09;

    public W1() {
        this(null, null, 1000000L, 2000, InterfaceC0623Hd.A00);
    }

    public W1(Handler handler, InterfaceC0609Go interfaceC0609Go, long j, int i, InterfaceC0623Hd interfaceC0623Hd) {
        this.A06 = handler;
        this.A07 = interfaceC0609Go;
        this.A09 = new IA(i);
        this.A08 = interfaceC0623Hd;
        this.A01 = j;
    }

    private void A01(int i, long j, long j4) {
        Handler handler = this.A06;
        if (handler != null && this.A07 != null) {
            handler.post(new Gz(this, i, j, j4));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0610Gp
    public final synchronized long A67() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.HG
    public final synchronized void AB1(Object obj, int i) {
        this.A02 += (long) i;
    }

    @Override // com.meta.analytics.dsp.uinode.HG
    public final synchronized void ADO(Object obj) {
        AbstractC0620Ha.A04(this.A00 > 0);
        long nowMs = this.A08.A5T();
        int i = (int) (nowMs - this.A03);
        this.A05 += (long) i;
        long j = this.A04;
        long j4 = this.A02;
        this.A04 = j + j4;
        if (i > 0) {
            this.A09.A03((int) Math.sqrt(j4), (8000 * j4) / ((long) i));
            if (this.A05 >= 2000 || this.A04 >= 524288) {
                this.A01 = (long) this.A09.A02(0.5f);
            }
        }
        A01(i, this.A02, this.A01);
        int sampleElapsedTimeMs = this.A00 - 1;
        this.A00 = sampleElapsedTimeMs;
        if (sampleElapsedTimeMs > 0) {
            this.A03 = nowMs;
        }
        this.A02 = 0L;
    }

    @Override // com.meta.analytics.dsp.uinode.HG
    public final synchronized void ADP(Object obj, C0619Gy c0619Gy) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A5T();
        }
        this.A00++;
    }
}
