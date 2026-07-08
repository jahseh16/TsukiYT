package n4;

import com.google.protobuf.Reader;
import g4.xc;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class a extends fb {

    public static class y extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final int[] array;
        final int end;
        final int start;

        public y(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && a.i9(this.array, ((Integer) obj).intValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof y)) {
                return super.equals(obj);
            }
            y yVar = (y) obj;
            int size = size();
            if (yVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != yVar.array[yVar.start + i]) {
                    return false;
                }
            }
            return true;
        }

        public int[] gv() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iS = 1;
            for (int i = this.start; i < this.end; i++) {
                iS = (iS * 31) + a.s(this.array[i]);
            }
            return iS;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iI9;
            if (!(obj instanceof Integer) || (iI9 = a.i9(this.array, ((Integer) obj).intValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iI9 - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iF;
            if (!(obj instanceof Integer) || (iF = a.f(this.array, ((Integer) obj).intValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iF - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public Integer set(int i, Integer num) {
            xc.i9(i, size());
            int[] iArr = this.array;
            int i5 = this.start;
            int i8 = iArr[i5 + i];
            iArr[i5 + i] = ((Integer) xc.t(num)).intValue();
            return Integer.valueOf(i8);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i, int i5) {
            xc.w(i, i5, size());
            if (i == i5) {
                return Collections.emptyList();
            }
            int[] iArr = this.array;
            int i8 = this.start;
            return new y(iArr, i + i8, i8 + i5);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i >= this.end) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.array[i]);
            }
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Integer get(int i) {
            xc.i9(i, size());
            return Integer.valueOf(this.array[this.start + i]);
        }

        public y(int[] iArr, int i, int i5) {
            this.array = iArr;
            this.start = i;
            this.end = i5;
        }
    }

    public static int a(int i, int i5, int i8) {
        xc.fb(i5 <= i8, "min (%s) must be less than or equal to max (%s)", i5, i8);
        return Math.min(Math.max(i, i5), i8);
    }

    public static int c5(int[] iArr, int i) {
        return i9(iArr, i, 0, iArr.length);
    }

    public static int f(int[] iArr, int i, int i5, int i8) {
        for (int i10 = i8 - 1; i10 >= i5; i10--) {
            if (iArr[i10] == i) {
                return i10;
            }
        }
        return -1;
    }

    public static int fb(byte b4, byte b6, byte b7, byte b8) {
        return (b4 << 24) | ((b6 & 255) << 16) | ((b7 & 255) << 8) | (b8 & 255);
    }

    public static int gv(long j) {
        int i = (int) j;
        xc.c5(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int i9(int[] iArr, int i, int i5, int i8) {
        while (i5 < i8) {
            if (iArr[i5] == i) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static int t(int... iArr) {
        xc.gv(iArr.length > 0);
        int i = iArr[0];
        for (int i5 = 1; i5 < iArr.length; i5++) {
            int i8 = iArr[i5];
            if (i8 < i) {
                i = i8;
            }
        }
        return i;
    }

    public static int tl(long j) {
        if (j > 2147483647L) {
            return Reader.READ_DONE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int v(int i, int i5) {
        if (i < i5) {
            return -1;
        }
        return i > i5 ? 1 : 0;
    }

    public static int[] wz(Collection<? extends Number> collection) {
        if (collection instanceof y) {
            return ((y) collection).gv();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) xc.t(array[i])).intValue();
        }
        return iArr;
    }

    public static List<Integer> zn(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new y(iArr);
    }

    public static int s(int i) {
        return i;
    }
}
