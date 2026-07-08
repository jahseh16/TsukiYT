package kotlin.properties;

import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes.dex */
public interface ReadOnlyProperty<T, V> {
    V getValue(T t3, KProperty<?> kProperty);
}
