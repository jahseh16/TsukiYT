package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0978Vc implements InterfaceC0633Hn {
    public final Handler A00;

    public C0978Vc(Handler handler) {
        this.A00 = handler;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0633Hn
    public final Looper A7L() {
        return this.A00.getLooper();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0633Hn
    public final Message AAZ(int i, int i5, int i8) {
        return this.A00.obtainMessage(i, i5, i8);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0633Hn
    public final Message AAa(int i, int i5, int i8, Object obj) {
        return this.A00.obtainMessage(i, i5, i8, obj);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0633Hn
    public final Message AAb(int i, Object obj) {
        return this.A00.obtainMessage(i, obj);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0633Hn
    public final void AF8(int i) {
        this.A00.removeMessages(i);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0633Hn
    public final boolean AFn(int i) {
        return this.A00.sendEmptyMessage(i);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0633Hn
    public final boolean AFo(int i, long j) {
        return this.A00.sendEmptyMessageAtTime(i, j);
    }
}
