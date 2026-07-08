package ur;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public interface u {

    public static final class n3 implements u {
        public final int y;

        public n3(int i) {
            this.y = i;
        }

        @Override // ur.u
        public u a(int i, int i5) {
            return new n3(this.y + i5);
        }

        @Override // ur.u
        public int getLength() {
            return this.y;
        }

        @Override // ur.u
        public u gv() {
            return new n3(0);
        }

        @Override // ur.u
        public int n3(int i) {
            int i5 = i - 1;
            if (i5 >= 0) {
                return i5;
            }
            return -1;
        }

        @Override // ur.u
        public int v() {
            return this.y > 0 ? 0 : -1;
        }

        @Override // ur.u
        public u y(int i, int i5) {
            return new n3((this.y - i5) + i);
        }

        @Override // ur.u
        public int z() {
            int i = this.y;
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }

        @Override // ur.u
        public int zn(int i) {
            int i5 = i + 1;
            if (i5 < this.y) {
                return i5;
            }
            return -1;
        }
    }

    public static class y implements u {
        public final int[] n3;
        public final Random y;
        public final int[] zn;

        public y(int i) {
            this(i, new Random());
        }

        public static int[] fb(int i, Random random) {
            int[] iArr = new int[i];
            int i5 = 0;
            while (i5 < i) {
                int i8 = i5 + 1;
                int iNextInt = random.nextInt(i8);
                iArr[i5] = iArr[iNextInt];
                iArr[iNextInt] = i5;
                i5 = i8;
            }
            return iArr;
        }

        @Override // ur.u
        public u a(int i, int i5) {
            int[] iArr = new int[i5];
            int[] iArr2 = new int[i5];
            int i8 = 0;
            int i10 = 0;
            while (i10 < i5) {
                iArr[i10] = this.y.nextInt(this.n3.length + 1);
                int i11 = i10 + 1;
                int iNextInt = this.y.nextInt(i11);
                iArr2[i10] = iArr2[iNextInt];
                iArr2[iNextInt] = i10 + i;
                i10 = i11;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.n3.length + i5];
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int[] iArr4 = this.n3;
                if (i8 >= iArr4.length + i5) {
                    return new y(iArr3, new Random(this.y.nextLong()));
                }
                if (i12 >= i5 || i13 != iArr[i12]) {
                    int i14 = i13 + 1;
                    int i15 = iArr4[i13];
                    iArr3[i8] = i15;
                    if (i15 >= i) {
                        iArr3[i8] = i15 + i5;
                    }
                    i13 = i14;
                } else {
                    iArr3[i8] = iArr2[i12];
                    i12++;
                }
                i8++;
            }
        }

        @Override // ur.u
        public int getLength() {
            return this.n3.length;
        }

        @Override // ur.u
        public u gv() {
            return new y(0, new Random(this.y.nextLong()));
        }

        @Override // ur.u
        public int n3(int i) {
            int i5 = this.zn[i] - 1;
            if (i5 >= 0) {
                return this.n3[i5];
            }
            return -1;
        }

        @Override // ur.u
        public int v() {
            int[] iArr = this.n3;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // ur.u
        public u y(int i, int i5) {
            int i8 = i5 - i;
            int[] iArr = new int[this.n3.length - i8];
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int[] iArr2 = this.n3;
                if (i10 >= iArr2.length) {
                    return new y(iArr, new Random(this.y.nextLong()));
                }
                int i12 = iArr2[i10];
                if (i12 < i || i12 >= i5) {
                    int i13 = i10 - i11;
                    if (i12 >= i) {
                        i12 -= i8;
                    }
                    iArr[i13] = i12;
                } else {
                    i11++;
                }
                i10++;
            }
        }

        @Override // ur.u
        public int z() {
            int[] iArr = this.n3;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // ur.u
        public int zn(int i) {
            int i5 = this.zn[i] + 1;
            int[] iArr = this.n3;
            if (i5 < iArr.length) {
                return iArr[i5];
            }
            return -1;
        }

        public y(int i, Random random) {
            this(fb(i, random), random);
        }

        public y(int[] iArr, Random random) {
            this.n3 = iArr;
            this.y = random;
            this.zn = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.zn[iArr[i]] = i;
            }
        }
    }

    u a(int i, int i5);

    int getLength();

    u gv();

    int n3(int i);

    int v();

    u y(int i, int i5);

    int z();

    int zn(int i);
}
