package k4;

import com.google.protobuf.Reader;
import g4.fb;
import g4.xc;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k4.oz;

/* JADX INFO: loaded from: classes.dex */
public final class ta {

    public static abstract class a<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public transient Collection<V> f6056v;
        public transient Set<Map.Entry<K, V>> y;

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.y;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setY = y();
            this.y = setY;
            return setY;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f6056v;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionZn = zn();
            this.f6056v = collectionZn;
            return collectionZn;
        }

        public abstract Set<Map.Entry<K, V>> y();

        public Collection<V> zn() {
            return new v(this);
        }
    }

    public static class gv<K, V> extends oz.v<K> {
        public final Map<K, V> y;

        public gv(Map<K, V> map) {
            this.y = (Map) xc.t(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return y().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return y().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return y().size();
        }

        public Map<K, V> y() {
            return this.y;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class n3 implements fb<Map.Entry<?, ?>, Object> {
        public static final n3 y = new y("KEY", 0);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final n3 f6058v = new C0115n3("VALUE", 1);

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public static final /* synthetic */ n3[] f6057fb = y();

        /* JADX INFO: renamed from: k4.ta$n3$n3, reason: collision with other inner class name */
        public enum C0115n3 extends n3 {
            public C0115n3(String str, int i) {
                super(str, i, null);
            }

            @Override // g4.fb
            /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        public enum y extends n3 {
            public y(String str, int i) {
                super(str, i, null);
            }

            @Override // g4.fb
            /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        public n3(String str, int i) {
        }

        public static n3 valueOf(String str) {
            return (n3) Enum.valueOf(n3.class, str);
        }

        public static n3[] values() {
            return (n3[]) f6057fb.clone();
        }

        public static /* synthetic */ n3[] y() {
            return new n3[]{y, f6058v};
        }

        public /* synthetic */ n3(String str, int i, mg mgVar) {
            this(str, i);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public class y<K, V> extends q9<Map.Entry<K, V>, V> {
        public y(Iterator it) {
            super(it);
        }

        @Override // k4.q9
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public V y(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    public static <K, V> IdentityHashMap<K, V> a() {
        return new IdentityHashMap<>();
    }

    public static <V> V c5(Map<?, V> map, Object obj) {
        xc.t(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static <V> fb<Map.Entry<?, V>, V> f() {
        return n3.f6058v;
    }

    public static boolean fb(Map<?, ?> map, Object obj) {
        xc.t(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <K, V> Map.Entry<K, V> gv(K k3, V v6) {
        return new z(k3, v6);
    }

    public static String i9(Map<?, ?> map) {
        StringBuilder sbN3 = i9.n3(map.size());
        sbN3.append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                sbN3.append(", ");
            }
            sbN3.append(entry.getKey());
            sbN3.append('=');
            sbN3.append(entry.getValue());
            z = false;
        }
        sbN3.append('}');
        return sbN3.toString();
    }

    public static boolean n3(Map<?, ?> map, Object obj) {
        return d0.gv(t(map.entrySet().iterator()), obj);
    }

    public static <V> V s(Map<?, V> map, Object obj) {
        xc.t(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static <K, V> Iterator<V> t(Iterator<Map.Entry<K, V>> it) {
        return new y(it);
    }

    public static <K> fb<Map.Entry<K, ?>, K> v() {
        return n3.y;
    }

    public static int y(int i) {
        if (i >= 3) {
            return i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Reader.READ_DONE;
        }
        c5.n3(i, "expectedSize");
        return i + 1;
    }

    public static boolean zn(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}
