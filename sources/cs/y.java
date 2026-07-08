package cs;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final ViewGroup.MarginLayoutParams n3;
    public LinearLayoutManager y;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        n3 = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public y(@NonNull LinearLayoutManager linearLayoutManager) {
        this.y = linearLayoutManager;
    }

    public static boolean zn(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (zn(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean gv() {
        return (!y() || this.y.getChildCount() <= 1) && n3();
    }

    public final boolean n3() {
        int childCount = this.y.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (zn(this.y.getChildAt(i))) {
                return true;
            }
        }
        return false;
    }

    public final boolean y() {
        int top;
        int i;
        int bottom;
        int i5;
        int childCount = this.y.getChildCount();
        if (childCount == 0) {
            return true;
        }
        boolean z = this.y.getOrientation() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount, 2);
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = this.y.getChildAt(i8);
            if (childAt == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : n3;
            int[] iArr2 = iArr[i8];
            if (z) {
                top = childAt.getLeft();
                i = marginLayoutParams.leftMargin;
            } else {
                top = childAt.getTop();
                i = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i;
            int[] iArr3 = iArr[i8];
            if (z) {
                bottom = childAt.getRight();
                i5 = marginLayoutParams.rightMargin;
            } else {
                bottom = childAt.getBottom();
                i5 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i5;
        }
        Arrays.sort(iArr, new y(this));
        for (int i10 = 1; i10 < childCount; i10++) {
            if (iArr[i10 - 1][1] != iArr[i10][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i11 = iArr4[1];
        int i12 = iArr4[0];
        return i12 <= 0 && iArr[childCount - 1][1] >= i11 - i12;
    }
}
