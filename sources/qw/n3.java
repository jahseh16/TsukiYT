package qw;

import kotlin.Lazy;
import kotlin.LazyKt;
import mw.y;

/* JADX INFO: loaded from: classes.dex */
public final class n3 extends zn {
    public static final n3 y = new n3();
    public static final Lazy n3 = LazyKt.lazy(new y());

    public n3() {
        super(null);
    }

    public static final y v() {
        return new y();
    }

    @Override // qw.zn
    public rw.n3 zn() {
        return (rw.n3) n3.getValue();
    }
}
