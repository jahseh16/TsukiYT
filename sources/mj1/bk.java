package mj1;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import mj1.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class bk<Element, Array, Builder extends g<Array>> extends i4<Element, Array, Builder> {
    public final kj1.a n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(ij1.zn<Element> primitiveSerializer) {
        super(primitiveSerializer, null);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.n3 = new u0(primitiveSerializer.getDescriptor());
    }

    @Override // mj1.i4
    /* JADX INFO: renamed from: co, reason: merged with bridge method [inline-methods] */
    public final void wz(Builder builder, int i, Element element) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // mj1.y, ij1.n3
    public final Array deserialize(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return a(decoder, null);
    }

    @Override // mj1.i4, ij1.zn, ij1.f, ij1.n3
    public final kj1.a getDescriptor() {
        return this.n3;
    }

    @Override // mj1.y
    public final Iterator<Element> gv(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    public abstract Array mt();

    @Override // mj1.y
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void zn(Builder builder, int i) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.n3(i);
    }

    public abstract void r(lj1.gv gvVar, Array array, int i);

    @Override // mj1.i4, ij1.f
    public final void serialize(lj1.a encoder, Array array) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iV = v(array);
        kj1.a aVar = this.n3;
        lj1.gv gvVarT = encoder.t(aVar, iV);
        r(gvVarT, array, iV);
        gvVarT.zn(aVar);
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final int n3(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        return builder.gv();
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: xc, reason: merged with bridge method [inline-methods] */
    public final Builder y() {
        return f(mt());
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final Array t(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        return (Array) builder.y();
    }
}
