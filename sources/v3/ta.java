package v3;

import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ta implements x4 {
    @Override // v3.x4
    public final void n3(ClassLoader classLoader, Set set) {
        mg.gv(classLoader, set);
    }

    @Override // v3.x4
    public final boolean y(ClassLoader classLoader, File file, File file2, boolean z) {
        return mg.v(classLoader, file, file2, z, new c(), "zip", new d0());
    }
}
