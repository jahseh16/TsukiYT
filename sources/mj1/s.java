package mj1;

import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s extends bk<Boolean, boolean[], fb> implements ij1.zn<boolean[]> {
    public static final s zn = new s();

    public s() {
        super(jj1.y.n(BooleanCompanionObject.INSTANCE));
    }

    @Override // mj1.bk
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void r(lj1.gv encoder, boolean[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i; i5++) {
            encoder.tl(getDescriptor(), i5, content[i5]);
        }
    }

    @Override // mj1.i4, mj1.y
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public void s(lj1.zn decoder, int i, fb builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.v(decoder.ta(getDescriptor(), i));
    }

    @Override // mj1.bk
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public boolean[] mt() {
        return new boolean[0];
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public fb f(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new fb(zArr);
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: x4, reason: merged with bridge method [inline-methods] */
    public int v(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }
}
