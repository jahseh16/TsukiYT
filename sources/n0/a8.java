package n0;

import androidx.annotation.Nullable;
import ft.gi;
import ft.gn;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class a8 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final gi f6746gv;
    public final gn[] n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final Object f6747v;
    public final int y;
    public final c[] zn;

    public a8(gn[] gnVarArr, c[] cVarArr, gi giVar, @Nullable Object obj) {
        this.n3 = gnVarArr;
        this.zn = (c[]) cVarArr.clone();
        this.f6746gv = giVar;
        this.f6747v = obj;
        this.y = gnVarArr.length;
    }

    public boolean n3(@Nullable a8 a8Var, int i) {
        return a8Var != null && ut.zn(this.n3[i], a8Var.n3[i]) && ut.zn(this.zn[i], a8Var.zn[i]);
    }

    public boolean y(@Nullable a8 a8Var) {
        if (a8Var == null || a8Var.zn.length != this.zn.length) {
            return false;
        }
        for (int i = 0; i < this.zn.length; i++) {
            if (!n3(a8Var, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean zn(int i) {
        return this.n3[i] != null;
    }
}
