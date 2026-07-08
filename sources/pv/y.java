package pv;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<fb> f7422a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final List<fb> f7423gv;
    public final int n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<fb> f7424v;
    public final int y;
    public final List<tl> zn;

    public y(int i, int i5, List<tl> list, List<fb> list2, List<fb> list3, List<fb> list4) {
        this.y = i;
        this.n3 = i5;
        this.zn = Collections.unmodifiableList(list);
        this.f7423gv = Collections.unmodifiableList(list2);
        this.f7424v = Collections.unmodifiableList(list3);
        this.f7422a = Collections.unmodifiableList(list4);
    }
}
