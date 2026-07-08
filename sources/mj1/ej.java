package mj1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class ej extends g<float[]> {
    public int n3;
    public float[] y;

    public ej(float[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.y = bufferWithData;
        this.n3 = bufferWithData.length;
        n3(10);
    }

    @Override // mj1.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public float[] y() {
        float[] fArrCopyOf = Arrays.copyOf(this.y, gv());
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, newSize)");
        return fArrCopyOf;
    }

    @Override // mj1.g
    public int gv() {
        return this.n3;
    }

    @Override // mj1.g
    public void n3(int i) {
        float[] fArr = this.y;
        if (fArr.length < i) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, RangesKt.coerceAtLeast(i, fArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, newSize)");
            this.y = fArrCopyOf;
        }
    }

    public final void v(float f3) {
        g.zn(this, 0, 1, null);
        float[] fArr = this.y;
        int iGv = gv();
        this.n3 = iGv + 1;
        fArr[iGv] = f3;
    }
}
