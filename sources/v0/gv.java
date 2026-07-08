package v0;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import ft.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k4.r;

/* JADX INFO: loaded from: classes.dex */
public final class gv {
    public static <T extends ft.s> ArrayList<Bundle> gv(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toBundle());
        }
        return arrayList;
    }

    public static <T extends ft.s> k4.r<T> n3(s.y<T> yVar, List<Bundle> list) {
        r.y yVarN = k4.r.n();
        for (int i = 0; i < list.size(); i++) {
            yVarN.y(yVar.fromBundle((Bundle) y.v(list.get(i))));
        }
        return yVarN.f();
    }

    public static <T extends ft.s> SparseArray<Bundle> v(SparseArray<T> sparseArray) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), sparseArray.valueAt(i).toBundle());
        }
        return sparseArray2;
    }

    public static void y(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) ut.i9(gv.class.getClassLoader()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends ft.s> SparseArray<T> zn(s.y<T> yVar, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), yVar.fromBundle(sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }
}
