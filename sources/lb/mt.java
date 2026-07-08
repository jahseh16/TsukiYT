package lb;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import lb.a;

/* JADX INFO: loaded from: classes.dex */
public final class mt<K, V> extends a<Map<K, V>> {
    public static final a.y zn = new y();
    public final a<V> n3;
    public final a<K> y;

    public class y implements a.y {
        @Override // lb.a.y
        public a<?> y(Type type, Set<? extends Annotation> set, co coVar) {
            Class<?> clsFb;
            if (!set.isEmpty() || (clsFb = x4.fb(type)) != Map.class) {
                return null;
            }
            Type[] typeArrC5 = x4.c5(type, clsFb);
            return new mt(coVar, typeArrC5[0], typeArrC5[1]).gv();
        }
    }

    public mt(co coVar, Type type, Type type2) {
        this.y = coVar.gv(type);
        this.n3 = coVar.gv(type2);
    }

    @Override // lb.a
    /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
    public void fb(w wVar, Map<K, V> map) throws IOException {
        wVar.a();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                throw new s("Map key is null at " + wVar.getPath());
            }
            wVar.c();
            this.y.fb(wVar, entry.getKey());
            this.n3.fb(wVar, entry.getValue());
        }
        wVar.p();
    }

    @Override // lb.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Map<K, V> n3(f fVar) throws IOException {
        p pVar = new p();
        fVar.a();
        while (fVar.p()) {
            fVar.ej();
            K kN3 = this.y.n3(fVar);
            V vN3 = this.n3.n3(fVar);
            V vPut = pVar.put(kN3, vN3);
            if (vPut != null) {
                throw new s("Map key '" + kN3 + "' has multiple values at path " + fVar.getPath() + ": " + vPut + " and " + vN3);
            }
        }
        fVar.w();
        return pVar;
    }

    public String toString() {
        return "JsonAdapter(" + this.y + "=" + this.n3 + ")";
    }
}
