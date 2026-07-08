package ft;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.List;
import ur.mg;

/* JADX INFO: loaded from: classes.dex */
public final class fc {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public static final mg.n3 f4741co = new mg.n3(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final p f4742a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final n0.a8 f4743c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mg.n3 f4744f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f4745fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final long f4746gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final List<Metadata> f4747i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public volatile long f4748mt;
    public final mg.n3 n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile long f4749p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ur.lc f4750s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f4751t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final int f4752tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f4753v;
    public volatile long w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public final uo f4754wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final boolean f4755xc;
    public final xq y;
    public final long zn;

    public fc(xq xqVar, mg.n3 n3Var, long j, long j4, int i, @Nullable p pVar, boolean z, ur.lc lcVar, n0.a8 a8Var, List<Metadata> list, mg.n3 n3Var2, boolean z5, int i5, uo uoVar, long j7, long j8, long j9, boolean z7) {
        this.y = xqVar;
        this.n3 = n3Var;
        this.zn = j;
        this.f4746gv = j4;
        this.f4753v = i;
        this.f4742a = pVar;
        this.f4745fb = z;
        this.f4750s = lcVar;
        this.f4743c5 = a8Var;
        this.f4747i9 = list;
        this.f4744f = n3Var2;
        this.f4751t = z5;
        this.f4752tl = i5;
        this.f4754wz = uoVar;
        this.w = j7;
        this.f4749p = j8;
        this.f4748mt = j9;
        this.f4755xc = z7;
    }

    public static mg.n3 f() {
        return f4741co;
    }

    public static fc i9(n0.a8 a8Var) {
        xq xqVar = xq.y;
        mg.n3 n3Var = f4741co;
        return new fc(xqVar, n3Var, -9223372036854775807L, 0L, 1, null, false, ur.lc.f8604s, a8Var, k4.r.yt(), n3Var, false, 0, uo.f5058s, 0L, 0L, 0L, false);
    }

    @CheckResult
    public fc a(uo uoVar) {
        return new fc(this.y, this.n3, this.zn, this.f4746gv, this.f4753v, this.f4742a, this.f4745fb, this.f4750s, this.f4743c5, this.f4747i9, this.f4744f, this.f4751t, this.f4752tl, uoVar, this.w, this.f4749p, this.f4748mt, this.f4755xc);
    }

    @CheckResult
    public fc c5(xq xqVar) {
        return new fc(xqVar, this.n3, this.zn, this.f4746gv, this.f4753v, this.f4742a, this.f4745fb, this.f4750s, this.f4743c5, this.f4747i9, this.f4744f, this.f4751t, this.f4752tl, this.f4754wz, this.w, this.f4749p, this.f4748mt, this.f4755xc);
    }

    @CheckResult
    public fc fb(int i) {
        return new fc(this.y, this.n3, this.zn, this.f4746gv, i, this.f4742a, this.f4745fb, this.f4750s, this.f4743c5, this.f4747i9, this.f4744f, this.f4751t, this.f4752tl, this.f4754wz, this.w, this.f4749p, this.f4748mt, this.f4755xc);
    }

    @CheckResult
    public fc gv(boolean z, int i) {
        return new fc(this.y, this.n3, this.zn, this.f4746gv, this.f4753v, this.f4742a, this.f4745fb, this.f4750s, this.f4743c5, this.f4747i9, this.f4744f, z, i, this.f4754wz, this.w, this.f4749p, this.f4748mt, this.f4755xc);
    }

    @CheckResult
    public fc n3(mg.n3 n3Var) {
        return new fc(this.y, this.n3, this.zn, this.f4746gv, this.f4753v, this.f4742a, this.f4745fb, this.f4750s, this.f4743c5, this.f4747i9, n3Var, this.f4751t, this.f4752tl, this.f4754wz, this.w, this.f4749p, this.f4748mt, this.f4755xc);
    }

    @CheckResult
    public fc s(boolean z) {
        return new fc(this.y, this.n3, this.zn, this.f4746gv, this.f4753v, this.f4742a, this.f4745fb, this.f4750s, this.f4743c5, this.f4747i9, this.f4744f, this.f4751t, this.f4752tl, this.f4754wz, this.w, this.f4749p, this.f4748mt, z);
    }

    @CheckResult
    public fc v(@Nullable p pVar) {
        return new fc(this.y, this.n3, this.zn, this.f4746gv, this.f4753v, pVar, this.f4745fb, this.f4750s, this.f4743c5, this.f4747i9, this.f4744f, this.f4751t, this.f4752tl, this.f4754wz, this.w, this.f4749p, this.f4748mt, this.f4755xc);
    }

    @CheckResult
    public fc y(boolean z) {
        return new fc(this.y, this.n3, this.zn, this.f4746gv, this.f4753v, this.f4742a, z, this.f4750s, this.f4743c5, this.f4747i9, this.f4744f, this.f4751t, this.f4752tl, this.f4754wz, this.w, this.f4749p, this.f4748mt, this.f4755xc);
    }

    @CheckResult
    public fc zn(mg.n3 n3Var, long j, long j4, long j7, long j8, ur.lc lcVar, n0.a8 a8Var, List<Metadata> list) {
        return new fc(this.y, n3Var, j4, j7, this.f4753v, this.f4742a, this.f4745fb, lcVar, a8Var, list, this.f4744f, this.f4751t, this.f4752tl, this.f4754wz, this.w, j8, j, this.f4755xc);
    }
}
