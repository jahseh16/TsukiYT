package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class SetsKt__SetsJVMKt {
    public static <E> Set<E> build(Set<E> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((SetBuilder) builder).build();
    }

    public static <E> Set<E> createSetBuilder() {
        return new SetBuilder();
    }

    public static <T> Set<T> setOf(T t3) {
        Set<T> setSingleton = Collections.singleton(t3);
        Intrinsics.checkNotNullExpressionValue(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static <E> Set<E> createSetBuilder(int i) {
        return new SetBuilder(i);
    }
}
