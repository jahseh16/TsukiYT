package nj1;

import kotlin.jvm.internal.Intrinsics;
import oj1.f7;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0<T> implements ij1.zn<T> {
    private final ij1.zn<T> tSerializer;

    public d0(ij1.zn<T> tSerializer) {
        Intrinsics.checkNotNullParameter(tSerializer, "tSerializer");
        this.tSerializer = tSerializer;
    }

    @Override // ij1.n3
    public final T deserialize(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        fb fbVarGv = t.gv(decoder);
        return (T) fbVarGv.gv().gv(this.tSerializer, transformDeserialize(fbVarGv.fb()));
    }

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // ij1.f
    public final void serialize(lj1.a encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        tl tlVarV = t.v(encoder);
        tlVarV.i9(transformSerialize(f7.zn(tlVarV.gv(), value, this.tSerializer)));
    }

    public s transformDeserialize(s element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return element;
    }

    public s transformSerialize(s element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return element;
    }
}
