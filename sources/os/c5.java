package os;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c5 implements np.y<c5> {
    public final List<String> n3;
    public final String y;
    public final boolean zn;

    public c5(String str, List<String> list, boolean z) {
        this.y = str;
        this.n3 = Collections.unmodifiableList(list);
        this.zn = z;
    }
}
