package oj1;

import kj1.i9;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class f7 {

    public static final class y extends Lambda implements Function1<nj1.s, Unit> {
        final /* synthetic */ Ref$ObjectRef<nj1.s> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Ref$ObjectRef<nj1.s> ref$ObjectRef) {
            super(1);
            this.$result = ref$ObjectRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(nj1.s sVar) {
            y(sVar);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void y(nj1.s it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$result.element = it;
        }
    }

    public static final boolean n3(kj1.a aVar) {
        return (aVar.getKind() instanceof kj1.v) || aVar.getKind() == i9.n3.y;
    }

    public static final <T> nj1.s zn(nj1.y yVar, T t3, ij1.f<? super T> serializer) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        new a8(yVar, new y(ref$ObjectRef)).c5(serializer, t3);
        T t5 = ref$ObjectRef.element;
        if (t5 != null) {
            return (nj1.s) t5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("result");
        return null;
    }
}
