package el1;

import cl1.zn;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public static final void y(zn<?> factory, String mapping) throws bl1.n3 {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        throw new bl1.n3("Already existing definition for " + factory.zn() + " at " + mapping);
    }
}
