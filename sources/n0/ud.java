package n0;

import androidx.annotation.Nullable;
import ft.ic;
import ft.xq;
import ur.lc;
import ur.mg;

/* JADX INFO: loaded from: classes.dex */
public abstract class ud {

    @Nullable
    public r0.a n3;

    @Nullable
    public y y;

    public interface y {
        void y();
    }

    public void a(y yVar, r0.a aVar) {
        this.y = yVar;
        this.n3 = aVar;
    }

    public abstract void c5(@Nullable Object obj);

    public abstract a8 f(ic[] icVarArr, lc lcVar, mg.n3 n3Var, xq xqVar) throws ft.p;

    public final void fb() {
        y yVar = this.y;
        if (yVar != null) {
            yVar.y();
        }
    }

    public final r0.a gv() {
        return (r0.a) v0.y.c5(this.n3);
    }

    public void i9() {
        this.y = null;
        this.n3 = null;
    }

    public boolean s() {
        return false;
    }

    public z6 v() {
        return z6.f6868ut;
    }

    public void t(mn.v vVar) {
    }

    public void tl(z6 z6Var) {
    }
}
