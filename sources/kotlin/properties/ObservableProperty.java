package kotlin.properties;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes.dex */
public abstract class ObservableProperty<V> implements ReadWriteProperty<Object, V> {
    private V value;

    public ObservableProperty(V v6) {
        this.value = v6;
    }

    public abstract void afterChange(KProperty<?> kProperty, V v6, V v7);

    public boolean beforeChange(KProperty<?> property, V v6, V v7) {
        Intrinsics.checkNotNullParameter(property, "property");
        return true;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public V getValue(Object obj, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.value;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(Object obj, KProperty<?> property, V v6) {
        Intrinsics.checkNotNullParameter(property, "property");
        V v7 = this.value;
        if (beforeChange(property, v7, v6)) {
            this.value = v6;
            afterChange(property, v7, v6);
        }
    }

    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
