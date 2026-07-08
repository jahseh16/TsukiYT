package ij1;

import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes.dex */
public final class tl {
    public static final zn<Object> gv(pj1.zn znVar, KType kType) {
        return wz.s(znVar, kType);
    }

    public static final zn<Object> n3(pj1.zn znVar, KType kType) {
        return wz.v(znVar, kType);
    }

    public static final List<zn<Object>> v(pj1.zn znVar, List<? extends KType> list, boolean z) {
        return wz.c5(znVar, list, z);
    }

    public static final zn<? extends Object> y(KClass<Object> kClass, List<? extends KType> list, List<? extends zn<Object>> list2) {
        return wz.gv(kClass, list, list2);
    }

    public static final <T> zn<T> zn(KClass<T> kClass) {
        return wz.fb(kClass);
    }
}
