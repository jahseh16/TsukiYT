package v3;

/* JADX INFO: loaded from: classes.dex */
public final class qn extends RuntimeException {
    public qn(String str) {
        super(str);
    }

    public qn(String str, Throwable th) {
        super("Failed to initialize FileStorage", th);
    }
}
