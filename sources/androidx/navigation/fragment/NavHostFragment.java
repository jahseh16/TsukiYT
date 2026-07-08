package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.fragment.n3;
import androidx.navigation.gv;
import androidx.navigation.w;
import androidx.navigation.xc;
import ap.hw;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import qk.zn;
import u0.i9;
import u0.tl;
import yt.v;

/* JADX INFO: loaded from: classes.dex */
public class NavHostFragment extends Fragment {
    public static final y fh = new y(null);

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public View f930co;
    public boolean d0;
    public int f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Lazy f931fb = LazyKt.lazy(new n3());

    public static final class n3 extends Lambda implements Function0<i9> {
        public n3() {
            super(0);
        }

        public static final Bundle a(i9 this_apply) {
            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            Bundle bundleLc = this_apply.lc();
            if (bundleLc != null) {
                return bundleLc;
            }
            Bundle EMPTY = Bundle.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            return EMPTY;
        }

        public static final Bundle f(NavHostFragment this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (this$0.f3 != 0) {
                return v.y(TuplesKt.to("android-support-nav:fragment:graphId", Integer.valueOf(this$0.f3)));
            }
            Bundle bundle = Bundle.EMPTY;
            Intrinsics.checkNotNullExpressionValue(bundle, "{\n                    Bu…e.EMPTY\n                }");
            return bundle;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public final i9 invoke() {
            Context context = NavHostFragment.this.getContext();
            if (context == null) {
                throw new IllegalStateException("NavController cannot be created before the fragment is attached");
            }
            Intrinsics.checkNotNullExpressionValue(context, "checkNotNull(context) {\n…nt is attached\"\n        }");
            final i9 i9Var = new i9(context);
            final NavHostFragment navHostFragment = NavHostFragment.this;
            i9Var.ap(navHostFragment);
            hw viewModelStore = navHostFragment.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            i9Var.yg(viewModelStore);
            navHostFragment.xh(i9Var);
            Bundle bundleN3 = navHostFragment.getSavedStateRegistry().n3("android-support-nav:fragment:navControllerState");
            if (bundleN3 != null) {
                i9Var.rs(bundleN3);
            }
            navHostFragment.getSavedStateRegistry().s("android-support-nav:fragment:navControllerState", new zn.InterfaceC0151zn() { // from class: bk.a
                @Override // qk.zn.InterfaceC0151zn
                public final Bundle y() {
                    return NavHostFragment.n3.a(i9Var);
                }
            });
            Bundle bundleN32 = navHostFragment.getSavedStateRegistry().n3("android-support-nav:fragment:graphId");
            if (bundleN32 != null) {
                navHostFragment.f3 = bundleN32.getInt("android-support-nav:fragment:graphId");
            }
            navHostFragment.getSavedStateRegistry().s("android-support-nav:fragment:graphId", new zn.InterfaceC0151zn() { // from class: bk.fb
                @Override // qk.zn.InterfaceC0151zn
                public final Bundle y() {
                    return NavHostFragment.n3.f(navHostFragment);
                }
            });
            if (navHostFragment.f3 != 0) {
                i9Var.nf(navHostFragment.f3);
            } else {
                Bundle arguments = navHostFragment.getArguments();
                int i = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
                Bundle bundle = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                if (i != 0) {
                    i9Var.ra(i, bundle);
                }
            }
            return i9Var;
        }
    }

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final gv y(Fragment fragment) {
            Dialog dialog;
            Window window;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                if (parentFragment instanceof NavHostFragment) {
                    return ((NavHostFragment) parentFragment).nz();
                }
                Fragment primaryNavigationFragment = parentFragment.getParentFragmentManager().getPrimaryNavigationFragment();
                if (primaryNavigationFragment instanceof NavHostFragment) {
                    return ((NavHostFragment) primaryNavigationFragment).nz();
                }
            }
            View view = fragment.getView();
            if (view != null) {
                return tl.zn(view);
            }
            View decorView = null;
            DialogFragment dialogFragment = fragment instanceof DialogFragment ? (DialogFragment) fragment : null;
            if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
                decorView = window.getDecorView();
            }
            if (decorView != null) {
                return tl.zn(decorView);
            }
            throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
        }

        public y() {
        }
    }

    public final gv cw() {
        return nz();
    }

    public xc<? extends n3.zn> j4() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        return new androidx.navigation.fragment.n3(contextRequireContext, childFragmentManager, t7());
    }

    public void l8(gv navController) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        w wVarEj = navController.ej();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        wVarEj.n3(new bk.n3(contextRequireContext, childFragmentManager));
        navController.ej().n3(j4());
    }

    public final i9 nz() {
        return (i9) this.f931fb.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (this.d0) {
            getParentFragmentManager().beginTransaction().setPrimaryNavigationFragment(this).commit();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        nz();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.d0 = true;
            getParentFragmentManager().beginTransaction().setPrimaryNavigationFragment(this).commit();
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(t7());
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.f930co;
        if (view != null && tl.zn(view) == nz()) {
            tl.a(view, null);
        }
        this.f930co = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Context context, AttributeSet attrs, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.onInflate(context, attrs, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, androidx.navigation.R$styleable.f886fb);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.R$styleable.f889s, 0);
        if (resourceId != 0) {
            this.f3 = resourceId;
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, R$styleable.f934v);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (typedArrayObtainStyledAttributes2.getBoolean(R$styleable.f932a, false)) {
            this.d0 = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.d0) {
            outState.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        tl.a(view, nz());
        if (view.getParent() != null) {
            Object parent = view.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.f930co = view2;
            Intrinsics.checkNotNull(view2);
            if (view2.getId() == getId()) {
                View view3 = this.f930co;
                Intrinsics.checkNotNull(view3);
                tl.a(view3, nz());
            }
        }
    }

    public final int t7() {
        int id = getId();
        return (id == 0 || id == -1) ? R$id.y : id;
    }

    public void xh(i9 navHostController) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        l8(navHostController);
    }
}
