package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R$dimen;
import androidx.appcompat.view.menu.c5;
import qn.ut;
import qn.w;
import xc.gv;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f610a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public c5.y f611c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PopupWindow.OnDismissListener f612f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f613fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f614gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public gv f615i9;
    public final v n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f616s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final PopupWindow.OnDismissListener f617t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f618v;
    public final Context y;
    public final boolean zn;

    public s(@NonNull Context context, @NonNull v vVar, @NonNull View view, boolean z, int i) {
        this(context, vVar, view, z, i, 0);
    }

    public void a(@NonNull View view) {
        this.f610a = view;
    }

    public void c5(@Nullable PopupWindow.OnDismissListener onDismissListener) {
        this.f612f = onDismissListener;
    }

    public void f() {
        if (!tl()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void fb(boolean z) {
        this.f616s = z;
        gv gvVar = this.f615i9;
        if (gvVar != null) {
            gvVar.p(z);
        }
    }

    public boolean gv() {
        gv gvVar = this.f615i9;
        return gvVar != null && gvVar.y();
    }

    public void i9(@Nullable c5.y yVar) {
        this.f611c5 = yVar;
        gv gvVar = this.f615i9;
        if (gvVar != null) {
            gvVar.gv(yVar);
        }
    }

    public void n3() {
        if (gv()) {
            this.f615i9.dismiss();
        }
    }

    public void s(int i) {
        this.f613fb = i;
    }

    public final void t(int i, int i5, boolean z, boolean z5) {
        gv gvVarZn = zn();
        gvVarZn.r(z5);
        if (z) {
            if ((w.n3(this.f613fb, ut.ta(this.f610a)) & 7) == 5) {
                i -= this.f610a.getWidth();
            }
            gvVarZn.co(i);
            gvVarZn.x4(i5);
            int i8 = (int) ((this.y.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            gvVarZn.w(new Rect(i - i8, i5 - i8, i + i8, i5 + i8));
        }
        gvVarZn.show();
    }

    public boolean tl() {
        if (gv()) {
            return true;
        }
        if (this.f610a == null) {
            return false;
        }
        t(0, 0, false, false);
        return true;
    }

    public void v() {
        this.f615i9 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f612f;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean wz(int i, int i5) {
        if (gv()) {
            return true;
        }
        if (this.f610a == null) {
            return false;
        }
        t(i, i5, true, true);
        return true;
    }

    @NonNull
    public final gv y() {
        Display defaultDisplay = ((WindowManager) this.y.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        n3 n3Var = Math.min(point.x, point.y) >= this.y.getResources().getDimensionPixelSize(R$dimen.zn) ? new n3(this.y, this.f610a, this.f614gv, this.f618v, this.zn) : new f(this.y, this.n3, this.f610a, this.f614gv, this.f618v, this.zn);
        n3Var.i9(this.n3);
        n3Var.z(this.f617t);
        n3Var.wz(this.f610a);
        n3Var.gv(this.f611c5);
        n3Var.p(this.f616s);
        n3Var.mt(this.f613fb);
        return n3Var;
    }

    @NonNull
    public gv zn() {
        if (this.f615i9 == null) {
            this.f615i9 = y();
        }
        return this.f615i9;
    }

    public s(@NonNull Context context, @NonNull v vVar, @NonNull View view, boolean z, int i, int i5) {
        this.f613fb = 8388611;
        this.f617t = new y(this);
        this.y = context;
        this.n3 = vVar;
        this.f610a = view;
        this.zn = z;
        this.f614gv = i;
        this.f618v = i5;
    }
}
