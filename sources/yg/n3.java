package yg;

import androidx.lifecycle.rz;
import ap.b;
import ap.yt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements rz.n3 {
    public final v<?>[] y;

    public n3(v<?>... initializers) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        this.y = initializers;
    }

    @Override // androidx.lifecycle.rz.n3
    public /* synthetic */ b create(Class cls) {
        return yt.y(this, cls);
    }

    @Override // androidx.lifecycle.rz.n3
    public <T extends b> T create(Class<T> modelClass, y extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        T t3 = null;
        for (v<?> vVar : this.y) {
            if (Intrinsics.areEqual(vVar.y(), modelClass)) {
                T tInvoke = vVar.n3().invoke(extras);
                t3 = tInvoke instanceof b ? tInvoke : null;
            }
        }
        if (t3 != null) {
            return t3;
        }
        throw new IllegalArgumentException("No initializer set for given class " + modelClass.getName());
    }
}
