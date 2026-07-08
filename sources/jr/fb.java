package jr;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import hk.i9;
import java.util.Collections;
import java.util.List;
import r6.w;
import uo.mg;

/* JADX INFO: loaded from: classes.dex */
public class fb extends n3 {
    public final mh.gv mg;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public final zn f5897ta;

    public fb(mg mgVar, v vVar, zn znVar, uo.s sVar) {
        super(mgVar, vVar);
        this.f5897ta = znVar;
        mh.gv gvVar = new mh.gv(mgVar, this, new w("__container", vVar.wz(), false), sVar);
        this.mg = gvVar;
        gvVar.n3(Collections.emptyList(), Collections.emptyList());
    }

    @Override // jr.n3
    public void ej(h.v vVar, int i, List<h.v> list, h.v vVar2) {
        this.mg.v(vVar, i, list, vVar2);
    }

    @Override // jr.n3
    @Nullable
    public i9 f3() {
        i9 i9VarF3 = super.f3();
        return i9VarF3 != null ? i9VarF3 : this.f5897ta.f3();
    }

    @Override // jr.n3, mh.v
    public void gv(RectF rectF, Matrix matrix, boolean z) {
        super.gv(rectF, matrix, z);
        this.mg.gv(rectF, this.f5920xc, z);
    }

    @Override // jr.n3
    @Nullable
    public r6.y x4() {
        r6.y yVarX4 = super.x4();
        return yVarX4 != null ? yVarX4 : this.f5897ta.x4();
    }

    @Override // jr.n3
    public void z(@NonNull Canvas canvas, Matrix matrix, int i) {
        this.mg.fb(canvas, matrix, i);
    }
}
