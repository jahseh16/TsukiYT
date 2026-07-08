package r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class y implements zn {
    @Override // r.zn
    public void a(n3 n3Var, float f3) {
        xc(n3Var).s(f3);
    }

    @Override // r.zn
    public float c5(n3 n3Var) {
        return xc(n3Var).zn();
    }

    @Override // r.zn
    public float f(n3 n3Var) {
        return xc(n3Var).gv();
    }

    @Override // r.zn
    public ColorStateList fb(n3 n3Var) {
        return xc(n3Var).n3();
    }

    @Override // r.zn
    public void gv(n3 n3Var) {
        tl(n3Var, c5(n3Var));
    }

    @Override // r.zn
    public float i9(n3 n3Var) {
        return f(n3Var) * 2.0f;
    }

    @Override // r.zn
    public float n3(n3 n3Var) {
        return f(n3Var) * 2.0f;
    }

    @Override // r.zn
    public float s(n3 n3Var) {
        return n3Var.a().getElevation();
    }

    @Override // r.zn
    public void tl(n3 n3Var, float f3) {
        xc(n3Var).fb(f3, n3Var.zn(), n3Var.v());
        w(n3Var);
    }

    @Override // r.zn
    public void v(n3 n3Var) {
        tl(n3Var, c5(n3Var));
    }

    public void w(n3 n3Var) {
        if (!n3Var.zn()) {
            n3Var.y(0, 0, 0, 0);
            return;
        }
        float fC5 = c5(n3Var);
        float f3 = f(n3Var);
        int iCeil = (int) Math.ceil(v.y(fC5, f3, n3Var.v()));
        int iCeil2 = (int) Math.ceil(v.n3(fC5, f3, n3Var.v()));
        n3Var.y(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // r.zn
    public void wz(n3 n3Var, @Nullable ColorStateList colorStateList) {
        xc(n3Var).a(colorStateList);
    }

    public final gv xc(n3 n3Var) {
        return (gv) n3Var.gv();
    }

    @Override // r.zn
    public void y(n3 n3Var, Context context, ColorStateList colorStateList, float f3, float f4, float f5) {
        n3Var.n3(new gv(colorStateList, f3));
        View viewA = n3Var.a();
        viewA.setClipToOutline(true);
        viewA.setElevation(f4);
        tl(n3Var, f5);
    }

    @Override // r.zn
    public void zn(n3 n3Var, float f3) {
        n3Var.a().setElevation(f3);
    }

    @Override // r.zn
    public void t() {
    }
}
