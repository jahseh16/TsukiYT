package lb;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class n3<T> {

    public class gv extends n3<T> {
        public final /* synthetic */ Class n3;
        public final /* synthetic */ Method y;

        public gv(Method method, Class cls) {
            this.y = method;
            this.n3 = cls;
        }

        @Override // lb.n3
        public T n3() throws IllegalAccessException, InvocationTargetException {
            return (T) this.y.invoke(null, this.n3, Object.class);
        }

        public String toString() {
            return this.n3.getName();
        }
    }

    /* JADX INFO: renamed from: lb.n3$n3, reason: collision with other inner class name */
    public class C0125n3 extends n3<T> {
        public final /* synthetic */ Object n3;
        public final /* synthetic */ Method y;
        public final /* synthetic */ Class zn;

        public C0125n3(Method method, Object obj, Class cls) {
            this.y = method;
            this.n3 = obj;
            this.zn = cls;
        }

        @Override // lb.n3
        public T n3() throws IllegalAccessException, InvocationTargetException {
            return (T) this.y.invoke(this.n3, this.zn);
        }

        public String toString() {
            return this.zn.getName();
        }
    }

    public class y extends n3<T> {
        public final /* synthetic */ Class n3;
        public final /* synthetic */ Constructor y;

        public y(Constructor constructor, Class cls) {
            this.y = constructor;
            this.n3 = cls;
        }

        @Override // lb.n3
        public T n3() throws IllegalAccessException, InstantiationException, InvocationTargetException {
            return (T) this.y.newInstance(null);
        }

        public String toString() {
            return this.n3.getName();
        }
    }

    public class zn extends n3<T> {
        public final /* synthetic */ Class n3;
        public final /* synthetic */ Method y;
        public final /* synthetic */ int zn;

        public zn(Method method, Class cls, int i) {
            this.y = method;
            this.n3 = cls;
            this.zn = i;
        }

        @Override // lb.n3
        public T n3() throws IllegalAccessException, InvocationTargetException {
            return (T) this.y.invoke(null, this.n3, Integer.valueOf(this.zn));
        }

        public String toString() {
            return this.n3.getName();
        }
    }

    public static <T> n3<T> y(Class<?> cls) {
        try {
            try {
                try {
                    try {
                        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        return new y(declaredConstructor, cls);
                    } catch (Exception unused) {
                        throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                    }
                } catch (NoSuchMethodException unused2) {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new C0125n3(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), cls);
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new zn(declaredMethod2, cls, iIntValue);
            } catch (IllegalAccessException unused4) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused5) {
            throw new AssertionError();
        } catch (NoSuchMethodException unused6) {
            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            return new gv(declaredMethod3, cls);
        } catch (InvocationTargetException e4) {
            throw mb.n3.co(e4);
        }
    }

    public abstract T n3() throws IllegalAccessException, InstantiationException, InvocationTargetException;
}
