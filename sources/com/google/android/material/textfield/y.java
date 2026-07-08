package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public class y extends b3.zn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout.a f2938a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public ValueAnimator f2939c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final TextInputLayout.fb f2940fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final TextWatcher f2941gv;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AnimatorSet f2942s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View.OnFocusChangeListener f2943v;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            y.this.y.setEndIconVisible(true);
        }
    }

    public class c5 implements ValueAnimator.AnimatorUpdateListener {
        public c5() {
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
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            y.this.zn.setScaleX(fFloatValue);
            y.this.zn.setScaleY(fFloatValue);
        }
    }

    public class fb extends AnimatorListenerAdapter {
        public fb() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            y.this.y.setEndIconVisible(false);
        }
    }

    public class gv implements TextInputLayout.fb {

        /* JADX INFO: renamed from: com.google.android.material.textfield.y$gv$y, reason: collision with other inner class name */
        public class RunnableC0073y implements Runnable {
            public final /* synthetic */ EditText y;

            public RunnableC0073y(EditText editText) {
                this.y = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.y.removeTextChangedListener(y.this.f2941gv);
            }
        }

        public gv() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.fb
        public void y(@NonNull TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 2) {
                return;
            }
            editText.post(new RunnableC0073y(editText));
            if (editText.getOnFocusChangeListener() == y.this.f2943v) {
                editText.setOnFocusChangeListener(null);
            }
        }
    }

    public class n3 implements View.OnFocusChangeListener {
        public n3() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            y.this.c5(!TextUtils.isEmpty(((EditText) view).getText()) && z);
        }
    }

    public class s implements ValueAnimator.AnimatorUpdateListener {
        public s() {
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
            y.this.zn.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class v implements View.OnClickListener {
        public v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = y.this.y.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            y.this.y.ut();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.y$y, reason: collision with other inner class name */
    public class C0074y implements TextWatcher {
        public C0074y() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NonNull Editable editable) {
            if (y.this.y.getSuffixText() != null) {
                return;
            }
            y yVar = y.this;
            yVar.c5(yVar.y.hasFocus() && y.t(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i5, int i8) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i5, int i8) {
        }
    }

    public class zn implements TextInputLayout.a {
        public zn() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.a
        public void y(@NonNull TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.hasFocus() && y.t(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(y.this.f2943v);
            editText.removeTextChangedListener(y.this.f2941gv);
            editText.addTextChangedListener(y.this.f2941gv);
        }
    }

    public y(@NonNull TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f2941gv = new C0074y();
        this.f2943v = new n3();
        this.f2938a = new zn();
        this.f2940fb = new gv();
    }

    public static boolean t(@NonNull Editable editable) {
        return editable.length() > 0;
    }

    public final void c5(boolean z) {
        boolean z5 = this.y.x() == z;
        if (z && !this.f2942s.isRunning()) {
            this.f2939c5.cancel();
            this.f2942s.start();
            if (z5) {
                this.f2942s.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f2942s.cancel();
        this.f2939c5.start();
        if (z5) {
            this.f2939c5.end();
        }
    }

    public final ValueAnimator f() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(t1.y.f8180gv);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new c5());
        return valueAnimatorOfFloat;
    }

    public final ValueAnimator i9(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(t1.y.y);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new s());
        return valueAnimatorOfFloat;
    }

    public final void tl() {
        ValueAnimator valueAnimatorF = f();
        ValueAnimator valueAnimatorI9 = i9(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2942s = animatorSet;
        animatorSet.playTogether(valueAnimatorF, valueAnimatorI9);
        this.f2942s.addListener(new a());
        ValueAnimator valueAnimatorI92 = i9(1.0f, 0.0f);
        this.f2939c5 = valueAnimatorI92;
        valueAnimatorI92.addListener(new fb());
    }

    @Override // b3.zn
    public void y() {
        this.y.setEndIconDrawable(f.n3.gv(this.n3, R$drawable.f2225a));
        TextInputLayout textInputLayout = this.y;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R$string.f2289v));
        this.y.setEndIconOnClickListener(new v());
        this.y.v(this.f2938a);
        this.y.a(this.f2940fb);
        tl();
    }

    @Override // b3.zn
    public void zn(boolean z) {
        if (this.y.getSuffixText() == null) {
            return;
        }
        c5(z);
    }
}
