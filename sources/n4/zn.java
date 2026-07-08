package n4;

import g4.xc;

/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public static boolean n3(char[] cArr, char c) {
        for (char c3 : cArr) {
            if (c3 == c) {
                return true;
            }
        }
        return false;
    }

    public static char y(long j) {
        char c = (char) j;
        xc.c5(((long) c) == j, "Out of range: %s", j);
        return c;
    }

    public static char zn(byte b4, byte b6) {
        return (char) ((b4 << 8) | (b6 & 255));
    }
}
