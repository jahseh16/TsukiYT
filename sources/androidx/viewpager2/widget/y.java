package androidx.viewpager2.widget;

import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y extends ViewPager2.c5 {

    @NonNull
    public final List<ViewPager2.c5> y;

    public y(int i) {
        this.y = new ArrayList(i);
    }

    public void n3(ViewPager2.c5 c5Var) {
        this.y.remove(c5Var);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.c5
    public void onPageScrollStateChanged(int i) {
        try {
            Iterator<ViewPager2.c5> it = this.y.iterator();
            while (it.hasNext()) {
                it.next().onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e4) {
            zn(e4);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.c5
    public void onPageScrolled(int i, float f3, int i5) {
        try {
            Iterator<ViewPager2.c5> it = this.y.iterator();
            while (it.hasNext()) {
                it.next().onPageScrolled(i, f3, i5);
            }
        } catch (ConcurrentModificationException e4) {
            zn(e4);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.c5
    public void onPageSelected(int i) {
        try {
            Iterator<ViewPager2.c5> it = this.y.iterator();
            while (it.hasNext()) {
                it.next().onPageSelected(i);
            }
        } catch (ConcurrentModificationException e4) {
            zn(e4);
        }
    }

    public void y(ViewPager2.c5 c5Var) {
        this.y.add(c5Var);
    }

    public final void zn(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }
}
