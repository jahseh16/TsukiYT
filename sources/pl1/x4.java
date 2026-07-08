package pl1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import pl1.j5;
import sj1.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class x4<ResponseT, ReturnT> extends yt<ReturnT> {
    public final v.y n3;
    public final x y;
    public final f<sj1.mg, ResponseT> zn;

    public static final class n3<ResponseT> extends x4<ResponseT, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f7368a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final v<ResponseT, gv<ResponseT>> f7369gv;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f7370v;

        public n3(x xVar, v.y yVar, f<sj1.mg, ResponseT> fVar, v<ResponseT, gv<ResponseT>> vVar, boolean z, boolean z5) {
            super(xVar, yVar, fVar);
            this.f7369gv = vVar;
            this.f7370v = z;
            this.f7368a = z5;
        }

        @Override // pl1.x4
        public Object zn(gv<ResponseT> gvVar, Object[] objArr) {
            gv<ResponseT> gvVarN3 = this.f7369gv.n3(gvVar);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return this.f7368a ? f3.gv(gvVarN3, continuation) : this.f7370v ? f3.n3(gvVarN3, continuation) : f3.y(gvVarN3, continuation);
            } catch (LinkageError e4) {
                throw e4;
            } catch (ThreadDeath e5) {
                throw e5;
            } catch (VirtualMachineError e6) {
                throw e6;
            } catch (Throwable th) {
                return f3.v(th, continuation);
            }
        }
    }

    public static final class y<ResponseT, ReturnT> extends x4<ResponseT, ReturnT> {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final v<ResponseT, ReturnT> f7371gv;

        public y(x xVar, v.y yVar, f<sj1.mg, ResponseT> fVar, v<ResponseT, ReturnT> vVar) {
            super(xVar, yVar, fVar);
            this.f7371gv = vVar;
        }

        @Override // pl1.x4
        public ReturnT zn(gv<ResponseT> gvVar, Object[] objArr) {
            return this.f7371gv.n3(gvVar);
        }
    }

    public static final class zn<ResponseT> extends x4<ResponseT, Object> {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final v<ResponseT, gv<ResponseT>> f7372gv;

        public zn(x xVar, v.y yVar, f<sj1.mg, ResponseT> fVar, v<ResponseT, gv<ResponseT>> vVar) {
            super(xVar, yVar, fVar);
            this.f7372gv = vVar;
        }

        @Override // pl1.x4
        public Object zn(gv<ResponseT> gvVar, Object[] objArr) {
            gv<ResponseT> gvVarN3 = this.f7372gv.n3(gvVar);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return f3.zn(gvVarN3, continuation);
            } catch (Exception e4) {
                return f3.v(e4, continuation);
            }
        }
    }

    public x4(x xVar, v.y yVar, f<sj1.mg, ResponseT> fVar) {
        this.y = xVar;
        this.n3 = yVar;
        this.zn = fVar;
    }

    public static <ResponseT, ReturnT> x4<ResponseT, ReturnT> a(k5 k5Var, Method method, x xVar) {
        Type genericReturnType;
        boolean z;
        boolean z5;
        boolean zTl;
        boolean z7 = xVar.f7348t;
        Annotation[] annotations = method.getAnnotations();
        if (z7) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeA = j5.a(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (j5.s(typeA) == b.class && (typeA instanceof ParameterizedType)) {
                typeA = j5.fb(0, (ParameterizedType) typeA);
                zTl = false;
                z = true;
            } else {
                if (j5.s(typeA) == gv.class) {
                    throw j5.wz(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", j5.fb(0, (ParameterizedType) typeA));
                }
                zTl = j5.tl(typeA);
                z = false;
            }
            genericReturnType = new j5.n3(null, gv.class, typeA);
            annotations = hw.y(annotations);
            z5 = zTl;
        } else {
            genericReturnType = method.getGenericReturnType();
            z = false;
            z5 = false;
        }
        v vVarGv = gv(k5Var, method, genericReturnType, annotations);
        Type typeY = vVarGv.y();
        if (typeY == sj1.rz.class) {
            throw j5.wz(method, "'" + j5.s(typeY).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeY == b.class) {
            throw j5.wz(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (xVar.f7345gv.equals("HEAD") && !Void.class.equals(typeY) && !j5.tl(typeY)) {
            throw j5.wz(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
        f fVarV = v(k5Var, method, typeY);
        v.y yVar = k5Var.n3;
        return !z7 ? new y(xVar, yVar, fVarV, vVarGv) : z ? new zn(xVar, yVar, fVarV, vVarGv) : new n3(xVar, yVar, fVarV, vVarGv, false, z5);
    }

    public static <ResponseT, ReturnT> v<ResponseT, ReturnT> gv(k5 k5Var, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (v<ResponseT, ReturnT>) k5Var.y(type, annotationArr);
        } catch (RuntimeException e4) {
            throw j5.xc(method, e4, "Unable to create call adapter for %s", type);
        }
    }

    public static <ResponseT> f<sj1.mg, ResponseT> v(k5 k5Var, Method method, Type type) {
        try {
            return k5Var.s(type, method.getAnnotations());
        } catch (RuntimeException e4) {
            throw j5.xc(method, e4, "Unable to create converter for %s", type);
        }
    }

    @Override // pl1.yt
    public final ReturnT y(Object obj, Object[] objArr) {
        return zn(new n(this.y, obj, objArr, this.n3, this.zn), objArr);
    }

    public abstract ReturnT zn(gv<ResponseT> gvVar, Object[] objArr);
}
