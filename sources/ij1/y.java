package ij1;

import java.lang.annotation.Annotation;
import java.util.List;
import kj1.i9;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import mj1.yc;

/* JADX INFO: loaded from: classes.dex */
public final class y<T> implements zn<T> {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final kj1.a f5715gv;
    public final zn<T> n3;
    public final KClass<T> y;
    public final List<zn<?>> zn;

    /* JADX INFO: renamed from: ij1.y$y, reason: collision with other inner class name */
    public static final class C0107y extends Lambda implements Function1<kj1.y, Unit> {
        final /* synthetic */ y<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0107y(y<T> yVar) {
            super(1);
            this.this$0 = yVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(kj1.y yVar) {
            y(yVar);
            return Unit.INSTANCE;
        }

        public final void y(kj1.y buildSerialDescriptor) {
            kj1.a descriptor;
            Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
            zn znVar = this.this$0.n3;
            List<Annotation> annotations = (znVar == null || (descriptor = znVar.getDescriptor()) == null) ? null : descriptor.getAnnotations();
            if (annotations == null) {
                annotations = CollectionsKt.emptyList();
            }
            buildSerialDescriptor.s(annotations);
        }
    }

    public y(KClass<T> serializableClass, zn<T> znVar, zn<?>[] typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(serializableClass, "serializableClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.y = serializableClass;
        this.n3 = znVar;
        this.zn = ArraysKt.asList(typeArgumentsSerializers);
        this.f5715gv = kj1.n3.zn(kj1.c5.zn("kotlinx.serialization.ContextualSerializer", i9.y.y, new kj1.a[0], new C0107y(this)), serializableClass);
    }

    @Override // ij1.n3
    public T deserialize(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return (T) decoder.i4(n3(decoder.y()));
    }

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return this.f5715gv;
    }

    public final zn<T> n3(pj1.zn znVar) {
        zn<T> znVarN3 = znVar.n3(this.y, this.zn);
        if (znVarN3 != null || (znVarN3 = this.n3) != null) {
            return znVarN3;
        }
        yc.gv(this.y);
        throw new KotlinNothingValueException();
    }

    @Override // ij1.f
    public void serialize(lj1.a encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.c5(n3(encoder.y()), value);
    }
}
