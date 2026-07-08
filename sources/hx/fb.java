package hx;

import androidx.annotation.Nullable;
import hx.fb;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class fb {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public boolean f5365gv;
    public int n3;
    public final TreeSet<y> y = new TreeSet<>(new Comparator() { // from class: hx.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return fb.gv((fb.y) obj, (fb.y) obj2);
        }
    });
    public int zn;

    public static final class y {
        public final long n3;
        public final v y;

        public y(v vVar, long j) {
            this.y = vVar;
            this.n3 = j;
        }
    }

    public fb() {
        fb();
    }

    public static /* synthetic */ int gv(y yVar, y yVar2) {
        return zn(yVar.y.f5405fb, yVar2.y.f5405fb);
    }

    public static int zn(int i, int i5) {
        int iMin;
        int i8 = i - i5;
        return (Math.abs(i8) <= 1000 || (iMin = (Math.min(i, i5) - Math.max(i, i5)) + 65535) >= 1000) ? i8 : i < i5 ? iMin : -iMin;
    }

    @Nullable
    public synchronized v a(long j) {
        if (this.y.isEmpty()) {
            return null;
        }
        y yVarFirst = this.y.first();
        int i = yVarFirst.y.f5405fb;
        if (i != v.n3(this.zn) && j < yVarFirst.n3) {
            return null;
        }
        this.y.pollFirst();
        this.zn = i;
        return yVarFirst.y;
    }

    public synchronized void fb() {
        this.y.clear();
        this.f5365gv = false;
        this.zn = -1;
        this.n3 = -1;
    }

    public final synchronized void n3(y yVar) {
        this.n3 = yVar.y.f5405fb;
        this.y.add(yVar);
    }

    public synchronized boolean v(v vVar, long j) {
        if (this.y.size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i = vVar.f5405fb;
        if (!this.f5365gv) {
            fb();
            this.zn = v.zn(i);
            this.f5365gv = true;
            n3(new y(vVar, j));
            return true;
        }
        if (Math.abs(zn(i, v.n3(this.n3))) < 1000) {
            if (zn(i, this.zn) <= 0) {
                return false;
            }
            n3(new y(vVar, j));
            return true;
        }
        this.zn = v.zn(i);
        this.y.clear();
        n3(new y(vVar, j));
        return true;
    }
}
