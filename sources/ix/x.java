package ix;

import android.webkit.ServiceWorkerController;
import androidx.annotation.Nullable;
import ix.y;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class x extends ro.zn {
    public ServiceWorkerControllerBoundaryInterface n3;
    public ServiceWorkerController y;
    public final ro.gv zn;

    public x() {
        y.zn znVar = j5.f5729f;
        if (znVar.zn()) {
            this.y = p.fb();
            this.n3 = null;
            this.zn = p.c5(gv());
        } else {
            if (!znVar.gv()) {
                throw j5.y();
            }
            this.y = null;
            ServiceWorkerControllerBoundaryInterface serviceWorkerController = qn.zn().getServiceWorkerController();
            this.n3 = serviceWorkerController;
            this.zn = new b(serviceWorkerController.getServiceWorkerWebSettings());
        }
    }

    public final ServiceWorkerController gv() {
        if (this.y == null) {
            this.y = p.fb();
        }
        return this.y;
    }

    @Override // ro.zn
    public void n3(@Nullable ro.n3 n3Var) {
        y.zn znVar = j5.f5729f;
        if (znVar.zn()) {
            if (n3Var == null) {
                p.w(gv(), null);
                return;
            } else {
                p.p(gv(), n3Var);
                return;
            }
        }
        if (!znVar.gv()) {
            throw j5.y();
        }
        if (n3Var == null) {
            zn().setServiceWorkerClient(null);
        } else {
            zn().setServiceWorkerClient(kk1.y.zn(new a8(n3Var)));
        }
    }

    public final ServiceWorkerControllerBoundaryInterface zn() {
        if (this.n3 == null) {
            this.n3 = qn.zn().getServiceWorkerController();
        }
        return this.n3;
    }
}
