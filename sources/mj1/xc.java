package mj1;

import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes.dex */
public final class xc {
    public static final boolean y;

    static {
        Object objM31constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m37isSuccessimpl(objM31constructorimpl)) {
            objM31constructorimpl = Boolean.TRUE;
        }
        Object objM31constructorimpl2 = Result.m31constructorimpl(objM31constructorimpl);
        Boolean bool = Boolean.FALSE;
        if (Result.m36isFailureimpl(objM31constructorimpl2)) {
            objM31constructorimpl2 = bool;
        }
        y = ((Boolean) objM31constructorimpl2).booleanValue();
    }

    public static final <T> ap<T> n3(Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends ij1.zn<T>> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return y ? new x4(factory) : new c(factory);
    }

    public static final <T> o0<T> y(Function1<? super KClass<?>, ? extends ij1.zn<T>> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return y ? new z(factory) : new n(factory);
    }
}
