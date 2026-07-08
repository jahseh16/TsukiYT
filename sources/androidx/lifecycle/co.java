package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.n3;
import androidx.lifecycle.s;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class co implements t {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final n3.y f827v;
    public final Object y;

    public co(Object obj) {
        this.y = obj;
        this.f827v = n3.zn.zn(obj.getClass());
    }

    @Override // androidx.lifecycle.t
    public void onStateChanged(@NonNull ap.mt mtVar, @NonNull s.y yVar) {
        this.f827v.y(mtVar, yVar, this.y);
    }
}
