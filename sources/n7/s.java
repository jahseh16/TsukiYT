package n7;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import r6.wz;

/* JADX INFO: loaded from: classes.dex */
public class s {
    public final List<y<Integer, Integer>> n3;
    public final List<y<wz, Path>> y;
    public final List<r6.s> zn;

    public s(List<r6.s> list) {
        this.zn = list;
        this.y = new ArrayList(list.size());
        this.n3 = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.y.add(list.get(i).n3().gv());
            this.n3.add(list.get(i).zn().y());
        }
    }

    public List<r6.s> n3() {
        return this.zn;
    }

    public List<y<wz, Path>> y() {
        return this.y;
    }

    public List<y<Integer, Integer>> zn() {
        return this.n3;
    }
}
