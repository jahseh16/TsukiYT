package z3;

import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public final class c5 implements f {
    public final /* synthetic */ z n3;
    public final /* synthetic */ Set y;
    public final /* synthetic */ wz zn;

    public c5(wz wzVar, Set set, z zVar) {
        this.zn = wzVar;
        this.y = set;
        this.n3 = zVar;
    }

    @Override // z3.f
    public final void y(ZipFile zipFile, Set set) throws IOException {
        this.y.addAll(wz.y(this.zn, set, this.n3, zipFile));
    }
}
