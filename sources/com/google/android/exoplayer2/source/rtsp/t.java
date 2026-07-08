package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.rtsp.fb;
import java.io.IOException;
import java.util.Map;
import r0.j;
import r0.o;
import r0.p;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class t implements y {

    @Nullable
    public t n3;
    public final j y;

    public t(long j) {
        this.y = new j(2000, n4.a.gv(j));
    }

    public void a(t tVar) {
        v0.y.y(this != tVar);
        this.n3 = tVar;
    }

    @Override // r0.tl
    public void close() {
        this.y.close();
        t tVar = this.n3;
        if (tVar != null) {
            tVar.close();
        }
    }

    @Override // r0.tl
    public void co(o oVar) {
        this.y.co(oVar);
    }

    @Override // r0.tl
    public /* synthetic */ Map fb() {
        return r0.t.y(this);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.y
    public int gv() {
        int iGv = this.y.gv();
        if (iGv == -1) {
            return -1;
        }
        return iGv;
    }

    @Override // r0.tl
    @Nullable
    public Uri n3() {
        return this.y.n3();
    }

    @Override // r0.c5
    public int read(byte[] bArr, int i, int i5) throws IOException {
        try {
            return this.y.read(bArr, i, i5);
        } catch (j.y e4) {
            if (e4.reason == 2002) {
                return -1;
            }
            throw e4;
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.y
    @Nullable
    public fb.n3 t() {
        return null;
    }

    @Override // r0.tl
    public long y(p pVar) throws IOException {
        return this.y.y(pVar);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.y
    public String zn() {
        int iGv = gv();
        v0.y.fb(iGv != -1);
        return ut.rz("RTP/AVP;unicast;client_port=%d-%d", Integer.valueOf(iGv), Integer.valueOf(iGv + 1));
    }
}
