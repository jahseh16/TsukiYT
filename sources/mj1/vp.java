package mj1;

import java.util.Arrays;
import kotlin.UByteArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class vp extends g<UByteArray> {
    public int n3;
    public byte[] y;

    public /* synthetic */ vp(byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }

    public byte[] a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.y, gv());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
        return UByteArray.m48constructorimpl(bArrCopyOf);
    }

    @Override // mj1.g
    public int gv() {
        return this.n3;
    }

    @Override // mj1.g
    public void n3(int i) {
        if (UByteArray.m53getSizeimpl(this.y) < i) {
            byte[] bArr = this.y;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, RangesKt.coerceAtLeast(i, UByteArray.m53getSizeimpl(bArr) * 2));
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
            this.y = UByteArray.m48constructorimpl(bArrCopyOf);
        }
    }

    public final void v(byte b4) {
        g.zn(this, 0, 1, null);
        byte[] bArr = this.y;
        int iGv = gv();
        this.n3 = iGv + 1;
        UByteArray.m57setVurrAj0(bArr, iGv, b4);
    }

    @Override // mj1.g
    public /* bridge */ /* synthetic */ UByteArray y() {
        return UByteArray.m46boximpl(a());
    }

    public vp(byte[] bArr) {
        this.y = bArr;
        this.n3 = UByteArray.m53getSizeimpl(bArr);
        n3(10);
    }
}
