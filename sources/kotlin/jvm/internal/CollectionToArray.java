package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class CollectionToArray {
    private static final Object[] EMPTY = new Object[0];

    public static final Object[] toArray(Collection<?> collection, Object[] objArr) {
        Object[] objArrCopyOf;
        Intrinsics.checkNotNullParameter(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i5 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i5 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i8 = ((i5 * 3) + 1) >>> 1;
                if (i8 <= i5) {
                    i8 = 2147483645;
                    if (i5 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i8);
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i5] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i5);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i = i5;
        }
    }

    public static final Object[] toArray(Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i = 0;
                while (true) {
                    int i5 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i5 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i8 = ((i5 * 3) + 1) >>> 1;
                        if (i8 <= i5) {
                            i8 = 2147483645;
                            if (i5 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i8);
                    } else if (!it.hasNext()) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i5);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i = i5;
                }
            }
        }
        return EMPTY;
    }
}
