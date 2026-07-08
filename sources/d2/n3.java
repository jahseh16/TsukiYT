package d2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$style;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.List;
import o.ud;
import w.s;

/* JADX INFO: loaded from: classes.dex */
public class n3 extends o2.zn {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f3165r = R$style.w;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f3166co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3167f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3168p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3169t;
    public boolean w;
    public boolean z;

    /* JADX INFO: renamed from: d2.n3$n3, reason: collision with other inner class name */
    public interface InterfaceC0078n3 {
    }

    public static class y extends ViewGroup.MarginLayoutParams {
        public y(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public y(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public y(int i, int i5) {
            super(i, i5);
        }
    }

    public class zn implements ViewGroup.OnHierarchyChangeListener {
        public static /* synthetic */ ViewGroup.OnHierarchyChangeListener y(zn znVar, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
            throw null;
        }
    }

    private int getChipCount() {
        int i = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    private void setCheckedId(int i) {
        fb(i, true);
    }

    public boolean a() {
        return this.w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            s sVar = (Chip) view;
            if (sVar.isChecked()) {
                int i5 = this.f3166co;
                if (i5 != -1 && this.w) {
                    s(i5, false);
                }
                setCheckedId(sVar.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof y);
    }

    public final void fb(int i, boolean z) {
        this.f3166co = i;
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new y(-2, -2);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new y(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.w) {
            return this.f3166co;
        }
        return -1;
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            s childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.w) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f3167f;
    }

    public int getChipSpacingVertical() {
        return this.f3169t;
    }

    public void gv() {
        this.z = true;
        for (int i = 0; i < getChildCount(); i++) {
            Object childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.z = false;
        setCheckedId(-1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f3166co;
        if (i != -1) {
            s(i, true);
            setCheckedId(this.f3166co);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ud.w2(accessibilityNodeInfo).ap(ud.a.y(getRowCount(), zn() ? getChipCount() : -1, false, a() ? 1 : 2));
    }

    public final void s(int i, boolean z) {
        Object objFindViewById = findViewById(i);
        if (objFindViewById instanceof Chip) {
            this.z = true;
            ((Chip) objFindViewById).setChecked(z);
            this.z = false;
        }
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f3167f != i) {
            this.f3167f = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f3169t != i) {
            this.f3169t = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        zn.y(null, onHierarchyChangeListener);
    }

    public void setSelectionRequired(boolean z) {
        this.f3168p = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // o2.zn
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.w != z) {
            this.w = z;
            gv();
        }
    }

    public int v(@Nullable View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5) instanceof Chip) {
                if (((Chip) getChildAt(i5)) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    @Override // o2.zn
    public boolean zn() {
        return super.zn();
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new y(layoutParams);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setOnCheckedChangeListener(InterfaceC0078n3 interfaceC0078n3) {
    }
}
