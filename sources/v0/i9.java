package v0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i9<E> implements Iterable<E> {
    public final Object y = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Map<E, Integer> f8751v = new HashMap();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public Set<E> f8749fb = Collections.emptySet();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List<E> f8750s = Collections.emptyList();

    public Set<E> f7() {
        Set<E> set;
        synchronized (this.y) {
            set = this.f8749fb;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.y) {
            it = this.f8750s.iterator();
        }
        return it;
    }

    public int n3(E e4) {
        int iIntValue;
        synchronized (this.y) {
            try {
                iIntValue = this.f8751v.containsKey(e4) ? this.f8751v.get(e4).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public void y(E e4) {
        synchronized (this.y) {
            try {
                ArrayList arrayList = new ArrayList(this.f8750s);
                arrayList.add(e4);
                this.f8750s = Collections.unmodifiableList(arrayList);
                Integer num = this.f8751v.get(e4);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f8749fb);
                    hashSet.add(e4);
                    this.f8749fb = Collections.unmodifiableSet(hashSet);
                }
                this.f8751v.put(e4, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void zn(E e4) {
        synchronized (this.y) {
            try {
                Integer num = this.f8751v.get(e4);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f8750s);
                arrayList.remove(e4);
                this.f8750s = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f8751v.remove(e4);
                    HashSet hashSet = new HashSet(this.f8749fb);
                    hashSet.remove(e4);
                    this.f8749fb = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f8751v.put(e4, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
