package bk;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.navigation.fragment.R$styleable;
import androidx.navigation.s;
import androidx.navigation.xc;
import ap.mt;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import u0.wz;

/* JADX INFO: loaded from: classes.dex */
@xc.n3("dialog")
public final class n3 extends xc<C0038n3> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final y f1330s = new y(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zn f1331a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Map<String, DialogFragment> f1332fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final FragmentManager f1333gv;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Set<String> f1334v;
    public final Context zn;

    /* JADX INFO: renamed from: bk.n3$n3, reason: collision with other inner class name */
    public static class C0038n3 extends s implements u0.zn {
        public String f3;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0038n3(xc<? extends C0038n3> fragmentNavigator) {
            super(fragmentNavigator);
            Intrinsics.checkNotNullParameter(fragmentNavigator, "fragmentNavigator");
        }

        public final C0038n3 c(String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f3 = className;
            return this;
        }

        @Override // androidx.navigation.s
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof C0038n3) && super.equals(obj) && Intrinsics.areEqual(this.f3, ((C0038n3) obj).f3);
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
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, R$styleable.y);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "context.resources.obtain…ntNavigator\n            )");
            String string = typedArrayObtainAttributes.getString(R$styleable.n3);
            if (string != null) {
                c(string);
            }
            typedArrayObtainAttributes.recycle();
        }

        public final String n() {
            String str = this.f3;
            if (str == null) {
                throw new IllegalStateException("DialogFragment class was not set");
            }
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }
    }

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public y() {
        }
    }

    public static final class zn implements t {

        public /* synthetic */ class y {
            public static final /* synthetic */ int[] y;

            static {
                int[] iArr = new int[s.y.values().length];
                try {
                    iArr[s.y.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[s.y.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[s.y.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[s.y.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                y = iArr;
            }
        }

        public zn() {
        }

        @Override // androidx.lifecycle.t
        public void onStateChanged(mt source, s.y event) {
            int iNextIndex;
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            int i = y.y[event.ordinal()];
            if (i == 1) {
                DialogFragment dialogFragment = (DialogFragment) source;
                List<androidx.navigation.zn> value = n3.this.n3().n3().getValue();
                if (!(value instanceof Collection) || !value.isEmpty()) {
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((androidx.navigation.zn) it.next()).a(), dialogFragment.getTag())) {
                            return;
                        }
                    }
                }
                dialogFragment.dismiss();
                return;
            }
            Object obj = null;
            if (i == 2) {
                DialogFragment dialogFragment2 = (DialogFragment) source;
                for (Object obj2 : n3.this.n3().zn().getValue()) {
                    if (Intrinsics.areEqual(((androidx.navigation.zn) obj2).a(), dialogFragment2.getTag())) {
                        obj = obj2;
                    }
                }
                androidx.navigation.zn znVar = (androidx.navigation.zn) obj;
                if (znVar != null) {
                    n3.this.n3().v(znVar);
                    return;
                }
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                DialogFragment dialogFragment3 = (DialogFragment) source;
                for (Object obj3 : n3.this.n3().zn().getValue()) {
                    if (Intrinsics.areEqual(((androidx.navigation.zn) obj3).a(), dialogFragment3.getTag())) {
                        obj = obj3;
                    }
                }
                androidx.navigation.zn znVar2 = (androidx.navigation.zn) obj;
                if (znVar2 != null) {
                    n3.this.n3().v(znVar2);
                }
                dialogFragment3.getLifecycle().gv(this);
                return;
            }
            DialogFragment dialogFragment4 = (DialogFragment) source;
            if (dialogFragment4.requireDialog().isShowing()) {
                return;
            }
            List<androidx.navigation.zn> value2 = n3.this.n3().n3().getValue();
            ListIterator<androidx.navigation.zn> listIterator = value2.listIterator(value2.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (Intrinsics.areEqual(listIterator.previous().a(), dialogFragment4.getTag())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            androidx.navigation.zn znVar3 = (androidx.navigation.zn) CollectionsKt.getOrNull(value2, iNextIndex);
            if (!Intrinsics.areEqual(CollectionsKt.lastOrNull(value2), znVar3)) {
                Log.i("DialogFragmentNavigator", "Dialog " + dialogFragment4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
            }
            if (znVar3 != null) {
                n3.this.co(iNextIndex, znVar3, false);
            }
        }
    }

    public n3(Context context, FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.zn = context;
        this.f1333gv = fragmentManager;
        this.f1334v = new LinkedHashSet();
        this.f1331a = new zn();
        this.f1332fb = new LinkedHashMap();
    }

    public static final void mt(n3 this$0, FragmentManager fragmentManager, Fragment childFragment) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fragmentManager, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(childFragment, "childFragment");
        Set<String> set = this$0.f1334v;
        if (TypeIntrinsics.asMutableCollection(set).remove(childFragment.getTag())) {
            childFragment.getLifecycle().y(this$0.f1331a);
        }
        Map<String, DialogFragment> map = this$0.f1332fb;
        TypeIntrinsics.asMutableMap(map).remove(childFragment.getTag());
    }

    @Override // androidx.navigation.xc
    public void a(wz state) {
        androidx.lifecycle.s lifecycle;
        Intrinsics.checkNotNullParameter(state, "state");
        super.a(state);
        for (androidx.navigation.zn znVar : state.n3().getValue()) {
            DialogFragment dialogFragment = (DialogFragment) this.f1333gv.findFragmentByTag(znVar.a());
            if (dialogFragment == null || (lifecycle = dialogFragment.getLifecycle()) == null) {
                this.f1334v.add(znVar.a());
            } else {
                lifecycle.y(this.f1331a);
            }
        }
        this.f1333gv.addFragmentOnAttachListener(new FragmentOnAttachListener() { // from class: bk.y
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
                n3.mt(this.y, fragmentManager, fragment);
            }
        });
    }

    public final void co(int i, androidx.navigation.zn znVar, boolean z) {
        androidx.navigation.zn znVar2 = (androidx.navigation.zn) CollectionsKt.getOrNull(n3().n3().getValue(), i - 1);
        boolean zContains = CollectionsKt.contains(n3().zn().getValue(), znVar2);
        n3().c5(znVar, z);
        if (znVar2 == null || zContains) {
            return;
        }
        n3().v(znVar2);
    }

    @Override // androidx.navigation.xc
    public void fb(androidx.navigation.zn backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        if (this.f1333gv.isStateSaved()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        DialogFragment dialogFragment = this.f1332fb.get(backStackEntry.a());
        if (dialogFragment == null) {
            Fragment fragmentFindFragmentByTag = this.f1333gv.findFragmentByTag(backStackEntry.a());
            dialogFragment = fragmentFindFragmentByTag instanceof DialogFragment ? (DialogFragment) fragmentFindFragmentByTag : null;
        }
        if (dialogFragment != null) {
            dialogFragment.getLifecycle().gv(this.f1331a);
            dialogFragment.dismiss();
        }
        w(backStackEntry).show(this.f1333gv, backStackEntry.a());
        n3().fb(backStackEntry);
    }

    @Override // androidx.navigation.xc
    public void i9(androidx.navigation.zn popUpTo, boolean z) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        if (this.f1333gv.isStateSaved()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List<androidx.navigation.zn> value = n3().n3().getValue();
        int iIndexOf = value.indexOf(popUpTo);
        Iterator it = CollectionsKt.reversed(value.subList(iIndexOf, value.size())).iterator();
        while (it.hasNext()) {
            Fragment fragmentFindFragmentByTag = this.f1333gv.findFragmentByTag(((androidx.navigation.zn) it.next()).a());
            if (fragmentFindFragmentByTag != null) {
                ((DialogFragment) fragmentFindFragmentByTag).dismiss();
            }
        }
        co(iIndexOf, popUpTo, z);
    }

    public final void p(androidx.navigation.zn znVar) {
        w(znVar).show(this.f1333gv, znVar.a());
        androidx.navigation.zn znVar2 = (androidx.navigation.zn) CollectionsKt.lastOrNull(n3().n3().getValue());
        boolean zContains = CollectionsKt.contains(n3().zn().getValue(), znVar2);
        n3().t(znVar);
        if (znVar2 == null || zContains) {
            return;
        }
        n3().v(znVar2);
    }

    @Override // androidx.navigation.xc
    public void v(List<androidx.navigation.zn> entries, androidx.navigation.t tVar, xc.y yVar) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        if (this.f1333gv.isStateSaved()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<androidx.navigation.zn> it = entries.iterator();
        while (it.hasNext()) {
            p(it.next());
        }
    }

    public final DialogFragment w(androidx.navigation.zn znVar) {
        androidx.navigation.s sVarV = znVar.v();
        Intrinsics.checkNotNull(sVarV, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        C0038n3 c0038n3 = (C0038n3) sVarV;
        String strN = c0038n3.n();
        if (strN.charAt(0) == '.') {
            strN = this.zn.getPackageName() + strN;
        }
        Fragment fragmentInstantiate = this.f1333gv.getFragmentFactory().instantiate(this.zn.getClassLoader(), strN);
        Intrinsics.checkNotNullExpressionValue(fragmentInstantiate, "fragmentManager.fragment…ader, className\n        )");
        if (DialogFragment.class.isAssignableFrom(fragmentInstantiate.getClass())) {
            DialogFragment dialogFragment = (DialogFragment) fragmentInstantiate;
            dialogFragment.setArguments(znVar.zn());
            dialogFragment.getLifecycle().y(this.f1331a);
            this.f1332fb.put(znVar.a(), dialogFragment);
            return dialogFragment;
        }
        throw new IllegalArgumentException(("Dialog destination " + c0038n3.n() + " is not an instance of DialogFragment").toString());
    }

    @Override // androidx.navigation.xc
    /* JADX INFO: renamed from: xc, reason: merged with bridge method [inline-methods] */
    public C0038n3 y() {
        return new C0038n3(this);
    }
}
