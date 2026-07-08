package mb;

import java.io.IOException;
import lb.a;
import lb.f;
import lb.w;

/* JADX INFO: loaded from: classes.dex */
public final class y<T> extends a<T> {
    public final a<T> y;

    public y(a<T> aVar) {
        this.y = aVar;
    }

    @Override // lb.a
    public void fb(w wVar, T t3) throws IOException {
        if (t3 == null) {
            wVar.r();
        } else {
            this.y.fb(wVar, t3);
        }
    }

    @Override // lb.a
    public T n3(f fVar) throws IOException {
        return fVar.d() == f.n3.NULL ? (T) fVar.rz() : this.y.n3(fVar);
    }

    public String toString() {
        return this.y + ".nullSafe()";
    }
}
