package kw;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import rw.zn;
import uw.n3;

/* JADX INFO: loaded from: classes.dex */
public final class a implements zn, n3 {
    public final /* synthetic */ pw.n3 n3 = pw.n3.n3;
    public final Lazy zn = LazyKt.lazy(new gv());

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Lazy f6088gv = LazyKt.lazy(new v());

    public static final qw.n3 f() {
        return qw.n3.y;
    }

    public static final y i9() {
        return new y();
    }

    public String a(uw.y fileType, String originName) {
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(originName, "originName");
        return this.n3.a(fileType, originName);
    }

    @Override // rw.zn
    public rw.n3 fb() {
        return (rw.n3) this.zn.getValue();
    }

    @Override // rw.zn
    public rw.n3 gv(byte b4) {
        return new fb(b4);
    }

    @Override // rw.zn
    public rw.n3 n3() {
        return (rw.n3) this.f6088gv.getValue();
    }

    @Override // rw.zn
    public rw.y v(tw.y codeMap) {
        Intrinsics.checkNotNullParameter(codeMap, "codeMap");
        return new ow.y(codeMap.getKey(), codeMap.getValue());
    }

    public Map<String, String> y() {
        return this.n3.y();
    }

    public String zn(uw.y fileType, String originName) {
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(originName, "originName");
        return this.n3.zn(fileType, originName);
    }
}
