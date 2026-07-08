package i7;

import ft.g;
import java.nio.ByteBuffer;
import mn.yt;

/* JADX INFO: loaded from: classes.dex */
public final class c5 {
    public long n3;
    public long y;
    public boolean zn;

    public long gv(g gVar, di.fb fbVar) {
        if (this.n3 == 0) {
            this.y = fbVar.f3178f;
        }
        if (this.zn) {
            return fbVar.f3178f;
        }
        ByteBuffer byteBuffer = (ByteBuffer) v0.y.v(fbVar.f3179fb);
        int i = 0;
        for (int i5 = 0; i5 < 4; i5++) {
            i = (i << 8) | (byteBuffer.get(i5) & 255);
        }
        int iTl = yt.tl(i);
        if (iTl != -1) {
            long jY = y(gVar.oz);
            this.n3 += (long) iTl;
            return jY;
        }
        this.zn = true;
        this.n3 = 0L;
        this.y = fbVar.f3178f;
        v0.r.c5("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return fbVar.f3178f;
    }

    public long n3(g gVar) {
        return y(gVar.oz);
    }

    public final long y(long j) {
        return this.y + Math.max(0L, ((this.n3 - 529) * 1000000) / j);
    }

    public void zn() {
        this.y = 0L;
        this.n3 = 0L;
        this.zn = false;
    }
}
