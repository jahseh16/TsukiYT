package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.CheckableImageButton;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.ud;
import o2.t;
import qn.co;
import qn.ut;
import ut.wz;
import w.ad;
import w.lc;
import y2.f;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* JADX INFO: renamed from: wm, reason: collision with root package name */
    public static final int f2862wm = R$style.f2295f;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    public int f2863ad;

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    @NonNull
    public final CheckableImageButton f2864ap;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2865b;

    /* JADX INFO: renamed from: bk, reason: collision with root package name */
    public int f2866bk;
    public int c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final b3.gv f2867co;

    /* JADX INFO: renamed from: cr, reason: collision with root package name */
    public boolean f2868cr;

    /* JADX INFO: renamed from: cs, reason: collision with root package name */
    public int f2869cs;
    public int ct;
    public Drawable cy;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2870d;
    public int d0;
    public int dm;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f2871e;

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    public int f2872eb;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public TextView f2873ej;

    @Nullable
    public y2.fb en;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f2874f;
    public boolean f3;

    @Nullable
    public y2.fb f7;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @NonNull
    public final LinearLayout f2875fb;
    public CharSequence fh;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View.OnLongClickListener f2876g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @Nullable
    public Drawable f2877g3;

    /* JADX INFO: renamed from: gq, reason: collision with root package name */
    public ColorStateList f2878gq;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    @Nullable
    public ColorStateList f2879hw;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public final o2.y f2880i2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public boolean f2881i3;

    /* JADX INFO: renamed from: ix, reason: collision with root package name */
    public int f2882ix;

    @Nullable
    public CharSequence j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public ValueAnimator f2883j3;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    @Nullable
    public ColorStateList f2884j5;

    @NonNull
    public f jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2885k;

    /* JADX INFO: renamed from: kp, reason: collision with root package name */
    public PorterDuff.Mode f2886kp;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final CheckableImageButton f2887l;

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    public int f2888lc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f2889le;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2890m;

    /* JADX INFO: renamed from: mp, reason: collision with root package name */
    public int f2891mp;

    @Nullable
    public TextView n;

    /* JADX INFO: renamed from: ne, reason: collision with root package name */
    public boolean f2892ne;

    /* JADX INFO: renamed from: nf, reason: collision with root package name */
    public final Rect f2893nf;

    @NonNull
    public final TextView o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public PorterDuff.Mode f2894o0;
    public int o4;
    public ColorStateList oa;

    @NonNull
    public final TextView oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2895p;
    public ColorStateList pq;
    public final LinkedHashSet<fb> pz;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2896q;

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    public ColorStateList f2897q5;
    public CharSequence q9;

    /* JADX INFO: renamed from: qj, reason: collision with root package name */
    public View.OnLongClickListener f2898qj;

    /* JADX INFO: renamed from: qk, reason: collision with root package name */
    public View.OnLongClickListener f2899qk;

    @Nullable
    public CharSequence qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2900r;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final Rect f2901ra;

    /* JADX INFO: renamed from: rb, reason: collision with root package name */
    public boolean f2902rb;

    /* JADX INFO: renamed from: ro, reason: collision with root package name */
    public int f2903ro;
    public int rs;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final FrameLayout f2904s;
    public Typeface s8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f2905t;

    @NonNull
    public final CheckableImageButton tg;
    public final int u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final LinkedHashSet<a> f2906u0;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public boolean f2907ut;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final LinearLayout f2908v;

    /* JADX INFO: renamed from: vn, reason: collision with root package name */
    public boolean f2909vn;
    public ColorStateList vp;
    public int w;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public int f2910w2;

    /* JADX INFO: renamed from: w9, reason: collision with root package name */
    public int f2911w9;

    @Nullable
    public Drawable wf;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public ColorStateList f2912x;
    public int x5;
    public boolean xb;
    public int xg;

    @NonNull
    public final FrameLayout y;
    public final SparseArray<b3.zn> y4;
    public int y5;

    /* JADX INFO: renamed from: yc, reason: collision with root package name */
    public boolean f2913yc;

    /* JADX INFO: renamed from: yg, reason: collision with root package name */
    public ColorStateList f2914yg;

    /* JADX INFO: renamed from: yk, reason: collision with root package name */
    public boolean f2915yk;
    public boolean z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new y();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public CharSequence f2916f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Nullable
        public CharSequence f2917fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f2918s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @Nullable
        public CharSequence f2919t;

        @Nullable
        public CharSequence w;

        public static class y implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f2917fb) + " hint=" + ((Object) this.f2916f) + " helperText=" + ((Object) this.f2919t) + " placeholderText=" + ((Object) this.w) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f2917fb, parcel, i);
            parcel.writeInt(this.f2918s ? 1 : 0);
            TextUtils.writeToParcel(this.f2916f, parcel, i);
            TextUtils.writeToParcel(this.f2919t, parcel, i);
            TextUtils.writeToParcel(this.w, parcel, i);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.f2917fb = (CharSequence) creator.createFromParcel(parcel);
            this.f2918s = parcel.readInt() == 1;
            this.f2916f = (CharSequence) creator.createFromParcel(parcel);
            this.f2919t = (CharSequence) creator.createFromParcel(parcel);
            this.w = (CharSequence) creator.createFromParcel(parcel);
        }
    }

    public interface a {
        void y(@NonNull TextInputLayout textInputLayout);
    }

    public interface fb {
        void y(@NonNull TextInputLayout textInputLayout, int i);
    }

    public class gv implements ValueAnimator.AnimatorUpdateListener {
        public gv() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.f2880i2.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class n3 implements Runnable {
        public n3() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.tg.performClick();
            TextInputLayout.this.tg.jumpDrawablesToCurrentState();
        }
    }

    public static class v extends qn.y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final TextInputLayout f2920gv;

        public v(@NonNull TextInputLayout textInputLayout) {
            this.f2920gv = textInputLayout;
        }

        public void fb(@NonNull View view, @NonNull ud udVar) {
            super.fb(view, udVar);
            EditText editText = this.f2920gv.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f2920gv.getHint();
            CharSequence error = this.f2920gv.getError();
            CharSequence placeholderText = this.f2920gv.getPlaceholderText();
            int counterMaxLength = this.f2920gv.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f2920gv.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zYt = this.f2920gv.yt();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
            if (!zIsEmpty) {
                udVar.gq(text);
            } else if (!TextUtils.isEmpty(string)) {
                udVar.gq(string);
                if (!zYt && placeholderText != null) {
                    udVar.gq(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                udVar.gq(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    udVar.bk(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    udVar.gq(string);
                }
                udVar.cy(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            udVar.y4(counterMaxLength);
            if (z) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                udVar.g3(error);
            }
            if (editText != null) {
                editText.setLabelFor(R$id.f2257yt);
            }
        }
    }

    public class y implements TextWatcher {
        public y() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NonNull Editable editable) {
            TextInputLayout.this.g(!r0.f2896q);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.z) {
                textInputLayout.s8(editable.length());
            }
            if (TextInputLayout.this.f2870d) {
                TextInputLayout.this.tg(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i5, int i8) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i5, int i8) {
        }
    }

    public class zn implements Runnable {
        public zn() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f2874f.requestLayout();
        }
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.f2161b);
    }

    public static void ap(@NonNull Context context, @NonNull TextView textView, int i, int i5, boolean z) {
        textView.setContentDescription(context.getString(z ? R$string.zn : R$string.n3, Integer.valueOf(i), Integer.valueOf(i5)));
    }

    private b3.zn getEndIconDelegate() {
        b3.zn znVar = this.y4.get(this.f2866bk);
        return znVar != null ? znVar : this.y4.get(0);
    }

    @Nullable
    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f2887l.getVisibility() == 0) {
            return this.f2887l;
        }
        if (ud() && x()) {
            return this.tg;
        }
        return null;
    }

    public static void oz(@NonNull ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                oz((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f2874f != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f2866bk != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f2874f = editText;
        setMinWidth(this.w);
        setMaxWidth(this.f2895p);
        o();
        setTextInputAccessibilityDelegate(new v(this));
        this.f2880i2.xg(this.f2874f.getTypeface());
        this.f2880i2.ut(this.f2874f.getTextSize());
        int gravity = this.f2874f.getGravity();
        this.f2880i2.yt((gravity & (-113)) | 48);
        this.f2880i2.oz(gravity);
        this.f2874f.addTextChangedListener(new y());
        if (this.vp == null) {
            this.vp = this.f2874f.getHintTextColors();
        }
        if (this.f2907ut) {
            if (TextUtils.isEmpty(this.q9)) {
                CharSequence hint = this.f2874f.getHint();
                this.f2905t = hint;
                setHint(hint);
                this.f2874f.setHint((CharSequence) null);
            }
            this.f2885k = true;
        }
        if (this.n != null) {
            s8(this.f2874f.getText().length());
        }
        rb();
        this.f2867co.v();
        this.f2908v.bringToFront();
        this.f2875fb.bringToFront();
        this.f2904s.bringToFront();
        this.f2887l.bringToFront();
        fh();
        pz();
        o0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u0(false, true);
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
    private void setErrorIconVisible(boolean z) {
        this.f2887l.setVisibility(z ? 0 : 8);
        this.f2904s.setVisibility(z ? 8 : 0);
        o0();
        if (ud()) {
            return;
        }
        kp();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.q9)) {
            return;
        }
        this.q9 = charSequence;
        this.f2880i2.u(charSequence);
        if (this.f2915yk) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f2870d == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f2873ej = appCompatTextView;
            appCompatTextView.setId(R$id.vl);
            ut.g(this.f2873ej, 1);
            setPlaceholderTextAppearance(this.f2865b);
            setPlaceholderTextColor(this.f2912x);
            fb();
        } else {
            en();
            this.f2873ej = null;
        }
        this.f2870d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u(@NonNull CheckableImageButton checkableImageButton, @Nullable View.OnLongClickListener onLongClickListener) {
        boolean zQn = ut.qn(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z5 = zQn || z;
        checkableImageButton.setFocusable(z5);
        checkableImageButton.setClickable(zQn);
        checkableImageButton.setPressable(zQn);
        checkableImageButton.setLongClickable(z);
        ut.o0(checkableImageButton, z5 ? 1 : 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void xg(@NonNull CheckableImageButton checkableImageButton, @Nullable View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        u(checkableImageButton, onLongClickListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void y5(@NonNull CheckableImageButton checkableImageButton, @Nullable View.OnClickListener onClickListener, @Nullable View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        u(checkableImageButton, onLongClickListener);
    }

    public void a(@NonNull fb fbVar) {
        this.pz.add(fbVar);
    }

    public final void a8() {
        TextView textView = this.f2873ej;
        if (textView == null || !this.f2870d) {
            return;
        }
        textView.setText((CharSequence) null);
        this.f2873ej.setVisibility(4);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.y.addView(view, layoutParams2);
        this.y.setLayoutParams(layoutParams);
        m();
        setEditText((EditText) view);
    }

    public final boolean b() {
        return this.f2887l.getVisibility() == 0;
    }

    public final void bk() {
        EditText editText;
        if (this.f2873ej == null || (editText = this.f2874f) == null) {
            return;
        }
        this.f2873ej.setGravity(editText.getGravity());
        this.f2873ej.setPadding(this.f2874f.getCompoundPaddingLeft(), this.f2874f.getCompoundPaddingTop(), this.f2874f.getCompoundPaddingRight(), this.f2874f.getCompoundPaddingBottom());
    }

    public final void c(boolean z) {
        ValueAnimator valueAnimator = this.f2883j3;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f2883j3.cancel();
        }
        if (z && this.f2909vn) {
            c5(1.0f);
        } else {
            this.f2880i2.k(1.0f);
        }
        this.f2915yk = false;
        if (d0()) {
            j();
        }
        y4();
        pq();
        xb();
    }

    public void c5(float f3) {
        if (this.f2880i2.f3() == f3) {
            return;
        }
        if (this.f2883j3 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2883j3 = valueAnimator;
            valueAnimator.setInterpolator(t1.y.n3);
            this.f2883j3.setDuration(167L);
            this.f2883j3.addUpdateListener(new gv());
        }
        this.f2883j3.setFloatValues(this.f2880i2.f3(), f3);
        this.f2883j3.start();
    }

    public final int co(@NonNull Rect rect, @NonNull Rect rect2, float f3) {
        return hw() ? (int) (rect2.top + f3) : rect.bottom - this.f2874f.getCompoundPaddingBottom();
    }

    public final void cr(boolean z, boolean z5) {
        int defaultColor = this.f2897q5.getDefaultColor();
        int colorForState = this.f2897q5.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f2897q5.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f2872eb = colorForState2;
        } else if (z5) {
            this.f2872eb = colorForState;
        } else {
            this.f2872eb = defaultColor;
        }
    }

    public final boolean ct() {
        return (this.f2887l.getVisibility() == 0 || ((ud() && x()) || this.j != null)) && this.f2875fb.getMeasuredWidth() > 0;
    }

    public final void d(boolean z) {
        ValueAnimator valueAnimator = this.f2883j3;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f2883j3.cancel();
        }
        if (z && this.f2909vn) {
            c5(0.0f);
        } else {
            this.f2880i2.k(0.0f);
        }
        if (d0() && ((b3.n3) this.f7).lc()) {
            n();
        }
        this.f2915yk = true;
        a8();
        pq();
        xb();
    }

    public final boolean d0() {
        return this.f2907ut && !TextUtils.isEmpty(this.q9) && (this.f7 instanceof b3.n3);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i) {
        EditText editText = this.f2874f;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f2905t != null) {
            boolean z = this.f2885k;
            this.f2885k = false;
            CharSequence hint = editText.getHint();
            this.f2874f.setHint(this.f2905t);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f2874f.setHint(hint);
                this.f2885k = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.y.getChildCount());
        for (int i5 = 0; i5 < this.y.getChildCount(); i5++) {
            View childAt = this.y.getChildAt(i5);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i5);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f2874f) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.f2896q = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f2896q = false;
    }

    public void dm(@NonNull TextView textView, int i) {
        try {
            wz.xc(textView, i);
            if (Build.VERSION.SDK_INT < 23) {
                return;
            }
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        wz.xc(textView, R$style.y);
        textView.setTextColor(d.y.getColor(getContext(), R$color.y));
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        ta(canvas);
        mg(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f2892ne) {
            return;
        }
        this.f2892ne = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        o2.y yVar = this.f2880i2;
        boolean zJz = yVar != null ? yVar.jz(drawableState) : false;
        if (this.f2874f != null) {
            g(ut.q9(this) && isEnabled());
        }
        rb();
        wf();
        if (zJz) {
            invalidate();
        }
        this.f2892ne = false;
    }

    public final void e() {
        if (this.n != null) {
            EditText editText = this.f2874f;
            s8(editText == null ? 0 : editText.getText().length());
        }
    }

    public final void eb() {
        TextView textView = this.f2873ej;
        if (textView == null || !this.f2870d) {
            return;
        }
        textView.setText(this.fh);
        this.f2873ej.setVisibility(0);
        this.f2873ej.bringToFront();
    }

    public final int ej(int i, boolean z) {
        int compoundPaddingRight = i - this.f2874f.getCompoundPaddingRight();
        return (this.qn == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.o.getMeasuredWidth() - this.o.getPaddingRight());
    }

    public final void en() {
        TextView textView = this.f2873ej;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void f() {
        if (this.en == null) {
            return;
        }
        if (f3()) {
            this.en.k(ColorStateList.valueOf(this.f2872eb));
        }
        invalidate();
    }

    public final boolean f3() {
        return this.ct > -1 && this.f2872eb != 0;
    }

    public void f7() {
        k(this.f2864ap, this.f2914yg);
    }

    public final void fb() {
        TextView textView = this.f2873ej;
        if (textView != null) {
            this.y.addView(textView);
            this.f2873ej.setVisibility(0);
        }
    }

    public final void fh() {
        Iterator<a> it = this.f2906u0.iterator();
        while (it.hasNext()) {
            it.next().y(this);
        }
    }

    public void g(boolean z) {
        u0(z, false);
    }

    public final boolean g3() {
        int iMax;
        if (this.f2874f == null || this.f2874f.getMeasuredHeight() >= (iMax = Math.max(this.f2875fb.getMeasuredHeight(), this.f2908v.getMeasuredHeight()))) {
            return false;
        }
        this.f2874f.setMinimumHeight(iMax);
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f2874f;
        return editText != null ? editText.getBaseline() + getPaddingTop() + x4() : super.getBaseline();
    }

    @NonNull
    public y2.fb getBoxBackground() {
        int i = this.xg;
        if (i == 1 || i == 2) {
            return this.f7;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f2888lc;
    }

    public int getBoxBackgroundMode() {
        return this.xg;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f7.co();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f7.z();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f7.z6();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f7.d();
    }

    public int getBoxStrokeColor() {
        return this.x5;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2897q5;
    }

    public int getBoxStrokeWidth() {
        return this.o4;
    }

    public int getBoxStrokeWidthFocused() {
        return this.rs;
    }

    public int getCounterMaxLength() {
        return this.f2900r;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.z && this.f3 && (textView = this.n) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.f2879hw;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.f2879hw;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.vp;
    }

    @Nullable
    public EditText getEditText() {
        return this.f2874f;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.tg.getContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.tg.getDrawable();
    }

    public int getEndIconMode() {
        return this.f2866bk;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.tg;
    }

    @Nullable
    public CharSequence getError() {
        if (this.f2867co.f3()) {
            return this.f2867co.wz();
        }
        return null;
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.f2867co.tl();
    }

    public int getErrorCurrentTextColors() {
        return this.f2867co.xc();
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.f2887l.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f2867co.xc();
    }

    @Nullable
    public CharSequence getHelperText() {
        if (this.f2867co.n()) {
            return this.f2867co.p();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f2867co.mt();
    }

    @Nullable
    public CharSequence getHint() {
        if (this.f2907ut) {
            return this.q9;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2880i2.p();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f2880i2.z();
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.oa;
    }

    public int getMaxWidth() {
        return this.f2895p;
    }

    public int getMinWidth() {
        return this.w;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.tg.getContentDescription();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.tg.getDrawable();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.f2870d) {
            return this.fh;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2865b;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.f2912x;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.qn;
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.o.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.o;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.f2864ap.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.f2864ap.getDrawable();
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.j;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.oz.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.oz;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.s8;
    }

    public final boolean hw() {
        return this.xg == 1 && this.f2874f.getMinLines() <= 1;
    }

    public final boolean i4() {
        return this.xg == 2 && f3();
    }

    public final void i9() {
        y2.fb fbVar = this.f7;
        if (fbVar == null) {
            return;
        }
        fbVar.setShapeAppearanceModel(this.jz);
        if (i4()) {
            this.f7.y5(this.ct, this.f2872eb);
        }
        int iP = p();
        this.f2888lc = iP;
        this.f7.k(ColorStateList.valueOf(iP));
        if (this.f2866bk == 3) {
            this.f2874f.getBackground().invalidateSelf();
        }
        f();
        invalidate();
    }

    public final void j() {
        if (d0()) {
            RectF rectF = this.f2871e;
            this.f2880i2.xc(rectF, this.f2874f.getWidth(), this.f2874f.getGravity());
            t(rectF);
            int i = this.ct;
            this.y5 = i;
            rectF.top = 0.0f;
            rectF.bottom = i;
            rectF.offset(-getPaddingLeft(), 0.0f);
            ((b3.n3) this.f7).yg(rectF);
        }
    }

    public boolean j5() {
        return this.f2864ap.getVisibility() == 0;
    }

    public final void jz() {
        if (rs()) {
            ut.u0(this.f2874f, this.f7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(qn(checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = a8.y.mt(drawable).mutate();
        a8.y.xc(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public boolean k5() {
        return this.f2867co.n();
    }

    public final boolean kp() {
        boolean z;
        if (this.f2874f == null) {
            return false;
        }
        boolean z5 = true;
        if (o4()) {
            int measuredWidth = this.f2908v.getMeasuredWidth() - this.f2874f.getPaddingLeft();
            if (this.f2877g3 == null || this.f2890m != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f2877g3 = colorDrawable;
                this.f2890m = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrY = wz.y(this.f2874f);
            Drawable drawable = drawableArrY[0];
            Drawable drawable2 = this.f2877g3;
            if (drawable != drawable2) {
                wz.i9(this.f2874f, drawable2, drawableArrY[1], drawableArrY[2], drawableArrY[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.f2877g3 != null) {
                Drawable[] drawableArrY2 = wz.y(this.f2874f);
                wz.i9(this.f2874f, null, drawableArrY2[1], drawableArrY2[2], drawableArrY2[3]);
                this.f2877g3 = null;
                z = true;
            }
            z = false;
        }
        if (ct()) {
            int measuredWidth2 = this.oz.getMeasuredWidth() - this.f2874f.getPaddingRight();
            AppCompatImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + co.n3((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] drawableArrY3 = wz.y(this.f2874f);
            Drawable drawable3 = this.wf;
            if (drawable3 == null || this.f2863ad == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.wf = colorDrawable2;
                    this.f2863ad = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = drawableArrY3[2];
                Drawable drawable5 = this.wf;
                if (drawable4 != drawable5) {
                    this.cy = drawable4;
                    wz.i9(this.f2874f, drawableArrY3[0], drawableArrY3[1], drawable5, drawableArrY3[3]);
                } else {
                    z5 = z;
                }
            } else {
                this.f2863ad = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                wz.i9(this.f2874f, drawableArrY3[0], drawableArrY3[1], this.wf, drawableArrY3[3]);
            }
        } else {
            if (this.wf == null) {
                return z;
            }
            Drawable[] drawableArrY4 = wz.y(this.f2874f);
            if (drawableArrY4[2] == this.wf) {
                wz.i9(this.f2874f, drawableArrY4[0], drawableArrY4[1], this.cy, drawableArrY4[3]);
            } else {
                z5 = z;
            }
            this.wf = null;
        }
        return z5;
    }

    public final void lc(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            tl();
            return;
        }
        Drawable drawableMutate = a8.y.mt(getEndIconDrawable()).mutate();
        a8.y.wz(drawableMutate, this.f2867co.xc());
        this.tg.setImageDrawable(drawableMutate);
    }

    public final void m() {
        if (this.xg != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.y.getLayoutParams();
            int iX4 = x4();
            if (iX4 != layoutParams.topMargin) {
                layoutParams.topMargin = iX4;
                this.y.requestLayout();
            }
        }
    }

    public final void mg(Canvas canvas) {
        y2.fb fbVar = this.en;
        if (fbVar != null) {
            Rect bounds = fbVar.getBounds();
            bounds.top = bounds.bottom - this.ct;
            this.en.draw(canvas);
        }
    }

    @NonNull
    public final Rect mt(@NonNull Rect rect) {
        if (this.f2874f == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f2901ra;
        boolean z = ut.ta(this) == 1;
        rect2.bottom = rect.bottom;
        int i = this.xg;
        if (i == 1) {
            rect2.left = z6(rect.left, z);
            rect2.top = rect.top + this.dm;
            rect2.right = ej(rect.right, z);
            return rect2;
        }
        if (i != 2) {
            rect2.left = z6(rect.left, z);
            rect2.top = getPaddingTop();
            rect2.right = ej(rect.right, z);
            return rect2;
        }
        rect2.left = rect.left + this.f2874f.getPaddingLeft();
        rect2.top = rect.top - x4();
        rect2.right = rect.right - this.f2874f.getPaddingRight();
        return rect2;
    }

    public final void n() {
        if (d0()) {
            ((b3.n3) this.f7).e();
        }
    }

    public final void nf() {
        if (this.xg == 1) {
            if (t2.zn.s(getContext())) {
                this.dm = getResources().getDimensionPixelSize(R$dimen.z);
            } else if (t2.zn.fb(getContext())) {
                this.dm = getResources().getDimensionPixelSize(R$dimen.f2197co);
            }
        }
    }

    public final void o() {
        w();
        jz();
        wf();
        nf();
        s();
        if (this.xg != 0) {
            m();
        }
    }

    public final void o0() {
        if (this.f2874f == null) {
            return;
        }
        ut.cy(this.oz, getContext().getResources().getDimensionPixelSize(R$dimen.f3), this.f2874f.getPaddingTop(), (x() || b()) ? 0 : ut.ud(this.f2874f), this.f2874f.getPaddingBottom());
    }

    public final boolean o4() {
        return !(getStartIconDrawable() == null && this.qn == null) && this.f2908v.getMeasuredWidth() > 0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i5, int i8, int i10) {
        super.onLayout(z, i, i5, i8, i10);
        EditText editText = this.f2874f;
        if (editText != null) {
            Rect rect = this.f2893nf;
            o2.n3.y(this, editText, rect);
            ra(rect);
            if (this.f2907ut) {
                this.f2880i2.ut(this.f2874f.getTextSize());
                int gravity = this.f2874f.getGravity();
                this.f2880i2.yt((gravity & (-113)) | 48);
                this.f2880i2.oz(gravity);
                this.f2880i2.a8(mt(rect));
                this.f2880i2.qn(r(rect));
                this.f2880i2.z6();
                if (!d0() || this.f2915yk) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        boolean zG3 = g3();
        boolean zKp = kp();
        if (zG3 || zKp) {
            this.f2874f.post(new zn());
        }
        bk();
        pz();
        o0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.y());
        setError(savedState.f2917fb);
        if (savedState.f2918s) {
            this.tg.post(new n3());
        }
        setHint(savedState.f2916f);
        setHelperText(savedState.f2919t);
        setPlaceholderText(savedState.w);
        requestLayout();
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f2867co.f()) {
            savedState.f2917fb = getError();
        }
        savedState.f2918s = ud() && this.tg.isChecked();
        savedState.f2916f = getHint();
        savedState.f2919t = getHelperText();
        savedState.w = getPlaceholderText();
        return savedState;
    }

    public final int p() {
        return this.xg == 1 ? g2.y.fb(g2.y.v(this, R$attr.f2181wz, 0), this.f2888lc) : this.f2888lc;
    }

    public final void pq() {
        this.o.setVisibility((this.qn == null || yt()) ? 8 : 0);
        kp();
    }

    public final void pz() {
        if (this.f2874f == null) {
            return;
        }
        ut.cy(this.o, j5() ? 0 : ut.a8(this.f2874f), this.f2874f.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R$dimen.f3), this.f2874f.getCompoundPaddingBottom());
    }

    public void q9() {
        k(this.f2887l, this.f2878gq);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] qn(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    @NonNull
    public final Rect r(@NonNull Rect rect) {
        if (this.f2874f == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f2901ra;
        float fI4 = this.f2880i2.i4();
        rect2.left = rect.left + this.f2874f.getCompoundPaddingLeft();
        rect2.top = z(rect, fI4);
        rect2.right = rect.right - this.f2874f.getCompoundPaddingRight();
        rect2.bottom = co(rect, rect2, fI4);
        return rect2;
    }

    public final void ra(@NonNull Rect rect) {
        y2.fb fbVar = this.en;
        if (fbVar != null) {
            int i = rect.bottom;
            fbVar.setBounds(rect.left, i - this.rs, rect.right, i);
        }
    }

    public void rb() {
        Drawable background;
        TextView textView;
        EditText editText = this.f2874f;
        if (editText == null || this.xg != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (lc.y(background)) {
            background = background.mutate();
        }
        if (this.f2867co.f()) {
            background.setColorFilter(w.f.v(this.f2867co.xc(), PorterDuff.Mode.SRC_IN));
        } else if (this.f3 && (textView = this.n) != null) {
            background.setColorFilter(w.f.v(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            a8.y.zn(background);
            this.f2874f.refreshDrawableState();
        }
    }

    public final boolean rs() {
        EditText editText = this.f2874f;
        return (editText == null || this.f7 == null || editText.getBackground() != null || this.xg == 0) ? false : true;
    }

    public final void rz(int i) {
        Iterator<fb> it = this.pz.iterator();
        while (it.hasNext()) {
            it.next().y(this, i);
        }
    }

    public final void s() {
        if (this.f2874f == null || this.xg != 1) {
            return;
        }
        if (t2.zn.s(getContext())) {
            EditText editText = this.f2874f;
            ut.cy(editText, ut.a8(editText), getResources().getDimensionPixelSize(R$dimen.f2209mt), ut.ud(this.f2874f), getResources().getDimensionPixelSize(R$dimen.f2210p));
        } else if (t2.zn.fb(getContext())) {
            EditText editText2 = this.f2874f;
            ut.cy(editText2, ut.a8(editText2), getResources().getDimensionPixelSize(R$dimen.w), ut.ud(this.f2874f), getResources().getDimensionPixelSize(R$dimen.f2222xc));
        }
    }

    public void s8(int i) {
        boolean z = this.f3;
        int i5 = this.f2900r;
        if (i5 == -1) {
            this.n.setText(String.valueOf(i));
            this.n.setContentDescription(null);
            this.f3 = false;
        } else {
            this.f3 = i > i5;
            ap(getContext(), this.n, i, this.f2900r, this.f3);
            if (z != this.f3) {
                yg();
            }
            this.n.setText(hw.y.zn().i9(getContext().getString(R$string.f2282gv, Integer.valueOf(i), Integer.valueOf(this.f2900r))));
        }
        if (this.f2874f == null || z == this.f3) {
            return;
        }
        g(false);
        wf();
        rb();
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f2888lc != i) {
            this.f2888lc = i;
            this.f2891mp = i;
            this.f2869cs = i;
            this.f2903ro = i;
            i9();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(d.y.getColor(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2891mp = defaultColor;
        this.f2888lc = defaultColor;
        this.f2889le = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2869cs = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f2903ro = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        i9();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.xg) {
            return;
        }
        this.xg = i;
        if (this.f2874f != null) {
            o();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.x5 != i) {
            this.x5 = i;
            wf();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f2911w9 = colorStateList.getDefaultColor();
            this.f2882ix = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2910w2 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.x5 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.x5 != colorStateList.getDefaultColor()) {
            this.x5 = colorStateList.getDefaultColor();
        }
        wf();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.f2897q5 != colorStateList) {
            this.f2897q5 = colorStateList;
            wf();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.o4 = i;
        wf();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.rs = i;
        wf();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.z != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.n = appCompatTextView;
                appCompatTextView.setId(R$id.f2231b);
                Typeface typeface = this.s8;
                if (typeface != null) {
                    this.n.setTypeface(typeface);
                }
                this.n.setMaxLines(1);
                this.f2867co.gv(this.n, 2);
                co.gv((ViewGroup.MarginLayoutParams) this.n.getLayoutParams(), getResources().getDimensionPixelOffset(R$dimen.dm));
                yg();
                e();
            } else {
                this.f2867co.c(this.n, 2);
                this.n = null;
            }
            this.z = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f2900r != i) {
            if (i > 0) {
                this.f2900r = i;
            } else {
                this.f2900r = -1;
            }
            if (this.z) {
                e();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.c != i) {
            this.c = i;
            yg();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f2884j5 != colorStateList) {
            this.f2884j5 = colorStateList;
            yg();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.d0 != i) {
            this.d0 = i;
            yg();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f2879hw != colorStateList) {
            this.f2879hw = colorStateList;
            yg();
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.vp = colorStateList;
        this.oa = colorStateList;
        if (this.f2874f != null) {
            g(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        oz(this, z);
        super.setEnabled(z);
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
    public void setEndIconActivated(boolean z) {
        this.tg.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.tg.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? f.n3.gv(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i5 = this.f2866bk;
        this.f2866bk = i;
        rz(i5);
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().n3(this.xg)) {
            getEndIconDelegate().y();
            tl();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.xg + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        y5(this.tg, onClickListener, this.f2899qk);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f2899qk = onLongClickListener;
        xg(this.tg, onLongClickListener);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.pq != colorStateList) {
            this.pq = colorStateList;
            this.f2868cr = true;
            tl();
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f2894o0 != mode) {
            this.f2894o0 = mode;
            this.xb = true;
            tl();
        }
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
    public void setEndIconVisible(boolean z) {
        if (x() != z) {
            this.tg.setVisibility(z ? 0 : 8);
            o0();
            kp();
        }
    }

    public void setError(@Nullable CharSequence charSequence) {
        if (!this.f2867co.f3()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f2867co.z();
        } else {
            this.f2867co.k5(charSequence);
        }
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        this.f2867co.fh(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f2867co.rz(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? f.n3.gv(getContext(), i) : null);
        q9();
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        y5(this.f2887l, onClickListener, this.f2898qj);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f2898qj = onLongClickListener;
        xg(this.f2887l, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        this.f2878gq = colorStateList;
        Drawable drawable = this.f2887l.getDrawable();
        if (drawable != null) {
            drawable = a8.y.mt(drawable).mutate();
            a8.y.xc(drawable, colorStateList);
        }
        if (this.f2887l.getDrawable() != drawable) {
            this.f2887l.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        Drawable drawable = this.f2887l.getDrawable();
        if (drawable != null) {
            drawable = a8.y.mt(drawable).mutate();
            a8.y.w(drawable, mode);
        }
        if (this.f2887l.getDrawable() != drawable) {
            this.f2887l.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f2867co.mg(i);
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        this.f2867co.ta(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f2881i3 != z) {
            this.f2881i3 = z;
            g(false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (k5()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!k5()) {
                setHelperTextEnabled(true);
            }
            this.f2867co.yt(charSequence);
        }
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        this.f2867co.ej(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f2867co.z6(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f2867co.d(i);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.f2907ut) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f2909vn = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f2907ut) {
            this.f2907ut = z;
            if (z) {
                CharSequence hint = this.f2874f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.q9)) {
                        setHint(hint);
                    }
                    this.f2874f.setHint((CharSequence) null);
                }
                this.f2885k = true;
            } else {
                this.f2885k = false;
                if (!TextUtils.isEmpty(this.q9) && TextUtils.isEmpty(this.f2874f.getHint())) {
                    this.f2874f.setHint(this.q9);
                }
                setHintInternal(null);
            }
            if (this.f2874f != null) {
                m();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f2880i2.x(i);
        this.oa = this.f2880i2.w();
        if (this.f2874f != null) {
            g(false);
            m();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.oa != colorStateList) {
            if (this.vp == null) {
                this.f2880i2.k5(colorStateList);
            }
            this.oa = colorStateList;
            if (this.f2874f != null) {
                g(false);
            }
        }
    }

    public void setMaxWidth(int i) {
        this.f2895p = i;
        EditText editText = this.f2874f;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinWidth(int i) {
        this.w = i;
        EditText editText = this.f2874f;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? f.n3.gv(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f2866bk != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        this.pq = colorStateList;
        this.f2868cr = true;
        tl();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        this.f2894o0 = mode;
        this.xb = true;
        tl();
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        if (this.f2870d && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2870d) {
                setPlaceholderTextEnabled(true);
            }
            this.fh = charSequence;
        }
        y4();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f2865b = i;
        TextView textView = this.f2873ej;
        if (textView != null) {
            wz.xc(textView, i);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f2912x != colorStateList) {
            this.f2912x = colorStateList;
            TextView textView = this.f2873ej;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        this.qn = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.o.setText(charSequence);
        pq();
    }

    public void setPrefixTextAppearance(int i) {
        wz.xc(this.o, i);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.o.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f2864ap.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? f.n3.gv(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        y5(this.f2864ap, onClickListener, this.f2876g);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f2876g = onLongClickListener;
        xg(this.f2864ap, onLongClickListener);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f2914yg != colorStateList) {
            this.f2914yg = colorStateList;
            this.f2913yc = true;
            xc();
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f2886kp != mode) {
            this.f2886kp = mode;
            this.f2902rb = true;
            xc();
        }
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
    public void setStartIconVisible(boolean z) {
        if (j5() != z) {
            this.f2864ap.setVisibility(z ? 0 : 8);
            pz();
            kp();
        }
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        this.j = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.oz.setText(charSequence);
        xb();
    }

    public void setSuffixTextAppearance(int i) {
        wz.xc(this.oz, i);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.oz.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable v vVar) {
        EditText editText = this.f2874f;
        if (editText != null) {
            ut.g3(editText, vVar);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.s8) {
            this.s8 = typeface;
            this.f2880i2.xg(typeface);
            this.f2867co.a8(typeface);
            TextView textView = this.n;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final void t(@NonNull RectF rectF) {
        float f3 = rectF.left;
        int i = this.u;
        rectF.left = f3 - i;
        rectF.right += i;
    }

    public final void ta(@NonNull Canvas canvas) {
        if (this.f2907ut) {
            this.f2880i2.t(canvas);
        }
    }

    public final void tg(int i) {
        if (i != 0 || this.f2915yk) {
            a8();
        } else {
            eb();
        }
    }

    public final void tl() {
        wz(this.tg, this.f2868cr, this.pq, this.xb, this.f2894o0);
    }

    public final void u0(boolean z, boolean z5) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f2874f;
        boolean z7 = false;
        boolean z8 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f2874f;
        if (editText2 != null && editText2.hasFocus()) {
            z7 = true;
        }
        boolean zF = this.f2867co.f();
        ColorStateList colorStateList2 = this.vp;
        if (colorStateList2 != null) {
            this.f2880i2.k5(colorStateList2);
            this.f2880i2.j(this.vp);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.vp;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f2882ix) : this.f2882ix;
            this.f2880i2.k5(ColorStateList.valueOf(colorForState));
            this.f2880i2.j(ColorStateList.valueOf(colorForState));
        } else if (zF) {
            this.f2880i2.k5(this.f2867co.w());
        } else if (this.f3 && (textView = this.n) != null) {
            this.f2880i2.k5(textView.getTextColors());
        } else if (z7 && (colorStateList = this.oa) != null) {
            this.f2880i2.k5(colorStateList);
        }
        if (z8 || !this.f2881i3 || (isEnabled() && z7)) {
            if (z5 || this.f2915yk) {
                c(z);
                return;
            }
            return;
        }
        if (z5 || !this.f2915yk) {
            d(z);
        }
    }

    public final boolean ud() {
        return this.f2866bk != 0;
    }

    public void ut() {
        k(this.tg, this.pq);
    }

    public void v(@NonNull a aVar) {
        this.f2906u0.add(aVar);
        if (this.f2874f != null) {
            aVar.y(this);
        }
    }

    public boolean vl() {
        return this.f2885k;
    }

    public final void w() {
        int i = this.xg;
        if (i == 0) {
            this.f7 = null;
            this.en = null;
            return;
        }
        if (i == 1) {
            this.f7 = new y2.fb(this.jz);
            this.en = new y2.fb();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.xg + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f2907ut || (this.f7 instanceof b3.n3)) {
                this.f7 = new y2.fb(this.jz);
            } else {
                this.f7 = new b3.n3(this.jz);
            }
            this.en = null;
        }
    }

    public void wf() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f7 == null || this.xg == 0) {
            return;
        }
        boolean z = false;
        boolean z5 = isFocused() || ((editText2 = this.f2874f) != null && editText2.hasFocus());
        boolean z7 = isHovered() || ((editText = this.f2874f) != null && editText.isHovered());
        if (!isEnabled()) {
            this.f2872eb = this.f2882ix;
        } else if (this.f2867co.f()) {
            if (this.f2897q5 != null) {
                cr(z5, z7);
            } else {
                this.f2872eb = this.f2867co.xc();
            }
        } else if (!this.f3 || (textView = this.n) == null) {
            if (z5) {
                this.f2872eb = this.x5;
            } else if (z7) {
                this.f2872eb = this.f2910w2;
            } else {
                this.f2872eb = this.f2911w9;
            }
        } else if (this.f2897q5 != null) {
            cr(z5, z7);
        } else {
            this.f2872eb = textView.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null && this.f2867co.f3() && this.f2867co.f()) {
            z = true;
        }
        setErrorIconVisible(z);
        q9();
        f7();
        ut();
        if (getEndIconDelegate().gv()) {
            lc(this.f2867co.f());
        }
        if (z5 && isEnabled()) {
            this.ct = this.rs;
        } else {
            this.ct = this.o4;
        }
        if (this.xg == 2) {
            yc();
        }
        if (this.xg == 1) {
            if (!isEnabled()) {
                this.f2888lc = this.f2889le;
            } else if (z7 && !z5) {
                this.f2888lc = this.f2903ro;
            } else if (z5) {
                this.f2888lc = this.f2869cs;
            } else {
                this.f2888lc = this.f2891mp;
            }
        }
        i9();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void wz(@NonNull CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z5, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z5)) {
            drawable = a8.y.mt(drawable).mutate();
            if (z) {
                a8.y.xc(drawable, colorStateList);
            }
            if (z5) {
                a8.y.w(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public boolean x() {
        return this.f2904s.getVisibility() == 0 && this.tg.getVisibility() == 0;
    }

    public final int x4() {
        float fP;
        if (!this.f2907ut) {
            return 0;
        }
        int i = this.xg;
        if (i == 0 || i == 1) {
            fP = this.f2880i2.p();
        } else {
            if (i != 2) {
                return 0;
            }
            fP = this.f2880i2.p() / 2.0f;
        }
        return (int) fP;
    }

    public final void xb() {
        int visibility = this.oz.getVisibility();
        boolean z = (this.j == null || yt()) ? false : true;
        this.oz.setVisibility(z ? 0 : 8);
        if (visibility != this.oz.getVisibility()) {
            getEndIconDelegate().zn(z);
        }
        kp();
    }

    public final void xc() {
        wz(this.f2864ap, this.f2913yc, this.f2914yg, this.f2902rb, this.f2886kp);
    }

    public final void y4() {
        EditText editText = this.f2874f;
        tg(editText == null ? 0 : editText.getText().length());
    }

    public final void yc() {
        if (!d0() || this.f2915yk || this.y5 == this.ct) {
            return;
        }
        n();
        j();
    }

    public final void yg() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.n;
        if (textView != null) {
            dm(textView, this.f3 ? this.c : this.d0);
            if (!this.f3 && (colorStateList2 = this.f2879hw) != null) {
                this.n.setTextColor(colorStateList2);
            }
            if (!this.f3 || (colorStateList = this.f2884j5) == null) {
                return;
            }
            this.n.setTextColor(colorStateList);
        }
    }

    public final boolean yt() {
        return this.f2915yk;
    }

    public final int z(@NonNull Rect rect, float f3) {
        return hw() ? (int) (rect.centerY() - (f3 / 2.0f)) : rect.top + this.f2874f.getCompoundPaddingTop();
    }

    public final int z6(int i, boolean z) {
        int compoundPaddingLeft = i + this.f2874f.getCompoundPaddingLeft();
        return (this.qn == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.o.getMeasuredWidth()) + this.o.getPaddingLeft();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v50, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r4v13, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    /* JADX WARN: Type inference failed for: r6v9, types: [android.view.View, com.google.android.material.internal.CheckableImageButton] */
    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i5;
        ?? r3;
        int i8 = f2862wm;
        super(e3.y.zn(context, attributeSet, i, i8), attributeSet, i);
        this.w = -1;
        this.f2895p = -1;
        this.f2867co = new b3.gv(this);
        this.f2893nf = new Rect();
        this.f2901ra = new Rect();
        this.f2871e = new RectF();
        this.f2906u0 = new LinkedHashSet<>();
        this.f2866bk = 0;
        SparseArray<b3.zn> sparseArray = new SparseArray<>();
        this.y4 = sparseArray;
        this.pz = new LinkedHashSet<>();
        o2.y yVar = new o2.y(this);
        this.f2880i2 = yVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.y = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f2908v = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.f2875fb = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f2904s = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = t1.y.y;
        yVar.y5(timeInterpolator);
        yVar.en(timeInterpolator);
        yVar.yt(8388659);
        ad adVarC5 = o2.f.c5(context2, attributeSet, R$styleable.R, i, i8, R$styleable.f2415r0, R$styleable.f2392n0, R$styleable.I0, R$styleable.N0, R$styleable.R0);
        this.f2907ut = adVarC5.y(R$styleable.Q0, true);
        setHint(adVarC5.w(R$styleable.W));
        this.f2909vn = adVarC5.y(R$styleable.P0, true);
        this.f2881i3 = adVarC5.y(R$styleable.K0, true);
        if (adVarC5.co(R$styleable.V)) {
            i5 = -1;
            setMinWidth(adVarC5.a(R$styleable.V, -1));
        } else {
            i5 = -1;
        }
        if (adVarC5.co(R$styleable.U)) {
            setMaxWidth(adVarC5.a(R$styleable.U, i5));
        }
        this.jz = f.v(context2, attributeSet, i, i8).tl();
        this.u = context2.getResources().getDimensionPixelOffset(R$dimen.u);
        this.dm = adVarC5.v(R$styleable.Z, 0);
        this.o4 = adVarC5.a(R$styleable.f2357i0, context2.getResources().getDimensionPixelSize(R$dimen.y5));
        this.rs = adVarC5.a(R$styleable.f2368j0, context2.getResources().getDimensionPixelSize(R$dimen.xg));
        this.ct = this.o4;
        float fGv = adVarC5.gv(R$styleable.f2339f0, -1.0f);
        float fGv2 = adVarC5.gv(R$styleable.f2334e0, -1.0f);
        float fGv3 = adVarC5.gv(R$styleable.f2316b0, -1.0f);
        float fGv4 = adVarC5.gv(R$styleable.f2323c0, -1.0f);
        f.n3 n3VarX4 = this.jz.x4();
        if (fGv >= 0.0f) {
            n3VarX4.fh(fGv);
        }
        if (fGv2 >= 0.0f) {
            n3VarX4.d(fGv2);
        }
        if (fGv3 >= 0.0f) {
            n3VarX4.f3(fGv3);
        }
        if (fGv4 >= 0.0f) {
            n3VarX4.z(fGv4);
        }
        this.jz = n3VarX4.tl();
        ColorStateList colorStateListN3 = t2.zn.n3(context2, adVarC5, R$styleable.X);
        if (colorStateListN3 != null) {
            int defaultColor = colorStateListN3.getDefaultColor();
            this.f2891mp = defaultColor;
            this.f2888lc = defaultColor;
            if (colorStateListN3.isStateful()) {
                this.f2889le = colorStateListN3.getColorForState(new int[]{-16842910}, -1);
                this.f2869cs = colorStateListN3.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f2903ro = colorStateListN3.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f2869cs = this.f2891mp;
                ColorStateList colorStateListZn = f.n3.zn(context2, R$color.f2188fb);
                this.f2889le = colorStateListZn.getColorForState(new int[]{-16842910}, -1);
                this.f2903ro = colorStateListZn.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f2888lc = 0;
            this.f2891mp = 0;
            this.f2889le = 0;
            this.f2869cs = 0;
            this.f2903ro = 0;
        }
        if (adVarC5.co(R$styleable.T)) {
            ColorStateList colorStateListZn2 = adVarC5.zn(R$styleable.T);
            this.oa = colorStateListZn2;
            this.vp = colorStateListZn2;
        }
        ColorStateList colorStateListN32 = t2.zn.n3(context2, adVarC5, R$styleable.f2344g0);
        this.x5 = adVarC5.n3(R$styleable.f2344g0, 0);
        this.f2911w9 = d.y.getColor(context2, R$color.f2191s);
        this.f2882ix = d.y.getColor(context2, R$color.f2187c5);
        this.f2910w2 = d.y.getColor(context2, R$color.f2190i9);
        if (colorStateListN32 != null) {
            setBoxStrokeColorStateList(colorStateListN32);
        }
        if (adVarC5.co(R$styleable.f2352h0)) {
            setBoxStrokeErrorColor(t2.zn.n3(context2, adVarC5, R$styleable.f2352h0));
        }
        if (adVarC5.wz(R$styleable.R0, -1) != -1) {
            r3 = 0;
            setHintTextAppearance(adVarC5.wz(R$styleable.R0, 0));
        } else {
            r3 = 0;
        }
        int iWz = adVarC5.wz(R$styleable.I0, (int) r3);
        CharSequence charSequenceW = adVarC5.w(R$styleable.D0);
        boolean zY = adVarC5.y(R$styleable.E0, (boolean) r3);
        ?? r62 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R$layout.f2263fb, linearLayout2, (boolean) r3);
        this.f2887l = r62;
        r62.setId(R$id.f2254x);
        r62.setVisibility(8);
        if (t2.zn.fb(context2)) {
            co.gv((ViewGroup.MarginLayoutParams) r62.getLayoutParams(), (int) r3);
        }
        if (adVarC5.co(R$styleable.F0)) {
            setErrorIconDrawable(adVarC5.fb(R$styleable.F0));
        }
        if (adVarC5.co(R$styleable.G0)) {
            setErrorIconTintList(t2.zn.n3(context2, adVarC5, R$styleable.G0));
        }
        if (adVarC5.co(R$styleable.H0)) {
            setErrorIconTintMode(t.v(adVarC5.f(R$styleable.H0, -1), null));
        }
        r62.setContentDescription(getResources().getText(R$string.f2277a));
        ut.o0((View) r62, 2);
        r62.setClickable(false);
        r62.setPressable(false);
        r62.setFocusable(false);
        int iWz2 = adVarC5.wz(R$styleable.N0, 0);
        boolean zY2 = adVarC5.y(R$styleable.M0, false);
        CharSequence charSequenceW2 = adVarC5.w(R$styleable.L0);
        int iWz3 = adVarC5.wz(R$styleable.Z0, 0);
        CharSequence charSequenceW3 = adVarC5.w(R$styleable.Y0);
        int iWz4 = adVarC5.wz(R$styleable.d1, 0);
        CharSequence charSequenceW4 = adVarC5.w(R$styleable.f2324c1);
        int iWz5 = adVarC5.wz(R$styleable.f2393n1, 0);
        CharSequence charSequenceW5 = adVarC5.w(R$styleable.f2381l1);
        boolean zY3 = adVarC5.y(R$styleable.f2375k0, false);
        setCounterMaxLength(adVarC5.f(R$styleable.f2386m0, -1));
        this.d0 = adVarC5.wz(R$styleable.f2415r0, 0);
        this.c = adVarC5.wz(R$styleable.f2392n0, 0);
        ?? r4 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R$layout.f2270s, (ViewGroup) linearLayout, false);
        this.f2864ap = r4;
        r4.setVisibility(8);
        if (t2.zn.fb(context2)) {
            co.zn((ViewGroup.MarginLayoutParams) r4.getLayoutParams(), 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (adVarC5.co(R$styleable.h1)) {
            setStartIconDrawable(adVarC5.fb(R$styleable.h1));
            if (adVarC5.co(R$styleable.g1)) {
                setStartIconContentDescription(adVarC5.w(R$styleable.g1));
            }
            setStartIconCheckable(adVarC5.y(R$styleable.f1, true));
        }
        if (adVarC5.co(R$styleable.j1)) {
            setStartIconTintList(t2.zn.n3(context2, adVarC5, R$styleable.j1));
        }
        if (adVarC5.co(R$styleable.f2376k1)) {
            setStartIconTintMode(t.v(adVarC5.f(R$styleable.f2376k1, -1), null));
        }
        setBoxBackgroundMode(adVarC5.f(R$styleable.Y, 0));
        ?? r22 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R$layout.f2263fb, (ViewGroup) frameLayout2, false);
        this.tg = r22;
        frameLayout2.addView(r22);
        r22.setVisibility(8);
        if (t2.zn.fb(context2)) {
            co.gv((ViewGroup.MarginLayoutParams) r22.getLayoutParams(), 0);
        }
        sparseArray.append(-1, new b3.y(this));
        sparseArray.append(0, new b3.a(this));
        sparseArray.append(1, new com.google.android.material.textfield.zn(this));
        sparseArray.append(2, new com.google.android.material.textfield.y(this));
        sparseArray.append(3, new com.google.android.material.textfield.n3(this));
        if (adVarC5.co(R$styleable.A0)) {
            setEndIconMode(adVarC5.f(R$styleable.A0, 0));
            if (adVarC5.co(R$styleable.f2462z0)) {
                setEndIconDrawable(adVarC5.fb(R$styleable.f2462z0));
            }
            if (adVarC5.co(R$styleable.f2444w0)) {
                setEndIconContentDescription(adVarC5.w(R$styleable.f2444w0));
            }
            setEndIconCheckable(adVarC5.y(R$styleable.f2441v0, true));
        } else if (adVarC5.co(R$styleable.V0)) {
            setEndIconMode(adVarC5.y(R$styleable.V0, false) ? 1 : 0);
            setEndIconDrawable(adVarC5.fb(R$styleable.U0));
            setEndIconContentDescription(adVarC5.w(R$styleable.T0));
            if (adVarC5.co(R$styleable.W0)) {
                setEndIconTintList(t2.zn.n3(context2, adVarC5, R$styleable.W0));
            }
            if (adVarC5.co(R$styleable.X0)) {
                setEndIconTintMode(t.v(adVarC5.f(R$styleable.X0, -1), null));
            }
        }
        if (!adVarC5.co(R$styleable.V0)) {
            if (adVarC5.co(R$styleable.B0)) {
                setEndIconTintList(t2.zn.n3(context2, adVarC5, R$styleable.B0));
            }
            if (adVarC5.co(R$styleable.C0)) {
                setEndIconTintMode(t.v(adVarC5.f(R$styleable.C0, -1), null));
            }
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.o = appCompatTextView;
        appCompatTextView.setId(R$id.f2239hw);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        ut.g(appCompatTextView, 1);
        linearLayout.addView(r4);
        linearLayout.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2);
        this.oz = appCompatTextView2;
        appCompatTextView2.setId(R$id.f2242j5);
        appCompatTextView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        ut.g(appCompatTextView2, 1);
        linearLayout2.addView(appCompatTextView2);
        linearLayout2.addView(r62);
        linearLayout2.addView(frameLayout2);
        setHelperTextEnabled(zY2);
        setHelperText(charSequenceW2);
        setHelperTextTextAppearance(iWz2);
        setErrorEnabled(zY);
        setErrorTextAppearance(iWz);
        setErrorContentDescription(charSequenceW);
        setCounterTextAppearance(this.d0);
        setCounterOverflowTextAppearance(this.c);
        setPlaceholderText(charSequenceW3);
        setPlaceholderTextAppearance(iWz3);
        setPrefixText(charSequenceW4);
        setPrefixTextAppearance(iWz4);
        setSuffixText(charSequenceW5);
        setSuffixTextAppearance(iWz5);
        if (adVarC5.co(R$styleable.J0)) {
            setErrorTextColor(adVarC5.zn(R$styleable.J0));
        }
        if (adVarC5.co(R$styleable.O0)) {
            setHelperTextColor(adVarC5.zn(R$styleable.O0));
        }
        if (adVarC5.co(R$styleable.S0)) {
            setHintTextColor(adVarC5.zn(R$styleable.S0));
        }
        if (adVarC5.co(R$styleable.f2426t0)) {
            setCounterTextColor(adVarC5.zn(R$styleable.f2426t0));
        }
        if (adVarC5.co(R$styleable.f2408q0)) {
            setCounterOverflowTextColor(adVarC5.zn(R$styleable.f2408q0));
        }
        if (adVarC5.co(R$styleable.a1)) {
            setPlaceholderTextColor(adVarC5.zn(R$styleable.a1));
        }
        if (adVarC5.co(R$styleable.e1)) {
            setPrefixTextColor(adVarC5.zn(R$styleable.e1));
        }
        if (adVarC5.co(R$styleable.f2401o1)) {
            setSuffixTextColor(adVarC5.zn(R$styleable.f2401o1));
        }
        setCounterEnabled(zY3);
        setEnabled(adVarC5.y(R$styleable.S, true));
        adVarC5.i4();
        ut.o0(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            ut.wf(this, 1);
        }
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.tg.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        this.tg.setImageDrawable(drawable);
        ut();
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f2864ap.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.f2864ap.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            f7();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.f2887l.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f2867co.f3());
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.tg.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.tg.setImageDrawable(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
