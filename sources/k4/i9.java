package k4;

import g4.xc;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i9 {

    public static class y<E> extends AbstractCollection<E> {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final g4.w<? super E> f6041v;
        public final Collection<E> y;

        public y(Collection<E> collection, g4.w<? super E> wVar) {
            this.y = collection;
            this.f6041v = wVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e4) {
            xc.gv(this.f6041v.apply(e4));
            return this.y.add(e4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                xc.gv(this.f6041v.apply(it.next()));
            }
            return this.y.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c.fb(this.y, this.f6041v);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (i9.zn(this.y, obj)) {
                return this.f6041v.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return i9.y(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !c.y(this.y, this.f6041v);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return d0.c5(this.y.iterator(), this.f6041v);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.y.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.y.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f6041v.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.y.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f6041v.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.y.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.f6041v.apply(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return rz.c5(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) rz.c5(iterator()).toArray(tArr);
        }
    }

    public static StringBuilder n3(int i) {
        c5.n3(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
    }

    public static boolean y(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean zn(Collection<?> collection, Object obj) {
        xc.t(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
