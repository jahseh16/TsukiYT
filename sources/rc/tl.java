package rc;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class tl implements v, fb {
    public final n3 y = new n3();

    public static class n3 {
        public final List<fb> y;

        public n3() {
            this.y = new ArrayList();
        }

        public void a(v vVar, int i, int i5) {
            for (int size = this.y.size() - 1; size >= 0; size--) {
                this.y.get(size).n3(vVar, i, i5);
            }
        }

        public void c5(fb fbVar) {
            synchronized (this.y) {
                this.y.remove(this.y.indexOf(fbVar));
            }
        }

        public void fb(v vVar, int i, int i5) {
            for (int size = this.y.size() - 1; size >= 0; size--) {
                this.y.get(size).fb(vVar, i, i5);
            }
        }

        public void gv(v vVar, int i, int i5) {
            for (int size = this.y.size() - 1; size >= 0; size--) {
                this.y.get(size).p(vVar, i, i5);
            }
        }

        public void n3(v vVar, int i) {
            for (int size = this.y.size() - 1; size >= 0; size--) {
                this.y.get(size).xc(vVar, i);
            }
        }

        public void s(fb fbVar) {
            synchronized (this.y) {
                try {
                    if (this.y.contains(fbVar)) {
                        throw new IllegalStateException("Observer " + fbVar + " is already registered.");
                    }
                    this.y.add(fbVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void v(v vVar, int i, int i5, Object obj) {
            for (int size = this.y.size() - 1; size >= 0; size--) {
                this.y.get(size).f(vVar, i, i5, obj);
            }
        }

        public void y() {
            for (int size = this.y.size() - 1; size >= 0; size--) {
                this.y.get(size).s();
            }
        }

        public void zn(v vVar, int i, Object obj) {
            for (int size = this.y.size() - 1; size >= 0; size--) {
                this.y.get(size).c5(vVar, i, obj);
            }
        }
    }

    @Override // rc.v
    public final int a(@NonNull t tVar) {
        int iR = 0;
        for (int i = 0; i < f3(); i++) {
            v vVarI4 = i4(i);
            int iA = vVarI4.a(tVar);
            if (iA >= 0) {
                return iA + iR;
            }
            iR += vVarI4.r();
        }
        return -1;
    }

    public void a8(@NonNull v vVar) {
        vVar.t(this);
    }

    public void b(@NonNull Collection<? extends v> collection) {
        for (int iF3 = f3() - 1; iF3 >= 0; iF3--) {
            i4(iF3).t(this);
        }
        Iterator<? extends v> it = collection.iterator();
        while (it.hasNext()) {
            it.next().zn(this);
        }
    }

    public int c(int i) {
        int iR = 0;
        for (int i5 = 0; i5 < i; i5++) {
            iR += i4(i5).r();
        }
        return iR;
    }

    @Override // rc.fb
    public void c5(@NonNull v vVar, int i, Object obj) {
        this.y.zn(this, d0(vVar) + i, obj);
    }

    public void d(int i, int i5) {
        this.y.gv(this, i, i5);
    }

    public int d0(@NonNull v vVar) {
        return c(fh(vVar));
    }

    public void ej(int i, int i5) {
        this.y.a(this, i, i5);
    }

    @Override // rc.fb
    public void f(@NonNull v vVar, int i, int i5, Object obj) {
        this.y.v(this, d0(vVar) + i, i5, obj);
    }

    public abstract int f3();

    @Override // rc.fb
    public void fb(@NonNull v vVar, int i, int i5) {
        this.y.fb(this, d0(vVar) + i, i5);
    }

    public abstract int fh(@NonNull v vVar);

    @Override // rc.v
    @NonNull
    public t getItem(int i) {
        int i5 = 0;
        int i8 = 0;
        while (i5 < f3()) {
            v vVarI4 = i4(i5);
            int iR = vVarI4.r() + i8;
            if (iR > i) {
                return vVarI4.getItem(i - i8);
            }
            i5++;
            i8 = iR;
        }
        throw new IndexOutOfBoundsException("Wanted item at " + i + " but there are only " + r() + " items");
    }

    @NonNull
    public abstract v i4(int i);

    public void mt(@NonNull v vVar) {
        vVar.zn(this);
    }

    @Override // rc.fb
    public void n3(@NonNull v vVar, int i, int i5) {
        this.y.a(this, d0(vVar) + i, i5);
    }

    @Override // rc.fb
    public void p(@NonNull v vVar, int i, int i5) {
        int iD0 = d0(vVar);
        this.y.gv(this, i + iD0, iD0 + i5);
    }

    @Override // rc.v
    public int r() {
        int iR = 0;
        for (int i = 0; i < f3(); i++) {
            iR += i4(i).r();
        }
        return iR;
    }

    public void rz() {
        this.y.y();
    }

    @Override // rc.fb
    public void s() {
        this.y.y();
    }

    @Override // rc.v
    public void t(@NonNull fb fbVar) {
        this.y.c5(fbVar);
    }

    public void ud(int i, int i5) {
        this.y.fb(this, i, i5);
    }

    public void x(@NonNull Collection<? extends v> collection) {
        Iterator<? extends v> it = collection.iterator();
        while (it.hasNext()) {
            it.next().t(this);
        }
    }

    @Override // rc.fb
    public void xc(@NonNull v vVar, int i) {
        this.y.n3(this, d0(vVar) + i);
    }

    public void z(@NonNull Collection<? extends v> collection) {
        Iterator<? extends v> it = collection.iterator();
        while (it.hasNext()) {
            it.next().zn(this);
        }
    }

    public void z6(int i, int i5, Object obj) {
        this.y.v(this, i, i5, obj);
    }

    @Override // rc.v
    public final void zn(@NonNull fb fbVar) {
        this.y.s(fbVar);
    }
}
