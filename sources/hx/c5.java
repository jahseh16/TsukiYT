package hx;

import android.net.Uri;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class c5 {
    public static r0.p y(int i) {
        return new r0.p(Uri.parse(ut.rz("%s:%d", "rtp://0.0.0.0", Integer.valueOf(i))));
    }
}
