package h6;

import androidx.annotation.Nullable;
import ft.g;
import r0.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class wz extends a {

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final long f5335i9;

    public wz(r0.tl tlVar, p pVar, g gVar, int i, @Nullable Object obj, long j, long j4, long j7) {
        super(tlVar, pVar, 1, gVar, i, obj, j, j4);
        v0.y.v(gVar);
        this.f5335i9 = j7;
    }

    public abstract boolean a();

    public long v() {
        long j = this.f5335i9;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }
}
