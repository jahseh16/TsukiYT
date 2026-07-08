package com.google.android.material.tabs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public RecyclerView.s<?> f2853a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public TabLayout.gv f2854c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f2855fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final boolean f2856gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public RecyclerView.i9 f2857i9;

    @NonNull
    public final ViewPager2 n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public zn f2858s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final InterfaceC0070n3 f2859v;

    @NonNull
    public final TabLayout y;
    public final boolean zn;

    public static class gv implements TabLayout.gv {
        public final boolean n3;
        public final ViewPager2 y;

        public gv(ViewPager2 viewPager2, boolean z) {
            this.y = viewPager2;
            this.n3 = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.zn
        public void n3(TabLayout.fb fbVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.zn
        public void y(@NonNull TabLayout.fb fbVar) {
            this.y.i9(fbVar.fb(), this.n3);
        }

        @Override // com.google.android.material.tabs.TabLayout.zn
        public void zn(TabLayout.fb fbVar) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.n3$n3, reason: collision with other inner class name */
    public interface InterfaceC0070n3 {
        void y(@NonNull TabLayout.fb fbVar, int i);
    }

    public class y extends RecyclerView.i9 {
        public y() {
        }

        public void onChanged() {
            n3.this.n3();
        }

        public void onItemRangeChanged(int i, int i5) {
            n3.this.n3();
        }

        public void onItemRangeInserted(int i, int i5) {
            n3.this.n3();
        }

        public void onItemRangeMoved(int i, int i5, int i8) {
            n3.this.n3();
        }

        public void onItemRangeRemoved(int i, int i5) {
            n3.this.n3();
        }

        public void onItemRangeChanged(int i, int i5, @Nullable Object obj) {
            n3.this.n3();
        }
    }

    public static class zn extends ViewPager2.c5 {
        public int n3;

        @NonNull
        public final WeakReference<TabLayout> y;
        public int zn;

        public zn(TabLayout tabLayout) {
            this.y = new WeakReference<>(tabLayout);
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.c5
        public void onPageScrollStateChanged(int i) {
            this.n3 = this.zn;
            this.zn = i;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.c5
        public void onPageScrolled(int i, float f3, int i5) {
            TabLayout tabLayout = this.y.get();
            if (tabLayout != null) {
                int i8 = this.zn;
                tabLayout.x(i, f3, i8 != 2 || this.n3 == 1, (i8 == 2 && this.n3 == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.c5
        public void onPageSelected(int i) {
            TabLayout tabLayout = this.y.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i5 = this.zn;
            tabLayout.ej(tabLayout.n(i), i5 == 0 || (i5 == 2 && this.n3 == 0));
        }

        public void y() {
            this.zn = 0;
            this.n3 = 0;
        }
    }

    public n3(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z, boolean z5, @NonNull InterfaceC0070n3 interfaceC0070n3) {
        this.y = tabLayout;
        this.n3 = viewPager2;
        this.zn = z;
        this.f2856gv = z5;
        this.f2859v = interfaceC0070n3;
    }

    public void n3() {
        this.y.mg();
        RecyclerView.s<?> sVar = this.f2853a;
        if (sVar != null) {
            int itemCount = sVar.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.fb fbVarD0 = this.y.d0();
                this.f2859v.y(fbVarD0, i);
                this.y.fb(fbVarD0, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.n3.getCurrentItem(), this.y.getTabCount() - 1);
                if (iMin != this.y.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.y;
                    tabLayout.z6(tabLayout.n(iMin));
                }
            }
        }
    }

    public void y() {
        if (this.f2855fb) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.s<?> adapter = this.n3.getAdapter();
        this.f2853a = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f2855fb = true;
        zn znVar = new zn(this.y);
        this.f2858s = znVar;
        this.n3.fb(znVar);
        gv gvVar = new gv(this.n3, this.f2856gv);
        this.f2854c5 = gvVar;
        this.y.gv(gvVar);
        if (this.zn) {
            y yVar = new y();
            this.f2857i9 = yVar;
            this.f2853a.registerAdapterDataObserver(yVar);
        }
        n3();
        this.y.a8(this.n3.getCurrentItem(), 0.0f, true);
    }
}
