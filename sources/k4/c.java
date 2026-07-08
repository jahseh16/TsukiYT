package k4;

import g4.xc;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static <T> T a(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> void c5(List<T> list, g4.w<? super T> wVar, int i, int i5) {
        for (int size = list.size() - 1; size > i5; size--) {
            if (wVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i8 = i5 - 1; i8 >= i; i8--) {
            list.remove(i8);
        }
    }

    public static <T> boolean fb(Iterable<T> iterable, g4.w<? super T> wVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? s((List) iterable, (g4.w) xc.t(wVar)) : d0.p(iterable.iterator(), wVar);
    }

    public static <T> T gv(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) d0.f(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) a(list);
    }

    public static Object[] i9(Iterable<?> iterable) {
        return n3(iterable).toArray();
    }

    public static <E> Collection<E> n3(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : rz.c5(iterable.iterator());
    }

    public static <T> boolean s(List<T> list, g4.w<? super T> wVar) {
        int i = 0;
        int i5 = 0;
        while (i < list.size()) {
            T t3 = list.get(i);
            if (!wVar.apply(t3)) {
                if (i > i5) {
                    try {
                        list.set(i5, t3);
                    } catch (IllegalArgumentException unused) {
                        c5(list, wVar, i5, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        c5(list, wVar, i5, i);
                        return true;
                    }
                }
                i5++;
            }
            i++;
        }
        list.subList(i5, list.size()).clear();
        return i != i5;
    }

    public static <T> T v(Iterable<? extends T> iterable, T t3) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t3;
            }
            if (iterable instanceof List) {
                return (T) a(rz.y(iterable));
            }
        }
        return (T) d0.t(iterable.iterator(), t3);
    }

    public static <T> boolean y(Iterable<T> iterable, g4.w<? super T> wVar) {
        return d0.n3(iterable.iterator(), wVar);
    }

    public static <T> T zn(Iterable<? extends T> iterable, T t3) {
        return (T) d0.tl(iterable.iterator(), t3);
    }
}
