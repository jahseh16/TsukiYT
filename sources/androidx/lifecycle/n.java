package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.rz;
import ap.b;
import ap.ud;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n extends rz.gv implements rz.n3 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public s f849gv;
    public final rz.n3 n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public qk.zn f850v;
    public Application y;
    public Bundle zn;

    public n() {
        this.n3 = new rz.y();
    }

    @Override // androidx.lifecycle.rz.n3
    public <T extends b> T create(Class<T> modelClass, yg.y extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.y(rz.zn.zn);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.y(f3.y) == null || extras.y(f3.n3) == null) {
            if (this.f849gv != null) {
                return (T) n3(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.y(rz.y.f856fb);
        boolean zIsAssignableFrom = ap.y.class.isAssignableFrom(modelClass);
        Constructor constructorZn = (!zIsAssignableFrom || application == null) ? ud.zn(modelClass, ud.n3) : ud.zn(modelClass, ud.y);
        return constructorZn == null ? (T) this.n3.create(modelClass, extras) : (!zIsAssignableFrom || application == null) ? (T) ud.gv(modelClass, constructorZn, f3.n3(extras)) : (T) ud.gv(modelClass, constructorZn, application, f3.n3(extras));
    }

    public final <T extends b> T n3(String key, Class<T> modelClass) {
        T t3;
        Application application;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        s sVar = this.f849gv;
        if (sVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = ap.y.class.isAssignableFrom(modelClass);
        Constructor constructorZn = (!zIsAssignableFrom || this.y == null) ? ud.zn(modelClass, ud.n3) : ud.zn(modelClass, ud.y);
        if (constructorZn == null) {
            return this.y != null ? (T) this.n3.create(modelClass) : (T) rz.zn.y.y().create(modelClass);
        }
        qk.zn znVar = this.f850v;
        Intrinsics.checkNotNull(znVar);
        i4 i4VarN3 = fb.n3(znVar, sVar, key, this.zn);
        if (!zIsAssignableFrom || (application = this.y) == null) {
            t3 = (T) ud.gv(modelClass, constructorZn, i4VarN3.n3());
        } else {
            Intrinsics.checkNotNull(application);
            t3 = (T) ud.gv(modelClass, constructorZn, application, i4VarN3.n3());
        }
        t3.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", i4VarN3);
        return t3;
    }

    @Override // androidx.lifecycle.rz.gv
    public void y(b viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (this.f849gv != null) {
            qk.zn znVar = this.f850v;
            Intrinsics.checkNotNull(znVar);
            s sVar = this.f849gv;
            Intrinsics.checkNotNull(sVar);
            fb.y(viewModel, znVar, sVar);
        }
    }

    @SuppressLint({"LambdaLast"})
    public n(Application application, qk.v owner, Bundle bundle) {
        rz.y yVar;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f850v = owner.getSavedStateRegistry();
        this.f849gv = owner.getLifecycle();
        this.zn = bundle;
        this.y = application;
        if (application != null) {
            yVar = rz.y.f857v.n3(application);
        } else {
            yVar = new rz.y();
        }
        this.n3 = yVar;
    }

    @Override // androidx.lifecycle.rz.n3
    public <T extends b> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) n3(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
