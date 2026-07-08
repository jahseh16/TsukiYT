package b1;

import androidx.annotation.Nullable;
import b1.ta;
import ft.g;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ta {
    public final byte[] y = new byte[4096];

    @Override // b1.ta
    public int gv(r0.c5 c5Var, int i, boolean z, int i5) throws IOException {
        int i8 = c5Var.read(this.y, 0, Math.min(this.y.length, i));
        if (i8 != -1) {
            return i8;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // b1.ta
    public /* synthetic */ void n3(v0.d dVar, int i) {
        mg.n3(this, dVar, i);
    }

    @Override // b1.ta
    public /* synthetic */ int v(r0.c5 c5Var, int i, boolean z) {
        return mg.y(this, c5Var, i, z);
    }

    @Override // b1.ta
    public void zn(v0.d dVar, int i, int i5) {
        dVar.ut(i);
    }

    @Override // b1.ta
    public void y(g gVar) {
    }

    @Override // b1.ta
    public void a(long j, int i, int i5, int i8, @Nullable ta.y yVar) {
    }
}
