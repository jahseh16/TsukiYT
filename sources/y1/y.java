package y1;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import free.daily.tube.module.share_impl.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: y1.y$y, reason: collision with other inner class name */
    public static final class C0196y extends ViewPager2.c5 {
        public final /* synthetic */ ViewPager2 n3;
        public final /* synthetic */ FragmentManager y;
        public final /* synthetic */ BottomSheetBehavior<ViewGroup> zn;

        public C0196y(FragmentManager fragmentManager, ViewPager2 viewPager2, BottomSheetBehavior<ViewGroup> bottomSheetBehavior) {
            this.y = fragmentManager;
            this.n3 = viewPager2;
            this.zn = bottomSheetBehavior;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.c5
        public void onPageSelected(int i) {
            View view;
            RecyclerView recyclerViewFindViewById;
            FragmentManager fragmentManager = this.y;
            RecyclerView.s adapter = this.n3.getAdapter();
            Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("f" + (adapter != null ? Long.valueOf(adapter.getItemId(i)) : null));
            if (fragmentFindFragmentByTag == null || (view = fragmentFindFragmentByTag.getView()) == null || (recyclerViewFindViewById = view.findViewById(R.id.gv)) == null) {
                return;
            }
            this.zn.f2552hw = new WeakReference<>(recyclerViewFindViewById);
        }
    }

    public static final void y(ViewGroup viewGroup, boolean z, FragmentManager fm) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(fm, "fm");
        if (z) {
            BottomSheetBehavior bottomSheetBehaviorY5 = BottomSheetBehavior.y5(viewGroup);
            ViewPager2 viewPager2 = (ViewPager2) viewGroup.findViewById(R.id.c5);
            if (viewPager2 != null) {
                RecyclerView childAt = viewPager2.getChildAt(0);
                Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                childAt.setNestedScrollingEnabled(false);
                viewPager2.fb(new C0196y(fm, viewPager2, bottomSheetBehaviorY5));
            }
        }
    }
}
