package zj1;

import hk1.fb;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import sj1.z;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final C0203y zn = new C0203y(null);
    public long n3;
    public final fb y;

    /* JADX INFO: renamed from: zj1.y$y, reason: collision with other inner class name */
    public static final class C0203y {
        public /* synthetic */ C0203y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0203y() {
        }
    }

    public y(fb source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.y = source;
        this.n3 = 262144L;
    }

    public final String n3() {
        String strF = this.y.f(this.n3);
        this.n3 -= (long) strF.length();
        return strF;
    }

    public final z y() {
        z.y yVar = new z.y();
        while (true) {
            String strN3 = n3();
            if (strN3.length() == 0) {
                return yVar.a();
            }
            yVar.zn(strN3);
        }
    }
}
