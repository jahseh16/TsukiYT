package pl1;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface gv<T> extends Cloneable {
    void a(a<T> aVar);

    void cancel();

    /* JADX INFO: renamed from: clone */
    gv<T> mo216clone();

    b<T> execute() throws IOException;

    boolean isCanceled();

    sj1.d0 y();
}
