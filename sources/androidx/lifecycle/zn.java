package androidx.lifecycle;

import androidx.lifecycle.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements t {
    public final v[] y;

    public zn(v[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.y = generatedAdapters;
    }

    @Override // androidx.lifecycle.t
    public void onStateChanged(ap.mt source, s.y event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        ap.c cVar = new ap.c();
        for (v vVar : this.y) {
            vVar.y(source, event, false, cVar);
        }
        for (v vVar2 : this.y) {
            vVar2.y(source, event, true, cVar);
        }
    }
}
