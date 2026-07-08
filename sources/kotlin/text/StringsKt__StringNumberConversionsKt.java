package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class StringsKt__StringNumberConversionsKt extends StringsKt__StringNumberConversionsJVMKt {
    public static final Void numberFormatError(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    public static Integer toIntOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toIntOrNull(str, 10);
    }

    public static Long toLongOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toLongOrNull(str, 10);
    }

    public static final Integer toIntOrNull(String str, int i) {
        boolean z;
        int i5;
        int i8;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        int i11 = -2147483647;
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i5 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i11 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i5 = 0;
        }
        int i12 = -59652323;
        while (i5 < length) {
            int iDigitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i5), i);
            if (iDigitOf < 0) {
                return null;
            }
            if ((i10 < i12 && (i12 != -59652323 || i10 < (i12 = i11 / i))) || (i8 = i10 * i) < i11 + iDigitOf) {
                return null;
            }
            i10 = i8 - iDigitOf;
            i5++;
        }
        return z ? Integer.valueOf(i10) : Integer.valueOf(-i10);
    }

    public static final Long toLongOrNull(String str, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                i5 = 1;
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i5 = 1;
            }
        } else {
            z = false;
        }
        long j4 = -256204778801521550L;
        long j7 = 0;
        long j8 = -256204778801521550L;
        while (i5 < length) {
            int iDigitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i5), i);
            if (iDigitOf < 0) {
                return null;
            }
            if (j7 < j8) {
                if (j8 == j4) {
                    j8 = j / ((long) i);
                    if (j7 < j8) {
                    }
                }
                return null;
            }
            long j9 = j7 * ((long) i);
            long j10 = iDigitOf;
            if (j9 < j + j10) {
                return null;
            }
            j7 = j9 - j10;
            i5++;
            j4 = -256204778801521550L;
        }
        return z ? Long.valueOf(j7) : Long.valueOf(-j7);
    }
}
