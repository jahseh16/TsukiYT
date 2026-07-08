package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$style;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import i9.f;
import o.ud;
import qn.d;
import qn.rs;
import qn.ut;
import y2.fb;

/* JADX INFO: loaded from: classes.dex */
public class y extends f {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public boolean f2586co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CoordinatorLayout f2587f;
    public boolean f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f2588fb;

    @NonNull
    public BottomSheetBehavior.fb n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2589p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public BottomSheetBehavior.fb f2590r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public FrameLayout f2591s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public FrameLayout f2592t;
    public boolean w;
    public boolean z;

    public static class a extends BottomSheetBehavior.fb {
        public final boolean n3;
        public final boolean y;
        public final rs zn;

        public /* synthetic */ a(View view, rs rsVar, C0063y c0063y) {
            this(view, rsVar);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.fb
        public void n3(@NonNull View view, int i) {
            zn(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.fb
        public void y(@NonNull View view, float f3) {
            zn(view);
        }

        public final void zn(View view) {
            if (view.getTop() < this.zn.tl()) {
                y.tl(view, this.y);
                view.setPadding(view.getPaddingLeft(), this.zn.tl() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                y.tl(view, this.n3);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public a(@NonNull View view, @NonNull rs rsVar) {
            this.zn = rsVar;
            boolean z = Build.VERSION.SDK_INT >= 23 && (view.getSystemUiVisibility() & 8192) != 0;
            this.n3 = z;
            fb fbVarDm = BottomSheetBehavior.y5(view).dm();
            ColorStateList colorStateListF3 = fbVarDm != null ? fbVarDm.f3() : ut.r(view);
            if (colorStateListF3 != null) {
                this.y = g2.y.a(colorStateListF3.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.y = g2.y.a(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.y = z;
            }
        }
    }

    public class gv implements View.OnTouchListener {
        public gv() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public class n3 implements View.OnClickListener {
        public n3() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y yVar = y.this;
            if (yVar.f2589p && yVar.isShowing() && y.this.wz()) {
                y.this.cancel();
            }
        }
    }

    public class v extends BottomSheetBehavior.fb {
        public v() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.fb
        public void n3(@NonNull View view, int i) {
            if (i == 5) {
                y.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.fb
        public void y(@NonNull View view, float f3) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.y$y, reason: collision with other inner class name */
    public class C0063y implements d {
        public C0063y() {
        }

        public rs y(View view, rs rsVar) {
            if (y.this.f2590r != null) {
                y.this.f2588fb.lc(y.this.f2590r);
            }
            if (rsVar != null) {
                y yVar = y.this;
                yVar.f2590r = new a(yVar.f2592t, rsVar, null);
                y.this.f2588fb.o(y.this.f2590r);
            }
            return rsVar;
        }
    }

    public class zn extends qn.y {
        public zn() {
        }

        public void fb(View view, @NonNull ud udVar) {
            super.fb(view, udVar);
            if (!y.this.f2589p) {
                udVar.kp(false);
            } else {
                udVar.y(1048576);
                udVar.kp(true);
            }
        }

        public boolean i9(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                y yVar = y.this;
                if (yVar.f2589p) {
                    yVar.cancel();
                    return true;
                }
            }
            return super.i9(view, i, bundle);
        }
    }

    public y(@NonNull Context context, int i) {
        super(context, n3(context, i));
        this.f2589p = true;
        this.f2586co = true;
        this.n = new v();
        gv(1);
        this.f3 = getContext().getTheme().obtainStyledAttributes(new int[]{R$attr.f2172mt}).getBoolean(0, false);
    }

    public static int n3(@NonNull Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R$attr.f2168gv, typedValue, true) ? typedValue.resourceId : R$style.f2297gv;
    }

    public static void tl(@NonNull View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    public final FrameLayout c5() {
        if (this.f2591s == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R$layout.y, null);
            this.f2591s = frameLayout;
            this.f2587f = frameLayout.findViewById(R$id.f2238gv);
            FrameLayout frameLayout2 = (FrameLayout) this.f2591s.findViewById(R$id.f2252v);
            this.f2592t = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorY5 = BottomSheetBehavior.y5(frameLayout2);
            this.f2588fb = bottomSheetBehaviorY5;
            bottomSheetBehaviorY5.o(this.n);
            this.f2588fb.g3(this.f2589p);
        }
        return this.f2591s;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorI9 = i9();
        if (!this.w || bottomSheetBehaviorI9.ct() == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorI9.tg(5);
        }
    }

    public boolean f() {
        return this.w;
    }

    @NonNull
    public BottomSheetBehavior<FrameLayout> i9() {
        if (this.f2588fb == null) {
            c5();
        }
        return this.f2588fb;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.f3 && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f2591s;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.f2587f;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    @Override // i9.f, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i = Build.VERSION.SDK_INT;
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (i < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f2588fb;
        if (bottomSheetBehavior == null || bottomSheetBehavior.ct() != 5) {
            return;
        }
        this.f2588fb.tg(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f2589p != z) {
            this.f2589p = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f2588fb;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.g3(z);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f2589p) {
            this.f2589p = true;
        }
        this.f2586co = z;
        this.z = true;
    }

    @Override // i9.f, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(xc(i, null, null));
    }

    public void t() {
        this.f2588fb.lc(this.n);
    }

    public boolean wz() {
        if (!this.z) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f2586co = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.z = true;
        }
        return this.f2586co;
    }

    public final View xc(int i, @Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        c5();
        CoordinatorLayout coordinatorLayoutFindViewById = this.f2591s.findViewById(R$id.f2238gv);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayoutFindViewById, false);
        }
        if (this.f3) {
            ut.ad(this.f2592t, new C0063y());
        }
        this.f2592t.removeAllViews();
        if (layoutParams == null) {
            this.f2592t.addView(view);
        } else {
            this.f2592t.addView(view, layoutParams);
        }
        coordinatorLayoutFindViewById.findViewById(R$id.qn).setOnClickListener(new n3());
        ut.g3(this.f2592t, new zn());
        this.f2592t.setOnTouchListener(new gv());
        return this.f2591s;
    }

    @Override // i9.f, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(xc(0, view, null));
    }

    @Override // i9.f, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(xc(0, view, layoutParams));
    }
}
