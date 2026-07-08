package e0;

import b0.c5;
import b0.s;
import java.util.List;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class y extends s {

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final n3 f3255xc;

    public y(List<byte[]> list) {
        super("DvbDecoder");
        d dVar = new d(list.get(0));
        this.f3255xc = new n3(dVar.yt(), dVar.yt());
    }

    @Override // b0.s
    public c5 c(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f3255xc.mt();
        }
        return new zn(this.f3255xc.n3(bArr, i));
    }
}
