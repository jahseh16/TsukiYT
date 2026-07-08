package k4;

import g4.xc;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    public enum gv implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            c5.zn(false);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class n3<T> extends k<T> {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Object f5988v;
        public boolean y;

        public n3(Object obj) {
            this.f5988v = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.y;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.y) {
                throw new NoSuchElementException();
            }
            this.y = true;
            return (T) this.f5988v;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class y<T> extends k4.n3<T> {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ Iterator f5989fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ g4.w f5990s;

        public y(Iterator it, g4.w wVar) {
            this.f5989fb = it;
            this.f5990s = wVar;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // k4.n3
        public T y() {
            while (this.f5989fb.hasNext()) {
                T t3 = (T) this.f5989fb.next();
                if (this.f5990s.apply(t3)) {
                    return t3;
                }
            }
            return n3();
        }
    }

    public static final class zn<T> extends k4.y<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final f7<Object> f5991f = new zn(new Object[0], 0, 0, 0);

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final T[] f5992fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f5993s;

        public zn(T[] tArr, int i, int i5, int i8) {
            super(i5, i8);
            this.f5992fb = tArr;
            this.f5993s = i;
        }

        @Override // k4.y
        public T y(int i) {
            return this.f5992fb[this.f5993s + i];
        }
    }

    public static <T> k<T> a() {
        return fb();
    }

    public static <T> k<T> c5(Iterator<T> it, g4.w<? super T> wVar) {
        xc.t(it);
        xc.t(wVar);
        return new y(it, wVar);
    }

    public static <T> T f(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> f7<T> fb() {
        return (f7<T>) zn.f5991f;
    }

    public static boolean gv(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> T i9(Iterator<T> it, g4.w<? super T> wVar) {
        xc.t(it);
        xc.t(wVar);
        while (it.hasNext()) {
            T next = it.next();
            if (wVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> k<T> mt(T t3) {
        return new n3(t3);
    }

    public static <T> boolean n3(Iterator<T> it, g4.w<? super T> wVar) {
        return wz(it, wVar) != -1;
    }

    public static <T> boolean p(Iterator<T> it, g4.w<? super T> wVar) {
        xc.t(wVar);
        boolean z = false;
        while (it.hasNext()) {
            if (wVar.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> Iterator<T> s() {
        return gv.INSTANCE;
    }

    public static <T> T t(Iterator<? extends T> it, T t3) {
        return it.hasNext() ? (T) f(it) : t3;
    }

    public static <T> T tl(Iterator<? extends T> it, T t3) {
        return it.hasNext() ? it.next() : t3;
    }

    public static boolean v(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !g4.f.y(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static boolean w(Iterator<?> it, Collection<?> collection) {
        xc.t(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> int wz(Iterator<T> it, g4.w<? super T> wVar) {
        xc.tl(wVar, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (wVar.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <T> T xc(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    public static <T> boolean y(Collection<T> collection, Iterator<? extends T> it) {
        xc.t(collection);
        xc.t(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static void zn(Iterator<?> it) {
        xc.t(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
