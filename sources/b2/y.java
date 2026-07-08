package b2;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import f.n3;
import y2.f;
import y2.wz;

/* JADX INFO: loaded from: classes.dex */
public class y extends CardView implements Checkable, wz {
    public boolean f3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1305r;
    public boolean z;
    public static final int[] n = {R.attr.state_checkable};
    public static final int[] c = {R.attr.state_checked};
    public static final int[] d0 = {R$attr.f2185z6};
    public static final int fh = R$style.f2309xc;

    /* JADX INFO: renamed from: b2.y$y, reason: collision with other inner class name */
    public interface InterfaceC0037y {
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    public boolean a() {
        return false;
    }

    public boolean fb() {
        return this.f3;
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        throw null;
    }

    public int getCheckedIconMargin() {
        throw null;
    }

    public int getCheckedIconSize() {
        throw null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    @NonNull
    public f getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f1305r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, n);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, c);
        }
        if (fb()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, d0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.z) {
            throw null;
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f3) {
        super.setCardElevation(f3);
        throw null;
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z) {
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f1305r != z) {
            toggle();
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        throw null;
    }

    public void setCheckedIconMargin(int i) {
        throw null;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i == -1) {
            return;
        }
        getResources().getDimensionPixelSize(i);
        throw null;
    }

    public void setCheckedIconResource(int i) {
        n3.gv(getContext(), i);
        throw null;
    }

    public void setCheckedIconSize(int i) {
        throw null;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i == 0) {
            return;
        }
        getResources().getDimensionPixelSize(i);
        throw null;
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
    }

    public void setDragged(boolean z) {
        if (this.f3 != z) {
            this.f3 = z;
            refreshDrawableState();
            v();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f3) {
        super.setMaxCardElevation(f3);
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        throw null;
    }

    public void setProgress(float f3) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f3) {
        super.setRadius(f3);
        throw null;
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i) {
        n3.zn(getContext(), i);
        throw null;
    }

    @Override // y2.wz
    public void setShapeAppearanceModel(@NonNull f fVar) {
        setClipToOutline(fVar.r(getBoundsAsRectF()));
        throw null;
    }

    public void setStrokeColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    public void setStrokeWidth(int i) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        throw null;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (a() && isEnabled()) {
            this.f1305r = !this.f1305r;
            refreshDrawableState();
            v();
        }
    }

    public final void v() {
        if (Build.VERSION.SDK_INT > 26) {
            throw null;
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setOnCheckedChangeListener(@Nullable InterfaceC0037y interfaceC0037y) {
    }
}
