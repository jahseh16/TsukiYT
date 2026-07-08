package mt;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class n3<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final WeakHashMap<a<K, V>, Boolean> f6736fb = new WeakHashMap<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6737s = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public zn<K, V> f6738v;
    public zn<K, V> y;

    public static abstract class a<K, V> {
        public abstract void y(@NonNull zn<K, V> znVar);
    }

    public class gv extends a<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f6740v = true;
        public zn<K, V> y;

        public gv() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6740v) {
                return n3.this.y != null;
            }
            zn<K, V> znVar = this.y;
            return (znVar == null || znVar.f6742fb == null) ? false : true;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f6740v) {
                this.f6740v = false;
                this.y = n3.this.y;
            } else {
                zn<K, V> znVar = this.y;
                this.y = znVar != null ? znVar.f6742fb : null;
            }
            return this.y;
        }

        @Override // mt.n3.a
        public void y(@NonNull zn<K, V> znVar) {
            zn<K, V> znVar2 = this.y;
            if (znVar == znVar2) {
                zn<K, V> znVar3 = znVar2.f6743s;
                this.y = znVar3;
                this.f6740v = znVar3 == null;
            }
        }
    }

    /* JADX INFO: renamed from: mt.n3$n3, reason: collision with other inner class name */
    public static class C0135n3<K, V> extends v<K, V> {
        public C0135n3(zn<K, V> znVar, zn<K, V> znVar2) {
            super(znVar, znVar2);
        }

        @Override // mt.n3.v
        public zn<K, V> n3(zn<K, V> znVar) {
            return znVar.f6742fb;
        }

        @Override // mt.n3.v
        public zn<K, V> zn(zn<K, V> znVar) {
            return znVar.f6743s;
        }
    }

    public static abstract class v<K, V> extends a<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public zn<K, V> f6741v;
        public zn<K, V> y;

        public v(zn<K, V> znVar, zn<K, V> znVar2) {
            this.y = znVar2;
            this.f6741v = znVar;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            zn<K, V> znVar = this.f6741v;
            this.f6741v = v();
            return znVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6741v != null;
        }

        public abstract zn<K, V> n3(zn<K, V> znVar);

        public final zn<K, V> v() {
            zn<K, V> znVar = this.f6741v;
            zn<K, V> znVar2 = this.y;
            if (znVar == znVar2 || znVar2 == null) {
                return null;
            }
            return zn(znVar);
        }

        @Override // mt.n3.a
        public void y(@NonNull zn<K, V> znVar) {
            if (this.y == znVar && znVar == this.f6741v) {
                this.f6741v = null;
                this.y = null;
            }
            zn<K, V> znVar2 = this.y;
            if (znVar2 == znVar) {
                this.y = n3(znVar2);
            }
            if (this.f6741v == znVar) {
                this.f6741v = v();
            }
        }

        public abstract zn<K, V> zn(zn<K, V> znVar);
    }

    public static class y<K, V> extends v<K, V> {
        public y(zn<K, V> znVar, zn<K, V> znVar2) {
            super(znVar, znVar2);
        }

        @Override // mt.n3.v
        public zn<K, V> n3(zn<K, V> znVar) {
            return znVar.f6743s;
        }

        @Override // mt.n3.v
        public zn<K, V> zn(zn<K, V> znVar) {
            return znVar.f6742fb;
        }
    }

    public static class zn<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public zn<K, V> f6742fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public zn<K, V> f6743s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @NonNull
        public final V f6744v;

        @NonNull
        public final K y;

        public zn(@NonNull K k3, @NonNull V v6) {
            this.y = k3;
            this.f6744v = v6;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zn)) {
                return false;
            }
            zn znVar = (zn) obj;
            return this.y.equals(znVar.y) && this.f6744v.equals(znVar.f6744v);
        }

        @Override // java.util.Map.Entry
        @NonNull
        public K getKey() {
            return this.y;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public V getValue() {
            return this.f6744v;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.y.hashCode() ^ this.f6744v.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v6) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.y + "=" + this.f6744v;
        }
    }

    public V a(@NonNull K k3, @NonNull V v6) {
        zn<K, V> znVarN3 = n3(k3);
        if (znVarN3 != null) {
            return znVarN3.f6744v;
        }
        v(k3, v6);
        return null;
    }

    @NonNull
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0135n3 c0135n3 = new C0135n3(this.f6738v, this.y);
        this.f6736fb.put(c0135n3, Boolean.FALSE);
        return c0135n3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        if (size() != n3Var.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = n3Var.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public V fb(@NonNull K k3) {
        zn<K, V> znVarN3 = n3(k3);
        if (znVarN3 == null) {
            return null;
        }
        this.f6737s--;
        if (!this.f6736fb.isEmpty()) {
            Iterator<a<K, V>> it = this.f6736fb.keySet().iterator();
            while (it.hasNext()) {
                it.next().y(znVarN3);
            }
        }
        zn<K, V> znVar = znVarN3.f6743s;
        if (znVar != null) {
            znVar.f6742fb = znVarN3.f6742fb;
        } else {
            this.y = znVarN3.f6742fb;
        }
        zn<K, V> znVar2 = znVarN3.f6742fb;
        if (znVar2 != null) {
            znVar2.f6743s = znVar;
        } else {
            this.f6738v = znVar;
        }
        znVarN3.f6742fb = null;
        znVarN3.f6743s = null;
        return znVarN3.f6744v;
    }

    @Nullable
    public Map.Entry<K, V> gv() {
        return this.f6738v;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<Map.Entry<K, V>> iterator() {
        y yVar = new y(this.y, this.f6738v);
        this.f6736fb.put(yVar, Boolean.FALSE);
        return yVar;
    }

    @Nullable
    public zn<K, V> n3(K k3) {
        zn<K, V> znVar = this.y;
        while (znVar != null && !znVar.y.equals(k3)) {
            znVar = znVar.f6742fb;
        }
        return znVar;
    }

    public int size() {
        return this.f6737s;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public zn<K, V> v(@NonNull K k3, @NonNull V v6) {
        zn<K, V> znVar = new zn<>(k3, v6);
        this.f6737s++;
        zn<K, V> znVar2 = this.f6738v;
        if (znVar2 == null) {
            this.y = znVar;
            this.f6738v = znVar;
            return znVar;
        }
        znVar2.f6742fb = znVar;
        znVar.f6743s = znVar2;
        this.f6738v = znVar;
        return znVar;
    }

    @Nullable
    public Map.Entry<K, V> y() {
        return this.y;
    }

    @NonNull
    public n3<K, V>.gv zn() {
        n3<K, V>.gv gvVar = new gv();
        this.f6736fb.put(gvVar, Boolean.FALSE);
        return gvVar;
    }
}
