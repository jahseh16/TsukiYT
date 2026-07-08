package w0;

import androidx.annotation.Nullable;
import ft.q;
import java.util.Collections;
import java.util.List;
import v0.c;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8857a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public final String f8858c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f8859fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f8860gv;
    public final int n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8861s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f8862v;
    public final List<byte[]> y;
    public final int zn;

    public a(List<byte[]> list, int i, int i5, int i8, float f3, @Nullable String str, int i10, int i11, int i12) {
        this.y = list;
        this.n3 = i;
        this.zn = i5;
        this.f8860gv = i8;
        this.f8862v = f3;
        this.f8858c5 = str;
        this.f8857a = i10;
        this.f8859fb = i11;
        this.f8861s = i12;
    }

    public static a y(d dVar) throws q {
        int i;
        int i5;
        try {
            dVar.ut(21);
            int iEj = dVar.ej() & 3;
            int iEj2 = dVar.ej();
            int iA = dVar.a();
            int i8 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < iEj2; i11++) {
                dVar.ut(1);
                int iYt = dVar.yt();
                for (int i12 = 0; i12 < iYt; i12++) {
                    int iYt2 = dVar.yt();
                    i10 += iYt2 + 4;
                    dVar.ut(iYt2);
                }
            }
            dVar.oz(iA);
            byte[] bArr = new byte[i10];
            String strZn = null;
            int i13 = 0;
            int i14 = 0;
            int i15 = -1;
            int i16 = -1;
            float f3 = 1.0f;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            while (i13 < iEj2) {
                int iEj3 = dVar.ej() & 63;
                int iYt3 = dVar.yt();
                int i20 = 0;
                while (i20 < iYt3) {
                    int iYt4 = dVar.yt();
                    byte[] bArr2 = v0.c.y;
                    int i21 = iEj2;
                    System.arraycopy(bArr2, i8, bArr, i14, bArr2.length);
                    int length = i14 + bArr2.length;
                    System.arraycopy(dVar.v(), dVar.a(), bArr, length, iYt4);
                    if (iEj3 == 33 && i20 == 0) {
                        c.y yVarS = v0.c.s(bArr, length, length + iYt4);
                        int i22 = yVarS.f8723s;
                        i16 = yVarS.f8718c5;
                        int i23 = yVarS.f8719f;
                        int i24 = yVarS.f8724t;
                        int i25 = yVarS.f8725tl;
                        float f4 = yVarS.f8722i9;
                        i = iEj3;
                        i5 = iYt3;
                        i15 = i22;
                        i19 = i25;
                        strZn = v0.a.zn(yVarS.y, yVarS.n3, yVarS.zn, yVarS.f8721gv, yVarS.f8726v, yVarS.f8717a);
                        i18 = i24;
                        f3 = f4;
                        i17 = i23;
                    } else {
                        i = iEj3;
                        i5 = iYt3;
                    }
                    i14 = length + iYt4;
                    dVar.ut(iYt4);
                    i20++;
                    iEj2 = i21;
                    iEj3 = i;
                    iYt3 = i5;
                    i8 = 0;
                }
                i13++;
                i8 = 0;
            }
            return new a(i10 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iEj + 1, i15, i16, f3, strZn, i17, i18, i19);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw q.y("Error parsing HEVC config", e4);
        }
    }
}
