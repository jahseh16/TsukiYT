package q;

import android.content.Context;
import androidx.annotation.NonNull;
import wm.c5;

/* JADX INFO: loaded from: classes.dex */
public class s extends zn<Boolean> {
    public s(@NonNull Context context, @NonNull br.y yVar) {
        super(c5.zn(context, yVar).v());
    }

    @Override // q.zn
    /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
    public boolean zn(@NonNull Boolean bool) {
        return !bool.booleanValue();
    }

    @Override // q.zn
    public boolean n3(@NonNull androidx.work.impl.model.n3 n3Var) {
        return n3Var.constraints.c5();
    }
}
