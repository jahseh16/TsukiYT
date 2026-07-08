package q;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import wm.c5;
import yk.f;
import yk.t;

/* JADX INFO: loaded from: classes.dex */
public class v extends zn<ne.n3> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f7436v = f.a("NetworkMeteredCtrlr");

    public v(Context context, br.y yVar) {
        super(c5.zn(context, yVar).gv());
    }

    @Override // q.zn
    /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
    public boolean zn(@NonNull ne.n3 n3Var) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (n3Var.y() && n3Var.n3()) ? false : true;
        }
        f.zn().y(f7436v, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !n3Var.y();
    }

    @Override // q.zn
    public boolean n3(@NonNull androidx.work.impl.model.n3 n3Var) {
        return n3Var.constraints.n3() == t.METERED;
    }
}
