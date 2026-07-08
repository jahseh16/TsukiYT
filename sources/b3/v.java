package b3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import w.yc;

/* JADX INFO: loaded from: classes.dex */
public class v extends w.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f1325f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final yc f1326s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final Rect f1327t;

    public class y implements AdapterView.OnItemClickListener {
        public y() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            v.this.v(i < 0 ? v.this.f1326s.r() : v.this.getAdapter().getItem(i));
            AdapterView.OnItemClickListener onItemClickListener = v.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = v.this.f1326s.f3();
                    i = v.this.f1326s.i4();
                    j = v.this.f1326s.x4();
                }
                onItemClickListener.onItemClick(v.this.f1326s.xc(), view, i, j);
            }
            v.this.f1326s.dismiss();
        }
    }

    public v(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.n3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public CharSequence getHint() {
        TextInputLayout textInputLayoutZn = zn();
        return (textInputLayoutZn == null || !textInputLayoutZn.vl()) ? super/*android.widget.AutoCompleteTextView*/.getHint() : textInputLayoutZn.getHint();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int gv() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutZn = zn();
        int i = 0;
        if (adapter == null || textInputLayoutZn == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f1326s.i4()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutZn);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableFb = this.f1326s.fb();
        if (drawableFb != null) {
            drawableFb.getPadding(this.f1327t);
            Rect rect = this.f1327t;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutZn.getEndIconView().getMeasuredWidth();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.widget.AutoCompleteTextView*/.onAttachedToWindow();
        TextInputLayout textInputLayoutZn = zn();
        if (textInputLayoutZn != null && textInputLayoutZn.vl() && super/*android.widget.AutoCompleteTextView*/.getHint() == null && o2.v.y()) {
            setHint(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i5) {
        super/*android.widget.AutoCompleteTextView*/.onMeasure(i, i5);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), gv()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t3) {
        super/*android.widget.AutoCompleteTextView*/.setAdapter(t3);
        this.f1326s.tl(getAdapter());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f1325f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super/*android.widget.AutoCompleteTextView*/.showDropDown();
        } else {
            this.f1326s.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends ListAdapter & Filterable> void v(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final TextInputLayout zn() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(e3.y.zn(context, attributeSet, i, 0), attributeSet, i);
        this.f1327t = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayS = o2.f.s(context2, attributeSet, R$styleable.wb, i, R$style.f2306v, new int[0]);
        if (typedArrayS.hasValue(R$styleable.j4) && typedArrayS.getInt(R$styleable.j4, 0) == 0) {
            setKeyListener(null);
        }
        this.f1325f = (AccessibilityManager) context2.getSystemService("accessibility");
        yc ycVar = new yc(context2);
        this.f1326s = ycVar;
        ycVar.ud(true);
        ycVar.rz(this);
        ycVar.ej(2);
        ycVar.tl(getAdapter());
        ycVar.x(new y());
        typedArrayS.recycle();
    }
}
