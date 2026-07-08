package k4;

import g4.xc;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class a8 extends k5<Comparable<?>> implements Serializable {
    private static final long serialVersionUID = 0;
    public static final a8 y = new a8();

    private Object readResolve() {
        return y;
    }

    @Override // k4.k5, java.util.Comparator
    /* JADX INFO: renamed from: co, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        xc.t(comparable);
        xc.t(comparable2);
        return comparable.compareTo(comparable2);
    }

    @Override // k4.k5
    public <S extends Comparable<?>> k5<S> p() {
        return qn.y;
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
