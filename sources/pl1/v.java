package pl1;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public interface v<R, T> {

    public static abstract class y {
        public static Type n3(int i, ParameterizedType parameterizedType) {
            return j5.fb(i, parameterizedType);
        }

        public static Class<?> zn(Type type) {
            return j5.s(type);
        }

        public abstract v<?, ?> y(Type type, Annotation[] annotationArr, k5 k5Var);
    }

    T n3(gv<R> gvVar);

    Type y();
}
