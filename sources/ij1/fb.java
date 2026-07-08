package ij1;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes.dex */
public final class fb {
    public static final <T> f<T> n3(mj1.n3<T> n3Var, lj1.a encoder, T value) {
        Intrinsics.checkNotNullParameter(n3Var, "<this>");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        f<T> fVarGv = n3Var.gv(encoder, value);
        if (fVarGv != null) {
            return fVarGv;
        }
        mj1.zn.n3(Reflection.getOrCreateKotlinClass(value.getClass()), n3Var.v());
        throw new KotlinNothingValueException();
    }

    public static final <T> n3<? extends T> y(mj1.n3<T> n3Var, lj1.zn decoder, String str) {
        Intrinsics.checkNotNullParameter(n3Var, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        n3<? extends T> n3VarZn = n3Var.zn(decoder, str);
        if (n3VarZn != null) {
            return n3VarZn;
        }
        mj1.zn.y(str, n3Var.v());
        throw new KotlinNothingValueException();
    }
}
