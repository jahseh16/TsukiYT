package mj1;

import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ix extends bk<UShort, UShortArray, ro> implements ij1.zn<UShortArray> {
    public static final ix zn = new ix();

    public ix() {
        super(jj1.y.i4(UShort.Companion));
    }

    public void c(lj1.gv encoder, short[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i; i5++) {
            encoder.ta(getDescriptor(), i5).p(UShortArray.m118getMh2AYeg(content, i5));
        }
    }

    @Override // mj1.y
    public /* bridge */ /* synthetic */ Object f(Object obj) {
        return n(((UShortArray) obj).m126unboximpl());
    }

    @Override // mj1.i4, mj1.y
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public void s(lj1.zn decoder, int i, ro builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.v(UShort.m107constructorimpl(decoder.f(getDescriptor(), i).xc()));
    }

    public short[] i4() {
        return UShortArray.m113constructorimpl(0);
    }

    @Override // mj1.bk
    public /* bridge */ /* synthetic */ UShortArray mt() {
        return UShortArray.m112boximpl(i4());
    }

    public ro n(short[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new ro(toBuilder, null);
    }

    @Override // mj1.bk
    public /* bridge */ /* synthetic */ void r(lj1.gv gvVar, UShortArray uShortArray, int i) {
        c(gvVar, uShortArray.m126unboximpl(), i);
    }

    @Override // mj1.y
    public /* bridge */ /* synthetic */ int v(Object obj) {
        return x4(((UShortArray) obj).m126unboximpl());
    }

    public int x4(short[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UShortArray.m119getSizeimpl(collectionSize);
    }
}
