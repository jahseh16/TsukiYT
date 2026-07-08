package le;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import ap.mt;
import java.util.Iterator;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public abstract class y extends RecyclerView.s<le.n3> implements le.zn {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public boolean f6206co;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final x4.v<Fragment> f6207fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6208p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x4.v<Fragment.SavedState> f6209s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x4.v<Integer> f6210t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final FragmentManager f6211v;
    public fb w;
    public final s y;

    public static abstract class a extends RecyclerView.i9 {
        public a() {
        }

        public abstract void onChanged();

        public final void onItemRangeChanged(int i, int i5) {
            onChanged();
        }

        public final void onItemRangeInserted(int i, int i5) {
            onChanged();
        }

        public final void onItemRangeMoved(int i, int i5, int i8) {
            onChanged();
        }

        public final void onItemRangeRemoved(int i, int i5) {
            onChanged();
        }

        public /* synthetic */ a(ViewOnLayoutChangeListenerC0128y viewOnLayoutChangeListenerC0128y) {
            this();
        }

        public final void onItemRangeChanged(int i, int i5, @Nullable Object obj) {
            onChanged();
        }
    }

    public class fb {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public ViewPager2 f6213gv;
        public RecyclerView.i9 n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public long f6214v = -1;
        public ViewPager2.c5 y;
        public t zn;

        public class n3 extends a {
            public n3() {
                super(null);
            }

            @Override // le.y.a
            public void onChanged() {
                fb.this.gv(true);
            }
        }

        /* JADX INFO: renamed from: le.y$fb$y, reason: collision with other inner class name */
        public class C0127y extends ViewPager2.c5 {
            public C0127y() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.c5
            public void onPageScrollStateChanged(int i) {
                fb.this.gv(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.c5
            public void onPageSelected(int i) {
                fb.this.gv(false);
            }
        }

        public class zn implements t {
            public zn() {
            }

            @Override // androidx.lifecycle.t
            public void onStateChanged(@NonNull mt mtVar, @NonNull s.y yVar) {
                fb.this.gv(false);
            }
        }

        public fb() {
        }

        public void gv(boolean z) {
            int currentItem;
            Fragment fragmentS;
            if (y.this.mg() || this.f6213gv.getScrollState() != 0 || y.this.f6207fb.f() || y.this.getItemCount() == 0 || (currentItem = this.f6213gv.getCurrentItem()) >= y.this.getItemCount()) {
                return;
            }
            long itemId = y.this.getItemId(currentItem);
            if ((itemId != this.f6214v || z) && (fragmentS = y.this.f6207fb.s(itemId)) != null && fragmentS.isAdded()) {
                this.f6214v = itemId;
                FragmentTransaction fragmentTransactionBeginTransaction = y.this.f6211v.beginTransaction();
                Fragment fragment = null;
                for (int i = 0; i < y.this.f6207fb.w(); i++) {
                    long jT = y.this.f6207fb.t(i);
                    Fragment fragmentP = y.this.f6207fb.p(i);
                    if (fragmentP.isAdded()) {
                        if (jT != this.f6214v) {
                            fragmentTransactionBeginTransaction.setMaxLifecycle(fragmentP, s.n3.STARTED);
                        } else {
                            fragment = fragmentP;
                        }
                        fragmentP.setMenuVisibility(jT == this.f6214v);
                    }
                }
                if (fragment != null) {
                    fragmentTransactionBeginTransaction.setMaxLifecycle(fragment, s.n3.RESUMED);
                }
                if (fragmentTransactionBeginTransaction.isEmpty()) {
                    return;
                }
                fragmentTransactionBeginTransaction.commitNow();
            }
        }

        public void n3(@NonNull RecyclerView recyclerView) {
            this.f6213gv = y(recyclerView);
            C0127y c0127y = new C0127y();
            this.y = c0127y;
            this.f6213gv.fb(c0127y);
            n3 n3Var = new n3();
            this.n3 = n3Var;
            y.this.registerAdapterDataObserver(n3Var);
            zn znVar = new zn();
            this.zn = znVar;
            y.this.y.y(znVar);
        }

        @NonNull
        public final ViewPager2 y(@NonNull RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public void zn(@NonNull RecyclerView recyclerView) {
            y(recyclerView).wz(this.y);
            y.this.unregisterAdapterDataObserver(this.n3);
            y.this.y.gv(this.zn);
            this.f6213gv = null;
        }
    }

    public class gv implements Runnable {
        public gv() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y yVar = y.this;
            yVar.f6208p = false;
            yVar.wz();
        }
    }

    public class n3 implements t {
        public final /* synthetic */ le.n3 y;

        public n3(le.n3 n3Var) {
            this.y = n3Var;
        }

        @Override // androidx.lifecycle.t
        public void onStateChanged(@NonNull mt mtVar, @NonNull s.y yVar) {
            if (y.this.mg()) {
                return;
            }
            mtVar.getLifecycle().gv(this);
            if (ut.ut(this.y.n3())) {
                y.this.c(this.y);
            }
        }
    }

    public class v implements t {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Runnable f6217v;
        public final /* synthetic */ Handler y;

        public v(Handler handler, Runnable runnable) {
            this.y = handler;
            this.f6217v = runnable;
        }

        @Override // androidx.lifecycle.t
        public void onStateChanged(@NonNull mt mtVar, @NonNull s.y yVar) {
            if (yVar == s.y.ON_DESTROY) {
                this.y.removeCallbacks(this.f6217v);
                mtVar.getLifecycle().gv(this);
            }
        }
    }

    /* JADX INFO: renamed from: le.y$y, reason: collision with other inner class name */
    public class ViewOnLayoutChangeListenerC0128y implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ le.n3 f6219v;
        public final /* synthetic */ FrameLayout y;

        public ViewOnLayoutChangeListenerC0128y(FrameLayout frameLayout, le.n3 n3Var) {
            this.y = frameLayout;
            this.f6219v = n3Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i5, int i8, int i10, int i11, int i12, int i13, int i14) {
            if (this.y.getParent() != null) {
                this.y.removeOnLayoutChangeListener(this);
                y.this.c(this.f6219v);
            }
        }
    }

    public class zn extends FragmentManager.FragmentLifecycleCallbacks {
        public final /* synthetic */ Fragment n3;
        public final /* synthetic */ FrameLayout zn;

        public zn(Fragment fragment, FrameLayout frameLayout) {
            this.n3 = fragment;
            this.zn = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentViewCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle) {
            if (fragment == this.n3) {
                fragmentManager.unregisterFragmentLifecycleCallbacks(this);
                y.this.gv(view, this.zn);
            }
        }
    }

    public y(@NonNull Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public static boolean mt(@NonNull String str, @NonNull String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    public static long n(@NonNull String str, @NonNull String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    @NonNull
    public static String t(@NonNull String str, long j) {
        return str + j;
    }

    public void c(@NonNull le.n3 n3Var) {
        Fragment fragmentS = this.f6207fb.s(n3Var.getItemId());
        if (fragmentS == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayoutN3 = n3Var.n3();
        View view = fragmentS.getView();
        if (!fragmentS.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragmentS.isAdded() && view == null) {
            rz(fragmentS, frameLayoutN3);
            return;
        }
        if (fragmentS.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayoutN3) {
                gv(view, frameLayoutN3);
                return;
            }
            return;
        }
        if (fragmentS.isAdded()) {
            gv(view, frameLayoutN3);
            return;
        }
        if (mg()) {
            if (this.f6211v.isDestroyed()) {
                return;
            }
            this.y.y(new n3(n3Var));
            return;
        }
        rz(fragmentS, frameLayoutN3);
        this.f6211v.beginTransaction().add(fragmentS, "f" + n3Var.getItemId()).setMaxLifecycle(fragmentS, s.n3.STARTED).commitNow();
        this.w.gv(false);
    }

    public final Long co(int i) {
        Long lValueOf = null;
        for (int i5 = 0; i5 < this.f6210t.w(); i5++) {
            if (this.f6210t.p(i5).intValue() == i) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.f6210t.t(i5));
            }
        }
        return lValueOf;
    }

    public final void d0(long j) {
        ViewParent parent;
        Fragment fragmentS = this.f6207fb.s(j);
        if (fragmentS == null) {
            return;
        }
        if (fragmentS.getView() != null && (parent = fragmentS.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!v(j)) {
            this.f6209s.wz(j);
        }
        if (!fragmentS.isAdded()) {
            this.f6207fb.wz(j);
            return;
        }
        if (mg()) {
            this.f6206co = true;
            return;
        }
        if (fragmentS.isAdded() && v(j)) {
            this.f6209s.tl(j, this.f6211v.saveFragmentInstanceState(fragmentS));
        }
        this.f6211v.beginTransaction().remove(fragmentS).commitNow();
        this.f6207fb.wz(j);
    }

    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final void onViewRecycled(@NonNull le.n3 n3Var) {
        Long lCo = co(n3Var.n3().getId());
        if (lCo != null) {
            d0(lCo.longValue());
            this.f6210t.wz(lCo.longValue());
        }
    }

    public final void fh() {
        Handler handler = new Handler(Looper.getMainLooper());
        gv gvVar = new gv();
        this.y.y(new v(handler, gvVar));
        handler.postDelayed(gvVar, 10000L);
    }

    public long getItemId(int i) {
        return i;
    }

    public void gv(@NonNull View view, @NonNull FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public final void onViewAttachedToWindow(@NonNull le.n3 n3Var) {
        c(n3Var);
        wz();
    }

    @NonNull
    public abstract Fragment i9(int i);

    public boolean mg() {
        return this.f6211v.isStateSaved();
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        j5.s.y(this.w == null);
        fb fbVar = new fb();
        this.w = fbVar;
        fbVar.n3(recyclerView);
    }

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        this.w.zn(recyclerView);
        this.w = null;
    }

    @NonNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final le.n3 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return le.n3.y(viewGroup);
    }

    public final void rz(Fragment fragment, @NonNull FrameLayout frameLayout) {
        this.f6211v.registerFragmentLifecycleCallbacks(new zn(fragment, frameLayout), false);
    }

    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public final void tl(int i) {
        long itemId = getItemId(i);
        if (this.f6207fb.v(itemId)) {
            return;
        }
        Fragment fragmentI9 = i9(i);
        fragmentI9.setInitialSavedState(this.f6209s.s(itemId));
        this.f6207fb.tl(itemId, fragmentI9);
    }

    public boolean v(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    public final boolean w(long j) {
        View view;
        if (this.f6210t.v(j)) {
            return true;
        }
        Fragment fragmentS = this.f6207fb.s(j);
        return (fragmentS == null || (view = fragmentS.getView()) == null || view.getParent() == null) ? false : true;
    }

    public void wz() {
        if (!this.f6206co || mg()) {
            return;
        }
        x4.n3 n3Var = new x4.n3();
        for (int i = 0; i < this.f6207fb.w(); i++) {
            long jT = this.f6207fb.t(i);
            if (!v(jT)) {
                n3Var.add(Long.valueOf(jT));
                this.f6210t.wz(jT);
            }
        }
        if (!this.f6208p) {
            this.f6206co = false;
            for (int i5 = 0; i5 < this.f6207fb.w(); i5++) {
                long jT2 = this.f6207fb.t(i5);
                if (!w(jT2)) {
                    n3Var.add(Long.valueOf(jT2));
                }
            }
        }
        Iterator<E> it = n3Var.iterator();
        while (it.hasNext()) {
            d0(((Long) it.next()).longValue());
        }
    }

    /* JADX INFO: renamed from: x4, reason: merged with bridge method [inline-methods] */
    public final boolean onFailedToRecycleView(@NonNull le.n3 n3Var) {
        return true;
    }

    @Override // le.zn
    @NonNull
    public final Parcelable y() {
        Bundle bundle = new Bundle(this.f6207fb.w() + this.f6209s.w());
        for (int i = 0; i < this.f6207fb.w(); i++) {
            long jT = this.f6207fb.t(i);
            Fragment fragmentS = this.f6207fb.s(jT);
            if (fragmentS != null && fragmentS.isAdded()) {
                this.f6211v.putFragment(bundle, t("f#", jT), fragmentS);
            }
        }
        for (int i5 = 0; i5 < this.f6209s.w(); i5++) {
            long jT2 = this.f6209s.t(i5);
            if (v(jT2)) {
                bundle.putParcelable(t("s#", jT2), this.f6209s.s(jT2));
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(@NonNull le.n3 n3Var, int i) {
        long itemId = n3Var.getItemId();
        int id = n3Var.n3().getId();
        Long lCo = co(id);
        if (lCo != null && lCo.longValue() != itemId) {
            d0(lCo.longValue());
            this.f6210t.wz(lCo.longValue());
        }
        this.f6210t.tl(itemId, Integer.valueOf(id));
        tl(i);
        FrameLayout frameLayoutN3 = n3Var.n3();
        if (ut.ut(frameLayoutN3)) {
            if (frameLayoutN3.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayoutN3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0128y(frameLayoutN3, n3Var));
        }
        wz();
    }

    @Override // le.zn
    public final void zn(@NonNull Parcelable parcelable) {
        if (!this.f6209s.f() || !this.f6207fb.f()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (mt(str, "f#")) {
                this.f6207fb.tl(n(str, "f#"), this.f6211v.getFragment(bundle, str));
            } else {
                if (!mt(str, "s#")) {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
                long jN = n(str, "s#");
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (v(jN)) {
                    this.f6209s.tl(jN, savedState);
                }
            }
        }
        if (this.f6207fb.f()) {
            return;
        }
        this.f6206co = true;
        this.f6208p = true;
        wz();
        fh();
    }

    public y(@NonNull FragmentManager fragmentManager, @NonNull s sVar) {
        this.f6207fb = new x4.v<>();
        this.f6209s = new x4.v<>();
        this.f6210t = new x4.v<>();
        this.f6208p = false;
        this.f6206co = false;
        this.f6211v = fragmentManager;
        this.y = sVar;
        super.setHasStableIds(true);
    }
}
