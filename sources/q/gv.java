package q;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import wm.c5;
import yk.t;

/* JADX INFO: loaded from: classes.dex */
public class gv extends zn<ne.n3> {
    public gv(Context context, br.y yVar) {
        super(c5.zn(context, yVar).gv());
    }

    @Override // q.zn
    /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
    public boolean zn(@NonNull ne.n3 n3Var) {
        return Build.VERSION.SDK_INT >= 26 ? (n3Var.y() && n3Var.gv()) ? false : true : !n3Var.y();
    }

    @Override // q.zn
    public boolean n3(@NonNull androidx.work.impl.model.n3 n3Var) {
        return n3Var.constraints.n3() == t.CONNECTED;
    }
}
