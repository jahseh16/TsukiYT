package lb;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import lb.a;
import lb.f;

/* JADX INFO: loaded from: classes.dex */
public final class zn<T> extends a<T> {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final a.y f6161gv = new y();
    public final n3<?>[] n3;
    public final lb.n3<T> y;
    public final f.y zn;

    public static class n3<T> {
        public final Field n3;
        public final String y;
        public final a<T> zn;

        public n3(String str, Field field, a<T> aVar) {
            this.y = str;
            this.n3 = field;
            this.zn = aVar;
        }

        public void n3(w wVar, Object obj) throws IllegalAccessException, IOException {
            this.zn.fb(wVar, (T) this.n3.get(obj));
        }

        public void y(f fVar, Object obj) throws IllegalAccessException, IOException {
            this.n3.set(obj, this.zn.n3(fVar));
        }
    }

    public class y implements a.y {
        public final void gv(Type type, Class<?> cls) {
            Class<?> clsFb = x4.fb(type);
            if (cls.isAssignableFrom(clsFb)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsFb.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        public final void n3(co coVar, Type type, Map<String, n3<?>> map) {
            v vVar;
            Class<?> clsFb = x4.fb(type);
            boolean zC5 = mb.n3.c5(clsFb);
            for (Field field : clsFb.getDeclaredFields()) {
                if (zn(zC5, field.getModifiers()) && ((vVar = (v) field.getAnnotation(v.class)) == null || !vVar.ignore())) {
                    Type typeW = mb.n3.w(type, clsFb, field.getGenericType());
                    Set<? extends Annotation> setI9 = mb.n3.i9(field);
                    String name = field.getName();
                    a<T> aVarA = coVar.a(typeW, setI9, name);
                    field.setAccessible(true);
                    String strTl = mb.n3.tl(name, vVar);
                    n3<?> n3Var = new n3<>(strTl, field, aVarA);
                    n3<?> n3VarPut = map.put(strTl, n3Var);
                    if (n3VarPut != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + n3VarPut.n3 + "\n    " + n3Var.n3);
                    }
                }
            }
        }

        @Override // lb.a.y
        public a<?> y(Type type, Set<? extends Annotation> set, co coVar) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> clsFb = x4.fb(type);
            if (clsFb.isInterface() || clsFb.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (mb.n3.c5(clsFb)) {
                gv(type, List.class);
                gv(type, Set.class);
                gv(type, Map.class);
                gv(type, Collection.class);
                String str = "Platform " + clsFb;
                if (type instanceof ParameterizedType) {
                    str = str + " in " + type;
                }
                throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
            }
            if (clsFb.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class " + clsFb.getName());
            }
            if (clsFb.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class " + clsFb.getName());
            }
            if (clsFb.getEnclosingClass() != null && !Modifier.isStatic(clsFb.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class " + clsFb.getName());
            }
            if (Modifier.isAbstract(clsFb.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class " + clsFb.getName());
            }
            if (mb.n3.s(clsFb)) {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + clsFb.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
            lb.n3 n3VarY = lb.n3.y(clsFb);
            TreeMap treeMap = new TreeMap();
            while (type != Object.class) {
                n3(coVar, type, treeMap);
                type = x4.a(type);
            }
            return new zn(n3VarY, treeMap).gv();
        }

        public final boolean zn(boolean z, int i) {
            if (Modifier.isStatic(i) || Modifier.isTransient(i)) {
                return false;
            }
            return Modifier.isPublic(i) || Modifier.isProtected(i) || !z;
        }
    }

    public zn(lb.n3<T> n3Var, Map<String, n3<?>> map) {
        this.y = n3Var;
        this.n3 = (n3[]) map.values().toArray(new n3[map.size()]);
        this.zn = f.y.y((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // lb.a
    public void fb(w wVar, T t3) throws IOException {
        try {
            wVar.a();
            for (n3<?> n3Var : this.n3) {
                wVar.co(n3Var.y);
                n3Var.n3(wVar, t3);
            }
            wVar.p();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    @Override // lb.a
    public T n3(f fVar) throws IOException {
        try {
            T tN3 = this.y.n3();
            try {
                fVar.a();
                while (fVar.p()) {
                    int iJ = fVar.j(this.zn);
                    if (iJ == -1) {
                        fVar.k();
                        fVar.f7();
                    } else {
                        this.n3[iJ].y(fVar, tN3);
                    }
                }
                fVar.w();
                return tN3;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw mb.n3.co(e5);
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.y + ")";
    }
}
