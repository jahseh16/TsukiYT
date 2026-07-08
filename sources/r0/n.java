package r0;

import androidx.annotation.Nullable;
import ft.q;
import java.io.FileNotFoundException;
import java.io.IOException;
import r0.d0;
import r0.mg;
import r0.ta;

/* JADX INFO: loaded from: classes.dex */
public class n implements mg {
    public final int y;

    public n() {
        this(-1);
    }

    @Override // r0.mg
    public /* synthetic */ void gv(long j) {
        rz.y(this, j);
    }

    @Override // r0.mg
    @Nullable
    public mg.n3 n3(mg.y yVar, mg.zn znVar) {
        if (!v(znVar.zn)) {
            return null;
        }
        if (yVar.y(1)) {
            return new mg.n3(1, 300000L);
        }
        if (yVar.y(2)) {
            return new mg.n3(2, 60000L);
        }
        return null;
    }

    public boolean v(IOException iOException) {
        if (!(iOException instanceof d0.v)) {
            return false;
        }
        int i = ((d0.v) iOException).responseCode;
        return i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503;
    }

    @Override // r0.mg
    public long y(mg.zn znVar) {
        IOException iOException = znVar.zn;
        if ((iOException instanceof q) || (iOException instanceof FileNotFoundException) || (iOException instanceof d0.y) || (iOException instanceof ta.s) || wz.y(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((znVar.f7513gv - 1) * 1000, 5000);
    }

    @Override // r0.mg
    public int zn(int i) {
        int i5 = this.y;
        return i5 == -1 ? i == 7 ? 6 : 3 : i5;
    }

    public n(int i) {
        this.y = i;
    }
}
