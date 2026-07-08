package h6;

import b1.ta;
import h6.fb;
import ur.f7;
import v0.r;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements fb.n3 {
    public final f7[] n3;
    public final int[] y;

    public zn(int[] iArr, f7[] f7VarArr) {
        this.y = iArr;
        this.n3 = f7VarArr;
    }

    @Override // h6.fb.n3
    public ta a(int i, int i5) {
        int i8 = 0;
        while (true) {
            int[] iArr = this.y;
            if (i8 >= iArr.length) {
                r.zn("BaseMediaChunkOutput", "Unmatched track of type: " + i5);
                return new b1.f();
            }
            if (i5 == iArr[i8]) {
                return this.n3[i8];
            }
            i8++;
        }
    }

    public void n3(long j) {
        for (f7 f7Var : this.n3) {
            f7Var.jz(j);
        }
    }

    public int[] y() {
        int[] iArr = new int[this.n3.length];
        int i = 0;
        while (true) {
            f7[] f7VarArr = this.n3;
            if (i >= f7VarArr.length) {
                return iArr;
            }
            iArr[i] = f7VarArr[i].z6();
            i++;
        }
    }
}
