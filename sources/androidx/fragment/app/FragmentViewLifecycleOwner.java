package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.a;
import androidx.lifecycle.f3;
import androidx.lifecycle.n;
import androidx.lifecycle.rz;
import androidx.lifecycle.s;
import androidx.lifecycle.wz;
import ap.hw;
import ap.j5;

/* JADX INFO: loaded from: classes.dex */
class FragmentViewLifecycleOwner implements a, qk.v, j5 {
    private rz.n3 mDefaultFactory;
    private final Fragment mFragment;
    private final Runnable mRestoreViewSavedStateRunnable;
    private final hw mViewModelStore;
    private wz mLifecycleRegistry = null;
    private qk.gv mSavedStateRegistryController = null;

    public FragmentViewLifecycleOwner(@NonNull Fragment fragment, @NonNull hw hwVar, @NonNull Runnable runnable) {
        this.mFragment = fragment;
        this.mViewModelStore = hwVar;
        this.mRestoreViewSavedStateRunnable = runnable;
    }

    @Override // androidx.lifecycle.a
    @NonNull
    public yg.y getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.mFragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        yg.gv gvVar = new yg.gv();
        if (application != null) {
            gvVar.zn(rz.y.f856fb, application);
        }
        gvVar.zn(f3.y, this.mFragment);
        gvVar.zn(f3.n3, this);
        if (this.mFragment.getArguments() != null) {
            gvVar.zn(f3.zn, this.mFragment.getArguments());
        }
        return gvVar;
    }

    @Override // androidx.lifecycle.a
    @NonNull
    public rz.n3 getDefaultViewModelProviderFactory() {
        Application application;
        rz.n3 defaultViewModelProviderFactory = this.mFragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.mFragment.mDefaultFactory)) {
            this.mDefaultFactory = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = this.mFragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            Fragment fragment = this.mFragment;
            this.mDefaultFactory = new n(application, fragment, fragment.getArguments());
        }
        return this.mDefaultFactory;
    }

    @Override // ap.mt
    @NonNull
    public s getLifecycle() {
        initialize();
        return this.mLifecycleRegistry;
    }

    @Override // qk.v
    @NonNull
    public qk.zn getSavedStateRegistry() {
        initialize();
        return this.mSavedStateRegistryController.n3();
    }

    @Override // ap.j5
    @NonNull
    public hw getViewModelStore() {
        initialize();
        return this.mViewModelStore;
    }

    public void handleLifecycleEvent(@NonNull s.y yVar) {
        this.mLifecycleRegistry.c5(yVar);
    }

    public void initialize() {
        if (this.mLifecycleRegistry == null) {
            this.mLifecycleRegistry = new wz(this);
            qk.gv gvVarY = qk.gv.y(this);
            this.mSavedStateRegistryController = gvVarY;
            gvVarY.zn();
            this.mRestoreViewSavedStateRunnable.run();
        }
    }

    public boolean isInitialized() {
        return this.mLifecycleRegistry != null;
    }

    public void performRestore(@Nullable Bundle bundle) {
        this.mSavedStateRegistryController.gv(bundle);
    }

    public void performSave(@NonNull Bundle bundle) {
        this.mSavedStateRegistryController.v(bundle);
    }

    public void setCurrentState(@NonNull s.n3 n3Var) {
        this.mLifecycleRegistry.xc(n3Var);
    }
}
