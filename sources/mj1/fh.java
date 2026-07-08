package mj1;

import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fh extends bk<Double, double[], d0> implements ij1.zn<double[]> {
    public static final fh zn = new fh();

    public fh() {
        super(jj1.y.fh(DoubleCompanionObject.INSTANCE));
    }

    @Override // mj1.bk
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void r(lj1.gv encoder, double[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i; i5++) {
            encoder.x4(getDescriptor(), i5, content[i5]);
        }
    }

    @Override // mj1.i4, mj1.y
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public void s(lj1.zn decoder, int i, d0 builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.v(decoder.c(getDescriptor(), i));
    }

    @Override // mj1.bk
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public double[] mt() {
        return new double[0];
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public d0 f(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new d0(dArr);
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: x4, reason: merged with bridge method [inline-methods] */
    public int v(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }
}
