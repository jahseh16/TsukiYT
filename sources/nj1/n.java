package nj1;

import kj1.v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import oj1.fh;

/* JADX INFO: loaded from: classes.dex */
public final class n implements ij1.zn<f3> {
    public static final n y = new n();
    public static final kj1.a n3 = kj1.c5.gv("kotlinx.serialization.json.JsonPrimitive", v.c5.y, new kj1.a[0], null, 8, null);

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return n3;
    }

    @Override // ij1.f
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public void serialize(lj1.a encoder, f3 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        t.s(encoder);
        if (value instanceof co) {
            encoder.c5(z.y, co.f6955fb);
        } else {
            encoder.c5(p.y, (w) value);
        }
    }

    @Override // ij1.n3
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public f3 deserialize(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        s sVarFb = t.gv(decoder).fb();
        if (sVarFb instanceof f3) {
            return (f3) sVarFb;
        }
        throw fh.a(-1, "Unexpected JSON element, expected JsonPrimitive, had " + Reflection.getOrCreateKotlinClass(sVarFb.getClass()), sVarFb.toString());
    }
}
