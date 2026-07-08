package xk1;

import hl1.zn;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public final zn y = new zn(this);
    public final hl1.y n3 = new hl1.y(this);
    public final hl1.n3 zn = new hl1.n3(this);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public dl1.zn f9232gv = new dl1.y();

    /* JADX INFO: renamed from: xk1.y$y, reason: collision with other inner class name */
    public static final class C0195y extends Lambda implements Function0<Unit> {
        public C0195y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            y.this.n3().y();
        }
    }

    public static /* synthetic */ void fb(y yVar, List list, boolean z, int i, Object obj) throws bl1.n3 {
        if ((i & 2) != 0) {
            z = true;
        }
        yVar.a(list, z);
    }

    public final void a(List<el1.y> modules, boolean z) throws bl1.n3 {
        Intrinsics.checkNotNullParameter(modules, "modules");
        this.n3.v(modules, z);
        this.y.gv(modules);
    }

    public final void c5(dl1.zn logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f9232gv = logger;
    }

    public final <T> T gv(String key, T defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t3 = (T) this.zn.y(key);
        return t3 == null ? defaultValue : t3;
    }

    public final hl1.y n3() {
        return this.n3;
    }

    public final void s(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.zn.n3(key, value);
    }

    public final zn v() {
        return this.y;
    }

    public final void y() {
        this.f9232gv.a("create eager instances ...");
        if (!this.f9232gv.fb(dl1.n3.DEBUG)) {
            this.n3.y();
            return;
        }
        double dY = jl1.y.y(new C0195y());
        this.f9232gv.n3("eager instances created in " + dY + " ms");
    }

    public final dl1.zn zn() {
        return this.f9232gv;
    }
}
