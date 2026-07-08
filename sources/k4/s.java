package k4;

import g4.fb;
import g4.xc;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class s<F, T> extends k5<F> implements Serializable {
    private static final long serialVersionUID = 0;
    final fb<F, ? extends T> function;
    final k5<T> ordering;

    public s(fb<F, ? extends T> fbVar, k5<T> k5Var) {
        this.function = (fb) xc.t(fbVar);
        this.ordering = (k5) xc.t(k5Var);
    }

    @Override // k4.k5, java.util.Comparator
    public int compare(F f3, F f4) {
        return this.ordering.compare(this.function.apply(f3), this.function.apply(f4));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.function.equals(sVar.function) && this.ordering.equals(sVar.ordering);
    }

    public int hashCode() {
        return g4.f.n3(this.function, this.ordering);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.ordering);
        String strValueOf2 = String.valueOf(this.function);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append(".onResultOf(");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
