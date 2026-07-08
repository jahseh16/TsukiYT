package mj1;

import java.util.Arrays;
import kotlin.ULongArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class mp extends g<ULongArray> {
    public int n3;
    public long[] y;

    public /* synthetic */ mp(long[] jArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }

    public long[] a() {
        long[] jArrCopyOf = Arrays.copyOf(this.y, gv());
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
        return ULongArray.m92constructorimpl(jArrCopyOf);
    }

    @Override // mj1.g
    public int gv() {
        return this.n3;
    }

    @Override // mj1.g
    public void n3(int i) {
        if (ULongArray.m97getSizeimpl(this.y) < i) {
            long[] jArr = this.y;
            long[] jArrCopyOf = Arrays.copyOf(jArr, RangesKt.coerceAtLeast(i, ULongArray.m97getSizeimpl(jArr) * 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.y = ULongArray.m92constructorimpl(jArrCopyOf);
        }
    }

    public final void v(long j) {
        g.zn(this, 0, 1, null);
        long[] jArr = this.y;
        int iGv = gv();
        this.n3 = iGv + 1;
        ULongArray.m101setk8EXiF4(jArr, iGv, j);
    }

    @Override // mj1.g
    public /* bridge */ /* synthetic */ ULongArray y() {
        return ULongArray.m90boximpl(a());
    }

    public mp(long[] jArr) {
        this.y = jArr;
        this.n3 = ULongArray.m97getSizeimpl(jArr);
        n3(10);
    }
}
