package kotlin.reflect;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes.dex */
public interface KProperty0<V> extends KProperty<V>, Function0<V> {

    public interface Getter<V> extends KProperty.Getter<V>, Function0<V> {
    }

    V get();

    Getter<V> getGetter();
}
