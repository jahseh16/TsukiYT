package nj1;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
@ij1.c5(with = zn.class)
public final class n3 extends s implements List<s>, KMappedMarker {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final y f6968fb = new y(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<s> f6969v;

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public y() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n3(List<? extends s> content) {
        super(null);
        Intrinsics.checkNotNullParameter(content, "content");
        this.f6969v = content;
    }

    public int a(s element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f6969v.indexOf(element);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, s sVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends s> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof s) {
            return y((s) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f6969v.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return Intrinsics.areEqual(this.f6969v, obj);
    }

    public int fb(s element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f6969v.lastIndexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f6969v.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof s) {
            return a((s) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f6969v.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<s> iterator() {
        return this.f6969v.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof s) {
            return fb((s) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<s> listIterator() {
        return this.f6969v.listIterator();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ s remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<s> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ s set(int i, s sVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return v();
    }

    @Override // java.util.List
    public void sort(Comparator<? super s> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<s> subList(int i, int i5) {
        return this.f6969v.subList(i, i5);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public String toString() {
        return CollectionsKt.joinToString$default(this.f6969v, ",", "[", "]", 0, null, null, 56, null);
    }

    public int v() {
        return this.f6969v.size();
    }

    public boolean y(s element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f6969v.contains(element);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
    public s get(int i) {
        return this.f6969v.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends s> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<s> listIterator(int i) {
        return this.f6969v.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }
}
