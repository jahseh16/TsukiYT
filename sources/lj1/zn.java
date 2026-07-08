package lj1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface zn {

    public static final class y {
        public static boolean n3(zn znVar) {
            return false;
        }

        public static int y(zn znVar, kj1.a descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return -1;
        }

        public static /* synthetic */ Object zn(zn znVar, kj1.a aVar, int i, ij1.n3 n3Var, Object obj, int i5, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i5 & 8) != 0) {
                obj = null;
            }
            return znVar.d(aVar, i, n3Var, obj);
        }
    }

    float a(kj1.a aVar, int i);

    double c(kj1.a aVar, int i);

    byte c5(kj1.a aVar, int i);

    int co(kj1.a aVar, int i);

    <T> T d(kj1.a aVar, int i, ij1.n3<T> n3Var, T t3);

    <T> T ej(kj1.a aVar, int i, ij1.n3<T> n3Var, T t3);

    v f(kj1.a aVar, int i);

    short f3(kj1.a aVar, int i);

    String mg(kj1.a aVar, int i);

    int p(kj1.a aVar);

    char rz(kj1.a aVar, int i);

    boolean ta(kj1.a aVar, int i);

    boolean tl();

    long wz(kj1.a aVar, int i);

    int x4(kj1.a aVar);

    pj1.zn y();

    void zn(kj1.a aVar);
}
