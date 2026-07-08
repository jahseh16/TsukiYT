package mj1;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public static final Void n3(KClass<?> subClass, KClass<?> baseClass) {
        Intrinsics.checkNotNullParameter(subClass, "subClass");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String simpleName = subClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(subClass);
        }
        y(simpleName, baseClass);
        throw new KotlinNothingValueException();
    }

    public static final Void y(String str, KClass<?> baseClass) {
        String str2;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String str3 = "in the scope of '" + baseClass.getSimpleName() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default polymorphic serializers were registered " + str3;
        } else {
            str2 = "Class '" + str + "' is not registered for polymorphic serialization " + str3 + ".\nMark the base class as 'sealed' or register the serializer explicitly.";
        }
        throw new ij1.i9(str2);
    }
}
