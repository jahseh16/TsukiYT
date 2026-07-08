package w2;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransitionImpl;
import java.util.ArrayList;
import java.util.List;
import w2.f;
import yt.a;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public class v extends FragmentTransitionImpl {

    public class a extends f.a {
        public final /* synthetic */ Rect y;

        public a(Rect rect) {
            this.y = rect;
        }
    }

    public class gv implements a.n3 {
        public final /* synthetic */ f y;

        public gv(f fVar) {
            this.y = fVar;
        }

        @Override // yt.a.n3
        public void y() {
            this.y.cancel();
        }
    }

    public class y extends f.a {
        public final /* synthetic */ Rect y;

        public y(Rect rect) {
            this.y = rect;
        }
    }

    public class zn extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f8994a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final /* synthetic */ ArrayList f8996gv;
        public final /* synthetic */ ArrayList n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Object f8997v;
        public final /* synthetic */ Object y;
        public final /* synthetic */ Object zn;

        public zn(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.y = obj;
            this.n3 = arrayList;
            this.zn = obj2;
            this.f8996gv = arrayList2;
            this.f8997v = obj3;
            this.f8994a = arrayList3;
        }

        @Override // w2.f.fb
        public void n3(@NonNull f fVar) {
            fVar.oz(this);
        }

        @Override // w2.t, w2.f.fb
        public void zn(@NonNull f fVar) {
            Object obj = this.y;
            if (obj != null) {
                v.this.replaceTargets(obj, this.n3, null);
            }
            Object obj2 = this.zn;
            if (obj2 != null) {
                v.this.replaceTargets(obj2, this.f8996gv, null);
            }
            Object obj3 = this.f8997v;
            if (obj3 != null) {
                v.this.replaceTargets(obj3, this.f8994a, null);
            }
        }
    }

    public static boolean y(f fVar) {
        return (FragmentTransitionImpl.isNullOrEmpty(fVar.mg()) && FragmentTransitionImpl.isNullOrEmpty(fVar.ta()) && FragmentTransitionImpl.isNullOrEmpty(fVar.d())) ? false : true;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void addTarget(Object obj, View view) {
        if (obj != null) {
            ((f) obj).zn(view);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void addTargets(Object obj, ArrayList<View> arrayList) {
        f fVar = (f) obj;
        if (fVar == null) {
            return;
        }
        int i = 0;
        if (fVar instanceof xc) {
            xc xcVar = (xc) fVar;
            int iS8 = xcVar.s8();
            while (i < iS8) {
                addTargets(xcVar.e(i), arrayList);
                i++;
            }
            return;
        }
        if (y(fVar) || !FragmentTransitionImpl.isNullOrEmpty(fVar.z6())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            fVar.zn(arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void beginDelayedTransition(ViewGroup viewGroup, Object obj) {
        tl.n3(viewGroup, (f) obj);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public boolean canHandle(Object obj) {
        return obj instanceof f;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public Object cloneTransition(Object obj) {
        if (obj != null) {
            return ((f) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public Object mergeTransitionsInSequence(Object obj, Object obj2, Object obj3) {
        f fVarRb = (f) obj;
        f fVar = (f) obj2;
        f fVar2 = (f) obj3;
        if (fVarRb != null && fVar != null) {
            fVarRb = new xc().nf(fVarRb).nf(fVar).rb(1);
        } else if (fVarRb == null) {
            fVarRb = fVar != null ? fVar : null;
        }
        if (fVar2 == null) {
            return fVarRb;
        }
        xc xcVar = new xc();
        if (fVarRb != null) {
            xcVar.nf(fVarRb);
        }
        xcVar.nf(fVar2);
        return xcVar;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public Object mergeTransitionsTogether(Object obj, Object obj2, Object obj3) {
        xc xcVar = new xc();
        if (obj != null) {
            xcVar.nf((f) obj);
        }
        if (obj2 != null) {
            xcVar.nf((f) obj2);
        }
        if (obj3 != null) {
            xcVar.nf((f) obj3);
        }
        return xcVar;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void removeTarget(Object obj, View view) {
        if (obj != null) {
            ((f) obj).ut(view);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void replaceTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        f fVar = (f) obj;
        int i = 0;
        if (fVar instanceof xc) {
            xc xcVar = (xc) fVar;
            int iS8 = xcVar.s8();
            while (i < iS8) {
                replaceTargets(xcVar.e(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (y(fVar)) {
            return;
        }
        List<View> listZ6 = fVar.z6();
        if (listZ6.size() == arrayList.size() && listZ6.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                fVar.zn(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                fVar.ut(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void scheduleHideFragmentView(Object obj, View view, ArrayList<View> arrayList) {
        ((f) obj).n3(new n3(view, arrayList));
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void scheduleRemoveTargets(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((f) obj).n3(new zn(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setEpicenter(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            getBoundsOnScreen(view, rect);
            ((f) obj).jz(new y(rect));
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setListenerForTransitionEnd(@NonNull Fragment fragment, @NonNull Object obj, @NonNull yt.a aVar, @NonNull Runnable runnable) {
        f fVar = (f) obj;
        aVar.n3(new gv(fVar));
        fVar.n3(new C0190v(runnable));
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setSharedElementTargets(Object obj, View view, ArrayList<View> arrayList) {
        xc xcVar = (xc) obj;
        List<View> listZ6 = xcVar.z6();
        listZ6.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FragmentTransitionImpl.bfsAddViewChildren(listZ6, arrayList.get(i));
        }
        listZ6.add(view);
        arrayList.add(view);
        addTargets(xcVar, arrayList);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void swapSharedElementTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        xc xcVar = (xc) obj;
        if (xcVar != null) {
            xcVar.z6().clear();
            xcVar.z6().addAll(arrayList2);
            replaceTargets(xcVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public Object wrapTransitionInSet(Object obj) {
        if (obj == null) {
            return null;
        }
        xc xcVar = new xc();
        xcVar.nf((f) obj);
        return xcVar;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setEpicenter(Object obj, Rect rect) {
        if (obj != null) {
            ((f) obj).jz(new a(rect));
        }
    }

    public class n3 implements f.fb {
        public final /* synthetic */ ArrayList n3;
        public final /* synthetic */ View y;

        public n3(View view, ArrayList arrayList) {
            this.y = view;
            this.n3 = arrayList;
        }

        @Override // w2.f.fb
        public void n3(@NonNull f fVar) {
            fVar.oz(this);
            this.y.setVisibility(8);
            int size = this.n3.size();
            for (int i = 0; i < size; i++) {
                ((View) this.n3.get(i)).setVisibility(0);
            }
        }

        @Override // w2.f.fb
        public void zn(@NonNull f fVar) {
            fVar.oz(this);
            fVar.n3(this);
        }

        @Override // w2.f.fb
        public void gv(@NonNull f fVar) {
        }

        @Override // w2.f.fb
        public void v(@NonNull f fVar) {
        }

        @Override // w2.f.fb
        public void y(@NonNull f fVar) {
        }
    }

    /* JADX INFO: renamed from: w2.v$v, reason: collision with other inner class name */
    public class C0190v implements f.fb {
        public final /* synthetic */ Runnable y;

        public C0190v(Runnable runnable) {
            this.y = runnable;
        }

        @Override // w2.f.fb
        public void n3(@NonNull f fVar) {
            this.y.run();
        }

        @Override // w2.f.fb
        public void gv(@NonNull f fVar) {
        }

        @Override // w2.f.fb
        public void v(@NonNull f fVar) {
        }

        @Override // w2.f.fb
        public void y(@NonNull f fVar) {
        }

        @Override // w2.f.fb
        public void zn(@NonNull f fVar) {
        }
    }
}
