package kotlin.reflect;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface KMutableProperty1<T, V> extends KProperty1<T, V>, KProperty {

    public interface Setter<T, V> extends KMutableProperty$Setter<V>, Function2<T, V, Unit> {
    }

    /* JADX INFO: renamed from: getSetter */
    Setter<T, V> mo130getSetter();
}
