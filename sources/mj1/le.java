package mj1;

import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class le extends bk<ULong, ULongArray, mp> implements ij1.zn<ULongArray> {
    public static final le zn = new le();

    public le() {
        super(jj1.y.x4(ULong.Companion));
    }

    public void c(lj1.gv encoder, long[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i; i5++) {
            encoder.ta(getDescriptor(), i5).wz(ULongArray.m96getsVKNKU(content, i5));
        }
    }

    @Override // mj1.y
    public /* bridge */ /* synthetic */ Object f(Object obj) {
        return n(((ULongArray) obj).m104unboximpl());
    }

    @Override // mj1.i4, mj1.y
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public void s(lj1.zn decoder, int i, mp builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.v(ULong.m85constructorimpl(decoder.f(getDescriptor(), i).t()));
    }

    public long[] i4() {
        return ULongArray.m91constructorimpl(0);
    }

    @Override // mj1.bk
    public /* bridge */ /* synthetic */ ULongArray mt() {
        return ULongArray.m90boximpl(i4());
    }

    public mp n(long[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new mp(toBuilder, null);
    }

    @Override // mj1.bk
    public /* bridge */ /* synthetic */ void r(lj1.gv gvVar, ULongArray uLongArray, int i) {
        c(gvVar, uLongArray.m104unboximpl(), i);
    }

    @Override // mj1.y
    public /* bridge */ /* synthetic */ int v(Object obj) {
        return x4(((ULongArray) obj).m104unboximpl());
    }

    public int x4(long[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return ULongArray.m97getSizeimpl(collectionSize);
    }
}
