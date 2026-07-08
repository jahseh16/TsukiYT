package k4;

import g4.xc;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class y<E> extends f7<E> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6063v;
    public final int y;

    public y(int i, int i5) {
        xc.wz(i5, i);
        this.y = i;
        this.f6063v = i5;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f6063v < this.y;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6063v > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f6063v;
        this.f6063v = i + 1;
        return y(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6063v;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f6063v - 1;
        this.f6063v = i;
        return y(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6063v - 1;
    }

    public abstract E y(int i);
}
