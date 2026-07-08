package mj1;

import java.util.Arrays;
import kotlin.UShortArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class ro extends g<UShortArray> {
    public int n3;
    public short[] y;

    public /* synthetic */ ro(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    public short[] a() {
        short[] sArrCopyOf = Arrays.copyOf(this.y, gv());
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(this, newSize)");
        return UShortArray.m114constructorimpl(sArrCopyOf);
    }

    @Override // mj1.g
    public int gv() {
        return this.n3;
    }

    @Override // mj1.g
    public void n3(int i) {
        if (UShortArray.m119getSizeimpl(this.y) < i) {
            short[] sArr = this.y;
            short[] sArrCopyOf = Arrays.copyOf(sArr, RangesKt.coerceAtLeast(i, UShortArray.m119getSizeimpl(sArr) * 2));
            Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(this, newSize)");
            this.y = UShortArray.m114constructorimpl(sArrCopyOf);
        }
    }

    public final void v(short s3) {
        g.zn(this, 0, 1, null);
        short[] sArr = this.y;
        int iGv = gv();
        this.n3 = iGv + 1;
        UShortArray.m123set01HTLdE(sArr, iGv, s3);
    }

    @Override // mj1.g
    public /* bridge */ /* synthetic */ UShortArray y() {
        return UShortArray.m112boximpl(a());
    }

    public ro(short[] sArr) {
        this.y = sArr;
        this.n3 = UShortArray.m119getSizeimpl(sArr);
        n3(10);
    }
}
