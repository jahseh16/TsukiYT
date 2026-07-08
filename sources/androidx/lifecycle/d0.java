package androidx.lifecycle;

import androidx.lifecycle.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements t {
    public final v y;

    public d0(v generatedAdapter) {
        Intrinsics.checkNotNullParameter(generatedAdapter, "generatedAdapter");
        this.y = generatedAdapter;
    }

    @Override // androidx.lifecycle.t
    public void onStateChanged(ap.mt source, s.y event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        this.y.y(source, event, false, null);
        this.y.y(source, event, true, null);
    }
}
