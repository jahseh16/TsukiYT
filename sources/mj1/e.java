package mj1;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class e<K, V> extends ut<K, V, Pair<? extends K, ? extends V>> {
    public final kj1.a zn;

    public static final class y extends Lambda implements Function1<kj1.y, Unit> {
        final /* synthetic */ ij1.zn<K> $keySerializer;
        final /* synthetic */ ij1.zn<V> $valueSerializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ij1.zn<K> znVar, ij1.zn<V> znVar2) {
            super(1);
            this.$keySerializer = znVar;
            this.$valueSerializer = znVar2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(kj1.y yVar) {
            y(yVar);
            return Unit.INSTANCE;
        }

        public final void y(kj1.y buildClassSerialDescriptor) {
            Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
            kj1.y.n3(buildClassSerialDescriptor, "first", this.$keySerializer.getDescriptor(), null, false, 12, null);
            kj1.y.n3(buildClassSerialDescriptor, "second", this.$valueSerializer.getDescriptor(), null, false, 12, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ij1.zn<K> keySerializer, ij1.zn<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.zn = kj1.c5.n3("kotlin.Pair", new kj1.a[0], new y(keySerializer, valueSerializer));
    }

    @Override // mj1.ut
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Pair<K, V> zn(K k3, V v6) {
        return TuplesKt.to(k3, v6);
    }

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return this.zn;
    }

    @Override // mj1.ut
    /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
    public K y(Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.getFirst();
    }

    @Override // mj1.ut
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public V n3(Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.getSecond();
    }
}
