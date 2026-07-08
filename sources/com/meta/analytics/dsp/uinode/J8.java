package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class J8 implements InterfaceC0893Ru {
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0893Ru
    public final long A4z() {
        return System.nanoTime();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0893Ru
    public final void AGQ(Object obj, long j) throws InterruptedException {
        obj.wait(j);
    }
}
