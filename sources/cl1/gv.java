package cl1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class gv<T> extends zn<T> {
    public T zn;

    public static final class y extends Lambda implements Function0<Unit> {
        final /* synthetic */ n3 $context;
        final /* synthetic */ gv<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(gv<T> gvVar, n3 n3Var) {
            super(0);
            this.this$0 = gvVar;
            this.$context = n3Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.this$0.a(this.$context)) {
                return;
            }
            gv<T> gvVar = this.this$0;
            gvVar.zn = gvVar.y(this.$context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv(al1.y<T> beanDefinition) {
        super(beanDefinition);
        Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
    }

    public boolean a(n3 n3Var) {
        return this.zn != null;
    }

    @Override // cl1.zn
    public T n3(n3 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ml1.y.y.v(this, new y(this, context));
        return v();
    }

    public final T v() {
        T t3 = this.zn;
        if (t3 != null) {
            return t3;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }

    @Override // cl1.zn
    public T y(n3 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.zn == null ? (T) super.y(context) : v();
    }
}
