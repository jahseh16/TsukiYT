package rc;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.gv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import rc.f;
import rc.y;

/* JADX INFO: loaded from: classes.dex */
public class a<VH extends f> extends RecyclerView.s<VH> implements fb {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final GridLayoutManager.zn f7737co;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public xc f7738fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public rc.y f7739p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t f7741t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public wz f7742v;
    public y.InterfaceC0156y w;
    public final List<v> y = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7740s = 1;

    public class n3 extends GridLayoutManager.zn {
        public n3() {
        }

        public int a(int i) {
            try {
                return a.this.co(i).qn(a.this.f7740s, i);
            } catch (IndexOutOfBoundsException unused) {
                return a.this.f7740s;
            }
        }
    }

    public class y implements y.InterfaceC0156y {
        public y() {
        }

        public void gv(int i, int i5) {
            a.this.notifyItemMoved(i, i5);
        }

        public void n3(int i, int i5) {
            a.this.notifyItemRangeRemoved(i, i5);
        }

        public void y(int i, int i5) {
            a.this.notifyItemRangeInserted(i, i5);
        }

        public void zn(int i, int i5, Object obj) {
            a.this.notifyItemRangeChanged(i, i5, obj);
        }
    }

    public a() {
        y yVar = new y();
        this.w = yVar;
        this.f7739p = new rc.y(yVar);
        this.f7737co = new n3();
    }

    private int r(int i) {
        int iR = 0;
        Iterator<v> it = this.y.subList(0, i).iterator();
        while (it.hasNext()) {
            iR += it.next().r();
        }
        return iR;
    }

    public void a(@NonNull v vVar) {
        if (vVar == null) {
            throw new RuntimeException("Group cannot be null");
        }
        int itemCount = getItemCount();
        vVar.zn(this);
        this.y.add(vVar);
        notifyItemRangeInserted(itemCount, vVar.r());
    }

    public final void a8(@NonNull Collection<? extends v> collection) {
        Iterator<v> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().t(this);
        }
        this.y.clear();
        this.y.addAll(collection);
        Iterator<? extends v> it2 = collection.iterator();
        while (it2.hasNext()) {
            it2.next().zn(this);
        }
    }

    public void b(@Nullable xc xcVar) {
        this.f7738fb = xcVar;
    }

    @Override // rc.fb
    public void c5(@NonNull v vVar, int i, Object obj) {
        notifyItemChanged(tl(vVar) + i, obj);
    }

    @NonNull
    public t co(int i) {
        return s.y(this.y, i);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NonNull VH vh) {
        vh.gv().y5(vh);
    }

    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull VH vh, int i, @NonNull List<Object> list) {
        co(i).b(vh, i, list, this.f7742v, this.f7738fb);
    }

    public void ej(@NonNull v vVar) {
        if (vVar == null) {
            throw new RuntimeException("Group cannot be null");
        }
        z6(this.y.indexOf(vVar), vVar);
    }

    @Override // rc.fb
    public void f(@NonNull v vVar, int i, int i5, Object obj) {
        notifyItemRangeChanged(tl(vVar) + i, i5, obj);
    }

    @NonNull
    public GridLayoutManager.zn f3() {
        return this.f7737co;
    }

    @Override // rc.fb
    public void fb(@NonNull v vVar, int i, int i5) {
        notifyItemRangeRemoved(tl(vVar) + i, i5);
    }

    @NonNull
    /* JADX INFO: renamed from: fh, reason: merged with bridge method [inline-methods] */
    public VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        t<VH> tVarX4 = x4(i);
        return (VH) tVarX4.k5(layoutInflaterFrom.inflate(tVarX4.j5(), viewGroup, false));
    }

    public int getItemCount() {
        return s.n3(this.y);
    }

    public long getItemId(int i) {
        return co(i).hw();
    }

    public int getItemViewType(int i) {
        t tVarCo = co(i);
        this.f7741t = tVarCo;
        if (tVarCo != null) {
            return tVarCo.o();
        }
        throw new RuntimeException("Invalid position " + i);
    }

    public int i4() {
        return this.f7740s;
    }

    public void i9(@NonNull Collection<? extends v> collection) {
        if (collection.contains(null)) {
            throw new RuntimeException("List of groups can't contain null!");
        }
        int itemCount = getItemCount();
        int iR = 0;
        for (v vVar : collection) {
            iR += vVar.r();
            vVar.zn(this);
        }
        this.y.addAll(collection);
        notifyItemRangeInserted(itemCount, iR);
    }

    public void k5(int i) {
        this.f7740s = i;
    }

    /* JADX INFO: renamed from: mg, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@NonNull VH vh) {
        super.onViewAttachedToWindow(vh);
        z(vh).jz(vh);
    }

    public int mt() {
        return this.y.size();
    }

    @NonNull
    public v n(int i) {
        return this.y.get(i);
    }

    @Override // rc.fb
    public void n3(@NonNull v vVar, int i, int i5) {
        notifyItemRangeInserted(tl(vVar) + i, i5);
    }

    @Override // rc.fb
    public void p(@NonNull v vVar, int i, int i5) {
        int iTl = tl(vVar);
        notifyItemMoved(i + iTl, iTl + i5);
    }

    /* JADX INFO: renamed from: rz, reason: merged with bridge method [inline-methods] */
    public boolean onFailedToRecycleView(@NonNull VH vh) {
        return vh.gv().k();
    }

    @Override // rc.fb
    public void s() {
        notifyDataSetChanged();
    }

    public void t() {
        Iterator<v> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().t(this);
        }
        this.y.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ta, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@NonNull VH vh) {
        super.onViewDetachedFromWindow(vh);
        z(vh).u(vh);
    }

    public int tl(@NonNull v vVar) {
        int iIndexOf = this.y.indexOf(vVar);
        if (iIndexOf == -1) {
            return -1;
        }
        int iR = 0;
        for (int i = 0; i < iIndexOf; i++) {
            iR += this.y.get(i).r();
        }
        return iR;
    }

    public void ud(@NonNull Collection<? extends v> collection) {
        a8(collection);
        notifyDataSetChanged();
    }

    public void v(int i, @NonNull v vVar) {
        if (vVar == null) {
            throw new RuntimeException("Group cannot be null");
        }
        vVar.zn(this);
        this.y.add(i, vVar);
        notifyItemRangeInserted(r(i), vVar.r());
    }

    public void vl(@NonNull Collection<? extends v> collection, boolean z) {
        gv.v vVarZn = androidx.recyclerview.widget.gv.zn(new rc.n3(new ArrayList(this.y), collection), z);
        a8(collection);
        vVarZn.n3(this.w);
    }

    @NonNull
    public v w(int i) {
        int iR = 0;
        for (v vVar : this.y) {
            if (i - iR < vVar.r()) {
                return vVar;
            }
            iR += vVar.r();
        }
        throw new IndexOutOfBoundsException("Requested position " + i + " in group adapter but there are only " + iR + " items");
    }

    public int wz(@NonNull t tVar) {
        int iR = 0;
        for (v vVar : this.y) {
            int iA = vVar.a(tVar);
            if (iA >= 0) {
                return iA + iR;
            }
            iR += vVar.r();
        }
        return -1;
    }

    public void x(@Nullable wz wzVar) {
        this.f7742v = wzVar;
    }

    public final t<VH> x4(int i) {
        t tVar = this.f7741t;
        if (tVar != null && tVar.o() == i) {
            return this.f7741t;
        }
        for (int i5 = 0; i5 < getItemCount(); i5++) {
            t<VH> tVarCo = co(i5);
            if (tVarCo.o() == i) {
                return tVarCo;
            }
        }
        throw new IllegalStateException("Could not find model for view type: " + i);
    }

    @Override // rc.fb
    public void xc(@NonNull v vVar, int i) {
        notifyItemChanged(tl(vVar) + i);
    }

    public void yt(@NonNull Collection<? extends v> collection) {
        vl(collection, true);
    }

    @NonNull
    public t z(@NonNull VH vh) {
        return vh.gv();
    }

    public final void z6(int i, @NonNull v vVar) {
        int iR = r(i);
        vVar.t(this);
        this.y.remove(i);
        notifyItemRangeRemoved(iR, vVar.r());
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull VH vh, int i) {
    }
}
