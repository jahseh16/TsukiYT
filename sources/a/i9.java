package a;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.s;
import ap.qn;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class i9 extends Dialog implements ap.mt, co, qk.v {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final w f10fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final qk.gv f11v;
    public androidx.lifecycle.wz y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11v = qk.gv.f7473gv.y(this);
        this.f10fb = new w(new Runnable() { // from class: a.c5
            @Override // java.lang.Runnable
            public final void run() {
                i9.gv(this.y);
            }
        });
    }

    public static final void gv(i9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        zn();
        super.addContentView(view, layoutParams);
    }

    @Override // ap.mt
    public androidx.lifecycle.s getLifecycle() {
        return n3();
    }

    @Override // a.co
    public final w getOnBackPressedDispatcher() {
        return this.f10fb;
    }

    @Override // qk.v
    public qk.zn getSavedStateRegistry() {
        return this.f11v.n3();
    }

    public final androidx.lifecycle.wz n3() {
        androidx.lifecycle.wz wzVar = this.y;
        if (wzVar != null) {
            return wzVar;
        }
        androidx.lifecycle.wz wzVar2 = new androidx.lifecycle.wz(this);
        this.y = wzVar2;
        return wzVar2;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f10fb.a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            w wVar = this.f10fb;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            wVar.fb(onBackInvokedDispatcher);
        }
        this.f11v.gv(bundle);
        n3().c5(s.y.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f11v.v(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        n3().c5(s.y.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        n3().c5(s.y.ON_DESTROY);
        this.y = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        zn();
        super.setContentView(i);
    }

    public final void zn() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        qn.n3(decorView, this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        r.y(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        qk.a.y(decorView3, this);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        zn();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        zn();
        super.setContentView(view, layoutParams);
    }
}
