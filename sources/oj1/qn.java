package oj1;

import java.util.List;
import kj1.f;
import kj1.i9;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import pj1.v;

/* JADX INFO: loaded from: classes.dex */
public final class qn implements pj1.v {
    public final String n3;
    public final boolean y;

    public qn(boolean z, String discriminator) {
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        this.y = z;
        this.n3 = discriminator;
    }

    public final void a(kj1.a aVar, KClass<?> kClass) {
        int iGv = aVar.gv();
        for (int i = 0; i < iGv; i++) {
            String strV = aVar.v(i);
            if (Intrinsics.areEqual(strV, this.n3)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + kClass + " has property '" + strV + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    public final void fb(kj1.a aVar, KClass<?> kClass) {
        kj1.i9 kind = aVar.getKind();
        if ((kind instanceof kj1.gv) || Intrinsics.areEqual(kind, i9.y.y)) {
            throw new IllegalArgumentException("Serializer for " + kClass.getSimpleName() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (this.y) {
            return;
        }
        if (Intrinsics.areEqual(kind, f.n3.y) || Intrinsics.areEqual(kind, f.zn.y) || (kind instanceof kj1.v) || (kind instanceof i9.n3)) {
            throw new IllegalArgumentException("Serializer for " + kClass.getSimpleName() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
        }
    }

    @Override // pj1.v
    public <Base> void gv(KClass<Base> baseClass, Function1<? super Base, ? extends ij1.f<? super Base>> defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // pj1.v
    public <T> void n3(KClass<T> kClass, ij1.zn<T> znVar) {
        v.y.y(this, kClass, znVar);
    }

    @Override // pj1.v
    public <T> void v(KClass<T> kClass, Function1<? super List<? extends ij1.zn<?>>, ? extends ij1.zn<?>> provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @Override // pj1.v
    public <Base> void y(KClass<Base> baseClass, Function1<? super String, ? extends ij1.n3<? extends Base>> defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // pj1.v
    public <Base, Sub extends Base> void zn(KClass<Base> baseClass, KClass<Sub> actualClass, ij1.zn<Sub> actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        kj1.a descriptor = actualSerializer.getDescriptor();
        fb(descriptor, actualClass);
        if (this.y) {
            return;
        }
        a(descriptor, actualClass);
    }
}
