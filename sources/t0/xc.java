package t0;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class xc {
    public final Map<String, Object> y = new HashMap();
    public final List<String> n3 = new ArrayList();

    public static xc fb(xc xcVar, long j) {
        return xcVar.v("exo_len", j);
    }

    public static xc s(xc xcVar, @Nullable Uri uri) {
        return uri == null ? xcVar.gv("exo_redir") : xcVar.a("exo_redir", uri.toString());
    }

    public xc a(String str, String str2) {
        return y(str, str2);
    }

    public xc gv(String str) {
        this.n3.add(str);
        this.y.remove(str);
        return this;
    }

    public Map<String, Object> n3() {
        HashMap map = new HashMap(this.y);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public xc v(String str, long j) {
        return y(str, Long.valueOf(j));
    }

    public final xc y(String str, Object obj) {
        this.y.put((String) v0.y.v(str), v0.y.v(obj));
        this.n3.remove(str);
        return this;
    }

    public List<String> zn() {
        return Collections.unmodifiableList(new ArrayList(this.n3));
    }
}
