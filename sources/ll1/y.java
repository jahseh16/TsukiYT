package ll1;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final Map<KClass<?>, String> y = ml1.y.y.gv();

    public static final String n3(KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        String strN3 = ml1.y.y.n3(kClass);
        y.put(kClass, strN3);
        return strN3;
    }

    public static final String y(KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        String str = y.get(kClass);
        return str == null ? n3(kClass) : str;
    }
}
