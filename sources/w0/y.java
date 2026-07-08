package w0;

import androidx.annotation.Nullable;
import ft.q;
import java.util.ArrayList;
import java.util.List;
import v0.c;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f8943a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f8944gv;
    public final int n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f8945v;
    public final List<byte[]> y;
    public final int zn;

    public y(List<byte[]> list, int i, int i5, int i8, float f3, @Nullable String str) {
        this.y = list;
        this.n3 = i;
        this.zn = i5;
        this.f8944gv = i8;
        this.f8945v = f3;
        this.f8943a = str;
    }

    public static y n3(d dVar) throws q {
        String strY;
        int i;
        int i5;
        float f3;
        try {
            dVar.ut(4);
            int iEj = (dVar.ej() & 3) + 1;
            if (iEj == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iEj2 = dVar.ej() & 31;
            for (int i8 = 0; i8 < iEj2; i8++) {
                arrayList.add(y(dVar));
            }
            int iEj3 = dVar.ej();
            for (int i10 = 0; i10 < iEj3; i10++) {
                arrayList.add(y(dVar));
            }
            if (iEj2 > 0) {
                c.zn znVarT = v0.c.t((byte[]) arrayList.get(0), iEj, ((byte[]) arrayList.get(0)).length);
                int i11 = znVarT.f8727a;
                int i12 = znVarT.f8730fb;
                float f4 = znVarT.f8733s;
                strY = v0.a.y(znVarT.y, znVarT.n3, znVarT.zn);
                i = i11;
                i5 = i12;
                f3 = f4;
            } else {
                strY = null;
                i = -1;
                i5 = -1;
                f3 = 1.0f;
            }
            return new y(arrayList, iEj, i, i5, f3, strY);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw q.y("Error parsing AVC config", e4);
        }
    }

    public static byte[] y(d dVar) {
        int iYt = dVar.yt();
        int iA = dVar.a();
        dVar.ut(iYt);
        return v0.a.gv(dVar.v(), iA, iYt);
    }
}
