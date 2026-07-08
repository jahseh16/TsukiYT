package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CopyableThrowable;

/* JADX INFO: loaded from: classes.dex */
public final class ExceptionsConstructorKt {
    private static final CtorCache ctorCache;
    private static final int throwableFields = fieldsCountOrDefault(Throwable.class, -1);

    static {
        CtorCache ctorCache2;
        try {
            ctorCache2 = FastServiceLoaderKt.getANDROID_DETECTED() ? WeakMapCtorCache.INSTANCE : ClassValueCtorCache.INSTANCE;
        } catch (Throwable unused) {
            ctorCache2 = WeakMapCtorCache.INSTANCE;
        }
        ctorCache = ctorCache2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> Function1<Throwable, Throwable> createConstructor(Class<E> cls) {
        Object next;
        Function1<Throwable, Throwable> function1;
        Pair pair;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = new Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Throwable th) {
                return null;
            }
        };
        if (throwableFields != fieldsCountOrDefault(cls, 0)) {
            return exceptionsConstructorKt$createConstructor$nullResult$1;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i = 0;
        while (true) {
            next = null;
            if (i >= length) {
                break;
            }
            final Constructor<?> constructor = constructors[i];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 == 0) {
                pair = TuplesKt.to(safeCtor(new Function1<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Throwable invoke(Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objNewInstance = constructor.newInstance(null);
                        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                        Throwable th2 = (Throwable) objNewInstance;
                        th2.initCause(th);
                        return th2;
                    }
                }), 0);
            } else if (length2 != 1) {
                pair = length2 != 2 ? TuplesKt.to(null, -1) : (Intrinsics.areEqual(parameterTypes[0], String.class) && Intrinsics.areEqual(parameterTypes[1], Throwable.class)) ? TuplesKt.to(safeCtor(new Function1<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Throwable invoke(Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objNewInstance = constructor.newInstance(th.getMessage(), th);
                        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                        return (Throwable) objNewInstance;
                    }
                }), 3) : TuplesKt.to(null, -1);
            } else {
                Class<?> cls2 = parameterTypes[0];
                pair = Intrinsics.areEqual(cls2, String.class) ? TuplesKt.to(safeCtor(new Function1<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Throwable invoke(Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objNewInstance = constructor.newInstance(th.getMessage());
                        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                        Throwable th2 = (Throwable) objNewInstance;
                        th2.initCause(th);
                        return th2;
                    }
                }), 2) : Intrinsics.areEqual(cls2, Throwable.class) ? TuplesKt.to(safeCtor(new Function1<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Throwable invoke(Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objNewInstance = constructor.newInstance(th);
                        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                        return (Throwable) objNewInstance;
                    }
                }), 1) : TuplesKt.to(null, -1);
            }
            arrayList.add(pair);
            i++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iIntValue = ((Number) ((Pair) next).getSecond()).intValue();
                do {
                    Object next2 = it.next();
                    int iIntValue2 = ((Number) ((Pair) next2).getSecond()).intValue();
                    if (iIntValue < iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
        }
        Pair pair2 = (Pair) next;
        return (pair2 == null || (function1 = (Function1) pair2.getFirst()) == null) ? exceptionsConstructorKt$createConstructor$nullResult$1 : function1;
    }

    private static final int fieldsCount(Class<?> cls, int i) {
        do {
            int i5 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i5++;
                }
            }
            i += i5;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }

    public static /* synthetic */ int fieldsCount$default(Class cls, int i, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        return fieldsCount(cls, i);
    }

    private static final int fieldsCountOrDefault(Class<?> cls, int i) {
        Object objM31constructorimpl;
        JvmClassMappingKt.getKotlinClass(cls);
        try {
            Result.Companion companion = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(Integer.valueOf(fieldsCount$default(cls, 0, 1, null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        Integer numValueOf = Integer.valueOf(i);
        if (Result.m36isFailureimpl(objM31constructorimpl)) {
            objM31constructorimpl = numValueOf;
        }
        return ((Number) objM31constructorimpl).intValue();
    }

    private static final Function1<Throwable, Throwable> safeCtor(final Function1<? super Throwable, ? extends Throwable> function1) {
        return new Function1<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt.safeCtor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Throwable invoke(Throwable th) {
                Object objM31constructorimpl;
                Function1<Throwable, Throwable> function12 = function1;
                try {
                    Result.Companion companion = Result.Companion;
                    Throwable thInvoke = function12.invoke(th);
                    if (!Intrinsics.areEqual(th.getMessage(), thInvoke.getMessage()) && !Intrinsics.areEqual(thInvoke.getMessage(), th.toString())) {
                        thInvoke = null;
                    }
                    objM31constructorimpl = Result.m31constructorimpl(thInvoke);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.Companion;
                    objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th2));
                }
                return (Throwable) (Result.m36isFailureimpl(objM31constructorimpl) ? null : objM31constructorimpl);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E tryCopyException(E e4) {
        Object objM31constructorimpl;
        if (!(e4 instanceof CopyableThrowable)) {
            return (E) ctorCache.get(e4.getClass()).invoke(e4);
        }
        try {
            Result.Companion companion = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(((CopyableThrowable) e4).createCopy());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m36isFailureimpl(objM31constructorimpl)) {
            objM31constructorimpl = null;
        }
        return (E) objM31constructorimpl;
    }
}
