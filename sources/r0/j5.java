package r0;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j5 implements tl {
    public long n3;
    public final tl y;
    public Uri zn = Uri.EMPTY;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public Map<String, List<String>> f7511gv = Collections.emptyMap();

    public j5(tl tlVar) {
        this.y = (tl) v0.y.v(tlVar);
    }

    public long a() {
        return this.n3;
    }

    public Uri c5() {
        return this.zn;
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

    public Map<String, List<String>> p() {
        return this.f7511gv;
    }

    public void r() {
        this.n3 = 0L;
    }

    @Override // r0.c5
    public int read(byte[] bArr, int i, int i5) throws IOException {
        int i8 = this.y.read(bArr, i, i5);
        if (i8 != -1) {
            this.n3 += (long) i8;
        }
        return i8;
    }

    @Override // r0.tl
    public long y(p pVar) throws IOException {
        this.zn = pVar.y;
        this.f7511gv = Collections.emptyMap();
        long jY = this.y.y(pVar);
        this.zn = (Uri) v0.y.v(n3());
        this.f7511gv = fb();
        return jY;
    }
}
