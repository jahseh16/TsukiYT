package v3;

import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class yt implements x4 {
    public static boolean gv(ClassLoader classLoader, File file, File file2, boolean z) {
        return mg.v(classLoader, file, file2, z, new d(), "path", new k5());
    }

    public static void zn(ClassLoader classLoader, Set set) {
        ud.zn(classLoader, set, new b());
    }

    @Override // v3.x4
    public final void n3(ClassLoader classLoader, Set set) {
        zn(classLoader, set);
    }

    @Override // v3.x4
    public final boolean y(ClassLoader classLoader, File file, File file2, boolean z) {
        return gv(classLoader, file, file2, z);
    }
}
