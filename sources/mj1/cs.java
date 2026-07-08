package mj1;

import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class cs implements ij1.zn<ULong> {
    public static final cs y = new cs();
    public static final kj1.a n3 = j5.y("kotlin.ULong", jj1.y.ta(LongCompanionObject.INSTANCE));

    @Override // ij1.n3
    public /* bridge */ /* synthetic */ Object deserialize(lj1.v vVar) {
        return ULong.m84boximpl(y(vVar));
    }

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return n3;
    }

    public void n3(lj1.a encoder, long j) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.xc(getDescriptor()).wz(j);
    }

    @Override // ij1.f
    public /* bridge */ /* synthetic */ void serialize(lj1.a aVar, Object obj) {
        n3(aVar, ((ULong) obj).m89unboximpl());
    }

    public long y(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return ULong.m85constructorimpl(decoder.v(getDescriptor()).t());
    }
}
