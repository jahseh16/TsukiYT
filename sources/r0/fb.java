package r0;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Map;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public abstract class fb implements tl {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public p f7491gv;
    public final ArrayList<o> n3 = new ArrayList<>(1);
    public final boolean y;
    public int zn;

    public fb(boolean z) {
        this.y = z;
    }

    @Override // r0.tl
    public final void co(o oVar) {
        v0.y.v(oVar);
        if (this.n3.contains(oVar)) {
            return;
        }
        this.n3.add(oVar);
        this.zn++;
    }

    @Override // r0.tl
    public /* synthetic */ Map fb() {
        return t.y(this);
    }

    public final void i4(p pVar) {
        this.f7491gv = pVar;
        for (int i = 0; i < this.zn; i++) {
            this.n3.get(i).y(this, pVar, this.y);
        }
    }

    public final void p(int i) {
        p pVar = (p) ut.i9(this.f7491gv);
        for (int i5 = 0; i5 < this.zn; i5++) {
            this.n3.get(i5).fb(this, pVar, this.y, i);
        }
    }

    public final void r() {
        p pVar = (p) ut.i9(this.f7491gv);
        for (int i = 0; i < this.zn; i++) {
            this.n3.get(i).c5(this, pVar, this.y);
        }
        this.f7491gv = null;
    }

    public final void x4(p pVar) {
        for (int i = 0; i < this.zn; i++) {
            this.n3.get(i).a(this, pVar, this.y);
        }
    }
}
