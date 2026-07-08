package mj1;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public final class z<T> implements o0<T> {
    public final y n3;
    public final Function1<KClass<?>, ij1.zn<T>> y;

    public static final class y extends ClassValue<tl<T>> {
        public final /* synthetic */ z<T> y;

        public y(z<T> zVar) {
            this.y = zVar;
        }

        @Override // java.lang.ClassValue
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public tl<T> computeValue(Class<?> type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new tl<>((ij1.zn) this.y.y.invoke(JvmClassMappingKt.getKotlinClass(type)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(Function1<? super KClass<?>, ? extends ij1.zn<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.y = compute;
        this.n3 = zn();
    }

    @Override // mj1.o0
    public ij1.zn<T> y(KClass<Object> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((tl) this.n3.get(JvmClassMappingKt.getJavaClass(key))).y;
    }

    public final y zn() {
        return new y(this);
    }
}
