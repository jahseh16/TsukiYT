package lb;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import lb.a;

/* JADX INFO: loaded from: classes.dex */
public final class y extends a<Object> {
    public static final a.y zn = new C0126y();
    public final a<Object> n3;
    public final Class<?> y;

    /* JADX INFO: renamed from: lb.y$y, reason: collision with other inner class name */
    public class C0126y implements a.y {
        @Override // lb.a.y
        public a<?> y(Type type, Set<? extends Annotation> set, co coVar) {
            Type typeY = x4.y(type);
            if (typeY != null && set.isEmpty()) {
                return new y(x4.fb(typeY), coVar.gv(typeY)).gv();
            }
            return null;
        }
    }

    public y(Class<?> cls, a<Object> aVar) {
        this.y = cls;
        this.n3 = aVar;
    }

    @Override // lb.a
    public void fb(w wVar, Object obj) throws IOException {
        wVar.y();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.n3.fb(wVar, Array.get(obj, i));
        }
        wVar.w();
    }

    @Override // lb.a
    public Object n3(f fVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        fVar.y();
        while (fVar.p()) {
            arrayList.add(this.n3.n3(fVar));
        }
        fVar.t();
        Object objNewInstance = Array.newInstance(this.y, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    public String toString() {
        return this.n3 + ".array()";
    }
}
