package com.google.android.material.textfield;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;
import com.google.android.material.textfield.TextInputLayout;
import o.ud;
import qn.ut;
import y2.f;

/* JADX INFO: loaded from: classes.dex */
public class n3 extends b3.zn {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final boolean f2921p = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout.v f2922a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public boolean f2923c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f2924f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final TextInputLayout.a f2925fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final TextWatcher f2926gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public boolean f2927i9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @SuppressLint({"ClickableViewAccessibility"})
    public final TextInputLayout.fb f2928s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public StateListDrawable f2929t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public y2.fb f2930tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View.OnFocusChangeListener f2931v;
    public ValueAnimator w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    @Nullable
    public AccessibilityManager f2932wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public ValueAnimator f2933xc;

    public class a implements TextInputLayout.fb {

        public class y implements Runnable {
            public final /* synthetic */ AutoCompleteTextView y;

            public y(AutoCompleteTextView autoCompleteTextView) {
                this.y = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.y.removeTextChangedListener(n3.this.f2926gv);
            }
        }

        public a() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.fb
        public void y(@NonNull TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i != 3) {
                return;
            }
            autoCompleteTextView.post(new y(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == n3.this.f2931v) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (n3.f2921p) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    public class c5 implements AutoCompleteTextView.OnDismissListener {
        public c5() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            n3.this.f2923c5 = true;
            n3.this.f2924f = System.currentTimeMillis();
            n3.this.ta(false);
        }
    }

    public class fb implements View.OnClickListener {
        public fb() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n3.this.ej((AutoCompleteTextView) n3.this.y.getEditText());
        }
    }

    public class gv extends TextInputLayout.v {
        public gv(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.v
        public void fb(View view, @NonNull ud udVar) {
            super.fb(view, udVar);
            if (!n3.mg(n3.this.y.getEditText())) {
                udVar.e(Spinner.class.getName());
            }
            if (udVar.q9()) {
                udVar.bk((CharSequence) null);
            }
        }

        public void s(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.s(view, accessibilityEvent);
            AutoCompleteTextView autoCompleteTextViewN = n3.n(n3.this.y.getEditText());
            if (accessibilityEvent.getEventType() == 1 && n3.this.f2932wz.isTouchExplorationEnabled() && !n3.mg(n3.this.y.getEditText())) {
                n3.this.ej(autoCompleteTextViewN);
            }
        }
    }

    public class i9 extends AnimatorListenerAdapter {
        public i9() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            n3 n3Var = n3.this;
            n3Var.zn.setChecked(n3Var.f2927i9);
            n3.this.w.start();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.n3$n3, reason: collision with other inner class name */
    public class C0071n3 implements ValueAnimator.AnimatorUpdateListener {
        public C0071n3() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            n3.this.zn.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class s implements View.OnTouchListener {
        public final /* synthetic */ AutoCompleteTextView y;

        public s(AutoCompleteTextView autoCompleteTextView) {
            this.y = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (n3.this.rz()) {
                    n3.this.f2923c5 = false;
                }
                n3.this.ej(this.y);
            }
            return false;
        }
    }

    public class v implements TextInputLayout.a {
        public v() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.a
        public void y(@NonNull TextInputLayout textInputLayout) {
            AutoCompleteTextView autoCompleteTextViewN = n3.n(textInputLayout.getEditText());
            n3.this.d(autoCompleteTextViewN);
            n3.this.x4(autoCompleteTextViewN);
            n3.this.z6(autoCompleteTextViewN);
            autoCompleteTextViewN.setThreshold(0);
            autoCompleteTextViewN.removeTextChangedListener(n3.this.f2926gv);
            autoCompleteTextViewN.addTextChangedListener(n3.this.f2926gv);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!n3.mg(autoCompleteTextViewN)) {
                ut.o0(n3.this.zn, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(n3.this.f2922a);
            textInputLayout.setEndIconVisible(true);
        }
    }

    public class y extends o2.i9 {

        /* JADX INFO: renamed from: com.google.android.material.textfield.n3$y$y, reason: collision with other inner class name */
        public class RunnableC0072y implements Runnable {
            public final /* synthetic */ AutoCompleteTextView y;

            public RunnableC0072y(AutoCompleteTextView autoCompleteTextView) {
                this.y = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zIsPopupShowing = this.y.isPopupShowing();
                n3.this.ta(zIsPopupShowing);
                n3.this.f2923c5 = zIsPopupShowing;
            }
        }

        public y() {
        }

        @Override // o2.i9, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView autoCompleteTextViewN = n3.n(n3.this.y.getEditText());
            if (n3.this.f2932wz.isTouchExplorationEnabled() && n3.mg(autoCompleteTextViewN) && !n3.this.zn.hasFocus()) {
                autoCompleteTextViewN.dismissDropDown();
            }
            autoCompleteTextViewN.post(new RunnableC0072y(autoCompleteTextViewN));
        }
    }

    public class zn implements View.OnFocusChangeListener {
        public zn() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            n3.this.y.setEndIconActivated(z);
            if (z) {
                return;
            }
            n3.this.ta(false);
            n3.this.f2923c5 = false;
        }
    }

    public n3(@NonNull TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f2926gv = new y();
        this.f2931v = new zn();
        this.f2922a = new gv(this.y);
        this.f2925fb = new v();
        this.f2928s = new a();
        this.f2923c5 = false;
        this.f2927i9 = false;
        this.f2924f = Long.MAX_VALUE;
    }

    private void fh() {
        this.w = c(67, 0.0f, 1.0f);
        ValueAnimator valueAnimatorC = c(50, 1.0f, 0.0f);
        this.f2933xc = valueAnimatorC;
        valueAnimatorC.addListener(new i9());
    }

    public static boolean mg(@NonNull EditText editText) {
        return editText.getKeyListener() != null;
    }

    @NonNull
    public static AutoCompleteTextView n(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final ValueAnimator c(int i, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(t1.y.y);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addUpdateListener(new C0071n3());
        return valueAnimatorOfFloat;
    }

    public final void d(@NonNull AutoCompleteTextView autoCompleteTextView) {
        if (f2921p) {
            int boxBackgroundMode = this.y.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f2930tl);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f2929t);
            }
        }
    }

    public final y2.fb d0(float f3, float f4, float f5, int i) {
        f fVarTl = f.y().fh(f3).d(f3).z(f4).f3(f4).tl();
        y2.fb fbVarTl = y2.fb.tl(this.n3, f5);
        fbVarTl.setShapeAppearanceModel(fVarTl);
        fbVarTl.en(0, i, 0, i);
        return fbVarTl;
    }

    public final void ej(@Nullable AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (rz()) {
            this.f2923c5 = false;
        }
        if (this.f2923c5) {
            this.f2923c5 = false;
            return;
        }
        if (f2921p) {
            ta(!this.f2927i9);
        } else {
            this.f2927i9 = !this.f2927i9;
            this.zn.toggle();
        }
        if (!this.f2927i9) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    public final void f3(@NonNull AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, @NonNull y2.fb fbVar) {
        LayerDrawable layerDrawable;
        int iGv = g2.y.gv(autoCompleteTextView, R$attr.f2181wz);
        y2.fb fbVar2 = new y2.fb(fbVar.rz());
        int iS = g2.y.s(i, iGv, 0.1f);
        fbVar2.k(new ColorStateList(iArr, new int[]{iS, 0}));
        if (f2921p) {
            fbVar2.setTint(iGv);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iS, iGv});
            y2.fb fbVar3 = new y2.fb(fbVar.rz());
            fbVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, fbVar2, fbVar3), fbVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{fbVar2, fbVar});
        }
        ut.u0(autoCompleteTextView, layerDrawable);
    }

    @Override // b3.zn
    public boolean gv() {
        return true;
    }

    public final void i4(@NonNull AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, @NonNull y2.fb fbVar) {
        int boxBackgroundColor = this.y.getBoxBackgroundColor();
        int[] iArr2 = {g2.y.s(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f2921p) {
            ut.u0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), fbVar, fbVar));
            return;
        }
        y2.fb fbVar2 = new y2.fb(fbVar.rz());
        fbVar2.k(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{fbVar, fbVar2});
        int iA8 = ut.a8(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int iUd = ut.ud(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        ut.u0(autoCompleteTextView, layerDrawable);
        ut.cy(autoCompleteTextView, iA8, paddingTop, iUd, paddingBottom);
    }

    @Override // b3.zn
    public boolean n3(int i) {
        return i != 0;
    }

    public final boolean rz() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f2924f;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    public final void ta(boolean z) {
        if (this.f2927i9 != z) {
            this.f2927i9 = z;
            this.w.cancel();
            this.f2933xc.start();
        }
    }

    public final void x4(@NonNull AutoCompleteTextView autoCompleteTextView) {
        if (mg(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.y.getBoxBackgroundMode();
        y2.fb boxBackground = this.y.getBoxBackground();
        int iGv = g2.y.gv(autoCompleteTextView, R$attr.f2170i9);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            f3(autoCompleteTextView, iGv, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            i4(autoCompleteTextView, iGv, iArr, boxBackground);
        }
    }

    @Override // b3.zn
    public void y() {
        float dimensionPixelOffset = this.n3.getResources().getDimensionPixelOffset(R$dimen.en);
        float dimensionPixelOffset2 = this.n3.getResources().getDimensionPixelOffset(R$dimen.o);
        int dimensionPixelOffset3 = this.n3.getResources().getDimensionPixelOffset(R$dimen.j);
        y2.fb fbVarD0 = d0(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        y2.fb fbVarD02 = d0(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f2930tl = fbVarD0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f2929t = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, fbVarD0);
        this.f2929t.addState(new int[0], fbVarD02);
        this.y.setEndIconDrawable(f.n3.gv(this.n3, f2921p ? R$drawable.f2227gv : R$drawable.f2228v));
        TextInputLayout textInputLayout = this.y;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R$string.f2281fb));
        this.y.setEndIconOnClickListener(new fb());
        this.y.v(this.f2925fb);
        this.y.a(this.f2928s);
        fh();
        this.f2932wz = (AccessibilityManager) this.n3.getSystemService("accessibility");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void z6(@NonNull AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new s(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f2931v);
        if (f2921p) {
            autoCompleteTextView.setOnDismissListener(new c5());
        }
    }
}
