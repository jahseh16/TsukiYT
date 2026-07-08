package ap;

import android.os.Bundle;
import ap.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class a8<T extends b> extends androidx.lifecycle.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vk1.n3<T> f1174a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final il1.y f1175v;

    public static final class y extends Lambda implements Function0<fl1.y> {
        final /* synthetic */ fl1.y $definitionParameters;
        final /* synthetic */ androidx.lifecycle.r $handle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(fl1.y yVar, androidx.lifecycle.r rVar) {
            super(0);
            this.$definitionParameters = yVar;
            this.$handle = rVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final fl1.y invoke() {
            return this.$definitionParameters.y(this.$handle);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a8(il1.y scope, vk1.n3<T> parameters) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        qk.v vVarGv = parameters.gv();
        if (vVarGv == null) {
            throw new IllegalStateException("Can't create SavedStateViewModelFactory without a proper stateRegistryOwner");
        }
        Function0<Bundle> function0V = parameters.v();
        super(vVarGv, function0V == null ? null : function0V.invoke());
        this.f1175v = scope;
        this.f1174a = parameters;
    }

    public final Function0<fl1.y> gv(androidx.lifecycle.r rVar) {
        Function0<fl1.y> function0N3 = this.f1174a.n3();
        fl1.y yVarInvoke = function0N3 == null ? null : function0N3.invoke();
        if (yVarInvoke == null) {
            yVarInvoke = fl1.n3.y();
        }
        return new y(yVarInvoke, rVar);
    }

    @Override // androidx.lifecycle.y
    public <T extends b> T zn(String key, Class<T> modelClass, androidx.lifecycle.r handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(handle, "handle");
        return (T) this.f1175v.zn(this.f1174a.y(), this.f1174a.zn(), gv(handle));
    }
}
