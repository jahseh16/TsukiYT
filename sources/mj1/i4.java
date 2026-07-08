package mj1;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lj1.zn;

/* JADX INFO: loaded from: classes.dex */
public abstract class i4<Element, Collection, Builder> extends y<Element, Collection, Builder> {
    public final ij1.zn<Element> y;

    public /* synthetic */ i4(ij1.zn znVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(znVar);
    }

    @Override // mj1.y
    public final void fb(lj1.zn decoder, Builder builder, int i, int i5) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (i5 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i8 = 0; i8 < i5; i8++) {
            s(decoder, i + i8, builder, false);
        }
    }

    @Override // ij1.zn, ij1.f, ij1.n3
    public abstract kj1.a getDescriptor();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mj1.y
    public void s(lj1.zn decoder, int i, Builder builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        wz(builder, i, zn.y.zn(decoder, getDescriptor(), i, this.y, null, 8, null));
    }

    @Override // ij1.f
    public void serialize(lj1.a encoder, Collection collection) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iV = v(collection);
        kj1.a descriptor = getDescriptor();
        lj1.gv gvVarT = encoder.t(descriptor, iV);
        Iterator<Element> itGv = gv(collection);
        for (int i = 0; i < iV; i++) {
            gvVarT.n(getDescriptor(), i, this.y, itGv.next());
        }
        gvVarT.zn(descriptor);
    }

    public abstract void wz(Builder builder, int i, Element element);

    public i4(ij1.zn<Element> znVar) {
        super(null);
        this.y = znVar;
    }
}
