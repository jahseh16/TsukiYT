package kotlin.text;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class CharsKt__CharKt extends CharsKt__CharJVMKt {
    public static int digitToInt(char c) {
        int iDigitOf = CharsKt__CharJVMKt.digitOf(c, 10);
        if (iDigitOf >= 0) {
            return iDigitOf;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    public static final boolean equals(char c, char c3, boolean z) {
        if (c == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static String titlecase(char c) {
        return _OneToManyTitlecaseMappingsKt.titlecaseImpl(c);
    }
}
