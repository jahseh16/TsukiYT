package sj1;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface v extends Cloneable {

    public interface y {
        v n3(d0 d0Var);
    }

    void cancel();

    rz execute() throws IOException;

    boolean isCanceled();

    void r(a aVar);

    d0 y();
}
