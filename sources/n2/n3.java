package n2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$color;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import j5.s;
import java.util.ArrayList;
import y2.f;
import y2.fb;

/* JADX INFO: loaded from: classes.dex */
public class n3 extends com.google.android.material.floatingactionbutton.y {

    public static class y extends fb {
        public y(f fVar) {
            super(fVar);
        }

        @Override // y2.fb, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public n3(FloatingActionButton floatingActionButton, v2.n3 n3Var) {
        super(floatingActionButton, n3Var);
    }

    @Override // com.google.android.material.floatingactionbutton.y
    public boolean a8() {
        return false;
    }

    @NonNull
    public final Animator eb(float f3, float f4) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.n, "elevation", f3).setDuration(0L)).with(ObjectAnimator.ofFloat(this.n, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f4).setDuration(100L));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.y.f2731d);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.y
    public boolean f7() {
        return this.c.zn() || !jz();
    }

    @Override // com.google.android.material.floatingactionbutton.y
    public void fh() {
        dm();
    }

    @Override // com.google.android.material.floatingactionbutton.y
    public void i4(ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable layerDrawable;
        fb fbVarLc = lc();
        this.n3 = fbVarLc;
        fbVarLc.setTintList(colorStateList);
        if (mode != null) {
            this.n3.setTintMode(mode);
        }
        this.n3.k5(this.n.getContext());
        if (i > 0) {
            this.f2741gv = rs(i, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) s.fb(this.f2741gv), (Drawable) s.fb(this.n3)});
        } else {
            this.f2741gv = null;
            layerDrawable = this.n3;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(u2.n3.gv(colorStateList2), layerDrawable, null);
        this.zn = rippleDrawable;
        this.f2751v = rippleDrawable;
    }

    @NonNull
    public fb lc() {
        return new y((f) s.fb(this.y));
    }

    @Override // com.google.android.material.floatingactionbutton.y
    public void mg(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (!this.n.isEnabled()) {
                this.n.setElevation(0.0f);
                this.n.setTranslationZ(0.0f);
                return;
            }
            this.n.setElevation(this.f2747s);
            if (this.n.isPressed()) {
                this.n.setTranslationZ(this.f2743i9);
            } else if (this.n.isFocused() || this.n.isHovered()) {
                this.n.setTranslationZ(this.f2737c5);
            } else {
                this.n.setTranslationZ(0.0f);
            }
        }
    }

    @Override // com.google.android.material.floatingactionbutton.y
    public void mt(@NonNull Rect rect) {
        if (this.c.zn()) {
            super.mt(rect);
        } else if (jz()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f2739f - this.n.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.y
    public void oz(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.zn;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(u2.n3.gv(colorStateList));
        } else {
            super.oz(colorStateList);
        }
    }

    @NonNull
    public n2.y rs(int i, ColorStateList colorStateList) {
        Context context = this.n.getContext();
        n2.y yVar = new n2.y((f) s.fb(this.y));
        yVar.v(d.y.getColor(context, R$color.f2192v), d.y.getColor(context, R$color.f2189gv), d.y.getColor(context, R$color.n3), d.y.getColor(context, R$color.zn));
        yVar.gv(i);
        yVar.zn(colorStateList);
        return yVar;
    }

    @Override // com.google.android.material.floatingactionbutton.y
    public void ta(float f3, float f4, float f5) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.n.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.y.f2735z6, eb(f3, f5));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.y.f2732ej, eb(f3, f4));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.y.f2733ud, eb(f3, f4));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.y.f2729a8, eb(f3, f4));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.n, "elevation", f3).setDuration(0L));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.n;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.n, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.y.f2731d);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.y.f2734x, animatorSet);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.y.f2730b, eb(0.0f, 0.0f));
            this.n.setStateListAnimator(stateListAnimator);
        }
        if (f7()) {
            dm();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.y
    public float tl() {
        return this.n.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.y
    public void c() {
    }

    @Override // com.google.android.material.floatingactionbutton.y
    public void y5() {
    }
}
