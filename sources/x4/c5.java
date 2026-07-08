package x4;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class c5<E> implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f9073f = new Object();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public Object[] f9074fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9075s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int[] f9076v;
    public boolean y;

    public c5() {
        this(10);
    }

    public int c5(int i) {
        if (this.y) {
            v();
        }
        return gv.y(this.f9076v, this.f9075s, i);
    }

    public boolean f() {
        return w() == 0;
    }

    @Nullable
    public E fb(int i) {
        return s(i, null);
    }

    /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
    public c5<E> clone() {
        try {
            c5<E> c5Var = (c5) super.clone();
            c5Var.f9076v = (int[]) this.f9076v.clone();
            c5Var.f9074fb = (Object[]) this.f9074fb.clone();
            return c5Var;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public int i9(E e4) {
        if (this.y) {
            v();
        }
        for (int i = 0; i < this.f9075s; i++) {
            if (this.f9074fb[i] == e4) {
                return i;
            }
        }
        return -1;
    }

    public void n3(int i, E e4) {
        int i5 = this.f9075s;
        if (i5 != 0 && i <= this.f9076v[i5 - 1]) {
            tl(i, e4);
            return;
        }
        if (this.y && i5 >= this.f9076v.length) {
            v();
        }
        int i8 = this.f9075s;
        if (i8 >= this.f9076v.length) {
            int iV = gv.v(i8 + 1);
            int[] iArr = new int[iV];
            Object[] objArr = new Object[iV];
            int[] iArr2 = this.f9076v;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f9074fb;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f9076v = iArr;
            this.f9074fb = objArr;
        }
        this.f9076v[i8] = i;
        this.f9074fb[i8] = e4;
        this.f9075s = i8 + 1;
    }

    public E p(int i) {
        if (this.y) {
            v();
        }
        return (E) this.f9074fb[i];
    }

    public E s(int i, E e4) {
        E e5;
        int iY = gv.y(this.f9076v, this.f9075s, i);
        return (iY < 0 || (e5 = (E) this.f9074fb[iY]) == f9073f) ? e4 : e5;
    }

    public int t(int i) {
        if (this.y) {
            v();
        }
        return this.f9076v[i];
    }

    public void tl(int i, E e4) {
        int iY = gv.y(this.f9076v, this.f9075s, i);
        if (iY >= 0) {
            this.f9074fb[iY] = e4;
            return;
        }
        int i5 = ~iY;
        int i8 = this.f9075s;
        if (i5 < i8) {
            Object[] objArr = this.f9074fb;
            if (objArr[i5] == f9073f) {
                this.f9076v[i5] = i;
                objArr[i5] = e4;
                return;
            }
        }
        if (this.y && i8 >= this.f9076v.length) {
            v();
            i5 = ~gv.y(this.f9076v, this.f9075s, i);
        }
        int i10 = this.f9075s;
        if (i10 >= this.f9076v.length) {
            int iV = gv.v(i10 + 1);
            int[] iArr = new int[iV];
            Object[] objArr2 = new Object[iV];
            int[] iArr2 = this.f9076v;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f9074fb;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f9076v = iArr;
            this.f9074fb = objArr2;
        }
        int i11 = this.f9075s;
        if (i11 - i5 != 0) {
            int[] iArr3 = this.f9076v;
            int i12 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i12, i11 - i5);
            Object[] objArr4 = this.f9074fb;
            System.arraycopy(objArr4, i5, objArr4, i12, this.f9075s - i5);
        }
        this.f9076v[i5] = i;
        this.f9074fb[i5] = e4;
        this.f9075s++;
    }

    public String toString() {
        if (w() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9075s * 28);
        sb.append('{');
        for (int i = 0; i < this.f9075s; i++) {
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

    public final void v() {
        int i = this.f9075s;
        int[] iArr = this.f9076v;
        Object[] objArr = this.f9074fb;
        int i5 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            Object obj = objArr[i8];
            if (obj != f9073f) {
                if (i8 != i5) {
                    iArr[i5] = iArr[i8];
                    objArr[i5] = obj;
                    objArr[i8] = null;
                }
                i5++;
            }
        }
        this.y = false;
        this.f9075s = i5;
    }

    public int w() {
        if (this.y) {
            v();
        }
        return this.f9075s;
    }

    public void wz(int i) {
        Object[] objArr = this.f9074fb;
        Object obj = objArr[i];
        Object obj2 = f9073f;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.y = true;
        }
    }

    @Nullable
    public E xc(int i, E e4) {
        int iC5 = c5(i);
        if (iC5 < 0) {
            return null;
        }
        Object[] objArr = this.f9074fb;
        E e5 = (E) objArr[iC5];
        objArr[iC5] = e4;
        return e5;
    }

    public void zn() {
        int i = this.f9075s;
        Object[] objArr = this.f9074fb;
        for (int i5 = 0; i5 < i; i5++) {
            objArr[i5] = null;
        }
        this.f9075s = 0;
        this.y = false;
    }

    public c5(int i) {
        this.y = false;
        if (i == 0) {
            this.f9076v = gv.y;
            this.f9074fb = gv.zn;
        } else {
            int iV = gv.v(i);
            this.f9076v = new int[iV];
            this.f9074fb = new Object[iV];
        }
    }
}
