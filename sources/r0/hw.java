package r0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import r0.hw;

/* JADX INFO: loaded from: classes.dex */
public class hw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7494a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f7495fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7497v;
    public final int y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Comparator<n3> f7493s = new Comparator() { // from class: r0.yt
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return hw.fb((hw.n3) obj, (hw.n3) obj2);
        }
    };

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final Comparator<n3> f7492c5 = new Comparator() { // from class: r0.vl
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return hw.s((hw.n3) obj, (hw.n3) obj2);
        }
    };
    public final n3[] zn = new n3[5];
    public final ArrayList<n3> n3 = new ArrayList<>();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f7496gv = -1;

    public static class n3 {
        public int n3;
        public int y;
        public float zn;

        public n3() {
        }
    }

    public hw(int i) {
        this.y = i;
    }

    public static /* synthetic */ int fb(n3 n3Var, n3 n3Var2) {
        return n3Var.y - n3Var2.y;
    }

    public static /* synthetic */ int s(n3 n3Var, n3 n3Var2) {
        return Float.compare(n3Var.zn, n3Var2.zn);
    }

    public float a(float f3) {
        v();
        float f4 = f3 * this.f7494a;
        int i = 0;
        for (int i5 = 0; i5 < this.n3.size(); i5++) {
            n3 n3Var = this.n3.get(i5);
            i += n3Var.n3;
            if (i >= f4) {
                return n3Var.zn;
            }
        }
        if (this.n3.isEmpty()) {
            return Float.NaN;
        }
        return this.n3.get(r5.size() - 1).zn;
    }

    public void c5() {
        this.n3.clear();
        this.f7496gv = -1;
        this.f7497v = 0;
        this.f7494a = 0;
    }

    public final void gv() {
        if (this.f7496gv != 1) {
            Collections.sort(this.n3, f7493s);
            this.f7496gv = 1;
        }
    }

    public final void v() {
        if (this.f7496gv != 0) {
            Collections.sort(this.n3, f7492c5);
            this.f7496gv = 0;
        }
    }

    public void zn(int i, float f3) {
        n3 n3Var;
        gv();
        int i5 = this.f7495fb;
        if (i5 > 0) {
            n3[] n3VarArr = this.zn;
            int i8 = i5 - 1;
            this.f7495fb = i8;
            n3Var = n3VarArr[i8];
        } else {
            n3Var = new n3();
        }
        int i10 = this.f7497v;
        this.f7497v = i10 + 1;
        n3Var.y = i10;
        n3Var.n3 = i;
        n3Var.zn = f3;
        this.n3.add(n3Var);
        this.f7494a += i;
        while (true) {
            int i11 = this.f7494a;
            int i12 = this.y;
            if (i11 <= i12) {
                return;
            }
            int i13 = i11 - i12;
            n3 n3Var2 = this.n3.get(0);
            int i14 = n3Var2.n3;
            if (i14 <= i13) {
                this.f7494a -= i14;
                this.n3.remove(0);
                int i15 = this.f7495fb;
                if (i15 < 5) {
                    n3[] n3VarArr2 = this.zn;
                    this.f7495fb = i15 + 1;
                    n3VarArr2[i15] = n3Var2;
                }
            } else {
                n3Var2.n3 = i14 - i13;
                this.f7494a -= i13;
            }
        }
    }
}
