package t0;

import androidx.annotation.Nullable;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final ArrayList<y> f8121gv;
    public final String n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public w f8122v;
    public final int y;
    public final TreeSet<r> zn;

    public static final class y {
        public final long n3;
        public final long y;

        public y(long j, long j4) {
            this.y = j;
            this.n3 = j4;
        }

        public boolean n3(long j, long j4) {
            long j7 = this.y;
            if (j7 > j) {
                return j4 == -1 || j + j4 > j7;
            }
            long j8 = this.n3;
            return j8 == -1 || j7 + j8 > j;
        }

        public boolean y(long j, long j4) {
            long j7 = this.n3;
            if (j7 == -1) {
                return j >= this.y;
            }
            if (j4 == -1) {
                return false;
            }
            long j8 = this.y;
            return j8 <= j && j + j4 <= j8 + j7;
        }
    }

    public f(int i, String str) {
        this(i, str, w.zn);
    }

    public TreeSet<r> a() {
        return this.zn;
    }

    public boolean c5() {
        return this.f8121gv.isEmpty();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.y == fVar.y && this.n3.equals(fVar.n3) && this.zn.equals(fVar.zn) && this.f8122v.equals(fVar.f8122v);
    }

    public boolean f(c5 c5Var) {
        if (!this.zn.remove(c5Var)) {
            return false;
        }
        File file = c5Var.f8116f;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public boolean fb() {
        return this.zn.isEmpty();
    }

    public w gv() {
        return this.f8122v;
    }

    public int hashCode() {
        return (((this.y * 31) + this.n3.hashCode()) * 31) + this.f8122v.hashCode();
    }

    public boolean i9(long j, long j4) {
        for (int i = 0; i < this.f8121gv.size(); i++) {
            if (this.f8121gv.get(i).n3(j, j4)) {
                return false;
            }
        }
        this.f8121gv.add(new y(j, j4));
        return true;
    }

    public boolean n3(xc xcVar) {
        this.f8122v = this.f8122v.v(xcVar);
        return !r2.equals(r0);
    }

    public boolean s(long j, long j4) {
        for (int i = 0; i < this.f8121gv.size(); i++) {
            if (this.f8121gv.get(i).y(j, j4)) {
                return true;
            }
        }
        return false;
    }

    public r t(r rVar, long j, boolean z) {
        v0.y.fb(this.zn.remove(rVar));
        File file = (File) v0.y.v(rVar.f8116f);
        if (z) {
            File fileC5 = r.c5((File) v0.y.v(file.getParentFile()), this.y, rVar.f8120v, j);
            if (file.renameTo(fileC5)) {
                file = fileC5;
            } else {
                v0.r.c5("CachedContent", "Failed to rename " + file + " to " + fileC5);
            }
        }
        r rVarGv = rVar.gv(file, j);
        this.zn.add(rVarGv);
        return rVarGv;
    }

    public void tl(long j) {
        for (int i = 0; i < this.f8121gv.size(); i++) {
            if (this.f8121gv.get(i).y == j) {
                this.f8121gv.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public r v(long j, long j4) {
        r rVarS = r.s(this.n3, j);
        r rVarFloor = this.zn.floor(rVarS);
        if (rVarFloor != null && rVarFloor.f8120v + rVarFloor.f8117fb > j) {
            return rVarFloor;
        }
        r rVarCeiling = this.zn.ceiling(rVarS);
        if (rVarCeiling != null) {
            long j7 = rVarCeiling.f8120v - j;
            j4 = j4 == -1 ? j7 : Math.min(j7, j4);
        }
        return r.fb(this.n3, j, j4);
    }

    public void y(r rVar) {
        this.zn.add(rVar);
    }

    public long zn(long j, long j4) {
        v0.y.y(j >= 0);
        v0.y.y(j4 >= 0);
        r rVarV = v(j, j4);
        if (rVarV.n3()) {
            return -Math.min(rVarV.zn() ? Long.MAX_VALUE : rVarV.f8117fb, j4);
        }
        long j7 = j + j4;
        long j8 = j7 >= 0 ? j7 : Long.MAX_VALUE;
        long jMax = rVarV.f8120v + rVarV.f8117fb;
        if (jMax < j8) {
            for (r rVar : this.zn.tailSet(rVarV, false)) {
                long j9 = rVar.f8120v;
                if (j9 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j9 + rVar.f8117fb);
                if (jMax >= j8) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j4);
    }

    public f(int i, String str, w wVar) {
        this.y = i;
        this.n3 = str;
        this.f8122v = wVar;
        this.zn = new TreeSet<>();
        this.f8121gv = new ArrayList<>();
    }
}
