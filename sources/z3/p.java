package z3;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Runnable {
    public final /* synthetic */ y y;

    public p(y yVar) {
        this.y = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.y.y.f();
        } catch (Exception e4) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e4);
        }
    }
}
