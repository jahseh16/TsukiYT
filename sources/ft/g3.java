package ft;

/* JADX INFO: loaded from: classes.dex */
public final class g3 extends RuntimeException {
    public final int timeoutOperation;

    public g3(int i) {
        super(y(i));
        this.timeoutOperation = i;
    }

    public static String y(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
