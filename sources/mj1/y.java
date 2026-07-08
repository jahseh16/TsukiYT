package mj1;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class y<Element, Collection, Builder> implements ij1.zn<Collection> {
    public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void c5(y yVar, lj1.zn znVar, int i, Object obj, boolean z, int i5, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i5 & 8) != 0) {
            z = true;
        }
        yVar.s(znVar, i, obj, z);
    }

    public final Collection a(lj1.v decoder, Collection collection) {
        Builder builderY;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (collection == null || (builderY = f(collection)) == null) {
            builderY = y();
        }
        int iN3 = n3(builderY);
        lj1.zn znVarN3 = decoder.n3(getDescriptor());
        if (!znVarN3.tl()) {
            while (true) {
                int iX4 = znVarN3.x4(getDescriptor());
                if (iX4 == -1) {
                    break;
                }
                c5(this, znVarN3, iN3 + iX4, builderY, false, 8, null);
            }
        } else {
            fb(znVarN3, builderY, iN3, i9(znVarN3, builderY));
        }
        znVarN3.zn(getDescriptor());
        return t(builderY);
    }

    public Collection deserialize(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return a(decoder, null);
    }

    public abstract Builder f(Collection collection);

    public abstract void fb(lj1.zn znVar, Builder builder, int i, int i5);

    public abstract Iterator<Element> gv(Collection collection);

    public final int i9(lj1.zn znVar, Builder builder) {
        int iP = znVar.p(getDescriptor());
        zn(builder, iP);
        return iP;
    }

    public abstract int n3(Builder builder);

    public abstract void s(lj1.zn znVar, int i, Builder builder, boolean z);

    public abstract Collection t(Builder builder);

    public abstract int v(Collection collection);

    public abstract Builder y();

    public abstract void zn(Builder builder, int i);

    public y() {
    }
}
