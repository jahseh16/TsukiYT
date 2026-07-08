package mj1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes.dex */
public final class nf<T> implements ij1.zn<T> {
    public final kj1.a n3;
    public final ij1.zn<T> y;

    public nf(ij1.zn<T> serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.y = serializer;
        this.n3 = new pq(serializer.getDescriptor());
    }

    @Override // ij1.n3
    public T deserialize(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.d0() ? (T) decoder.i4(this.y) : (T) decoder.i9();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(nf.class), Reflection.getOrCreateKotlinClass(obj.getClass())) && Intrinsics.areEqual(this.y, ((nf) obj).y);
    }

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return this.n3;
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    @Override // ij1.f
    public void serialize(lj1.a encoder, T t3) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (t3 == null) {
            encoder.w();
        } else {
            encoder.d0();
            encoder.c5(this.y, t3);
        }
    }
}
