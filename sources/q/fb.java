package q;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import wm.c5;
import yk.t;

/* JADX INFO: loaded from: classes.dex */
public class fb extends zn<ne.n3> {
    public fb(@NonNull Context context, @NonNull br.y yVar) {
        super(c5.zn(context, yVar).gv());
    }

    @Override // q.zn
    /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
    public boolean zn(@NonNull ne.n3 n3Var) {
        return !n3Var.y() || n3Var.n3();
    }

    @Override // q.zn
    public boolean n3(@NonNull androidx.work.impl.model.n3 n3Var) {
        return n3Var.constraints.n3() == t.UNMETERED || (Build.VERSION.SDK_INT >= 30 && n3Var.constraints.n3() == t.TEMPORARILY_UNMETERED);
    }
}
