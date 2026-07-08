package mj1;

import kotlin.UInt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q5 implements ij1.zn<UInt> {
    public static final q5 y = new q5();
    public static final kj1.a n3 = j5.y("kotlin.UInt", jj1.y.mg(IntCompanionObject.INSTANCE));

    @Override // ij1.n3
    public /* bridge */ /* synthetic */ Object deserialize(lj1.v vVar) {
        return UInt.m62boximpl(y(vVar));
    }

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return n3;
    }

    public void n3(lj1.a encoder, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.xc(getDescriptor()).mg(i);
    }

    @Override // ij1.f
    public /* bridge */ /* synthetic */ void serialize(lj1.a aVar, Object obj) {
        n3(aVar, ((UInt) obj).m67unboximpl());
    }

    public int y(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return UInt.m63constructorimpl(decoder.v(getDescriptor()).s());
    }
}
