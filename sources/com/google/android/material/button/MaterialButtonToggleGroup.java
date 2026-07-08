package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import o.ud;
import o2.t;
import qn.co;
import qn.ut;
import y2.f;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final int f3 = R$style.f2308x4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f2604r = "MaterialButtonToggleGroup";

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public boolean f2605co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Comparator<MaterialButton> f2606f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final a f2607fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2608p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinkedHashSet<v> f2609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Integer[] f2610t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final zn f2611v;
    public boolean w;
    public final List<gv> y;
    public int z;

    public class a implements MaterialButton.n3 {
        public a() {
        }

        @Override // com.google.android.material.button.MaterialButton.n3
        public void y(@NonNull MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        public /* synthetic */ a(MaterialButtonToggleGroup materialButtonToggleGroup, y yVar) {
            this();
        }
    }

    public static class gv {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final y2.zn f2612v = new y2.y(0.0f);

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public y2.zn f2613gv;
        public y2.zn n3;
        public y2.zn y;
        public y2.zn zn;

        public gv(y2.zn znVar, y2.zn znVar2, y2.zn znVar3, y2.zn znVar4) {
            this.y = znVar;
            this.n3 = znVar3;
            this.zn = znVar4;
            this.f2613gv = znVar2;
        }

        public static gv a(gv gvVar) {
            y2.zn znVar = gvVar.y;
            y2.zn znVar2 = f2612v;
            return new gv(znVar, znVar2, gvVar.n3, znVar2);
        }

        public static gv gv(gv gvVar) {
            y2.zn znVar = f2612v;
            return new gv(znVar, znVar, gvVar.n3, gvVar.zn);
        }

        public static gv n3(gv gvVar, View view) {
            return t.gv(view) ? zn(gvVar) : gv(gvVar);
        }

        public static gv v(gv gvVar, View view) {
            return t.gv(view) ? gv(gvVar) : zn(gvVar);
        }

        public static gv y(gv gvVar) {
            y2.zn znVar = f2612v;
            return new gv(znVar, gvVar.f2613gv, znVar, gvVar.zn);
        }

        public static gv zn(gv gvVar) {
            y2.zn znVar = gvVar.y;
            y2.zn znVar2 = gvVar.f2613gv;
            y2.zn znVar3 = f2612v;
            return new gv(znVar, znVar2, znVar3, znVar3);
        }
    }

    public class n3 extends qn.y {
        public n3() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void fb(View view, @NonNull ud udVar) {
            super.fb(view, udVar);
            udVar.yg(ud.fb.y(0, 1, MaterialButtonToggleGroup.this.wz(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public interface v {
        void y(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    public class y implements Comparator<MaterialButton> {
        public y() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    public class zn implements MaterialButton.y {
        public zn() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.button.MaterialButton.y
        public void y(@NonNull MaterialButton materialButton, boolean z) {
            if (MaterialButtonToggleGroup.this.w) {
                return;
            }
            if (MaterialButtonToggleGroup.this.f2608p) {
                MaterialButtonToggleGroup.this.z = z ? materialButton.getId() : -1;
            }
            if (MaterialButtonToggleGroup.this.r(materialButton.getId(), z)) {
                MaterialButtonToggleGroup.this.t(materialButton.getId(), materialButton.isChecked());
            }
            MaterialButtonToggleGroup.this.invalidate();
        }

        public /* synthetic */ zn(MaterialButtonToggleGroup materialButtonToggleGroup, y yVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.f2183x4);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (w(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (w(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if ((getChildAt(i5) instanceof MaterialButton) && w(i5)) {
                i++;
            }
        }
        return i;
    }

    private void setCheckedId(int i) {
        this.z = i;
        t(i, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(ut.tl());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.y(this.f2611v);
        materialButton.setOnPressedChangeListenerInternal(this.f2607fb);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public static void z(f.n3 n3Var, @Nullable gv gvVar) {
        if (gvVar == null) {
            n3Var.xc(0.0f);
        } else {
            n3Var.rz(gvVar.y).r(gvVar.f2613gv).z6(gvVar.n3).n(gvVar.zn);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, com.google.android.material.button.MaterialButton] */
    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f2604r, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        ?? r52 = (MaterialButton) view;
        setGeneratedIdIfNeeded(r52);
        setupButtonChild(r52);
        if (r52.isChecked()) {
            r(r52.getId(), true);
            setCheckedId(r52.getId());
        }
        f shapeAppearanceModel = r52.getShapeAppearanceModel();
        this.y.add(new gv(shapeAppearanceModel.mt(), shapeAppearanceModel.i9(), shapeAppearanceModel.z(), shapeAppearanceModel.t()));
        ut.g3((View) r52, new n3());
    }

    @NonNull
    public final LinearLayout.LayoutParams c5(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    public final void co(int i, boolean z) {
        Object objFindViewById = findViewById(i);
        if (objFindViewById instanceof MaterialButton) {
            this.w = true;
            ((MaterialButton) objFindViewById).setChecked(z);
            this.w = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        x4();
        super.dispatchDraw(canvas);
    }

    public void f() {
        this.w = true;
        for (int i = 0; i < getChildCount(); i++) {
            AppCompatButton appCompatButtonTl = tl(i);
            appCompatButtonTl.setChecked(false);
            t(appCompatButtonTl.getId(), false);
        }
        this.w = false;
        setCheckedId(-1);
    }

    public void fb(@NonNull v vVar) {
        this.f2609s.add(vVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f2608p) {
            return this.z;
        }
        return -1;
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            AppCompatButton appCompatButtonTl = tl(i);
            if (appCompatButtonTl.isChecked()) {
                arrayList.add(Integer.valueOf(appCompatButtonTl.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i5) {
        Integer[] numArr = this.f2610t;
        if (numArr != null && i5 < numArr.length) {
            return numArr[i5].intValue();
        }
        Log.w(f2604r, "Child order wasn't updated");
        return i5;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.View, com.google.android.material.button.MaterialButton] */
    public void i4() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            ?? Tl = tl(i);
            if (Tl.getVisibility() != 8) {
                f.n3 n3VarX4 = Tl.getShapeAppearanceModel().x4();
                z(n3VarX4, xc(i, firstVisibleChildIndex, lastVisibleChildIndex));
                Tl.setShapeAppearanceModel(n3VarX4.tl());
            }
        }
    }

    public final void i9(int i, boolean z) {
        MaterialButton materialButton = (MaterialButton) findViewById(i);
        if (materialButton != null) {
            materialButton.setChecked(z);
        }
    }

    public final void mt(int i) {
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tl(i).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            co.zn(layoutParams, 0);
            co.gv(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.z;
        if (i != -1) {
            i9(i, true);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ud.w2(accessibilityNodeInfo).ap(ud.a.y(1, getVisibleButtonCount(), false, p() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i5) {
        i4();
        s();
        super.onMeasure(i, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.s(this.f2611v);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.y.remove(iIndexOfChild);
        }
        i4();
        s();
    }

    public boolean p() {
        return this.f2608p;
    }

    public final boolean r(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.f2605co && checkedButtonIds.isEmpty()) {
            co(i, true);
            this.z = i;
            return false;
        }
        if (z && this.f2608p) {
            checkedButtonIds.remove(Integer.valueOf(i));
            Iterator<Integer> it = checkedButtonIds.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                co(iIntValue, false);
                t(iIntValue, false);
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, com.google.android.material.button.MaterialButton] */
    public final void s() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            ?? Tl = tl(i);
            int iMin = Math.min(Tl.getStrokeWidth(), tl(i - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsC5 = c5(Tl);
            if (getOrientation() == 0) {
                co.zn(layoutParamsC5, 0);
                co.gv(layoutParamsC5, -iMin);
                layoutParamsC5.topMargin = 0;
            } else {
                layoutParamsC5.bottomMargin = 0;
                layoutParamsC5.topMargin = -iMin;
                co.gv(layoutParamsC5, 0);
            }
            Tl.setLayoutParams(layoutParamsC5);
        }
        mt(firstVisibleChildIndex);
    }

    public void setSelectionRequired(boolean z) {
        this.f2605co = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f2608p != z) {
            this.f2608p = z;
            f();
        }
    }

    public final void t(int i, boolean z) {
        Iterator<v> it = this.f2609s.iterator();
        while (it.hasNext()) {
            it.next().y(this, i, z);
        }
    }

    public final MaterialButton tl(int i) {
        return (MaterialButton) getChildAt(i);
    }

    public final boolean w(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final int wz(@Nullable View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5) == view) {
                return i;
            }
            if ((getChildAt(i5) instanceof MaterialButton) && w(i5)) {
                i++;
            }
        }
        return -1;
    }

    public final void x4() {
        TreeMap treeMap = new TreeMap(this.f2606f);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(tl(i), Integer.valueOf(i));
        }
        this.f2610t = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    @Nullable
    public final gv xc(int i, int i5, int i8) {
        gv gvVar = this.y.get(i);
        if (i5 == i8) {
            return gvVar;
        }
        boolean z = getOrientation() == 0;
        if (i == i5) {
            return z ? gv.v(gvVar, this) : gv.a(gvVar);
        }
        if (i == i8) {
            return z ? gv.n3(gvVar, this) : gv.y(gvVar);
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i5 = f3;
        super(e3.y.zn(context, attributeSet, i, i5), attributeSet, i);
        this.y = new ArrayList();
        y yVar = null;
        this.f2611v = new zn(this, yVar);
        this.f2607fb = new a(this, yVar);
        this.f2609s = new LinkedHashSet<>();
        this.f2606f = new y();
        this.w = false;
        TypedArray typedArrayS = o2.f.s(getContext(), attributeSet, R$styleable.jf, i, i5, new int[0]);
        setSingleSelection(typedArrayS.getBoolean(R$styleable.fm, false));
        this.z = typedArrayS.getResourceId(R$styleable.x2, -1);
        this.f2605co = typedArrayS.getBoolean(R$styleable.mf, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayS.recycle();
        ut.o0(this, 1);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
