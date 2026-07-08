package r5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r5.n3;

/* JADX INFO: loaded from: classes.dex */
public class n3$co {
    public int n3;
    public List<n3.z> y;

    public n3$co() {
        this.y = null;
        this.n3 = 0;
    }

    public boolean a() {
        List<n3.z> list = this.y;
        return list == null || list.isEmpty();
    }

    public int fb() {
        List<n3.z> list = this.y;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void gv() {
        this.n3 += 1000000;
    }

    public void n3() {
        this.n3 += 1000;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<n3.z> it = this.y.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(' ');
        }
        sb.append('[');
        sb.append(this.n3);
        sb.append(']');
        return sb.toString();
    }

    public n3.z v(int i) {
        return this.y.get(i);
    }

    public void y(n3.z zVar) {
        if (this.y == null) {
            this.y = new ArrayList();
        }
        this.y.add(zVar);
    }

    public void zn() {
        this.n3++;
    }
}
