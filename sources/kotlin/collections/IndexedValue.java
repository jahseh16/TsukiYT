package kotlin.collections;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class IndexedValue<T> {
    private final int index;
    private final T value;

    public IndexedValue(int i, T t3) {
        this.index = i;
        this.value = t3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        return this.index == indexedValue.index && Intrinsics.areEqual(this.value, indexedValue.value);
    }

    public final int getIndex() {
        return this.index;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        int i = this.index * 31;
        T t3 = this.value;
        return i + (t3 == null ? 0 : t3.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.index + ", value=" + this.value + ')';
    }
}
