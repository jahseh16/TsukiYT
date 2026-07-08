package mj1;

import java.util.Map;
import kj1.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
public final class dm<K, V> extends ut<K, V, Map.Entry<? extends K, ? extends V>> {
    public final kj1.a zn;

    public static final class n3 extends Lambda implements Function1<kj1.y, Unit> {
        final /* synthetic */ ij1.zn<K> $keySerializer;
        final /* synthetic */ ij1.zn<V> $valueSerializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n3(ij1.zn<K> znVar, ij1.zn<V> znVar2) {
            super(1);
            this.$keySerializer = znVar;
            this.$valueSerializer = znVar2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(kj1.y yVar) {
            y(yVar);
            return Unit.INSTANCE;
        }

        public final void y(kj1.y buildSerialDescriptor) {
            Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
            kj1.y.n3(buildSerialDescriptor, "key", this.$keySerializer.getDescriptor(), null, false, 12, null);
            kj1.y.n3(buildSerialDescriptor, "value", this.$valueSerializer.getDescriptor(), null, false, 12, null);
        }
    }

    public static final class y<K, V> implements Map.Entry<K, V>, KMappedMarker {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final V f6504v;
        public final K y;

        public y(K k3, V v6) {
            this.y = k3;
            this.f6504v = v6;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return Intrinsics.areEqual(getKey(), yVar.getKey()) && Intrinsics.areEqual(getValue(), yVar.getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.y;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f6504v;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return ((getKey() == null ? 0 : getKey().hashCode()) * 31) + (getValue() != null ? getValue().hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v6) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + getKey() + ", value=" + getValue() + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm(ij1.zn<K> keySerializer, ij1.zn<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.zn = kj1.c5.zn("kotlin.collections.Map.Entry", f.zn.y, new kj1.a[0], new n3(keySerializer, valueSerializer));
    }

    @Override // mj1.ut
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> zn(K k3, V v6) {
        return new y(k3, v6);
    }

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return this.zn;
    }

    @Override // mj1.ut
    /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
    public K y(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getKey();
    }

    @Override // mj1.ut
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public V n3(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getValue();
    }
}
