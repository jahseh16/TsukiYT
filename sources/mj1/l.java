package mj1;

import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lj1.zn;

/* JADX INFO: loaded from: classes.dex */
public final class l<A, B, C> implements ij1.zn<Triple<? extends A, ? extends B, ? extends C>> {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final kj1.a f6506gv;
    public final ij1.zn<B> n3;
    public final ij1.zn<A> y;
    public final ij1.zn<C> zn;

    public static final class y extends Lambda implements Function1<kj1.y, Unit> {
        final /* synthetic */ l<A, B, C> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(l<A, B, C> lVar) {
            super(1);
            this.this$0 = lVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(kj1.y yVar) {
            y(yVar);
            return Unit.INSTANCE;
        }

        public final void y(kj1.y buildClassSerialDescriptor) {
            Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
            kj1.y.n3(buildClassSerialDescriptor, "first", this.this$0.y.getDescriptor(), null, false, 12, null);
            kj1.y.n3(buildClassSerialDescriptor, "second", this.this$0.n3.getDescriptor(), null, false, 12, null);
            kj1.y.n3(buildClassSerialDescriptor, "third", this.this$0.zn.getDescriptor(), null, false, 12, null);
        }
    }

    public l(ij1.zn<A> aSerializer, ij1.zn<B> bSerializer, ij1.zn<C> cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        this.y = aSerializer;
        this.n3 = bSerializer;
        this.zn = cSerializer;
        this.f6506gv = kj1.c5.n3("kotlin.Triple", new kj1.a[0], new y(this));
    }

    @Override // ij1.n3
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Triple<A, B, C> deserialize(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        lj1.zn znVarN3 = decoder.n3(getDescriptor());
        return znVarN3.tl() ? gv(znVarN3) : v(znVarN3);
    }

    @Override // ij1.f
    /* JADX INFO: renamed from: fb, reason: merged with bridge method [inline-methods] */
    public void serialize(lj1.a encoder, Triple<? extends A, ? extends B, ? extends C> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        lj1.gv gvVarN3 = encoder.n3(getDescriptor());
        gvVarN3.n(getDescriptor(), 0, this.y, value.getFirst());
        gvVarN3.n(getDescriptor(), 1, this.n3, value.getSecond());
        gvVarN3.n(getDescriptor(), 2, this.zn, value.getThird());
        gvVarN3.zn(getDescriptor());
    }

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return this.f6506gv;
    }

    public final Triple<A, B, C> gv(lj1.zn znVar) {
        Object objZn = zn.y.zn(znVar, getDescriptor(), 0, this.y, null, 8, null);
        Object objZn2 = zn.y.zn(znVar, getDescriptor(), 1, this.n3, null, 8, null);
        Object objZn3 = zn.y.zn(znVar, getDescriptor(), 2, this.zn, null, 8, null);
        znVar.zn(getDescriptor());
        return new Triple<>(objZn, objZn2, objZn3);
    }

    public final Triple<A, B, C> v(lj1.zn znVar) {
        Object objZn = gq.y;
        Object objZn2 = gq.y;
        Object objZn3 = gq.y;
        while (true) {
            int iX4 = znVar.x4(getDescriptor());
            if (iX4 == -1) {
                znVar.zn(getDescriptor());
                if (objZn == gq.y) {
                    throw new ij1.i9("Element 'first' is missing");
                }
                if (objZn2 == gq.y) {
                    throw new ij1.i9("Element 'second' is missing");
                }
                if (objZn3 != gq.y) {
                    return new Triple<>(objZn, objZn2, objZn3);
                }
                throw new ij1.i9("Element 'third' is missing");
            }
            if (iX4 == 0) {
                objZn = zn.y.zn(znVar, getDescriptor(), 0, this.y, null, 8, null);
            } else if (iX4 == 1) {
                objZn2 = zn.y.zn(znVar, getDescriptor(), 1, this.n3, null, 8, null);
            } else {
                if (iX4 != 2) {
                    throw new ij1.i9("Unexpected index " + iX4);
                }
                objZn3 = zn.y.zn(znVar, getDescriptor(), 2, this.zn, null, 8, null);
            }
        }
    }
}
