package t0;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class mt implements gv {
    public final TreeSet<c5> n3 = new TreeSet<>(new Comparator() { // from class: t0.p
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return mt.s((c5) obj, (c5) obj2);
        }
    });
    public final long y;
    public long zn;

    public mt(long j) {
        this.y = j;
    }

    public static int s(c5 c5Var, c5 c5Var2) {
        long j = c5Var.f8119t;
        long j4 = c5Var2.f8119t;
        return j - j4 == 0 ? c5Var.compareTo(c5Var2) : j < j4 ? -1 : 1;
    }

    @Override // t0.gv
    public void a(y yVar, String str, long j, long j4) {
        if (j4 != -1) {
            c5(yVar, j4);
        }
    }

    public final void c5(y yVar, long j) {
        while (this.zn + j > this.y && !this.n3.isEmpty()) {
            yVar.a(this.n3.first());
        }
    }

    @Override // t0.y.n3
    public void gv(y yVar, c5 c5Var) {
        this.n3.remove(c5Var);
        this.zn -= c5Var.f8117fb;
    }

    @Override // t0.gv
    public boolean n3() {
        return true;
    }

    @Override // t0.y.n3
    public void y(y yVar, c5 c5Var) {
        this.n3.add(c5Var);
        this.zn += c5Var.f8117fb;
        c5(yVar, 0L);
    }

    @Override // t0.y.n3
    public void zn(y yVar, c5 c5Var, c5 c5Var2) {
        gv(yVar, c5Var);
        y(yVar, c5Var2);
    }

    @Override // t0.gv
    public void v() {
    }
}
