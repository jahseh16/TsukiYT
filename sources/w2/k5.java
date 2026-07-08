package w2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.R$id;
import w2.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class k5 extends f {
    public static final String[] dm = {"android:visibility:visibility", "android:visibility:parent"};
    public int xg = 3;

    public class y extends t {
        public final /* synthetic */ View n3;
        public final /* synthetic */ ViewGroup y;
        public final /* synthetic */ View zn;

        public y(ViewGroup viewGroup, View view, View view2) {
            this.y = viewGroup;
            this.n3 = view;
            this.zn = view2;
        }

        @Override // w2.f.fb
        public void n3(@NonNull f fVar) {
            this.zn.setTag(R$id.y, null);
            i4.y(this.y).gv(this.n3);
            fVar.oz(this);
        }

        @Override // w2.t, w2.f.fb
        public void v(@NonNull f fVar) {
            if (this.n3.getParent() == null) {
                i4.y(this.y).zn(this.n3);
            } else {
                k5.this.cancel();
            }
        }

        @Override // w2.t, w2.f.fb
        public void y(@NonNull f fVar) {
            i4.y(this.y).gv(this.n3);
        }
    }

    public static class zn {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ViewGroup f8989a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f8990gv;
        public boolean n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ViewGroup f8991v;
        public boolean y;
        public int zn;
    }

    private void eb(mt mtVar) {
        mtVar.y.put("android:visibility:visibility", Integer.valueOf(mtVar.n3.getVisibility()));
        mtVar.y.put("android:visibility:parent", mtVar.n3.getParent());
        int[] iArr = new int[2];
        mtVar.n3.getLocationOnScreen(iArr);
        mtVar.y.put("android:visibility:screenLocation", iArr);
    }

    @Override // w2.f
    public boolean a8(@Nullable mt mtVar, @Nullable mt mtVar2) {
        if (mtVar == null && mtVar2 == null) {
            return false;
        }
        if (mtVar != null && mtVar2 != null && mtVar2.y.containsKey("android:visibility:visibility") != mtVar.y.containsKey("android:visibility:visibility")) {
            return false;
        }
        zn znVarLc = lc(mtVar, mtVar2);
        if (znVarLc.y) {
            return znVarLc.zn == 0 || znVarLc.f8990gv == 0;
        }
        return false;
    }

    public void ap(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.xg = i;
    }

    @Nullable
    public abstract Animator e(ViewGroup viewGroup, View view, mt mtVar, mt mtVar2);

    @Override // w2.f
    @Nullable
    public String[] ej() {
        return dm;
    }

    @Override // w2.f
    public void f(@NonNull mt mtVar) {
        eb(mtVar);
    }

    public final zn lc(mt mtVar, mt mtVar2) {
        zn znVar = new zn();
        znVar.y = false;
        znVar.n3 = false;
        if (mtVar == null || !mtVar.y.containsKey("android:visibility:visibility")) {
            znVar.zn = -1;
            znVar.f8991v = null;
        } else {
            znVar.zn = ((Integer) mtVar.y.get("android:visibility:visibility")).intValue();
            znVar.f8991v = (ViewGroup) mtVar.y.get("android:visibility:parent");
        }
        if (mtVar2 == null || !mtVar2.y.containsKey("android:visibility:visibility")) {
            znVar.f8990gv = -1;
            znVar.f8989a = null;
        } else {
            znVar.f8990gv = ((Integer) mtVar2.y.get("android:visibility:visibility")).intValue();
            znVar.f8989a = (ViewGroup) mtVar2.y.get("android:visibility:parent");
        }
        if (mtVar != null && mtVar2 != null) {
            int i = znVar.zn;
            int i5 = znVar.f8990gv;
            if (i == i5 && znVar.f8991v == znVar.f8989a) {
                return znVar;
            }
            if (i != i5) {
                if (i == 0) {
                    znVar.n3 = false;
                    znVar.y = true;
                } else if (i5 == 0) {
                    znVar.n3 = true;
                    znVar.y = true;
                }
            } else if (znVar.f8989a == null) {
                znVar.n3 = false;
                znVar.y = true;
            } else if (znVar.f8991v == null) {
                znVar.n3 = true;
                znVar.y = true;
            }
        } else if (mtVar == null && znVar.f8990gv == 0) {
            znVar.n3 = true;
            znVar.y = true;
        } else if (mtVar2 == null && znVar.zn == 0) {
            znVar.n3 = false;
            znVar.y = true;
        }
        return znVar;
    }

    @Nullable
    public abstract Animator nf(ViewGroup viewGroup, View view, mt mtVar, mt mtVar2);

    @Nullable
    public Animator ra(ViewGroup viewGroup, mt mtVar, int i, mt mtVar2, int i5) {
        if ((this.xg & 1) != 1 || mtVar2 == null) {
            return null;
        }
        if (mtVar == null) {
            View view = (View) mtVar2.n3.getParent();
            if (lc(f3(view, false), ud(view, false)).y) {
                return null;
            }
        }
        return nf(viewGroup, mtVar2.n3, mtVar, mtVar2);
    }

    @Override // w2.f
    public void s(@NonNull mt mtVar) {
        eb(mtVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[PHI: r2
      0x0069: PHI (r2v3 android.view.View) = 
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v6 android.view.View)
     binds: [B:26:0x003e, B:31:0x004d, B:37:0x0076, B:39:0x0079, B:41:0x007f, B:43:0x0083, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator s8(android.view.ViewGroup r11, w2.mt r12, int r13, w2.mt r14, int r15) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.k5.s8(android.view.ViewGroup, w2.mt, int, w2.mt, int):android.animation.Animator");
    }

    @Override // w2.f
    @Nullable
    public Animator xc(@NonNull ViewGroup viewGroup, @Nullable mt mtVar, @Nullable mt mtVar2) {
        zn znVarLc = lc(mtVar, mtVar2);
        if (!znVarLc.y) {
            return null;
        }
        if (znVarLc.f8991v == null && znVarLc.f8989a == null) {
            return null;
        }
        return znVarLc.n3 ? ra(viewGroup, mtVar, znVarLc.zn, mtVar2, znVarLc.f8990gv) : s8(viewGroup, mtVar, znVarLc.zn, mtVar2, znVarLc.f8990gv);
    }

    public static class n3 extends AnimatorListenerAdapter implements f.fb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8985a = false;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final boolean f8986gv;
        public final int n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f8987v;
        public final View y;
        public final ViewGroup zn;

        public n3(View view, int i, boolean z) {
            this.y = view;
            this.n3 = i;
            this.zn = (ViewGroup) view.getParent();
            this.f8986gv = z;
            fb(true);
        }

        public final void a() {
            if (!this.f8985a) {
                c.s(this.y, this.n3);
                ViewGroup viewGroup = this.zn;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            fb(false);
        }

        public final void fb(boolean z) {
            ViewGroup viewGroup;
            if (!this.f8986gv || this.f8987v == z || (viewGroup = this.zn) == null) {
                return;
            }
            this.f8987v = z;
            i4.zn(viewGroup, z);
        }

        @Override // w2.f.fb
        public void n3(@NonNull f fVar) {
            a();
            fVar.oz(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8985a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f8985a) {
                return;
            }
            c.s(this.y, this.n3);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f8985a) {
                return;
            }
            c.s(this.y, 0);
        }

        @Override // w2.f.fb
        public void v(@NonNull f fVar) {
            fb(true);
        }

        @Override // w2.f.fb
        public void y(@NonNull f fVar) {
            fb(false);
        }

        @Override // w2.f.fb
        public void gv(@NonNull f fVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // w2.f.fb
        public void zn(@NonNull f fVar) {
        }
    }
}
