package i7;

import i7.n3;
import i7.t;
import i7.ta;
import java.io.IOException;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class i9 implements t.n3 {
    public int n3 = 0;
    public boolean zn;

    public i9 n3() {
        this.n3 = 2;
        return this;
    }

    @Override // i7.t.n3
    public t y(t.y yVar) throws IOException {
        int i;
        int i5 = ut.y;
        if (i5 < 23 || ((i = this.n3) != 1 && (i != 0 || i5 < 31))) {
            return new ta.n3().y(yVar);
        }
        int iF = v0.n.f(yVar.zn.f3);
        v0.r.a("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + ut.s8(iF));
        return new n3.C0103n3(iF, this.zn).y(yVar);
    }

    public i9 zn() {
        this.n3 = 1;
        return this;
    }
}
