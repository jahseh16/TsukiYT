package kotlin.collections;

import java.util.Map;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
interface MapWithDefault<K, V> extends Map<K, V>, KMappedMarker {
    V getOrImplicitDefault(K k3);
}
