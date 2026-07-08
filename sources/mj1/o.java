package mj1;

import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o extends bk<Integer, int[], qn> implements ij1.zn<int[]> {
    public static final o zn = new o();

    public o() {
        super(jj1.y.mg(IntCompanionObject.INSTANCE));
    }

    @Override // mj1.bk
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void r(lj1.gv encoder, int[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i; i5++) {
            encoder.d(getDescriptor(), i5, content[i5]);
        }
    }

    @Override // mj1.i4, mj1.y
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public void s(lj1.zn decoder, int i, qn builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.v(decoder.co(getDescriptor(), i));
    }

    @Override // mj1.bk
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public int[] mt() {
        return new int[0];
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public qn f(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new qn(iArr);
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: x4, reason: merged with bridge method [inline-methods] */
    public int v(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }
}
