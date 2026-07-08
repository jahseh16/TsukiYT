package androidx.navigation;

import androidx.navigation.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f996a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f997fb;
    public boolean n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f999v;
    public boolean zn;
    public final t.y y = new t.y();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f998gv = -1;

    public final void a(String str) {
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            this.f999v = str;
            this.f996a = false;
        }
    }

    public final void fb(boolean z) {
        this.zn = z;
    }

    public final void gv(boolean z) {
        this.n3 = z;
    }

    public final t n3() {
        t.y yVar = this.y;
        yVar.gv(this.n3);
        yVar.i9(this.zn);
        String str = this.f999v;
        if (str != null) {
            yVar.s(str, this.f996a, this.f997fb);
        } else {
            yVar.fb(this.f998gv, this.f996a, this.f997fb);
        }
        return yVar.y();
    }

    public final void v(int i) {
        this.f998gv = i;
        this.f996a = false;
    }

    public final void y(Function1<? super u0.n3, Unit> animBuilder) {
        Intrinsics.checkNotNullParameter(animBuilder, "animBuilder");
        u0.n3 n3Var = new u0.n3();
        animBuilder.invoke(n3Var);
        this.y.n3(n3Var.y()).zn(n3Var.n3()).v(n3Var.zn()).a(n3Var.gv());
    }

    public final void zn(int i, Function1<? super u0.xc, Unit> popUpToBuilder) {
        Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
        v(i);
        a(null);
        u0.xc xcVar = new u0.xc();
        popUpToBuilder.invoke(xcVar);
        this.f996a = xcVar.y();
        this.f997fb = xcVar.n3();
    }
}
