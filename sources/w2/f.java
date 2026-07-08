package w2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements Cloneable {
    public static final int[] jz = {2, 1, 3, 4};
    public static final w2.fb u = new y();
    public static ThreadLocal<x4.y<Animator, gv>> y5 = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<mt> f8967b;
    public x4.y<String, String> f7;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public ArrayList<mt> f8973hw;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f8975k;
    public String y = getClass().getName();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f8981v = -1;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f8972fb = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TimeInterpolator f8978s = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<Integer> f8971f = new ArrayList<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList<View> f8979t = new ArrayList<>();
    public ArrayList<String> w = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList<Class<?>> f8976p = null;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public ArrayList<Integer> f8968co = null;
    public ArrayList<View> z = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList<Class<?>> f8977r = null;
    public ArrayList<String> f3 = null;
    public ArrayList<Integer> n = null;
    public ArrayList<View> c = null;
    public ArrayList<Class<?>> d0 = null;
    public co fh = new co();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public co f8969d = new co();

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public xc f8970ej = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int[] f8982x = jz;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public boolean f8974j5 = false;
    public ArrayList<Animator> qn = new ArrayList<>();
    public int o = 0;
    public boolean j = false;
    public boolean oz = false;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public ArrayList<fb> f8980ut = null;
    public ArrayList<Animator> q9 = new ArrayList<>();
    public w2.fb en = u;

    public static abstract class a {
    }

    public interface fb {
        void gv(@NonNull f fVar);

        void n3(@NonNull f fVar);

        void v(@NonNull f fVar);

        void y(@NonNull f fVar);

        void zn(@NonNull f fVar);
    }

    public static class gv {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public vl f8983gv;
        public String n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public f f8984v;
        public View y;
        public mt zn;

        public gv(View view, String str, f fVar, vl vlVar, mt mtVar) {
            this.y = view;
            this.n3 = str;
            this.zn = mtVar;
            this.f8983gv = vlVar;
            this.f8984v = fVar;
        }
    }

    public class n3 extends AnimatorListenerAdapter {
        public final /* synthetic */ x4.y y;

        public n3(x4.y yVar) {
            this.y = yVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.y.remove(animator);
            f.this.qn.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.qn.add(animator);
        }
    }

    public static class v {
        public static <T> ArrayList<T> n3(ArrayList<T> arrayList, T t3) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t3);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }

        public static <T> ArrayList<T> y(ArrayList<T> arrayList, T t3) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t3)) {
                arrayList.add(t3);
            }
            return arrayList;
        }
    }

    public class y extends w2.fb {
        @Override // w2.fb
        public Path y(float f3, float f4, float f5, float f7) {
            Path path = new Path();
            path.moveTo(f3, f4);
            path.lineTo(f5, f7);
            return path;
        }
    }

    public class zn extends AnimatorListenerAdapter {
        public zn() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.p();
            animator.removeListener(this);
        }
    }

    public static boolean b(mt mtVar, mt mtVar2, String str) {
        Object obj = mtVar.y.get(str);
        Object obj2 = mtVar2.y.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static x4.y<Animator, gv> fh() {
        x4.y<Animator, gv> yVar = y5.get();
        if (yVar != null) {
            return yVar;
        }
        x4.y<Animator, gv> yVar2 = new x4.y<>();
        y5.set(yVar2);
        return yVar2;
    }

    public static void v(co coVar, View view, mt mtVar) {
        coVar.y.put(view, mtVar);
        int id = view.getId();
        if (id >= 0) {
            if (coVar.n3.indexOfKey(id) >= 0) {
                coVar.n3.put(id, null);
            } else {
                coVar.n3.put(id, view);
            }
        }
        String strYt = ut.yt(view);
        if (strYt != null) {
            if (coVar.f8963gv.containsKey(strYt)) {
                coVar.f8963gv.put(strYt, null);
            } else {
                coVar.f8963gv.put(strYt, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (coVar.zn.i9(itemIdAtPosition) < 0) {
                    ut.cr(view, true);
                    coVar.zn.tl(itemIdAtPosition, view);
                    return;
                }
                View viewS = coVar.zn.s(itemIdAtPosition);
                if (viewS != null) {
                    ut.cr(viewS, false);
                    coVar.zn.tl(itemIdAtPosition, null);
                }
            }
        }
    }

    public boolean a8(@Nullable mt mtVar, @Nullable mt mtVar2) {
        if (mtVar == null || mtVar2 == null) {
            return false;
        }
        String[] strArrEj = ej();
        if (strArrEj == null) {
            Iterator<String> it = mtVar.y.keySet().iterator();
            while (it.hasNext()) {
                if (b(mtVar, mtVar2, it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrEj) {
            if (!b(mtVar, mtVar2, str)) {
            }
        }
        return false;
        return true;
    }

    @NonNull
    public w2.fb c() {
        return this.en;
    }

    public final void c5(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f8968co;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.z;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f8977r;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f8977r.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    mt mtVar = new mt(view);
                    if (z) {
                        f(mtVar);
                    } else {
                        s(mtVar);
                    }
                    mtVar.zn.add(this);
                    i9(mtVar);
                    if (z) {
                        v(this.fh, view, mtVar);
                    } else {
                        v(this.f8969d, view, mtVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.n;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.c;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.d0;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    if (this.d0.get(i5).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                                c5(viewGroup.getChildAt(i8), z);
                            }
                        }
                    }
                }
            }
        }
    }

    public void cancel() {
        for (int size = this.qn.size() - 1; size >= 0; size--) {
            this.qn.get(size).cancel();
        }
        ArrayList<fb> arrayList = this.f8980ut;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f8980ut.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((fb) arrayList2.get(i)).gv(this);
        }
    }

    public final ArrayList<View> co(ArrayList<View> arrayList, View view, boolean z) {
        return view != null ? z ? v.y(arrayList, view) : v.n3(arrayList, view) : arrayList;
    }

    @Nullable
    public List<Class<?>> d() {
        return this.f8976p;
    }

    @Nullable
    public wz d0() {
        return null;
    }

    @NonNull
    public f dm(long j) {
        this.f8981v = j;
        return this;
    }

    @Nullable
    public String[] ej() {
        return null;
    }

    @NonNull
    public f en(long j) {
        this.f8972fb = j;
        return this;
    }

    public abstract void f(@NonNull mt mtVar);

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f8973hw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f8967b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w2.mt f3(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            w2.xc r0 = r5.f8970ej
            if (r0 == 0) goto L9
            w2.mt r6 = r0.f3(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList<w2.mt> r0 = r5.f8967b
            goto L10
        Le:
            java.util.ArrayList<w2.mt> r0 = r5.f8973hw
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            w2.mt r4 = (w2.mt) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.n3
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList<w2.mt> r6 = r5.f8973hw
            goto L36
        L34:
            java.util.ArrayList<w2.mt> r6 = r5.f8967b
        L36:
            java.lang.Object r6 = r6.get(r3)
            r1 = r6
            w2.mt r1 = (w2.mt) r1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.f.f3(android.view.View, boolean):w2.mt");
    }

    public void f7() {
        o4();
        x4.y<Animator, gv> yVarFh = fh();
        for (Animator animator : this.q9) {
            if (yVarFh.containsKey(animator)) {
                o4();
                k(animator, yVarFh);
            }
        }
        this.q9.clear();
        p();
    }

    public void fb(Animator animator) {
        if (animator == null) {
            p();
            return;
        }
        if (z() >= 0) {
            animator.setDuration(z());
        }
        if (rz() >= 0) {
            animator.setStartDelay(rz() + animator.getStartDelay());
        }
        if (i4() != null) {
            animator.setInterpolator(i4());
        }
        animator.addListener(new zn());
        animator.start();
    }

    public final void gv(x4.y<View, mt> yVar, x4.y<View, mt> yVar2) {
        for (int i = 0; i < yVar.size(); i++) {
            mt mtVarXc = yVar.xc(i);
            if (x(mtVarXc.n3)) {
                this.f8967b.add(mtVarXc);
                this.f8973hw.add(null);
            }
        }
        for (int i5 = 0; i5 < yVar2.size(); i5++) {
            mt mtVarXc2 = yVar2.xc(i5);
            if (x(mtVarXc2.n3)) {
                this.f8973hw.add(mtVarXc2);
                this.f8967b.add(null);
            }
        }
    }

    public final void hw(x4.y<View, mt> yVar, x4.y<View, mt> yVar2, x4.y<String, View> yVar3, x4.y<String, View> yVar4) {
        View view;
        int size = yVar3.size();
        for (int i = 0; i < size; i++) {
            View viewXc = yVar3.xc(i);
            if (viewXc != null && x(viewXc) && (view = yVar4.get(yVar3.f(i))) != null && x(view)) {
                mt mtVar = yVar.get(viewXc);
                mt mtVar2 = yVar2.get(view);
                if (mtVar != null && mtVar2 != null) {
                    this.f8967b.add(mtVar);
                    this.f8973hw.add(mtVar2);
                    yVar.remove(viewXc);
                    yVar2.remove(view);
                }
            }
        }
    }

    @Nullable
    public TimeInterpolator i4() {
        return this.f8978s;
    }

    public final void j5(co coVar, co coVar2) {
        x4.y<View, mt> yVar = new x4.y<>(coVar.y);
        x4.y<View, mt> yVar2 = new x4.y<>(coVar2.y);
        int i = 0;
        while (true) {
            int[] iArr = this.f8982x;
            if (i >= iArr.length) {
                gv(yVar, yVar2);
                return;
            }
            int i5 = iArr[i];
            if (i5 == 1) {
                yt(yVar, yVar2);
            } else if (i5 == 2) {
                hw(yVar, yVar2, coVar.f8963gv, coVar2.f8963gv);
            } else if (i5 == 3) {
                k5(yVar, yVar2, coVar.n3, coVar2.n3);
            } else if (i5 == 4) {
                vl(yVar, yVar2, coVar.zn, coVar2.zn);
            }
            i++;
        }
    }

    public void jz(@Nullable a aVar) {
        this.f8975k = aVar;
    }

    public final void k(Animator animator, x4.y<Animator, gv> yVar) {
        if (animator != null) {
            animator.addListener(new n3(yVar));
            fb(animator);
        }
    }

    public final void k5(x4.y<View, mt> yVar, x4.y<View, mt> yVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View viewValueAt = sparseArray.valueAt(i);
            if (viewValueAt != null && x(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && x(view)) {
                mt mtVar = yVar.get(viewValueAt);
                mt mtVar2 = yVar2.get(view);
                if (mtVar != null && mtVar2 != null) {
                    this.f8967b.add(mtVar);
                    this.f8973hw.add(mtVar2);
                    yVar.remove(viewValueAt);
                    yVar2.remove(view);
                }
            }
        }
    }

    @NonNull
    public List<Integer> mg() {
        return this.f8971f;
    }

    @NonNull
    public f mt(@NonNull View view, boolean z) {
        this.z = co(this.z, view, z);
        return this;
    }

    @NonNull
    public String n() {
        return this.y;
    }

    @NonNull
    public f n3(@NonNull fb fbVar) {
        if (this.f8980ut == null) {
            this.f8980ut = new ArrayList<>();
        }
        this.f8980ut.add(fbVar);
        return this;
    }

    public void o(ViewGroup viewGroup) {
        gv gvVar;
        this.f8967b = new ArrayList<>();
        this.f8973hw = new ArrayList<>();
        j5(this.fh, this.f8969d);
        x4.y<Animator, gv> yVarFh = fh();
        int size = yVarFh.size();
        vl vlVarGv = c.gv(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animatorF = yVarFh.f(i);
            if (animatorF != null && (gvVar = yVarFh.get(animatorF)) != null && gvVar.y != null && vlVarGv.equals(gvVar.f8983gv)) {
                mt mtVar = gvVar.zn;
                View view = gvVar.y;
                mt mtVarUd = ud(view, true);
                mt mtVarF3 = f3(view, true);
                if (mtVarUd == null && mtVarF3 == null) {
                    mtVarF3 = this.f8969d.y.get(view);
                }
                if ((mtVarUd != null || mtVarF3 != null) && gvVar.f8984v.a8(mtVar, mtVarF3)) {
                    if (animatorF.isRunning() || animatorF.isStarted()) {
                        animatorF.cancel();
                    } else {
                        yVarFh.remove(animatorF);
                    }
                }
            }
        }
        w(viewGroup, this.fh, this.f8969d, this.f8967b, this.f8973hw);
        f7();
    }

    public void o4() {
        if (this.o == 0) {
            ArrayList<fb> arrayList = this.f8980ut;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f8980ut.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((fb) arrayList2.get(i)).zn(this);
                }
            }
            this.oz = false;
        }
        this.o++;
    }

    @NonNull
    public f oz(@NonNull fb fbVar) {
        ArrayList<fb> arrayList = this.f8980ut;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fbVar);
        if (this.f8980ut.size() == 0) {
            this.f8980ut = null;
        }
        return this;
    }

    public void p() {
        int i = this.o - 1;
        this.o = i;
        if (i == 0) {
            ArrayList<fb> arrayList = this.f8980ut;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f8980ut.clone();
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((fb) arrayList2.get(i5)).n3(this);
                }
            }
            for (int i8 = 0; i8 < this.fh.zn.w(); i8++) {
                View viewP = this.fh.zn.p(i8);
                if (viewP != null) {
                    ut.cr(viewP, false);
                }
            }
            for (int i10 = 0; i10 < this.f8969d.zn.w(); i10++) {
                View viewP2 = this.f8969d.zn.p(i10);
                if (viewP2 != null) {
                    ut.cr(viewP2, false);
                }
            }
            this.oz = true;
        }
    }

    public void q9(View view) {
        if (this.j) {
            if (!this.oz) {
                for (int size = this.qn.size() - 1; size >= 0; size--) {
                    w2.y.zn(this.qn.get(size));
                }
                ArrayList<fb> arrayList = this.f8980ut;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f8980ut.clone();
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        ((fb) arrayList2.get(i)).v(this);
                    }
                }
            }
            this.j = false;
        }
    }

    public void qn(View view) {
        if (this.oz) {
            return;
        }
        for (int size = this.qn.size() - 1; size >= 0; size--) {
            w2.y.n3(this.qn.get(size));
        }
        ArrayList<fb> arrayList = this.f8980ut;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f8980ut.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((fb) arrayList2.get(i)).y(this);
            }
        }
        this.j = true;
    }

    public String rs(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f8972fb != -1) {
            str2 = str2 + "dur(" + this.f8972fb + ") ";
        }
        if (this.f8981v != -1) {
            str2 = str2 + "dly(" + this.f8981v + ") ";
        }
        if (this.f8978s != null) {
            str2 = str2 + "interp(" + this.f8978s + ") ";
        }
        if (this.f8971f.size() <= 0 && this.f8979t.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f8971f.size() > 0) {
            for (int i = 0; i < this.f8971f.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f8971f.get(i);
            }
        }
        if (this.f8979t.size() > 0) {
            for (int i5 = 0; i5 < this.f8979t.size(); i5++) {
                if (i5 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f8979t.get(i5);
            }
        }
        return str3 + ")";
    }

    public long rz() {
        return this.f8981v;
    }

    public abstract void s(@NonNull mt mtVar);

    public void t(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        x4.y<String, String> yVar;
        tl(z);
        if ((this.f8971f.size() > 0 || this.f8979t.size() > 0) && (((arrayList = this.w) == null || arrayList.isEmpty()) && ((arrayList2 = this.f8976p) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f8971f.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(this.f8971f.get(i).intValue());
                if (viewFindViewById != null) {
                    mt mtVar = new mt(viewFindViewById);
                    if (z) {
                        f(mtVar);
                    } else {
                        s(mtVar);
                    }
                    mtVar.zn.add(this);
                    i9(mtVar);
                    if (z) {
                        v(this.fh, viewFindViewById, mtVar);
                    } else {
                        v(this.f8969d, viewFindViewById, mtVar);
                    }
                }
            }
            for (int i5 = 0; i5 < this.f8979t.size(); i5++) {
                View view = this.f8979t.get(i5);
                mt mtVar2 = new mt(view);
                if (z) {
                    f(mtVar2);
                } else {
                    s(mtVar2);
                }
                mtVar2.zn.add(this);
                i9(mtVar2);
                if (z) {
                    v(this.fh, view, mtVar2);
                } else {
                    v(this.f8969d, view, mtVar2);
                }
            }
        } else {
            c5(viewGroup, z);
        }
        if (z || (yVar = this.f7) == null) {
            return;
        }
        int size = yVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            arrayList3.add(this.fh.f8963gv.remove(this.f7.f(i8)));
        }
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) arrayList3.get(i10);
            if (view2 != null) {
                this.fh.f8963gv.put(this.f7.xc(i10), view2);
            }
        }
    }

    @Nullable
    public List<String> ta() {
        return this.w;
    }

    public void tl(boolean z) {
        if (z) {
            this.fh.y.clear();
            this.fh.n3.clear();
            this.fh.zn.zn();
        } else {
            this.f8969d.y.clear();
            this.f8969d.n3.clear();
            this.f8969d.zn.zn();
        }
    }

    public String toString() {
        return rs(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
    }

    @NonNull
    public f u(@Nullable TimeInterpolator timeInterpolator) {
        this.f8978s = timeInterpolator;
        return this;
    }

    @Nullable
    public mt ud(@NonNull View view, boolean z) {
        xc xcVar = this.f8970ej;
        if (xcVar != null) {
            return xcVar.ud(view, z);
        }
        return (z ? this.fh : this.f8969d).y.get(view);
    }

    @NonNull
    public f ut(@NonNull View view) {
        this.f8979t.remove(view);
        return this;
    }

    public final void vl(x4.y<View, mt> yVar, x4.y<View, mt> yVar2, x4.v<View> vVar, x4.v<View> vVar2) {
        View viewS;
        int iW = vVar.w();
        for (int i = 0; i < iW; i++) {
            View viewP = vVar.p(i);
            if (viewP != null && x(viewP) && (viewS = vVar2.s(vVar.t(i))) != null && x(viewS)) {
                mt mtVar = yVar.get(viewP);
                mt mtVar2 = yVar2.get(viewS);
                if (mtVar != null && mtVar2 != null) {
                    this.f8967b.add(mtVar);
                    this.f8973hw.add(mtVar2);
                    yVar.remove(viewP);
                    yVar2.remove(viewS);
                }
            }
        }
    }

    public void w(ViewGroup viewGroup, co coVar, co coVar2, ArrayList<mt> arrayList, ArrayList<mt> arrayList2) {
        View view;
        Animator animator;
        mt mtVar;
        int i;
        Animator animator2;
        mt mtVar2;
        x4.y<Animator, gv> yVarFh = fh();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            mt mtVar3 = arrayList.get(i5);
            mt mtVar4 = arrayList2.get(i5);
            if (mtVar3 != null && !mtVar3.zn.contains(this)) {
                mtVar3 = null;
            }
            if (mtVar4 != null && !mtVar4.zn.contains(this)) {
                mtVar4 = null;
            }
            if ((mtVar3 != null || mtVar4 != null) && (mtVar3 == null || mtVar4 == null || a8(mtVar3, mtVar4))) {
                Animator animatorXc = xc(viewGroup, mtVar3, mtVar4);
                if (animatorXc != null) {
                    if (mtVar4 != null) {
                        View view2 = mtVar4.n3;
                        String[] strArrEj = ej();
                        if (strArrEj != null && strArrEj.length > 0) {
                            mtVar2 = new mt(view2);
                            mt mtVar5 = coVar2.y.get(view2);
                            if (mtVar5 != null) {
                                int i8 = 0;
                                while (i8 < strArrEj.length) {
                                    Map<String, Object> map = mtVar2.y;
                                    Animator animator3 = animatorXc;
                                    String str = strArrEj[i8];
                                    map.put(str, mtVar5.y.get(str));
                                    i8++;
                                    animatorXc = animator3;
                                    strArrEj = strArrEj;
                                }
                            }
                            Animator animator4 = animatorXc;
                            int size2 = yVarFh.size();
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size2) {
                                    animator2 = animator4;
                                    break;
                                }
                                gv gvVar = yVarFh.get(yVarFh.f(i10));
                                if (gvVar.zn != null && gvVar.y == view2 && gvVar.n3.equals(n()) && gvVar.zn.equals(mtVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i10++;
                            }
                        } else {
                            animator2 = animatorXc;
                            mtVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        mtVar = mtVar2;
                    } else {
                        view = mtVar3.n3;
                        animator = animatorXc;
                        mtVar = null;
                    }
                    if (animator != null) {
                        i = size;
                        yVarFh.put(animator, new gv(view, n(), this, c.gv(viewGroup), mtVar));
                        this.q9.add(animator);
                    }
                    i5++;
                    size = i;
                }
                i = size;
                i5++;
                size = i;
            }
            i = size;
            i5++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
                Animator animator5 = this.q9.get(sparseIntArray.keyAt(i11));
                animator5.setStartDelay((((long) sparseIntArray.valueAt(i11)) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    @Override // 
    /* JADX INFO: renamed from: wz, reason: merged with bridge method [inline-methods] */
    public f clone() {
        try {
            f fVar = (f) super.clone();
            fVar.q9 = new ArrayList<>();
            fVar.fh = new co();
            fVar.f8969d = new co();
            fVar.f8967b = null;
            fVar.f8973hw = null;
            return fVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public boolean x(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f8968co;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.z;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f8977r;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f8977r.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f3 != null && ut.yt(view) != null && this.f3.contains(ut.yt(view))) {
            return false;
        }
        if ((this.f8971f.size() == 0 && this.f8979t.size() == 0 && (((arrayList = this.f8976p) == null || arrayList.isEmpty()) && ((arrayList2 = this.w) == null || arrayList2.isEmpty()))) || this.f8971f.contains(Integer.valueOf(id)) || this.f8979t.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.w;
        if (arrayList6 != null && arrayList6.contains(ut.yt(view))) {
            return true;
        }
        if (this.f8976p != null) {
            for (int i5 = 0; i5 < this.f8976p.size(); i5++) {
                if (this.f8976p.get(i5).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public a x4() {
        return this.f8975k;
    }

    @Nullable
    public Animator xc(@NonNull ViewGroup viewGroup, @Nullable mt mtVar, @Nullable mt mtVar2) {
        return null;
    }

    public void y5(@Nullable w2.fb fbVar) {
        if (fbVar == null) {
            this.en = u;
        } else {
            this.en = fbVar;
        }
    }

    public final void yt(x4.y<View, mt> yVar, x4.y<View, mt> yVar2) {
        mt mtVarRemove;
        for (int size = yVar.size() - 1; size >= 0; size--) {
            View viewF = yVar.f(size);
            if (viewF != null && x(viewF) && (mtVarRemove = yVar2.remove(viewF)) != null && x(mtVarRemove.n3)) {
                this.f8967b.add(yVar.tl(size));
                this.f8973hw.add(mtVarRemove);
            }
        }
    }

    public long z() {
        return this.f8972fb;
    }

    @NonNull
    public List<View> z6() {
        return this.f8979t;
    }

    @NonNull
    public f zn(@NonNull View view) {
        this.f8979t.add(view);
        return this;
    }

    public void i9(mt mtVar) {
    }

    public void xg(@Nullable wz wzVar) {
    }
}
