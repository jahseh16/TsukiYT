package ia;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import n7.w;
import r6.zn;
import uo.mg;
import uo.s;

/* JADX INFO: loaded from: classes.dex */
public class t implements zn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final n3 f5657a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public final n3 f5658c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public final n3 f5659fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public final n3 f5660gv;

    @Nullable
    public final tl<PointF, PointF> n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final n3 f5661s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final gv f5662v;

    @Nullable
    public final v y;

    @Nullable
    public final fb zn;

    public t() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Nullable
    public tl<PointF, PointF> a() {
        return this.n3;
    }

    @Nullable
    public n3 c5() {
        return this.f5657a;
    }

    @Nullable
    public n3 f() {
        return this.f5661s;
    }

    @Nullable
    public n3 fb() {
        return this.f5660gv;
    }

    @Nullable
    public n3 gv() {
        return this.f5658c5;
    }

    @Nullable
    public n3 i9() {
        return this.f5659fb;
    }

    public w n3() {
        return new w(this);
    }

    @Nullable
    public fb s() {
        return this.zn;
    }

    @Nullable
    public gv v() {
        return this.f5662v;
    }

    @Override // r6.zn
    @Nullable
    public mh.zn y(mg mgVar, s sVar, jr.n3 n3Var) {
        return null;
    }

    @Nullable
    public v zn() {
        return this.y;
    }

    public t(@Nullable v vVar, @Nullable tl<PointF, PointF> tlVar, @Nullable fb fbVar, @Nullable n3 n3Var, @Nullable gv gvVar, @Nullable n3 n3Var2, @Nullable n3 n3Var3, @Nullable n3 n3Var4, @Nullable n3 n3Var5) {
        this.y = vVar;
        this.n3 = tlVar;
        this.zn = fbVar;
        this.f5660gv = n3Var;
        this.f5662v = gvVar;
        this.f5661s = n3Var2;
        this.f5658c5 = n3Var3;
        this.f5657a = n3Var4;
        this.f5659fb = n3Var5;
    }
}
