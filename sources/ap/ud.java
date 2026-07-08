package ap;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ud {
    public static final List<Class<?>> y = CollectionsKt.listOf((Object[]) new Class[]{Application.class, androidx.lifecycle.r.class});
    public static final List<Class<?>> n3 = CollectionsKt.listOf(androidx.lifecycle.r.class);

    public static final <T extends b> T gv(Class<T> modelClass, Constructor<T> constructor, Object... params) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Failed to access " + modelClass, e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e6.getCause());
        }
    }

    public static final <T> Constructor<T> zn(Class<T> modelClass, List<? extends Class<?>> signature) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Object[] constructors = modelClass.getConstructors();
        Intrinsics.checkNotNullExpressionValue(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "constructor.parameterTypes");
            List list = ArraysKt.toList(parameterTypes);
            if (Intrinsics.areEqual(signature, list)) {
                Intrinsics.checkNotNull(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == list.size() && list.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }
}
