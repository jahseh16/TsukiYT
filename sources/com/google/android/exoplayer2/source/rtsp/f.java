package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.y;

/* JADX INFO: loaded from: classes.dex */
public final class f implements y.InterfaceC0057y {
    public final long y;

    public f(long j) {
        this.y = j;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.y.InterfaceC0057y
    public /* synthetic */ y.InterfaceC0057y n3() {
        return hx.n3.y(this);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.y.InterfaceC0057y
    public y y(int i) {
        i9 i9Var = new i9(this.y);
        i9Var.y(hx.c5.y(i * 2));
        return i9Var;
    }
}
