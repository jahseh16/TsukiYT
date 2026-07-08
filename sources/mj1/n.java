package mj1;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public final class n<T> implements o0<T> {
    public final ConcurrentHashMap<Class<?>, tl<T>> n3;
    public final Function1<KClass<?>, ij1.zn<T>> y;

    /* JADX WARN: Multi-variable type inference failed */
    public n(Function1<? super KClass<?>, ? extends ij1.zn<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.y = compute;
        this.n3 = new ConcurrentHashMap<>();
    }

    @Override // mj1.o0
    public ij1.zn<T> y(KClass<Object> key) {
        tl<T> tlVarPutIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap<Class<?>, tl<T>> concurrentHashMap = this.n3;
        Class<?> javaClass = JvmClassMappingKt.getJavaClass(key);
        tl<T> tlVar = concurrentHashMap.get(javaClass);
        if (tlVar == null && (tlVarPutIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (tlVar = new tl<>(this.y.invoke(key))))) != null) {
            tlVar = tlVarPutIfAbsent;
        }
        return tlVar.y;
    }
}
