package a3;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes.dex */
public class y extends com.google.android.material.tabs.y {
    public static float a(float f3) {
        return (float) Math.sin((((double) f3) * 3.141592653589793d) / 2.0d);
    }

    public static float v(float f3) {
        return (float) (1.0d - Math.cos((((double) f3) * 3.141592653589793d) / 2.0d));
    }

    @Override // com.google.android.material.tabs.y
    public void zn(TabLayout tabLayout, View view, View view2, float f3, @NonNull Drawable drawable) {
        float fA;
        float fV;
        RectF rectFY = com.google.android.material.tabs.y.y(tabLayout, view);
        RectF rectFY2 = com.google.android.material.tabs.y.y(tabLayout, view2);
        if (rectFY.left < rectFY2.left) {
            fA = v(f3);
            fV = a(f3);
        } else {
            fA = a(f3);
            fV = v(f3);
        }
        drawable.setBounds(t1.y.zn((int) rectFY.left, (int) rectFY2.left, fA), drawable.getBounds().top, t1.y.zn((int) rectFY.right, (int) rectFY2.right, fV), drawable.getBounds().bottom);
    }
}
