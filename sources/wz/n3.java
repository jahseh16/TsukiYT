package wz;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class n3 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9063v;
    public Object y;

    public interface y {
        boolean gv(n3 n3Var, Menu menu);

        void n3(n3 n3Var);

        boolean y(n3 n3Var, MenuItem menuItem);

        boolean zn(n3 n3Var, Menu menu);
    }

    public abstract MenuInflater a();

    public abstract CharSequence c5();

    public void co(boolean z) {
        this.f9063v = z;
    }

    public abstract void f();

    public abstract CharSequence fb();

    public abstract View gv();

    public boolean i9() {
        return this.f9063v;
    }

    public abstract void mt(CharSequence charSequence);

    public abstract void p(int i);

    public Object s() {
        return this.y;
    }

    public abstract boolean t();

    public abstract void tl(View view);

    public abstract Menu v();

    public void w(Object obj) {
        this.y = obj;
    }

    public abstract void wz(int i);

    public abstract void xc(CharSequence charSequence);

    public abstract void zn();
}
