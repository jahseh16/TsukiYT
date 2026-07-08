package pj1;

import ij1.f;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public interface v {

    public static final class y {

        /* JADX INFO: renamed from: pj1.v$y$y, reason: collision with other inner class name */
        public static final class C0143y extends Lambda implements Function1<List<? extends ij1.zn<?>>, ij1.zn<?>> {
            final /* synthetic */ ij1.zn<T> $serializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0143y(ij1.zn<T> znVar) {
                super(1);
                this.$serializer = znVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public final ij1.zn<?> invoke(List<? extends ij1.zn<?>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.$serializer;
            }
        }

        public static <T> void y(v vVar, KClass<T> kClass, ij1.zn<T> serializer) {
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            vVar.v(kClass, new C0143y(serializer));
        }
    }

    <Base> void gv(KClass<Base> kClass, Function1<? super Base, ? extends f<? super Base>> function1);

    <T> void n3(KClass<T> kClass, ij1.zn<T> znVar);

    <T> void v(KClass<T> kClass, Function1<? super List<? extends ij1.zn<?>>, ? extends ij1.zn<?>> function1);

    <Base> void y(KClass<Base> kClass, Function1<? super String, ? extends ij1.n3<? extends Base>> function1);

    <Base, Sub extends Base> void zn(KClass<Base> kClass, KClass<Sub> kClass2, ij1.zn<Sub> znVar);
}
