package androidx.lifecycle;

import androidx.lifecycle.s;
import ap.z6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x4 implements t {
    public final z6 y;

    public x4(z6 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.y = provider;
    }

    @Override // androidx.lifecycle.t
    public void onStateChanged(ap.mt source, s.y event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == s.y.ON_CREATE) {
            source.getLifecycle().gv(this);
            this.y.gv();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
