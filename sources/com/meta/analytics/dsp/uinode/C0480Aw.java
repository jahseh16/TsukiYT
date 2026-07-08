package com.meta.analytics.dsp.uinode;

import android.media.AudioTrack;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Aw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0480Aw extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C1049Xy A01;

    public C0480Aw(C1049Xy c1049Xy, AudioTrack audioTrack) {
        this.A01 = c1049Xy;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.release();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
