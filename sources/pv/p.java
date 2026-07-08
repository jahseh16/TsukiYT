package pv;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f7393gv;
    public final int[] n3;
    public final String[] y;
    public final String[] zn;

    public p(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.y = strArr;
        this.n3 = iArr;
        this.zn = strArr2;
        this.f7393gv = i;
    }

    public static p n3(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new p(strArr, iArr, strArr2, zn(str, strArr, iArr, strArr2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zn(java.lang.String r12, java.lang.String[] r13, int[] r14, java.lang.String[] r15) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.p.zn(java.lang.String, java.lang.String[], int[], java.lang.String[]):int");
    }

    public String y(String str, long j, int i, long j4) {
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        while (true) {
            int i8 = this.f7393gv;
            if (i5 >= i8) {
                sb.append(this.y[i8]);
                return sb.toString();
            }
            sb.append(this.y[i5]);
            int i10 = this.n3[i5];
            if (i10 == 1) {
                sb.append(str);
            } else if (i10 == 2) {
                sb.append(String.format(Locale.US, this.zn[i5], Long.valueOf(j)));
            } else if (i10 == 3) {
                sb.append(String.format(Locale.US, this.zn[i5], Integer.valueOf(i)));
            } else if (i10 == 4) {
                sb.append(String.format(Locale.US, this.zn[i5], Long.valueOf(j4)));
            }
            i5++;
        }
    }
}
