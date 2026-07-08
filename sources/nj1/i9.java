package nj1;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import oj1.q9;

/* JADX INFO: loaded from: classes.dex */
public final class i9 {
    public static final String a(f3 f3Var) {
        Intrinsics.checkNotNullParameter(f3Var, "<this>");
        if (f3Var instanceof co) {
            return null;
        }
        return f3Var.y();
    }

    public static final float c5(f3 f3Var) {
        Intrinsics.checkNotNullParameter(f3Var, "<this>");
        return Float.parseFloat(f3Var.y());
    }

    public static final r f(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        r rVar = sVar instanceof r ? (r) sVar : null;
        if (rVar != null) {
            return rVar;
        }
        gv(sVar, "JsonObject");
        throw new KotlinNothingValueException();
    }

    public static final double fb(f3 f3Var) {
        Intrinsics.checkNotNullParameter(f3Var, "<this>");
        return Double.parseDouble(f3Var.y());
    }

    public static final Void gv(s sVar, String str) {
        throw new IllegalArgumentException("Element " + Reflection.getOrCreateKotlinClass(sVar.getClass()) + " is not a " + str);
    }

    public static final int i9(f3 f3Var) {
        Intrinsics.checkNotNullParameter(f3Var, "<this>");
        return Integer.parseInt(f3Var.y());
    }

    public static final f3 n3(Number number) {
        return number == null ? co.f6955fb : new w(number, false);
    }

    public static final Double s(f3 f3Var) {
        Intrinsics.checkNotNullParameter(f3Var, "<this>");
        return StringsKt.toDoubleOrNull(f3Var.y());
    }

    public static final f3 t(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        f3 f3Var = sVar instanceof f3 ? (f3) sVar : null;
        if (f3Var != null) {
            return f3Var;
        }
        gv(sVar, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    public static final long tl(f3 f3Var) {
        Intrinsics.checkNotNullParameter(f3Var, "<this>");
        return Long.parseLong(f3Var.y());
    }

    public static final Boolean v(f3 f3Var) {
        Intrinsics.checkNotNullParameter(f3Var, "<this>");
        return q9.gv(f3Var.y());
    }

    public static final Long wz(f3 f3Var) {
        Intrinsics.checkNotNullParameter(f3Var, "<this>");
        return StringsKt.toLongOrNull(f3Var.y());
    }

    public static final f3 y(Boolean bool) {
        return bool == null ? co.f6955fb : new w(bool, false);
    }

    public static final f3 zn(String str) {
        return str == null ? co.f6955fb : new w(str, true);
    }
}
