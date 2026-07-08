package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f789f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f790fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f791s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Runnable f792t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f793v;
    public long y;

    public ContentLoadingProgressBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.y = -1L;
        this.f793v = false;
        this.f790fb = false;
        this.f791s = false;
        this.f789f = new Runnable() { // from class: ut.gv
            @Override // java.lang.Runnable
            public final void run() {
                this.y.fb();
            }
        };
        this.f792t = new Runnable() { // from class: ut.v
            @Override // java.lang.Runnable
            public final void run() {
                this.y.s();
            }
        };
    }

    public final void a() {
        this.f791s = true;
        removeCallbacks(this.f792t);
        this.f790fb = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.y;
        long j4 = jCurrentTimeMillis - j;
        if (j4 >= 500 || j == -1) {
            setVisibility(8);
        } else {
            if (this.f793v) {
                return;
            }
            postDelayed(this.f789f, 500 - j4);
            this.f793v = true;
        }
    }

    public final void c5() {
        removeCallbacks(this.f789f);
        removeCallbacks(this.f792t);
    }

    public final void f() {
        this.y = -1L;
        this.f791s = false;
        removeCallbacks(this.f789f);
        this.f793v = false;
        if (this.f790fb) {
            return;
        }
        postDelayed(this.f792t, 500L);
        this.f790fb = true;
    }

    public final /* synthetic */ void fb() {
        this.f793v = false;
        this.y = -1L;
        setVisibility(8);
    }

    public void i9() {
        post(new Runnable() { // from class: ut.a
            @Override // java.lang.Runnable
            public final void run() {
                this.y.f();
            }
        });
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c5();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c5();
    }

    public final /* synthetic */ void s() {
        this.f790fb = false;
        if (this.f791s) {
            return;
        }
        this.y = System.currentTimeMillis();
        setVisibility(0);
    }

    public void v() {
        post(new Runnable() { // from class: ut.fb
            @Override // java.lang.Runnable
            public final void run() {
                this.y.a();
            }
        });
    }
}
