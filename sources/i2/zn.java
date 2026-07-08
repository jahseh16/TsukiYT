package i2;

import androidx.annotation.NonNull;
import ap.d0;
import yk.wz;

/* JADX INFO: loaded from: classes.dex */
public class zn implements wz {
    public final d0<wz.n3> zn = new d0<>();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final fc.zn<wz.n3.zn> f5480gv = fc.zn.co();

    public zn() {
        y(wz.n3);
    }

    public void y(@NonNull wz.n3 n3Var) {
        this.zn.postValue(n3Var);
        if (n3Var instanceof wz.n3.zn) {
            this.f5480gv.xc((wz.n3.zn) n3Var);
        } else if (n3Var instanceof wz.n3.y) {
            this.f5480gv.w(((wz.n3.y) n3Var).y());
        }
    }
}
