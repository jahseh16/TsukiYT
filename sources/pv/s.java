package pv;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final String f7394gv;
    public final long[] n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f7395v;
    public final EventMessage[] y;
    public final String zn;

    public s(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        this.zn = str;
        this.f7394gv = str2;
        this.f7395v = j;
        this.n3 = jArr;
        this.y = eventMessageArr;
    }

    public String y() {
        return this.zn + "/" + this.f7394gv;
    }
}
