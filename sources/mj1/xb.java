package mj1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class xb extends g<short[]> {
    public int n3;
    public short[] y;

    public xb(short[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.y = bufferWithData;
        this.n3 = bufferWithData.length;
        n3(10);
    }

    @Override // mj1.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public short[] y() {
        short[] sArrCopyOf = Arrays.copyOf(this.y, gv());
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(this, newSize)");
        return sArrCopyOf;
    }

    @Override // mj1.g
    public int gv() {
        return this.n3;
    }

    @Override // mj1.g
    public void n3(int i) {
        short[] sArr = this.y;
        if (sArr.length < i) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, RangesKt.coerceAtLeast(i, sArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(this, newSize)");
            this.y = sArrCopyOf;
        }
    }

    public final void v(short s3) {
        g.zn(this, 0, 1, null);
        short[] sArr = this.y;
        int iGv = gv();
        this.n3 = iGv + 1;
        sArr[iGv] = s3;
    }
}
