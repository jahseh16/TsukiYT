package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R$attr;
import androidx.appcompat.view.menu.fb;
import androidx.appcompat.view.menu.i9;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import ej.s;
import o.ud;
import o2.gv;
import qn.ut;
import ut.wz;
import w.qk;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends gv implements i9.y {
    public static final int[] jz = {R.attr.state_checked};
    public final qn.y en;
    public Drawable f7;
    public final CheckedTextView j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public int f2768j5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2769k;
    public boolean o;
    public FrameLayout oz;
    public ColorStateList q9;
    public boolean qn;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public fb f2770ut;

    public class y extends qn.y {
        public y() {
        }

        public void fb(View view, @NonNull ud udVar) {
            super.fb(view, udVar);
            udVar.nf(NavigationMenuItemView.this.o);
        }
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setActionView(@Nullable View view) {
        if (view != null) {
            if (this.oz == null) {
                this.oz = (FrameLayout) ((ViewStub) findViewById(R$id.f2229a)).inflate();
            }
            this.oz.removeAllViews();
            this.oz.addView(view);
        }
    }

    public final void fh() {
        if (mg()) {
            this.j.setVisibility(8);
            FrameLayout frameLayout = this.oz;
            if (frameLayout != null) {
                LinearLayoutCompat.y layoutParams = frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.oz.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.j.setVisibility(0);
        FrameLayout frameLayout2 = this.oz;
        if (frameLayout2 != null) {
            LinearLayoutCompat.y layoutParams2 = frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.oz.setLayoutParams(layoutParams2);
        }
    }

    public fb getItemData() {
        return this.f2770ut;
    }

    public final boolean mg() {
        return this.f2770ut.getTitle() == null && this.f2770ut.getIcon() == null && this.f2770ut.getActionView() != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super/*android.view.ViewGroup*/.onCreateDrawableState(i + 1);
        fb fbVar = this.f2770ut;
        if (fbVar != null && fbVar.isCheckable() && this.f2770ut.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, jz);
        }
        return iArrOnCreateDrawableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final StateListDrawable rz() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R$attr.f306x4, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(jz, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.o != z) {
            this.o = z;
            this.en.t(this.j, 2048);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setChecked(boolean z) {
        refreshDrawableState();
        this.j.setChecked(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (this.f2769k) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = a8.y.mt(drawable).mutate();
                a8.y.xc(drawable, this.q9);
            }
            int i = this.f2768j5;
            drawable.setBounds(0, 0, i, i);
        } else if (this.qn) {
            if (this.f7 == null) {
                Drawable drawableA = s.a(getResources(), R$drawable.f2226fb, getContext().getTheme());
                this.f7 = drawableA;
                if (drawableA != null) {
                    int i5 = this.f2768j5;
                    drawableA.setBounds(0, 0, i5, i5);
                }
            }
            drawable = this.f7;
        }
        wz.i9(this.j, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.j.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f2768j5 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.q9 = colorStateList;
        this.f2769k = colorStateList != null;
        fb fbVar = this.f2770ut;
        if (fbVar != null) {
            setIcon(fbVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.j.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.qn = z;
    }

    public void setTextAppearance(int i) {
        wz.xc(this.j, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.j.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.j.setText(charSequence);
    }

    public boolean v() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void zn(@NonNull fb fbVar, int i) {
        this.f2770ut = fbVar;
        if (fbVar.getItemId() > 0) {
            setId(fbVar.getItemId());
        }
        setVisibility(fbVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            ut.u0(this, rz());
        }
        setCheckable(fbVar.isCheckable());
        setChecked(fbVar.isChecked());
        setEnabled(fbVar.isEnabled());
        setTitle(fbVar.getTitle());
        setIcon(fbVar.getIcon());
        setActionView(fbVar.getActionView());
        setContentDescription(fbVar.getContentDescription());
        qk.y(this, fbVar.getTooltipText());
        fh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        y yVar = new y();
        this.en = yVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R$layout.f2259a, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R$dimen.f2218v));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R$id.f2237fb);
        this.j = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ut.g3(checkedTextView, yVar);
    }
}
