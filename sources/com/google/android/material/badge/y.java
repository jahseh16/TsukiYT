package com.google.android.material.badge;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class y {
    public static final boolean y = false;

    public static void gv(@NonNull Rect rect, float f3, float f4, float f5, float f7) {
        rect.set((int) (f3 - f5), (int) (f4 - f7), (int) (f3 + f5), (int) (f4 + f7));
    }

    public static void n3(@Nullable BadgeDrawable badgeDrawable, @NonNull View view) {
        if (badgeDrawable == null) {
            return;
        }
        if (y || badgeDrawable.s() != null) {
            badgeDrawable.s().setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }

    public static void y(@NonNull BadgeDrawable badgeDrawable, @NonNull View view, @Nullable FrameLayout frameLayout) {
        zn(badgeDrawable, view, frameLayout);
        if (badgeDrawable.s() != null) {
            badgeDrawable.s().setForeground(badgeDrawable);
        } else {
            if (y) {
                throw new IllegalArgumentException("Trying to reference null customBadgeParent");
            }
            view.getOverlay().add(badgeDrawable);
        }
    }

    public static void zn(@NonNull BadgeDrawable badgeDrawable, @NonNull View view, @Nullable FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.n(view, frameLayout);
    }
}
