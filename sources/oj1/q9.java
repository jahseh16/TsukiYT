package oj1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class q9 {
    public static final byte[] n3;
    public static final String[] y;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + v(i >> 12) + v(i >> 8) + v(i >> 4) + v(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        y = strArr;
        byte[] bArr = new byte[93];
        for (int i5 = 0; i5 < 32; i5++) {
            bArr[i5] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        n3 = bArr;
    }

    public static final Boolean gv(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt.equals(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (StringsKt.equals(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final String[] n3() {
        return y;
    }

    public static final char v(int i) {
        int i5 = i & 15;
        return (char) (i5 < 10 ? i5 + 48 : i5 + 87);
    }

    public static final byte[] y() {
        return n3;
    }

    public static final void zn(StringBuilder sb, String value) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb.append('\"');
        int length = value.length();
        int i = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char cCharAt = value.charAt(i5);
            String[] strArr = y;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb.append((CharSequence) value, i, i5);
                sb.append(strArr[cCharAt]);
                i = i5 + 1;
            }
        }
        if (i != 0) {
            sb.append((CharSequence) value, i, value.length());
        } else {
            sb.append(value);
        }
        sb.append('\"');
    }
}
