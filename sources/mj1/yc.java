package mj1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes.dex */
public final class yc {
    public static final kj1.a[] y = new kj1.a[0];

    public static final Void gv(KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        throw new ij1.i9("Serializer for class '" + kClass.getSimpleName() + "' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
    }

    public static final kj1.a[] n3(List<? extends kj1.a> list) {
        List<? extends kj1.a> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        if (list != null) {
            Object[] array = list.toArray(new kj1.a[0]);
            Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            kj1.a[] aVarArr = (kj1.a[]) array;
            if (aVarArr != null) {
                return aVarArr;
            }
        }
        return y;
    }

    public static final Set<String> y(kj1.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof wz) {
            return ((wz) aVar).y();
        }
        HashSet hashSet = new HashSet(aVar.gv());
        int iGv = aVar.gv();
        for (int i = 0; i < iGv; i++) {
            hashSet.add(aVar.v(i));
        }
        return hashSet;
    }

    public static final KClass<Object> zn(KType kType) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KClass) {
            return (KClass) classifier;
        }
        throw new IllegalStateException(("Only KClass supported as classifier, got " + classifier).toString());
    }
}
