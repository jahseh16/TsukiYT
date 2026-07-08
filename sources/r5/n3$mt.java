package r5;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class n3$mt {
    public List<n3$w> y = null;

    public int a() {
        List<n3$w> list = this.y;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public boolean gv() {
        List<n3$w> list = this.y;
        return list == null || list.isEmpty();
    }

    public void n3(n3$mt n3_mt) {
        if (n3_mt.y == null) {
            return;
        }
        if (this.y == null) {
            this.y = new ArrayList(n3_mt.y.size());
        }
        Iterator<n3$w> it = n3_mt.y.iterator();
        while (it.hasNext()) {
            y(it.next());
        }
    }

    public String toString() {
        if (this.y == null) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<n3$w> it = this.y.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            sb.append('\n');
        }
        return sb.toString();
    }

    public void v(n3$r n3_r) {
        List<n3$w> list = this.y;
        if (list == null) {
            return;
        }
        Iterator<n3$w> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().zn == n3_r) {
                it.remove();
            }
        }
    }

    public void y(n3$w n3_w) {
        if (this.y == null) {
            this.y = new ArrayList();
        }
        for (int i = 0; i < this.y.size(); i++) {
            if (this.y.get(i).y.n3 > n3_w.y.n3) {
                this.y.add(i, n3_w);
                return;
            }
        }
        this.y.add(n3_w);
    }

    public List<n3$w> zn() {
        return this.y;
    }
}
