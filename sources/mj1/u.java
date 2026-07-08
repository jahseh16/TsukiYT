package mj1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class u extends g<long[]> {
    public int n3;
    public long[] y;

    public u(long[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.y = bufferWithData;
        this.n3 = bufferWithData.length;
        n3(10);
    }

    @Override // mj1.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public long[] y() {
        long[] jArrCopyOf = Arrays.copyOf(this.y, gv());
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
        return jArrCopyOf;
    }

    @Override // mj1.g
    public int gv() {
        return this.n3;
    }

    @Override // mj1.g
    public void n3(int i) {
        long[] jArr = this.y;
        if (jArr.length < i) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, RangesKt.coerceAtLeast(i, jArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.y = jArrCopyOf;
        }
    }

    public final void v(long j) {
        g.zn(this, 0, 1, null);
        long[] jArr = this.y;
        int iGv = gv();
        this.n3 = iGv + 1;
        jArr[iGv] = j;
    }
}
