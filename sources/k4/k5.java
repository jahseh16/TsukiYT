package k4;

import g4.fb;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class k5<T> implements Comparator<T> {
    public static <C extends Comparable> k5<C> gv() {
        return a8.y;
    }

    public static <T> k5<T> y(Comparator<T> comparator) {
        return comparator instanceof k5 ? (k5) comparator : new tl(comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t3, T t5);

    public <E extends T> r<E> n3(Iterable<E> iterable) {
        return r.rs(this, iterable);
    }

    public <S extends T> k5<S> p() {
        return new o(this);
    }

    public <T2 extends T> k5<Map.Entry<T2, ?>> t() {
        return (k5<Map.Entry<T2, ?>>) w(ta.v());
    }

    public <F> k5<F> w(fb<F, ? extends T> fbVar) {
        return new s(fbVar, this);
    }
}
