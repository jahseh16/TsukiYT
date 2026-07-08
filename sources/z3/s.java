package z3;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public final class s implements f {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final /* synthetic */ wz f9436gv;
    public final /* synthetic */ Set n3;
    public final /* synthetic */ z y;
    public final /* synthetic */ AtomicBoolean zn;

    public s(wz wzVar, z zVar, Set set, AtomicBoolean atomicBoolean) {
        this.f9436gv = wzVar;
        this.y = zVar;
        this.n3 = set;
        this.zn = atomicBoolean;
    }

    @Override // z3.f
    public final void y(ZipFile zipFile, Set set) throws IOException {
        this.f9436gv.a(this.y, set, new fb(this));
    }
}
