package mj1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k<K, V> extends o4<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {
    public final kj1.a zn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ij1.zn<K> kSerializer, ij1.zn<V> vSerializer) {
        super(kSerializer, vSerializer, null);
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.zn = new q9(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: co, reason: merged with bridge method [inline-methods] */
    public void zn(LinkedHashMap<K, V> linkedHashMap, int i) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
    }

    @Override // mj1.o4, ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return this.zn;
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public Map<K, V> t(LinkedHashMap<K, V> linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: mt, reason: merged with bridge method [inline-methods] */
    public int n3(LinkedHashMap<K, V> linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap<K, V> y() {
        return new LinkedHashMap<>();
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int v(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: x4, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap<K, V> f(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap<K, V> linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap<>(map) : linkedHashMap;
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Iterator<Map.Entry<K, V>> gv(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }
}
