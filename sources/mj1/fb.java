package mj1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class fb extends g<boolean[]> {
    public int n3;
    public boolean[] y;

    public fb(boolean[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.y = bufferWithData;
        this.n3 = bufferWithData.length;
        n3(10);
    }

    @Override // mj1.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean[] y() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.y, gv());
        Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "copyOf(this, newSize)");
        return zArrCopyOf;
    }

    @Override // mj1.g
    public int gv() {
        return this.n3;
    }

    @Override // mj1.g
    public void n3(int i) {
        boolean[] zArr = this.y;
        if (zArr.length < i) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, RangesKt.coerceAtLeast(i, zArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "copyOf(this, newSize)");
            this.y = zArrCopyOf;
        }
    }

    public final void v(boolean z) {
        g.zn(this, 0, 1, null);
        boolean[] zArr = this.y;
        int iGv = gv();
        this.n3 = iGv + 1;
        zArr[iGv] = z;
    }
}
