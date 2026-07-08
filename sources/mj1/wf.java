package mj1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class wf extends bk<Short, short[], xb> implements ij1.zn<short[]> {
    public static final wf zn = new wf();

    public wf() {
        super(jj1.y.d(ShortCompanionObject.INSTANCE));
    }

    @Override // mj1.bk
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void r(lj1.gv encoder, short[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i; i5++) {
            encoder.s(getDescriptor(), i5, content[i5]);
        }
    }

    @Override // mj1.i4, mj1.y
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public void s(lj1.zn decoder, int i, xb builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.v(decoder.f3(getDescriptor(), i));
    }

    @Override // mj1.bk
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public short[] mt() {
        return new short[0];
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public xb f(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return new xb(sArr);
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: x4, reason: merged with bridge method [inline-methods] */
    public int v(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }
}
