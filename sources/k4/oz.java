package k4;

import g4.xc;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import k4.i9;

/* JADX INFO: loaded from: classes.dex */
public final class oz {

    public static abstract class a<E> extends AbstractSet<E> {
        public /* synthetic */ a(y yVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e4) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: renamed from: y */
        public abstract k<E> iterator();

        public a() {
        }
    }

    public static class gv<E> extends zn<E> implements SortedSet<E> {
        public gv(SortedSet<E> sortedSet, g4.w<? super E> wVar) {
            super(sortedSet, wVar);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.y).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) d0.i9(this.y.iterator(), this.f6041v);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e4) {
            return new gv(((SortedSet) this.y).headSet(e4), this.f6041v);
        }

        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.y;
            while (true) {
                E e4 = (Object) sortedSetHeadSet.last();
                if (this.f6041v.apply(e4)) {
                    return e4;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e4);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e4, E e5) {
            return new gv(((SortedSet) this.y).subSet(e4, e5), this.f6041v);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e4) {
            return new gv(((SortedSet) this.y).tailSet(e4), this.f6041v);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class n3<E> extends a<E> {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Set f6050v;
        public final /* synthetic */ Set y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n3(Set set, Set set2) {
            super(null);
            this.y = set;
            this.f6050v = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.y.contains(obj) && this.f6050v.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.y.containsAll(collection) && this.f6050v.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f6050v, this.y);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.y.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.f6050v.contains(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public k<E> iterator() {
            return new y(this);
        }
    }

    public static abstract class v<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return oz.c5(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) xc.t(collection));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class y<E> extends a<E> {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Set f6051v;
        public final /* synthetic */ Set y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Set set, Set set2) {
            super(null);
            this.y = set;
            this.f6051v = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.y.contains(obj) || this.f6051v.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.y.isEmpty() && this.f6051v.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.y.size();
            Iterator<E> it = this.f6051v.iterator();
            while (it.hasNext()) {
                if (!this.y.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: y */
        public k<E> iterator() {
            return new y(this);
        }
    }

    public static class zn<E> extends i9.y<E> implements Set<E> {
        public zn(Set<E> set, g4.w<? super E> wVar) {
            super(set, wVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return oz.y(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return oz.gv(this);
        }
    }

    public static <E> HashSet<E> a() {
        return new HashSet<>();
    }

    public static boolean c5(Set<?> set, Collection<?> collection) {
        xc.t(collection);
        if (collection instanceof ud) {
            collection = ((ud) collection).f7();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? i9(set, collection.iterator()) : d0.w(set.iterator(), collection);
    }

    public static <E> a<E> f(Set<? extends E> set, Set<? extends E> set2) {
        xc.tl(set, "set1");
        xc.tl(set2, "set2");
        return new y(set, set2);
    }

    public static <E> HashSet<E> fb(int i) {
        return new HashSet<>(ta.y(i));
    }

    public static int gv(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static boolean i9(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static <E> Set<E> n3(Set<E> set, g4.w<? super E> wVar) {
        if (set instanceof SortedSet) {
            return zn((SortedSet) set, wVar);
        }
        if (!(set instanceof zn)) {
            return new zn((Set) xc.t(set), (g4.w) xc.t(wVar));
        }
        zn znVar = (zn) set;
        return new zn((Set) znVar.y, g4.p.n3(znVar.f6041v, wVar));
    }

    public static <E> Set<E> s() {
        return Collections.newSetFromMap(ta.a());
    }

    public static <E> a<E> v(Set<E> set, Set<?> set2) {
        xc.tl(set, "set1");
        xc.tl(set2, "set2");
        return new n3(set, set2);
    }

    public static boolean y(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> zn(SortedSet<E> sortedSet, g4.w<? super E> wVar) {
        if (!(sortedSet instanceof zn)) {
            return new gv((SortedSet) xc.t(sortedSet), (g4.w) xc.t(wVar));
        }
        zn znVar = (zn) sortedSet;
        return new gv((SortedSet) znVar.y, g4.p.n3(znVar.f6041v, wVar));
    }
}
