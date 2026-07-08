package v3;

import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mt implements Runnable {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final /* synthetic */ co f8794fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a4.ej f8795v;
    public final /* synthetic */ List y;

    public mt(co coVar, List list, a4.ej ejVar) {
        this.f8794fb = coVar;
        this.y = list;
        this.f8795v = ejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f8794fb.zn.n3(this.y)) {
                co.gv(this.f8794fb, this.f8795v);
            } else {
                co.zn(this.f8794fb, this.y, this.f8795v);
            }
        } catch (Exception e4) {
            Log.e("SplitCompat", "Error checking verified files.", e4);
            this.f8795v.zzb(-11);
        }
    }
}
