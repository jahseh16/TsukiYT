package q;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zn<T> implements ne.y<T> {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public y f7437gv;
    public T n3;
    public final List<String> y = new ArrayList();
    public wm.gv<T> zn;

    public interface y {
        void n3(@NonNull List<String> list);

        void y(@NonNull List<String> list);
    }

    public zn(wm.gv<T> gvVar) {
        this.zn = gvVar;
    }

    public void a() {
        if (this.y.isEmpty()) {
            return;
        }
        this.y.clear();
        this.zn.zn(this);
    }

    public void fb(@Nullable y yVar) {
        if (this.f7437gv != yVar) {
            this.f7437gv = yVar;
            s(yVar, this.n3);
        }
    }

    public boolean gv(@NonNull String str) {
        T t3 = this.n3;
        return t3 != null && zn(t3) && this.y.contains(str);
    }

    public abstract boolean n3(@NonNull androidx.work.impl.model.n3 n3Var);

    public final void s(@Nullable y yVar, @Nullable T t3) {
        if (this.y.isEmpty() || yVar == null) {
            return;
        }
        if (t3 == null || zn(t3)) {
            yVar.n3(this.y);
        } else {
            yVar.y(this.y);
        }
    }

    public void v(@NonNull Iterable<androidx.work.impl.model.n3> iterable) {
        this.y.clear();
        for (androidx.work.impl.model.n3 n3Var : iterable) {
            if (n3(n3Var)) {
                this.y.add(n3Var.id);
            }
        }
        if (this.y.isEmpty()) {
            this.zn.zn(this);
        } else {
            this.zn.y(this);
        }
        s(this.f7437gv, this.n3);
    }

    @Override // ne.y
    public void y(@Nullable T t3) {
        this.n3 = t3;
        s(this.f7437gv, t3);
    }

    public abstract boolean zn(@NonNull T t3);
}
