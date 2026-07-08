package tn;

import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class gv {

    public static final class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8271a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final long[] f8272gv;
        public final int[] n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int[] f8273v;
        public final long[] y;
        public final int zn;

        public n3(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.y = jArr;
            this.n3 = iArr;
            this.zn = i;
            this.f8272gv = jArr2;
            this.f8273v = iArr2;
            this.f8271a = j;
        }
    }

    public static n3 y(int i, long[] jArr, int[] iArr, long j) {
        int i5 = 8192 / i;
        int iT = 0;
        for (int i8 : iArr) {
            iT += ut.t(i8, i5);
        }
        long[] jArr2 = new long[iT];
        int[] iArr2 = new int[iT];
        long[] jArr3 = new long[iT];
        int[] iArr3 = new int[iT];
        int i10 = 0;
        int i11 = 0;
        int iMax = 0;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            long j4 = jArr[i12];
            while (i13 > 0) {
                int iMin = Math.min(i5, i13);
                jArr2[i11] = j4;
                int i14 = i * iMin;
                iArr2[i11] = i14;
                iMax = Math.max(iMax, i14);
                jArr3[i11] = ((long) i10) * j;
                iArr3[i11] = 1;
                j4 += (long) iArr2[i11];
                i10 += iMin;
                i13 -= iMin;
                i11++;
            }
        }
        return new n3(jArr2, iArr2, iMax, jArr3, iArr3, j * ((long) i10));
    }
}
