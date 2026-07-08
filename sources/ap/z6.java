package ap;

import android.os.Bundle;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import qk.zn;

/* JADX INFO: loaded from: classes.dex */
public final class z6 implements zn.InterfaceC0151zn {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Lazy f1183gv;
    public boolean n3;
    public final qk.zn y;
    public Bundle zn;

    public static final class y extends Lambda implements Function0<ej> {
        final /* synthetic */ j5 $viewModelStoreOwner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(j5 j5Var) {
            super(0);
            this.$viewModelStoreOwner = j5Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final ej invoke() {
            return androidx.lifecycle.f3.v(this.$viewModelStoreOwner);
        }
    }

    public z6(qk.zn savedStateRegistry, j5 viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.y = savedStateRegistry;
        this.f1183gv = LazyKt.lazy(new y(viewModelStoreOwner));
    }

    public final void gv() {
        if (this.n3) {
            return;
        }
        Bundle bundleN3 = this.y.n3("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.zn;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleN3 != null) {
            bundle.putAll(bundleN3);
        }
        this.zn = bundle;
        this.n3 = true;
        zn();
    }

    public final Bundle n3(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        gv();
        Bundle bundle = this.zn;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.zn;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.zn;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.zn = null;
        }
        return bundle2;
    }

    @Override // qk.zn.InterfaceC0151zn
    public Bundle y() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.zn;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, androidx.lifecycle.r> entry : zn().y0().entrySet()) {
            String key = entry.getKey();
            Bundle bundleY = entry.getValue().c5().y();
            if (!Intrinsics.areEqual(bundleY, Bundle.EMPTY)) {
                bundle.putBundle(key, bundleY);
            }
        }
        this.n3 = false;
        return bundle;
    }

    public final ej zn() {
        return (ej) this.f1183gv.getValue();
    }
}
