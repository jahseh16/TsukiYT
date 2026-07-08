package r0;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qn implements tl {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long f7533gv;
    public final f n3;
    public final tl y;
    public boolean zn;

    public qn(tl tlVar, f fVar) {
        this.y = (tl) v0.y.v(tlVar);
        this.n3 = (f) v0.y.v(fVar);
    }

    @Override // r0.tl
    public void close() throws IOException {
        try {
            this.y.close();
        } finally {
            if (this.zn) {
                this.zn = false;
                this.n3.close();
            }
        }
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
        if (this.f7533gv == 0) {
            return -1;
        }
        int i8 = this.y.read(bArr, i, i5);
        if (i8 > 0) {
            this.n3.write(bArr, i, i8);
            long j = this.f7533gv;
            if (j != -1) {
                this.f7533gv = j - ((long) i8);
            }
        }
        return i8;
    }

    @Override // r0.tl
    public long y(p pVar) throws IOException {
        long jY = this.y.y(pVar);
        this.f7533gv = jY;
        if (jY == 0) {
            return 0L;
        }
        if (pVar.f7524s == -1 && jY != -1) {
            pVar = pVar.a(0L, jY);
        }
        this.zn = true;
        this.n3.y(pVar);
        return this.f7533gv;
    }
}
