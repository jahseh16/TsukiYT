package yj1;

import kotlin.jvm.internal.Intrinsics;
import sj1.i4;
import sj1.mg;

/* JADX INFO: loaded from: classes.dex */
public final class s extends mg {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final hk1.fb f9328fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f9329v;
    public final String y;

    public s(String str, long j, hk1.fb source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.y = str;
        this.f9329v = j;
        this.f9328fb = source;
    }

    @Override // sj1.mg
    public long contentLength() {
        return this.f9329v;
    }

    @Override // sj1.mg
    public i4 contentType() {
        String str = this.y;
        if (str == null) {
            return null;
        }
        return i4.f7949v.n3(str);
    }

    @Override // sj1.mg
    public hk1.fb source() {
        return this.f9328fb;
    }
}
