package ft;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class rb {
    public static final HashSet<String> y = new HashSet<>();
    public static String n3 = "goog.exo.core";

    public static synchronized String n3() {
        return n3;
    }

    public static synchronized void y(String str) {
        if (y.add(str)) {
            n3 += ", " + str;
        }
    }
}
