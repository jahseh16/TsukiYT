package mj1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class i9 extends g<byte[]> {
    public int n3;
    public byte[] y;

    public i9(byte[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.y = bufferWithData;
        this.n3 = bufferWithData.length;
        n3(10);
    }

    @Override // mj1.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] y() {
        byte[] bArrCopyOf = Arrays.copyOf(this.y, gv());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
        return bArrCopyOf;
    }

    @Override // mj1.g
    public int gv() {
        return this.n3;
    }

    @Override // mj1.g
    public void n3(int i) {
        byte[] bArr = this.y;
        if (bArr.length < i) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, RangesKt.coerceAtLeast(i, bArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
            this.y = bArrCopyOf;
        }
    }

    public final void v(byte b4) {
        g.zn(this, 0, 1, null);
        byte[] bArr = this.y;
        int iGv = gv();
        this.n3 = iGv + 1;
        bArr[iGv] = b4;
    }
}
