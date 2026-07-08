package ij1;

import java.lang.annotation.Annotation;
import java.util.List;
import kj1.gv;
import kj1.i9;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> extends mj1.n3<T> {
    public List<? extends Annotation> n3;
    public final KClass<T> y;
    public final Lazy zn;

    public static final class y extends Lambda implements Function0<kj1.a> {
        final /* synthetic */ a<T> this$0;

        /* JADX INFO: renamed from: ij1.a$y$y, reason: collision with other inner class name */
        public static final class C0106y extends Lambda implements Function1<kj1.y, Unit> {
            final /* synthetic */ a<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0106y(a<T> aVar) {
                super(1);
                this.this$0 = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(kj1.y yVar) {
                y(yVar);
                return Unit.INSTANCE;
            }

            public final void y(kj1.y buildSerialDescriptor) {
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                kj1.y.n3(buildSerialDescriptor, "type", jj1.y.z6(StringCompanionObject.INSTANCE).getDescriptor(), null, false, 12, null);
                kj1.y.n3(buildSerialDescriptor, "value", kj1.c5.gv("kotlinx.serialization.Polymorphic<" + this.this$0.v().getSimpleName() + '>', i9.y.y, new kj1.a[0], null, 8, null), null, false, 12, null);
                buildSerialDescriptor.s(this.this$0.n3);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(a<T> aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final kj1.a invoke() {
            return kj1.n3.zn(kj1.c5.zn("kotlinx.serialization.Polymorphic", gv.y.y, new kj1.a[0], new C0106y(this.this$0)), this.this$0.v());
        }
    }

    public a(KClass<T> baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.y = baseClass;
        this.n3 = CollectionsKt.emptyList();
        this.zn = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new y(this));
    }

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return (kj1.a) this.zn.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + v() + ')';
    }

    @Override // mj1.n3
    public KClass<T> v() {
        return this.y;
    }
}
