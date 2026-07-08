package oj1;

/* JADX INFO: loaded from: classes.dex */
public enum en {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');

    public final char begin;
    public final char end;

    en(char c, char c3) {
        this.begin = c;
        this.end = c3;
    }
}
