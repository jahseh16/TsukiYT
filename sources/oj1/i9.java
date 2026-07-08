package oj1;

/* JADX INFO: loaded from: classes.dex */
public final class i9 {
    public static final char[] n3;
    public static final i9 y;
    public static final byte[] zn;

    static {
        i9 i9Var = new i9();
        y = i9Var;
        n3 = new char[117];
        zn = new byte[126];
        i9Var.a();
        i9Var.v();
    }

    public final void a() {
        for (int i = 0; i < 32; i++) {
            n3(i, 'u');
        }
        n3(8, 'b');
        n3(9, 't');
        n3(10, 'n');
        n3(12, 'f');
        n3(13, 'r');
        y('/', '/');
        y('\"', '\"');
        y('\\', '\\');
    }

    public final void gv(int i, byte b4) {
        zn[i] = b4;
    }

    public final void n3(int i, char c) {
        if (c != 'u') {
            n3[c] = (char) i;
        }
    }

    public final void v() {
        for (int i = 0; i < 33; i++) {
            gv(i, (byte) 127);
        }
        gv(9, (byte) 3);
        gv(10, (byte) 3);
        gv(13, (byte) 3);
        gv(32, (byte) 3);
        zn(',', (byte) 4);
        zn(':', (byte) 5);
        zn('{', (byte) 6);
        zn('}', (byte) 7);
        zn('[', (byte) 8);
        zn(']', (byte) 9);
        zn('\"', (byte) 1);
        zn('\\', (byte) 2);
    }

    public final void y(char c, char c3) {
        n3(c, c3);
    }

    public final void zn(char c, byte b4) {
        gv(c, b4);
    }
}
