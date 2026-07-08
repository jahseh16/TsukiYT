package g4;

/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public static String a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (zn(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (zn(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean gv(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static int n3(char c) {
        return (char) ((c | ' ') - 97);
    }

    public static String v(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (gv(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (gv(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean y(CharSequence charSequence, CharSequence charSequence2) {
        int iN3;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            char cCharAt2 = charSequence2.charAt(i);
            if (cCharAt != cCharAt2 && ((iN3 = n3(cCharAt)) >= 26 || iN3 != n3(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean zn(char c) {
        return c >= 'a' && c <= 'z';
    }
}
