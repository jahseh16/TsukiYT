package i7;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5493v;
    public int y = 0;
    public int n3 = -1;
    public int zn = 0;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int[] f5492gv = new int[16];

    public f() {
        this.f5493v = r0.length - 1;
    }

    public boolean gv() {
        return this.zn == 0;
    }

    public void n3() {
        this.y = 0;
        this.n3 = -1;
        this.zn = 0;
    }

    public int v() {
        int i = this.zn;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f5492gv;
        int i5 = this.y;
        int i8 = iArr[i5];
        this.y = (i5 + 1) & this.f5493v;
        this.zn = i - 1;
        return i8;
    }

    public void y(int i) {
        if (this.zn == this.f5492gv.length) {
            zn();
        }
        int i5 = (this.n3 + 1) & this.f5493v;
        this.n3 = i5;
        this.f5492gv[i5] = i;
        this.zn++;
    }

    public final void zn() {
        int[] iArr = this.f5492gv;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i = this.y;
        int i5 = length2 - i;
        System.arraycopy(iArr, i, iArr2, 0, i5);
        System.arraycopy(this.f5492gv, 0, iArr2, i5, i);
        this.y = 0;
        this.n3 = this.zn - 1;
        this.f5492gv = iArr2;
        this.f5493v = iArr2.length - 1;
    }
}
