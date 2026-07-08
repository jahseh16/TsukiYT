package r0;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;
import r0.tl;

/* JADX INFO: loaded from: classes.dex */
public final class ud implements tl {
    public static final ud y = new ud();
    public static final tl.y n3 = new tl.y() { // from class: r0.ej
        @Override // r0.tl.y
        public final tl y() {
            return ud.a();
        }
    };

    public static /* synthetic */ ud a() {
        return new ud();
    }

    @Override // r0.tl
    public /* synthetic */ Map fb() {
        return t.y(this);
    }

    @Override // r0.tl
    @Nullable
    public Uri n3() {
        return null;
    }

    @Override // r0.c5
    public int read(byte[] bArr, int i, int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // r0.tl
    public long y(p pVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // r0.tl
    public void close() {
    }

    @Override // r0.tl
    public void co(o oVar) {
    }
}
