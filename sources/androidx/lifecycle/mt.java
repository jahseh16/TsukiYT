package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.s;
import androidx.lifecycle.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class mt implements ap.mt {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public static final n3 f842co = new n3(null);
    public static final mt z = new mt();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f843f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f848v;
    public int y;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f844fb = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f846s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wz f847t = new wz(this);
    public final Runnable w = new Runnable() { // from class: ap.mg
        @Override // java.lang.Runnable
        public final void run() {
            androidx.lifecycle.mt.i9(this.y);
        }
    };

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z.y f845p = new gv();

    public static final class gv implements z.y {
        public gv() {
        }

        @Override // androidx.lifecycle.z.y
        public void onCreate() {
        }

        @Override // androidx.lifecycle.z.y
        public void onResume() {
            mt.this.v();
        }

        @Override // androidx.lifecycle.z.y
        public void onStart() {
            mt.this.a();
        }
    }

    public static final class n3 {
        public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void n3(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            mt.z.s(context);
        }

        public final ap.mt y() {
            return mt.z;
        }

        public n3() {
        }
    }

    public static final class zn extends ap.i9 {
        public zn() {
        }

        @Override // ap.i9, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                z.f879v.n3(activity).a(mt.this.f845p);
            }
        }

        @Override // ap.i9, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            mt.this.gv();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            y.y(activity, new y(mt.this));
        }

        @Override // ap.i9, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            mt.this.fb();
        }
    }

    public static final void i9(mt this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f();
        this$0.t();
    }

    public static final ap.mt tl() {
        return f842co.y();
    }

    public final void a() {
        int i = this.y + 1;
        this.y = i;
        if (i == 1 && this.f846s) {
            this.f847t.c5(s.y.ON_START);
            this.f846s = false;
        }
    }

    public final void f() {
        if (this.f848v == 0) {
            this.f844fb = true;
            this.f847t.c5(s.y.ON_PAUSE);
        }
    }

    public final void fb() {
        this.y--;
        t();
    }

    @Override // ap.mt
    public s getLifecycle() {
        return this.f847t;
    }

    public final void gv() {
        int i = this.f848v - 1;
        this.f848v = i;
        if (i == 0) {
            Handler handler = this.f843f;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(this.w, 700L);
        }
    }

    public final void s(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f843f = new Handler();
        this.f847t.c5(s.y.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new zn());
    }

    public final void t() {
        if (this.y == 0 && this.f844fb) {
            this.f847t.c5(s.y.ON_STOP);
            this.f846s = true;
        }
    }

    public final void v() {
        int i = this.f848v + 1;
        this.f848v = i;
        if (i == 1) {
            if (this.f844fb) {
                this.f847t.c5(s.y.ON_RESUME);
                this.f844fb = false;
            } else {
                Handler handler = this.f843f;
                Intrinsics.checkNotNull(handler);
                handler.removeCallbacks(this.w);
            }
        }
    }
}
