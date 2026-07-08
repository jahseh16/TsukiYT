package z3;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class fb implements t {
    public final /* synthetic */ s y;

    public fb(s sVar) {
        this.y = sVar;
    }

    @Override // z3.t
    public final void y(tl tlVar, File file, boolean z) throws IOException {
        this.y.n3.add(file);
        if (z) {
            return;
        }
        this.y.zn.set(false);
    }
}
