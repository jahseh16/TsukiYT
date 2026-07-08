package qk;

import android.os.Bundle;
import androidx.lifecycle.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gv {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final y f7473gv = new y(null);
    public final zn n3;
    public final v y;
    public boolean zn;

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final gv y(v owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new gv(owner, null);
        }

        public y() {
        }
    }

    public /* synthetic */ gv(v vVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(vVar);
    }

    public static final gv y(v vVar) {
        return f7473gv.y(vVar);
    }

    public final void gv(Bundle bundle) {
        if (!this.zn) {
            zn();
        }
        s lifecycle = this.y.getLifecycle();
        if (!lifecycle.n3().n3(s.n3.STARTED)) {
            this.n3.a(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.n3()).toString());
    }

    public final zn n3() {
        return this.n3;
    }

    public final void v(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.n3.fb(outBundle);
    }

    public final void zn() {
        s lifecycle = this.y.getLifecycle();
        if (lifecycle.n3() != s.n3.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.y(new qk.y(this.y));
        this.n3.v(lifecycle);
        this.zn = true;
    }

    public gv(v vVar) {
        this.y = vVar;
        this.n3 = new zn();
    }
}
