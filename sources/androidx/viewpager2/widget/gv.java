package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class gv extends ViewPager2.c5 {
    public ViewPager2.f n3;
    public final LinearLayoutManager y;

    public gv(LinearLayoutManager linearLayoutManager) {
        this.y = linearLayoutManager;
    }

    public void n3(@Nullable ViewPager2.f fVar) {
        this.n3 = fVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.c5
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.c5
    public void onPageScrolled(int i, float f3, int i5) {
        if (this.n3 == null) {
            return;
        }
        float f4 = -f3;
        for (int i8 = 0; i8 < this.y.getChildCount(); i8++) {
            View childAt = this.y.getChildAt(i8);
            if (childAt == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i8), Integer.valueOf(this.y.getChildCount())));
            }
            this.n3.transformPage(childAt, (this.y.getPosition(childAt) - i) + f4);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.c5
    public void onPageSelected(int i) {
    }

    public ViewPager2.f y() {
        return this.n3;
    }
}
