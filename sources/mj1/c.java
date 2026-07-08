package mj1;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes.dex */
public final class c<T> implements ap<T> {
    public final ConcurrentHashMap<Class<?>, s8<T>> n3;
    public final Function2<KClass<Object>, List<? extends KType>, ij1.zn<T>> y;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends ij1.zn<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.y = compute;
        this.n3 = new ConcurrentHashMap<>();
    }

    @Override // mj1.ap
    public Object y(KClass<Object> key, List<? extends KType> types) {
        Object objM31constructorimpl;
        s8<T> s8VarPutIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        ConcurrentHashMap<Class<?>, s8<T>> concurrentHashMap = this.n3;
        Class<?> javaClass = JvmClassMappingKt.getJavaClass(key);
        s8<T> s8Var = concurrentHashMap.get(javaClass);
        if (s8Var == null && (s8VarPutIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (s8Var = new s8<>()))) != null) {
            s8Var = s8VarPutIfAbsent;
        }
        ConcurrentHashMap concurrentHashMap2 = s8Var.y;
        Object obj = concurrentHashMap2.get(types);
        if (obj == null) {
            try {
                Result.Companion companion = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(this.y.invoke(key, types));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
            }
            Result resultM30boximpl = Result.m30boximpl(objM31constructorimpl);
            Object objPutIfAbsent = concurrentHashMap2.putIfAbsent(types, resultM30boximpl);
            obj = objPutIfAbsent == null ? resultM30boximpl : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "serializers.getOrPut(typ… { producer() }\n        }");
        return ((Result) obj).m39unboximpl();
    }
}
