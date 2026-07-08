package mj1;

import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x5 extends bk<UInt, UIntArray, w2> implements ij1.zn<UIntArray> {
    public static final x5 zn = new x5();

    public x5() {
        super(jj1.y.r(UInt.Companion));
    }

    public void c(lj1.gv encoder, int[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i; i5++) {
            encoder.ta(getDescriptor(), i5).mg(UIntArray.m74getpVg5ArA(content, i5));
        }
    }

    @Override // mj1.y
    public /* bridge */ /* synthetic */ Object f(Object obj) {
        return n(((UIntArray) obj).m82unboximpl());
    }

    @Override // mj1.i4, mj1.y
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public void s(lj1.zn decoder, int i, w2 builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.v(UInt.m63constructorimpl(decoder.f(getDescriptor(), i).s()));
    }

    public int[] i4() {
        return UIntArray.m69constructorimpl(0);
    }

    @Override // mj1.bk
    public /* bridge */ /* synthetic */ UIntArray mt() {
        return UIntArray.m68boximpl(i4());
    }

    public w2 n(int[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new w2(toBuilder, null);
    }

    @Override // mj1.bk
    public /* bridge */ /* synthetic */ void r(lj1.gv gvVar, UIntArray uIntArray, int i) {
        c(gvVar, uIntArray.m82unboximpl(), i);
    }

    @Override // mj1.y
    public /* bridge */ /* synthetic */ int v(Object obj) {
        return x4(((UIntArray) obj).m82unboximpl());
    }

    public int x4(int[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UIntArray.m75getSizeimpl(collectionSize);
    }
}
