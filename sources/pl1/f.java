package pl1;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public interface f<F, T> {

    public static abstract class y {
        public static Class<?> n3(Type type) {
            return j5.s(type);
        }

        public static Type y(int i, ParameterizedType parameterizedType) {
            return j5.fb(i, parameterizedType);
        }

        public f<sj1.mg, ?> gv(Type type, Annotation[] annotationArr, k5 k5Var) {
            return null;
        }

        public f<?, String> v(Type type, Annotation[] annotationArr, k5 k5Var) {
            return null;
        }

        public f<?, sj1.fh> zn(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, k5 k5Var) {
            return null;
        }
    }

    T convert(F f3) throws IOException;
}
