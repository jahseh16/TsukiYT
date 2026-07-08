package k4;

import g4.xc;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class n3<T> extends k<T> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public T f6049v;
    public n3 y = n3.v;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        xc.p(this.y != n3.s);
        int i = y.y[this.y.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return zn();
        }
        return true;
    }

    public final T n3() {
        this.y = n3.fb;
        return null;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.y = n3.v;
        T t3 = (T) x.y(this.f6049v);
        this.f6049v = null;
        return t3;
    }

    public abstract T y();

    public final boolean zn() {
        this.y = n3.s;
        this.f6049v = y();
        if (this.y == n3.fb) {
            return false;
        }
        this.y = n3.y;
        return true;
    }
}
