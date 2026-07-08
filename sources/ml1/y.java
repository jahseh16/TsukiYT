package ml1;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import zk1.n3;
import zk1.zn;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final y y = new y();

    public final <K, V> Map<K, V> gv() {
        return new ConcurrentHashMap();
    }

    public final String n3(KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        String name = JvmClassMappingKt.getJavaClass(kClass).getName();
        Intrinsics.checkNotNullExpressionValue(name, "kClass.java.name");
        return name;
    }

    public final <R> R v(Object lock, Function0<? extends R> block) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (lock) {
            rInvoke = block.invoke();
        }
        return rInvoke;
    }

    public final zn y() {
        return n3.y;
    }

    public final String zn(Exception e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        StringBuilder sb = new StringBuilder();
        sb.append(e4);
        sb.append("\n\t");
        StackTraceElement[] stackTrace = e4.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "it.className");
            if (StringsKt.contains$default((CharSequence) className, (CharSequence) "sun.reflect", false, 2, (Object) null)) {
                break;
            }
            arrayList.add(stackTraceElement);
        }
        sb.append(CollectionsKt.joinToString$default(arrayList, "\n\t", null, null, 0, null, null, 62, null));
        return sb.toString();
    }
}
