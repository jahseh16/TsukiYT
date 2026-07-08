package w0;

import androidx.annotation.Nullable;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class gv {
    public final int n3;
    public final int y;
    public final String zn;

    public gv(int i, int i5, String str) {
        this.y = i;
        this.n3 = i5;
        this.zn = str;
    }

    @Nullable
    public static gv y(d dVar) {
        String str;
        dVar.ut(2);
        int iEj = dVar.ej();
        int i = iEj >> 1;
        int iEj2 = ((dVar.ej() >> 3) & 31) | ((iEj & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(iEj2 >= 10 ? "." : ".0");
        sb.append(iEj2);
        return new gv(i, iEj2, sb.toString());
    }
}
