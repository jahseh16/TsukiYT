package pj1;

import ij1.f;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public abstract class zn {
    public /* synthetic */ zn(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ij1.zn zn(zn znVar, KClass kClass, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        return znVar.n3(kClass, list);
    }

    public abstract <T> ij1.n3<? extends T> gv(KClass<? super T> kClass, String str);

    public abstract <T> ij1.zn<T> n3(KClass<T> kClass, List<? extends ij1.zn<?>> list);

    public abstract <T> f<T> v(KClass<? super T> kClass, T t3);

    public abstract void y(v vVar);

    public zn() {
    }
}
