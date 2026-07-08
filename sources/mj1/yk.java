package mj1;

import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class yk implements ij1.zn<UShort> {
    public static final yk y = new yk();
    public static final kj1.a n3 = j5.y("kotlin.UShort", jj1.y.d(ShortCompanionObject.INSTANCE));

    @Override // ij1.n3
    public /* bridge */ /* synthetic */ Object deserialize(lj1.v vVar) {
        return UShort.m106boximpl(y(vVar));
    }

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return n3;
    }

    public void n3(lj1.a encoder, short s3) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.xc(getDescriptor()).p(s3);
    }

    @Override // ij1.f
    public /* bridge */ /* synthetic */ void serialize(lj1.a aVar, Object obj) {
        n3(aVar, ((UShort) obj).m111unboximpl());
    }

    public short y(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return UShort.m107constructorimpl(decoder.v(getDescriptor()).xc());
    }
}
