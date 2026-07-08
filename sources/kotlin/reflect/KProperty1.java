package kotlin.reflect;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes.dex */
public interface KProperty1<T, V> extends KProperty<V>, Function1<T, V> {

    public interface Getter<T, V> extends KProperty.Getter<V>, Function1<T, V> {
    }

    V get(T t3);

    Object getDelegate(T t3);

    /* JADX INFO: renamed from: getGetter */
    Getter<T, V> mo129getGetter();
}
