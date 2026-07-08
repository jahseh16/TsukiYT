package androidx.lifecycle;

import androidx.lifecycle.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i4 implements t {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f834fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final r f835v;
    public final String y;

    public i4(String key, r handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.y = key;
        this.f835v = handle;
    }

    public final r n3() {
        return this.f835v;
    }

    @Override // androidx.lifecycle.t
    public void onStateChanged(ap.mt source, s.y event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == s.y.ON_DESTROY) {
            this.f834fb = false;
            source.getLifecycle().gv(this);
        }
    }

    public final void y(qk.zn registry, s lifecycle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f834fb) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f834fb = true;
        lifecycle.y(this);
        registry.s(this.y, this.f835v.c5());
    }

    public final boolean zn() {
        return this.f834fb;
    }
}
