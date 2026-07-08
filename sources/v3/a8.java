package v3;

import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a8 implements x4 {
    @Override // v3.x4
    public final void n3(ClassLoader classLoader, Set set) {
        ud.zn(classLoader, set, new z6());
    }

    @Override // v3.x4
    public final boolean y(ClassLoader classLoader, File file, File file2, boolean z) {
        return ud.gv(classLoader, file, file2, z, "zip");
    }
}
