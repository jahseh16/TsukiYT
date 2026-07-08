package v0;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class j5 {
    public static void gv() {
        Trace.endSection();
    }

    public static void n3(String str) {
        Trace.beginSection(str);
    }

    public static void y(String str) {
        if (ut.y >= 18) {
            n3(str);
        }
    }

    public static void zn() {
        if (ut.y >= 18) {
            gv();
        }
    }
}
