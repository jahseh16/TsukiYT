package mj1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lj1.zn;

/* JADX INFO: loaded from: classes.dex */
public abstract class ut<K, V, R> implements ij1.zn<R> {
    public final ij1.zn<V> n3;
    public final ij1.zn<K> y;

    public /* synthetic */ ut(ij1.zn znVar, ij1.zn znVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(znVar, znVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ij1.n3
    public R deserialize(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        lj1.zn znVarN3 = decoder.n3(getDescriptor());
        if (znVarN3.tl()) {
            return (R) zn(zn.y.zn(znVarN3, getDescriptor(), 0, this.y, null, 8, null), zn.y.zn(znVarN3, getDescriptor(), 1, this.n3, null, 8, null));
        }
        Object objZn = gq.y;
        Object objZn2 = gq.y;
        while (true) {
            int iX4 = znVarN3.x4(getDescriptor());
            if (iX4 == -1) {
                znVarN3.zn(getDescriptor());
                if (objZn == gq.y) {
                    throw new ij1.i9("Element 'key' is missing");
                }
                if (objZn2 != gq.y) {
                    return (R) zn(objZn, objZn2);
                }
                throw new ij1.i9("Element 'value' is missing");
            }
            if (iX4 == 0) {
                objZn = zn.y.zn(znVarN3, getDescriptor(), 0, this.y, null, 8, null);
            } else {
                if (iX4 != 1) {
                    throw new ij1.i9("Invalid index: " + iX4);
                }
                objZn2 = zn.y.zn(znVarN3, getDescriptor(), 1, this.n3, null, 8, null);
            }
        }
    }

    public abstract V n3(R r3);

    @Override // ij1.f
    public void serialize(lj1.a encoder, R r3) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        lj1.gv gvVarN3 = encoder.n3(getDescriptor());
        gvVarN3.n(getDescriptor(), 0, this.y, y(r3));
        gvVarN3.n(getDescriptor(), 1, this.n3, n3(r3));
        gvVarN3.zn(getDescriptor());
    }

    public abstract K y(R r3);

    public abstract R zn(K k3, V v6);

    public ut(ij1.zn<K> znVar, ij1.zn<V> znVar2) {
        this.y = znVar;
        this.n3 = znVar2;
    }
}
