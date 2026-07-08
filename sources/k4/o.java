package k4;

import g4.xc;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class o<T> extends k5<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final k5<? super T> forwardOrder;

    public o(k5<? super T> k5Var) {
        this.forwardOrder = (k5) xc.t(k5Var);
    }

    @Override // k4.k5, java.util.Comparator
    public int compare(T t3, T t5) {
        return this.forwardOrder.compare(t5, t3);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.forwardOrder.equals(((o) obj).forwardOrder);
        }
        return false;
    }

    public int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    @Override // k4.k5
    public <S extends T> k5<S> p() {
        return this.forwardOrder;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.forwardOrder);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 10);
        sb.append(strValueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
