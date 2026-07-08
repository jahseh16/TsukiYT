package ap;

import androidx.lifecycle.rz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yt {
    public static b n3(rz.n3 n3Var, Class modelClass, yg.y extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return n3Var.create(modelClass);
    }

    public static b y(rz.n3 n3Var, Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }
}
