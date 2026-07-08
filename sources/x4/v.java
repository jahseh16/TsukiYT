package x4;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class v<E> implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f9099f = new Object();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public Object[] f9100fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9101s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long[] f9102v;
    public boolean y;

    public v() {
        this(10);
    }

    public E c5(long j, E e4) {
        E e5;
        int iN3 = gv.n3(this.f9102v, this.f9101s, j);
        return (iN3 < 0 || (e5 = (E) this.f9100fb[iN3]) == f9099f) ? e4 : e5;
    }

    public boolean f() {
        return w() == 0;
    }

    public final void fb() {
        int i = this.f9101s;
        long[] jArr = this.f9102v;
        Object[] objArr = this.f9100fb;
        int i5 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            Object obj = objArr[i8];
            if (obj != f9099f) {
                if (i8 != i5) {
                    jArr[i5] = jArr[i8];
                    objArr[i5] = obj;
                    objArr[i8] = null;
                }
                i5++;
            }
        }
        this.y = false;
        this.f9101s = i5;
    }

    /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
    public v<E> clone() {
        try {
            v<E> vVar = (v) super.clone();
            vVar.f9102v = (long[]) this.f9102v.clone();
            vVar.f9100fb = (Object[]) this.f9100fb.clone();
            return vVar;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public int i9(long j) {
        if (this.y) {
            fb();
        }
        return gv.n3(this.f9102v, this.f9101s, j);
    }

    public void n3(long j, E e4) {
        int i = this.f9101s;
        if (i != 0 && j <= this.f9102v[i - 1]) {
            tl(j, e4);
            return;
        }
        if (this.y && i >= this.f9102v.length) {
            fb();
        }
        int i5 = this.f9101s;
        if (i5 >= this.f9102v.length) {
            int iA = gv.a(i5 + 1);
            long[] jArr = new long[iA];
            Object[] objArr = new Object[iA];
            long[] jArr2 = this.f9102v;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f9100fb;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f9102v = jArr;
            this.f9100fb = objArr;
        }
        this.f9102v[i5] = j;
        this.f9100fb[i5] = e4;
        this.f9101s = i5 + 1;
    }

    public E p(int i) {
        if (this.y) {
            fb();
        }
        return (E) this.f9100fb[i];
    }

    @Nullable
    public E s(long j) {
        return c5(j, null);
    }

    public long t(int i) {
        if (this.y) {
            fb();
        }
        return this.f9102v[i];
    }

    public void tl(long j, E e4) {
        int iN3 = gv.n3(this.f9102v, this.f9101s, j);
        if (iN3 >= 0) {
            this.f9100fb[iN3] = e4;
            return;
        }
        int i = ~iN3;
        int i5 = this.f9101s;
        if (i < i5) {
            Object[] objArr = this.f9100fb;
            if (objArr[i] == f9099f) {
                this.f9102v[i] = j;
                objArr[i] = e4;
                return;
            }
        }
        if (this.y && i5 >= this.f9102v.length) {
            fb();
            i = ~gv.n3(this.f9102v, this.f9101s, j);
        }
        int i8 = this.f9101s;
        if (i8 >= this.f9102v.length) {
            int iA = gv.a(i8 + 1);
            long[] jArr = new long[iA];
            Object[] objArr2 = new Object[iA];
            long[] jArr2 = this.f9102v;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f9100fb;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f9102v = jArr;
            this.f9100fb = objArr2;
        }
        int i10 = this.f9101s;
        if (i10 - i != 0) {
            long[] jArr3 = this.f9102v;
            int i11 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i11, i10 - i);
            Object[] objArr4 = this.f9100fb;
            System.arraycopy(objArr4, i, objArr4, i11, this.f9101s - i);
        }
        this.f9102v[i] = j;
        this.f9100fb[i] = e4;
        this.f9101s++;
    }

    public String toString() {
        if (w() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9101s * 28);
        sb.append('{');
        for (int i = 0; i < this.f9101s; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(t(i));
            sb.append('=');
            E eP = p(i);
            if (eP != this) {
                sb.append(eP);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean v(long j) {
        return i9(j) >= 0;
    }

    public int w() {
        if (this.y) {
            fb();
        }
        return this.f9101s;
    }

    public void wz(long j) {
        int iN3 = gv.n3(this.f9102v, this.f9101s, j);
        if (iN3 >= 0) {
            Object[] objArr = this.f9100fb;
            Object obj = objArr[iN3];
            Object obj2 = f9099f;
            if (obj != obj2) {
                objArr[iN3] = obj2;
                this.y = true;
            }
        }
    }

    public void xc(int i) {
        Object[] objArr = this.f9100fb;
        Object obj = objArr[i];
        Object obj2 = f9099f;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.y = true;
        }
    }

    public void zn() {
        int i = this.f9101s;
        Object[] objArr = this.f9100fb;
        for (int i5 = 0; i5 < i; i5++) {
            objArr[i5] = null;
        }
        this.f9101s = 0;
        this.y = false;
    }

    public v(int i) {
        this.y = false;
        if (i == 0) {
            this.f9102v = gv.n3;
            this.f9100fb = gv.zn;
        } else {
            int iA = gv.a(i);
            this.f9102v = new long[iA];
            this.f9100fb = new Object[iA];
        }
    }
}
