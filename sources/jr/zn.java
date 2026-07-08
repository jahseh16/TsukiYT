package jr;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import ic.i9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.v;
import n7.p;
import uo.mg;
import uo.ud;

/* JADX INFO: loaded from: classes.dex */
public class zn extends n3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f5955d;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final Paint f5956ej;

    @Nullable
    public n7.y<Float, Float> mg;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public final List<n3> f5957ta;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public boolean f5958ud;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public final RectF f5959z6;

    public static /* synthetic */ class y {
        public static final /* synthetic */ int[] y;

        static {
            int[] iArr = new int[v.n3.values().length];
            y = iArr;
            try {
                iArr[v.n3.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                y[v.n3.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public zn(mg mgVar, v vVar, List<v> list, uo.s sVar) {
        int i;
        n3 n3Var;
        super(mgVar, vVar);
        this.f5957ta = new ArrayList();
        this.f5955d = new RectF();
        this.f5959z6 = new RectF();
        this.f5956ej = new Paint();
        this.f5958ud = true;
        ia.n3 n3VarR = vVar.r();
        if (n3VarR != null) {
            n7.y<Float, Float> yVarY = n3VarR.y();
            this.mg = yVarY;
            c5(yVarY);
            this.mg.y(this);
        } else {
            this.mg = null;
        }
        x4.v vVar2 = new x4.v(sVar.f().size());
        int size = list.size() - 1;
        n3 n3Var2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            v vVar3 = list.get(size);
            n3 n3VarR2 = n3.r(this, vVar3, mgVar, sVar);
            if (n3VarR2 != null) {
                vVar2.tl(n3VarR2.n().gv(), n3VarR2);
                if (n3Var2 != null) {
                    n3Var2.ud(n3VarR2);
                    n3Var2 = null;
                } else {
                    this.f5957ta.add(0, n3VarR2);
                    int i5 = y.y[vVar3.s().ordinal()];
                    if (i5 == 1 || i5 == 2) {
                        n3Var2 = n3VarR2;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < vVar2.w(); i++) {
            n3 n3Var3 = (n3) vVar2.s(vVar2.t(i));
            if (n3Var3 != null && (n3Var = (n3) vVar2.s(n3Var3.n().i9())) != null) {
                n3Var3.x(n3Var);
            }
        }
    }

    @Override // jr.n3
    public void a8(boolean z) {
        super.a8(z);
        Iterator<n3> it = this.f5957ta.iterator();
        while (it.hasNext()) {
            it.next().a8(z);
        }
    }

    @Override // jr.n3
    public void b(float f3) {
        super.b(f3);
        if (this.mg != null) {
            f3 = ((this.mg.s().floatValue() * this.f5912p.n3().c5()) - this.f5912p.n3().w()) / (this.w.d().v() + 0.01f);
        }
        if (this.mg == null) {
            f3 -= this.f5912p.mt();
        }
        if (this.f5912p.x4() != 0.0f && !"__container".equals(this.f5912p.c5())) {
            f3 /= this.f5912p.x4();
        }
        for (int size = this.f5957ta.size() - 1; size >= 0; size--) {
            this.f5957ta.get(size).b(f3);
        }
    }

    @Override // jr.n3
    public void ej(h.v vVar, int i, List<h.v> list, h.v vVar2) {
        for (int i5 = 0; i5 < this.f5957ta.size(); i5++) {
            this.f5957ta.get(i5).v(vVar, i, list, vVar2);
        }
    }

    @Override // jr.n3, mh.v
    public void gv(RectF rectF, Matrix matrix, boolean z) {
        super.gv(rectF, matrix, z);
        for (int size = this.f5957ta.size() - 1; size >= 0; size--) {
            this.f5955d.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f5957ta.get(size).gv(this.f5955d, this.f5920xc, true);
            rectF.union(this.f5955d);
        }
    }

    @Override // jr.n3, h.a
    public <T> void s(T t3, @Nullable gn.zn<T> znVar) {
        super.s(t3, znVar);
        if (t3 == ud.f8450ta) {
            if (znVar == null) {
                n7.y<Float, Float> yVar = this.mg;
                if (yVar != null) {
                    yVar.wz(null);
                    return;
                }
                return;
            }
            p pVar = new p(znVar);
            this.mg = pVar;
            pVar.y(this);
            c5(this.mg);
        }
    }

    public void vl(boolean z) {
        this.f5958ud = z;
    }

    @Override // jr.n3
    public void z(Canvas canvas, Matrix matrix, int i) {
        uo.zn.y("CompositionLayer#draw");
        this.f5959z6.set(0.0f, 0.0f, this.f5912p.t(), this.f5912p.f());
        matrix.mapRect(this.f5959z6);
        boolean z = this.w.jz() && this.f5957ta.size() > 1 && i != 255;
        if (z) {
            this.f5956ej.setAlpha(i);
            i9.tl(canvas, this.f5959z6, this.f5956ej);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f5957ta.size() - 1; size >= 0; size--) {
            if (((this.f5958ud || !"__container".equals(this.f5912p.c5())) && !this.f5959z6.isEmpty()) ? canvas.clipRect(this.f5959z6) : true) {
                this.f5957ta.get(size).fb(canvas, matrix, i);
            }
        }
        canvas.restore();
        uo.zn.n3("CompositionLayer#draw");
    }
}
