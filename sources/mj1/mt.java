package mj1;

import kj1.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class mt implements ij1.zn<Character> {
    public static final mt y = new mt();
    public static final kj1.a n3 = new y4("kotlin.Char", v.zn.y);

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return n3;
    }

    public void n3(lj1.a encoder, char c) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.c(c);
    }

    @Override // ij1.f
    public /* bridge */ /* synthetic */ void serialize(lj1.a aVar, Object obj) {
        n3(aVar, ((Character) obj).charValue());
    }

    @Override // ij1.n3
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Character deserialize(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Character.valueOf(decoder.r());
    }
}
