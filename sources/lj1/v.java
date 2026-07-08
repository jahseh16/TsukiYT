package lj1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface v {

    public static final class y {
        public static <T> T y(v vVar, ij1.n3<T> deserializer) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return deserializer.deserialize(vVar);
        }
    }

    boolean d0();

    int fh(kj1.a aVar);

    <T> T i4(ij1.n3<T> n3Var);

    Void i9();

    double mt();

    String n();

    zn n3(kj1.a aVar);

    char r();

    int s();

    long t();

    v v(kj1.a aVar);

    float w();

    short xc();

    pj1.zn y();

    boolean z();

    byte z6();
}
