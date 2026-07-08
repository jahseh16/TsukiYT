package a;

import a.w;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.s;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public OnBackInvokedCallback f18gv;
    public final ArrayDeque<xc> n3 = new ArrayDeque<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public OnBackInvokedDispatcher f19v;
    public final Runnable y;
    public Function0<Unit> zn;

    public final class gv implements androidx.lifecycle.t, a.y {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public a.y f20fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ w f21s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final xc f22v;
        public final androidx.lifecycle.s y;

        public gv(w wVar, androidx.lifecycle.s lifecycle, xc onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f21s = wVar;
            this.y = lifecycle;
            this.f22v = onBackPressedCallback;
            lifecycle.y(this);
        }

        @Override // a.y
        public void cancel() {
            this.y.gv(this);
            this.f22v.removeCancellable(this);
            a.y yVar = this.f20fb;
            if (yVar != null) {
                yVar.cancel();
            }
            this.f20fb = null;
        }

        @Override // androidx.lifecycle.t
        public void onStateChanged(ap.mt source, s.y event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == s.y.ON_START) {
                this.f20fb = this.f21s.gv(this.f22v);
                return;
            }
            if (event != s.y.ON_STOP) {
                if (event == s.y.ON_DESTROY) {
                    cancel();
                }
            } else {
                a.y yVar = this.f20fb;
                if (yVar != null) {
                    yVar.cancel();
                }
            }
        }
    }

    public static final class n3 extends Lambda implements Function0<Unit> {
        public n3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            w.this.a();
        }
    }

    public final class v implements a.y {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ w f23v;
        public final xc y;

        public v(w wVar, xc onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f23v = wVar;
            this.y = onBackPressedCallback;
        }

        @Override // a.y
        public void cancel() {
            this.f23v.n3.remove(this.y);
            this.y.removeCancellable(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.y.setEnabledChangedCallback$activity_release(null);
                this.f23v.s();
            }
        }
    }

    public static final class y extends Lambda implements Function0<Unit> {
        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            w.this.s();
        }
    }

    public static final class zn {
        public static final zn y = new zn();

        public static final void zn(Function0 onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        public final void gv(Object dispatcher, int i, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) callback);
        }

        public final OnBackInvokedCallback n3(final Function0<Unit> onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: a.p
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    w.zn.zn(onBackInvoked);
                }
            };
        }

        public final void v(Object dispatcher, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    public w(Runnable runnable) {
        this.y = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.zn = new y();
            this.f18gv = zn.y.n3(new n3());
        }
    }

    public final void a() {
        xc xcVarPrevious;
        ArrayDeque<xc> arrayDeque = this.n3;
        ListIterator<xc> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                xcVarPrevious = null;
                break;
            } else {
                xcVarPrevious = listIterator.previous();
                if (xcVarPrevious.isEnabled()) {
                    break;
                }
            }
        }
        xc xcVar = xcVarPrevious;
        if (xcVar != null) {
            xcVar.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.y;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void fb(OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.f19v = invoker;
        s();
    }

    public final a.y gv(xc onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.n3.add(onBackPressedCallback);
        v vVar = new v(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(vVar);
        if (Build.VERSION.SDK_INT >= 33) {
            s();
            onBackPressedCallback.setEnabledChangedCallback$activity_release(this.zn);
        }
        return vVar;
    }

    public final void n3(xc onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        gv(onBackPressedCallback);
    }

    public final void s() {
        boolean zV = v();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f19v;
        OnBackInvokedCallback onBackInvokedCallback = this.f18gv;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (zV && !this.f17a) {
            zn.y.gv(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f17a = true;
        } else {
            if (zV || !this.f17a) {
                return;
            }
            zn.y.v(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f17a = false;
        }
    }

    public final boolean v() {
        ArrayDeque<xc> arrayDeque = this.n3;
        if ((arrayDeque instanceof Collection) && arrayDeque.isEmpty()) {
            return false;
        }
        Iterator<xc> it = arrayDeque.iterator();
        while (it.hasNext()) {
            if (it.next().isEnabled()) {
                return true;
            }
        }
        return false;
    }

    public final void zn(ap.mt owner, xc onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.s lifecycle = owner.getLifecycle();
        if (lifecycle.n3() == s.n3.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new gv(this, lifecycle, onBackPressedCallback));
        if (Build.VERSION.SDK_INT >= 33) {
            s();
            onBackPressedCallback.setEnabledChangedCallback$activity_release(this.zn);
        }
    }
}
