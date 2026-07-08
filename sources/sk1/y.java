package sk1;

import al1.gv;
import android.app.Application;
import android.content.Context;
import hl1.zn;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    public static final class n3 extends Lambda implements Function1<el1.y, Unit> {
        final /* synthetic */ Context $androidContext;

        /* JADX INFO: renamed from: sk1.y$n3$y, reason: collision with other inner class name */
        public static final class C0168y extends Lambda implements Function2<il1.y, fl1.y, Context> {
            final /* synthetic */ Context $androidContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0168y(Context context) {
                super(2);
                this.$androidContext = context;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public final Context invoke(il1.y single, fl1.y it) {
                Intrinsics.checkNotNullParameter(single, "$this$single");
                Intrinsics.checkNotNullParameter(it, "it");
                return this.$androidContext;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n3(Context context) {
            super(1);
            this.$androidContext = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(el1.y yVar) throws bl1.n3 {
            y(yVar);
            return Unit.INSTANCE;
        }

        public final void y(el1.y module) throws bl1.n3 {
            Intrinsics.checkNotNullParameter(module, "$this$module");
            C0168y c0168y = new C0168y(this.$androidContext);
            gv gvVar = gv.Singleton;
            zn.y yVar = zn.f5343v;
            al1.y yVar2 = new al1.y(yVar.y(), Reflection.getOrCreateKotlinClass(Context.class), null, c0168y, gvVar, CollectionsKt.emptyList());
            String strY = al1.n3.y(yVar2.n3(), null, yVar.y());
            cl1.gv<?> gvVar2 = new cl1.gv<>(yVar2);
            el1.y.a(module, strY, gvVar2, false, 4, null);
            if (module.y()) {
                module.n3().add(gvVar2);
            }
            new Pair(module, gvVar2);
        }
    }

    /* JADX INFO: renamed from: sk1.y$y, reason: collision with other inner class name */
    public static final class C0169y extends Lambda implements Function1<el1.y, Unit> {
        final /* synthetic */ Context $androidContext;

        /* JADX INFO: renamed from: sk1.y$y$y, reason: collision with other inner class name */
        public static final class C0170y extends Lambda implements Function2<il1.y, fl1.y, Context> {
            final /* synthetic */ Context $androidContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0170y(Context context) {
                super(2);
                this.$androidContext = context;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public final Context invoke(il1.y single, fl1.y it) {
                Intrinsics.checkNotNullParameter(single, "$this$single");
                Intrinsics.checkNotNullParameter(it, "it");
                return this.$androidContext;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0169y(Context context) {
            super(1);
            this.$androidContext = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(el1.y yVar) throws bl1.n3 {
            y(yVar);
            return Unit.INSTANCE;
        }

        public final void y(el1.y module) throws bl1.n3 {
            Intrinsics.checkNotNullParameter(module, "$this$module");
            C0170y c0170y = new C0170y(this.$androidContext);
            gv gvVar = gv.Singleton;
            zn.y yVar = zn.f5343v;
            al1.y yVar2 = new al1.y(yVar.y(), Reflection.getOrCreateKotlinClass(Context.class), null, c0170y, gvVar, CollectionsKt.emptyList());
            String strY = al1.n3.y(yVar2.n3(), null, yVar.y());
            cl1.gv<?> gvVar2 = new cl1.gv<>(yVar2);
            el1.y.a(module, strY, gvVar2, false, 4, null);
            if (module.y()) {
                module.n3().add(gvVar2);
            }
            kl1.y.y(new Pair(module, gvVar2), Reflection.getOrCreateKotlinClass(Application.class));
        }
    }

    public static final xk1.n3 n3(xk1.n3 n3Var, dl1.n3 level) {
        Intrinsics.checkNotNullParameter(n3Var, "<this>");
        Intrinsics.checkNotNullParameter(level, "level");
        n3Var.n3().c5(new tk1.y(level));
        return n3Var;
    }

    public static final xk1.n3 y(xk1.n3 n3Var, Context androidContext) throws bl1.n3 {
        Intrinsics.checkNotNullParameter(n3Var, "<this>");
        Intrinsics.checkNotNullParameter(androidContext, "androidContext");
        if (n3Var.n3().zn().fb(dl1.n3.INFO)) {
            n3Var.n3().zn().a("[init] declare Android Context");
        }
        if (androidContext instanceof Application) {
            xk1.y.fb(n3Var.n3(), CollectionsKt.listOf(kl1.n3.n3(false, new C0169y(androidContext), 1, null)), false, 2, null);
        } else {
            xk1.y.fb(n3Var.n3(), CollectionsKt.listOf(kl1.n3.n3(false, new n3(androidContext), 1, null)), false, 2, null);
        }
        return n3Var;
    }
}
