package z3;

import android.util.Log;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mt implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ y f9435v;
    public final /* synthetic */ Set y;

    public mt(y yVar, Set set) {
        this.f9435v = yVar;
        this.y = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f9435v.c5(this.y);
        } catch (Exception e4) {
            Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e4);
        }
    }
}
