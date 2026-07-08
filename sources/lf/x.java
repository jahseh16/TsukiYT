package lf;

import ft.g;
import java.util.List;
import lf.ud;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public final b1.ta[] n3;
    public final List<g> y;

    public x(List<g> list) {
        this.y = list;
        this.n3 = new b1.ta[list.size()];
    }

    public void n3(b1.wz wzVar, ud.gv gvVar) {
        for (int i = 0; i < this.n3.length; i++) {
            gvVar.y();
            b1.ta taVarA = wzVar.a(gvVar.zn(), 3);
            g gVar = this.y.get(i);
            String str = gVar.f3;
            v0.y.n3("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            taVarA.y(new g.n3().oz(gvVar.n3()).o4(str).eb(gVar.f4788s).k(gVar.f4782fb).ej(gVar.f7).ut(gVar.c).z6());
            this.n3[i] = taVarA;
        }
    }

    public void y(long j, v0.d dVar) {
        if (dVar.y() < 9) {
            return;
        }
        int iP = dVar.p();
        int iP2 = dVar.p();
        int iEj = dVar.ej();
        if (iP == 434 && iP2 == 1195456820 && iEj == 3) {
            b1.zn.n3(j, dVar, this.n3);
        }
    }
}
