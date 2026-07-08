package kj1;

import kj1.f;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import mj1.tg;

/* JADX INFO: loaded from: classes.dex */
public final class c5 {

    public static final class y extends Lambda implements Function1<kj1.y, Unit> {
        public static final y y = new y();

        public y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(kj1.y yVar) {
            y(yVar);
            return Unit.INSTANCE;
        }

        public final void y(kj1.y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "$this$null");
        }
    }

    public static /* synthetic */ a gv(String str, i9 i9Var, a[] aVarArr, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = y.y;
        }
        return zn(str, i9Var, aVarArr, function1);
    }

    public static final a n3(String serialName, a[] typeParameters, Function1<? super kj1.y, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        if (StringsKt.isBlank(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        kj1.y yVar = new kj1.y(serialName);
        builderAction.invoke(yVar);
        return new fb(serialName, f.y.y, yVar.a().size(), ArraysKt.toList(typeParameters), yVar);
    }

    public static final a y(String serialName, v kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (StringsKt.isBlank(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return tg.y(serialName, kind);
    }

    public static final a zn(String serialName, i9 kind, a[] typeParameters, Function1<? super kj1.y, Unit> builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (StringsKt.isBlank(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (Intrinsics.areEqual(kind, f.y.y)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        kj1.y yVar = new kj1.y(serialName);
        builder.invoke(yVar);
        return new fb(serialName, kind, yVar.a().size(), ArraysKt.toList(typeParameters), yVar);
    }
}
