package u4;

import b1.ta;
import ft.q;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public final ta y;

    public static final class y extends q {
        public y(String str) {
            super(str, null, false, 1);
        }
    }

    public v(ta taVar) {
        this.y = taVar;
    }

    public abstract boolean n3(d dVar) throws q;

    public final boolean y(d dVar, long j) throws q {
        return n3(dVar) && zn(dVar, j);
    }

    public abstract boolean zn(d dVar, long j) throws q;
}
