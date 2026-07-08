package x9;

import b1.tl;
import java.io.IOException;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public int n3;
    public final d y = new d(8);

    public boolean n3(tl tlVar) throws IOException {
        long length = tlVar.getLength();
        long j = 1024;
        if (length != -1 && length <= 1024) {
            j = length;
        }
        int i = (int) j;
        tlVar.z(this.y.v(), 0, 4);
        long jA8 = this.y.a8();
        this.n3 = 4;
        while (jA8 != 440786851) {
            int i5 = this.n3 + 1;
            this.n3 = i5;
            if (i5 == i) {
                return false;
            }
            tlVar.z(this.y.v(), 0, 1);
            jA8 = ((jA8 << 8) & (-256)) | ((long) (this.y.v()[0] & 255));
        }
        long jY = y(tlVar);
        long j4 = this.n3;
        if (jY == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j4 + jY >= length) {
            return false;
        }
        while (true) {
            int i8 = this.n3;
            long j7 = j4 + jY;
            if (i8 >= j7) {
                return ((long) i8) == j7;
            }
            if (y(tlVar) == Long.MIN_VALUE) {
                return false;
            }
            long jY2 = y(tlVar);
            if (jY2 < 0 || jY2 > 2147483647L) {
                break;
            }
            if (jY2 != 0) {
                int i10 = (int) jY2;
                tlVar.tl(i10);
                this.n3 += i10;
            }
        }
        return false;
    }

    public final long y(tl tlVar) throws IOException {
        int i = 0;
        tlVar.z(this.y.v(), 0, 1);
        int i5 = this.y.v()[0] & 255;
        if (i5 == 0) {
            return Long.MIN_VALUE;
        }
        int i8 = 128;
        int i10 = 0;
        while ((i5 & i8) == 0) {
            i8 >>= 1;
            i10++;
        }
        int i11 = i5 & (~i8);
        tlVar.z(this.y.v(), 1, i10);
        while (i < i10) {
            i++;
            i11 = (this.y.v()[i] & 255) + (i11 << 8);
        }
        this.n3 += i10 + 1;
        return i11;
    }
}
