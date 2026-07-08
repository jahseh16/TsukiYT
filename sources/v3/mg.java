package v3;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mg implements x4 {
    public static void gv(ClassLoader classLoader, Set set) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String strValueOf = String.valueOf(file.getParentFile().getAbsolutePath());
            Log.d("Splitcompat", strValueOf.length() != 0 ? "Adding native library parent directory: ".concat(strValueOf) : new String("Adding native library parent directory: "));
            hashSet.add(file.getParentFile());
        }
        o oVarY = oz.y(zn(classLoader), "nativeLibraryDirectories", File.class);
        hashSet.removeAll(Arrays.asList((File[]) oVarY.y()));
        synchronized (a4.hw.class) {
            int size = hashSet.size();
            StringBuilder sb = new StringBuilder(30);
            sb.append("Adding directories ");
            sb.append(size);
            Log.d("Splitcompat", sb.toString());
            oVarY.v(hashSet);
        }
    }

    public static boolean v(ClassLoader classLoader, File file, File file2, boolean z, rz rzVar, String str, fh fhVar) {
        ArrayList arrayList = new ArrayList();
        Object objZn = zn(classLoader);
        o oVarY = oz.y(objZn, "dexElements", Object.class);
        List listAsList = Arrays.asList((Object[]) oVarY.y());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList2.add((File) oz.n3(it.next(), str, File.class).y());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (!z && !fhVar.y(objZn, file2, file)) {
            String strValueOf = String.valueOf(file2.getPath());
            Log.w("SplitCompat", strValueOf.length() != 0 ? "Should be optimized ".concat(strValueOf) : new String("Should be optimized "));
            return false;
        }
        oVarY.gv(Arrays.asList(rzVar.y(objZn, new ArrayList(Collections.singleton(file2)), file, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        qn qnVar = new qn("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Log.e("SplitCompat", "DexPathList.makeDexElement failed", (IOException) arrayList.get(i));
        }
        oz.y(objZn, "dexElementsSuppressedExceptions", IOException.class).gv(arrayList);
        throw qnVar;
    }

    public static Object zn(ClassLoader classLoader) {
        return oz.n3(classLoader, "pathList", Object.class).y();
    }

    @Override // v3.x4
    public final void n3(ClassLoader classLoader, Set set) {
        gv(classLoader, set);
    }

    @Override // v3.x4
    public final boolean y(ClassLoader classLoader, File file, File file2, boolean z) {
        return v(classLoader, file, file2, z, new c(), "zip", new d0());
    }
}
