package pl1;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import pl1.f;
import pl1.n3;
import pl1.v;
import sj1.v;

/* JADX INFO: loaded from: classes.dex */
public final class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<v.y> f7309a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final boolean f7310c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f7311fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final List<f.y> f7312gv;
    public final v.y n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Executor f7313s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f7314v;
    public final ConcurrentHashMap<Method, Object> y = new ConcurrentHashMap<>();
    public final sj1.r zn;

    public static final class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7315a;
        public sj1.r n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Executor f7317v;
        public v.y y;
        public final List<f.y> zn = new ArrayList();

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final List<v.y> f7316gv = new ArrayList();

        public n3 a(sj1.n nVar) {
            Objects.requireNonNull(nVar, "client == null");
            return v(nVar);
        }

        public k5 gv() {
            if (this.n3 == null) {
                throw new IllegalStateException("Base URL required.");
            }
            v.y nVar = this.y;
            if (nVar == null) {
                nVar = new sj1.n();
            }
            v.y yVar = nVar;
            Executor executor = this.f7317v;
            if (executor == null) {
                executor = mg.y;
            }
            Executor executor2 = executor;
            zn znVar = mg.zn;
            ArrayList arrayList = new ArrayList(this.f7316gv);
            List<? extends v.y> listY = znVar.y(executor2);
            arrayList.addAll(listY);
            List<? extends f.y> listN3 = znVar.n3();
            int size = listN3.size();
            ArrayList arrayList2 = new ArrayList(this.zn.size() + 1 + size);
            arrayList2.add(new pl1.n3());
            arrayList2.addAll(this.zn);
            arrayList2.addAll(listN3);
            return new k5(yVar, this.n3, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), listY.size(), executor2, this.f7315a);
        }

        public n3 n3(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return zn(sj1.r.i9(str));
        }

        public n3 v(v.y yVar) {
            Objects.requireNonNull(yVar, "factory == null");
            this.y = yVar;
            return this;
        }

        public n3 y(f.y yVar) {
            List<f.y> list = this.zn;
            Objects.requireNonNull(yVar, "factory == null");
            list.add(yVar);
            return this;
        }

        public n3 zn(sj1.r rVar) {
            Objects.requireNonNull(rVar, "baseUrl == null");
            if (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING.equals(rVar.w().get(r0.size() - 1))) {
                this.n3 = rVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + rVar);
        }
    }

    public class y implements InvocationHandler {
        public final /* synthetic */ Class n3;
        public final Object[] y = new Object[0];

        public y(Class cls) {
            this.n3 = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.y;
            }
            d dVar = mg.n3;
            return dVar.zn(method) ? dVar.n3(method, this.n3, obj, objArr) : k5.this.zn(this.n3, method).y(obj, objArr);
        }
    }

    public k5(v.y yVar, sj1.r rVar, List<f.y> list, int i, List<v.y> list2, int i5, Executor executor, boolean z) {
        this.n3 = yVar;
        this.zn = rVar;
        this.f7312gv = list;
        this.f7314v = i;
        this.f7309a = list2;
        this.f7311fb = i5;
        this.f7313s = executor;
        this.f7310c5 = z;
    }

    public <T> f<sj1.mg, T> a(f.y yVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f7312gv.indexOf(yVar) + 1;
        int size = this.f7312gv.size();
        for (int i = iIndexOf; i < size; i++) {
            f<sj1.mg, T> fVar = (f<sj1.mg, T>) this.f7312gv.get(i).gv(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (yVar != null) {
            sb.append("  Skipped:");
            for (int i5 = 0; i5 < iIndexOf; i5++) {
                sb.append("\n   * ");
                sb.append(this.f7312gv.get(i5).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f7312gv.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f7312gv.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> f<T, String> c5(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f7312gv.size();
        for (int i = 0; i < size; i++) {
            f<T, String> fVar = (f<T, String>) this.f7312gv.get(i).v(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        return n3.gv.y;
    }

    public <T> f<T, sj1.fh> fb(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return v(null, type, annotationArr, annotationArr2);
    }

    public v<?, ?> gv(v.y yVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f7309a.indexOf(yVar) + 1;
        int size = this.f7309a.size();
        for (int i = iIndexOf; i < size; i++) {
            v<?, ?> vVarY = this.f7309a.get(i).y(type, annotationArr, this);
            if (vVarY != null) {
                return vVarY;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (yVar != null) {
            sb.append("  Skipped:");
            for (int i5 = 0; i5 < iIndexOf; i5++) {
                sb.append("\n   * ");
                sb.append(this.f7309a.get(i5).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f7309a.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f7309a.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final void i9(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f7310c5) {
            d dVar = mg.n3;
            for (Method method : cls.getDeclaredMethods()) {
                if (!dVar.zn(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    zn(cls, method);
                }
            }
        }
    }

    public <T> T n3(Class<T> cls) {
        i9(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new y(cls));
    }

    public <T> f<sj1.mg, T> s(Type type, Annotation[] annotationArr) {
        return a(null, type, annotationArr);
    }

    public <T> f<T, sj1.fh> v(f.y yVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f7312gv.indexOf(yVar) + 1;
        int size = this.f7312gv.size();
        for (int i = iIndexOf; i < size; i++) {
            f<T, sj1.fh> fVar = (f<T, sj1.fh>) this.f7312gv.get(i).zn(type, annotationArr, annotationArr2, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (yVar != null) {
            sb.append("  Skipped:");
            for (int i5 = 0; i5 < iIndexOf; i5++) {
                sb.append("\n   * ");
                sb.append(this.f7312gv.get(i5).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f7312gv.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f7312gv.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public v<?, ?> y(Type type, Annotation[] annotationArr) {
        return gv(null, type, annotationArr);
    }

    public yt<?> zn(Class<?> cls, Method method) {
        while (true) {
            Object objPutIfAbsent = this.y.get(method);
            if (objPutIfAbsent instanceof yt) {
                return (yt) objPutIfAbsent;
            }
            if (objPutIfAbsent == null) {
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        objPutIfAbsent = this.y.putIfAbsent(method, obj);
                        if (objPutIfAbsent == null) {
                            try {
                                yt<?> ytVarN3 = yt.n3(this, cls, method);
                                this.y.put(method, ytVarN3);
                                return ytVarN3;
                            } catch (Throwable th) {
                                this.y.remove(method);
                                throw th;
                            }
                        }
                    } finally {
                    }
                }
            }
            synchronized (objPutIfAbsent) {
                try {
                    Object obj2 = this.y.get(method);
                    if (obj2 != null) {
                        return (yt) obj2;
                    }
                } finally {
                }
            }
        }
    }
}
