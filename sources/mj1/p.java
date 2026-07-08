package mj1;

import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p extends bk<Character, char[], w> implements ij1.zn<char[]> {
    public static final p zn = new p();

    public p() {
        super(jj1.y.d0(CharCompanionObject.INSTANCE));
    }

    @Override // mj1.bk
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void r(lj1.gv encoder, char[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i5 = 0; i5 < i; i5++) {
            encoder.f(getDescriptor(), i5, content[i5]);
        }
    }

    @Override // mj1.i4, mj1.y
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public void s(lj1.zn decoder, int i, w builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.v(decoder.rz(getDescriptor(), i));
    }

    @Override // mj1.bk
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public char[] mt() {
        return new char[0];
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public w f(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new w(cArr);
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: x4, reason: merged with bridge method [inline-methods] */
    public int v(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }
}
