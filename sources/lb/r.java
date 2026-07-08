package lb;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lb.a;
import lb.f;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final a.y y = new zn();
    public static final lb.a<Boolean> n3 = new gv();
    public static final lb.a<Byte> zn = new v();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final lb.a<Character> f6140gv = new a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final lb.a<Double> f6143v = new fb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lb.a<Float> f6137a = new s();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final lb.a<Integer> f6139fb = new c5();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final lb.a<Long> f6142s = new i9();

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final lb.a<Short> f6138c5 = new f();

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final lb.a<String> f6141i9 = new y();

    public class a extends lb.a<Character> {
        @Override // lb.a
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public void fb(w wVar, Character ch) throws IOException {
            wVar.yt(ch.toString());
        }

        @Override // lb.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public Character n3(lb.f fVar) throws IOException {
            String strMg = fVar.mg();
            if (strMg.length() <= 1) {
                return Character.valueOf(strMg.charAt(0));
            }
            throw new lb.s(String.format("Expected %s but was %s at path %s", "a char", '\"' + strMg + '\"', fVar.getPath()));
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    public class c5 extends lb.a<Integer> {
        @Override // lb.a
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public void fb(w wVar, Integer num) throws IOException {
            wVar.d(num.intValue());
        }

        @Override // lb.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public Integer n3(lb.f fVar) throws IOException {
            return Integer.valueOf(fVar.n());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    public class f extends lb.a<Short> {
        @Override // lb.a
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public void fb(w wVar, Short sh) throws IOException {
            wVar.d(sh.intValue());
        }

        @Override // lb.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public Short n3(lb.f fVar) throws IOException {
            return Short.valueOf((short) r.y(fVar, "a short", -32768, 32767));
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    public class fb extends lb.a<Double> {
        @Override // lb.a
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public void fb(w wVar, Double d4) throws IOException {
            wVar.ta(d4.doubleValue());
        }

        @Override // lb.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public Double n3(lb.f fVar) throws IOException {
            return Double.valueOf(fVar.f3());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    public class gv extends lb.a<Boolean> {
        @Override // lb.a
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public void fb(w wVar, Boolean bool) throws IOException {
            wVar.j(bool.booleanValue());
        }

        @Override // lb.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public Boolean n3(lb.f fVar) throws IOException {
            return Boolean.valueOf(fVar.r());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    public class i9 extends lb.a<Long> {
        @Override // lb.a
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public void fb(w wVar, Long l3) throws IOException {
            wVar.d(l3.longValue());
        }

        @Override // lb.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public Long n3(lb.f fVar) throws IOException {
            return Long.valueOf(fVar.c());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    public static /* synthetic */ class n3 {
        public static final /* synthetic */ int[] y;

        static {
            int[] iArr = new int[f.n3.values().length];
            y = iArr;
            try {
                iArr[f.n3.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                y[f.n3.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                y[f.n3.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                y[f.n3.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                y[f.n3.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                y[f.n3.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class s extends lb.a<Float> {
        @Override // lb.a
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public void fb(w wVar, Float f3) throws IOException {
            f3.getClass();
            wVar.ej(f3);
        }

        @Override // lb.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public Float n3(lb.f fVar) throws IOException {
            float fF3 = (float) fVar.f3();
            if (fVar.co() || !Float.isInfinite(fF3)) {
                return Float.valueOf(fF3);
            }
            throw new lb.s("JSON forbids NaN and infinities: " + fF3 + " at path " + fVar.getPath());
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    public static final class t<T extends Enum<T>> extends lb.a<T> {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final f.y f6144gv;
        public final String[] n3;
        public final Class<T> y;
        public final T[] zn;

        public t(Class<T> cls) {
            this.y = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.zn = enumConstants;
                this.n3 = new String[enumConstants.length];
                int i = 0;
                while (true) {
                    T[] tArr = this.zn;
                    if (i >= tArr.length) {
                        this.f6144gv = f.y.y(this.n3);
                        return;
                    } else {
                        String strName = tArr[i].name();
                        this.n3[i] = mb.n3.t(strName, cls.getField(strName));
                        i++;
                    }
                }
            } catch (NoSuchFieldException e4) {
                throw new AssertionError("Missing field in " + cls.getName(), e4);
            }
        }

        @Override // lb.a
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public void fb(w wVar, T t3) throws IOException {
            wVar.yt(this.n3[t3.ordinal()]);
        }

        @Override // lb.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public T n3(lb.f fVar) throws IOException {
            int iOz = fVar.oz(this.f6144gv);
            if (iOz != -1) {
                return this.zn[iOz];
            }
            String path = fVar.getPath();
            throw new lb.s("Expected one of " + Arrays.asList(this.n3) + " but was " + fVar.mg() + " at path " + path);
        }

        public String toString() {
            return "JsonAdapter(" + this.y.getName() + ")";
        }
    }

    public static final class tl extends lb.a<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final lb.a<Boolean> f6145a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final lb.a<String> f6146gv;
        public final lb.a<List> n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final lb.a<Double> f6147v;
        public final co y;
        public final lb.a<Map> zn;

        public tl(co coVar) {
            this.y = coVar;
            this.n3 = coVar.zn(List.class);
            this.zn = coVar.zn(Map.class);
            this.f6146gv = coVar.zn(String.class);
            this.f6147v = coVar.zn(Double.class);
            this.f6145a = coVar.zn(Boolean.class);
        }

        @Override // lb.a
        public void fb(w wVar, Object obj) throws IOException {
            Class<?> cls = obj.getClass();
            if (cls != Object.class) {
                this.y.v(s(cls), mb.n3.y).fb(wVar, obj);
            } else {
                wVar.a();
                wVar.p();
            }
        }

        @Override // lb.a
        public Object n3(lb.f fVar) throws IOException {
            switch (n3.y[fVar.d().ordinal()]) {
                case 1:
                    return this.n3.n3(fVar);
                case 2:
                    return this.zn.n3(fVar);
                case 3:
                    return this.f6146gv.n3(fVar);
                case 4:
                    return this.f6147v.n3(fVar);
                case 5:
                    return this.f6145a.n3(fVar);
                case 6:
                    return fVar.rz();
                default:
                    throw new IllegalStateException("Expected a value but was " + fVar.d() + " at path " + fVar.getPath());
            }
        }

        public final Class<?> s(Class<?> cls) {
            return Map.class.isAssignableFrom(cls) ? Map.class : Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    public class v extends lb.a<Byte> {
        @Override // lb.a
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public void fb(w wVar, Byte b4) throws IOException {
            wVar.d(b4.intValue() & 255);
        }

        @Override // lb.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public Byte n3(lb.f fVar) throws IOException {
            return Byte.valueOf((byte) r.y(fVar, "a byte", -128, 255));
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    public class y extends lb.a<String> {
        @Override // lb.a
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public void fb(w wVar, String str) throws IOException {
            wVar.yt(str);
        }

        @Override // lb.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public String n3(lb.f fVar) throws IOException {
            return fVar.mg();
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    public class zn implements a.y {
        @Override // lb.a.y
        public lb.a<?> y(Type type, Set<? extends Annotation> set, co coVar) throws NoSuchMethodException {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return r.n3;
            }
            if (type == Byte.TYPE) {
                return r.zn;
            }
            if (type == Character.TYPE) {
                return r.f6140gv;
            }
            if (type == Double.TYPE) {
                return r.f6143v;
            }
            if (type == Float.TYPE) {
                return r.f6137a;
            }
            if (type == Integer.TYPE) {
                return r.f6139fb;
            }
            if (type == Long.TYPE) {
                return r.f6142s;
            }
            if (type == Short.TYPE) {
                return r.f6138c5;
            }
            if (type == Boolean.class) {
                return r.n3.gv();
            }
            if (type == Byte.class) {
                return r.zn.gv();
            }
            if (type == Character.class) {
                return r.f6140gv.gv();
            }
            if (type == Double.class) {
                return r.f6143v.gv();
            }
            if (type == Float.class) {
                return r.f6137a.gv();
            }
            if (type == Integer.class) {
                return r.f6139fb.gv();
            }
            if (type == Long.class) {
                return r.f6142s.gv();
            }
            if (type == Short.class) {
                return r.f6138c5.gv();
            }
            if (type == String.class) {
                return r.f6141i9.gv();
            }
            if (type == Object.class) {
                return new tl(coVar).gv();
            }
            Class<?> clsFb = x4.fb(type);
            lb.a<?> aVarGv = mb.n3.gv(coVar, type, clsFb);
            if (aVarGv != null) {
                return aVarGv;
            }
            if (clsFb.isEnum()) {
                return new t(clsFb).gv();
            }
            return null;
        }
    }

    public static int y(lb.f fVar, String str, int i, int i5) throws IOException {
        int iN = fVar.n();
        if (iN < i || iN > i5) {
            throw new lb.s(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(iN), fVar.getPath()));
        }
        return iN;
    }
}
