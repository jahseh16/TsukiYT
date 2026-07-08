package ur;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class ct<V> {
    public final SparseArray<V> n3 = new SparseArray<>();
    public int y = -1;
    public final v0.c5<V> zn;

    public ct(v0.c5<V> c5Var) {
        this.zn = c5Var;
    }

    public V a() {
        return this.n3.valueAt(r0.size() - 1);
    }

    public boolean fb() {
        return this.n3.size() == 0;
    }

    public void gv(int i) {
        int i5 = 0;
        while (i5 < this.n3.size() - 1) {
            int i8 = i5 + 1;
            if (i < this.n3.keyAt(i8)) {
                return;
            }
            this.zn.accept(this.n3.valueAt(i5));
            this.n3.removeAt(i5);
            int i10 = this.y;
            if (i10 > 0) {
                this.y = i10 - 1;
            }
            i5 = i8;
        }
    }

    public void n3() {
        for (int i = 0; i < this.n3.size(); i++) {
            this.zn.accept(this.n3.valueAt(i));
        }
        this.y = -1;
        this.n3.clear();
    }

    public V v(int i) {
        if (this.y == -1) {
            this.y = 0;
        }
        while (true) {
            int i5 = this.y;
            if (i5 <= 0 || i >= this.n3.keyAt(i5)) {
                break;
            }
            this.y--;
        }
        while (this.y < this.n3.size() - 1 && i >= this.n3.keyAt(this.y + 1)) {
            this.y++;
        }
        return this.n3.valueAt(this.y);
    }

    public void y(int i, V v6) {
        if (this.y == -1) {
            v0.y.fb(this.n3.size() == 0);
            this.y = 0;
        }
        if (this.n3.size() > 0) {
            SparseArray<V> sparseArray = this.n3;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            v0.y.y(i >= iKeyAt);
            if (iKeyAt == i) {
                v0.c5<V> c5Var = this.zn;
                SparseArray<V> sparseArray2 = this.n3;
                c5Var.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.n3.append(i, v6);
    }

    public void zn(int i) {
        for (int size = this.n3.size() - 1; size >= 0 && i < this.n3.keyAt(size); size--) {
            this.zn.accept(this.n3.valueAt(size));
            this.n3.removeAt(size);
        }
        this.y = this.n3.size() > 0 ? Math.min(this.y, this.n3.size() - 1) : -1;
    }
}
