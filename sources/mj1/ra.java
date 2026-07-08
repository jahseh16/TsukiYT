package mj1;

import java.lang.annotation.Annotation;
import java.util.List;
import kj1.f;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ra<T> implements ij1.zn<T> {
    public List<? extends Annotation> n3;
    public final T y;
    public final Lazy zn;

    public static final class y extends Lambda implements Function0<kj1.a> {
        final /* synthetic */ String $serialName;
        final /* synthetic */ ra<T> this$0;

        /* JADX INFO: renamed from: mj1.ra$y$y, reason: collision with other inner class name */
        public static final class C0130y extends Lambda implements Function1<kj1.y, Unit> {
            final /* synthetic */ ra<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0130y(ra<T> raVar) {
                super(1);
                this.this$0 = raVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(kj1.y yVar) {
                y(yVar);
                return Unit.INSTANCE;
            }

            public final void y(kj1.y buildSerialDescriptor) {
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.s(this.this$0.n3);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str, ra<T> raVar) {
            super(0);
            this.$serialName = str;
            this.this$0 = raVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final kj1.a invoke() {
            return kj1.c5.zn(this.$serialName, f.gv.y, new kj1.a[0], new C0130y(this.this$0));
        }
    }

    public ra(String serialName, T objectInstance) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.y = objectInstance;
        this.n3 = CollectionsKt.emptyList();
        this.zn = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new y(serialName, this));
    }

    @Override // ij1.n3
    public T deserialize(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        kj1.a descriptor = getDescriptor();
        lj1.zn znVarN3 = decoder.n3(descriptor);
        int iX4 = znVarN3.x4(getDescriptor());
        if (iX4 == -1) {
            Unit unit = Unit.INSTANCE;
            znVarN3.zn(descriptor);
            return this.y;
        }
        throw new ij1.i9("Unexpected index " + iX4);
    }

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return (kj1.a) this.zn.getValue();
    }

    @Override // ij1.f
    public void serialize(lj1.a encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.n3(getDescriptor()).zn(getDescriptor());
    }
}
