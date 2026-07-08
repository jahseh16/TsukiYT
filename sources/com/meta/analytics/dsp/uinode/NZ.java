package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NZ implements Runnable {
    public final /* synthetic */ C0769Na A00;
    public final /* synthetic */ InterfaceC0770Nb A01;

    public NZ(C0769Na c0769Na, InterfaceC0770Nb interfaceC0770Nb) {
        this.A00 = c0769Na;
        this.A01 = interfaceC0770Nb;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.AAn();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
