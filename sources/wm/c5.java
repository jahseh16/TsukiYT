package wm;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class c5 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static c5 f9030v;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public s f9031gv;
    public n3 n3;
    public y y;
    public fb zn;

    public c5(@NonNull Context context, @NonNull br.y yVar) {
        Context applicationContext = context.getApplicationContext();
        this.y = new y(applicationContext, yVar);
        this.n3 = new n3(applicationContext, yVar);
        this.zn = new fb(applicationContext, yVar);
        this.f9031gv = new s(applicationContext, yVar);
    }

    @NonNull
    public static synchronized c5 zn(Context context, br.y yVar) {
        try {
            if (f9030v == null) {
                f9030v = new c5(context, yVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f9030v;
    }

    @NonNull
    public fb gv() {
        return this.zn;
    }

    @NonNull
    public n3 n3() {
        return this.n3;
    }

    @NonNull
    public s v() {
        return this.f9031gv;
    }

    @NonNull
    public y y() {
        return this.y;
    }
}
