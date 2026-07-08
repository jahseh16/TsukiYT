package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.c5;

/* JADX INFO: loaded from: classes.dex */
public class zn implements c5, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public y f637co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f638f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public v f639fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c5.y f640p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ExpandedMenuView f641s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f642t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LayoutInflater f643v;
    public int w;
    public Context y;

    public zn(Context context, int i) {
        this(i, 0);
        this.y = context;
        this.f643v = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.c5
    public void a(boolean z) {
        y yVar = this.f637co;
        if (yVar != null) {
            yVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.c5
    public void c5(Context context, v vVar) {
        if (this.f642t != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f642t);
            this.y = contextThemeWrapper;
            this.f643v = LayoutInflater.from(contextThemeWrapper);
        } else if (this.y != null) {
            this.y = context;
            if (this.f643v == null) {
                this.f643v = LayoutInflater.from(context);
            }
        }
        this.f639fb = vVar;
        y yVar = this.f637co;
        if (yVar != null) {
            yVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.c5
    public boolean fb() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.c5
    public void gv(c5.y yVar) {
        this.f640p = yVar;
    }

    public i9 i9(ViewGroup viewGroup) {
        if (this.f641s == null) {
            this.f641s = this.f643v.inflate(R$layout.f390fb, viewGroup, false);
            if (this.f637co == null) {
                this.f637co = new y(this);
            }
            this.f641s.setAdapter(this.f637co);
            this.f641s.setOnItemClickListener(this);
        }
        return this.f641s;
    }

    @Override // androidx.appcompat.view.menu.c5
    public void n3(v vVar, boolean z) {
        c5.y yVar = this.f640p;
        if (yVar != null) {
            yVar.n3(vVar, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f639fb.k5(this.f637co.n3(i), this, 0);
    }

    @Override // androidx.appcompat.view.menu.c5
    public boolean s(v vVar, fb fbVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.c5
    public boolean v(t tVar) {
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        new a(tVar).gv((IBinder) null);
        c5.y yVar = this.f640p;
        if (yVar == null) {
            return true;
        }
        yVar.zn(tVar);
        return true;
    }

    public ListAdapter y() {
        if (this.f637co == null) {
            this.f637co = new y(this);
        }
        return this.f637co;
    }

    @Override // androidx.appcompat.view.menu.c5
    public boolean zn(v vVar, fb fbVar) {
        return false;
    }

    public zn(int i, int i5) {
        this.w = i;
        this.f642t = i5;
    }
}
