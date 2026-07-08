package mj1;

import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ud extends bk<Float, float[], ej> implements ij1.zn<float[]> {
    public static final ud zn = new ud();

    public ud() {
        super(jj1.y.rz(FloatCompanionObject.INSTANCE));
    }

    @Override // mj1.bk
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void r(lj1.gv encoder, float[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i; i5++) {
            encoder.fh(getDescriptor(), i5, content[i5]);
        }
    }

    @Override // mj1.i4, mj1.y
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public void s(lj1.zn decoder, int i, ej builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.v(decoder.a(getDescriptor(), i));
    }

    @Override // mj1.bk
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public float[] mt() {
        return new float[0];
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ej f(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new ej(fArr);
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: x4, reason: merged with bridge method [inline-methods] */
    public int v(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }
}
