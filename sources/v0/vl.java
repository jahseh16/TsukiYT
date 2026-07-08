package v0;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vl<V> {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f8769gv;
    public V[] n3;
    public long[] y;
    public int zn;

    public vl() {
        this(10);
    }

    public static <V> V[] a(int i) {
        return (V[]) new Object[i];
    }

    @Nullable
    public synchronized V c5() {
        return this.f8769gv == 0 ? null : f();
    }

    @Nullable
    public final V f() {
        y.fb(this.f8769gv > 0);
        V[] vArr = this.n3;
        int i = this.zn;
        V v6 = vArr[i];
        vArr[i] = null;
        this.zn = (i + 1) % vArr.length;
        this.f8769gv--;
        return v6;
    }

    @Nullable
    public synchronized V fb(long j) {
        return s(j, false);
    }

    public final void gv(long j) {
        if (this.f8769gv > 0) {
            if (j <= this.y[((this.zn + r0) - 1) % this.n3.length]) {
                zn();
            }
        }
    }

    @Nullable
    public synchronized V i9(long j) {
        return s(j, true);
    }

    public final void n3(long j, V v6) {
        int i = this.zn;
        int i5 = this.f8769gv;
        V[] vArr = this.n3;
        int length = (i + i5) % vArr.length;
        this.y[length] = j;
        vArr[length] = v6;
        this.f8769gv = i5 + 1;
    }

    @Nullable
    public final V s(long j, boolean z) {
        V vF = null;
        long j4 = Long.MAX_VALUE;
        while (this.f8769gv > 0) {
            long j7 = j - this.y[this.zn];
            if (j7 < 0 && (z || (-j7) >= j4)) {
                break;
            }
            vF = f();
            j4 = j7;
        }
        return vF;
    }

    public synchronized int t() {
        return this.f8769gv;
    }

    public final void v() {
        int length = this.n3.length;
        if (this.f8769gv < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) a(i);
        int i5 = this.zn;
        int i8 = length - i5;
        System.arraycopy(this.y, i5, jArr, 0, i8);
        System.arraycopy(this.n3, this.zn, vArr, 0, i8);
        int i10 = this.zn;
        if (i10 > 0) {
            System.arraycopy(this.y, 0, jArr, i8, i10);
            System.arraycopy(this.n3, 0, vArr, i8, this.zn);
        }
        this.y = jArr;
        this.n3 = vArr;
        this.zn = 0;
    }

    public synchronized void y(long j, V v6) {
        gv(j);
        v();
        n3(j, v6);
    }

    public synchronized void zn() {
        this.zn = 0;
        this.f8769gv = 0;
        Arrays.fill(this.n3, (Object) null);
    }

    public vl(int i) {
        this.y = new long[i];
        this.n3 = (V[]) a(i);
    }
}
