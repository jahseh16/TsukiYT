package ij1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import mj1.en;
import mj1.k;
import mj1.k5;
import mj1.tg;
import mj1.vl;
import mj1.yc;
import mj1.yg;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wz {
    public static final zn<Object> a(pj1.zn znVar, KType kType, boolean z) {
        zn<Object> znVarY;
        zn<? extends Object> znVarN3;
        KClass<Object> kClassZn = yc.zn(kType);
        boolean zIsMarkedNullable = kType.isMarkedNullable();
        List<KTypeProjection> arguments = kType.getArguments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arguments, 10));
        Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            KType type = ((KTypeProjection) it.next()).getType();
            if (type == null) {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kType).toString());
            }
            arrayList.add(type);
        }
        if (arrayList.isEmpty()) {
            znVarY = t.y(kClassZn, zIsMarkedNullable);
        } else {
            Object objN3 = t.n3(kClassZn, arrayList, zIsMarkedNullable);
            if (z) {
                if (Result.m36isFailureimpl(objN3)) {
                    objN3 = null;
                }
                znVarY = (zn) objN3;
            } else {
                if (Result.m34exceptionOrNullimpl(objN3) != null) {
                    return null;
                }
                znVarY = (zn) objN3;
            }
        }
        if (znVarY != null) {
            return znVarY;
        }
        if (arrayList.isEmpty()) {
            znVarN3 = pj1.zn.zn(znVar, kClassZn, null, 2, null);
        } else {
            List<zn<Object>> listV = tl.v(znVar, arrayList, z);
            if (listV == null) {
                return null;
            }
            zn<? extends Object> znVarY2 = tl.y(kClassZn, arrayList, listV);
            znVarN3 = znVarY2 == null ? znVar.n3(kClassZn, listV) : znVarY2;
        }
        if (znVarN3 != null) {
            return zn(znVarN3, zIsMarkedNullable);
        }
        return null;
    }

    public static final List<zn<Object>> c5(pj1.zn znVar, List<? extends KType> typeArguments, boolean z) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(znVar, "<this>");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (z) {
            List<? extends KType> list = typeArguments;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(tl.n3(znVar, (KType) it.next()));
            }
        } else {
            List<? extends KType> list2 = typeArguments;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                zn<Object> znVarGv = tl.gv(znVar, (KType) it2.next());
                if (znVarGv == null) {
                    return null;
                }
                arrayList.add(znVarGv);
            }
        }
        return arrayList;
    }

    public static final <T> zn<T> fb(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        zn<T> znVarN3 = yg.n3(kClass);
        return znVarN3 == null ? tg.n3(kClass) : znVarN3;
    }

    public static final zn<? extends Object> gv(KClass<Object> kClass, List<? extends KType> types, List<? extends zn<Object>> serializers) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(serializers, "serializers");
        zn<? extends Object> znVarY = y(kClass, types, serializers);
        return znVarY == null ? n3(kClass, serializers) : znVarY;
    }

    public static final zn<? extends Object> n3(KClass<Object> kClass, List<? extends zn<Object>> list) {
        Object[] array = list.toArray(new zn[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        zn[] znVarArr = (zn[]) array;
        return yg.gv(kClass, (zn[]) Arrays.copyOf(znVarArr, znVarArr.length));
    }

    public static final zn<Object> s(pj1.zn znVar, KType type) {
        Intrinsics.checkNotNullParameter(znVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return a(znVar, type, false);
    }

    public static final zn<Object> v(pj1.zn znVar, KType type) {
        Intrinsics.checkNotNullParameter(znVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        zn<Object> znVarA = a(znVar, type, true);
        if (znVarA != null) {
            return znVarA;
        }
        yg.tl(yc.zn(type));
        throw new KotlinNothingValueException();
    }

    public static final zn<? extends Object> y(KClass<Object> kClass, List<? extends KType> list, List<? extends zn<Object>> list2) {
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Collection.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(ArrayList.class))) {
            return new mj1.a(list2.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashSet.class))) {
            return new vl(list2.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashSet.class))) {
            return new en(list2.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashMap.class))) {
            return new k5(list2.get(0), list2.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashMap.class))) {
            return new k(list2.get(0), list2.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.Entry.class))) {
            return jj1.y.i9(list2.get(0), list2.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Pair.class))) {
            return jj1.y.t(list2.get(0), list2.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Triple.class))) {
            return jj1.y.wz(list2.get(0), list2.get(1), list2.get(2));
        }
        if (!yg.t(kClass)) {
            return null;
        }
        KClassifier classifier = list.get(0).getClassifier();
        Intrinsics.checkNotNull(classifier, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return jj1.y.y((KClass) classifier, list2.get(0));
    }

    public static final <T> zn<T> zn(zn<T> znVar, boolean z) {
        if (z) {
            return jj1.y.co(znVar);
        }
        Intrinsics.checkNotNull(znVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return znVar;
    }
}
