package androidx.fragment.app;

import a.a;
import a.co;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.s;
import androidx.lifecycle.wz;
import ap.hw;
import ap.j5;
import ap.mt;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import qk.zn;
import qn.n;
import qn.z;
import ta.f;
import ta.i4;
import ta.n3;
import ta.p;
import ta.w;

/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends a implements n3.s, n3.c5 {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    public static final /* synthetic */ int y = 0;
    boolean mCreated;
    final wz mFragmentLifecycleRegistry;
    final FragmentController mFragments;
    boolean mResumed;
    boolean mStopped;

    public class HostCallbacks extends FragmentHostCallback<FragmentActivity> implements d.gv, d.v, w, p, j5, co, s.gv, qk.v, FragmentOnAttachListener, z {
        public HostCallbacks() {
            super(FragmentActivity.this);
        }

        public void addMenuProvider(@NonNull n nVar) {
            FragmentActivity.this.addMenuProvider(nVar);
        }

        @Override // d.gv
        public void addOnConfigurationChangedListener(@NonNull j5.y<Configuration> yVar) {
            FragmentActivity.this.addOnConfigurationChangedListener(yVar);
        }

        @Override // ta.w
        public void addOnMultiWindowModeChangedListener(@NonNull j5.y<f> yVar) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(yVar);
        }

        @Override // ta.p
        public void addOnPictureInPictureModeChangedListener(@NonNull j5.y<ta.co> yVar) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(yVar);
        }

        @Override // d.v
        public void addOnTrimMemoryListener(@NonNull j5.y<Integer> yVar) {
            FragmentActivity.this.addOnTrimMemoryListener(yVar);
        }

        @Override // s.gv
        @NonNull
        public s.zn getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // ap.mt
        @NonNull
        public s getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // a.co
        @NonNull
        public a.w getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // qk.v
        @NonNull
        public qk.zn getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // ap.j5
        @NonNull
        public hw getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        public void invalidateMenu() {
            FragmentActivity.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.FragmentOnAttachListener
        public void onAttachFragment(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public void onDump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        @Nullable
        public View onFindViewById(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        @NonNull
        public LayoutInflater onGetLayoutInflater() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public int onGetWindowAnimations() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        public boolean onHasView() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public boolean onHasWindowAnimations() {
            return FragmentActivity.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public boolean onShouldSaveFragmentState(@NonNull Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public boolean onShouldShowRequestPermissionRationale(@NonNull String str) {
            return ta.n3.f(FragmentActivity.this, str);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public void onSupportInvalidateOptionsMenu() {
            invalidateMenu();
        }

        public void removeMenuProvider(@NonNull n nVar) {
            FragmentActivity.this.removeMenuProvider(nVar);
        }

        @Override // d.gv
        public void removeOnConfigurationChangedListener(@NonNull j5.y<Configuration> yVar) {
            FragmentActivity.this.removeOnConfigurationChangedListener(yVar);
        }

        @Override // ta.w
        public void removeOnMultiWindowModeChangedListener(@NonNull j5.y<f> yVar) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(yVar);
        }

        @Override // ta.p
        public void removeOnPictureInPictureModeChangedListener(@NonNull j5.y<ta.co> yVar) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(yVar);
        }

        @Override // d.v
        public void removeOnTrimMemoryListener(@NonNull j5.y<Integer> yVar) {
            FragmentActivity.this.removeOnTrimMemoryListener(yVar);
        }

        public void addMenuProvider(@NonNull n nVar, @NonNull mt mtVar) {
            FragmentActivity.this.addMenuProvider(nVar, mtVar);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.fragment.app.FragmentHostCallback
        public FragmentActivity onGetHost() {
            return FragmentActivity.this;
        }

        public void addMenuProvider(@NonNull n nVar, @NonNull mt mtVar, @NonNull s.n3 n3Var) {
            FragmentActivity.this.addMenuProvider(nVar, mtVar, n3Var);
        }
    }

    public FragmentActivity() {
        this.mFragments = FragmentController.createController(new HostCallbacks());
        this.mFragmentLifecycleRegistry = new wz(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().s(LIFECYCLE_TAG, new zn.InterfaceC0151zn() { // from class: nf.fb
            @Override // qk.zn.InterfaceC0151zn
            public final Bundle y() {
                return this.y.lambda$init$0();
            }
        });
        addOnConfigurationChangedListener(new j5.y() { // from class: nf.s
            @Override // j5.y
            public final void accept(Object obj) {
                this.y.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new j5.y() { // from class: nf.c5
            @Override // j5.y
            public final void accept(Object obj) {
                this.y.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new fb.n3() { // from class: nf.i9
            @Override // fb.n3
            public final void y(Context context) {
                this.y.lambda$init$3(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.c5(s.y.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.noteStateNotSaved();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.noteStateNotSaved();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$3(Context context) {
        this.mFragments.attachHost(null);
    }

    private static boolean markState(FragmentManager fragmentManager, s.n3 n3Var) {
        boolean zMarkState = false;
        for (Fragment fragment : fragmentManager.getFragments()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), n3Var);
                }
                FragmentViewLifecycleOwner fragmentViewLifecycleOwner = fragment.mViewLifecycleOwner;
                if (fragmentViewLifecycleOwner != null && fragmentViewLifecycleOwner.getLifecycle().n3().n3(s.n3.STARTED)) {
                    fragment.mViewLifecycleOwner.setCurrentState(n3Var);
                    zMarkState = true;
                }
                if (fragment.mLifecycleRegistry.n3().n3(s.n3.STARTED)) {
                    fragment.mLifecycleRegistry.xc(n3Var);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    @Nullable
    public final View dispatchFragmentsOnCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                yc.y.n3(this).y(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.getSupportFragmentManager().dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.getSupportFragmentManager();
    }

    @NonNull
    @Deprecated
    public yc.y getSupportLoaderManager() {
        return yc.y.n3(this);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), s.n3.CREATED)) {
        }
    }

    @Override // a.a, android.app.Activity
    public void onActivityResult(int i, int i5, @Nullable Intent intent) {
        this.mFragments.noteStateNotSaved();
        super.onActivityResult(i, i5, intent);
    }

    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // a.a, ta.c5, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.c5(s.y.ON_CREATE);
        this.mFragments.dispatchCreate();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.dispatchDestroy();
        this.mFragmentLifecycleRegistry.c5(s.y.ON_DESTROY);
    }

    @Override // a.a, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.dispatchContextItemSelected(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.dispatchPause();
        this.mFragmentLifecycleRegistry.c5(s.y.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // a.a, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.noteStateNotSaved();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.noteStateNotSaved();
        super.onResume();
        this.mResumed = true;
        this.mFragments.execPendingActions();
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.c5(s.y.ON_RESUME);
        this.mFragments.dispatchResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.noteStateNotSaved();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.dispatchActivityCreated();
        }
        this.mFragments.execPendingActions();
        this.mFragmentLifecycleRegistry.c5(s.y.ON_START);
        this.mFragments.dispatchStart();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.noteStateNotSaved();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.dispatchStop();
        this.mFragmentLifecycleRegistry.c5(s.y.ON_STOP);
    }

    public void setEnterSharedElementCallback(@Nullable i4 i4Var) {
        ta.n3.c5(this, i4Var);
    }

    public void setExitSharedElementCallback(@Nullable i4 i4Var) {
        ta.n3.i9(this, i4Var);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i5, int i8, int i10, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            ta.n3.tl(this, intentSender, i, intent, i5, i8, i10, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i5, i8, i10, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        ta.n3.zn(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        ta.n3.v(this);
    }

    public void supportStartPostponedEnterTransition() {
        ta.n3.wz(this);
    }

    @Override // ta.n3.c5
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i, @Nullable Bundle bundle) {
        if (i == -1) {
            ta.n3.t(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public FragmentActivity(int i) {
        super(i);
        this.mFragments = FragmentController.createController(new HostCallbacks());
        this.mFragmentLifecycleRegistry = new wz(this);
        this.mStopped = true;
        init();
    }
}
