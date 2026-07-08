package k4;

import g4.xc;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class tl<T> extends k5<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<T> comparator;

    public tl(Comparator<T> comparator) {
        this.comparator = (Comparator) xc.t(comparator);
    }

    @Override // k4.k5, java.util.Comparator
    public int compare(T t3, T t5) {
        return this.comparator.compare(t3, t5);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tl) {
            return this.comparator.equals(((tl) obj).comparator);
        }
        return false;
    }

    public int hashCode() {
        return this.comparator.hashCode();
    }

    public String toString() {
        return this.comparator.toString();
    }
}
