package k4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class t {
    public static int a(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i5;
        int i8;
        int iZn = mt.zn(obj);
        int i10 = iZn & i;
        int iS = s(obj3, i10);
        if (iS == 0) {
            return -1;
        }
        int iN3 = n3(iZn, i);
        int i11 = -1;
        while (true) {
            i5 = iS - 1;
            i8 = iArr[i5];
            if (n3(i8, i) == iN3 && g4.f.y(obj, objArr[i5]) && (objArr2 == null || g4.f.y(obj2, objArr2[i5]))) {
                break;
            }
            int iZn2 = zn(i8, i);
            if (iZn2 == 0) {
                return -1;
            }
            i11 = i5;
            iS = iZn2;
        }
        int iZn3 = zn(i8, i);
        if (i11 == -1) {
            c5(obj3, i10, iZn3);
        } else {
            iArr[i11] = gv(iArr[i11], iZn3, i);
        }
        return i5;
    }

    public static void c5(Object obj, int i, int i5) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i5;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i5;
        } else {
            ((int[]) obj)[i] = i5;
        }
    }

    public static void fb(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    public static int gv(int i, int i5, int i8) {
        return (i & (~i8)) | (i5 & i8);
    }

    public static int i9(int i) {
        return Math.max(4, mt.y(i + 1, 1.0d));
    }

    public static int n3(int i, int i5) {
        return i & (~i5);
    }

    public static int s(Object obj, int i) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static int v(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    public static Object y(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int zn(int i, int i5) {
        return i & i5;
    }
}
