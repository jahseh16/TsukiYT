package nj1;

import kotlin.jvm.internal.Intrinsics;
import oj1.qn;

/* JADX INFO: loaded from: classes.dex */
public final class wz extends y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz(a configuration, pj1.zn module) {
        super(configuration, module, null);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(module, "module");
        fb();
    }

    public final void fb() {
        if (Intrinsics.areEqual(y(), pj1.gv.y())) {
            return;
        }
        y().y(new qn(v().f(), v().zn()));
    }
}
