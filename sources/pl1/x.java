package pl1;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import pl1.rz;
import sj1.f3;
import sj1.z;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sj1.z f7341a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final boolean f7342c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final rz<?>[] f7343f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final sj1.i4 f7344fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final String f7345gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final boolean f7346i9;
    public final Method n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f7347s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f7348t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f7349v;
    public final Class<?> y;
    public final sj1.r zn;

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type[] f7350a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public boolean f7351c5;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public String f7352co;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f7353f;
        public boolean f3;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public boolean f7354fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final Annotation[] f7355gv;

        /* JADX INFO: renamed from: i4, reason: collision with root package name */
        public rz<?>[] f7356i4;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public boolean f7357i9;

        /* JADX INFO: renamed from: mt, reason: collision with root package name */
        public boolean f7358mt;
        public final Class<?> n3;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f7359p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public sj1.i4 f7360r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f7361s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f7362t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public boolean f7363tl;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final Annotation[][] f7364v;
        public boolean w;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public boolean f7365wz;

        /* JADX INFO: renamed from: x4, reason: collision with root package name */
        public Set<String> f7366x4;

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public String f7367xc;
        public final k5 y;
        public sj1.z z;
        public final Method zn;
        public static final Pattern n = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        public static final Pattern c = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        public y(k5 k5Var, Class<?> cls, Method method) {
            this.y = k5Var;
            this.n3 = cls;
            this.zn = method;
            this.f7355gv = method.getAnnotations();
            this.f7350a = method.getGenericParameterTypes();
            this.f7364v = method.getParameterAnnotations();
        }

        public static Set<String> s(String str) {
            Matcher matcher = n.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        public static Class<?> y(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public final rz<?> a(int i, Type type, Annotation[] annotationArr, boolean z) {
            rz<?> rzVar;
            if (annotationArr != null) {
                rzVar = null;
                for (Annotation annotation : annotationArr) {
                    rz<?> rzVarFb = fb(i, type, annotationArr, annotation);
                    if (rzVarFb != null) {
                        if (rzVar != null) {
                            throw j5.w(this.zn, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        rzVar = rzVarFb;
                    }
                }
            } else {
                rzVar = null;
            }
            if (rzVar != null) {
                return rzVar;
            }
            if (z) {
                try {
                    if (j5.s(type) == Continuation.class) {
                        this.f3 = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw j5.w(this.zn, i, "No Retrofit annotation found.", new Object[0]);
        }

        public final void c5(int i, String str) {
            if (!c.matcher(str).matches()) {
                throw j5.w(this.zn, i, "@Path parameter name must match %s. Found: %s", n.pattern(), str);
            }
            if (!this.f7366x4.contains(str)) {
                throw j5.w(this.zn, i, "URL \"%s\" does not contain \"{%s}\".", this.f7352co, str);
            }
        }

        public final rz<?> fb(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof rl1.n) {
                i9(i, type);
                if (this.f7365wz) {
                    throw j5.w(this.zn, i, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f7357i9) {
                    throw j5.w(this.zn, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f7353f) {
                    throw j5.w(this.zn, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f7362t) {
                    throw j5.w(this.zn, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f7363tl) {
                    throw j5.w(this.zn, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f7352co != null) {
                    throw j5.w(this.zn, i, "@Url cannot be used with @%s URL", this.f7367xc);
                }
                this.f7365wz = true;
                if (type == sj1.r.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new rz.w(this.zn, i);
                }
                throw j5.w(this.zn, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof rl1.co) {
                i9(i, type);
                if (this.f7353f) {
                    throw j5.w(this.zn, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f7362t) {
                    throw j5.w(this.zn, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f7363tl) {
                    throw j5.w(this.zn, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f7365wz) {
                    throw j5.w(this.zn, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f7352co == null) {
                    throw j5.w(this.zn, i, "@Path can only be used with relative url on @%s", this.f7367xc);
                }
                this.f7357i9 = true;
                rl1.co coVar = (rl1.co) annotation;
                String strValue = coVar.value();
                c5(i, strValue);
                return new rz.f(this.zn, i, strValue, this.y.c5(type, annotationArr), coVar.encoded());
            }
            if (annotation instanceof rl1.z) {
                i9(i, type);
                rl1.z zVar = (rl1.z) annotation;
                String strValue2 = zVar.value();
                boolean zEncoded = zVar.encoded();
                Class<?> clsS = j5.s(type);
                this.f7353f = true;
                if (!Iterable.class.isAssignableFrom(clsS)) {
                    return clsS.isArray() ? new rz.t(strValue2, this.y.c5(y(clsS.getComponentType()), annotationArr), zEncoded).n3() : new rz.t(strValue2, this.y.c5(type, annotationArr), zEncoded);
                }
                if (type instanceof ParameterizedType) {
                    return new rz.t(strValue2, this.y.c5(j5.fb(0, (ParameterizedType) type), annotationArr), zEncoded).zn();
                }
                throw j5.w(this.zn, i, clsS.getSimpleName() + " must include generic type (e.g., " + clsS.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof rl1.x4) {
                i9(i, type);
                boolean zEncoded2 = ((rl1.x4) annotation).encoded();
                Class<?> clsS2 = j5.s(type);
                this.f7362t = true;
                if (!Iterable.class.isAssignableFrom(clsS2)) {
                    return clsS2.isArray() ? new rz.wz(this.y.c5(y(clsS2.getComponentType()), annotationArr), zEncoded2).n3() : new rz.wz(this.y.c5(type, annotationArr), zEncoded2);
                }
                if (type instanceof ParameterizedType) {
                    return new rz.wz(this.y.c5(j5.fb(0, (ParameterizedType) type), annotationArr), zEncoded2).zn();
                }
                throw j5.w(this.zn, i, clsS2.getSimpleName() + " must include generic type (e.g., " + clsS2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof rl1.r) {
                i9(i, type);
                Class<?> clsS3 = j5.s(type);
                this.f7363tl = true;
                if (!Map.class.isAssignableFrom(clsS3)) {
                    throw j5.w(this.zn, i, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeC5 = j5.c5(type, clsS3, Map.class);
                if (!(typeC5 instanceof ParameterizedType)) {
                    throw j5.w(this.zn, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeC5;
                Type typeFb = j5.fb(0, parameterizedType);
                if (String.class == typeFb) {
                    return new rz.tl(this.zn, i, this.y.c5(j5.fb(1, parameterizedType), annotationArr), ((rl1.r) annotation).encoded());
                }
                throw j5.w(this.zn, i, "@QueryMap keys must be of type String: " + typeFb, new Object[0]);
            }
            if (annotation instanceof rl1.c5) {
                i9(i, type);
                rl1.c5 c5Var = (rl1.c5) annotation;
                String strValue3 = c5Var.value();
                Class<?> clsS4 = j5.s(type);
                if (!Iterable.class.isAssignableFrom(clsS4)) {
                    return clsS4.isArray() ? new rz.a(strValue3, this.y.c5(y(clsS4.getComponentType()), annotationArr), c5Var.allowUnsafeNonAsciiValues()).n3() : new rz.a(strValue3, this.y.c5(type, annotationArr), c5Var.allowUnsafeNonAsciiValues());
                }
                if (type instanceof ParameterizedType) {
                    return new rz.a(strValue3, this.y.c5(j5.fb(0, (ParameterizedType) type), annotationArr), c5Var.allowUnsafeNonAsciiValues()).zn();
                }
                throw j5.w(this.zn, i, clsS4.getSimpleName() + " must include generic type (e.g., " + clsS4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof rl1.i9) {
                if (type == sj1.z.class) {
                    return new rz.s(this.zn, i);
                }
                i9(i, type);
                Class<?> clsS5 = j5.s(type);
                if (!Map.class.isAssignableFrom(clsS5)) {
                    throw j5.w(this.zn, i, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                }
                Type typeC52 = j5.c5(type, clsS5, Map.class);
                if (!(typeC52 instanceof ParameterizedType)) {
                    throw j5.w(this.zn, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeC52;
                Type typeFb2 = j5.fb(0, parameterizedType2);
                if (String.class == typeFb2) {
                    return new rz.fb(this.zn, i, this.y.c5(j5.fb(1, parameterizedType2), annotationArr), ((rl1.i9) annotation).allowUnsafeNonAsciiValues());
                }
                throw j5.w(this.zn, i, "@HeaderMap keys must be of type String: " + typeFb2, new Object[0]);
            }
            if (annotation instanceof rl1.zn) {
                i9(i, type);
                if (!this.f7359p) {
                    throw j5.w(this.zn, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                rl1.zn znVar = (rl1.zn) annotation;
                String strValue4 = znVar.value();
                boolean zEncoded3 = znVar.encoded();
                this.f7354fb = true;
                Class<?> clsS6 = j5.s(type);
                if (!Iterable.class.isAssignableFrom(clsS6)) {
                    return clsS6.isArray() ? new rz.gv(strValue4, this.y.c5(y(clsS6.getComponentType()), annotationArr), zEncoded3).n3() : new rz.gv(strValue4, this.y.c5(type, annotationArr), zEncoded3);
                }
                if (type instanceof ParameterizedType) {
                    return new rz.gv(strValue4, this.y.c5(j5.fb(0, (ParameterizedType) type), annotationArr), zEncoded3).zn();
                }
                throw j5.w(this.zn, i, clsS6.getSimpleName() + " must include generic type (e.g., " + clsS6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof rl1.gv) {
                i9(i, type);
                if (!this.f7359p) {
                    throw j5.w(this.zn, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> clsS7 = j5.s(type);
                if (!Map.class.isAssignableFrom(clsS7)) {
                    throw j5.w(this.zn, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeC53 = j5.c5(type, clsS7, Map.class);
                if (!(typeC53 instanceof ParameterizedType)) {
                    throw j5.w(this.zn, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeC53;
                Type typeFb3 = j5.fb(0, parameterizedType3);
                if (String.class == typeFb3) {
                    f fVarC5 = this.y.c5(j5.fb(1, parameterizedType3), annotationArr);
                    this.f7354fb = true;
                    return new rz.v(this.zn, i, fVarC5, ((rl1.gv) annotation).encoded());
                }
                throw j5.w(this.zn, i, "@FieldMap keys must be of type String: " + typeFb3, new Object[0]);
            }
            if (annotation instanceof rl1.p) {
                i9(i, type);
                if (!this.f7358mt) {
                    throw j5.w(this.zn, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
                rl1.p pVar = (rl1.p) annotation;
                this.f7361s = true;
                String strValue5 = pVar.value();
                Class<?> clsS8 = j5.s(type);
                if (strValue5.isEmpty()) {
                    if (!Iterable.class.isAssignableFrom(clsS8)) {
                        if (clsS8.isArray()) {
                            if (f3.zn.class.isAssignableFrom(clsS8.getComponentType())) {
                                return rz.xc.y.n3();
                            }
                            throw j5.w(this.zn, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        if (f3.zn.class.isAssignableFrom(clsS8)) {
                            return rz.xc.y;
                        }
                        throw j5.w(this.zn, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (type instanceof ParameterizedType) {
                        if (f3.zn.class.isAssignableFrom(j5.s(j5.fb(0, (ParameterizedType) type)))) {
                            return rz.xc.y.zn();
                        }
                        throw j5.w(this.zn, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    throw j5.w(this.zn, i, clsS8.getSimpleName() + " must include generic type (e.g., " + clsS8.getSimpleName() + "<String>)", new Object[0]);
                }
                sj1.z zVarA = sj1.z.a("Content-Disposition", "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", pVar.encoding());
                if (!Iterable.class.isAssignableFrom(clsS8)) {
                    if (!clsS8.isArray()) {
                        if (f3.zn.class.isAssignableFrom(clsS8)) {
                            throw j5.w(this.zn, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        return new rz.c5(this.zn, i, zVarA, this.y.fb(type, annotationArr, this.f7355gv));
                    }
                    Class<?> clsY = y(clsS8.getComponentType());
                    if (f3.zn.class.isAssignableFrom(clsY)) {
                        throw j5.w(this.zn, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new rz.c5(this.zn, i, zVarA, this.y.fb(clsY, annotationArr, this.f7355gv)).n3();
                }
                if (type instanceof ParameterizedType) {
                    Type typeFb4 = j5.fb(0, (ParameterizedType) type);
                    if (f3.zn.class.isAssignableFrom(j5.s(typeFb4))) {
                        throw j5.w(this.zn, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new rz.c5(this.zn, i, zVarA, this.y.fb(typeFb4, annotationArr, this.f7355gv)).zn();
                }
                throw j5.w(this.zn, i, clsS8.getSimpleName() + " must include generic type (e.g., " + clsS8.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof rl1.mt) {
                i9(i, type);
                if (!this.f7358mt) {
                    throw j5.w(this.zn, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.f7361s = true;
                Class<?> clsS9 = j5.s(type);
                if (!Map.class.isAssignableFrom(clsS9)) {
                    throw j5.w(this.zn, i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type typeC54 = j5.c5(type, clsS9, Map.class);
                if (!(typeC54 instanceof ParameterizedType)) {
                    throw j5.w(this.zn, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) typeC54;
                Type typeFb5 = j5.fb(0, parameterizedType4);
                if (String.class == typeFb5) {
                    Type typeFb6 = j5.fb(1, parameterizedType4);
                    if (f3.zn.class.isAssignableFrom(j5.s(typeFb6))) {
                        throw j5.w(this.zn, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                    }
                    return new rz.i9(this.zn, i, this.y.fb(typeFb6, annotationArr, this.f7355gv), ((rl1.mt) annotation).encoding());
                }
                throw j5.w(this.zn, i, "@PartMap keys must be of type String: " + typeFb5, new Object[0]);
            }
            if (annotation instanceof rl1.y) {
                i9(i, type);
                if (this.f7359p || this.f7358mt) {
                    throw j5.w(this.zn, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                }
                if (this.f7351c5) {
                    throw j5.w(this.zn, i, "Multiple @Body method annotations found.", new Object[0]);
                }
                try {
                    f fVarFb = this.y.fb(type, annotationArr, this.f7355gv);
                    this.f7351c5 = true;
                    return new rz.zn(this.zn, i, fVarFb);
                } catch (RuntimeException e4) {
                    throw j5.p(this.zn, e4, i, "Unable to create @Body converter for %s", type);
                }
            }
            if (!(annotation instanceof rl1.f3)) {
                return null;
            }
            i9(i, type);
            Class<?> clsS10 = j5.s(type);
            for (int i5 = i - 1; i5 >= 0; i5--) {
                rz<?> rzVar = this.f7356i4[i5];
                if ((rzVar instanceof rz.p) && ((rz.p) rzVar).y.equals(clsS10)) {
                    throw j5.w(this.zn, i, "@Tag type " + clsS10.getName() + " is duplicate of " + mg.n3.y(this.zn, i5) + " and would always overwrite its value.", new Object[0]);
                }
            }
            return new rz.p(clsS10);
        }

        public final void gv(String str, String str2, boolean z) {
            String str3 = this.f7367xc;
            if (str3 != null) {
                throw j5.wz(this.zn, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f7367xc = str;
            this.w = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (n.matcher(strSubstring).find()) {
                    throw j5.wz(this.zn, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f7352co = str2;
            this.f7366x4 = s(str2);
        }

        public final void i9(int i, Type type) {
            if (j5.i9(type)) {
                throw j5.w(this.zn, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        public x n3() {
            for (Annotation annotation : this.f7355gv) {
                v(annotation);
            }
            if (this.f7367xc == null) {
                throw j5.wz(this.zn, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.w) {
                if (this.f7358mt) {
                    throw j5.wz(this.zn, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f7359p) {
                    throw j5.wz(this.zn, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f7364v.length;
            this.f7356i4 = new rz[length];
            int i = length - 1;
            int i5 = 0;
            while (i5 < length) {
                this.f7356i4[i5] = a(i5, this.f7350a[i5], this.f7364v[i5], i5 == i);
                i5++;
            }
            if (this.f7352co == null && !this.f7365wz) {
                throw j5.wz(this.zn, "Missing either @%s URL or @Url parameter.", this.f7367xc);
            }
            boolean z = this.f7359p;
            if (!z && !this.f7358mt && !this.w && this.f7351c5) {
                throw j5.wz(this.zn, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z && !this.f7354fb) {
                throw j5.wz(this.zn, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f7358mt || this.f7361s) {
                return new x(this);
            }
            throw j5.wz(this.zn, "Multipart method must contain at least one @Part.", new Object[0]);
        }

        public final void v(Annotation annotation) {
            if (annotation instanceof rl1.n3) {
                gv("DELETE", ((rl1.n3) annotation).value(), false);
                return;
            }
            if (annotation instanceof rl1.a) {
                gv("GET", ((rl1.a) annotation).value(), false);
                return;
            }
            if (annotation instanceof rl1.fb) {
                gv("HEAD", ((rl1.fb) annotation).value(), false);
                return;
            }
            if (annotation instanceof rl1.wz) {
                gv("PATCH", ((rl1.wz) annotation).value(), true);
                return;
            }
            if (annotation instanceof rl1.xc) {
                gv("POST", ((rl1.xc) annotation).value(), true);
                return;
            }
            if (annotation instanceof rl1.w) {
                gv("PUT", ((rl1.w) annotation).value(), true);
                return;
            }
            if (annotation instanceof rl1.tl) {
                gv("OPTIONS", ((rl1.tl) annotation).value(), false);
                return;
            }
            if (annotation instanceof rl1.s) {
                rl1.s sVar = (rl1.s) annotation;
                gv(sVar.method(), sVar.path(), sVar.hasBody());
                return;
            }
            if (annotation instanceof rl1.f) {
                rl1.f fVar = (rl1.f) annotation;
                String[] strArrValue = fVar.value();
                if (strArrValue.length == 0) {
                    throw j5.wz(this.zn, "@Headers annotation is empty.", new Object[0]);
                }
                this.z = zn(strArrValue, fVar.allowUnsafeNonAsciiValues());
                return;
            }
            if (annotation instanceof rl1.t) {
                if (this.f7359p) {
                    throw j5.wz(this.zn, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f7358mt = true;
            } else if (annotation instanceof rl1.v) {
                if (this.f7358mt) {
                    throw j5.wz(this.zn, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f7359p = true;
            }
        }

        public final sj1.z zn(String[] strArr, boolean z) {
            z.y yVar = new z.y();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw j5.wz(this.zn, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f7360r = sj1.i4.v(strTrim);
                    } catch (IllegalArgumentException e4) {
                        throw j5.xc(this.zn, e4, "Malformed content type: %s", strTrim);
                    }
                } else if (z) {
                    yVar.v(strSubstring, strTrim);
                } else {
                    yVar.y(strSubstring, strTrim);
                }
            }
            return yVar.a();
        }
    }

    public x(y yVar) {
        this.y = yVar.n3;
        this.n3 = yVar.zn;
        this.zn = yVar.y.zn;
        this.f7345gv = yVar.f7367xc;
        this.f7349v = yVar.f7352co;
        this.f7341a = yVar.z;
        this.f7344fb = yVar.f7360r;
        this.f7347s = yVar.w;
        this.f7342c5 = yVar.f7359p;
        this.f7346i9 = yVar.f7358mt;
        this.f7343f = yVar.f7356i4;
        this.f7348t = yVar.f3;
    }

    public static x n3(k5 k5Var, Class<?> cls, Method method) {
        return new y(k5Var, cls, method).n3();
    }

    public sj1.d0 y(Object obj, Object[] objArr) throws IOException {
        rz<?>[] rzVarArr = this.f7343f;
        int length = objArr.length;
        if (length != rzVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + rzVarArr.length + ")");
        }
        a8 a8Var = new a8(this.f7345gv, this.zn, this.f7349v, this.f7341a, this.f7344fb, this.f7347s, this.f7342c5, this.f7346i9);
        if (this.f7348t) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            rzVarArr[i].y(a8Var, objArr[i]);
        }
        return a8Var.f().r(i4.class, new i4(this.y, obj, this.n3, arrayList)).n3();
    }
}
