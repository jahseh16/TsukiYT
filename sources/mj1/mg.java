package mj1;

import kj1.v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* JADX INFO: loaded from: classes.dex */
public final class mg implements ij1.zn<Duration> {
    public static final mg y = new mg();
    public static final kj1.a n3 = new y4("kotlin.time.Duration", v.c5.y);

    @Override // ij1.n3
    public /* bridge */ /* synthetic */ Object deserialize(lj1.v vVar) {
        return Duration.m134boximpl(y(vVar));
    }

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return n3;
    }

    public void n3(lj1.a encoder, long j) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.z6(Duration.m159toIsoStringimpl(j));
    }

    @Override // ij1.f
    public /* bridge */ /* synthetic */ void serialize(lj1.a aVar, Object obj) {
        n3(aVar, ((Duration) obj).m164unboximpl());
    }

    public long y(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Duration.Companion.m168parseIsoStringUwyO8pc(decoder.n());
    }
}
