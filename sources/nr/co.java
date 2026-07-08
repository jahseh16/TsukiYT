package nr;

import android.util.SparseArray;
import v0.hw;

/* JADX INFO: loaded from: classes.dex */
public final class co {
    public final SparseArray<hw> y = new SparseArray<>();

    public void n3() {
        this.y.clear();
    }

    public hw y(int i) {
        hw hwVar = this.y.get(i);
        if (hwVar != null) {
            return hwVar;
        }
        hw hwVar2 = new hw(9223372036854775806L);
        this.y.put(i, hwVar2);
        return hwVar2;
    }
}
