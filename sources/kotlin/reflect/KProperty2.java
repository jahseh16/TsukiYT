package kotlin.reflect;

import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes.dex */
public interface KProperty2<D, E, V> extends KProperty<V>, Function2<D, E, V> {

    public interface Getter<D, E, V> extends KProperty.Getter<V>, Function2<D, E, V> {
    }

    V get(D d4, E e4);

    Getter<D, E, V> getGetter();
}
