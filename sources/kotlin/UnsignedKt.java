package kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes.dex */
public final class UnsignedKt {
    public static final int uintCompare(int i, int i5) {
        return Intrinsics.compare(i ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
    }

    public static final int ulongCompare(long j, long j4) {
        return Intrinsics.compare(j ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE);
    }

    public static final String ulongToString(long j, int i) {
        if (j >= 0) {
            String string = Long.toString(j, CharsKt.checkRadix(i));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long j4 = i;
        long j7 = ((j >>> 1) / j4) << 1;
        long j8 = j - (j7 * j4);
        if (j8 >= j4) {
            j8 -= j4;
            j7++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j7, CharsKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb.append(string2);
        String string3 = Long.toString(j8, CharsKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        sb.append(string3);
        return sb.toString();
    }
}
