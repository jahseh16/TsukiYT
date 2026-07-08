package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator<Comparable> y = new Comparator<Comparable>() { // from class: com.google.gson.internal.LinkedTreeMap.1
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    private final boolean allowNullValues;
    private final Comparator<? super K> comparator;
    private LinkedTreeMap<K, V>.EntrySet entrySet;
    final Node<K, V> header;
    private LinkedTreeMap<K, V>.KeySet keySet;
    int modCount;
    Node<K, V> root;
    int size;

    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedTreeMap.this.f((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new LinkedTreeMap<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>>() { // from class: com.google.gson.internal.LinkedTreeMap.EntrySet.1
                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }

                @Override // java.util.Iterator
                public Map.Entry<K, V> next() {
                    return y();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Node<K, V> nodeF;
            if (!(obj instanceof Map.Entry) || (nodeF = LinkedTreeMap.this.f((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedTreeMap.this.p(nodeF, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.size;
        }
    }

    public final class KeySet extends AbstractSet<K> {
        public KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new LinkedTreeMap<K, V>.LinkedTreeMapIterator<K>() { // from class: com.google.gson.internal.LinkedTreeMap.KeySet.1
                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }

                @Override // java.util.Iterator
                public K next() {
                    return y().f3058t;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LinkedTreeMap.this.co(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.size;
        }
    }

    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f3050fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Node<K, V> f3052v = null;
        public Node<K, V> y;

        public LinkedTreeMapIterator() {
            this.y = LinkedTreeMap.this.header.f3057s;
            this.f3050fb = LinkedTreeMap.this.modCount;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.y != LinkedTreeMap.this.header;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Node<K, V> node = this.f3052v;
            if (node == null) {
                throw new IllegalStateException();
            }
            LinkedTreeMap.this.p(node, true);
            this.f3052v = null;
            this.f3050fb = LinkedTreeMap.this.modCount;
        }

        public final Node<K, V> y() {
            Node<K, V> node = this.y;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (node == linkedTreeMap.header) {
                throw new NoSuchElementException();
            }
            if (linkedTreeMap.modCount != this.f3050fb) {
                throw new ConcurrentModificationException();
            }
            this.y = node.f3057s;
            this.f3052v = node;
            return node;
        }
    }

    public LinkedTreeMap() {
        this(y, true);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public static boolean y(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public Node<K, V> a(K k3, boolean z) {
        int iCompareTo;
        Node<K, V> node;
        Comparator<? super K> comparator = this.comparator;
        Node<K, V> node2 = this.root;
        if (node2 != null) {
            Comparable comparable = comparator == y ? (Comparable) k3 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(node2.f3058t) : comparator.compare(k3, node2.f3058t);
                if (iCompareTo == 0) {
                    return node2;
                }
                Node<K, V> node3 = iCompareTo < 0 ? node2.f3059v : node2.f3055fb;
                if (node3 == null) {
                    break;
                }
                node2 = node3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        Node<K, V> node4 = this.header;
        if (node2 != null) {
            node = new Node<>(this.allowNullValues, node2, k3, node4, node4.f3054f);
            if (iCompareTo < 0) {
                node2.f3059v = node;
            } else {
                node2.f3055fb = node;
            }
            w(node2, true);
        } else {
            if (comparator == y && !(k3 instanceof Comparable)) {
                throw new ClassCastException(k3.getClass().getName() + " is not Comparable");
            }
            node = new Node<>(this.allowNullValues, node2, k3, node4, node4.f3054f);
            this.root = node;
        }
        this.size++;
        this.modCount++;
        return node;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        Node<K, V> node = this.header;
        node.f3054f = node;
        node.f3057s = node;
    }

    public Node<K, V> co(Object obj) {
        Node<K, V> nodeT = t(obj);
        if (nodeT != null) {
            p(nodeT, true);
        }
        return nodeT;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return t(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.EntrySet entrySet = this.entrySet;
        if (entrySet != null) {
            return entrySet;
        }
        LinkedTreeMap<K, V>.EntrySet entrySet2 = new EntrySet();
        this.entrySet = entrySet2;
        return entrySet2;
    }

    public Node<K, V> f(Map.Entry<?, ?> entry) {
        Node<K, V> nodeT = t(entry.getKey());
        if (nodeT == null || !y(nodeT.f3056p, entry.getValue())) {
            return null;
        }
        return nodeT;
    }

    public final void f3(Node<K, V> node) {
        Node<K, V> node2 = node.f3059v;
        Node<K, V> node3 = node.f3055fb;
        Node<K, V> node4 = node2.f3059v;
        Node<K, V> node5 = node2.f3055fb;
        node.f3059v = node5;
        if (node5 != null) {
            node5.y = node;
        }
        z(node, node2);
        node2.f3055fb = node;
        node.y = node2;
        int iMax = Math.max(node3 != null ? node3.f3053co : 0, node5 != null ? node5.f3053co : 0) + 1;
        node.f3053co = iMax;
        node2.f3053co = Math.max(iMax, node4 != null ? node4.f3053co : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Node<K, V> nodeT = t(obj);
        if (nodeT != null) {
            return nodeT.f3056p;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedTreeMap<K, V>.KeySet keySet = this.keySet;
        if (keySet != null) {
            return keySet;
        }
        LinkedTreeMap<K, V>.KeySet keySet2 = new KeySet();
        this.keySet = keySet2;
        return keySet2;
    }

    public void p(Node<K, V> node, boolean z) {
        int i;
        if (z) {
            Node<K, V> node2 = node.f3054f;
            node2.f3057s = node.f3057s;
            node.f3057s.f3054f = node2;
        }
        Node<K, V> node3 = node.f3059v;
        Node<K, V> node4 = node.f3055fb;
        Node<K, V> node5 = node.y;
        int i5 = 0;
        if (node3 == null || node4 == null) {
            if (node3 != null) {
                z(node, node3);
                node.f3059v = null;
            } else if (node4 != null) {
                z(node, node4);
                node.f3055fb = null;
            } else {
                z(node, null);
            }
            w(node5, false);
            this.size--;
            this.modCount++;
            return;
        }
        Node<K, V> nodeLast = node3.f3053co > node4.f3053co ? node3.last() : node4.first();
        p(nodeLast, false);
        Node<K, V> node6 = node.f3059v;
        if (node6 != null) {
            i = node6.f3053co;
            nodeLast.f3059v = node6;
            node6.y = nodeLast;
            node.f3059v = null;
        } else {
            i = 0;
        }
        Node<K, V> node7 = node.f3055fb;
        if (node7 != null) {
            i5 = node7.f3053co;
            nodeLast.f3055fb = node7;
            node7.y = nodeLast;
            node.f3055fb = null;
        }
        nodeLast.f3053co = Math.max(i, i5) + 1;
        z(node, nodeLast);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k3, V v6) {
        if (k3 == null) {
            throw new NullPointerException("key == null");
        }
        if (v6 == null && !this.allowNullValues) {
            throw new NullPointerException("value == null");
        }
        Node<K, V> nodeA = a(k3, true);
        V v7 = nodeA.f3056p;
        nodeA.f3056p = v6;
        return v7;
    }

    public final void r(Node<K, V> node) {
        Node<K, V> node2 = node.f3059v;
        Node<K, V> node3 = node.f3055fb;
        Node<K, V> node4 = node3.f3059v;
        Node<K, V> node5 = node3.f3055fb;
        node.f3055fb = node4;
        if (node4 != null) {
            node4.y = node;
        }
        z(node, node3);
        node3.f3059v = node;
        node.y = node3;
        int iMax = Math.max(node2 != null ? node2.f3053co : 0, node4 != null ? node4.f3053co : 0) + 1;
        node.f3053co = iMax;
        node3.f3053co = Math.max(iMax, node5 != null ? node5.f3053co : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Node<K, V> nodeCo = co(obj);
        if (nodeCo != null) {
            return nodeCo.f3056p;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Node<K, V> t(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final void w(Node<K, V> node, boolean z) {
        while (node != null) {
            Node<K, V> node2 = node.f3059v;
            Node<K, V> node3 = node.f3055fb;
            int i = node2 != null ? node2.f3053co : 0;
            int i5 = node3 != null ? node3.f3053co : 0;
            int i8 = i - i5;
            if (i8 == -2) {
                Node<K, V> node4 = node3.f3059v;
                Node<K, V> node5 = node3.f3055fb;
                int i10 = (node4 != null ? node4.f3053co : 0) - (node5 != null ? node5.f3053co : 0);
                if (i10 == -1 || (i10 == 0 && !z)) {
                    r(node);
                } else {
                    f3(node3);
                    r(node);
                }
                if (z) {
                    return;
                }
            } else if (i8 == 2) {
                Node<K, V> node6 = node2.f3059v;
                Node<K, V> node7 = node2.f3055fb;
                int i11 = (node6 != null ? node6.f3053co : 0) - (node7 != null ? node7.f3053co : 0);
                if (i11 == 1 || (i11 == 0 && !z)) {
                    f3(node);
                } else {
                    r(node2);
                    f3(node);
                }
                if (z) {
                    return;
                }
            } else if (i8 == 0) {
                node.f3053co = i + 1;
                if (z) {
                    return;
                }
            } else {
                node.f3053co = Math.max(i, i5) + 1;
                if (!z) {
                    return;
                }
            }
            node = node.y;
        }
    }

    public final void z(Node<K, V> node, Node<K, V> node2) {
        Node<K, V> node3 = node.y;
        node.y = null;
        if (node2 != null) {
            node2.y = node3;
        }
        if (node3 == null) {
            this.root = node2;
        } else if (node3.f3059v == node) {
            node3.f3059v = node2;
        } else {
            node3.f3055fb = node2;
        }
    }

    public LinkedTreeMap(boolean z) {
        this(y, z);
    }

    public LinkedTreeMap(Comparator<? super K> comparator, boolean z) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? y : comparator;
        this.allowNullValues = z;
        this.header = new Node<>(z);
    }

    public static final class Node<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public int f3053co;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Node<K, V> f3054f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public Node<K, V> f3055fb;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public V f3056p;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Node<K, V> f3057s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final K f3058t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Node<K, V> f3059v;
        public final boolean w;
        public Node<K, V> y;

        public Node(boolean z) {
            this.f3058t = null;
            this.w = z;
            this.f3054f = this;
            this.f3057s = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k3 = this.f3058t;
            if (k3 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k3.equals(entry.getKey())) {
                return false;
            }
            V v6 = this.f3056p;
            if (v6 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v6.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public Node<K, V> first() {
            Node<K, V> node = this;
            for (Node<K, V> node2 = this.f3059v; node2 != null; node2 = node2.f3059v) {
                node = node2;
            }
            return node;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f3058t;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f3056p;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k3 = this.f3058t;
            int iHashCode = k3 == null ? 0 : k3.hashCode();
            V v6 = this.f3056p;
            return iHashCode ^ (v6 != null ? v6.hashCode() : 0);
        }

        public Node<K, V> last() {
            Node<K, V> node = this;
            for (Node<K, V> node2 = this.f3055fb; node2 != null; node2 = node2.f3055fb) {
                node = node2;
            }
            return node;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v6) {
            if (v6 == null && !this.w) {
                throw new NullPointerException("value == null");
            }
            V v7 = this.f3056p;
            this.f3056p = v6;
            return v7;
        }

        public String toString() {
            return this.f3058t + "=" + this.f3056p;
        }

        public Node(boolean z, Node<K, V> node, K k3, Node<K, V> node2, Node<K, V> node3) {
            this.y = node;
            this.f3058t = k3;
            this.w = z;
            this.f3053co = 1;
            this.f3057s = node2;
            this.f3054f = node3;
            node3.f3057s = this;
            node2.f3054f = this;
        }
    }
}
