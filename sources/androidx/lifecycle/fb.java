package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.s;
import ap.b;
import ap.hw;
import ap.j5;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import qk.zn;

/* JADX INFO: loaded from: classes.dex */
public final class fb {
    public static final fb y = new fb();

    public static final class n3 implements t {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ qk.zn f828v;
        public final /* synthetic */ s y;

        public n3(s sVar, qk.zn znVar) {
            this.y = sVar;
            this.f828v = znVar;
        }

        @Override // androidx.lifecycle.t
        public void onStateChanged(ap.mt source, s.y event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == s.y.ON_START) {
                this.y.gv(this);
                this.f828v.c5(y.class);
            }
        }
    }

    public static final class y implements zn.y {
        @Override // qk.zn.y
        public void y(qk.v owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (!(owner instanceof j5)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            hw viewModelStore = ((j5) owner).getViewModelStore();
            qk.zn savedStateRegistry = owner.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.zn().iterator();
            while (it.hasNext()) {
                b bVarN3 = viewModelStore.n3(it.next());
                Intrinsics.checkNotNull(bVarN3);
                fb.y(bVarN3, savedStateRegistry, owner.getLifecycle());
            }
            if (viewModelStore.zn().isEmpty()) {
                return;
            }
            savedStateRegistry.c5(y.class);
        }
    }

    public static final i4 n3(qk.zn registry, s lifecycle, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNull(str);
        i4 i4Var = new i4(str, r.f851a.y(registry.n3(str), bundle));
        i4Var.y(registry, lifecycle);
        y.zn(registry, lifecycle);
        return i4Var;
    }

    public static final void y(b viewModel, qk.zn registry, s lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        i4 i4Var = (i4) viewModel.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (i4Var == null || i4Var.zn()) {
            return;
        }
        i4Var.y(registry, lifecycle);
        y.zn(registry, lifecycle);
    }

    public final void zn(qk.zn znVar, s sVar) {
        s.n3 n3VarN3 = sVar.n3();
        if (n3VarN3 == s.n3.INITIALIZED || n3VarN3.n3(s.n3.STARTED)) {
            znVar.c5(y.class);
        } else {
            sVar.y(new n3(sVar, znVar));
        }
    }
}
