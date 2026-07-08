package rc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.gv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class w extends tl {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public wf.gv f7751co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<v> f7752f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public v f7753fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7754p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public v f7755s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7756t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public v f7757v;
    public boolean w;

    public class y implements wf.gv {
        public y() {
        }

        public void gv(int i, int i5) {
            int iJ = w.this.j();
            w.this.d(i + iJ, iJ + i5);
        }

        public void n3(int i, int i5) {
            w wVar = w.this;
            wVar.ud(wVar.j() + i, i5);
        }

        public void y(int i, int i5) {
            w wVar = w.this;
            wVar.ej(wVar.j() + i, i5);
        }

        public void zn(int i, int i5, Object obj) {
            w wVar = w.this;
            wVar.z6(wVar.j() + i, i5, obj);
        }
    }

    public w() {
        this(null, new ArrayList());
    }

    @Override // rc.tl
    public void a8(@NonNull v vVar) {
        super.a8(vVar);
        int iD0 = d0(vVar);
        this.f7752f.remove(vVar);
        ud(iD0, vVar.r());
        dm();
    }

    @Override // rc.tl
    public void b(@NonNull Collection<? extends v> collection) {
        if (collection.isEmpty()) {
            return;
        }
        super.b(collection);
        this.f7752f.clear();
        this.f7752f.addAll(collection);
        rz();
        dm();
    }

    public void ct() {
        v vVar = this.f7757v;
        if (vVar == null) {
            return;
        }
        vVar.t(this);
        int iJ = j();
        this.f7757v = null;
        xg(iJ);
    }

    public void dm() {
        if (!en()) {
            f7();
            lc();
        } else if (this.f7756t) {
            k();
        } else {
            nf();
            lc();
        }
    }

    public void e(@NonNull Collection<? extends v> collection, gv.v vVar) {
        super.x(this.f7752f);
        this.f7752f.clear();
        this.f7752f.addAll(collection);
        super.z(collection);
        vVar.n3(this.f7751co);
        dm();
    }

    public void eb(@NonNull v vVar) {
        if (vVar == null) {
            throw new NullPointerException("Placeholder can't be null.  Please use removePlaceholder() instead!");
        }
        if (this.f7755s != null) {
            o4();
        }
        this.f7755s = vVar;
        dm();
    }

    public boolean en() {
        return this.f7752f.isEmpty() || s.n3(this.f7752f) == 0;
    }

    @Override // rc.tl
    public int f3() {
        return o() + hw() + ut() + this.f7752f.size();
    }

    public final void f7() {
        if (!this.f7754p || this.f7755s == null) {
            return;
        }
        this.f7754p = false;
        ud(j(), this.f7755s.r());
    }

    @Override // rc.tl, rc.fb
    public void fb(@NonNull v vVar, int i, int i5) {
        super.fb(vVar, i, i5);
        dm();
    }

    @Override // rc.tl
    public int fh(@NonNull v vVar) {
        if (u() && vVar == this.f7757v) {
            return 0;
        }
        int iO = o();
        if (y5() && vVar == this.f7755s) {
            return iO;
        }
        int iUt = iO + ut();
        int iIndexOf = this.f7752f.indexOf(vVar);
        if (iIndexOf >= 0) {
            return iUt + iIndexOf;
        }
        int size = iUt + this.f7752f.size();
        if (jz() && this.f7753fb == vVar) {
            return size;
        }
        return -1;
    }

    public final int hw() {
        return (this.f7753fb == null || !this.w) ? 0 : 1;
    }

    @Override // rc.tl
    @NonNull
    public v i4(int i) {
        if (u() && i == 0) {
            return this.f7757v;
        }
        int iO = i - o();
        if (y5() && iO == 0) {
            return this.f7755s;
        }
        int iUt = iO - ut();
        if (iUt != this.f7752f.size()) {
            return this.f7752f.get(iUt);
        }
        if (jz()) {
            return this.f7753fb;
        }
        throw new IndexOutOfBoundsException("Wanted group at position " + iUt + " but there are only " + f3() + " groups");
    }

    public final int j() {
        if (o() == 0) {
            return 0;
        }
        return this.f7757v.r();
    }

    public final int j5() {
        if (hw() == 0) {
            return 0;
        }
        return this.f7753fb.r();
    }

    public final boolean jz() {
        return hw() > 0;
    }

    public final void k() {
        if (this.w || this.f7754p) {
            int iJ = j() + q9() + j5();
            this.w = false;
            this.f7754p = false;
            ud(0, iJ);
        }
    }

    public final void lc() {
        if (this.w) {
            return;
        }
        this.w = true;
        ej(0, j());
        ej(oz(), j5());
    }

    @Override // rc.tl
    public void mt(@NonNull v vVar) {
        super.mt(vVar);
        int iOz = oz();
        this.f7752f.add(vVar);
        ej(iOz, vVar.r());
        dm();
    }

    @Override // rc.tl, rc.fb
    public void n3(@NonNull v vVar, int i, int i5) {
        super.n3(vVar, i, i5);
        dm();
    }

    public final void nf() {
        if (this.f7754p || this.f7755s == null) {
            return;
        }
        this.f7754p = true;
        ej(j(), this.f7755s.r());
    }

    public final int o() {
        return (this.f7757v == null || !this.w) ? 0 : 1;
    }

    public void o4() {
        f7();
        this.f7755s = null;
    }

    public final int oz() {
        return vl() + j();
    }

    public final int q9() {
        v vVar;
        if (!this.f7754p || (vVar = this.f7755s) == null) {
            return 0;
        }
        return vVar.r();
    }

    public List<v> qn() {
        return new ArrayList(this.f7752f);
    }

    public void ra(@NonNull Collection<? extends v> collection) {
        s8(collection, true);
    }

    public void rs(@NonNull v vVar) {
        if (vVar == null) {
            throw new NullPointerException("Header can't be null.  Please use removeHeader() instead!");
        }
        v vVar2 = this.f7757v;
        if (vVar2 != null) {
            vVar2.t(this);
        }
        int iJ = j();
        this.f7757v = vVar;
        vVar.zn(this);
        xg(iJ);
    }

    public void s8(@NonNull Collection<? extends v> collection, boolean z) {
        e(collection, androidx.recyclerview.widget.gv.zn(new n3(new ArrayList(this.f7752f), collection), z));
    }

    public final boolean u() {
        return o() > 0;
    }

    public final int ut() {
        return this.f7754p ? 1 : 0;
    }

    public final int vl() {
        return this.f7754p ? q9() : s.n3(this.f7752f);
    }

    @Override // rc.tl
    public void x(@NonNull Collection<? extends v> collection) {
        if (collection.isEmpty()) {
            return;
        }
        super.x(collection);
        for (v vVar : collection) {
            int iD0 = d0(vVar);
            this.f7752f.remove(vVar);
            ud(iD0, vVar.r());
        }
        dm();
    }

    public final void xg(int i) {
        int iJ = j();
        if (i > 0) {
            ud(0, i);
        }
        if (iJ > 0) {
            ej(0, iJ);
        }
    }

    public final boolean y5() {
        return ut() > 0;
    }

    public void yt() {
        if (this.f7752f.isEmpty()) {
            return;
        }
        x(new ArrayList(this.f7752f));
    }

    @Override // rc.tl
    public void z(@NonNull Collection<? extends v> collection) {
        if (collection.isEmpty()) {
            return;
        }
        super.z(collection);
        int iOz = oz();
        this.f7752f.addAll(collection);
        ej(iOz, s.n3(collection));
        dm();
    }

    public w(@Nullable v vVar) {
        this(vVar, new ArrayList());
    }

    public w(@NonNull Collection<? extends v> collection) {
        this(null, collection);
    }

    public w(@Nullable v vVar, @NonNull Collection<? extends v> collection) {
        this.f7752f = new ArrayList<>();
        this.f7756t = false;
        this.w = true;
        this.f7754p = false;
        this.f7751co = new y();
        this.f7757v = vVar;
        if (vVar != null) {
            vVar.zn(this);
        }
        z(collection);
    }
}
