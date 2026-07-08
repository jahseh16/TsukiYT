package ft;

import android.os.Bundle;
import ft.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class jr implements s {
    public static final String y = v0.ut.g3(0);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s.y<jr> f4892v = new s.y() { // from class: ft.r6
        @Override // ft.s.y
        public final s fromBundle(Bundle bundle) {
            return jr.n3(bundle);
        }
    };

    public static jr n3(Bundle bundle) {
        int i = bundle.getInt(y, -1);
        if (i == 0) {
            return (jr) tg.w.fromBundle(bundle);
        }
        if (i == 1) {
            return (jr) nd.f4943f.fromBundle(bundle);
        }
        if (i == 2) {
            return (jr) rv.w.fromBundle(bundle);
        }
        if (i == 3) {
            return (jr) vh.w.fromBundle(bundle);
        }
        throw new IllegalArgumentException("Unknown RatingType: " + i);
    }
}
