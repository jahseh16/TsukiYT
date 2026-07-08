package kotlin;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DeepRecursiveKt {
    private static final Object UNDEFINED_RESULT;

    static {
        Result.Companion companion = Result.Companion;
        UNDEFINED_RESULT = Result.m31constructorimpl(IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }

    public static final <T, R> R invoke(DeepRecursiveFunction<T, R> deepRecursiveFunction, T t3) {
        Intrinsics.checkNotNullParameter(deepRecursiveFunction, "<this>");
        return (R) new DeepRecursiveScopeImpl(deepRecursiveFunction.getBlock$kotlin_stdlib(), t3).runCallLoop();
    }
}
