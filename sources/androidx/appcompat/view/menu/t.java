package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.v;

/* JADX INFO: loaded from: classes.dex */
public class t extends v implements SubMenu {
    public v fh;
    public fb rz;

    public t(Context context, v vVar, fb fbVar) {
        super(context);
        this.fh = vVar;
        this.rz = fbVar;
    }

    @Override // androidx.appcompat.view.menu.v
    public boolean a(fb fbVar) {
        return this.fh.a(fbVar);
    }

    @Override // androidx.appcompat.view.menu.v
    public boolean d() {
        return this.fh.d();
    }

    public Menu dm() {
        return this.fh;
    }

    @Override // androidx.appcompat.view.menu.v
    public boolean ej() {
        return this.fh.ej();
    }

    @Override // androidx.appcompat.view.menu.v
    public boolean f(fb fbVar) {
        return this.fh.f(fbVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.rz;
    }

    @Override // androidx.appcompat.view.menu.v
    public v mg() {
        return this.fh.mg();
    }

    @Override // androidx.appcompat.view.menu.v
    public void qn(v.y yVar) {
        this.fh.qn(yVar);
    }

    @Override // androidx.appcompat.view.menu.v
    public boolean s(@NonNull v vVar, @NonNull MenuItem menuItem) {
        return super.s(vVar, menuItem) || this.fh.s(vVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.v, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.fh.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.ut(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.f7(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.en(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.rz.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.v, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.fh.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.v
    public String z() {
        fb fbVar = this.rz;
        int itemId = fbVar != null ? fbVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.z() + ":" + itemId;
    }

    @Override // androidx.appcompat.view.menu.v
    public boolean z6() {
        return this.fh.z6();
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.oz(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.k(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.rz.setIcon(i);
        return this;
    }
}
