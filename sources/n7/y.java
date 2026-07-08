package n7;

import android.view.animation.Interpolator;
import androidx.annotation.Nullable;
import gn.zn;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class y<K, A> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public zn<A> f6935v;
    public final gv<K> zn;
    public final List<n3> y = new ArrayList(1);
    public boolean n3 = false;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public float f6933gv = 0.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public A f6931a = null;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public float f6932fb = -1.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f6934s = -1.0f;

    public interface n3 {
        void y();
    }

    public y(List<? extends gn.y<K>> list) {
        this.zn = xc(list);
    }

    public static <T> gv<T> xc(List<? extends gn.y<T>> list) {
        return list.isEmpty() ? new zn((y) null) : list.size() == 1 ? new a(list) : new v(list);
    }

    public float a() {
        return this.f6933gv;
    }

    public abstract A c5(gn.y<K> yVar, float f3);

    public void f() {
        for (int i = 0; i < this.y.size(); i++) {
            this.y.get(i).y();
        }
    }

    public final float fb() {
        if (this.f6932fb == -1.0f) {
            this.f6932fb = this.zn.gv();
        }
        return this.f6932fb;
    }

    public float gv() {
        gn.y<K> yVarN3 = n3();
        if (yVarN3 == null || yVarN3.c5()) {
            return 0.0f;
        }
        return yVarN3.gv.getInterpolation(v());
    }

    public A i9(gn.y<K> yVar, float f3, float f4, float f5) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public gn.y<K> n3() {
        uo.zn.y("BaseKeyframeAnimation#getCurrentKeyframe");
        gn.y<K> yVarN3 = this.zn.n3();
        uo.zn.n3("BaseKeyframeAnimation#getCurrentKeyframe");
        return yVarN3;
    }

    public A s() {
        float fV = v();
        if (this.f6935v == null && this.zn.y(fV)) {
            return this.f6931a;
        }
        gn.y<K> yVarN3 = n3();
        Interpolator interpolator = yVarN3.v;
        A aC5 = (interpolator == null || yVarN3.a == null) ? c5(yVarN3, gv()) : i9(yVarN3, fV, interpolator.getInterpolation(fV), yVarN3.a.getInterpolation(fV));
        this.f6931a = aC5;
        return aC5;
    }

    public void t() {
        this.n3 = true;
    }

    public void tl(float f3) {
        if (this.zn.isEmpty()) {
            return;
        }
        if (f3 < fb()) {
            f3 = fb();
        } else if (f3 > zn()) {
            f3 = zn();
        }
        if (f3 == this.f6933gv) {
            return;
        }
        this.f6933gv = f3;
        if (this.zn.zn(f3)) {
            f();
        }
    }

    public float v() {
        if (this.n3) {
            return 0.0f;
        }
        gn.y<K> yVarN3 = n3();
        if (yVarN3.c5()) {
            return 0.0f;
        }
        return (this.f6933gv - yVarN3.a()) / (yVarN3.zn() - yVarN3.a());
    }

    public void wz(@Nullable zn<A> znVar) {
        zn<A> znVar2 = this.f6935v;
        if (znVar2 != null) {
            znVar2.zn(null);
        }
        this.f6935v = znVar;
        if (znVar != null) {
            znVar.zn(this);
        }
    }

    public void y(n3 n3Var) {
        this.y.add(n3Var);
    }

    public float zn() {
        if (this.f6934s == -1.0f) {
            this.f6934s = this.zn.v();
        }
        return this.f6934s;
    }
}
