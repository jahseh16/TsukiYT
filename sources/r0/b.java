package r0;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import r0.tl;

/* JADX INFO: loaded from: classes.dex */
public final class b implements tl {
    public final n3 n3;
    public final tl y;
    public boolean zn;

    public interface n3 {
        Uri n3(Uri uri);

        p y(p pVar) throws IOException;
    }

    public static final class y implements tl.y {
        public final n3 n3;
        public final tl.y y;

        public y(tl.y yVar, n3 n3Var) {
            this.y = yVar;
            this.n3 = n3Var;
        }

        @Override // r0.tl.y
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public b y() {
            return new b(this.y.y(), this.n3);
        }
    }

    public b(tl tlVar, n3 n3Var) {
        this.y = tlVar;
        this.n3 = n3Var;
    }

    @Override // r0.tl
    public void close() throws IOException {
        if (this.zn) {
            this.zn = false;
            this.y.close();
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
        Uri uriN3 = this.y.n3();
        if (uriN3 == null) {
            return null;
        }
        return this.n3.n3(uriN3);
    }

    @Override // r0.c5
    public int read(byte[] bArr, int i, int i5) throws IOException {
        return this.y.read(bArr, i, i5);
    }

    @Override // r0.tl
    public long y(p pVar) throws IOException {
        p pVarY = this.n3.y(pVar);
        this.zn = true;
        return this.y.y(pVarY);
    }
}
