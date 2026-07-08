package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class v extends RecyclerView.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1081a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f1082c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1083f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public y f1084fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @NonNull
    public final LinearLayoutManager f1085gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public boolean f1086i9;

    @NonNull
    public final ViewPager2 n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1087s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1088t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public boolean f1089tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1090v;
    public ViewPager2.c5 y;

    @NonNull
    public final RecyclerView zn;

    public static final class y {
        public float n3;
        public int y;
        public int zn;

        public void y() {
            this.y = -1;
            this.n3 = 0.0f;
            this.zn = 0;
        }
    }

    public v(@NonNull ViewPager2 viewPager2) {
        this.n3 = viewPager2;
        RecyclerView recyclerView = viewPager2.z;
        this.zn = recyclerView;
        this.f1085gv = recyclerView.getLayoutManager();
        this.f1084fb = new y();
        t();
    }

    public int a() {
        return this.f1081a;
    }

    public final boolean c5() {
        int i = this.f1090v;
        return i == 1 || i == 4;
    }

    public void f(int i, boolean z) {
        this.f1090v = z ? 2 : 3;
        this.f1089tl = false;
        boolean z5 = this.f1082c5 != i;
        this.f1082c5 = i;
        zn(2);
        if (z5) {
            n3(i);
        }
    }

    public boolean fb() {
        return this.f1089tl;
    }

    public final int gv() {
        return this.f1085gv.findFirstVisibleItemPosition();
    }

    public void i9() {
        this.f1088t = true;
    }

    public final void n3(int i) {
        ViewPager2.c5 c5Var = this.y;
        if (c5Var != null) {
            c5Var.onPageSelected(i);
        }
    }

    public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        if (!(this.f1090v == 1 && this.f1081a == 1) && i == 1) {
            wz(false);
            return;
        }
        if (c5() && i == 2) {
            if (this.f1083f) {
                zn(2);
                this.f1086i9 = true;
                return;
            }
            return;
        }
        if (c5() && i == 0) {
            xc();
            if (this.f1083f) {
                y yVar = this.f1084fb;
                if (yVar.zn == 0) {
                    int i5 = this.f1087s;
                    int i8 = yVar.y;
                    if (i5 != i8) {
                        n3(i8);
                    }
                }
            } else {
                int i10 = this.f1084fb.y;
                if (i10 != -1) {
                    y(i10, 0.0f, 0);
                }
            }
            zn(0);
            t();
        }
        if (this.f1090v == 2 && i == 0 && this.f1088t) {
            xc();
            y yVar2 = this.f1084fb;
            if (yVar2.zn == 0) {
                int i11 = this.f1082c5;
                int i12 = yVar2.y;
                if (i11 != i12) {
                    if (i12 == -1) {
                        i12 = 0;
                    }
                    n3(i12);
                }
                zn(0);
                t();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrolled(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f1083f = r4
            r3.xc()
            boolean r0 = r3.f1086i9
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L37
            r3.f1086i9 = r2
            if (r6 > 0) goto L1f
            if (r6 != 0) goto L29
            if (r5 >= 0) goto L16
            r5 = 1
            goto L17
        L16:
            r5 = 0
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.n3
            boolean r6 = r6.gv()
            if (r5 != r6) goto L29
        L1f:
            androidx.viewpager2.widget.v$y r5 = r3.f1084fb
            int r6 = r5.zn
            if (r6 == 0) goto L29
            int r5 = r5.y
            int r5 = r5 + r4
            goto L2d
        L29:
            androidx.viewpager2.widget.v$y r5 = r3.f1084fb
            int r5 = r5.y
        L2d:
            r3.f1082c5 = r5
            int r6 = r3.f1087s
            if (r6 == r5) goto L45
            r3.n3(r5)
            goto L45
        L37:
            int r5 = r3.f1090v
            if (r5 != 0) goto L45
            androidx.viewpager2.widget.v$y r5 = r3.f1084fb
            int r5 = r5.y
            if (r5 != r1) goto L42
            r5 = 0
        L42:
            r3.n3(r5)
        L45:
            androidx.viewpager2.widget.v$y r5 = r3.f1084fb
            int r6 = r5.y
            if (r6 != r1) goto L4c
            r6 = 0
        L4c:
            float r0 = r5.n3
            int r5 = r5.zn
            r3.y(r6, r0, r5)
            androidx.viewpager2.widget.v$y r5 = r3.f1084fb
            int r6 = r5.y
            int r0 = r3.f1082c5
            if (r6 == r0) goto L5d
            if (r0 != r1) goto L6b
        L5d:
            int r5 = r5.zn
            if (r5 != 0) goto L6b
            int r5 = r3.f1081a
            if (r5 == r4) goto L6b
            r3.zn(r2)
            r3.t()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.v.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public boolean s() {
        return this.f1081a == 0;
    }

    public final void t() {
        this.f1090v = 0;
        this.f1081a = 0;
        this.f1084fb.y();
        this.f1087s = -1;
        this.f1082c5 = -1;
        this.f1086i9 = false;
        this.f1083f = false;
        this.f1089tl = false;
        this.f1088t = false;
    }

    public void tl(ViewPager2.c5 c5Var) {
        this.y = c5Var;
    }

    public double v() {
        xc();
        y yVar = this.f1084fb;
        return ((double) yVar.y) + ((double) yVar.n3);
    }

    public final void wz(boolean z) {
        this.f1089tl = z;
        this.f1090v = z ? 4 : 1;
        int i = this.f1082c5;
        if (i != -1) {
            this.f1087s = i;
            this.f1082c5 = -1;
        } else if (this.f1087s == -1) {
            this.f1087s = gv();
        }
        zn(1);
    }

    public final void xc() {
        int top;
        y yVar = this.f1084fb;
        int iFindFirstVisibleItemPosition = this.f1085gv.findFirstVisibleItemPosition();
        yVar.y = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1) {
            yVar.y();
            return;
        }
        View viewFindViewByPosition = this.f1085gv.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            yVar.y();
            return;
        }
        int leftDecorationWidth = this.f1085gv.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = this.f1085gv.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = this.f1085gv.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = this.f1085gv.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.f1085gv.getOrientation() == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - this.zn.getPaddingLeft();
            if (this.n3.gv()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - this.zn.getPaddingTop();
        }
        int i = -top;
        yVar.zn = i;
        if (i >= 0) {
            yVar.n3 = height == 0 ? 0.0f : i / height;
        } else {
            if (!new cs.y(this.f1085gv).gv()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(yVar.zn)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    public final void y(int i, float f3, int i5) {
        ViewPager2.c5 c5Var = this.y;
        if (c5Var != null) {
            c5Var.onPageScrolled(i, f3, i5);
        }
    }

    public final void zn(int i) {
        if ((this.f1090v == 3 && this.f1081a == 0) || this.f1081a == i) {
            return;
        }
        this.f1081a = i;
        ViewPager2.c5 c5Var = this.y;
        if (c5Var != null) {
            c5Var.onPageScrollStateChanged(i);
        }
    }
}
