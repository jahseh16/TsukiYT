package a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.f3;
import androidx.lifecycle.rz;
import androidx.lifecycle.s;
import ap.hw;
import ap.j5;
import ap.o;
import ap.qn;
import c5.y;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import qk.zn;
import qn.i4;
import qn.n;

/* JADX INFO: loaded from: classes.dex */
public class a extends ta.c5 implements ap.mt, j5, androidx.lifecycle.a, qk.v, co, s.gv, d.gv, d.v, ta.w, ta.p, qn.z, tl {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final s.zn mActivityResultRegistry;
    private int mContentLayoutId;
    final fb.y mContextAwareHelper;
    private rz.n3 mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;

    @NonNull
    final t mFullyDrawnReporter;
    private final androidx.lifecycle.wz mLifecycleRegistry;
    private final i4 mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final w mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<j5.y<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<j5.y<ta.f>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<j5.y<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<j5.y<ta.co>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<j5.y<Integer>> mOnTrimMemoryListeners;
    final c5 mReportFullyDrawnExecutor;
    final qk.gv mSavedStateRegistryController;
    private hw mViewModelStore;

    /* JADX INFO: renamed from: a.a$a, reason: collision with other inner class name */
    public static class C0000a {
        public static void y(View view) {
            view.cancelPendingInputEvents();
        }
    }

    public interface c5 extends Executor {
        void a(@NonNull View view);

        void y();
    }

    public static class fb {
        public static OnBackInvokedDispatcher y(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    public class gv implements androidx.lifecycle.t {
        public gv() {
        }

        @Override // androidx.lifecycle.t
        public void onStateChanged(@NonNull ap.mt mtVar, @NonNull s.y yVar) {
            if (yVar == s.y.ON_DESTROY) {
                a.this.mContextAwareHelper.n3();
                if (!a.this.isChangingConfigurations()) {
                    a.this.getViewModelStore().y();
                }
                a.this.mReportFullyDrawnExecutor.y();
            }
        }
    }

    public class i9 implements c5, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Runnable f4v;
        public final long y = SystemClock.uptimeMillis() + 10000;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public boolean f2fb = false;

        public i9() {
        }

        @Override // a.a.c5
        public void a(@NonNull View view) {
            if (this.f2fb) {
                return;
            }
            this.f2fb = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f4v = runnable;
            View decorView = a.this.getWindow().getDecorView();
            if (!this.f2fb) {
                decorView.postOnAnimation(new Runnable() { // from class: a.fb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.zn();
                    }
                });
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f4v;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.y) {
                    this.f2fb = false;
                    a.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f4v = null;
            if (a.this.mFullyDrawnReporter.zn()) {
                this.f2fb = false;
                a.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // a.a.c5
        public void y() {
            a.this.getWindow().getDecorView().removeCallbacks(this);
            a.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        public final /* synthetic */ void zn() {
            Runnable runnable = this.f4v;
            if (runnable != null) {
                runnable.run();
                this.f4v = null;
            }
        }
    }

    public class n3 extends s.zn {

        /* JADX INFO: renamed from: a.a$n3$n3, reason: collision with other inner class name */
        public class RunnableC0001n3 implements Runnable {

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ IntentSender.SendIntentException f7v;
            public final /* synthetic */ int y;

            public RunnableC0001n3(int i, IntentSender.SendIntentException sendIntentException) {
                this.y = i;
                this.f7v = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                n3.this.n3(this.y, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f7v));
            }
        }

        public class y implements Runnable {

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ y.C0046y f9v;
            public final /* synthetic */ int y;

            public y(int i, y.C0046y c0046y) {
                this.y = i;
                this.f9v = c0046y;
            }

            @Override // java.lang.Runnable
            public void run() {
                n3.this.zn(this.y, this.f9v.y());
            }
        }

        public n3() {
        }

        @Override // s.zn
        public <I, O> void a(int i, @NonNull c5.y<I, O> yVar, I i5, @Nullable ta.gv gvVar) {
            Bundle bundle;
            a aVar = a.this;
            y.C0046y<O> synchronousResult = yVar.getSynchronousResult(aVar, i5);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new y(i, synchronousResult));
                return;
            }
            Intent intentCreateIntent = yVar.createIntent(aVar, i5);
            if (intentCreateIntent.getExtras() != null && intentCreateIntent.getExtras().getClassLoader() == null) {
                intentCreateIntent.setExtrasClassLoader(aVar.getClassLoader());
            }
            if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentCreateIntent.getAction())) {
                String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                ta.n3.fb(aVar, stringArrayExtra, i);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentCreateIntent.getAction())) {
                ta.n3.t(aVar, intentCreateIntent, i, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                ta.n3.tl(aVar, intentSenderRequest.gv(), i, intentSenderRequest.y(), intentSenderRequest.n3(), intentSenderRequest.zn(), 0, bundle);
            } catch (IntentSender.SendIntentException e4) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0001n3(i, e4));
            }
        }
    }

    public static final class s {
        public hw n3;
        public Object y;
    }

    public class v implements androidx.lifecycle.t {
        public v() {
        }

        @Override // androidx.lifecycle.t
        public void onStateChanged(@NonNull ap.mt mtVar, @NonNull s.y yVar) {
            a.this.ensureViewModelStore();
            a.this.getLifecycle().gv(this);
        }
    }

    public class y implements Runnable {
        public y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a.super.onBackPressed();
            } catch (IllegalStateException e4) {
                if (!TextUtils.equals(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e4;
                }
            }
        }
    }

    public class zn implements androidx.lifecycle.t {
        public zn() {
        }

        @Override // androidx.lifecycle.t
        public void onStateChanged(@NonNull ap.mt mtVar, @NonNull s.y yVar) {
            if (yVar == s.y.ON_STOP) {
                Window window = a.this.getWindow();
                View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                if (viewPeekDecorView != null) {
                    C0000a.y(viewPeekDecorView);
                }
            }
        }
    }

    public a() {
        this.mContextAwareHelper = new fb.y();
        this.mMenuHostHelper = new i4(new Runnable() { // from class: a.n3
            @Override // java.lang.Runnable
            public final void run() {
                this.y.invalidateMenu();
            }
        });
        this.mLifecycleRegistry = new androidx.lifecycle.wz(this);
        qk.gv gvVarY = qk.gv.y(this);
        this.mSavedStateRegistryController = gvVarY;
        this.mOnBackPressedDispatcher = new w(new y());
        c5 c5VarCreateFullyDrawnExecutor = createFullyDrawnExecutor();
        this.mReportFullyDrawnExecutor = c5VarCreateFullyDrawnExecutor;
        this.mFullyDrawnReporter = new t(c5VarCreateFullyDrawnExecutor, new Function0() { // from class: a.zn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.y.lambda$new$0();
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new n3();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i = Build.VERSION.SDK_INT;
        getLifecycle().y(new zn());
        getLifecycle().y(new gv());
        getLifecycle().y(new v());
        gvVarY.zn();
        f3.zn(this);
        if (i <= 23) {
            getLifecycle().y(new wz(this));
        }
        getSavedStateRegistry().s(ACTIVITY_RESULT_TAG, new zn.InterfaceC0151zn() { // from class: a.gv
            @Override // qk.zn.InterfaceC0151zn
            public final Bundle y() {
                return this.y.lambda$new$1();
            }
        });
        addOnContextAvailableListener(new fb.n3() { // from class: a.v
            @Override // fb.n3
            public final void y(Context context) {
                this.y.lambda$new$2(context);
            }
        });
    }

    private c5 createFullyDrawnExecutor() {
        return new i9();
    }

    private void initViewTreeOwners() {
        qn.n3(getWindow().getDecorView(), this);
        o.y(getWindow().getDecorView(), this);
        qk.a.y(getWindow().getDecorView(), this);
        r.y(getWindow().getDecorView(), this);
        z.y(getWindow().getDecorView(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$new$0() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$new$1() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.s(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(Context context) {
        Bundle bundleN3 = getSavedStateRegistry().n3(ACTIVITY_RESULT_TAG);
        if (bundleN3 != null) {
            this.mActivityResultRegistry.fb(bundleN3);
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(@NonNull n nVar) {
        this.mMenuHostHelper.zn(nVar);
    }

    @Override // d.gv
    public final void addOnConfigurationChangedListener(@NonNull j5.y<Configuration> yVar) {
        this.mOnConfigurationChangedListeners.add(yVar);
    }

    public final void addOnContextAvailableListener(@NonNull fb.n3 n3Var) {
        this.mContextAwareHelper.y(n3Var);
    }

    @Override // ta.w
    public final void addOnMultiWindowModeChangedListener(@NonNull j5.y<ta.f> yVar) {
        this.mOnMultiWindowModeChangedListeners.add(yVar);
    }

    public final void addOnNewIntentListener(@NonNull j5.y<Intent> yVar) {
        this.mOnNewIntentListeners.add(yVar);
    }

    @Override // ta.p
    public final void addOnPictureInPictureModeChangedListener(@NonNull j5.y<ta.co> yVar) {
        this.mOnPictureInPictureModeChangedListeners.add(yVar);
    }

    @Override // d.v
    public final void addOnTrimMemoryListener(@NonNull j5.y<Integer> yVar) {
        this.mOnTrimMemoryListeners.add(yVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            s sVar = (s) getLastNonConfigurationInstance();
            if (sVar != null) {
                this.mViewModelStore = sVar.n3;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new hw();
            }
        }
    }

    @Override // s.gv
    @NonNull
    public final s.zn getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.a
    @NonNull
    public yg.y getDefaultViewModelCreationExtras() {
        yg.gv gvVar = new yg.gv();
        if (getApplication() != null) {
            gvVar.zn(rz.y.f856fb, getApplication());
        }
        gvVar.zn(f3.y, this);
        gvVar.zn(f3.n3, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            gvVar.zn(f3.zn, getIntent().getExtras());
        }
        return gvVar;
    }

    @Override // androidx.lifecycle.a
    @NonNull
    public rz.n3 getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new androidx.lifecycle.n(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @NonNull
    public t getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Nullable
    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        s sVar = (s) getLastNonConfigurationInstance();
        if (sVar != null) {
            return sVar.y;
        }
        return null;
    }

    @Override // ta.c5, ap.mt
    @NonNull
    public androidx.lifecycle.s getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // a.co
    @NonNull
    public final w getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // qk.v
    @NonNull
    public final qk.zn getSavedStateRegistry() {
        return this.mSavedStateRegistryController.n3();
    }

    @Override // ap.j5
    @NonNull
    public hw getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i5, @Nullable Intent intent) {
        if (this.mActivityResultRegistry.n3(i, i5, intent)) {
            return;
        }
        super.onActivityResult(i, i5, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<j5.y<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // ta.c5, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        this.mSavedStateRegistryController.gv(bundle);
        this.mContextAwareHelper.zn(this);
        super.onCreate(bundle);
        androidx.lifecycle.z.v(this);
        if (yt.y.zn()) {
            this.mOnBackPressedDispatcher.fb(fb.y(this));
        }
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, @NonNull Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.mMenuHostHelper.s(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mMenuHostHelper.i9(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<j5.y<ta.f>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new ta.f(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<j5.y<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, @NonNull Menu menu) {
        this.mMenuHostHelper.c5(menu);
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<j5.y<ta.co>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new ta.co(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, @Nullable View view, @NonNull Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.mMenuHostHelper.f(menu);
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (this.mActivityResultRegistry.n3(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Nullable
    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        s sVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        hw hwVar = this.mViewModelStore;
        if (hwVar == null && (sVar = (s) getLastNonConfigurationInstance()) != null) {
            hwVar = sVar.n3;
        }
        if (hwVar == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        s sVar2 = new s();
        sVar2.y = objOnRetainCustomNonConfigurationInstance;
        sVar2.n3 = hwVar;
        return sVar2;
    }

    @Override // ta.c5, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        androidx.lifecycle.s lifecycle = getLifecycle();
        if (lifecycle instanceof androidx.lifecycle.wz) {
            ((androidx.lifecycle.wz) lifecycle).xc(s.n3.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.v(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<j5.y<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Nullable
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.gv();
    }

    @NonNull
    public final <I, O> s.n3<I> registerForActivityResult(@NonNull c5.y<I, O> yVar, @NonNull s.zn znVar, @NonNull s.y<O> yVar2) {
        return znVar.c5("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, yVar, yVar2);
    }

    public void removeMenuProvider(@NonNull n nVar) {
        this.mMenuHostHelper.t(nVar);
    }

    @Override // d.gv
    public final void removeOnConfigurationChangedListener(@NonNull j5.y<Configuration> yVar) {
        this.mOnConfigurationChangedListeners.remove(yVar);
    }

    public final void removeOnContextAvailableListener(@NonNull fb.n3 n3Var) {
        this.mContextAwareHelper.v(n3Var);
    }

    @Override // ta.w
    public final void removeOnMultiWindowModeChangedListener(@NonNull j5.y<ta.f> yVar) {
        this.mOnMultiWindowModeChangedListeners.remove(yVar);
    }

    public final void removeOnNewIntentListener(@NonNull j5.y<Intent> yVar) {
        this.mOnNewIntentListeners.remove(yVar);
    }

    @Override // ta.p
    public final void removeOnPictureInPictureModeChangedListener(@NonNull j5.y<ta.co> yVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(yVar);
    }

    @Override // d.v
    public final void removeOnTrimMemoryListener(@NonNull j5.y<Integer> yVar) {
        this.mOnTrimMemoryListeners.remove(yVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (w9.n3.gv()) {
                w9.n3.y("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.n3();
            w9.n3.n3();
        } catch (Throwable th) {
            w9.n3.n3();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.a(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i5, int i8, int i10) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i5, i8, i10);
    }

    public void addMenuProvider(@NonNull n nVar, @NonNull ap.mt mtVar) {
        this.mMenuHostHelper.gv(nVar, mtVar);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i, @Nullable Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i5, int i8, int i10, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i5, i8, i10, bundle);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NonNull n nVar, @NonNull ap.mt mtVar, @NonNull s.n3 n3Var) {
        this.mMenuHostHelper.v(nVar, mtVar, n3Var);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, @NonNull Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<j5.y<ta.f>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new ta.f(z, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, @NonNull Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<j5.y<ta.co>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new ta.co(z, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @NonNull
    public final <I, O> s.n3<I> registerForActivityResult(@NonNull c5.y<I, O> yVar, @NonNull s.y<O> yVar2) {
        return registerForActivityResult(yVar, this.mActivityResultRegistry, yVar2);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    public a(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
