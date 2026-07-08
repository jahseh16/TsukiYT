package lb;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import lb.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<T> {

    public interface y {
        a<?> y(Type type, Set<? extends Annotation> set, co coVar);
    }

    public final void a(hk1.a aVar, T t3) throws IOException {
        fb(w.f3(aVar), t3);
    }

    public abstract void fb(w wVar, T t3) throws IOException;

    public final a<T> gv() {
        return this instanceof mb.y ? this : new mb.y(this);
    }

    public abstract T n3(f fVar) throws IOException;

    public final String v(T t3) {
        hk1.v vVar = new hk1.v();
        try {
            a(vVar, t3);
            return vVar.yc();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public final T y(String str) throws IOException {
        f fVarTa = f.ta(new hk1.v().vp(str));
        T tN3 = n3(fVarTa);
        if (zn() || fVarTa.d() == f.n3.END_DOCUMENT) {
            return tN3;
        }
        throw new s("JSON document was not fully consumed.");
    }

    public boolean zn() {
        return false;
    }
}
