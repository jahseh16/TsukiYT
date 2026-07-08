package c0;

import b0.c5;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c5 {
    public final List<b0.n3> y;

    public a(List<b0.n3> list) {
        this.y = list;
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
