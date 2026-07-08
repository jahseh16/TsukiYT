package kotlin.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class ArraysKt___ArraysJvmKt extends ArraysKt__ArraysKt {

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractList<Byte> implements RandomAccess {
        final /* synthetic */ byte[] $this_asList;

        public AnonymousClass1(byte[] bArr) {
            this.$this_asList = bArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Byte) {
                return contains(((Number) obj).byteValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Byte) {
                return indexOf(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                return lastIndexOf(((Number) obj).byteValue());
            }
            return -1;
        }

        public boolean contains(byte b4) {
            return ArraysKt.contains(this.$this_asList, b4);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public Byte get(int i) {
            return Byte.valueOf(this.$this_asList[i]);
        }

        public int indexOf(byte b4) {
            return ArraysKt___ArraysKt.indexOf(this.$this_asList, b4);
        }

        public int lastIndexOf(byte b4) {
            return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, b4);
        }
    }

    public static <T> List<T> asList(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        List<T> listAsList = ArraysUtilJVM.asList(tArr);
        Intrinsics.checkNotNullExpressionValue(listAsList, "asList(...)");
        return listAsList;
    }

    public static <T> T[] copyInto(T[] tArr, T[] destination, int i, int i5, int i8) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(tArr, i5, destination, i, i8 - i5);
        return destination;
    }

    public static /* synthetic */ Object[] copyInto$default(Object[] objArr, Object[] objArr2, int i, int i5, int i8, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        if ((i10 & 4) != 0) {
            i5 = 0;
        }
        if ((i10 & 8) != 0) {
            i8 = objArr.length;
        }
        return ArraysKt.copyInto(objArr, objArr2, i, i5, i8);
    }

    public static <T> T[] copyOfRange(T[] tArr, int i, int i5) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i5, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i5);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    public static <T> void fill(T[] tArr, T t3, int i, int i5) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Arrays.fill(tArr, i, i5, t3);
    }

    public static /* synthetic */ void fill$default(Object[] objArr, Object obj, int i, int i5, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            i = 0;
        }
        if ((i8 & 4) != 0) {
            i5 = objArr.length;
        }
        ArraysKt.fill(objArr, obj, i, i5);
    }

    public static <T> T[] plus(T[] tArr, T[] elements) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, tArr2, length, length2);
        Intrinsics.checkNotNull(tArr2);
        return tArr2;
    }

    public static <T> void sort(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void sortWith(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static final List<Byte> asList(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new AnonymousClass1(bArr);
    }

    public static byte[] copyInto(byte[] bArr, byte[] destination, int i, int i5, int i8) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i5, destination, i, i8 - i5);
        return destination;
    }

    public static /* synthetic */ byte[] copyInto$default(byte[] bArr, byte[] bArr2, int i, int i5, int i8, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        if ((i10 & 4) != 0) {
            i5 = 0;
        }
        if ((i10 & 8) != 0) {
            i8 = bArr.length;
        }
        return ArraysKt.copyInto(bArr, bArr2, i, i5, i8);
    }

    public static byte[] copyOfRange(byte[] bArr, int i, int i5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i5, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i5);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static byte[] plus(byte[] bArr, byte[] elements) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        Intrinsics.checkNotNull(bArrCopyOf);
        return bArrCopyOf;
    }

    public static int[] plus(int[] iArr, int[] elements) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        Intrinsics.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    public static long[] plus(long[] jArr, long[] elements) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, jArrCopyOf, length, length2);
        Intrinsics.checkNotNull(jArrCopyOf);
        return jArrCopyOf;
    }

    public static float[] plus(float[] fArr, float[] elements) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, fArrCopyOf, length, length2);
        Intrinsics.checkNotNull(fArrCopyOf);
        return fArrCopyOf;
    }

    public static boolean[] plus(boolean[] zArr, boolean[] elements) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, zArrCopyOf, length, length2);
        Intrinsics.checkNotNull(zArrCopyOf);
        return zArrCopyOf;
    }
}
