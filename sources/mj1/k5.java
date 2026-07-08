package mj1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k5<K, V> extends o4<K, V, Map<K, ? extends V>, HashMap<K, V>> {
    public final kj1.a zn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(ij1.zn<K> kSerializer, ij1.zn<V> vSerializer) {
        super(kSerializer, vSerializer, null);
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.zn = new b(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: co, reason: merged with bridge method [inline-methods] */
    public void zn(HashMap<K, V> map, int i) {
        Intrinsics.checkNotNullParameter(map, "<this>");
    }

    @Override // mj1.o4, ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return this.zn;
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public Map<K, V> t(HashMap<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map;
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: mt, reason: merged with bridge method [inline-methods] */
    public int n3(HashMap<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size() * 2;
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public HashMap<K, V> y() {
        return new HashMap<>();
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int v(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: x4, reason: merged with bridge method [inline-methods] */
    public HashMap<K, V> f(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        HashMap<K, V> map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap<>(map) : map2;
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Iterator<Map.Entry<K, V>> gv(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }
}
