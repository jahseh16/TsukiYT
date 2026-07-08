package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.rz;
import androidx.lifecycle.s;
import androidx.navigation.fragment.n3;
import androidx.navigation.xc;
import ap.b;
import ap.fh;
import ap.hw;
import ap.mt;
import ap.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.SequencesKt;
import u0.wz;
import yg.y;

/* JADX INFO: loaded from: classes.dex */
@xc.n3("fragment")
public class n3 extends xc<zn> {

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final C0022n3 f935i9 = new C0022n3(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<String> f936a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final Function1<androidx.navigation.zn, androidx.lifecycle.t> f937c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final List<Pair<String, Boolean>> f938fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final FragmentManager f939gv;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final androidx.lifecycle.t f940s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f941v;
    public final Context zn;

    public static final class a extends Lambda implements Function0<Unit> {
        final /* synthetic */ androidx.navigation.zn $entry;
        final /* synthetic */ Fragment $fragment;
        final /* synthetic */ wz $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.navigation.zn znVar, wz wzVar, Fragment fragment) {
            super(0);
            this.$entry = znVar;
            this.$state = wzVar;
            this.$fragment = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            wz wzVar = this.$state;
            Fragment fragment = this.$fragment;
            for (androidx.navigation.zn znVar : wzVar.zn().getValue()) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + znVar + " due to fragment " + fragment + " viewmodel being cleared");
                }
                wzVar.v(znVar);
            }
        }
    }

    public static final class c5 extends Lambda implements Function1<androidx.navigation.zn, androidx.lifecycle.t> {
        public c5() {
            super(1);
        }

        public static final void gv(n3 this$0, androidx.navigation.zn entry, mt owner, s.y event) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(entry, "$entry");
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == s.y.ON_RESUME && this$0.n3().n3().getValue().contains(entry)) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + entry + " due to fragment " + owner + " view lifecycle reaching RESUMED");
                }
                this$0.n3().v(entry);
            }
            if (event == s.y.ON_DESTROY) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + entry + " due to fragment " + owner + " view lifecycle reaching DESTROYED");
                }
                this$0.n3().v(entry);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.t invoke(final androidx.navigation.zn entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            final n3 n3Var = n3.this;
            return new androidx.lifecycle.t() { // from class: bk.v
                @Override // androidx.lifecycle.t
                public final void onStateChanged(mt mtVar, s.y yVar) {
                    n3.c5.gv(n3Var, entry, mtVar, yVar);
                }
            };
        }
    }

    public static final class f extends Lambda implements Function1<Pair<? extends String, ? extends Boolean>, String> {
        public static final f y = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final String invoke(Pair<String, Boolean> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getFirst();
        }
    }

    public static final class fb extends Lambda implements Function1<yg.y, y> {
        public static final fb y = new fb();

        public fb() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final y invoke(yg.y initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return new y();
        }
    }

    public static final class gv implements xc.y {
        public final LinkedHashMap<View, String> y;

        public final Map<View, String> y() {
            return MapsKt.toMap(this.y);
        }
    }

    public static final class i9 implements FragmentManager.OnBackStackChangedListener {
        public final /* synthetic */ n3 n3;
        public final /* synthetic */ wz y;

        public i9(wz wzVar, n3 n3Var) {
            this.y = wzVar;
            this.n3 = n3Var;
        }

        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public void onBackStackChangeCommitted(Fragment fragment, boolean z) {
            Object obj;
            Object objPrevious;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            List listPlus = CollectionsKt.plus((Collection) this.y.n3().getValue(), (Iterable) this.y.zn().getValue());
            ListIterator listIterator = listPlus.listIterator(listPlus.size());
            while (true) {
                obj = null;
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (Intrinsics.areEqual(((androidx.navigation.zn) objPrevious).a(), fragment.getTag())) {
                        break;
                    }
                }
            }
            androidx.navigation.zn znVar = (androidx.navigation.zn) objPrevious;
            boolean z5 = z && this.n3.i4().isEmpty() && fragment.isRemoving();
            Iterator<T> it = this.n3.i4().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((Pair) next).getFirst(), fragment.getTag())) {
                    obj = next;
                    break;
                }
            }
            Pair pair = (Pair) obj;
            if (pair != null) {
                this.n3.i4().remove(pair);
            }
            if (!z5 && FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + znVar);
            }
            boolean z7 = pair != null && ((Boolean) pair.getSecond()).booleanValue();
            if (!z && !z7 && znVar == null) {
                throw new IllegalArgumentException(("The fragment " + fragment + " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
            }
            if (znVar != null) {
                this.n3.mt(fragment, znVar, this.y);
                if (z5) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + znVar + " via system back");
                    }
                    this.y.c5(znVar, false);
                }
            }
        }

        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public void onBackStackChangeStarted(Fragment fragment, boolean z) {
            androidx.navigation.zn znVarPrevious;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            if (z) {
                List<androidx.navigation.zn> value = this.y.n3().getValue();
                ListIterator<androidx.navigation.zn> listIterator = value.listIterator(value.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        znVarPrevious = null;
                        break;
                    } else {
                        znVarPrevious = listIterator.previous();
                        if (Intrinsics.areEqual(znVarPrevious.a(), fragment.getTag())) {
                            break;
                        }
                    }
                }
                androidx.navigation.zn znVar = znVarPrevious;
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + znVar);
                }
                if (znVar != null) {
                    this.y.i9(znVar);
                }
            }
        }

        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public void onBackStackChanged() {
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.fragment.n3$n3, reason: collision with other inner class name */
    public static final class C0022n3 {
        public /* synthetic */ C0022n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0022n3() {
        }
    }

    public static final class s extends Lambda implements Function1<mt, Unit> {
        final /* synthetic */ androidx.navigation.zn $entry;
        final /* synthetic */ Fragment $fragment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Fragment fragment, androidx.navigation.zn znVar) {
            super(1);
            this.$fragment = fragment;
            this.$entry = znVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(mt mtVar) {
            y(mtVar);
            return Unit.INSTANCE;
        }

        public final void y(mt mtVar) {
            List<Pair<String, Boolean>> listI4 = n3.this.i4();
            Fragment fragment = this.$fragment;
            boolean z = false;
            if (!(listI4 instanceof Collection) || !listI4.isEmpty()) {
                Iterator<T> it = listI4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (Intrinsics.areEqual(((Pair) it.next()).getFirst(), fragment.getTag())) {
                        z = true;
                        break;
                    }
                }
            }
            if (mtVar == null || z) {
                return;
            }
            androidx.lifecycle.s lifecycle = this.$fragment.getViewLifecycleOwner().getLifecycle();
            if (lifecycle.n3().n3(s.n3.CREATED)) {
                lifecycle.y((p) n3.this.f937c5.invoke(this.$entry));
            }
        }
    }

    public static final class t implements fh, FunctionAdapter {
        public final /* synthetic */ Function1 y;

        public t(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.y = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof fh) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.y;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // ap.fh
        public final /* synthetic */ void onChanged(Object obj) {
            this.y.invoke(obj);
        }
    }

    public static final class v extends Lambda implements Function1<Pair<? extends String, ? extends Boolean>, Boolean> {
        final /* synthetic */ String $id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str) {
            super(1);
            this.$id = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Pair<String, Boolean> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.areEqual(it.getFirst(), this.$id));
        }
    }

    public static final class y extends b {
        public WeakReference<Function0<Unit>> y;

        @Override // ap.b
        public void onCleared() {
            super.onCleared();
            Function0<Unit> function0 = y0().get();
            if (function0 != null) {
                function0.invoke();
            }
        }

        public final void t6(WeakReference<Function0<Unit>> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            this.y = weakReference;
        }

        public final WeakReference<Function0<Unit>> y0() {
            WeakReference<Function0<Unit>> weakReference = this.y;
            if (weakReference != null) {
                return weakReference;
            }
            Intrinsics.throwUninitializedPropertyAccessException("completeTransition");
            return null;
        }
    }

    public static class zn extends androidx.navigation.s {
        public String f3;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zn(xc<? extends zn> fragmentNavigator) {
            super(fragmentNavigator);
            Intrinsics.checkNotNullParameter(fragmentNavigator, "fragmentNavigator");
        }

        public final zn c(String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f3 = className;
            return this;
        }

        @Override // androidx.navigation.s
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof zn) && super.equals(obj) && Intrinsics.areEqual(this.f3, ((zn) obj).f3);
        }

        @Override // androidx.navigation.s
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f3;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.s
        public void mt(Context context, AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            super.mt(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, R$styleable.zn);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = typedArrayObtainAttributes.getString(R$styleable.f933gv);
            if (string != null) {
                c(string);
            }
            Unit unit = Unit.INSTANCE;
            typedArrayObtainAttributes.recycle();
        }

        public final String n() {
            String str = this.f3;
            if (str == null) {
                throw new IllegalStateException("Fragment class was not set");
            }
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        @Override // androidx.navigation.s
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.f3;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
            return string;
        }
    }

    public n3(Context context, FragmentManager fragmentManager, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.zn = context;
        this.f939gv = fragmentManager;
        this.f941v = i;
        this.f936a = new LinkedHashSet();
        this.f938fb = new ArrayList();
        this.f940s = new androidx.lifecycle.t() { // from class: bk.zn
            @Override // androidx.lifecycle.t
            public final void onStateChanged(mt mtVar, s.y yVar) {
                androidx.navigation.fragment.n3.x4(this.y, mtVar, yVar);
            }
        };
        this.f937c5 = new c5();
    }

    private final void f3(androidx.navigation.zn znVar, androidx.navigation.t tVar, xc.y yVar) {
        boolean zIsEmpty = n3().n3().getValue().isEmpty();
        if (tVar != null && !zIsEmpty && tVar.i9() && this.f936a.remove(znVar.a())) {
            this.f939gv.restoreBackStack(znVar.a());
            n3().t(znVar);
            return;
        }
        FragmentTransaction fragmentTransactionR = r(znVar, tVar);
        if (!zIsEmpty) {
            androidx.navigation.zn znVar2 = (androidx.navigation.zn) CollectionsKt.lastOrNull(n3().n3().getValue());
            if (znVar2 != null) {
                p(this, znVar2.a(), false, false, 6, null);
            }
            p(this, znVar.a(), false, false, 6, null);
            fragmentTransactionR.addToBackStack(znVar.a());
        }
        if (yVar instanceof gv) {
            for (Map.Entry<View, String> entry : ((gv) yVar).y().entrySet()) {
                fragmentTransactionR.addSharedElement(entry.getKey(), entry.getValue());
            }
        }
        fragmentTransactionR.commit();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + znVar);
        }
        n3().t(znVar);
    }

    public static final void n(wz state, n3 this$0, FragmentManager fragmentManager, Fragment fragment) {
        androidx.navigation.zn znVarPrevious;
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fragmentManager, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        List<androidx.navigation.zn> value = state.n3().getValue();
        ListIterator<androidx.navigation.zn> listIterator = value.listIterator(value.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                znVarPrevious = null;
                break;
            } else {
                znVarPrevious = listIterator.previous();
                if (Intrinsics.areEqual(znVarPrevious.a(), fragment.getTag())) {
                    break;
                }
            }
        }
        androidx.navigation.zn znVar = znVarPrevious;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentNavigator", "Attaching fragment " + fragment + " associated with entry " + znVar + " to FragmentManager " + this$0.f939gv);
        }
        if (znVar != null) {
            this$0.co(znVar, fragment);
            this$0.mt(fragment, znVar, state);
        }
    }

    public static /* synthetic */ void p(n3 n3Var, String str, boolean z, boolean z5, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPendingOps");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z5 = true;
        }
        n3Var.w(str, z, z5);
    }

    public static final void x4(n3 this$0, mt source, s.y event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == s.y.ON_DESTROY) {
            Fragment fragment = (Fragment) source;
            Object obj = null;
            for (Object obj2 : this$0.n3().zn().getValue()) {
                if (Intrinsics.areEqual(((androidx.navigation.zn) obj2).a(), fragment.getTag())) {
                    obj = obj2;
                }
            }
            androidx.navigation.zn znVar = (androidx.navigation.zn) obj;
            if (znVar != null) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + znVar + " due to fragment " + source + " lifecycle reaching DESTROYED");
                }
                this$0.n3().v(znVar);
            }
        }
    }

    @Override // androidx.navigation.xc
    public void a(final wz state) {
        Intrinsics.checkNotNullParameter(state, "state");
        super.a(state);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentNavigator", "onAttach");
        }
        this.f939gv.addFragmentOnAttachListener(new FragmentOnAttachListener() { // from class: bk.gv
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
                androidx.navigation.fragment.n3.n(state, this, fragmentManager, fragment);
            }
        });
        this.f939gv.addOnBackStackChangedListener(new i9(state, this));
    }

    @Override // androidx.navigation.xc
    public Bundle c5() {
        if (this.f936a.isEmpty()) {
            return null;
        }
        return yt.v.y(TuplesKt.to("androidx-nav-fragment:navigator:savedIds", new ArrayList(this.f936a)));
    }

    public final void co(androidx.navigation.zn znVar, Fragment fragment) {
        fragment.getViewLifecycleOwnerLiveData().observe(fragment, new t(new s(fragment, znVar)));
        fragment.getLifecycle().y(this.f940s);
    }

    @Override // androidx.navigation.xc
    public void fb(androidx.navigation.zn backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        if (this.f939gv.isStateSaved()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        FragmentTransaction fragmentTransactionR = r(backStackEntry, null);
        List<androidx.navigation.zn> value = n3().n3().getValue();
        if (value.size() > 1) {
            androidx.navigation.zn znVar = (androidx.navigation.zn) CollectionsKt.getOrNull(value, CollectionsKt.getLastIndex(value) - 1);
            if (znVar != null) {
                p(this, znVar.a(), false, false, 6, null);
            }
            p(this, backStackEntry.a(), true, false, 4, null);
            this.f939gv.popBackStack(backStackEntry.a(), 1);
            p(this, backStackEntry.a(), false, false, 2, null);
            fragmentTransactionR.addToBackStack(backStackEntry.a());
        }
        fragmentTransactionR.commit();
        n3().a(backStackEntry);
    }

    public final List<Pair<String, Boolean>> i4() {
        return this.f938fb;
    }

    @Override // androidx.navigation.xc
    public void i9(androidx.navigation.zn popUpTo, boolean z) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        if (this.f939gv.isStateSaved()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List<androidx.navigation.zn> value = n3().n3().getValue();
        int iIndexOf = value.indexOf(popUpTo);
        List<androidx.navigation.zn> listSubList = value.subList(iIndexOf, value.size());
        androidx.navigation.zn znVar = (androidx.navigation.zn) CollectionsKt.first((List) value);
        if (z) {
            for (androidx.navigation.zn znVar2 : CollectionsKt.reversed(listSubList)) {
                if (Intrinsics.areEqual(znVar2, znVar)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + znVar2);
                } else {
                    this.f939gv.saveBackStack(znVar2.a());
                    this.f936a.add(znVar2.a());
                }
            }
        } else {
            this.f939gv.popBackStack(popUpTo.a(), 1);
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + popUpTo + " with savedState " + z);
        }
        androidx.navigation.zn znVar3 = (androidx.navigation.zn) CollectionsKt.getOrNull(value, iIndexOf - 1);
        if (znVar3 != null) {
            p(this, znVar3.a(), false, false, 6, null);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSubList) {
            androidx.navigation.zn znVar4 = (androidx.navigation.zn) obj;
            if (SequencesKt.contains(SequencesKt.map(CollectionsKt.asSequence(this.f938fb), f.y), znVar4.a()) || !Intrinsics.areEqual(znVar4.a(), znVar.a())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p(this, ((androidx.navigation.zn) it.next()).a(), true, false, 4, null);
        }
        n3().c5(popUpTo, z);
    }

    public final void mt(Fragment fragment, androidx.navigation.zn entry, wz state) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(state, "state");
        hw viewModelStore = fragment.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "fragment.viewModelStore");
        yg.zn znVar = new yg.zn();
        znVar.y(Reflection.getOrCreateKotlinClass(y.class), fb.y);
        ((y) new rz(viewModelStore, znVar.n3(), y.C0200y.n3).y(y.class)).t6(new WeakReference<>(new a(entry, state, fragment)));
    }

    public final FragmentTransaction r(androidx.navigation.zn znVar, androidx.navigation.t tVar) {
        androidx.navigation.s sVarV = znVar.v();
        Intrinsics.checkNotNull(sVarV, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle bundleZn = znVar.zn();
        String strN = ((zn) sVarV).n();
        if (strN.charAt(0) == '.') {
            strN = this.zn.getPackageName() + strN;
        }
        Fragment fragmentInstantiate = this.f939gv.getFragmentFactory().instantiate(this.zn.getClassLoader(), strN);
        Intrinsics.checkNotNullExpressionValue(fragmentInstantiate, "fragmentManager.fragment…t.classLoader, className)");
        fragmentInstantiate.setArguments(bundleZn);
        FragmentTransaction fragmentTransactionBeginTransaction = this.f939gv.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "fragmentManager.beginTransaction()");
        int iY = tVar != null ? tVar.y() : -1;
        int iN3 = tVar != null ? tVar.n3() : -1;
        int iZn = tVar != null ? tVar.zn() : -1;
        int iGv = tVar != null ? tVar.gv() : -1;
        if (iY != -1 || iN3 != -1 || iZn != -1 || iGv != -1) {
            if (iY == -1) {
                iY = 0;
            }
            if (iN3 == -1) {
                iN3 = 0;
            }
            if (iZn == -1) {
                iZn = 0;
            }
            fragmentTransactionBeginTransaction.setCustomAnimations(iY, iN3, iZn, iGv != -1 ? iGv : 0);
        }
        fragmentTransactionBeginTransaction.replace(this.f941v, fragmentInstantiate, znVar.a());
        fragmentTransactionBeginTransaction.setPrimaryNavigationFragment(fragmentInstantiate);
        fragmentTransactionBeginTransaction.setReorderingAllowed(true);
        return fragmentTransactionBeginTransaction;
    }

    @Override // androidx.navigation.xc
    public void s(Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        ArrayList<String> stringArrayList = savedState.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            this.f936a.clear();
            CollectionsKt.addAll(this.f936a, stringArrayList);
        }
    }

    @Override // androidx.navigation.xc
    public void v(List<androidx.navigation.zn> entries, androidx.navigation.t tVar, xc.y yVar) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        if (this.f939gv.isStateSaved()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<androidx.navigation.zn> it = entries.iterator();
        while (it.hasNext()) {
            f3(it.next(), tVar, yVar);
        }
    }

    public final void w(String str, boolean z, boolean z5) {
        if (z5) {
            CollectionsKt.removeAll((List) this.f938fb, (Function1) new v(str));
        }
        this.f938fb.add(TuplesKt.to(str, Boolean.valueOf(z)));
    }

    @Override // androidx.navigation.xc
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public zn y() {
        return new zn(this);
    }
}
