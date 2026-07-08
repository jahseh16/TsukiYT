package mj1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends g<double[]> {
    public int n3;
    public double[] y;

    public d0(double[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.y = bufferWithData;
        this.n3 = bufferWithData.length;
        n3(10);
    }

    @Override // mj1.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public double[] y() {
        double[] dArrCopyOf = Arrays.copyOf(this.y, gv());
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(this, newSize)");
        return dArrCopyOf;
    }

    @Override // mj1.g
    public int gv() {
        return this.n3;
    }

    @Override // mj1.g
    public void n3(int i) {
        double[] dArr = this.y;
        if (dArr.length < i) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, RangesKt.coerceAtLeast(i, dArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(this, newSize)");
            this.y = dArrCopyOf;
        }
    }

    public final void v(double d4) {
        g.zn(this, 0, 1, null);
        double[] dArr = this.y;
        int iGv = gv();
        this.n3 = iGv + 1;
        dArr[iGv] = d4;
    }
}
