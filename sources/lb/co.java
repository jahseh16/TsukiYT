package lb;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lb.a;

/* JADX INFO: loaded from: classes.dex */
public final class co {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final List<a.y> f6112v;
    public final int n3;
    public final List<a.y> y;
    public final ThreadLocal<zn> zn = new ThreadLocal<>();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Map<Object, a<?>> f6113gv = new LinkedHashMap();

    public static final class n3<T> extends a<T> {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public a<T> f6114gv;
        public final String n3;
        public final Type y;
        public final Object zn;

        public n3(Type type, String str, Object obj) {
            this.y = type;
            this.n3 = str;
            this.zn = obj;
        }

        @Override // lb.a
        public void fb(w wVar, T t3) throws IOException {
            a<T> aVar = this.f6114gv;
            if (aVar == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            aVar.fb(wVar, t3);
        }

        @Override // lb.a
        public T n3(f fVar) throws IOException {
            a<T> aVar = this.f6114gv;
            if (aVar != null) {
                return aVar.n3(fVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public String toString() {
            a<T> aVar = this.f6114gv;
            return aVar != null ? aVar.toString() : super.toString();
        }
    }

    public static final class y {
        public final List<a.y> y = new ArrayList();
        public int n3 = 0;

        public co y() {
            return new co(this);
        }
    }

    public final class zn {
        public boolean zn;
        public final List<n3<?>> y = new ArrayList();
        public final Deque<n3<?>> n3 = new ArrayDeque();

        public zn() {
        }

        public <T> a<T> gv(Type type, String str, Object obj) {
            int size = this.y.size();
            for (int i = 0; i < size; i++) {
                n3<?> n3Var = this.y.get(i);
                if (n3Var.zn.equals(obj)) {
                    this.n3.add(n3Var);
                    a<T> aVar = (a<T>) n3Var.f6114gv;
                    return aVar != null ? aVar : n3Var;
                }
            }
            n3<?> n3Var2 = new n3<>(type, str, obj);
            this.y.add(n3Var2);
            this.n3.add(n3Var2);
            return null;
        }

        public IllegalArgumentException n3(IllegalArgumentException illegalArgumentException) {
            if (this.zn) {
                return illegalArgumentException;
            }
            this.zn = true;
            if (this.n3.size() == 1 && this.n3.getFirst().n3 == null) {
                return illegalArgumentException;
            }
            StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
            Iterator<n3<?>> itDescendingIterator = this.n3.descendingIterator();
            while (itDescendingIterator.hasNext()) {
                n3<?> next = itDescendingIterator.next();
                sb.append("\nfor ");
                sb.append(next.y);
                if (next.n3 != null) {
                    sb.append(' ');
                    sb.append(next.n3);
                }
            }
            return new IllegalArgumentException(sb.toString(), illegalArgumentException);
        }

        public <T> void y(a<T> aVar) {
            this.n3.getLast().f6114gv = aVar;
        }

        public void zn(boolean z) {
            this.n3.removeLast();
            if (this.n3.isEmpty()) {
                co.this.zn.remove();
                if (z) {
                    synchronized (co.this.f6113gv) {
                        try {
                            int size = this.y.size();
                            for (int i = 0; i < size; i++) {
                                n3<?> n3Var = this.y.get(i);
                                a<T> aVar = (a) co.this.f6113gv.put(n3Var.zn, n3Var.f6114gv);
                                if (aVar != 0) {
                                    n3Var.f6114gv = aVar;
                                    co.this.f6113gv.put(n3Var.zn, aVar);
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f6112v = arrayList;
        arrayList.add(r.y);
        arrayList.add(gv.n3);
        arrayList.add(mt.zn);
        arrayList.add(lb.y.zn);
        arrayList.add(z.y);
        arrayList.add(lb.zn.f6161gv);
    }

    public co(y yVar) {
        int size = yVar.y.size();
        List<a.y> list = f6112v;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(yVar.y);
        arrayList.addAll(list);
        this.y = Collections.unmodifiableList(arrayList);
        this.n3 = yVar.n3;
    }

    public <T> a<T> a(Type type, Set<? extends Annotation> set, String str) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeXc = mb.n3.xc(mb.n3.y(type));
        Object objFb = fb(typeXc, set);
        synchronized (this.f6113gv) {
            try {
                a<T> aVar = (a) this.f6113gv.get(objFb);
                if (aVar != null) {
                    return aVar;
                }
                zn znVar = this.zn.get();
                if (znVar == null) {
                    znVar = new zn();
                    this.zn.set(znVar);
                }
                a<T> aVarGv = znVar.gv(typeXc, str, objFb);
                try {
                    if (aVarGv != null) {
                        return aVarGv;
                    }
                    try {
                        int size = this.y.size();
                        for (int i = 0; i < size; i++) {
                            a<T> aVar2 = (a<T>) this.y.get(i).y(typeXc, set, this);
                            if (aVar2 != null) {
                                znVar.y(aVar2);
                                znVar.zn(true);
                                return aVar2;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + mb.n3.z(typeXc, set));
                    } catch (IllegalArgumentException e4) {
                        throw znVar.n3(e4);
                    }
                } finally {
                    znVar.zn(false);
                }
            } finally {
            }
        }
    }

    public final Object fb(Type type, Set<? extends Annotation> set) {
        return set.isEmpty() ? type : Arrays.asList(type, set);
    }

    public <T> a<T> gv(Type type) {
        return v(type, mb.n3.y);
    }

    public <T> a<T> v(Type type, Set<? extends Annotation> set) {
        return a(type, set, null);
    }

    public <T> a<T> zn(Class<T> cls) {
        return v(cls, mb.n3.y);
    }
}
