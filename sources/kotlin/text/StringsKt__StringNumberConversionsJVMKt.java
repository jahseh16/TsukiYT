package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class StringsKt__StringNumberConversionsJVMKt extends StringsKt__StringBuilderKt {
    public static Double toDoubleOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (ScreenFloatValueRegEx.value.matches(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Float toFloatOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (ScreenFloatValueRegEx.value.matches(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
