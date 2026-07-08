package mj1;

import kotlin.jvm.internal.Intrinsics;
import mj1.x;

/* JADX INFO: loaded from: classes.dex */
public final class j5 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class y<T> implements x<T> {
        public final /* synthetic */ ij1.zn<T> y;

        public y(ij1.zn<T> znVar) {
            this.y = znVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // mj1.x
        public ij1.zn<?>[] childSerializers() {
            return new ij1.zn[]{this.y};
        }

        @Override // ij1.n3
        public T deserialize(lj1.v decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // ij1.zn, ij1.f, ij1.n3
        public kj1.a getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        @Override // ij1.f
        public void serialize(lj1.a encoder, T t3) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // mj1.x
        public ij1.zn<?>[] typeParametersSerializers() {
            return x.y.y(this);
        }
    }

    public static final <T> kj1.a y(String name, ij1.zn<T> primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new hw(name, new y(primitiveSerializer));
    }
}
