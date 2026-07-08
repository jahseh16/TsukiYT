package mj1;

import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class oa extends bk<UByte, UByteArray, vp> implements ij1.zn<UByteArray> {
    public static final oa zn = new oa();

    public oa() {
        super(jj1.y.z(UByte.Companion));
    }

    public void c(lj1.gv encoder, byte[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i; i5++) {
            encoder.ta(getDescriptor(), i5).fb(UByteArray.m52getw2LRezQ(content, i5));
        }
    }

    @Override // mj1.y
    public /* bridge */ /* synthetic */ Object f(Object obj) {
        return n(((UByteArray) obj).m60unboximpl());
    }

    @Override // mj1.i4, mj1.y
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public void s(lj1.zn decoder, int i, vp builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.v(UByte.m41constructorimpl(decoder.f(getDescriptor(), i).z6()));
    }

    public byte[] i4() {
        return UByteArray.m47constructorimpl(0);
    }

    @Override // mj1.bk
    public /* bridge */ /* synthetic */ UByteArray mt() {
        return UByteArray.m46boximpl(i4());
    }

    public vp n(byte[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new vp(toBuilder, null);
    }

    @Override // mj1.bk
    public /* bridge */ /* synthetic */ void r(lj1.gv gvVar, UByteArray uByteArray, int i) {
        c(gvVar, uByteArray.m60unboximpl(), i);
    }

    @Override // mj1.y
    public /* bridge */ /* synthetic */ int v(Object obj) {
        return x4(((UByteArray) obj).m60unboximpl());
    }

    public int x4(byte[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UByteArray.m53getSizeimpl(collectionSize);
    }
}
