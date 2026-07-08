package k4;

import g4.xc;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class q9<F, T> implements Iterator<T> {
    public final Iterator<? extends F> y;

    public q9(Iterator<? extends F> it) {
        this.y = (Iterator) xc.t(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.y.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return y(this.y.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.y.remove();
    }

    public abstract T y(F f3);
}
