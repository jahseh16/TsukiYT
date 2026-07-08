package ap;

import androidx.annotation.CheckResult;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: Add missing generic type declarations: [X] */
    public static final class n3<X> extends Lambda implements Function1<X, Unit> {
        final /* synthetic */ n<Y> $result;
        final /* synthetic */ Function1<X, Y> $transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n3(n<Y> nVar, Function1<X, Y> function1) {
            super(1);
            this.$result = nVar;
            this.$transform = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            y(obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void y(X x2) {
            this.$result.setValue((Y) this.$transform.invoke(x2));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    public static final class y<X> extends Lambda implements Function1<X, Unit> {
        final /* synthetic */ Ref$BooleanRef $firstTime;
        final /* synthetic */ n<X> $outputLiveData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(n<X> nVar, Ref$BooleanRef ref$BooleanRef) {
            super(1);
            this.$outputLiveData = nVar;
            this.$firstTime = ref$BooleanRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            y(obj);
            return Unit.INSTANCE;
        }

        public final void y(X x2) {
            X value = this.$outputLiveData.getValue();
            if (this.$firstTime.element || ((value == null && x2 != null) || !(value == null || Intrinsics.areEqual(value, x2)))) {
                this.$firstTime.element = false;
                this.$outputLiveData.setValue(x2);
            }
        }
    }

    public static final class zn implements fh, FunctionAdapter {
        public final /* synthetic */ Function1 y;

        public zn(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.y = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof fh) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.y;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // ap.fh
        public final /* synthetic */ void onChanged(Object obj) {
            this.y.invoke(obj);
        }
    }

    @CheckResult
    public static final <X, Y> androidx.lifecycle.xc<Y> n3(androidx.lifecycle.xc<X> xcVar, Function1<X, Y> transform) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        n nVar = new n();
        if (xcVar.isInitialized()) {
            nVar.setValue(transform.invoke(xcVar.getValue()));
        }
        nVar.y(xcVar, new zn(new n3(nVar, transform)));
        return nVar;
    }

    @CheckResult
    public static final <X> androidx.lifecycle.xc<X> y(androidx.lifecycle.xc<X> xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        n nVar = new n();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        if (xcVar.isInitialized()) {
            nVar.setValue(xcVar.getValue());
            ref$BooleanRef.element = false;
        }
        nVar.y(xcVar, new zn(new y(nVar, ref$BooleanRef)));
        return nVar;
    }
}
