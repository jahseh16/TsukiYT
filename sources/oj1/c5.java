package oj1;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class c5 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final int f7141gv;
    public static int zn;
    public static final c5 y = new c5();
    public static final ArrayDeque<char[]> n3 = new ArrayDeque<>();

    static {
        Object objM31constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            objM31constructorimpl = Result.m31constructorimpl(StringsKt.toIntOrNull(property));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m36isFailureimpl(objM31constructorimpl)) {
            objM31constructorimpl = null;
        }
        Integer num = (Integer) objM31constructorimpl;
        f7141gv = num != null ? num.intValue() : 1048576;
    }

    public final char[] n3() {
        char[] cArrRemoveLastOrNull;
        synchronized (this) {
            cArrRemoveLastOrNull = n3.removeLastOrNull();
            if (cArrRemoveLastOrNull != null) {
                zn -= cArrRemoveLastOrNull.length;
            } else {
                cArrRemoveLastOrNull = null;
            }
        }
        return cArrRemoveLastOrNull == null ? new char[128] : cArrRemoveLastOrNull;
    }

    public final void y(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            try {
                int i = zn;
                if (array.length + i < f7141gv) {
                    zn = i + array.length;
                    n3.addLast(array);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
