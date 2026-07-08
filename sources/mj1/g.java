package mj1;

/* JADX INFO: loaded from: classes.dex */
public abstract class g<Array> {
    public static /* synthetic */ void zn(g gVar, int i, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i5 & 1) != 0) {
            i = gVar.gv() + 1;
        }
        gVar.n3(i);
    }

    public abstract int gv();

    public abstract void n3(int i);

    public abstract Array y();
}
