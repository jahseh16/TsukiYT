package pl1;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b<T> {
    public final T n3;
    public final sj1.rz y;
    public final sj1.mg zn;

    public b(sj1.rz rzVar, T t3, sj1.mg mgVar) {
        this.y = rzVar;
        this.n3 = t3;
        this.zn = mgVar;
    }

    public static <T> b<T> a(T t3, sj1.rz rzVar) {
        Objects.requireNonNull(rzVar, "rawResponse == null");
        if (rzVar.isSuccessful()) {
            return new b<>(rzVar, t3, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public static <T> b<T> zn(sj1.mg mgVar, sj1.rz rzVar) {
        Objects.requireNonNull(mgVar, "body == null");
        Objects.requireNonNull(rzVar, "rawResponse == null");
        if (rzVar.isSuccessful()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new b<>(rzVar, null, mgVar);
    }

    public boolean gv() {
        return this.y.isSuccessful();
    }

    public int n3() {
        return this.y.p();
    }

    public String toString() {
        return this.y.toString();
    }

    public String v() {
        return this.y.ta();
    }

    public T y() {
        return this.n3;
    }
}
