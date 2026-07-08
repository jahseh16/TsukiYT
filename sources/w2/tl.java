package w2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public class tl {
    public static f y = new n3();
    public static ThreadLocal<WeakReference<x4.y<ViewGroup, ArrayList<f>>>> n3 = new ThreadLocal<>();
    public static ArrayList<ViewGroup> zn = new ArrayList<>();

    public static void gv(ViewGroup viewGroup, f fVar) {
        if (fVar == null || viewGroup == null) {
            return;
        }
        y yVar = new y(fVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(yVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(yVar);
    }

    public static void n3(@NonNull ViewGroup viewGroup, @Nullable f fVar) {
        if (zn.contains(viewGroup) || !ut.q9(viewGroup)) {
            return;
        }
        zn.add(viewGroup);
        if (fVar == null) {
            fVar = y;
        }
        f fVarClone = fVar.clone();
        v(viewGroup, fVarClone);
        i9.zn(viewGroup, null);
        gv(viewGroup, fVarClone);
    }

    public static void v(ViewGroup viewGroup, f fVar) {
        ArrayList<f> arrayList = zn().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().qn(viewGroup);
            }
        }
        if (fVar != null) {
            fVar.t(viewGroup, true);
        }
        i9 i9VarN3 = i9.n3(viewGroup);
        if (i9VarN3 != null) {
            i9VarN3.y();
        }
    }

    public static void y(@NonNull ViewGroup viewGroup) {
        n3(viewGroup, null);
    }

    public static x4.y<ViewGroup, ArrayList<f>> zn() {
        x4.y<ViewGroup, ArrayList<f>> yVar;
        WeakReference<x4.y<ViewGroup, ArrayList<f>>> weakReference = n3.get();
        if (weakReference != null && (yVar = weakReference.get()) != null) {
            return yVar;
        }
        x4.y<ViewGroup, ArrayList<f>> yVar2 = new x4.y<>();
        n3.set(new WeakReference<>(yVar2));
        return yVar2;
    }

    public static class y implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ViewGroup f8993v;
        public f y;

        /* JADX INFO: renamed from: w2.tl$y$y, reason: collision with other inner class name */
        public class C0189y extends t {
            public final /* synthetic */ x4.y y;

            public C0189y(x4.y yVar) {
                this.y = yVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // w2.f.fb
            public void n3(@NonNull f fVar) {
                ((ArrayList) this.y.get(y.this.f8993v)).remove(fVar);
                fVar.oz(this);
            }
        }

        public y(f fVar, ViewGroup viewGroup) {
            this.y = fVar;
            this.f8993v = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            y();
            if (!tl.zn.remove(this.f8993v)) {
                return true;
            }
            x4.y<ViewGroup, ArrayList<f>> yVarZn = tl.zn();
            ArrayList<f> arrayList = yVarZn.get(this.f8993v);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                yVarZn.put(this.f8993v, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.y);
            this.y.n3(new C0189y(yVarZn));
            this.y.t(this.f8993v, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).q9(this.f8993v);
                }
            }
            this.y.o(this.f8993v);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            y();
            tl.zn.remove(this.f8993v);
            ArrayList<f> arrayList = tl.zn().get(this.f8993v);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<f> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().q9(this.f8993v);
                }
            }
            this.y.tl(true);
        }

        public final void y() {
            this.f8993v.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f8993v.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
