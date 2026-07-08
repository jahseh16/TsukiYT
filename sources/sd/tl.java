package sd;

import androidx.annotation.Nullable;
import ft.g;
import java.io.IOException;
import r0.p;

/* JADX INFO: loaded from: classes.dex */
public final class tl {
    public static h6.fb a(int i, g gVar) {
        String str = gVar.f4787r;
        return new h6.v((str == null || !(str.startsWith("video/webm") || str.startsWith("audio/webm"))) ? new tn.fb() : new x9.v(), i, gVar);
    }

    public static String fb(pv.tl tlVar, pv.t tVar) {
        String strF = tlVar.f();
        return strF != null ? strF : tVar.n3(tlVar.zn.get(0).y).toString();
    }

    public static void gv(h6.fb fbVar, r0.tl tlVar, pv.tl tlVar2, int i, boolean z) throws IOException {
        pv.t tVar = (pv.t) v0.y.v(tlVar2.wz());
        if (z) {
            pv.t tVarTl = tlVar2.tl();
            if (tVarTl == null) {
                return;
            }
            pv.t tVarY = tVar.y(tVarTl, tlVar2.zn.get(i).y);
            if (tVarY == null) {
                v(tlVar, tlVar2, i, fbVar, tVar);
                tVar = tVarTl;
            } else {
                tVar = tVarY;
            }
        }
        v(tlVar, tlVar2, i, fbVar, tVar);
    }

    @Nullable
    public static b1.gv n3(r0.tl tlVar, int i, pv.tl tlVar2) throws IOException {
        return zn(tlVar, i, tlVar2, 0);
    }

    public static void v(r0.tl tlVar, pv.tl tlVar2, int i, h6.fb fbVar, pv.t tVar) throws IOException {
        new h6.tl(tlVar, y(tlVar2, tlVar2.zn.get(i).y, tVar, 0), tlVar2.n3, 0, null, fbVar).i9();
    }

    public static p y(pv.tl tlVar, String str, pv.t tVar, int i) {
        return new p.n3().c5(tVar.n3(str)).s(tVar.y).fb(tVar.n3).a(fb(tlVar, tVar)).n3(i).y();
    }

    @Nullable
    public static b1.gv zn(r0.tl tlVar, int i, pv.tl tlVar2, int i5) throws IOException {
        if (tlVar2.wz() == null) {
            return null;
        }
        h6.fb fbVarA = a(i, tlVar2.n3);
        try {
            gv(fbVarA, tlVar, tlVar2, i5, true);
            fbVarA.release();
            return fbVarA.zn();
        } catch (Throwable th) {
            fbVarA.release();
            throw th;
        }
    }
}
