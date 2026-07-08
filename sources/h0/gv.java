package h0;

import b0.c5;
import java.util.Collections;
import java.util.List;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class gv implements c5 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<Long> f5247v;
    public final List<List<b0.n3>> y;

    public gv(List<List<b0.n3>> list, List<Long> list2) {
        this.y = list;
        this.f5247v = list2;
    }

    @Override // b0.c5
    public int gv() {
        return this.f5247v.size();
    }

    @Override // b0.c5
    public List<b0.n3> n3(long j) {
        int iA = ut.a(this.f5247v, Long.valueOf(j), true, false);
        return iA == -1 ? Collections.emptyList() : this.y.get(iA);
    }

    @Override // b0.c5
    public int y(long j) {
        int iGv = ut.gv(this.f5247v, Long.valueOf(j), false, false);
        if (iGv < this.f5247v.size()) {
            return iGv;
        }
        return -1;
    }

    @Override // b0.c5
    public long zn(int i) {
        v0.y.y(i >= 0);
        v0.y.y(i < this.f5247v.size());
        return this.f5247v.get(i).longValue();
    }
}
