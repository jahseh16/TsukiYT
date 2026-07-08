package u1;

import android.view.View;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8330a = true;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f8331fb = true;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f8332gv;
    public int n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8333v;
    public final View y;
    public int zn;

    public v(View view) {
        this.y = view;
    }

    public boolean gv(int i) {
        if (!this.f8331fb || this.f8333v == i) {
            return false;
        }
        this.f8333v = i;
        y();
        return true;
    }

    public int n3() {
        return this.f8332gv;
    }

    public boolean v(int i) {
        if (!this.f8330a || this.f8332gv == i) {
            return false;
        }
        this.f8332gv = i;
        y();
        return true;
    }

    public void y() {
        View view = this.y;
        ut.xg(view, this.f8332gv - (view.getTop() - this.n3));
        View view2 = this.y;
        ut.y5(view2, this.f8333v - (view2.getLeft() - this.zn));
    }

    public void zn() {
        this.n3 = this.y.getTop();
        this.zn = this.y.getLeft();
    }
}
