package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EF {
    public final float A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final DownloadAction A04;
    public final Throwable A05;

    public EF(int i, DownloadAction downloadAction, int i5, float f3, long j, Throwable th) {
        this.A02 = i;
        this.A04 = downloadAction;
        this.A01 = i5;
        this.A00 = f3;
        this.A03 = j;
        this.A05 = th;
    }

    public /* synthetic */ EF(int i, DownloadAction downloadAction, int i5, float f3, long j, Throwable th, E5 e5) {
        this(i, downloadAction, i5, f3, j, th);
    }
}
