package lj1;

import ij1.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    void a(double d4);

    void c(char c);

    <T> void c5(f<? super T> fVar, T t3);

    void d0();

    void f3(float f3);

    void fb(byte b4);

    void mg(int i);

    gv n3(kj1.a aVar);

    void p(short s3);

    void r(kj1.a aVar, int i);

    gv t(kj1.a aVar, int i);

    void w();

    void wz(long j);

    a xc(kj1.a aVar);

    pj1.zn y();

    void z(boolean z);

    void z6(String str);

    public static final class y {
        /* JADX WARN: Multi-variable type inference failed */
        public static <T> void gv(a aVar, f<? super T> serializer, T t3) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            serializer.serialize(aVar, t3);
        }

        public static gv y(a aVar, kj1.a descriptor, int i) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return aVar.n3(descriptor);
        }

        public static <T> void zn(a aVar, f<? super T> serializer, T t3) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            if (serializer.getDescriptor().n3()) {
                aVar.c5(serializer, t3);
            } else if (t3 == null) {
                aVar.w();
            } else {
                aVar.d0();
                aVar.c5(serializer, t3);
            }
        }

        public static void n3(a aVar) {
        }
    }
}
