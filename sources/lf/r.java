package lf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public byte[] f6348gv;
    public boolean n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6349v;
    public final int y;
    public boolean zn;

    public r(int i, int i5) {
        this.y = i;
        byte[] bArr = new byte[i5 + 3];
        this.f6348gv = bArr;
        bArr[2] = 1;
    }

    public void gv() {
        this.n3 = false;
        this.zn = false;
    }

    public boolean n3(int i) {
        if (!this.n3) {
            return false;
        }
        this.f6349v -= i;
        this.n3 = false;
        this.zn = true;
        return true;
    }

    public void v(int i) {
        v0.y.fb(!this.n3);
        boolean z = i == this.y;
        this.n3 = z;
        if (z) {
            this.f6349v = 3;
            this.zn = false;
        }
    }

    public void y(byte[] bArr, int i, int i5) {
        if (this.n3) {
            int i8 = i5 - i;
            byte[] bArr2 = this.f6348gv;
            int length = bArr2.length;
            int i10 = this.f6349v;
            if (length < i10 + i8) {
                this.f6348gv = Arrays.copyOf(bArr2, (i10 + i8) * 2);
            }
            System.arraycopy(bArr, i, this.f6348gv, this.f6349v, i8);
            this.f6349v += i8;
        }
    }

    public boolean zn() {
        return this.zn;
    }
}
