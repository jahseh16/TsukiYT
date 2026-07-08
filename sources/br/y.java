package br;

import bv.f;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface y {
    f getBackgroundExecutor();

    void n3(Runnable runnable);

    Executor y();
}
