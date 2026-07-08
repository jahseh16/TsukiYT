package mj1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class qn extends g<int[]> {
    public int n3;
    public int[] y;

    public qn(int[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.y = bufferWithData;
        this.n3 = bufferWithData.length;
        n3(10);
    }

    @Override // mj1.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int[] y() {
        int[] iArrCopyOf = Arrays.copyOf(this.y, gv());
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
        return iArrCopyOf;
    }

    @Override // mj1.g
    public int gv() {
        return this.n3;
    }

    @Override // mj1.g
    public void n3(int i) {
        int[] iArr = this.y;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, RangesKt.coerceAtLeast(i, iArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.y = iArrCopyOf;
        }
    }

    public final void v(int i) {
        g.zn(this, 0, 1, null);
        int[] iArr = this.y;
        int iGv = gv();
        this.n3 = iGv + 1;
        iArr[iGv] = i;
    }
}
