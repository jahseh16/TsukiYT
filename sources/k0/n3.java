package k0;

import b0.c5;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements c5 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final n3 f5978v = new n3();
    public final List<b0.n3> y;

    public n3(b0.n3 n3Var) {
        this.y = Collections.singletonList(n3Var);
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

    public n3() {
        this.y = Collections.emptyList();
    }
}
