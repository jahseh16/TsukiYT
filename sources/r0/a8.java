package r0;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a8 implements tl {
    public final v0.ej n3;
    public final tl y;
    public final int zn;

    public a8(tl tlVar, v0.ej ejVar, int i) {
        this.y = (tl) v0.y.v(tlVar);
        this.n3 = (v0.ej) v0.y.v(ejVar);
        this.zn = i;
    }

    @Override // r0.tl
    public void close() throws IOException {
        this.y.close();
    }

    @Override // r0.tl
    public void co(o oVar) {
        v0.y.v(oVar);
        this.y.co(oVar);
    }

    @Override // r0.tl
    public Map<String, List<String>> fb() {
        return this.y.fb();
    }

    @Override // r0.tl
    @Nullable
    public Uri n3() {
        return this.y.n3();
    }

    @Override // r0.c5
    public int read(byte[] bArr, int i, int i5) throws IOException {
        this.n3.n3(this.zn);
        return this.y.read(bArr, i, i5);
    }

    @Override // r0.tl
    public long y(p pVar) throws IOException {
        this.n3.n3(this.zn);
        return this.y.y(pVar);
    }
}
