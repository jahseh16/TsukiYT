package w2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public class zn extends w2.f {
    public static final String[] o4 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<Drawable, PointF> rs = new n3(PointF.class, "boundsOrigin");

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    public static final Property<f, PointF> f8999eb = new C0191zn(PointF.class, "topLeft");

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    public static final Property<f, PointF> f9000lc = new gv(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: nf, reason: collision with root package name */
    public static final Property<View, PointF> f9001nf = new v(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public static final Property<View, PointF> f9002ra = new a(PointF.class, "topLeft");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Property<View, PointF> f8998e = new fb(PointF.class, "position");
    public static w2.c5 s8 = new w2.c5();
    public int[] xg = new int[2];
    public boolean dm = false;
    public boolean ct = false;

    public class a extends Property<View, PointF> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            c.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }
    }

    public class c5 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f9003a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ int f9004fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final /* synthetic */ int f9005gv;
        public final /* synthetic */ View n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f9007v;
        public boolean y;
        public final /* synthetic */ Rect zn;

        public c5(View view, Rect rect, int i, int i5, int i8, int i10) {
            this.n3 = view;
            this.zn = rect;
            this.f9005gv = i;
            this.f9007v = i5;
            this.f9003a = i8;
            this.f9004fb = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.y = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.y) {
                return;
            }
            ut.tg(this.n3, this.zn);
            c.a(this.n3, this.f9005gv, this.f9007v, this.f9003a, this.f9004fb);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9008a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f9009fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f9010gv;
        public int n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public View f9011v;
        public int y;
        public int zn;

        public f(View view) {
            this.f9011v = view;
        }

        public final void n3() {
            c.a(this.f9011v, this.y, this.n3, this.zn, this.f9010gv);
            this.f9008a = 0;
            this.f9009fb = 0;
        }

        public void y(PointF pointF) {
            this.zn = Math.round(pointF.x);
            this.f9010gv = Math.round(pointF.y);
            int i = this.f9009fb + 1;
            this.f9009fb = i;
            if (this.f9008a == i) {
                n3();
            }
        }

        public void zn(PointF pointF) {
            this.y = Math.round(pointF.x);
            this.n3 = Math.round(pointF.y);
            int i = this.f9008a + 1;
            this.f9008a = i;
            if (i == this.f9009fb) {
                n3();
            }
        }
    }

    public class fb extends Property<View, PointF> {
        public fb(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            c.a(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }
    }

    public class gv extends Property<f, PointF> {
        public gv(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public void set(f fVar, PointF pointF) {
            fVar.y(pointF);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public PointF get(f fVar) {
            return null;
        }
    }

    public class i9 extends t {
        public final /* synthetic */ ViewGroup n3;
        public boolean y = false;

        public i9(ViewGroup viewGroup) {
            this.n3 = viewGroup;
        }

        @Override // w2.t, w2.f.fb
        public void gv(@NonNull w2.f fVar) {
            i4.zn(this.n3, false);
            this.y = true;
        }

        @Override // w2.f.fb
        public void n3(@NonNull w2.f fVar) {
            if (!this.y) {
                i4.zn(this.n3, false);
            }
            fVar.oz(this);
        }

        @Override // w2.t, w2.f.fb
        public void v(@NonNull w2.f fVar) {
            i4.zn(this.n3, true);
        }

        @Override // w2.t, w2.f.fb
        public void y(@NonNull w2.f fVar) {
            i4.zn(this.n3, false);
        }
    }

    public class n3 extends Property<Drawable, PointF> {
        public Rect y;

        public n3(Class cls, String str) {
            super(cls, str);
            this.y = new Rect();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.y);
            this.y.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.y);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.y);
            Rect rect = this.y;
            return new PointF(rect.left, rect.top);
        }
    }

    public class s extends AnimatorListenerAdapter {
        private f mViewBounds;
        public final /* synthetic */ f y;

        public s(f fVar) {
            this.y = fVar;
            this.mViewBounds = fVar;
        }
    }

    public class v extends Property<View, PointF> {
        public v(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            c.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }
    }

    public class y extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final /* synthetic */ float f9012gv;
        public final /* synthetic */ BitmapDrawable n3;
        public final /* synthetic */ ViewGroup y;
        public final /* synthetic */ View zn;

        public y(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f3) {
            this.y = viewGroup;
            this.n3 = bitmapDrawable;
            this.zn = view;
            this.f9012gv = f3;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c.n3(this.y).n3(this.n3);
            c.fb(this.zn, this.f9012gv);
        }
    }

    /* JADX INFO: renamed from: w2.zn$zn, reason: collision with other inner class name */
    public class C0191zn extends Property<f, PointF> {
        public C0191zn(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public void set(f fVar, PointF pointF) {
            fVar.zn(pointF);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public PointF get(f fVar) {
            return null;
        }
    }

    public final void eb(mt mtVar) {
        View view = mtVar.n3;
        if (!ut.q9(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        mtVar.y.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        mtVar.y.put("android:changeBounds:parent", mtVar.n3.getParent());
        if (this.ct) {
            mtVar.n3.getLocationInWindow(this.xg);
            mtVar.y.put("android:changeBounds:windowX", Integer.valueOf(this.xg[0]));
            mtVar.y.put("android:changeBounds:windowY", Integer.valueOf(this.xg[1]));
        }
        if (this.dm) {
            mtVar.y.put("android:changeBounds:clip", ut.i4(view));
        }
    }

    @Override // w2.f
    @NonNull
    public String[] ej() {
        return o4;
    }

    @Override // w2.f
    public void f(@NonNull mt mtVar) {
        eb(mtVar);
    }

    public final boolean lc(View view, View view2) {
        if (!this.ct) {
            return true;
        }
        mt mtVarF3 = f3(view, true);
        if (mtVarF3 == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == mtVarF3.n3) {
            return true;
        }
        return false;
    }

    @Override // w2.f
    public void s(@NonNull mt mtVar) {
        eb(mtVar);
    }

    @Override // w2.f
    @Nullable
    public Animator xc(@NonNull ViewGroup viewGroup, @Nullable mt mtVar, @Nullable mt mtVar2) {
        int i;
        View view;
        int i5;
        ObjectAnimator objectAnimator;
        Animator animatorZn;
        if (mtVar == null || mtVar2 == null) {
            return null;
        }
        Map<String, Object> map = mtVar.y;
        Map<String, Object> map2 = mtVar2.y;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = mtVar2.n3;
        if (!lc(viewGroup2, viewGroup3)) {
            int iIntValue = ((Integer) mtVar.y.get("android:changeBounds:windowX")).intValue();
            int iIntValue2 = ((Integer) mtVar.y.get("android:changeBounds:windowY")).intValue();
            int iIntValue3 = ((Integer) mtVar2.y.get("android:changeBounds:windowX")).intValue();
            int iIntValue4 = ((Integer) mtVar2.y.get("android:changeBounds:windowY")).intValue();
            if (iIntValue == iIntValue3 && iIntValue2 == iIntValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.xg);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(bitmapCreateBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            float fZn = c.zn(view2);
            c.fb(view2, 0.0f);
            c.n3(viewGroup).y(bitmapDrawable);
            w2.fb fbVarC = c();
            int[] iArr = this.xg;
            int i8 = iArr[0];
            int i10 = iArr[1];
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, w2.s.y(rs, fbVarC.y(iIntValue - i8, iIntValue2 - i10, iIntValue3 - i8, iIntValue4 - i10)));
            objectAnimatorOfPropertyValuesHolder.addListener(new y(viewGroup, bitmapDrawable, view2, fZn));
            return objectAnimatorOfPropertyValuesHolder;
        }
        Rect rect = (Rect) mtVar.y.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) mtVar2.y.get("android:changeBounds:bounds");
        int i11 = rect.left;
        int i12 = rect2.left;
        int i13 = rect.top;
        int i14 = rect2.top;
        int i15 = rect.right;
        int i16 = rect2.right;
        int i17 = rect.bottom;
        int i18 = rect2.bottom;
        int i19 = i15 - i11;
        int i20 = i17 - i13;
        int i21 = i16 - i12;
        int i22 = i18 - i14;
        Rect rect3 = (Rect) mtVar.y.get("android:changeBounds:clip");
        Rect rect4 = (Rect) mtVar2.y.get("android:changeBounds:clip");
        if ((i19 == 0 || i20 == 0) && (i21 == 0 || i22 == 0)) {
            i = 0;
        } else {
            i = (i11 == i12 && i13 == i14) ? 0 : 1;
            if (i15 != i16 || i17 != i18) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        if (i <= 0) {
            return null;
        }
        if (this.dm) {
            view = view2;
            c.a(view, i11, i13, Math.max(i19, i21) + i11, Math.max(i20, i22) + i13);
            ObjectAnimator objectAnimatorY = (i11 == i12 && i13 == i14) ? null : w2.a.y(view, f8998e, c().y(i11, i13, i12, i14));
            if (rect3 == null) {
                i5 = 0;
                rect3 = new Rect(0, 0, i19, i20);
            } else {
                i5 = 0;
            }
            Rect rect5 = rect4 == null ? new Rect(i5, i5, i21, i22) : rect4;
            if (rect3.equals(rect5)) {
                objectAnimator = null;
            } else {
                ut.tg(view, rect3);
                w2.c5 c5Var = s8;
                Object[] objArr = new Object[2];
                objArr[i5] = rect3;
                objArr[1] = rect5;
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", c5Var, objArr);
                objectAnimatorOfObject.addListener(new c5(view, rect4, i12, i14, i16, i18));
                objectAnimator = objectAnimatorOfObject;
            }
            animatorZn = p.zn(objectAnimatorY, objectAnimator);
        } else {
            view = view2;
            c.a(view, i11, i13, i15, i17);
            if (i != 2) {
                animatorZn = (i11 == i12 && i13 == i14) ? w2.a.y(view, f9001nf, c().y(i15, i17, i16, i18)) : w2.a.y(view, f9002ra, c().y(i11, i13, i12, i14));
            } else if (i19 == i21 && i20 == i22) {
                animatorZn = w2.a.y(view, f8998e, c().y(i11, i13, i12, i14));
            } else {
                f fVar = new f(view);
                ObjectAnimator objectAnimatorY2 = w2.a.y(fVar, f8999eb, c().y(i11, i13, i12, i14));
                ObjectAnimator objectAnimatorY3 = w2.a.y(fVar, f9000lc, c().y(i15, i17, i16, i18));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorY2, objectAnimatorY3);
                animatorSet.addListener(new s(fVar));
                animatorZn = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            i4.zn(viewGroup4, true);
            n3(new i9(viewGroup4));
        }
        return animatorZn;
    }
}
