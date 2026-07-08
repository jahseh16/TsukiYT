package lf;

import ft.g;
import java.util.List;
import lf.ud;

/* JADX INFO: loaded from: classes.dex */
public final class mg {
    public final b1.ta[] n3;
    public final List<g> y;

    public mg(List<g> list) {
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
            String strN3 = gVar.y;
            if (strN3 == null) {
                strN3 = gvVar.n3();
            }
            taVarA.y(new g.n3().oz(strN3).o4(str).eb(gVar.f4788s).k(gVar.f4782fb).ej(gVar.f7).ut(gVar.c).z6());
            this.n3[i] = taVarA;
        }
    }

    public void y(long j, v0.d dVar) {
        b1.zn.y(j, dVar, this.n3);
    }
}
