package i9;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import i9.y;
import java.util.ArrayList;
import qn.ct;
import qn.ut;
import qn.y5;
import w.xg;
import wz.n3;
import wz.s;

/* JADX INFO: loaded from: classes.dex */
public class co extends y implements ActionBarOverlayLayout.gv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xg f5572a;
    public boolean c;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public androidx.appcompat.widget.n3 f5573c5;
    public boolean d0;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public ActionBarContextView f5576fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public ActionBarOverlayLayout f5577gv;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public boolean f5578i4;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public boolean f5580mt;
    public s n;
    public Context n3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5582r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f5583s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5584t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public gv f5585tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ActionBarContainer f5586v;
    public boolean w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public wz.n3 f5587wz;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public boolean f5588x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public n3.y f5589xc;
    public Context y;
    public Activity zn;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public static final Interpolator f5571ta = new AccelerateInterpolator();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Interpolator f5570d = new DecelerateInterpolator();

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public ArrayList<Object> f5579i9 = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5575f = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList<y.n3> f5581p = new ArrayList<>();

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f5574co = 0;
    public boolean z = true;
    public boolean f3 = true;
    public final qn.xg fh = new y(this);
    public final qn.xg rz = new n3(this);
    public final ct mg = new zn(this);

    public co(Activity activity, boolean z) {
        this.zn = activity;
        View decorView = activity.getWindow().getDecorView();
        d(decorView);
        if (z) {
            return;
        }
        this.f5583s = decorView.findViewById(R.id.content);
    }

    public static boolean n(boolean z, boolean z5, boolean z7) {
        if (z7) {
            return true;
        }
        return (z || z5) ? false : true;
    }

    public void a8(boolean z) {
        if (z && !this.f5577gv.i4()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.d0 = z;
        this.f5577gv.setHideOnContentScrollEnabled(z);
    }

    public void b(CharSequence charSequence) {
        this.f5572a.i9(charSequence);
    }

    public void c() {
        n3.y yVar = this.f5589xc;
        if (yVar != null) {
            yVar.n3(this.f5587wz);
            this.f5587wz = null;
            this.f5589xc = null;
        }
    }

    @Override // i9.y
    public int c5() {
        return this.f5572a.x4();
    }

    @Override // i9.y
    public void co(boolean z) {
        s sVar;
        this.c = z;
        if (z || (sVar = this.n) == null) {
            return;
        }
        sVar.y();
    }

    public final void d(View view) {
        ActionBarOverlayLayout actionBarOverlayLayoutFindViewById = view.findViewById(R$id.w);
        this.f5577gv = actionBarOverlayLayoutFindViewById;
        if (actionBarOverlayLayoutFindViewById != null) {
            actionBarOverlayLayoutFindViewById.setActionBarVisibilityCallback(this);
        }
        this.f5572a = rz(view.findViewById(R$id.y));
        this.f5576fb = view.findViewById(R$id.f357a);
        ActionBarContainer actionBarContainerFindViewById = view.findViewById(R$id.zn);
        this.f5586v = actionBarContainerFindViewById;
        xg xgVar = this.f5572a;
        if (xgVar == null || this.f5576fb == null || actionBarContainerFindViewById == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.y = xgVar.getContext();
        boolean z = (this.f5572a.x4() & 4) != 0;
        if (z) {
            this.f5584t = true;
        }
        wz.y yVarN3 = wz.y.n3(this.y);
        x(yVarN3.y() || z);
        ud(yVarN3.fb());
        TypedArray typedArrayObtainStyledAttributes = this.y.obtainStyledAttributes(null, R$styleable.y, R$attr.zn, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.f430f, false)) {
            a8(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f421c5, 0);
        if (dimensionPixelSize != 0) {
            ej(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void d0(boolean z) {
        View view;
        s sVar = this.n;
        if (sVar != null) {
            sVar.y();
        }
        if (this.f5574co != 0 || (!this.c && !z)) {
            this.fh.n3((View) null);
            return;
        }
        this.f5586v.setAlpha(1.0f);
        this.f5586v.setTransitioning(true);
        s sVar2 = new s();
        float f3 = -this.f5586v.getHeight();
        if (z) {
            this.f5586v.getLocationInWindow(new int[]{0, 0});
            f3 -= r5[1];
        }
        y5 y5VarXc = ut.v(this.f5586v).xc(f3);
        y5VarXc.tl(this.mg);
        sVar2.zn(y5VarXc);
        if (this.z && (view = this.f5583s) != null) {
            sVar2.zn(ut.v(view).xc(f3));
        }
        sVar2.a(f5571ta);
        sVar2.v(250L);
        sVar2.fb(this.fh);
        this.n = sVar2;
        sVar2.s();
    }

    public void ej(float f3) {
        ut.pz(this.f5586v, f3);
    }

    public void f3(boolean z) {
        y5 y5VarTl;
        y5 y5VarA;
        if (z) {
            vl();
        } else {
            ta();
        }
        if (!yt()) {
            if (z) {
                this.f5572a.setVisibility(4);
                this.f5576fb.setVisibility(0);
                return;
            } else {
                this.f5572a.setVisibility(0);
                this.f5576fb.setVisibility(8);
                return;
            }
        }
        if (z) {
            y5VarA = this.f5572a.tl(4, 100L);
            y5VarTl = this.f5576fb.a(0, 200L);
        } else {
            y5VarTl = this.f5572a.tl(0, 200L);
            y5VarA = this.f5576fb.a(8, 100L);
        }
        s sVar = new s();
        sVar.gv(y5VarA, y5VarTl);
        sVar.s();
    }

    @Override // i9.y
    public boolean fb() {
        xg xgVar = this.f5572a;
        if (xgVar == null || !xgVar.s()) {
            return false;
        }
        this.f5572a.collapseActionView();
        return true;
    }

    public void fh(boolean z) {
        View view;
        View view2;
        s sVar = this.n;
        if (sVar != null) {
            sVar.y();
        }
        this.f5586v.setVisibility(0);
        if (this.f5574co == 0 && (this.c || z)) {
            this.f5586v.setTranslationY(0.0f);
            float f3 = -this.f5586v.getHeight();
            if (z) {
                this.f5586v.getLocationInWindow(new int[]{0, 0});
                f3 -= r5[1];
            }
            this.f5586v.setTranslationY(f3);
            s sVar2 = new s();
            y5 y5VarXc = ut.v(this.f5586v).xc(0.0f);
            y5VarXc.tl(this.mg);
            sVar2.zn(y5VarXc);
            if (this.z && (view2 = this.f5583s) != null) {
                view2.setTranslationY(f3);
                sVar2.zn(ut.v(this.f5583s).xc(0.0f));
            }
            sVar2.a(f5570d);
            sVar2.v(250L);
            sVar2.fb(this.rz);
            this.n = sVar2;
            sVar2.s();
        } else {
            this.f5586v.setAlpha(1.0f);
            this.f5586v.setTranslationY(0.0f);
            if (this.z && (view = this.f5583s) != null) {
                view.setTranslationY(0.0f);
            }
            this.rz.n3((View) null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f5577gv;
        if (actionBarOverlayLayout != null) {
            ut.yg(actionBarOverlayLayout);
        }
    }

    public void gv() {
        if (this.f5588x4) {
            return;
        }
        this.f5588x4 = true;
        hw(true);
    }

    public final void hw(boolean z) {
        if (n(this.f5582r, this.f5588x4, this.f5578i4)) {
            if (this.f3) {
                return;
            }
            this.f3 = true;
            fh(z);
            return;
        }
        if (this.f3) {
            this.f3 = false;
            d0(z);
        }
    }

    @Override // i9.y
    public wz.n3 i4(n3.y yVar) {
        gv gvVar = this.f5585tl;
        if (gvVar != null) {
            gvVar.zn();
        }
        this.f5577gv.setHideOnContentScrollEnabled(false);
        this.f5576fb.f();
        gv gvVar2 = new gv(this, this.f5576fb.getContext(), yVar);
        if (!gvVar2.z()) {
            return null;
        }
        this.f5585tl = gvVar2;
        gvVar2.f();
        this.f5576fb.s(gvVar2);
        f3(true);
        this.f5576fb.sendAccessibilityEvent(32);
        return gvVar2;
    }

    @Override // i9.y
    public Context i9() {
        if (this.n3 == null) {
            TypedValue typedValue = new TypedValue();
            this.y.getTheme().resolveAttribute(R$attr.f288fb, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.n3 = new ContextThemeWrapper(this.y, i);
            } else {
                this.n3 = this.y;
            }
        }
        return this.n3;
    }

    public void k5(CharSequence charSequence) {
        this.f5572a.setTitle(charSequence);
    }

    public int mg() {
        return this.f5572a.t();
    }

    @Override // i9.y
    public void mt(boolean z) {
        z6(z ? 4 : 0, 4);
    }

    public void onWindowVisibilityChanged(int i) {
        this.f5574co = i;
    }

    @Override // i9.y
    public void p(boolean z) {
        if (this.f5584t) {
            return;
        }
        mt(z);
    }

    @Override // i9.y
    public void r(int i) {
        k5(this.y.getString(i));
    }

    public final xg rz(View view) {
        if (view instanceof xg) {
            return (xg) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    @Override // i9.y
    public void s(boolean z) {
        if (z == this.w) {
            return;
        }
        this.w = z;
        int size = this.f5581p.size();
        for (int i = 0; i < size; i++) {
            this.f5581p.get(i).y(z);
        }
    }

    @Override // i9.y
    public void t(Configuration configuration) {
        ud(wz.y.n3(this.y).fb());
    }

    public final void ta() {
        if (this.f5578i4) {
            this.f5578i4 = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f5577gv;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            hw(false);
        }
    }

    public final void ud(boolean z) {
        this.f5580mt = z;
        if (z) {
            this.f5586v.setTabContainer((androidx.appcompat.widget.n3) null);
            this.f5572a.co(this.f5573c5);
        } else {
            this.f5572a.co((androidx.appcompat.widget.n3) null);
            this.f5586v.setTabContainer(this.f5573c5);
        }
        boolean z5 = mg() == 2;
        androidx.appcompat.widget.n3 n3Var = this.f5573c5;
        if (n3Var != null) {
            if (z5) {
                n3Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f5577gv;
                if (actionBarOverlayLayout != null) {
                    ut.yg(actionBarOverlayLayout);
                }
            } else {
                n3Var.setVisibility(8);
            }
        }
        this.f5572a.p(!this.f5580mt && z5);
        this.f5577gv.setHasNonEmbeddedTabs(!this.f5580mt && z5);
    }

    public void v() {
        s sVar = this.n;
        if (sVar != null) {
            sVar.y();
            this.n = null;
        }
    }

    public final void vl() {
        if (this.f5578i4) {
            return;
        }
        this.f5578i4 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f5577gv;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        hw(false);
    }

    @Override // i9.y
    public boolean wz(int i, KeyEvent keyEvent) {
        Menu menuV;
        gv gvVar = this.f5585tl;
        if (gvVar == null || (menuV = gvVar.v()) == null) {
            return false;
        }
        menuV.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuV.performShortcut(i, keyEvent, 0);
    }

    public void x(boolean z) {
        this.f5572a.xc(z);
    }

    @Override // i9.y
    public void x4(CharSequence charSequence) {
        this.f5572a.setWindowTitle(charSequence);
    }

    public void y() {
        if (this.f5588x4) {
            this.f5588x4 = false;
            hw(true);
        }
    }

    public final boolean yt() {
        return ut.q9(this.f5586v);
    }

    @Override // i9.y
    public void z(int i) {
        b(this.y.getString(i));
    }

    public void z6(int i, int i5) {
        int iX4 = this.f5572a.x4();
        if ((i5 & 4) != 0) {
            this.f5584t = true;
        }
        this.f5572a.c5((i & i5) | ((~i5) & iX4));
    }

    public void zn(boolean z) {
        this.z = z;
    }

    public co(Dialog dialog) {
        d(dialog.getWindow().getDecorView());
    }

    public void n3() {
    }
}
