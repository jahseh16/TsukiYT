package i9;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import i9.y;
import java.util.ArrayList;
import qn.ut;
import w.xg;

/* JADX INFO: loaded from: classes.dex */
public class w extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<y.n3> f5647a = new ArrayList<>();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Runnable f5648fb = new y(this);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public boolean f5649gv;
    public boolean n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Toolbar.a f5650s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5651v;
    public xg y;
    public Window.Callback zn;

    public w(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        n3 n3Var = new n3(this);
        this.f5650s = n3Var;
        this.y = new androidx.appcompat.widget.zn(toolbar, false);
        v vVar = new v(this, callback);
        this.zn = vVar;
        this.y.setWindowCallback(vVar);
        toolbar.setOnMenuItemClickListener(n3Var);
        this.y.setWindowTitle(charSequence);
    }

    @Override // i9.y
    public boolean a() {
        return this.y.n3();
    }

    public void c() {
        Menu menuF3 = f3();
        androidx.appcompat.view.menu.v vVar = menuF3 instanceof androidx.appcompat.view.menu.v ? (androidx.appcompat.view.menu.v) menuF3 : null;
        if (vVar != null) {
            vVar.xg();
        }
        try {
            menuF3.clear();
            if (!this.zn.onCreatePanelMenu(0, menuF3) || !this.zn.onPreparePanel(0, null, menuF3)) {
                menuF3.clear();
            }
            if (vVar != null) {
                vVar.y5();
            }
        } catch (Throwable th) {
            if (vVar != null) {
                vVar.y5();
            }
            throw th;
        }
    }

    @Override // i9.y
    public int c5() {
        return this.y.x4();
    }

    public void d0(int i, int i5) {
        this.y.c5((i & i5) | ((~i5) & this.y.x4()));
    }

    @Override // i9.y
    public boolean f() {
        this.y.wz().removeCallbacks(this.f5648fb);
        ut.nf(this.y.wz(), this.f5648fb);
        return true;
    }

    public final Menu f3() {
        if (!this.f5649gv) {
            this.y.r(new zn(this), new gv(this));
            this.f5649gv = true;
        }
        return this.y.f();
    }

    @Override // i9.y
    public boolean fb() {
        if (!this.y.s()) {
            return false;
        }
        this.y.collapseActionView();
        return true;
    }

    @Override // i9.y
    public Context i9() {
        return this.y.getContext();
    }

    @Override // i9.y
    public void mt(boolean z) {
        d0(z ? 4 : 0, 4);
    }

    public Window.Callback n() {
        return this.zn;
    }

    @Override // i9.y
    public void r(int i) {
        xg xgVar = this.y;
        xgVar.setTitle(i != 0 ? xgVar.getContext().getText(i) : null);
    }

    @Override // i9.y
    public void s(boolean z) {
        if (z == this.f5651v) {
            return;
        }
        this.f5651v = z;
        int size = this.f5647a.size();
        for (int i = 0; i < size; i++) {
            this.f5647a.get(i).y(z);
        }
    }

    @Override // i9.y
    public void t(Configuration configuration) {
        super.t(configuration);
    }

    @Override // i9.y
    public void tl() {
        this.y.wz().removeCallbacks(this.f5648fb);
    }

    @Override // i9.y
    public boolean w() {
        return this.y.zn();
    }

    @Override // i9.y
    public boolean wz(int i, KeyEvent keyEvent) {
        Menu menuF3 = f3();
        if (menuF3 == null) {
            return false;
        }
        menuF3.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuF3.performShortcut(i, keyEvent, 0);
    }

    @Override // i9.y
    public void x4(CharSequence charSequence) {
        this.y.setWindowTitle(charSequence);
    }

    @Override // i9.y
    public boolean xc(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            w();
        }
        return true;
    }

    @Override // i9.y
    public void z(int i) {
        xg xgVar = this.y;
        xgVar.i9(i != 0 ? xgVar.getContext().getText(i) : null);
    }

    @Override // i9.y
    public void co(boolean z) {
    }

    @Override // i9.y
    public void p(boolean z) {
    }
}
