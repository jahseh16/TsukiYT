package k4;

import g4.xc;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ej {

    public static abstract class n3<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            y().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return y().gv(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return y().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return y().size();
        }

        public abstract d<K, V> y();
    }

    public static class y<K, V> extends zn<K, V> {
        private static final long serialVersionUID = 0;
        public transient g4.r<? extends List<V>> w;

        public y(Map<K, Collection<V>> map, g4.r<? extends List<V>> rVar) {
            super(map);
            this.w = (g4.r) xc.t(rVar);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.w = (g4.r) objectInputStream.readObject();
            u((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.w);
            objectOutputStream.writeObject(ej());
        }

        @Override // k4.gv
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<V> yt() {
            return this.w.get();
        }

        @Override // k4.a
        public Set<K> p() {
            return k();
        }

        @Override // k4.a
        public Map<K, Collection<V>> t() {
            return oz();
        }
    }

    public static <K, V> fh<K, V> n3(Map<K, Collection<V>> map, g4.r<? extends List<V>> rVar) {
        return new y(map, rVar);
    }

    public static boolean y(d<?, ?> dVar, Object obj) {
        if (obj == dVar) {
            return true;
        }
        if (obj instanceof d) {
            return dVar.n3().equals(((d) obj).n3());
        }
        return false;
    }
}
