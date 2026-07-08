package ap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class hw {
    public final Map<String, b> y = new LinkedHashMap();

    public final void gv(String key, b viewModel) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        b bVarPut = this.y.put(key, viewModel);
        if (bVarPut != null) {
            bVarPut.onCleared();
        }
    }

    public final b n3(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.y.get(key);
    }

    public final void y() {
        Iterator<b> it = this.y.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.y.clear();
    }

    public final Set<String> zn() {
        return new HashSet(this.y.keySet());
    }
}
