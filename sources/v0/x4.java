package v0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class x4 {
    public long[] n3;
    public int y;

    public x4() {
        this(32);
    }

    public long[] gv() {
        return Arrays.copyOf(this.n3, this.y);
    }

    public long n3(int i) {
        if (i >= 0 && i < this.y) {
            return this.n3[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.y);
    }

    public void y(long j) {
        int i = this.y;
        long[] jArr = this.n3;
        if (i == jArr.length) {
            this.n3 = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.n3;
        int i5 = this.y;
        this.y = i5 + 1;
        jArr2[i5] = j;
    }

    public int zn() {
        return this.y;
    }

    public x4(int i) {
        this.n3 = new long[i];
    }
}
