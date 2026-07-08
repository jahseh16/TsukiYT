package oj1;

import java.lang.annotation.Annotation;
import kj1.i9;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes.dex */
public final class j5 {
    public static final <T> T gv(nj1.fb fbVar, ij1.n3<T> deserializer) {
        nj1.f3 f3VarT;
        Intrinsics.checkNotNullParameter(fbVar, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!(deserializer instanceof mj1.n3) || fbVar.gv().v().f()) {
            return deserializer.deserialize(fbVar);
        }
        String strZn = zn(deserializer.getDescriptor(), fbVar.gv());
        nj1.s sVarFb = fbVar.fb();
        kj1.a descriptor = deserializer.getDescriptor();
        if (sVarFb instanceof nj1.r) {
            nj1.r rVar = (nj1.r) sVarFb;
            nj1.s sVar = (nj1.s) rVar.get(strZn);
            String strY = (sVar == null || (f3VarT = nj1.i9.t(sVar)) == null) ? null : f3VarT.y();
            ij1.n3<? extends T> n3VarZn = ((mj1.n3) deserializer).zn(fbVar, strY);
            if (n3VarZn != null) {
                return (T) k.n3(fbVar.gv(), strZn, rVar, n3VarZn);
            }
            v(strY, rVar);
            throw new KotlinNothingValueException();
        }
        throw fh.v(-1, "Expected " + Reflection.getOrCreateKotlinClass(nj1.r.class) + " as the serialized body of " + descriptor.s() + ", but had " + Reflection.getOrCreateKotlinClass(sVarFb.getClass()));
    }

    public static final void n3(kj1.i9 kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind instanceof i9.n3) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof kj1.v) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof kj1.gv) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final Void v(String str, nj1.r jsonTree) {
        String str2;
        Intrinsics.checkNotNullParameter(jsonTree, "jsonTree");
        if (str == null) {
            str2 = "missing class discriminator ('null')";
        } else {
            str2 = "class discriminator '" + str + '\'';
        }
        throw fh.a(-1, "Polymorphic serializer was not found for " + str2, jsonTree.toString());
    }

    public static final String zn(kj1.a aVar, nj1.y json) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        for (Annotation annotation : aVar.getAnnotations()) {
            if (annotation instanceof nj1.v) {
                return ((nj1.v) annotation).discriminator();
            }
        }
        return json.v().zn();
    }

    public static final void a(ij1.f<?> fVar, ij1.f<Object> fVar2, String str) {
    }
}
