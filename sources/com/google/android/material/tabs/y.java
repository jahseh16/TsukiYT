package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import o2.t;

/* JADX INFO: loaded from: classes.dex */
public class y {
    public static RectF n3(@NonNull TabLayout.c5 c5Var, int i) {
        int contentWidth = c5Var.getContentWidth();
        int contentHeight = c5Var.getContentHeight();
        int iN3 = (int) t.n3(c5Var.getContext(), i);
        if (contentWidth < iN3) {
            contentWidth = iN3;
        }
        int left = (c5Var.getLeft() + c5Var.getRight()) / 2;
        int top = (c5Var.getTop() + c5Var.getBottom()) / 2;
        int i5 = contentWidth / 2;
        return new RectF(left - i5, top - (contentHeight / 2), i5 + left, top + (left / 2));
    }

    public static RectF y(TabLayout tabLayout, @Nullable View view) {
        return view == null ? new RectF() : (tabLayout.c() || !(view instanceof TabLayout.c5)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : n3((TabLayout.c5) view, 24);
    }

    public void gv(TabLayout tabLayout, View view, @NonNull Drawable drawable) {
        RectF rectFY = y(tabLayout, view);
        drawable.setBounds((int) rectFY.left, drawable.getBounds().top, (int) rectFY.right, drawable.getBounds().bottom);
    }

    public void zn(TabLayout tabLayout, View view, View view2, float f3, @NonNull Drawable drawable) {
        RectF rectFY = y(tabLayout, view);
        RectF rectFY2 = y(tabLayout, view2);
        drawable.setBounds(t1.y.zn((int) rectFY.left, (int) rectFY2.left, f3), drawable.getBounds().top, t1.y.zn((int) rectFY.right, (int) rectFY2.right, f3), drawable.getBounds().bottom);
    }
}
