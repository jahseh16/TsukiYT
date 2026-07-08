package u1;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import qn.rs;
import qn.ut;
import qn.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class zn extends gv<View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8334a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f8335fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Rect f8336gv;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f8337v;

    public zn() {
        this.f8336gv = new Rect();
        this.f8337v = new Rect();
        this.f8334a = 0;
    }

    public static int yt(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    public float a8(View view) {
        return 1.0f;
    }

    public int b(@NonNull View view) {
        return view.getMeasuredHeight();
    }

    @Override // u1.gv
    public void d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        View viewEj = ej(coordinatorLayout.mt(view));
        if (viewEj == null) {
            super.d(coordinatorLayout, view, i);
            this.f8334a = 0;
            return;
        }
        CoordinatorLayout.a layoutParams = view.getLayoutParams();
        Rect rect = this.f8336gv;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, viewEj.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((coordinatorLayout.getHeight() + viewEj.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        rs lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && ut.fh(coordinatorLayout) && !ut.fh(view)) {
            rect.left += lastWindowInsets.f();
            rect.right -= lastWindowInsets.t();
        }
        Rect rect2 = this.f8337v;
        w.y(yt(layoutParams.zn), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int iUd = ud(viewEj);
        view.layout(rect2.left, rect2.top - iUd, rect2.right, rect2.bottom - iUd);
        this.f8334a = rect2.top - viewEj.getBottom();
    }

    @Nullable
    public abstract View ej(List<View> list);

    public boolean hw() {
        return false;
    }

    public final int k5() {
        return this.f8334a;
    }

    public boolean tl(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i5, int i8, int i10) {
        View viewEj;
        rs lastWindowInsets;
        int i11 = view.getLayoutParams().height;
        if ((i11 != -1 && i11 != -2) || (viewEj = ej(coordinatorLayout.mt(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i8);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (ut.fh(viewEj) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.tl() + lastWindowInsets.i9();
        }
        int iB = size + b(viewEj);
        int measuredHeight = viewEj.getMeasuredHeight();
        if (hw()) {
            view.setTranslationY(-measuredHeight);
        } else {
            iB -= measuredHeight;
        }
        coordinatorLayout.a8(view, i, i5, View.MeasureSpec.makeMeasureSpec(iB, i11 == -1 ? 1073741824 : Integer.MIN_VALUE), i10);
        return true;
    }

    public final int ud(View view) {
        if (this.f8335fb == 0) {
            return 0;
        }
        float fA8 = a8(view);
        int i = this.f8335fb;
        return b.y.n3((int) (fA8 * i), 0, i);
    }

    public final void vl(int i) {
        this.f8335fb = i;
    }

    public final int x() {
        return this.f8335fb;
    }

    public zn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8336gv = new Rect();
        this.f8337v = new Rect();
        this.f8334a = 0;
    }
}
