package nj1;

import kj1.v;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.UStringsKt;
import oj1.fh;

/* JADX INFO: loaded from: classes.dex */
public final class p implements ij1.zn<w> {
    public static final p y = new p();
    public static final kj1.a n3 = kj1.c5.y("kotlinx.serialization.json.JsonLiteral", v.c5.y);

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return n3;
    }

    @Override // ij1.f
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public void serialize(lj1.a encoder, w value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        t.s(encoder);
        if (value.zn()) {
            encoder.z6(value.y());
            return;
        }
        Long lWz = i9.wz(value);
        if (lWz != null) {
            encoder.wz(lWz.longValue());
            return;
        }
        ULong uLongOrNull = UStringsKt.toULongOrNull(value.y());
        if (uLongOrNull != null) {
            encoder.xc(jj1.y.x4(ULong.Companion).getDescriptor()).wz(uLongOrNull.m89unboximpl());
            return;
        }
        Double dS = i9.s(value);
        if (dS != null) {
            encoder.a(dS.doubleValue());
            return;
        }
        Boolean boolV = i9.v(value);
        if (boolV != null) {
            encoder.z(boolV.booleanValue());
        } else {
            encoder.z6(value.y());
        }
    }

    @Override // ij1.n3
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public w deserialize(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        s sVarFb = t.gv(decoder).fb();
        if (sVarFb instanceof w) {
            return (w) sVarFb;
        }
        throw fh.a(-1, "Unexpected JSON element, expected JsonLiteral, had " + Reflection.getOrCreateKotlinClass(sVarFb.getClass()), sVarFb.toString());
    }
}
