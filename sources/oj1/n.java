package oj1;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public boolean n3;
    public final mj1.ta y;

    public /* synthetic */ class y extends FunctionReferenceImpl implements Function2<kj1.a, Integer, Boolean> {
        public y(Object obj) {
            super(2, obj, n.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(kj1.a aVar, Integer num) {
            return y(aVar, num.intValue());
        }

        public final Boolean y(kj1.a p0, int i) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Boolean.valueOf(((n) this.receiver).v(p0, i));
        }
    }

    public n(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.y = new mj1.ta(descriptor, new y(this));
    }

    public final int gv() {
        return this.y.gv();
    }

    public final boolean n3() {
        return this.n3;
    }

    public final boolean v(kj1.a aVar, int i) {
        boolean z = !aVar.c5(i) && aVar.fb(i).n3();
        this.n3 = z;
        return z;
    }

    public final void zn(int i) {
        this.y.y(i);
    }
}
