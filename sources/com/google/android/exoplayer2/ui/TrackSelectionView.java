package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import ft.g;
import ft.gi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k4.r;
import n0.ta;
import q0.w;
import ur.rs;

/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public boolean f1998co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n3 f1999f;
    public boolean f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final CheckedTextView f2000fb;

    @Nullable
    public Comparator<zn> n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2001p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CheckedTextView[][] f2002r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CheckedTextView f2003s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<gi.y> f2004t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LayoutInflater f2005v;
    public final Map<rs, ta> w;
    public final int y;
    public w z;

    public class n3 implements View.OnClickListener {
        public n3() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.zn(view);
        }
    }

    public static final class zn {
        public final int n3;
        public final gi.y y;

        public zn(gi.y yVar, int i) {
            this.y = yVar;
            this.n3 = i;
        }

        public g y() {
            return this.y.zn(this.n3);
        }
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static Map<rs, ta> n3(Map<rs, ta> map, List<gi.y> list, boolean z) {
        HashMap map2 = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            ta taVar = map.get(list.get(i).n3());
            if (taVar != null && (z || map2.isEmpty())) {
                map2.put(taVar.y, taVar);
            }
        }
        return map2;
    }

    public final void a(View view) {
        this.f3 = false;
        zn znVar = (zn) v0.y.v(view.getTag());
        rs rsVarN3 = znVar.y.n3();
        int i = znVar.n3;
        ta taVar = this.w.get(rsVarN3);
        if (taVar == null) {
            if (!this.f1998co && this.w.size() > 0) {
                this.w.clear();
            }
            this.w.put(rsVarN3, new ta(rsVarN3, r.j(Integer.valueOf(i))));
            return;
        }
        ArrayList arrayList = new ArrayList(taVar.f6757v);
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zFb = fb(znVar.y);
        boolean z = zFb || s();
        if (zIsChecked && z) {
            arrayList.remove(Integer.valueOf(i));
            if (arrayList.isEmpty()) {
                this.w.remove(rsVarN3);
                return;
            } else {
                this.w.put(rsVarN3, new ta(rsVarN3, arrayList));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (!zFb) {
            this.w.put(rsVarN3, new ta(rsVarN3, r.j(Integer.valueOf(i))));
        } else {
            arrayList.add(Integer.valueOf(i));
            this.w.put(rsVarN3, new ta(rsVarN3, arrayList));
        }
    }

    public final void c5() {
        this.f2000fb.setChecked(this.f3);
        this.f2003s.setChecked(!this.f3 && this.w.size() == 0);
        for (int i = 0; i < this.f2002r.length; i++) {
            ta taVar = this.w.get(this.f2004t.get(i).n3());
            int i5 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f2002r[i];
                if (i5 < checkedTextViewArr.length) {
                    if (taVar != null) {
                        this.f2002r[i][i5].setChecked(taVar.f6757v.contains(Integer.valueOf(((zn) v0.y.v(checkedTextViewArr[i5].getTag())).n3)));
                    } else {
                        checkedTextViewArr[i5].setChecked(false);
                    }
                    i5++;
                }
            }
        }
    }

    public final boolean fb(gi.y yVar) {
        return this.f2001p && yVar.v();
    }

    public boolean getIsDisabled() {
        return this.f3;
    }

    public Map<rs, ta> getOverrides() {
        return this.w;
    }

    public final void gv() {
        this.f3 = false;
        this.w.clear();
    }

    public final void i9() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f2004t.isEmpty()) {
            this.f2000fb.setEnabled(false);
            this.f2003s.setEnabled(false);
            return;
        }
        this.f2000fb.setEnabled(true);
        this.f2003s.setEnabled(true);
        this.f2002r = new CheckedTextView[this.f2004t.size()][];
        boolean zS = s();
        for (int i = 0; i < this.f2004t.size(); i++) {
            gi.y yVar = this.f2004t.get(i);
            boolean zFb = fb(yVar);
            CheckedTextView[][] checkedTextViewArr = this.f2002r;
            int i5 = yVar.y;
            checkedTextViewArr[i] = new CheckedTextView[i5];
            zn[] znVarArr = new zn[i5];
            for (int i8 = 0; i8 < yVar.y; i8++) {
                znVarArr[i8] = new zn(yVar, i8);
            }
            Comparator<zn> comparator = this.n;
            if (comparator != null) {
                Arrays.sort(znVarArr, comparator);
            }
            for (int i10 = 0; i10 < i5; i10++) {
                if (i10 == 0) {
                    addView(this.f2005v.inflate(R$layout.y, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f2005v.inflate((zFb || zS) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.y);
                checkedTextView.setText(this.z.y(znVarArr[i10].y()));
                checkedTextView.setTag(znVarArr[i10]);
                if (yVar.s(i10)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f1999f);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f2002r[i][i10] = checkedTextView;
                addView(checkedTextView);
            }
        }
        c5();
    }

    public final boolean s() {
        return this.f1998co && this.f2004t.size() > 1;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f2001p != z) {
            this.f2001p = z;
            i9();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f1998co != z) {
            this.f1998co = z;
            if (!z && this.w.size() > 1) {
                Map<rs, ta> mapN3 = n3(this.w, this.f2004t, false);
                this.w.clear();
                this.w.putAll(mapN3);
            }
            i9();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f2000fb.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(w wVar) {
        this.z = (w) v0.y.v(wVar);
        i9();
    }

    public final void v() {
        this.f3 = true;
        this.w.clear();
    }

    public final void zn(View view) {
        if (view == this.f2000fb) {
            v();
        } else if (view == this.f2003s) {
            gv();
        } else {
            a(view);
        }
        c5();
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.y = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f2005v = layoutInflaterFrom;
        n3 n3Var = new n3();
        this.f1999f = n3Var;
        this.z = new q0.a(getResources());
        this.f2004t = new ArrayList();
        this.w = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f2000fb = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R$string.f1947i4);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(n3Var);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(R$layout.y, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f2003s = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R$string.f1957x4);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(n3Var);
        addView(checkedTextView2);
    }
}
