package rc;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class zn extends tl {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final v f7758fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<v> f7759s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7760v;

    public zn(v vVar) {
        this.f7760v = false;
        this.f7759s = new ArrayList();
        this.f7758fb = vVar;
        ((gv) vVar).f3(this);
    }

    @Override // rc.tl, rc.fb
    public void c5(@NonNull v vVar, int i, Object obj) {
        if (k5(vVar)) {
            super.c5(vVar, i, obj);
        }
    }

    @Override // rc.tl, rc.fb
    public void f(@NonNull v vVar, int i, int i5, Object obj) {
        if (k5(vVar)) {
            super.f(vVar, i, i5, obj);
        }
    }

    @Override // rc.tl
    public int f3() {
        return (this.f7760v ? this.f7759s.size() : 0) + 1;
    }

    @Override // rc.tl, rc.fb
    public void fb(@NonNull v vVar, int i, int i5) {
        if (k5(vVar)) {
            super.fb(vVar, i, i5);
        }
    }

    @Override // rc.tl
    public int fh(@NonNull v vVar) {
        if (vVar == this.f7758fb) {
            return 0;
        }
        int iIndexOf = this.f7759s.indexOf(vVar);
        if (iIndexOf >= 0) {
            return iIndexOf + 1;
        }
        return -1;
    }

    public void hw() {
        int iR = r();
        this.f7760v = !this.f7760v;
        int iR2 = r();
        if (iR > iR2) {
            ud(iR2, iR - iR2);
        } else {
            ej(iR, iR2 - iR);
        }
    }

    @Override // rc.tl
    @NonNull
    public v i4(int i) {
        return i == 0 ? this.f7758fb : this.f7759s.get(i - 1);
    }

    public void j5(boolean z) {
        if (this.f7760v != z) {
            hw();
        }
    }

    public final boolean k5(v vVar) {
        return this.f7760v || vVar == this.f7758fb;
    }

    @Override // rc.tl
    public void mt(@NonNull v vVar) {
        super.mt(vVar);
        if (!this.f7760v) {
            this.f7759s.add(vVar);
            return;
        }
        int iR = r();
        this.f7759s.add(vVar);
        ej(iR, vVar.r());
    }

    @Override // rc.tl, rc.fb
    public void n3(@NonNull v vVar, int i, int i5) {
        if (k5(vVar)) {
            super.n3(vVar, i, i5);
        }
    }

    @Override // rc.tl, rc.fb
    public void p(@NonNull v vVar, int i, int i5) {
        if (k5(vVar)) {
            super.p(vVar, i, i5);
        }
    }

    @Override // rc.tl, rc.fb
    public void s() {
        if (this.f7760v) {
            super.s();
        }
    }

    public boolean vl() {
        return this.f7760v;
    }

    @Override // rc.tl, rc.fb
    public void xc(@NonNull v vVar, int i) {
        if (k5(vVar)) {
            super.xc(vVar, i);
        }
    }

    public int yt() {
        return this.f7759s.size();
    }

    @Override // rc.tl
    public void z(@NonNull Collection<? extends v> collection) {
        if (collection.isEmpty()) {
            return;
        }
        super.z(collection);
        if (!this.f7760v) {
            this.f7759s.addAll(collection);
            return;
        }
        int iR = r();
        this.f7759s.addAll(collection);
        ej(iR, s.n3(collection));
    }

    public zn(v vVar, boolean z) {
        this.f7760v = false;
        this.f7759s = new ArrayList();
        this.f7758fb = vVar;
        ((gv) vVar).f3(this);
        this.f7760v = z;
    }
}
