package com.google.android.material.chip;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.R$attr;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.chip.y;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import o.ud;
import o2.t;
import qn.ut;
import t2.gv;
import t2.v;
import w.s;
import y2.f;
import y2.wz;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends s implements y.InterfaceC0064y, wz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f2615b = R$style.f2301p;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public static final Rect f2616hw = new Rect();

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public static final int[] f2617j5 = {R.attr.state_selected};
    public static final int[] qn = {R.attr.state_checkable};
    public int c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public boolean f2618co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f2619d;
    public int d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final RectF f2620ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public InsetDrawable f2621f;
    public boolean f3;

    @NonNull
    public final zn fh;
    public boolean n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public CompoundButton.OnCheckedChangeListener f2622p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2623r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public com.google.android.material.chip.y f2624s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public RippleDrawable f2625t;

    @Nullable
    public View.OnClickListener w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v f2626x;
    public boolean z;

    public class n3 extends ViewOutlineProvider {
        public n3() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, @NonNull Outline outline) {
            if (Chip.this.f2624s != null) {
                Chip.this.f2624s.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    public class y extends v {
        public y() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.TextView, com.google.android.material.chip.Chip] */
        @Override // t2.v
        public void n3(@NonNull Typeface typeface, boolean z) {
            ?? r1 = Chip.this;
            r1.setText(r1.f2624s.gd() ? Chip.this.f2624s.gf() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }

        @Override // t2.v
        public void y(int i) {
        }
    }

    public class zn extends k.y {
        /* JADX WARN: Multi-variable type inference failed */
        public zn(Chip chip) {
            super(chip);
        }

        public boolean a8(int i, int i5, Bundle bundle) {
            if (i5 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.z();
            }
            return false;
        }

        public int fh(float f3, float f4) {
            return (Chip.this.wz() && Chip.this.getCloseIconTouchBounds().contains(f3, f4)) ? 1 : 0;
        }

        public void k5(@NonNull ud udVar) {
            udVar.nf(Chip.this.mt());
            udVar.s8(Chip.this.isClickable());
            if (Chip.this.mt() || Chip.this.isClickable()) {
                udVar.e(Chip.this.mt() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                udVar.e("android.view.View");
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                udVar.gq(text);
            } else {
                udVar.yc(text);
            }
        }

        public void rz(@NonNull List<Integer> list) {
            list.add(0);
            if (Chip.this.wz() && Chip.this.co() && Chip.this.w != null) {
                list.add(1);
            }
        }

        public void vl(int i, boolean z) {
            if (i == 1) {
                Chip.this.f3 = z;
                Chip.this.refreshDrawableState();
            }
        }

        public void yt(int i, @NonNull ud udVar) {
            CharSequence charSequence = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
            if (i != 1) {
                udVar.yc(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
                udVar.eb(Chip.f2616hw);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                udVar.yc(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                int i5 = R$string.f2283i9;
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                udVar.yc(context.getString(i5, charSequence).trim());
            }
            udVar.eb(Chip.this.getCloseIconTouchBoundsInt());
            udVar.n3(ud.y.c5);
            udVar.rb(Chip.this.isEnabled());
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.f2167fb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        this.f2620ej.setEmpty();
        if (wz() && this.w != null) {
            this.f2624s.yk(this.f2620ej);
        }
        return this.f2620ej;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f2619d.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f2619d;
    }

    @Nullable
    private gv getTextAppearance() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.bv();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setCloseIconHovered(boolean z) {
        if (this.f2623r != z) {
            this.f2623r = z;
            refreshDrawableState();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setCloseIconPressed(boolean z) {
        if (this.z != z) {
            this.z = z;
            refreshDrawableState();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        this.f2625t = new RippleDrawable(u2.n3.gv(this.f2624s.wm()), getBackgroundDrawable(), null);
        this.f2624s.cp(false);
        ut.u0(this, this.f2625t);
        d0();
    }

    public final void c5(@NonNull com.google.android.material.chip.y yVar) {
        yVar.xu(this);
    }

    public boolean co() {
        com.google.android.material.chip.y yVar = this.f2624s;
        return yVar != null && yVar.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d0() {
        com.google.android.material.chip.y yVar;
        if (TextUtils.isEmpty(getText()) || (yVar = this.f2624s) == null) {
            return;
        }
        int iQk = (int) (yVar.qk() + this.f2624s.fc() + this.f2624s.yg());
        int iOa = (int) (this.f2624s.oa() + this.f2624s.br() + this.f2624s.ra());
        if (this.f2621f != null) {
            Rect rect = new Rect();
            this.f2621f.getPadding(rect);
            iOa += rect.left;
            iQk += rect.right;
        }
        ut.cy(this, iOa, getPaddingTop(), iQk, getPaddingBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return tl(motionEvent) || this.fh.x4(motionEvent) || super/*android.widget.CheckBox*/.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.fh.i4(keyEvent) || this.fh.d0() == Integer.MIN_VALUE) {
            return super/*android.widget.CheckBox*/.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.y yVar = this.f2624s;
        if ((yVar == null || !yVar.c8()) ? false : this.f2624s.yh(i9())) {
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean f(int i) {
        this.d0 = i;
        if (!x4()) {
            if (this.f2621f != null) {
                r();
            } else {
                n();
            }
            return false;
        }
        int iMax = Math.max(0, i - this.f2624s.getIntrinsicHeight());
        int iMax2 = Math.max(0, i - this.f2624s.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f2621f != null) {
                r();
            } else {
                n();
            }
            return false;
        }
        int i5 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i8 = iMax > 0 ? iMax / 2 : 0;
        if (this.f2621f != null) {
            Rect rect = new Rect();
            this.f2621f.getPadding(rect);
            if (rect.top == i8 && rect.bottom == i8 && rect.left == i5 && rect.right == i5) {
                n();
                return true;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        p(i5, i8, i5, i8);
        n();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f3() {
        if (wz() && co() && this.w != null) {
            ut.g3(this, this.fh);
        } else {
            ut.g3(this, (qn.y) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void fh() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            paint.drawableState = yVar.getState();
        }
        gv textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.i9(getContext(), paint, this.f2626x);
        }
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f2621f;
        return insetDrawable == null ? this.f2624s : insetDrawable;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.xb();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.wf();
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.ad();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return Math.max(0.0f, yVar.cy());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f2624s;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.qk();
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getChipIcon() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.qj();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.l();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.gq();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.vp();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.oa();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.w9();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.w2();
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Nullable
    public Drawable getCloseIcon() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.x5();
        }
        return null;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.q5();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.mp();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.le();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.cs();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.ix();
        }
        return null;
    }

    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.vn();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void getFocusedRect(@NonNull Rect rect) {
        if (this.fh.d0() == 1 || this.fh.f3() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super/*android.widget.CheckBox*/.getFocusedRect(rect);
        }
    }

    @Nullable
    public t1.s getHideMotionSpec() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.j3();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.ne();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.q();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.wm();
        }
        return null;
    }

    @NonNull
    public f getShapeAppearanceModel() {
        return this.f2624s.rz();
    }

    @Nullable
    public t1.s getShowMotionSpec() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.nd();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.fc();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            return yVar.br();
        }
        return 0.0f;
    }

    public final void i4(@Nullable com.google.android.material.chip.y yVar) {
        if (yVar != null) {
            yVar.xu(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    @NonNull
    public final int[] i9() {
        ?? IsEnabled = isEnabled();
        int i = IsEnabled;
        if (this.f3) {
            i = IsEnabled + 1;
        }
        int i5 = i;
        if (this.f2623r) {
            i5 = i + 1;
        }
        int i8 = i5;
        if (this.z) {
            i8 = i5 + 1;
        }
        int i10 = i8;
        if (isChecked()) {
            i10 = i8 + 1;
        }
        int[] iArr = new int[i10];
        int i11 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i11 = 1;
        }
        if (this.f3) {
            iArr[i11] = 16842908;
            i11++;
        }
        if (this.f2623r) {
            iArr[i11] = 16843623;
            i11++;
        }
        if (this.z) {
            iArr[i11] = 16842919;
            i11++;
        }
        if (isChecked()) {
            iArr[i11] = 16842913;
        }
        return iArr;
    }

    public boolean mt() {
        com.google.android.material.chip.y yVar = this.f2624s;
        return yVar != null && yVar.n7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n() {
        if (u2.n3.y) {
            c();
            return;
        }
        this.f2624s.cp(true);
        ut.u0(this, getBackgroundDrawable());
        d0();
        t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.widget.CheckBox*/.onAttachedToWindow();
        y2.s.a(this, this.f2624s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super/*android.widget.CheckBox*/.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2617j5);
        }
        if (mt()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, qn);
        }
        return iArrOnCreateDrawableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super/*android.widget.CheckBox*/.onFocusChanged(z, i, rect);
        this.fh.ud(z, i, rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super/*android.widget.CheckBox*/.onHoverEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super/*android.widget.CheckBox*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (mt() || isClickable()) {
            accessibilityNodeInfo.setClassName(mt() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(mt());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof d2.n3) {
            d2.n3 n3Var = (d2.n3) getParent();
            ud.w2(accessibilityNodeInfo).yg(ud.fb.y(n3Var.n3(this), 1, n3Var.zn() ? n3Var.v(this) : -1, 1, false, isChecked()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    @TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
    public PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @TargetApi(ConnectionResult.SIGN_IN_FAILED)
    public void onRtlPropertiesChanged(int i) {
        super/*android.widget.CheckBox*/.onRtlPropertiesChanged(i);
        if (this.c != i) {
            this.c = i;
            d0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L35
            goto L40
        L21:
            boolean r0 = r5.z
            if (r0 == 0) goto L40
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = 1
            goto L41
        L2c:
            boolean r0 = r5.z
            if (r0 == 0) goto L35
            r5.z()
            r0 = 1
            goto L36
        L35:
            r0 = 0
        L36:
            r5.setCloseIconPressed(r3)
            goto L41
        L3a:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
            goto L2a
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super/*android.widget.CheckBox*/.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            r2 = 0
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i, int i5, int i8, int i10) {
        this.f2621f = new InsetDrawable((Drawable) this.f2624s, i, i5, i8, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r() {
        if (this.f2621f != null) {
            this.f2621f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            n();
        }
    }

    public final void rz(@Nullable AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2625t) {
            super/*android.widget.CheckBox*/.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2625t) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.ic(z);
        }
    }

    public void setCheckableResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.gn(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar == null) {
            this.f2618co = z;
            return;
        }
        if (yVar.n7()) {
            boolean zIsChecked = isChecked();
            super/*android.widget.CheckBox*/.setChecked(z);
            if (zIsChecked == z || (onCheckedChangeListener = this.f2622p) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.vc(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.p1(i);
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.i(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.rv(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.dp(i);
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.cx(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.vh(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f3) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.hy(f3);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.xq(i);
        }
    }

    public void setChipDrawable(@NonNull com.google.android.material.chip.y yVar) {
        com.google.android.material.chip.y yVar2 = this.f2624s;
        if (yVar2 != yVar) {
            i4(yVar2);
            this.f2624s = yVar;
            yVar.p2(false);
            c5(this.f2624s);
            f(this.d0);
        }
    }

    public void setChipEndPadding(float f3) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.jt(f3);
        }
    }

    public void setChipEndPaddingResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.jb(i);
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.sw(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.v1(i);
        }
    }

    public void setChipIconSize(float f3) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.gi(f3);
        }
    }

    public void setChipIconSizeResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.zx(i);
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.l0(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.wo(i);
        }
    }

    public void setChipIconVisible(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.zh(i);
        }
    }

    public void setChipMinHeight(float f3) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.ob(f3);
        }
    }

    public void setChipMinHeightResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.vb(i);
        }
    }

    public void setChipStartPadding(float f3) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.fq(f3);
        }
    }

    public void setChipStartPaddingResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.sx(i);
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.ux(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.vd(i);
        }
    }

    public void setChipStrokeWidth(float f3) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.t5(f3);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.rt(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
        setText(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.fp(drawable);
        }
        f3();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.hj(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f3) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.sh(f3);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.hf(i);
        }
    }

    public void setCloseIconResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.w7(i);
        }
        f3();
    }

    public void setCloseIconSize(float f3) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.ou(f3);
        }
    }

    public void setCloseIconSizeResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.vi(i);
        }
    }

    public void setCloseIconStartPadding(float f3) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.l3(f3);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.e5(i);
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.nh(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.i1(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super/*android.widget.CheckBox*/.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super/*android.widget.CheckBox*/.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i5, int i8, int i10) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super/*android.widget.CheckBox*/.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i5, i8, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i5, int i8, int i10) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super/*android.widget.CheckBox*/.setCompoundDrawablesWithIntrinsicBounds(i, i5, i8, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setElevation(float f3) {
        super/*android.widget.CheckBox*/.setElevation(f3);
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.q9(f3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f2624s == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super/*android.widget.CheckBox*/.setEllipsize(truncateAt);
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.z8(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.n = z;
        f(this.d0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super/*android.widget.CheckBox*/.setGravity(i);
        }
    }

    public void setHideMotionSpec(@Nullable t1.s sVar) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.ih(sVar);
        }
    }

    public void setHideMotionSpecResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.jm(i);
        }
    }

    public void setIconEndPadding(float f3) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.mq(f3);
        }
    }

    public void setIconEndPaddingResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.x0(i);
        }
    }

    public void setIconStartPadding(float f3) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.mc(f3);
        }
    }

    public void setIconStartPaddingResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.ez(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLayoutDirection(int i) {
        if (this.f2624s == null) {
            return;
        }
        super/*android.widget.CheckBox*/.setLayoutDirection(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super/*android.widget.CheckBox*/.setLines(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super/*android.widget.CheckBox*/.setMaxLines(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMaxWidth(int i) {
        super/*android.widget.CheckBox*/.setMaxWidth(i);
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.wb(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super/*android.widget.CheckBox*/.setMinLines(i);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f2622p = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.w = onClickListener;
        f3();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.j4(colorStateList);
        }
        if (this.f2624s.im()) {
            return;
        }
        c();
    }

    public void setRippleColorResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.t7(i);
            if (this.f2624s.im()) {
                return;
            }
            c();
        }
    }

    @Override // y2.wz
    public void setShapeAppearanceModel(@NonNull f fVar) {
        this.f2624s.setShapeAppearanceModel(fVar);
    }

    public void setShowMotionSpec(@Nullable t1.s sVar) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.iu(sVar);
        }
    }

    public void setShowMotionSpecResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.cw(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super/*android.widget.CheckBox*/.setSingleLine(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        super/*android.widget.CheckBox*/.setText(yVar.gd() ? null : charSequence, bufferType);
        com.google.android.material.chip.y yVar2 = this.f2624s;
        if (yVar2 != null) {
            yVar2.nz(charSequence);
        }
    }

    public void setTextAppearance(@Nullable gv gvVar) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.l8(gvVar);
        }
        fh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f3) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.wv(f3);
        }
    }

    public void setTextEndPaddingResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.rk(i);
        }
    }

    public void setTextStartPadding(float f3) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.bx(f3);
        }
    }

    public void setTextStartPaddingResource(int i) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.ja(i);
        }
    }

    public final void t() {
        if (getBackgroundDrawable() == this.f2621f && this.f2624s.getCallback() == null) {
            this.f2624s.setCallback(this.f2621f);
        }
    }

    @SuppressLint({"PrivateApi"})
    public final boolean tl(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = k.y.class.getDeclaredField("tl");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.fh)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = k.y.class.getDeclaredMethod("ut", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.fh, Integer.MIN_VALUE);
                    return true;
                }
            } catch (IllegalAccessException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            } catch (NoSuchFieldException e5) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e5);
            } catch (NoSuchMethodException e6) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e6);
            } catch (InvocationTargetException e8) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e8);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w() {
        setOutlineProvider(new n3());
    }

    public final boolean wz() {
        com.google.android.material.chip.y yVar = this.f2624s;
        return (yVar == null || yVar.x5() == null) ? false : true;
    }

    public boolean x4() {
        return this.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void xc(Context context, @Nullable AttributeSet attributeSet, int i) {
        TypedArray typedArrayS = o2.f.s(context, attributeSet, R$styleable.f2459yg, i, f2615b, new int[0]);
        this.n = typedArrayS.getBoolean(R$styleable.f2367ix, false);
        this.d0 = (int) Math.ceil(typedArrayS.getDimension(R$styleable.f2380l, (float) Math.ceil(t.n3(getContext(), 48))));
        typedArrayS.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.chip.y.InterfaceC0064y
    public void y() {
        f(this.d0);
        requestLayout();
        invalidateOutline();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean z() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.w;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.fh.oz(1, 1);
        return z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        int i5 = f2615b;
        super(e3.y.zn(context, attributeSet, i, i5), attributeSet, i);
        this.f2619d = new Rect();
        this.f2620ej = new RectF();
        this.f2626x = new y();
        Context context2 = getContext();
        rz(attributeSet);
        com.google.android.material.chip.y yVarM = com.google.android.material.chip.y.m(context2, attributeSet, i, i5);
        xc(context2, attributeSet, i);
        setChipDrawable(yVarM);
        yVarM.q9(ut.n(this));
        TypedArray typedArrayS = o2.f.s(context2, attributeSet, R$styleable.f2459yg, i, i5, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(t2.zn.y(context2, typedArrayS, R$styleable.f2419rb));
        }
        boolean zHasValue = typedArrayS.hasValue(R$styleable.f2369j3);
        typedArrayS.recycle();
        this.fh = new zn(this);
        f3();
        if (!zHasValue) {
            w();
        }
        setChecked(this.f2618co);
        setText(yVarM.gf());
        setEllipsize(yVarM.vn());
        fh();
        if (!this.f2624s.gd()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        d0();
        if (x4()) {
            setMinHeight(this.d0);
        }
        this.c = ut.ta(this);
    }

    public void setCloseIconVisible(boolean z) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.eu(z);
        }
        f3();
    }

    public void setCheckedIconVisible(boolean z) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.hr(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.hb(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super/*android.widget.CheckBox*/.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super/*android.widget.CheckBox*/.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextAppearance(Context context, int i) {
        super/*android.widget.CheckBox*/.setTextAppearance(context, i);
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.xh(i);
        }
        fh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextAppearance(int i) {
        super/*android.widget.CheckBox*/.setTextAppearance(i);
        com.google.android.material.chip.y yVar = this.f2624s;
        if (yVar != null) {
            yVar.xh(i);
        }
        fh();
    }
}
