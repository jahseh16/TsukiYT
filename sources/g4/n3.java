package g4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class n3<T> implements Iterator<T> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public T f5198v;
    public EnumC0096n3 y = EnumC0096n3.NOT_READY;

    /* JADX INFO: renamed from: g4.n3$n3, reason: collision with other inner class name */
    public enum EnumC0096n3 {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public static /* synthetic */ class y {
        public static final /* synthetic */ int[] y;

        static {
            int[] iArr = new int[EnumC0096n3.values().length];
            y = iArr;
            try {
                iArr[EnumC0096n3.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                y[EnumC0096n3.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        xc.p(this.y != EnumC0096n3.FAILED);
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
        this.y = EnumC0096n3.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.y = EnumC0096n3.NOT_READY;
        T t3 = (T) i9.y(this.f5198v);
        this.f5198v = null;
        return t3;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract T y();

    public final boolean zn() {
        this.y = EnumC0096n3.FAILED;
        this.f5198v = y();
        if (this.y == EnumC0096n3.DONE) {
            return false;
        }
        this.y = EnumC0096n3.READY;
        return true;
    }
}
