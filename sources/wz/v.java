package wz;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.v;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import wz.n3;

/* JADX INFO: loaded from: classes.dex */
public class v extends n3 implements v.y {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public androidx.appcompat.view.menu.v f9064co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n3.y f9065f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public Context f9066fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9067p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ActionBarContextView f9068s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public WeakReference<View> f9069t;
    public boolean w;

    public v(Context context, ActionBarContextView actionBarContextView, n3.y yVar, boolean z) {
        this.f9066fb = context;
        this.f9068s = actionBarContextView;
        this.f9065f = yVar;
        androidx.appcompat.view.menu.v vVarO = new androidx.appcompat.view.menu.v(actionBarContextView.getContext()).o(1);
        this.f9064co = vVarO;
        vVarO.qn(this);
        this.f9067p = z;
    }

    @Override // wz.n3
    public MenuInflater a() {
        return new fb(this.f9068s.getContext());
    }

    @Override // wz.n3
    public CharSequence c5() {
        return this.f9068s.getTitle();
    }

    @Override // wz.n3
    public void co(boolean z) {
        super.co(z);
        this.f9068s.setTitleOptional(z);
    }

    @Override // wz.n3
    public void f() {
        this.f9065f.gv(this, this.f9064co);
    }

    @Override // wz.n3
    public CharSequence fb() {
        return this.f9068s.getSubtitle();
    }

    @Override // wz.n3
    public View gv() {
        WeakReference<View> weakReference = this.f9069t;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // wz.n3
    public void mt(CharSequence charSequence) {
        this.f9068s.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.menu.v.y
    public void n3(@NonNull androidx.appcompat.view.menu.v vVar) {
        f();
        this.f9068s.t();
    }

    @Override // wz.n3
    public void p(int i) {
        mt(this.f9066fb.getString(i));
    }

    @Override // wz.n3
    public boolean t() {
        return this.f9068s.i9();
    }

    @Override // wz.n3
    public void tl(View view) {
        this.f9068s.setCustomView(view);
        this.f9069t = view != null ? new WeakReference<>(view) : null;
    }

    @Override // wz.n3
    public Menu v() {
        return this.f9064co;
    }

    @Override // wz.n3
    public void wz(int i) {
        xc(this.f9066fb.getString(i));
    }

    @Override // wz.n3
    public void xc(CharSequence charSequence) {
        this.f9068s.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.menu.v.y
    public boolean y(@NonNull androidx.appcompat.view.menu.v vVar, @NonNull MenuItem menuItem) {
        return this.f9065f.y(this, menuItem);
    }

    @Override // wz.n3
    public void zn() {
        if (this.w) {
            return;
        }
        this.w = true;
        this.f9068s.sendAccessibilityEvent(32);
        this.f9065f.n3(this);
    }
}
