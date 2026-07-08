package yj1;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import sj1.d0;
import sj1.rz;
import sj1.x4;

/* JADX INFO: loaded from: classes.dex */
public final class fb implements x4.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9322a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f9323c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f9324fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final xj1.zn f9325gv;
    public final List<x4> n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f9326s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d0 f9327v;
    public final xj1.v y;
    public final int zn;

    /* JADX WARN: Multi-variable type inference failed */
    public fb(xj1.v call, List<? extends x4> interceptors, int i, xj1.zn znVar, d0 request, int i5, int i8, int i10) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.y = call;
        this.n3 = interceptors;
        this.zn = i;
        this.f9325gv = znVar;
        this.f9327v = request;
        this.f9322a = i5;
        this.f9324fb = i8;
        this.f9326s = i10;
    }

    public static /* synthetic */ fb v(fb fbVar, int i, xj1.zn znVar, d0 d0Var, int i5, int i8, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = fbVar.zn;
        }
        if ((i11 & 2) != 0) {
            znVar = fbVar.f9325gv;
        }
        xj1.zn znVar2 = znVar;
        if ((i11 & 4) != 0) {
            d0Var = fbVar.f9327v;
        }
        d0 d0Var2 = d0Var;
        if ((i11 & 8) != 0) {
            i5 = fbVar.f9322a;
        }
        int i12 = i5;
        if ((i11 & 16) != 0) {
            i8 = fbVar.f9324fb;
        }
        int i13 = i8;
        if ((i11 & 32) != 0) {
            i10 = fbVar.f9326s;
        }
        return fbVar.gv(i, znVar2, d0Var2, i12, i13, i10);
    }

    public final xj1.v a() {
        return this.y;
    }

    public final int c5() {
        return this.f9324fb;
    }

    @Override // sj1.x4.y
    public sj1.v call() {
        return this.y;
    }

    public final int f() {
        return this.f9326s;
    }

    public final int fb() {
        return this.f9322a;
    }

    public final fb gv(int i, xj1.zn znVar, d0 request, int i5, int i8, int i10) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new fb(this.y, this.n3, i, znVar, request, i5, i8, i10);
    }

    public final d0 i9() {
        return this.f9327v;
    }

    @Override // sj1.x4.y
    public rz n3(d0 request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.zn >= this.n3.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f9323c5++;
        xj1.zn znVar = this.f9325gv;
        if (znVar != null) {
            if (!znVar.i9().fb(request.t())) {
                throw new IllegalStateException(("network interceptor " + this.n3.get(this.zn - 1) + " must retain the same host and port").toString());
            }
            if (this.f9323c5 != 1) {
                throw new IllegalStateException(("network interceptor " + this.n3.get(this.zn - 1) + " must call proceed() exactly once").toString());
            }
        }
        fb fbVarV = v(this, this.zn + 1, null, request, 0, 0, 0, 58, null);
        x4 x4Var = this.n3.get(this.zn);
        rz rzVarIntercept = x4Var.intercept(fbVarV);
        if (rzVarIntercept == null) {
            throw new NullPointerException("interceptor " + x4Var + " returned null");
        }
        if (this.f9325gv != null && this.zn + 1 < this.n3.size() && fbVarV.f9323c5 != 1) {
            throw new IllegalStateException(("network interceptor " + x4Var + " must call proceed() exactly once").toString());
        }
        if (rzVarIntercept.y() != null) {
            return rzVarIntercept;
        }
        throw new IllegalStateException(("interceptor " + x4Var + " returned a response with no body").toString());
    }

    public final xj1.zn s() {
        return this.f9325gv;
    }

    public int t() {
        return this.f9324fb;
    }

    @Override // sj1.x4.y
    public d0 y() {
        return this.f9327v;
    }

    @Override // sj1.x4.y
    public sj1.i9 zn() {
        xj1.zn znVar = this.f9325gv;
        if (znVar == null) {
            return null;
        }
        return znVar.s();
    }
}
