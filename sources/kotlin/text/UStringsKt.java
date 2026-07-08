package kotlin.text;

import dj1.v;
import kotlin.KotlinNothingValueException;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UStringsKt {
    public static final byte toUByte(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UByte uByteOrNull = toUByteOrNull(str);
        if (uByteOrNull != null) {
            return uByteOrNull.m45unboximpl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    public static final UByte toUByteOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUByteOrNull(str, 10);
    }

    public static final int toUInt(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str);
        if (uIntOrNull != null) {
            return uIntOrNull.m67unboximpl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    public static final UInt toUIntOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUIntOrNull(str, 10);
    }

    public static final long toULong(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ULong uLongOrNull = toULongOrNull(str);
        if (uLongOrNull != null) {
            return uLongOrNull.m89unboximpl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    public static final ULong toULongOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toULongOrNull(str, 10);
    }

    public static final short toUShort(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UShort uShortOrNull = toUShortOrNull(str);
        if (uShortOrNull != null) {
            return uShortOrNull.m111unboximpl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    public static final UShort toUShortOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUShortOrNull(str, 10);
    }

    public static final UByte toUByteOrNull(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull == null) {
            return null;
        }
        int iM67unboximpl = uIntOrNull.m67unboximpl();
        if (Integer.compare(iM67unboximpl ^ Integer.MIN_VALUE, UInt.m63constructorimpl(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return UByte.m40boximpl(UByte.m41constructorimpl((byte) iM67unboximpl));
    }

    public static final UInt toUIntOrNull(String str, int i) {
        int i5;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i8 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i5 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i5 = 0;
        }
        int iM63constructorimpl = UInt.m63constructorimpl(i);
        int iY = 119304647;
        while (i5 < length) {
            int iDigitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i5), i);
            if (iDigitOf < 0) {
                return null;
            }
            if (Integer.compare(i8 ^ Integer.MIN_VALUE, iY ^ Integer.MIN_VALUE) > 0) {
                if (iY == 119304647) {
                    iY = v.y(-1, iM63constructorimpl);
                    if (Integer.compare(i8 ^ Integer.MIN_VALUE, iY ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iM63constructorimpl2 = UInt.m63constructorimpl(i8 * iM63constructorimpl);
            int iM63constructorimpl3 = UInt.m63constructorimpl(UInt.m63constructorimpl(iDigitOf) + iM63constructorimpl2);
            if (Integer.compare(iM63constructorimpl3 ^ Integer.MIN_VALUE, iM63constructorimpl2 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i5++;
            i8 = iM63constructorimpl3;
        }
        return UInt.m62boximpl(i8);
    }

    public static final ULong toULongOrNull(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i5 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jM85constructorimpl = ULong.m85constructorimpl(i);
        long j = 0;
        long jY = 512409557603043100L;
        while (i5 < length) {
            int iDigitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i5), i);
            if (iDigitOf < 0) {
                return null;
            }
            if (Long.compare(j ^ Long.MIN_VALUE, jY ^ Long.MIN_VALUE) > 0) {
                if (jY == 512409557603043100L) {
                    jY = dj1.zn.y(-1L, jM85constructorimpl);
                    if (Long.compare(j ^ Long.MIN_VALUE, jY ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jM85constructorimpl2 = ULong.m85constructorimpl(j * jM85constructorimpl);
            long jM85constructorimpl3 = ULong.m85constructorimpl(ULong.m85constructorimpl(((long) UInt.m63constructorimpl(iDigitOf)) & 4294967295L) + jM85constructorimpl2);
            if (Long.compare(jM85constructorimpl3 ^ Long.MIN_VALUE, jM85constructorimpl2 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i5++;
            j = jM85constructorimpl3;
        }
        return ULong.m84boximpl(j);
    }

    public static final UShort toUShortOrNull(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull == null) {
            return null;
        }
        int iM67unboximpl = uIntOrNull.m67unboximpl();
        if (Integer.compare(iM67unboximpl ^ Integer.MIN_VALUE, UInt.m63constructorimpl(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return UShort.m106boximpl(UShort.m107constructorimpl((short) iM67unboximpl));
    }
}
