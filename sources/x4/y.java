package x4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class y<K, V> extends s<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public fb<K, V> f9103p;

    /* JADX INFO: renamed from: x4.y$y, reason: collision with other inner class name */
    public class C0193y extends fb<K, V> {
        public C0193y() {
        }

        @Override // x4.fb
        public int a(Object obj) {
            return y.this.i9(obj);
        }

        @Override // x4.fb
        public V c5(int i, V v6) {
            return y.this.wz(i, v6);
        }

        @Override // x4.fb
        public void fb(K k3, V v6) {
            y.this.put(k3, v6);
        }

        @Override // x4.fb
        public int gv() {
            return y.this.f9097fb;
        }

        @Override // x4.fb
        public Object n3(int i, int i5) {
            return y.this.f9098v[(i << 1) + i5];
        }

        @Override // x4.fb
        public void s(int i) {
            y.this.tl(i);
        }

        @Override // x4.fb
        public int v(Object obj) {
            return y.this.s(obj);
        }

        @Override // x4.fb
        public void y() {
            y.this.clear();
        }

        @Override // x4.fb
        public Map<K, V> zn() {
            return y.this;
        }
    }

    public y() {
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return w().t();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return w().tl();
    }

    public boolean p(@NonNull Collection<?> collection) {
        return fb.w(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        v(this.f9097fb + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return w().wz();
    }

    public final fb<K, V> w() {
        if (this.f9103p == null) {
            this.f9103p = new C0193y();
        }
        return this.f9103p;
    }

    public y(int i) {
        super(i);
    }

    public y(s sVar) {
        super(sVar);
    }
}
