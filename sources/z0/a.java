package z0;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.zip.Inflater;
import v0.d;
import v0.ta;
import v0.ut;
import z0.v;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    @Nullable
    public static ArrayList<v.y> a(d dVar) {
        int iP;
        dVar.ut(8);
        int iA = dVar.a();
        int iFb = dVar.fb();
        while (iA < iFb && (iP = dVar.p() + iA) > iA && iP <= iFb) {
            int iP2 = dVar.p();
            if (iP2 == 2037673328 || iP2 == 1836279920) {
                dVar.j(iP);
                return v(dVar);
            }
            dVar.oz(iP);
            iA = iP;
        }
        return null;
    }

    @Nullable
    public static ArrayList<v.y> fb(d dVar) {
        ArrayList<v.y> arrayList = new ArrayList<>();
        int iA = dVar.a();
        int iFb = dVar.fb();
        while (iA < iFb) {
            int iP = dVar.p() + iA;
            if (iP <= iA || iP > iFb) {
                return null;
            }
            if (dVar.p() == 1835365224) {
                v.y yVarGv = gv(dVar);
                if (yVarGv == null) {
                    return null;
                }
                arrayList.add(yVarGv);
            }
            dVar.oz(iP);
            iA = iP;
        }
        return arrayList;
    }

    @Nullable
    public static v.y gv(d dVar) {
        int iP = dVar.p();
        if (iP > 10000) {
            return null;
        }
        float[] fArr = new float[iP];
        for (int i = 0; i < iP; i++) {
            fArr[i] = dVar.w();
        }
        int iP2 = dVar.p();
        if (iP2 > 32000) {
            return null;
        }
        double d4 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) iP) * 2.0d) / dLog);
        ta taVar = new ta(dVar.v());
        int i5 = 8;
        taVar.w(dVar.a() * 8);
        float[] fArr2 = new float[iP2 * 5];
        int i8 = 5;
        int[] iArr = new int[5];
        int i10 = 0;
        int i11 = 0;
        while (i10 < iP2) {
            int i12 = 0;
            while (i12 < i8) {
                int iN3 = iArr[i12] + n3(taVar.s(iCeil));
                if (iN3 >= iP || iN3 < 0) {
                    return null;
                }
                fArr2[i11] = fArr[iN3];
                iArr[i12] = iN3;
                i12++;
                i11++;
                i8 = 5;
            }
            i10++;
            i8 = 5;
        }
        taVar.w((taVar.v() + 7) & (-8));
        int i13 = 32;
        int iS = taVar.s(32);
        v.n3[] n3VarArr = new v.n3[iS];
        int i14 = 0;
        while (i14 < iS) {
            int iS2 = taVar.s(i5);
            int iS3 = taVar.s(i5);
            int iS4 = taVar.s(i13);
            if (iS4 > 128000) {
                return null;
            }
            int iCeil2 = (int) Math.ceil(Math.log(((double) iP2) * d4) / dLog);
            float[] fArr3 = new float[iS4 * 3];
            float[] fArr4 = new float[iS4 * 2];
            int iN32 = 0;
            for (int i15 = 0; i15 < iS4; i15++) {
                iN32 += n3(taVar.s(iCeil2));
                if (iN32 < 0 || iN32 >= iP2) {
                    return null;
                }
                int i16 = i15 * 3;
                int i17 = iN32 * 5;
                fArr3[i16] = fArr2[i17];
                fArr3[i16 + 1] = fArr2[i17 + 1];
                fArr3[i16 + 2] = fArr2[i17 + 2];
                int i18 = i15 * 2;
                fArr4[i18] = fArr2[i17 + 3];
                fArr4[i18 + 1] = fArr2[i17 + 4];
            }
            n3VarArr[i14] = new v.n3(iS2, fArr3, fArr4, iS3);
            i14++;
            i13 = 32;
            d4 = 2.0d;
            i5 = 8;
        }
        return new v.y(n3VarArr);
    }

    public static int n3(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    @Nullable
    public static ArrayList<v.y> v(d dVar) {
        if (dVar.ej() != 0) {
            return null;
        }
        dVar.ut(7);
        int iP = dVar.p();
        if (iP == 1684433976) {
            d dVar2 = new d();
            Inflater inflater = new Inflater(true);
            try {
                if (!ut.rb(dVar, dVar2, inflater)) {
                    return null;
                }
                inflater.end();
                dVar = dVar2;
            } finally {
                inflater.end();
            }
        } else if (iP != 1918990112) {
            return null;
        }
        return fb(dVar);
    }

    @Nullable
    public static v y(byte[] bArr, int i) {
        ArrayList<v.y> arrayListA;
        d dVar = new d(bArr);
        try {
            arrayListA = zn(dVar) ? a(dVar) : v(dVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListA = null;
        }
        if (arrayListA == null) {
            return null;
        }
        int size = arrayListA.size();
        if (size == 1) {
            return new v(arrayListA.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new v(arrayListA.get(0), arrayListA.get(1), i);
    }

    public static boolean zn(d dVar) {
        dVar.ut(4);
        int iP = dVar.p();
        dVar.oz(0);
        return iP == 1886547818;
    }
}
