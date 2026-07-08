package n0;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import ft.g;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import ur.rs;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public abstract class zn implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f6903a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f6904fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f6905gv;
    public final int n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final g[] f6906v;
    public final rs y;
    public final int[] zn;

    public zn(rs rsVar, int... iArr) {
        this(rsVar, iArr, 0);
    }

    public static /* synthetic */ int i4(g gVar, g gVar2) {
        return gVar2.f4786p - gVar.f4786p;
    }

    @Override // n0.rz
    public final int a(int i) {
        return this.zn[i];
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zn znVar = (zn) obj;
        return this.y == znVar.y && Arrays.equals(this.zn, znVar.zn);
    }

    @Override // n0.c
    public /* synthetic */ void f() {
        n.y(this);
    }

    @Override // n0.c
    public boolean gv(int i, long j) {
        return this.f6903a[i] > j;
    }

    public int hashCode() {
        if (this.f6904fb == 0) {
            this.f6904fb = (System.identityHashCode(this.y) * 31) + Arrays.hashCode(this.zn);
        }
        return this.f6904fb;
    }

    @Override // n0.rz
    public final int length() {
        return this.zn.length;
    }

    @Override // n0.c
    public final g mt() {
        return this.f6906v[n3()];
    }

    @Override // n0.c
    public final int p() {
        return this.zn[n3()];
    }

    @Override // n0.c
    public /* synthetic */ void r() {
        n.zn(this);
    }

    @Override // n0.rz
    public final int s(g gVar) {
        for (int i = 0; i < this.n3; i++) {
            if (this.f6906v[i] == gVar) {
                return i;
            }
        }
        return -1;
    }

    @Override // n0.rz
    public final int t(int i) {
        for (int i5 = 0; i5 < this.n3; i5++) {
            if (this.zn[i5] == i) {
                return i5;
            }
        }
        return -1;
    }

    @Override // n0.rz
    public final rs tl() {
        return this.y;
    }

    @Override // n0.rz
    public final g v(int i) {
        return this.f6906v[i];
    }

    @Override // n0.c
    public /* synthetic */ boolean w(long j, h6.a aVar, List list) {
        return n.gv(this, j, aVar, list);
    }

    @Override // n0.c
    public /* synthetic */ void wz(boolean z) {
        n.n3(this, z);
    }

    @Override // n0.c
    public int xc(long j, List<? extends h6.wz> list) {
        return list.size();
    }

    @Override // n0.c
    public boolean zn(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zGv = gv(i, jElapsedRealtime);
        int i5 = 0;
        while (i5 < this.n3 && !zGv) {
            zGv = (i5 == i || gv(i5, jElapsedRealtime)) ? false : true;
            i5++;
        }
        if (!zGv) {
            return false;
        }
        long[] jArr = this.f6903a;
        jArr[i] = Math.max(jArr[i], ut.n3(jElapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    public zn(rs rsVar, int[] iArr, int i) {
        int i5 = 0;
        v0.y.fb(iArr.length > 0);
        this.f6905gv = i;
        this.y = (rs) v0.y.v(rsVar);
        int length = iArr.length;
        this.n3 = length;
        this.f6906v = new g[length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            this.f6906v[i8] = rsVar.zn(iArr[i8]);
        }
        Arrays.sort(this.f6906v, new Comparator() { // from class: n0.n3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return zn.i4((g) obj, (g) obj2);
            }
        });
        this.zn = new int[this.n3];
        while (true) {
            int i10 = this.n3;
            if (i5 >= i10) {
                this.f6903a = new long[i10];
                return;
            } else {
                this.zn[i5] = rsVar.gv(this.f6906v[i5]);
                i5++;
            }
        }
    }

    @Override // n0.c
    public void fb() {
    }

    @Override // n0.c
    public void y() {
    }

    @Override // n0.c
    public void c5(float f3) {
    }
}
