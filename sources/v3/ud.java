package v3;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ud implements x4 {
    public static boolean gv(ClassLoader classLoader, File file, File file2, boolean z, String str) {
        return mg.v(classLoader, file, file2, z, new d(), "zip", new d0());
    }

    public static void zn(ClassLoader classLoader, Set set, ej ejVar) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((File) it.next()).getParentFile());
        }
        Object objZn = mg.zn(classLoader);
        j jVarN3 = oz.n3(objZn, "nativeLibraryDirectories", List.class);
        synchronized (a4.hw.class) {
            ArrayList arrayList = new ArrayList((Collection) jVarN3.y());
            hashSet.removeAll(arrayList);
            arrayList.addAll(hashSet);
            jVarN3.zn(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] objArrY = ejVar.y(objZn, new ArrayList(hashSet), null, arrayList2);
        if (arrayList2.isEmpty()) {
            synchronized (a4.hw.class) {
                oz.y(objZn, "nativeLibraryPathElements", Object.class).v(Arrays.asList(objArrY));
            }
            return;
        }
        qn qnVar = new qn("Error in makePathElements");
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
        }
        throw qnVar;
    }

    @Override // v3.x4
    public final void n3(ClassLoader classLoader, Set set) {
        zn(classLoader, set, new z6());
    }

    @Override // v3.x4
    public final boolean y(ClassLoader classLoader, File file, File file2, boolean z) {
        return gv(classLoader, file, file2, z, "zip");
    }
}
