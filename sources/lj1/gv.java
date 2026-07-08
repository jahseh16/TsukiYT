package lj1;

import ij1.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface gv {

    public static final class y {
        public static boolean y(gv gvVar, kj1.a descriptor, int i) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return true;
        }
    }

    boolean co(kj1.a aVar, int i);

    void d(kj1.a aVar, int i, int i5);

    void f(kj1.a aVar, int i, char c);

    void fh(kj1.a aVar, int i, float f3);

    <T> void i4(kj1.a aVar, int i, f<? super T> fVar, T t3);

    void mt(kj1.a aVar, int i, long j);

    <T> void n(kj1.a aVar, int i, f<? super T> fVar, T t3);

    void rz(kj1.a aVar, int i, byte b4);

    void s(kj1.a aVar, int i, short s3);

    a ta(kj1.a aVar, int i);

    void tl(kj1.a aVar, int i, boolean z);

    void v(kj1.a aVar, int i, String str);

    void x4(kj1.a aVar, int i, double d4);

    void zn(kj1.a aVar);
}
