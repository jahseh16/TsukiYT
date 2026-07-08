package pl1;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import sj1.f3;

/* JADX INFO: loaded from: classes.dex */
public abstract class rz<T> {

    public static final class a<T> extends rz<T> {
        public final pl1.f<T, String> n3;
        public final String y;
        public final boolean zn;

        public a(String str, pl1.f<T, String> fVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.y = str;
            this.n3 = fVar;
            this.zn = z;
        }

        @Override // pl1.rz
        public void y(a8 a8Var, T t3) throws IOException {
            String strConvert;
            if (t3 == null || (strConvert = this.n3.convert(t3)) == null) {
                return;
            }
            a8Var.n3(this.y, strConvert, this.zn);
        }
    }

    public static final class c5<T> extends rz<T> {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final pl1.f<T, sj1.fh> f7329gv;
        public final int n3;
        public final Method y;
        public final sj1.z zn;

        public c5(Method method, int i, sj1.z zVar, pl1.f<T, sj1.fh> fVar) {
            this.y = method;
            this.n3 = i;
            this.zn = zVar;
            this.f7329gv = fVar;
        }

        @Override // pl1.rz
        public void y(a8 a8Var, T t3) {
            if (t3 == null) {
                return;
            }
            try {
                a8Var.gv(this.zn, this.f7329gv.convert(t3));
            } catch (IOException e4) {
                throw j5.w(this.y, this.n3, "Unable to convert " + t3 + " to RequestBody", e4);
            }
        }
    }

    public static final class f<T> extends rz<T> {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final pl1.f<T, String> f7330gv;
        public final int n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f7331v;
        public final Method y;
        public final String zn;

        public f(Method method, int i, String str, pl1.f<T, String> fVar, boolean z) {
            this.y = method;
            this.n3 = i;
            Objects.requireNonNull(str, "name == null");
            this.zn = str;
            this.f7330gv = fVar;
            this.f7331v = z;
        }

        @Override // pl1.rz
        public void y(a8 a8Var, T t3) throws IOException {
            if (t3 != null) {
                a8Var.a(this.zn, this.f7330gv.convert(t3), this.f7331v);
                return;
            }
            throw j5.w(this.y, this.n3, "Path parameter \"" + this.zn + "\" value must not be null.", new Object[0]);
        }
    }

    public static final class fb<T> extends rz<Map<String, T>> {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final boolean f7332gv;
        public final int n3;
        public final Method y;
        public final pl1.f<T, String> zn;

        public fb(Method method, int i, pl1.f<T, String> fVar, boolean z) {
            this.y = method;
            this.n3 = i;
            this.zn = fVar;
            this.f7332gv = z;
        }

        @Override // pl1.rz
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void y(a8 a8Var, Map<String, T> map) throws IOException {
            if (map == null) {
                throw j5.w(this.y, this.n3, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw j5.w(this.y, this.n3, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw j5.w(this.y, this.n3, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                a8Var.n3(key, this.zn.convert(value), this.f7332gv);
            }
        }
    }

    public static final class gv<T> extends rz<T> {
        public final pl1.f<T, String> n3;
        public final String y;
        public final boolean zn;

        public gv(String str, pl1.f<T, String> fVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.y = str;
            this.n3 = fVar;
            this.zn = z;
        }

        @Override // pl1.rz
        public void y(a8 a8Var, T t3) throws IOException {
            String strConvert;
            if (t3 == null || (strConvert = this.n3.convert(t3)) == null) {
                return;
            }
            a8Var.y(this.y, strConvert, this.zn);
        }
    }

    public static final class i9<T> extends rz<Map<String, T>> {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final String f7333gv;
        public final int n3;
        public final Method y;
        public final pl1.f<T, sj1.fh> zn;

        public i9(Method method, int i, pl1.f<T, sj1.fh> fVar, String str) {
            this.y = method;
            this.n3 = i;
            this.zn = fVar;
            this.f7333gv = str;
        }

        @Override // pl1.rz
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void y(a8 a8Var, Map<String, T> map) throws IOException {
            if (map == null) {
                throw j5.w(this.y, this.n3, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw j5.w(this.y, this.n3, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw j5.w(this.y, this.n3, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                a8Var.gv(sj1.z.a("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f7333gv), this.zn.convert(value));
            }
        }
    }

    public class n3 extends rz<Object> {
        public n3() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pl1.rz
        public void y(a8 a8Var, Object obj) throws IOException {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                rz.this.y(a8Var, Array.get(obj, i));
            }
        }
    }

    public static final class p<T> extends rz<T> {
        public final Class<T> y;

        public p(Class<T> cls) {
            this.y = cls;
        }

        @Override // pl1.rz
        public void y(a8 a8Var, T t3) {
            a8Var.s(this.y, t3);
        }
    }

    public static final class s extends rz<sj1.z> {
        public final int n3;
        public final Method y;

        public s(Method method, int i) {
            this.y = method;
            this.n3 = i;
        }

        @Override // pl1.rz
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void y(a8 a8Var, sj1.z zVar) {
            if (zVar == null) {
                throw j5.w(this.y, this.n3, "Headers parameter must not be null.", new Object[0]);
            }
            a8Var.zn(zVar);
        }
    }

    public static final class t<T> extends rz<T> {
        public final pl1.f<T, String> n3;
        public final String y;
        public final boolean zn;

        public t(String str, pl1.f<T, String> fVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.y = str;
            this.n3 = fVar;
            this.zn = z;
        }

        @Override // pl1.rz
        public void y(a8 a8Var, T t3) throws IOException {
            String strConvert;
            if (t3 == null || (strConvert = this.n3.convert(t3)) == null) {
                return;
            }
            a8Var.fb(this.y, strConvert, this.zn);
        }
    }

    public static final class tl<T> extends rz<Map<String, T>> {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final boolean f7334gv;
        public final int n3;
        public final Method y;
        public final pl1.f<T, String> zn;

        public tl(Method method, int i, pl1.f<T, String> fVar, boolean z) {
            this.y = method;
            this.n3 = i;
            this.zn = fVar;
            this.f7334gv = z;
        }

        @Override // pl1.rz
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void y(a8 a8Var, Map<String, T> map) throws IOException {
            if (map == null) {
                throw j5.w(this.y, this.n3, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw j5.w(this.y, this.n3, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw j5.w(this.y, this.n3, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strConvert = this.zn.convert(value);
                if (strConvert == null) {
                    throw j5.w(this.y, this.n3, "Query map value '" + value + "' converted to null by " + this.zn.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                a8Var.fb(key, strConvert, this.f7334gv);
            }
        }
    }

    public static final class v<T> extends rz<Map<String, T>> {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final boolean f7335gv;
        public final int n3;
        public final Method y;
        public final pl1.f<T, String> zn;

        public v(Method method, int i, pl1.f<T, String> fVar, boolean z) {
            this.y = method;
            this.n3 = i;
            this.zn = fVar;
            this.f7335gv = z;
        }

        @Override // pl1.rz
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void y(a8 a8Var, Map<String, T> map) throws IOException {
            if (map == null) {
                throw j5.w(this.y, this.n3, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw j5.w(this.y, this.n3, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw j5.w(this.y, this.n3, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strConvert = this.zn.convert(value);
                if (strConvert == null) {
                    throw j5.w(this.y, this.n3, "Field map value '" + value + "' converted to null by " + this.zn.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                a8Var.y(key, strConvert, this.f7335gv);
            }
        }
    }

    public static final class w extends rz<Object> {
        public final int n3;
        public final Method y;

        public w(Method method, int i) {
            this.y = method;
            this.n3 = i;
        }

        @Override // pl1.rz
        public void y(a8 a8Var, Object obj) {
            if (obj == null) {
                throw j5.w(this.y, this.n3, "@Url parameter is null.", new Object[0]);
            }
            a8Var.tl(obj);
        }
    }

    public static final class wz<T> extends rz<T> {
        public final boolean n3;
        public final pl1.f<T, String> y;

        public wz(pl1.f<T, String> fVar, boolean z) {
            this.y = fVar;
            this.n3 = z;
        }

        @Override // pl1.rz
        public void y(a8 a8Var, T t3) throws IOException {
            if (t3 == null) {
                return;
            }
            a8Var.fb(this.y.convert(t3), null, this.n3);
        }
    }

    public static final class xc extends rz<f3.zn> {
        public static final xc y = new xc();

        @Override // pl1.rz
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void y(a8 a8Var, f3.zn znVar) {
            if (znVar != null) {
                a8Var.v(znVar);
            }
        }
    }

    public class y extends rz<Iterable<T>> {
        public y() {
        }

        @Override // pl1.rz
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public void y(a8 a8Var, Iterable<T> iterable) throws IOException {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                rz.this.y(a8Var, it.next());
            }
        }
    }

    public static final class zn<T> extends rz<T> {
        public final int n3;
        public final Method y;
        public final pl1.f<T, sj1.fh> zn;

        public zn(Method method, int i, pl1.f<T, sj1.fh> fVar) {
            this.y = method;
            this.n3 = i;
            this.zn = fVar;
        }

        @Override // pl1.rz
        public void y(a8 a8Var, T t3) {
            if (t3 == null) {
                throw j5.w(this.y, this.n3, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                a8Var.t(this.zn.convert(t3));
            } catch (IOException e4) {
                throw j5.p(this.y, e4, this.n3, "Unable to convert " + t3 + " to RequestBody", new Object[0]);
            }
        }
    }

    public final rz<Object> n3() {
        return new n3();
    }

    public abstract void y(a8 a8Var, T t3) throws IOException;

    public final rz<Iterable<T>> zn() {
        return new y();
    }
}
