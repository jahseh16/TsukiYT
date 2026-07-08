package lf;

/* JADX INFO: loaded from: classes.dex */
public final class a8 {
    public static long gv(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }

    public static boolean n3(byte[] bArr, int i, int i5, int i8) {
        int i10 = 0;
        for (int i11 = -4; i11 <= 4; i11++) {
            int i12 = (i11 * 188) + i8;
            if (i12 < i || i12 >= i5 || bArr[i12] != 71) {
                i10 = 0;
            } else {
                i10++;
                if (i10 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int y(byte[] bArr, int i, int i5) {
        while (i < i5 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zn(v0.d dVar, int i, int i5) {
        dVar.oz(i);
        if (dVar.y() < 5) {
            return -9223372036854775807L;
        }
        int iP = dVar.p();
        if ((8388608 & iP) != 0 || ((2096896 & iP) >> 8) != i5 || (iP & 32) == 0 || dVar.ej() < 7 || dVar.y() < 7 || (dVar.ej() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        dVar.t(bArr, 0, 6);
        return gv(bArr);
    }
}
