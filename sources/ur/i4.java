package ur;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class i4 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicLong f8558s = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8559a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final long f8560fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Map<String, List<String>> f8561gv;
    public final r0.p n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f8562v;
    public final long y;
    public final Uri zn;

    public i4(long j, r0.p pVar, long j4) {
        this(j, pVar, pVar.y, Collections.emptyMap(), j4, 0L, 0L);
    }

    public static long y() {
        return f8558s.getAndIncrement();
    }

    public i4(long j, r0.p pVar, Uri uri, Map<String, List<String>> map, long j4, long j7, long j8) {
        this.y = j;
        this.n3 = pVar;
        this.zn = uri;
        this.f8561gv = map;
        this.f8562v = j4;
        this.f8559a = j7;
        this.f8560fb = j8;
    }
}
