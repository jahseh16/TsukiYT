package mj1;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i2 implements ij1.zn<Unit> {
    public static final i2 n3 = new i2();
    public final /* synthetic */ ra<Unit> y = new ra<>("kotlin.Unit", Unit.INSTANCE);

    @Override // ij1.n3
    public /* bridge */ /* synthetic */ Object deserialize(lj1.v vVar) {
        y(vVar);
        return Unit.INSTANCE;
    }

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return this.y.getDescriptor();
    }

    @Override // ij1.f
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public void serialize(lj1.a encoder, Unit value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.y.serialize(encoder, value);
    }

    public void y(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.y.deserialize(decoder);
    }
}
