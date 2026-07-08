package kotlin.properties;

import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes.dex */
public interface ReadWriteProperty<T, V> extends ReadOnlyProperty<T, V> {
    @Override // kotlin.properties.ReadOnlyProperty
    V getValue(T t3, KProperty<?> kProperty);

    void setValue(T t3, KProperty<?> kProperty, V v6);
}
