package b1;

import androidx.annotation.Nullable;
import bp.n3;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final v0.d y = new v0.d(10);

    @Nullable
    public Metadata y(tl tlVar, @Nullable n3.y yVar) throws IOException {
        Metadata metadataV = null;
        int i = 0;
        while (true) {
            try {
                tlVar.z(this.y.v(), 0, 10);
                this.y.oz(0);
                if (this.y.x() != 4801587) {
                    break;
                }
                this.y.ut(3);
                int iZ6 = this.y.z6();
                int i5 = iZ6 + 10;
                if (metadataV == null) {
                    byte[] bArr = new byte[i5];
                    System.arraycopy(this.y.v(), 0, bArr, 0, 10);
                    tlVar.z(bArr, 10, iZ6);
                    metadataV = new bp.n3(yVar).v(bArr, i5);
                } else {
                    tlVar.tl(iZ6);
                }
                i += i5;
            } catch (EOFException unused) {
            }
        }
        tlVar.s();
        tlVar.tl(i);
        return metadataV;
    }
}
