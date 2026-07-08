package rc;

import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class s {
    public static int n3(@NonNull Collection<? extends v> collection) {
        Iterator<? extends v> it = collection.iterator();
        int iR = 0;
        while (it.hasNext()) {
            iR += it.next().r();
        }
        return iR;
    }

    @NonNull
    public static t y(Collection<? extends v> collection, int i) {
        int i5 = 0;
        for (v vVar : collection) {
            int iR = vVar.r() + i5;
            if (iR > i) {
                return vVar.getItem(i - i5);
            }
            i5 = iR;
        }
        throw new IndexOutOfBoundsException("Wanted item at " + i + " but there are only " + i5 + " items");
    }
}
