package androidx.appcompat.view.menu;

import a8.y;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.R$string;
import androidx.appcompat.view.menu.i9;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import x.n3;

/* JADX INFO: loaded from: classes.dex */
public final class fb implements n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f591a;
    public int c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public CharSequence f593co;
    public View d0;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public Intent f595fb;
    public qn.n3 fh;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f596gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public char f598i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public CharSequence f599mt;
    public final int n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f600p;
    public MenuItem.OnActionExpandListener rz;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public char f602s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f603t;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f604ta;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CharSequence f606v;
    public Runnable w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public v f607wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public t f609xc;
    public final int y;
    public final int zn;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f592c5 = 4096;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f594f = 4096;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public int f605tl = 0;
    public ColorStateList z = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public PorterDuff.Mode f601r = null;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public boolean f608x4 = false;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public boolean f597i4 = false;
    public boolean f3 = false;
    public int n = 16;
    public boolean mg = false;

    public fb(v vVar, int i, int i5, int i8, int i10, CharSequence charSequence, int i11) {
        this.f607wz = vVar;
        this.y = i5;
        this.n3 = i;
        this.zn = i8;
        this.f596gv = i10;
        this.f606v = charSequence;
        this.c = i11;
    }

    public static void gv(StringBuilder sb, int i, int i5, String str) {
        if ((i & i5) == i5) {
            sb.append(str);
        }
    }

    public int a() {
        return this.f596gv;
    }

    public boolean c() {
        return this.f607wz.d0();
    }

    public CharSequence c5(i9.y yVar) {
        return (yVar == null || !yVar.v()) ? getTitle() : getTitleCondensed();
    }

    public void co(boolean z) {
        int i = this.n;
        int i5 = (z ? 2 : 0) | (i & (-3));
        this.n = i5;
        if (i != i5) {
            this.f607wz.x(false);
        }
    }

    @Override // x.n3, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.c & 8) == 0) {
            return false;
        }
        if (this.d0 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.rz;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f607wz.a(this);
        }
        return false;
    }

    public boolean d0() {
        return this.f607wz.ej() && fb() != 0;
    }

    @Override // x.n3, android.view.MenuItem
    public boolean expandActionView() {
        if (!i9()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.rz;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f607wz.f(this);
        }
        return false;
    }

    public boolean f() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f600p;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        v vVar = this.f607wz;
        if (vVar.s(vVar, this)) {
            return true;
        }
        Runnable runnable = this.w;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f595fb != null) {
            try {
                this.f607wz.r().startActivity(this.f595fb);
                return true;
            } catch (ActivityNotFoundException e4) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e4);
            }
        }
        qn.n3 n3Var = this.fh;
        return n3Var != null && n3Var.v();
    }

    public void f3(t tVar) {
        this.f609xc = tVar;
        tVar.setHeaderTitle(getTitle());
    }

    public char fb() {
        return this.f607wz.z6() ? this.f598i9 : this.f602s;
    }

    public boolean fh() {
        return (this.c & 4) == 4;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // x.n3, android.view.MenuItem
    public View getActionView() {
        View view = this.d0;
        if (view != null) {
            return view;
        }
        qn.n3 n3Var = this.fh;
        if (n3Var == null) {
            return null;
        }
        View viewGv = n3Var.gv(this);
        this.d0 = viewGv;
        return viewGv;
    }

    @Override // x.n3, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f594f;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f598i9;
    }

    @Override // x.n3, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f599mt;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.n3;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f603t;
        if (drawable != null) {
            return v(drawable);
        }
        if (this.f605tl == 0) {
            return null;
        }
        Drawable drawableGv = f.n3.gv(this.f607wz.r(), this.f605tl);
        this.f605tl = 0;
        this.f603t = drawableGv;
        return v(drawableGv);
    }

    @Override // x.n3, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.z;
    }

    @Override // x.n3, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f601r;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f595fb;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.y;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f604ta;
    }

    @Override // x.n3, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f592c5;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f602s;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.zn;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f609xc;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f606v;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f591a;
        return charSequence != null ? charSequence : this.f606v;
    }

    @Override // x.n3, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f593co;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f609xc != null;
    }

    @Override // x.n3, android.view.MenuItem
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public n3 setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public boolean i9() {
        qn.n3 n3Var;
        if ((this.c & 8) == 0) {
            return false;
        }
        if (this.d0 == null && (n3Var = this.fh) != null) {
            this.d0 = n3Var.gv(this);
        }
        return this.d0 != null;
    }

    @Override // x.n3, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.mg;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.n & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.n & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.n & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        qn.n3 n3Var = this.fh;
        return (n3Var == null || !n3Var.fb()) ? (this.n & 8) == 0 : (this.n & 8) == 0 && this.fh.n3();
    }

    public void mt(boolean z) {
        this.mg = z;
        this.f607wz.x(false);
    }

    public boolean n(boolean z) {
        int i = this.n;
        int i5 = (z ? 0 : 8) | (i & (-9));
        this.n = i5;
        return i != i5;
    }

    @Override // x.n3
    public n3 n3(qn.n3 n3Var) {
        qn.n3 n3Var2 = this.fh;
        if (n3Var2 != null) {
            n3Var2.s();
        }
        this.d0 = null;
        this.fh = n3Var;
        this.f607wz.x(true);
        qn.n3 n3Var3 = this.fh;
        if (n3Var3 != null) {
            n3Var3.i9(new y(this));
        }
        return this;
    }

    @Override // x.n3, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public n3 setActionView(View view) {
        int i;
        this.d0 = view;
        this.fh = null;
        if (view != null && view.getId() == -1 && (i = this.y) > 0) {
            view.setId(i);
        }
        this.f607wz.ud(this);
        return this;
    }

    public void r(boolean z) {
        if (z) {
            this.n |= 32;
        } else {
            this.n &= -33;
        }
    }

    public String s() {
        char cFb = fb();
        if (cFb == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        Resources resources = this.f607wz.r().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f607wz.r()).hasPermanentMenuKey()) {
            sb.append(resources.getString(R$string.f409tl));
        }
        int i = this.f607wz.z6() ? this.f594f : this.f592c5;
        gv(sb, i, 65536, resources.getString(R$string.f402c5));
        gv(sb, i, 4096, resources.getString(R$string.f410v));
        gv(sb, i, 2, resources.getString(R$string.f405gv));
        gv(sb, i, 1, resources.getString(R$string.f406i9));
        gv(sb, i, 4, resources.getString(R$string.f408t));
        gv(sb, i, 8, resources.getString(R$string.f407s));
        if (cFb == '\b') {
            sb.append(resources.getString(R$string.f401a));
        } else if (cFb == '\n') {
            sb.append(resources.getString(R$string.f404fb));
        } else if (cFb != ' ') {
            sb.append(cFb);
        } else {
            sb.append(resources.getString(R$string.f403f));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f598i9 == c) {
            return this;
        }
        this.f598i9 = Character.toLowerCase(c);
        this.f607wz.x(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.n;
        int i5 = (z ? 1 : 0) | (i & (-2));
        this.n = i5;
        if (i != i5) {
            this.f607wz.x(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.n & 4) != 0) {
            this.f607wz.j(this);
        } else {
            co(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.n |= 16;
        } else {
            this.n &= -17;
        }
        this.f607wz.x(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f605tl = 0;
        this.f603t = drawable;
        this.f3 = true;
        this.f607wz.x(false);
        return this;
    }

    @Override // x.n3, android.view.MenuItem
    public MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.z = colorStateList;
        this.f608x4 = true;
        this.f3 = true;
        this.f607wz.x(false);
        return this;
    }

    @Override // x.n3, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f601r = mode;
        this.f597i4 = true;
        this.f3 = true;
        this.f607wz.x(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f595fb = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f602s == c) {
            return this;
        }
        this.f602s = c;
        this.f607wz.x(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.rz = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f600p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c3) {
        this.f602s = c;
        this.f598i9 = Character.toLowerCase(c3);
        this.f607wz.x(false);
        return this;
    }

    @Override // x.n3, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i5 = i & 3;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.c = i;
        this.f607wz.ud(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f606v = charSequence;
        this.f607wz.x(false);
        t tVar = this.f609xc;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f591a = charSequence;
        this.f607wz.x(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (n(z)) {
            this.f607wz.a8(this);
        }
        return this;
    }

    public boolean t() {
        return (this.n & 32) == 32;
    }

    public boolean tl() {
        return (this.n & 4) != 0;
    }

    public String toString() {
        CharSequence charSequence = this.f606v;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final Drawable v(Drawable drawable) {
        if (drawable != null && this.f3 && (this.f608x4 || this.f597i4)) {
            drawable = y.mt(drawable).mutate();
            if (this.f608x4) {
                y.xc(drawable, this.z);
            }
            if (this.f597i4) {
                y.w(drawable, this.f601r);
            }
            this.f3 = false;
        }
        return drawable;
    }

    @Override // x.n3, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public n3 setActionView(int i) {
        Context contextR = this.f607wz.r();
        setActionView(LayoutInflater.from(contextR).inflate(i, (ViewGroup) new LinearLayout(contextR), false));
        return this;
    }

    public boolean wz() {
        return (this.c & 1) == 1;
    }

    public void x4(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f604ta = contextMenuInfo;
    }

    public boolean xc() {
        return (this.c & 2) == 2;
    }

    @Override // x.n3
    public qn.n3 y() {
        return this.fh;
    }

    public void z(boolean z) {
        this.n = (z ? 4 : 0) | (this.n & (-5));
    }

    public void zn() {
        this.f607wz.ud(this);
    }

    @Override // android.view.MenuItem
    public n3 setContentDescription(CharSequence charSequence) {
        this.f599mt = charSequence;
        this.f607wz.x(false);
        return this;
    }

    @Override // android.view.MenuItem
    public n3 setTooltipText(CharSequence charSequence) {
        this.f593co = charSequence;
        this.f607wz.x(false);
        return this;
    }

    @Override // x.n3, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f598i9 == c && this.f594f == i) {
            return this;
        }
        this.f598i9 = Character.toLowerCase(c);
        this.f594f = KeyEvent.normalizeMetaState(i);
        this.f607wz.x(false);
        return this;
    }

    @Override // x.n3, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f602s == c && this.f592c5 == i) {
            return this;
        }
        this.f602s = c;
        this.f592c5 = KeyEvent.normalizeMetaState(i);
        this.f607wz.x(false);
        return this;
    }

    @Override // x.n3, android.view.MenuItem
    public MenuItem setShortcut(char c, char c3, int i, int i5) {
        this.f602s = c;
        this.f592c5 = KeyEvent.normalizeMetaState(i);
        this.f598i9 = Character.toLowerCase(c3);
        this.f594f = KeyEvent.normalizeMetaState(i5);
        this.f607wz.x(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f603t = null;
        this.f605tl = i;
        this.f3 = true;
        this.f607wz.x(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.f607wz.r().getString(i));
    }
}
