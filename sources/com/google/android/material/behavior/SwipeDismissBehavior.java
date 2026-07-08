package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import k.zn;
import o.b;
import o.ud;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.zn<V> {
    public zn n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2515v;
    public k.zn y;
    public boolean zn;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public float f2512gv = 0.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2509a = 2;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public float f2511fb = 0.5f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f2514s = 0.0f;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public float f2510c5 = 0.5f;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final zn.AbstractC0112zn f2513i9 = new y();

    public class gv implements Runnable {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f2517v;
        public final View y;

        public gv(View view, boolean z) {
            this.y = view;
            this.f2517v = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            zn znVar;
            k.zn znVar2 = SwipeDismissBehavior.this.y;
            if (znVar2 != null && znVar2.tl(true)) {
                ut.nf(this.y, this);
            } else {
                if (!this.f2517v || (znVar = SwipeDismissBehavior.this.n3) == null) {
                    return;
                }
                znVar.y(this.y);
            }
        }
    }

    public class n3 implements b {
        public n3() {
        }

        public boolean y(@NonNull View view, @Nullable b.y yVar) {
            if (!SwipeDismissBehavior.this.ta(view)) {
                return false;
            }
            boolean z = ut.ta(view) == 1;
            int i = SwipeDismissBehavior.this.f2509a;
            ut.y5(view, (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            zn znVar = SwipeDismissBehavior.this.n3;
            if (znVar != null) {
                znVar.y(view);
            }
            return true;
        }
    }

    public class y extends zn.AbstractC0112zn {
        public int n3 = -1;
        public int y;

        public y() {
        }

        @Override // k.zn.AbstractC0112zn
        public void c5(@NonNull View view, int i) {
            this.n3 = i;
            this.y = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // k.zn.AbstractC0112zn
        public void f(@NonNull View view, int i, int i5, int i8, int i10) {
            float width = this.y + (view.getWidth() * SwipeDismissBehavior.this.f2514s);
            float width2 = this.y + (view.getWidth() * SwipeDismissBehavior.this.f2510c5);
            float f3 = i;
            if (f3 <= width) {
                view.setAlpha(1.0f);
            } else if (f3 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.d(0.0f, 1.0f - SwipeDismissBehavior.ud(width, width2, f3), 1.0f));
            }
        }

        @Override // k.zn.AbstractC0112zn
        public int gv(@NonNull View view) {
            return view.getWidth();
        }

        @Override // k.zn.AbstractC0112zn
        public void i9(int i) {
            zn znVar = SwipeDismissBehavior.this.n3;
            if (znVar != null) {
                znVar.n3(i);
            }
        }

        @Override // k.zn.AbstractC0112zn
        public int n3(@NonNull View view, int i, int i5) {
            return view.getTop();
        }

        @Override // k.zn.AbstractC0112zn
        public void t(@NonNull View view, float f3, float f4) {
            int i;
            boolean z;
            zn znVar;
            this.n3 = -1;
            int width = view.getWidth();
            if (wz(view, f3)) {
                int left = view.getLeft();
                int i5 = this.y;
                i = left < i5 ? i5 - width : i5 + width;
                z = true;
            } else {
                i = this.y;
                z = false;
            }
            if (SwipeDismissBehavior.this.y.vl(i, view.getTop())) {
                ut.nf(view, new gv(view, z));
            } else {
                if (!z || (znVar = SwipeDismissBehavior.this.n3) == null) {
                    return;
                }
                znVar.y(view);
            }
        }

        @Override // k.zn.AbstractC0112zn
        public boolean tl(View view, int i) {
            int i5 = this.n3;
            return (i5 == -1 || i5 == i) && SwipeDismissBehavior.this.ta(view);
        }

        public final boolean wz(@NonNull View view, float f3) {
            if (f3 == 0.0f) {
                return Math.abs(view.getLeft() - this.y) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f2511fb);
            }
            boolean z = ut.ta(view) == 1;
            int i = SwipeDismissBehavior.this.f2509a;
            if (i == 2) {
                return true;
            }
            if (i == 0) {
                if (z) {
                    if (f3 >= 0.0f) {
                        return false;
                    }
                } else if (f3 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i != 1) {
                return false;
            }
            if (z) {
                if (f3 <= 0.0f) {
                    return false;
                }
            } else if (f3 >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // k.zn.AbstractC0112zn
        public int y(@NonNull View view, int i, int i5) {
            int width;
            int width2;
            int width3;
            boolean z = ut.ta(view) == 1;
            int i8 = SwipeDismissBehavior.this.f2509a;
            if (i8 == 0) {
                if (z) {
                    width = this.y - view.getWidth();
                    width2 = this.y;
                } else {
                    width = this.y;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i8 != 1) {
                width = this.y - view.getWidth();
                width2 = view.getWidth() + this.y;
            } else if (z) {
                width = this.y;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.y - view.getWidth();
                width2 = this.y;
            }
            return SwipeDismissBehavior.z6(width, i, width2);
        }
    }

    public interface zn {
        void n3(int i);

        void y(View view);
    }

    public static float d(float f3, float f4, float f5) {
        return Math.min(Math.max(f3, f4), f5);
    }

    public static float ud(float f3, float f4, float f5) {
        return (f5 - f3) / (f4 - f3);
    }

    public static int z6(int i, int i5, int i8) {
        return Math.min(Math.max(i, i5), i8);
    }

    public void a8(float f3) {
        this.f2510c5 = d(0.0f, f3, 1.0f);
    }

    public void b(float f3) {
        this.f2514s = d(0.0f, f3, 1.0f);
    }

    public final void ej(ViewGroup viewGroup) {
        if (this.y == null) {
            this.y = this.f2515v ? k.zn.wz(viewGroup, this.f2512gv, this.f2513i9) : k.zn.xc(viewGroup, this.f2513i9);
        }
    }

    public boolean f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v6, @NonNull MotionEvent motionEvent) {
        boolean zFh = this.zn;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zFh = coordinatorLayout.fh(v6, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.zn = zFh;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.zn = false;
        }
        if (!zFh) {
            return false;
        }
        ej(coordinatorLayout);
        return this.y.hw(motionEvent);
    }

    public void k5(int i) {
        this.f2509a = i;
    }

    public boolean mg(CoordinatorLayout coordinatorLayout, V v6, MotionEvent motionEvent) {
        k.zn znVar = this.y;
        if (znVar == null) {
            return false;
        }
        znVar.d(motionEvent);
        return true;
    }

    public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v6, int i) {
        boolean zT = super.t(coordinatorLayout, v6, i);
        if (ut.rz(v6) == 0) {
            ut.o0(v6, 1);
            yt(v6);
        }
        return zT;
    }

    public boolean ta(@NonNull View view) {
        return true;
    }

    public void x(@Nullable zn znVar) {
        this.n3 = znVar;
    }

    public final void yt(View view) {
        ut.e(view, 1048576);
        if (ta(view)) {
            ut.ap(view, ud.y.n, (CharSequence) null, new n3());
        }
    }
}
