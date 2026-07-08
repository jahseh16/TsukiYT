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
public final class x4<T> implements ap<T> {
    public final y n3;
    public final Function2<KClass<Object>, List<? extends KType>, ij1.zn<T>> y;

    public static final class y extends ClassValue<s8<T>> {
        @Override // java.lang.ClassValue
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public s8<T> computeValue(Class<?> type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new s8<>();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x4(Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends ij1.zn<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.y = compute;
        this.n3 = n3();
    }

    public final y n3() {
        return new y();
    }

    @Override // mj1.ap
    public Object y(KClass<Object> key, List<? extends KType> types) {
        Object objM31constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        ConcurrentHashMap concurrentHashMap = ((s8) this.n3.get(JvmClassMappingKt.getJavaClass(key))).y;
        Object obj = concurrentHashMap.get(types);
        if (obj == null) {
            try {
                Result.Companion companion = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(this.y.invoke(key, types));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
            }
            Result resultM30boximpl = Result.m30boximpl(objM31constructorimpl);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(types, resultM30boximpl);
            obj = objPutIfAbsent == null ? resultM30boximpl : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "serializers.getOrPut(typ… { producer() }\n        }");
        return ((Result) obj).m39unboximpl();
    }
}
