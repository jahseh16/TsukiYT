package nj1;

import kj1.i9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z implements ij1.zn<co> {
    public static final z y = new z();
    public static final kj1.a n3 = kj1.c5.gv("kotlinx.serialization.json.JsonNull", i9.n3.y, new kj1.a[0], null, 8, null);

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return n3;
    }

    @Override // ij1.f
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public void serialize(lj1.a encoder, co value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        t.s(encoder);
        encoder.w();
    }

    @Override // ij1.n3
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public co deserialize(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        t.fb(decoder);
        if (decoder.d0()) {
            throw new oj1.f3("Expected 'null' literal");
        }
        decoder.i9();
        return co.f6955fb;
    }
}
