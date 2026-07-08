package ej;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class fb {
    public static <T> T[] n3(T[] tArr, int i, T t3) {
        if (i + 1 > tArr.length) {
            Object[] objArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), zn(i));
            System.arraycopy(tArr, 0, objArr, 0, i);
            tArr = (T[]) objArr;
        }
        tArr[i] = t3;
        return tArr;
    }

    public static int[] y(int[] iArr, int i, int i5) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[zn(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i5;
        return iArr;
    }

    public static int zn(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }
}
