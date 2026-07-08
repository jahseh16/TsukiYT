package b3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public final class gv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Animator f1306a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f1307c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f1308co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1309f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final float f1310fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f1311gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public CharSequence f1312i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    @Nullable
    public TextView f1313mt;

    @NonNull
    public final TextInputLayout n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1314p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Typeface f1315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public TextView f1317t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    @Nullable
    public CharSequence f1318tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public FrameLayout f1319v;
    public CharSequence w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public int f1320wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    @Nullable
    public ColorStateList f1321xc;
    public final Context y;

    @Nullable
    public ColorStateList z;
    public LinearLayout zn;

    public class y extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final /* synthetic */ TextView f1322gv;
        public final /* synthetic */ TextView n3;
        public final /* synthetic */ int y;
        public final /* synthetic */ int zn;

        public y(int i, TextView textView, int i5, TextView textView2) {
            this.y = i;
            this.n3 = textView;
            this.zn = i5;
            this.f1322gv = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            gv.this.f1316s = this.y;
            gv.this.f1306a = null;
            TextView textView = this.n3;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.zn == 1 && gv.this.f1317t != null) {
                    gv.this.f1317t.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f1322gv;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f1322gv.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f1322gv;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public gv(@NonNull TextInputLayout textInputLayout) {
        this.y = textInputLayout.getContext();
        this.n3 = textInputLayout;
        this.f1310fb = r0.getResources().getDimensionPixelSize(R$dimen.f2205i9);
    }

    public final boolean a() {
        return (this.zn == null || this.n3.getEditText() == null) ? false : true;
    }

    public void a8(Typeface typeface) {
        if (typeface != this.f1315r) {
            this.f1315r = typeface;
            ud(this.f1317t, typeface);
            ud(this.f1313mt, typeface);
        }
    }

    public final boolean b(@Nullable TextView textView, @Nullable CharSequence charSequence) {
        return ut.q9(this.n3) && this.n3.isEnabled() && !(this.f1307c5 == this.f1316s && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public void c(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.zn == null) {
            return;
        }
        if (!i4(i) || (frameLayout = this.f1319v) == null) {
            this.zn.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i5 = this.f1311gv - 1;
        this.f1311gv = i5;
        x(this.zn, i5);
    }

    public final ObjectAnimator c5(TextView textView, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(167L);
        objectAnimatorOfFloat.setInterpolator(t1.y.y);
        return objectAnimatorOfFloat;
    }

    public final int co(boolean z, int i, int i5) {
        return z ? this.y.getResources().getDimensionPixelSize(i) : i5;
    }

    public void d(int i) {
        this.f1308co = i;
        TextView textView = this.f1313mt;
        if (textView != null) {
            ut.wz.xc(textView, i);
        }
    }

    public final void d0(int i, int i5) {
        TextView textViewT;
        TextView textViewT2;
        if (i == i5) {
            return;
        }
        if (i5 != 0 && (textViewT2 = t(i5)) != null) {
            textViewT2.setVisibility(0);
            textViewT2.setAlpha(1.0f);
        }
        if (i != 0 && (textViewT = t(i)) != null) {
            textViewT.setVisibility(4);
            if (i == 1) {
                textViewT.setText((CharSequence) null);
            }
        }
        this.f1316s = i5;
    }

    public void ej(@Nullable ColorStateList colorStateList) {
        this.z = colorStateList;
        TextView textView = this.f1313mt;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public boolean f() {
        return x4(this.f1307c5);
    }

    public boolean f3() {
        return this.f1309f;
    }

    public void fb() {
        Animator animator = this.f1306a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void fh(@Nullable CharSequence charSequence) {
        this.f1318tl = charSequence;
        TextView textView = this.f1317t;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void gv(TextView textView, int i) {
        if (this.zn == null && this.f1319v == null) {
            LinearLayout linearLayout = new LinearLayout(this.y);
            this.zn = linearLayout;
            linearLayout.setOrientation(0);
            this.n3.addView(this.zn, -1, -2);
            this.f1319v = new FrameLayout(this.y);
            this.zn.addView(this.f1319v, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.n3.getEditText() != null) {
                v();
            }
        }
        if (i4(i)) {
            this.f1319v.setVisibility(0);
            this.f1319v.addView(textView);
        } else {
            this.zn.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.zn.setVisibility(0);
        this.f1311gv++;
    }

    public boolean i4(int i) {
        return i == 0 || i == 1;
    }

    public final ObjectAnimator i9(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f1310fb, 0.0f);
        objectAnimatorOfFloat.setDuration(217L);
        objectAnimatorOfFloat.setInterpolator(t1.y.f8180gv);
        return objectAnimatorOfFloat;
    }

    public void k5(CharSequence charSequence) {
        fb();
        this.f1312i9 = charSequence;
        this.f1317t.setText(charSequence);
        int i = this.f1316s;
        if (i != 1) {
            this.f1307c5 = 1;
        }
        vl(i, this.f1307c5, b(this.f1317t, charSequence));
    }

    public void mg(int i) {
        this.f1320wz = i;
        TextView textView = this.f1317t;
        if (textView != null) {
            this.n3.dm(textView, i);
        }
    }

    public int mt() {
        TextView textView = this.f1313mt;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public boolean n() {
        return this.f1314p;
    }

    public CharSequence p() {
        return this.w;
    }

    public void r() {
        fb();
        int i = this.f1316s;
        if (i == 2) {
            this.f1307c5 = 0;
        }
        vl(i, this.f1307c5, b(this.f1313mt, null));
    }

    public void rz(boolean z) {
        if (this.f1309f == z) {
            return;
        }
        fb();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.y);
            this.f1317t = appCompatTextView;
            appCompatTextView.setId(R$id.f2243k5);
            this.f1317t.setTextAlignment(5);
            Typeface typeface = this.f1315r;
            if (typeface != null) {
                this.f1317t.setTypeface(typeface);
            }
            mg(this.f1320wz);
            ta(this.f1321xc);
            fh(this.f1318tl);
            this.f1317t.setVisibility(4);
            ut.g(this.f1317t, 1);
            gv(this.f1317t, 0);
        } else {
            z();
            c(this.f1317t, 0);
            this.f1317t = null;
            this.n3.rb();
            this.n3.wf();
        }
        this.f1309f = z;
    }

    public final void s(@NonNull List<Animator> list, boolean z, @Nullable TextView textView, int i, int i5, int i8) {
        if (textView == null || !z) {
            return;
        }
        if (i == i8 || i == i5) {
            list.add(c5(textView, i8 == i));
            if (i8 == i) {
                list.add(i9(textView));
            }
        }
    }

    @Nullable
    public final TextView t(int i) {
        if (i == 1) {
            return this.f1317t;
        }
        if (i != 2) {
            return null;
        }
        return this.f1313mt;
    }

    public void ta(@Nullable ColorStateList colorStateList) {
        this.f1321xc = colorStateList;
        TextView textView = this.f1317t;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    @Nullable
    public CharSequence tl() {
        return this.f1318tl;
    }

    public final void ud(@Nullable TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public void v() {
        if (a()) {
            EditText editText = this.n3.getEditText();
            boolean zFb = t2.zn.fb(this.y);
            ut.cy(this.zn, co(zFb, R$dimen.f2221x4, ut.a8(editText)), co(zFb, R$dimen.f2204i4, this.y.getResources().getDimensionPixelSize(R$dimen.f2211r)), co(zFb, R$dimen.f2221x4, ut.ud(editText)), 0);
        }
    }

    public final void vl(int i, int i5, boolean z) {
        if (i == i5) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f1306a = animatorSet;
            ArrayList arrayList = new ArrayList();
            s(arrayList, this.f1314p, this.f1313mt, 2, i, i5);
            s(arrayList, this.f1309f, this.f1317t, 1, i, i5);
            t1.n3.y(animatorSet, arrayList);
            animatorSet.addListener(new y(i5, t(i), i, t(i5)));
            animatorSet.start();
        } else {
            d0(i, i5);
        }
        this.n3.rb();
        this.n3.g(z);
        this.n3.wf();
    }

    @Nullable
    public ColorStateList w() {
        TextView textView = this.f1317t;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    @Nullable
    public CharSequence wz() {
        return this.f1312i9;
    }

    public final void x(@NonNull ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean x4(int i) {
        return (i != 1 || this.f1317t == null || TextUtils.isEmpty(this.f1312i9)) ? false : true;
    }

    public int xc() {
        TextView textView = this.f1317t;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public void yt(CharSequence charSequence) {
        fb();
        this.w = charSequence;
        this.f1313mt.setText(charSequence);
        int i = this.f1316s;
        if (i != 2) {
            this.f1307c5 = 2;
        }
        vl(i, this.f1307c5, b(this.f1313mt, charSequence));
    }

    public void z() {
        this.f1312i9 = null;
        fb();
        if (this.f1316s == 1) {
            if (!this.f1314p || TextUtils.isEmpty(this.w)) {
                this.f1307c5 = 0;
            } else {
                this.f1307c5 = 2;
            }
        }
        vl(this.f1316s, this.f1307c5, b(this.f1317t, null));
    }

    public void z6(boolean z) {
        if (this.f1314p == z) {
            return;
        }
        fb();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.y);
            this.f1313mt = appCompatTextView;
            appCompatTextView.setId(R$id.f2257yt);
            this.f1313mt.setTextAlignment(5);
            Typeface typeface = this.f1315r;
            if (typeface != null) {
                this.f1313mt.setTypeface(typeface);
            }
            this.f1313mt.setVisibility(4);
            ut.g(this.f1313mt, 1);
            d(this.f1308co);
            ej(this.z);
            gv(this.f1313mt, 1);
        } else {
            r();
            c(this.f1313mt, 1);
            this.f1313mt = null;
            this.n3.rb();
            this.n3.wf();
        }
        this.f1314p = z;
    }
}
