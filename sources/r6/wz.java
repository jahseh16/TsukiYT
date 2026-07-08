package r6;

import android.graphics.PointF;
import ic.a;
import ic.c5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class wz {
    public PointF n3;
    public final List<h.y> y;
    public boolean zn;

    public wz(PointF pointF, boolean z, List<h.y> list) {
        this.n3 = pointF;
        this.zn = z;
        this.y = new ArrayList(list);
    }

    public void a(float f3, float f4) {
        if (this.n3 == null) {
            this.n3 = new PointF();
        }
        this.n3.set(f3, f4);
    }

    public boolean gv() {
        return this.zn;
    }

    public PointF n3() {
        return this.n3;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.y.size() + "closed=" + this.zn + '}';
    }

    public void v(boolean z) {
        this.zn = z;
    }

    public List<h.y> y() {
        return this.y;
    }

    public void zn(wz wzVar, wz wzVar2, float f3) {
        if (this.n3 == null) {
            this.n3 = new PointF();
        }
        this.zn = wzVar.gv() || wzVar2.gv();
        if (wzVar.y().size() != wzVar2.y().size()) {
            a.zn("Curves must have the same number of control points. Shape 1: " + wzVar.y().size() + "\tShape 2: " + wzVar2.y().size());
        }
        int iMin = Math.min(wzVar.y().size(), wzVar2.y().size());
        if (this.y.size() < iMin) {
            for (int size = this.y.size(); size < iMin; size++) {
                this.y.add(new h.y());
            }
        } else if (this.y.size() > iMin) {
            for (int size2 = this.y.size() - 1; size2 >= iMin; size2--) {
                List<h.y> list = this.y;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFN3 = wzVar.n3();
        PointF pointFN32 = wzVar2.n3();
        a(c5.c5(pointFN3.x, pointFN32.x, f3), c5.c5(pointFN3.y, pointFN32.y, f3));
        for (int size3 = this.y.size() - 1; size3 >= 0; size3--) {
            h.y yVar = wzVar.y().get(size3);
            h.y yVar2 = wzVar2.y().get(size3);
            PointF pointFY = yVar.y();
            PointF pointFN33 = yVar.n3();
            PointF pointFZn = yVar.zn();
            PointF pointFY2 = yVar2.y();
            PointF pointFN34 = yVar2.n3();
            PointF pointFZn2 = yVar2.zn();
            this.y.get(size3).gv(c5.c5(pointFY.x, pointFY2.x, f3), c5.c5(pointFY.y, pointFY2.y, f3));
            this.y.get(size3).v(c5.c5(pointFN33.x, pointFN34.x, f3), c5.c5(pointFN33.y, pointFN34.y, f3));
            this.y.get(size3).a(c5.c5(pointFZn.x, pointFZn2.x, f3), c5.c5(pointFZn.y, pointFZn2.y, f3));
        }
    }

    public wz() {
        this.y = new ArrayList();
    }
}
