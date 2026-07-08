package lb;

/* JADX INFO: loaded from: classes.dex */
public final class t {
    public static String y(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i5 = 0; i5 < i; i5++) {
            int i8 = iArr[i5];
            if (i8 == 1 || i8 == 2) {
                sb.append('[');
                sb.append(iArr2[i5]);
                sb.append(']');
            } else if (i8 == 3 || i8 == 4 || i8 == 5) {
                sb.append('.');
                String str = strArr[i5];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }
}
