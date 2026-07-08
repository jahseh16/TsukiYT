package br;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import bv.f;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class n3 implements br.y {
    public final f y;
    public final Handler n3 = new Handler(Looper.getMainLooper());
    public final Executor zn = new y();

    public class y implements Executor {
        public y() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            n3.this.zn(runnable);
        }
    }

    public n3(@NonNull Executor executor) {
        this.y = new f(executor);
    }

    @Override // br.y
    @NonNull
    public f getBackgroundExecutor() {
        return this.y;
    }

    @Override // br.y
    public void n3(Runnable runnable) {
        this.y.execute(runnable);
    }

    @Override // br.y
    public Executor y() {
        return this.zn;
    }

    public void zn(Runnable runnable) {
        this.n3.post(runnable);
    }
}
