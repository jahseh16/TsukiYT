package lb;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import lb.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class gv<C extends Collection<T>, T> extends a<C> {
    public static final a.y n3 = new y();
    public final a<T> y;

    public class n3 extends gv<Collection<T>, T> {
        public n3(a aVar) {
            super(aVar, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lb.a
        public /* bridge */ /* synthetic */ void fb(w wVar, Object obj) throws IOException {
            super.t(wVar, (Collection) obj);
        }

        @Override // lb.gv
        public Collection<T> i9() {
            return new ArrayList();
        }

        @Override // lb.a
        public /* bridge */ /* synthetic */ Object n3(f fVar) throws IOException {
            return super.s(fVar);
        }
    }

    public class y implements a.y {
        @Override // lb.a.y
        public a<?> y(Type type, Set<? extends Annotation> set, co coVar) {
            Class<?> clsFb = x4.fb(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (clsFb == List.class || clsFb == Collection.class) {
                return gv.c5(type, coVar).gv();
            }
            if (clsFb == Set.class) {
                return gv.f(type, coVar).gv();
            }
            return null;
        }
    }

    public class zn extends gv<Set<T>, T> {
        public zn(a aVar) {
            super(aVar, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lb.a
        public /* bridge */ /* synthetic */ void fb(w wVar, Object obj) throws IOException {
            super.t(wVar, (Collection) obj);
        }

        @Override // lb.a
        public /* bridge */ /* synthetic */ Object n3(f fVar) throws IOException {
            return super.s(fVar);
        }

        @Override // lb.gv
        /* JADX INFO: renamed from: tl, reason: merged with bridge method [inline-methods] */
        public Set<T> i9() {
            return new LinkedHashSet();
        }
    }

    public /* synthetic */ gv(a aVar, y yVar) {
        this(aVar);
    }

    public static <T> a<Collection<T>> c5(Type type, co coVar) {
        return new n3(coVar.gv(x4.zn(type, Collection.class)));
    }

    public static <T> a<Set<T>> f(Type type, co coVar) {
        return new zn(coVar.gv(x4.zn(type, Collection.class)));
    }

    public abstract C i9();

    public C s(f fVar) throws IOException {
        C c = (C) i9();
        fVar.y();
        while (fVar.p()) {
            c.add(this.y.n3(fVar));
        }
        fVar.t();
        return c;
    }

    public void t(w wVar, C c) throws IOException {
        wVar.y();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            this.y.fb(wVar, (T) it.next());
        }
        wVar.w();
    }

    public String toString() {
        return this.y + ".collection()";
    }

    public gv(a<T> aVar) {
        this.y = aVar;
    }
}
