package wk1;

import androidx.lifecycle.rz;
import ap.b;
import ap.yt;
import kotlin.jvm.internal.Intrinsics;
import vk1.n3;

/* JADX INFO: loaded from: classes.dex */
public final class y<T extends b> implements rz.n3 {
    public final n3<T> n3;
    public final il1.y y;

    public y(il1.y scope, n3<T> parameters) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.y = scope;
        this.n3 = parameters;
    }

    @Override // androidx.lifecycle.rz.n3
    public /* synthetic */ b create(Class cls, yg.y yVar) {
        return yt.n3(this, cls, yVar);
    }

    @Override // androidx.lifecycle.rz.n3
    public <T extends b> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) this.y.zn(this.n3.y(), this.n3.zn(), this.n3.n3());
    }
}
