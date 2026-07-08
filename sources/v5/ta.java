package v5;

/* JADX INFO: loaded from: classes.dex */
public final class ta extends Exception {
    public final int reason;

    public ta(int i) {
        this.reason = i;
    }

    public ta(int i, Exception exc) {
        super(exc);
        this.reason = i;
    }
}
