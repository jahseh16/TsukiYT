package w2;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import w2.f;

/* JADX INFO: loaded from: classes.dex */
public class xc extends f {
    public int ct;
    public ArrayList<f> xg = new ArrayList<>();
    public boolean dm = true;
    public boolean o4 = false;
    public int rs = 0;

    public static class n3 extends t {
        public xc y;

        public n3(xc xcVar) {
            this.y = xcVar;
        }

        @Override // w2.f.fb
        public void n3(@NonNull f fVar) {
            xc xcVar = this.y;
            int i = xcVar.ct - 1;
            xcVar.ct = i;
            if (i == 0) {
                xcVar.o4 = false;
                xcVar.p();
            }
            fVar.oz(this);
        }

        @Override // w2.t, w2.f.fb
        public void zn(@NonNull f fVar) {
            xc xcVar = this.y;
            if (xcVar.o4) {
                return;
            }
            xcVar.o4();
            this.y.o4 = true;
        }
    }

    public class y extends t {
        public final /* synthetic */ f y;

        public y(f fVar) {
            this.y = fVar;
        }

        @Override // w2.f.fb
        public void n3(@NonNull f fVar) {
            this.y.f7();
            fVar.oz(this);
        }
    }

    @Override // w2.f
    @NonNull
    /* JADX INFO: renamed from: ap, reason: merged with bridge method [inline-methods] */
    public xc oz(@NonNull f.fb fbVar) {
        return (xc) super.oz(fbVar);
    }

    @Override // w2.f
    public void cancel() {
        super.cancel();
        int size = this.xg.size();
        for (int i = 0; i < size; i++) {
            this.xg.get(i).cancel();
        }
    }

    @Nullable
    public f e(int i) {
        if (i < 0 || i >= this.xg.size()) {
            return null;
        }
        return this.xg.get(i);
    }

    @Override // w2.f
    @NonNull
    /* JADX INFO: renamed from: eb, reason: merged with bridge method [inline-methods] */
    public xc n3(@NonNull f.fb fbVar) {
        return (xc) super.n3(fbVar);
    }

    @Override // w2.f
    public void f(@NonNull mt mtVar) {
        if (x(mtVar.n3)) {
            for (f fVar : this.xg) {
                if (fVar.x(mtVar.n3)) {
                    fVar.f(mtVar);
                    mtVar.zn.add(fVar);
                }
            }
        }
    }

    @Override // w2.f
    public void f7() {
        if (this.xg.isEmpty()) {
            o4();
            p();
            return;
        }
        m();
        if (this.dm) {
            Iterator<f> it = this.xg.iterator();
            while (it.hasNext()) {
                it.next().f7();
            }
            return;
        }
        for (int i = 1; i < this.xg.size(); i++) {
            this.xg.get(i - 1).n3(new y(this.xg.get(i)));
        }
        f fVar = this.xg.get(0);
        if (fVar != null) {
            fVar.f7();
        }
    }

    @Override // w2.f
    @NonNull
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public xc dm(long j) {
        return (xc) super.dm(j);
    }

    @Override // w2.f
    public void i9(mt mtVar) {
        super.i9(mtVar);
        int size = this.xg.size();
        for (int i = 0; i < size; i++) {
            this.xg.get(i).i9(mtVar);
        }
    }

    @Override // w2.f
    public void jz(f.a aVar) {
        super.jz(aVar);
        this.rs |= 8;
        int size = this.xg.size();
        for (int i = 0; i < size; i++) {
            this.xg.get(i).jz(aVar);
        }
    }

    @Override // w2.f
    @NonNull
    /* JADX INFO: renamed from: kp, reason: merged with bridge method [inline-methods] */
    public xc u(@Nullable TimeInterpolator timeInterpolator) {
        this.rs |= 1;
        ArrayList<f> arrayList = this.xg;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.xg.get(i).u(timeInterpolator);
            }
        }
        return (xc) super.u(timeInterpolator);
    }

    @Override // w2.f
    @NonNull
    /* JADX INFO: renamed from: lc, reason: merged with bridge method [inline-methods] */
    public xc zn(@NonNull View view) {
        for (int i = 0; i < this.xg.size(); i++) {
            this.xg.get(i).zn(view);
        }
        return (xc) super.zn(view);
    }

    public final void m() {
        n3 n3Var = new n3(this);
        Iterator<f> it = this.xg.iterator();
        while (it.hasNext()) {
            it.next().n3(n3Var);
        }
        this.ct = this.xg.size();
    }

    @Override // w2.f
    @NonNull
    public f mt(@NonNull View view, boolean z) {
        for (int i = 0; i < this.xg.size(); i++) {
            this.xg.get(i).mt(view, z);
        }
        return super.mt(view, z);
    }

    @NonNull
    public xc nf(@NonNull f fVar) {
        ra(fVar);
        long j = this.f8972fb;
        if (j >= 0) {
            fVar.en(j);
        }
        if ((this.rs & 1) != 0) {
            fVar.u(i4());
        }
        if ((this.rs & 2) != 0) {
            d0();
            fVar.xg(null);
        }
        if ((this.rs & 4) != 0) {
            fVar.y5(c());
        }
        if ((this.rs & 8) != 0) {
            fVar.jz(x4());
        }
        return this;
    }

    @Override // w2.f
    public void q9(View view) {
        super.q9(view);
        int size = this.xg.size();
        for (int i = 0; i < size; i++) {
            this.xg.get(i).q9(view);
        }
    }

    @Override // w2.f
    public void qn(View view) {
        super.qn(view);
        int size = this.xg.size();
        for (int i = 0; i < size; i++) {
            this.xg.get(i).qn(view);
        }
    }

    public final void ra(@NonNull f fVar) {
        this.xg.add(fVar);
        fVar.f8970ej = this;
    }

    @NonNull
    public xc rb(int i) {
        if (i == 0) {
            this.dm = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
            }
            this.dm = false;
        }
        return this;
    }

    @Override // w2.f
    public String rs(String str) {
        String strRs = super.rs(str);
        for (int i = 0; i < this.xg.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strRs);
            sb.append("\n");
            sb.append(this.xg.get(i).rs(str + "  "));
            strRs = sb.toString();
        }
        return strRs;
    }

    @Override // w2.f
    public void s(@NonNull mt mtVar) {
        if (x(mtVar.n3)) {
            for (f fVar : this.xg) {
                if (fVar.x(mtVar.n3)) {
                    fVar.s(mtVar);
                    mtVar.zn.add(fVar);
                }
            }
        }
    }

    public int s8() {
        return this.xg.size();
    }

    @Override // w2.f
    public void w(ViewGroup viewGroup, co coVar, co coVar2, ArrayList<mt> arrayList, ArrayList<mt> arrayList2) {
        long jRz = rz();
        int size = this.xg.size();
        for (int i = 0; i < size; i++) {
            f fVar = this.xg.get(i);
            if (jRz > 0 && (this.dm || i == 0)) {
                long jRz2 = fVar.rz();
                if (jRz2 > 0) {
                    fVar.dm(jRz2 + jRz);
                } else {
                    fVar.dm(jRz);
                }
            }
            fVar.w(viewGroup, coVar, coVar2, arrayList, arrayList2);
        }
    }

    @Override // w2.f
    /* JADX INFO: renamed from: wz */
    public f clone() {
        xc xcVar = (xc) super.clone();
        xcVar.xg = new ArrayList<>();
        int size = this.xg.size();
        for (int i = 0; i < size; i++) {
            xcVar.ra(this.xg.get(i).clone());
        }
        return xcVar;
    }

    @Override // w2.f
    public void xg(wz wzVar) {
        super.xg(wzVar);
        this.rs |= 2;
        int size = this.xg.size();
        for (int i = 0; i < size; i++) {
            this.xg.get(i).xg(wzVar);
        }
    }

    @Override // w2.f
    public void y5(fb fbVar) {
        super.y5(fbVar);
        this.rs |= 4;
        if (this.xg != null) {
            for (int i = 0; i < this.xg.size(); i++) {
                this.xg.get(i).y5(fbVar);
            }
        }
    }

    @Override // w2.f
    @NonNull
    /* JADX INFO: renamed from: yc, reason: merged with bridge method [inline-methods] */
    public xc en(long j) {
        ArrayList<f> arrayList;
        super.en(j);
        if (this.f8972fb >= 0 && (arrayList = this.xg) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.xg.get(i).en(j);
            }
        }
        return this;
    }

    @Override // w2.f
    @NonNull
    /* JADX INFO: renamed from: yg, reason: merged with bridge method [inline-methods] */
    public xc ut(@NonNull View view) {
        for (int i = 0; i < this.xg.size(); i++) {
            this.xg.get(i).ut(view);
        }
        return (xc) super.ut(view);
    }
}
