package pl1;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class r extends RuntimeException {
    private final int code;
    private final String message;
    public final transient b<?> y;

    public r(b<?> bVar) {
        super(y(bVar));
        this.code = bVar.n3();
        this.message = bVar.v();
        this.y = bVar;
    }

    public static String y(b<?> bVar) {
        Objects.requireNonNull(bVar, "response == null");
        return "HTTP " + bVar.n3() + " " + bVar.v();
    }
}
