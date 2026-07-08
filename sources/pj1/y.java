package pj1;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    public static final class n3 extends y {
        public final Function1<List<? extends ij1.zn<?>>, ij1.zn<?>> y;

        public final Function1<List<? extends ij1.zn<?>>, ij1.zn<?>> n3() {
            return this.y;
        }

        @Override // pj1.y
        public ij1.zn<?> y(List<? extends ij1.zn<?>> typeArgumentsSerializers) {
            Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.y.invoke(typeArgumentsSerializers);
        }
    }

    /* JADX INFO: renamed from: pj1.y$y, reason: collision with other inner class name */
    public static final class C0144y extends y {
        public final ij1.zn<?> y;

        public boolean equals(Object obj) {
            return (obj instanceof C0144y) && Intrinsics.areEqual(((C0144y) obj).y, this.y);
        }

        public int hashCode() {
            return this.y.hashCode();
        }

        public final ij1.zn<?> n3() {
            return this.y;
        }

        @Override // pj1.y
        public ij1.zn<?> y(List<? extends ij1.zn<?>> typeArgumentsSerializers) {
            Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.y;
        }
    }

    public abstract ij1.zn<?> y(List<? extends ij1.zn<?>> list);
}
