package m0;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements b0.c5 {
    public final List<b0.n3> y;

    public n3(List<b0.n3> list) {
        this.y = Collections.unmodifiableList(list);
    }

    @Override // b0.c5
    public int gv() {
        return 1;
    }

    @Override // b0.c5
    public List<b0.n3> n3(long j) {
        return j >= 0 ? this.y : Collections.emptyList();
    }

    @Override // b0.c5
    public int y(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // b0.c5
    public long zn(int i) {
        v0.y.y(i == 0);
        return 0L;
    }
}
