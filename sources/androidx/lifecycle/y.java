package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.rz;
import ap.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class y extends rz.gv implements rz.n3 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final C0017y f878gv = new C0017y(null);
    public s n3;
    public qk.zn y;
    public Bundle zn;

    /* JADX INFO: renamed from: androidx.lifecycle.y$y, reason: collision with other inner class name */
    public static final class C0017y {
        public /* synthetic */ C0017y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0017y() {
        }
    }

    public y(qk.v owner, Bundle bundle) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.y = owner.getSavedStateRegistry();
        this.n3 = owner.getLifecycle();
        this.zn = bundle;
    }

    private final <T extends b> T n3(String str, Class<T> cls) {
        qk.zn znVar = this.y;
        Intrinsics.checkNotNull(znVar);
        s sVar = this.n3;
        Intrinsics.checkNotNull(sVar);
        i4 i4VarN3 = fb.n3(znVar, sVar, str, this.zn);
        T t3 = (T) zn(str, cls, i4VarN3.n3());
        t3.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", i4VarN3);
        return t3;
    }

    @Override // androidx.lifecycle.rz.n3
    public <T extends b> T create(Class<T> modelClass, yg.y extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.y(rz.zn.zn);
        if (str != null) {
            return this.y != null ? (T) n3(str, modelClass) : (T) zn(str, modelClass, f3.n3(extras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.rz.gv
    public void y(b viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        qk.zn znVar = this.y;
        if (znVar != null) {
            Intrinsics.checkNotNull(znVar);
            s sVar = this.n3;
            Intrinsics.checkNotNull(sVar);
            fb.y(viewModel, znVar, sVar);
        }
    }

    public abstract <T extends b> T zn(String str, Class<T> cls, r rVar);

    @Override // androidx.lifecycle.rz.n3
    public <T extends b> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            if (this.n3 != null) {
                return (T) n3(canonicalName, modelClass);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
