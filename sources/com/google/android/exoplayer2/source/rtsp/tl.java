package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.y;
import java.io.IOException;
import r0.w;

/* JADX INFO: loaded from: classes.dex */
public final class tl implements y.InterfaceC0057y {
    public final long y;

    public tl(long j) {
        this.y = j;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.y.InterfaceC0057y
    public y.InterfaceC0057y n3() {
        return new f(this.y);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.y.InterfaceC0057y
    public y y(int i) throws IOException {
        t tVar = new t(this.y);
        t tVar2 = new t(this.y);
        try {
            tVar.y(hx.c5.y(0));
            int iGv = tVar.gv();
            boolean z = iGv % 2 == 0;
            tVar2.y(hx.c5.y(z ? iGv + 1 : iGv - 1));
            if (z) {
                tVar.a(tVar2);
                return tVar;
            }
            tVar2.a(tVar);
            return tVar2;
        } catch (IOException e4) {
            w.y(tVar);
            w.y(tVar2);
            throw e4;
        }
    }
}
