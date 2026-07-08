package rc;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.gv;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class n3 extends gv.n3 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Collection<? extends v> f7747gv;
    public final int n3;
    public final int y;
    public final Collection<? extends v> zn;

    public n3(Collection<? extends v> collection, Collection<? extends v> collection2) {
        this.y = s.n3(collection);
        this.n3 = s.n3(collection2);
        this.zn = collection;
        this.f7747gv = collection2;
    }

    public int gv() {
        return this.n3;
    }

    public boolean n3(int i, int i5) {
        return s.y(this.f7747gv, i5).f7(s.y(this.zn, i));
    }

    public int v() {
        return this.y;
    }

    public boolean y(int i, int i5) {
        return s.y(this.f7747gv, i5).j(s.y(this.zn, i));
    }

    @Nullable
    public Object zn(int i, int i5) {
        return s.y(this.zn, i).yt(s.y(this.f7747gv, i5));
    }
}
