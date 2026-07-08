package mj1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class w extends g<char[]> {
    public int n3;
    public char[] y;

    public w(char[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.y = bufferWithData;
        this.n3 = bufferWithData.length;
        n3(10);
    }

    @Override // mj1.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public char[] y() {
        char[] cArrCopyOf = Arrays.copyOf(this.y, gv());
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(this, newSize)");
        return cArrCopyOf;
    }

    @Override // mj1.g
    public int gv() {
        return this.n3;
    }

    @Override // mj1.g
    public void n3(int i) {
        char[] cArr = this.y;
        if (cArr.length < i) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, RangesKt.coerceAtLeast(i, cArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(this, newSize)");
            this.y = cArrCopyOf;
        }
    }

    public final void v(char c) {
        g.zn(this, 0, 1, null);
        char[] cArr = this.y;
        int iGv = gv();
        this.n3 = iGv + 1;
        cArr[iGv] = c;
    }
}
