package com.google.gson.internal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class NonNullElementWrapperList<E> extends AbstractList<E> implements RandomAccess {
    public final ArrayList<E> y;

    public NonNullElementWrapperList(ArrayList<E> arrayList) {
        Objects.requireNonNull(arrayList);
        this.y = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e4) {
        this.y.add(i, y(e4));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.y.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.y.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return this.y.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        return this.y.get(i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return this.y.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        return this.y.indexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        return this.y.lastIndexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        return this.y.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        return this.y.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        return this.y.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e4) {
        return this.y.set(i, y(e4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.y.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return this.y.toArray();
    }

    public final E y(E e4) {
        if (e4 != null) {
            return e4;
        }
        throw new NullPointerException("Element must be non-null");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        return this.y.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.y.toArray(tArr);
    }
}
