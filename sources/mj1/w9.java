package mj1;

import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w9 implements ij1.zn<UByte> {
    public static final w9 y = new w9();
    public static final kj1.a n3 = j5.y("kotlin.UByte", jj1.y.c(ByteCompanionObject.INSTANCE));

    @Override // ij1.n3
    public /* bridge */ /* synthetic */ Object deserialize(lj1.v vVar) {
        return UByte.m40boximpl(y(vVar));
    }

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return n3;
    }

    public void n3(lj1.a encoder, byte b4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.xc(getDescriptor()).fb(b4);
    }

    @Override // ij1.f
    public /* bridge */ /* synthetic */ void serialize(lj1.a aVar, Object obj) {
        n3(aVar, ((UByte) obj).m45unboximpl());
    }

    public byte y(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return UByte.m41constructorimpl(decoder.v(getDescriptor()).z6());
    }
}
