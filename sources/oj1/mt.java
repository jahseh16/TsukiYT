package oj1;

import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class mt extends f {
    public final boolean zn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt(hw writer, boolean z) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.zn = z;
    }

    @Override // oj1.f
    public void c5(long j) {
        boolean z = this.zn;
        long jM85constructorimpl = ULong.m85constructorimpl(j);
        if (z) {
            tl(w.y(jM85constructorimpl, 10));
        } else {
            i9(p.y(jM85constructorimpl, 10));
        }
    }

    @Override // oj1.f
    public void f(short s3) {
        boolean z = this.zn;
        String strM110toStringimpl = UShort.m110toStringimpl(UShort.m107constructorimpl(s3));
        if (z) {
            tl(strM110toStringimpl);
        } else {
            i9(strM110toStringimpl);
        }
    }

    @Override // oj1.f
    public void gv(byte b4) {
        boolean z = this.zn;
        String strM44toStringimpl = UByte.m44toStringimpl(UByte.m41constructorimpl(b4));
        if (z) {
            tl(strM44toStringimpl);
        } else {
            i9(strM44toStringimpl);
        }
    }

    @Override // oj1.f
    public void s(int i) {
        boolean z = this.zn;
        int iM63constructorimpl = UInt.m63constructorimpl(i);
        if (z) {
            tl(Long.toString(((long) iM63constructorimpl) & 4294967295L, 10));
        } else {
            i9(Long.toString(((long) iM63constructorimpl) & 4294967295L, 10));
        }
    }
}
