package mj1;

import java.util.Arrays;
import kotlin.UIntArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class w2 extends g<UIntArray> {
    public int n3;
    public int[] y;

    public /* synthetic */ w2(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    public int[] a() {
        int[] iArrCopyOf = Arrays.copyOf(this.y, gv());
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
        return UIntArray.m70constructorimpl(iArrCopyOf);
    }

    @Override // mj1.g
    public int gv() {
        return this.n3;
    }

    @Override // mj1.g
    public void n3(int i) {
        if (UIntArray.m75getSizeimpl(this.y) < i) {
            int[] iArr = this.y;
            int[] iArrCopyOf = Arrays.copyOf(iArr, RangesKt.coerceAtLeast(i, UIntArray.m75getSizeimpl(iArr) * 2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.y = UIntArray.m70constructorimpl(iArrCopyOf);
        }
    }

    public final void v(int i) {
        g.zn(this, 0, 1, null);
        int[] iArr = this.y;
        int iGv = gv();
        this.n3 = iGv + 1;
        UIntArray.m79setVXSXFK8(iArr, iGv, i);
    }

    @Override // mj1.g
    public /* bridge */ /* synthetic */ UIntArray y() {
        return UIntArray.m68boximpl(a());
    }

    public w2(int[] iArr) {
        this.y = iArr;
        this.n3 = UIntArray.m75getSizeimpl(iArr);
        n3(10);
    }
}
