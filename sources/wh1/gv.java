package wh1;

import android.app.Application;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gv {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static Pair<String, String> f9015v;
    public static final gv y = new gv();
    public static final Lazy n3 = LazyKt.lazy(new Function0() { // from class: wh1.y
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return gv.fb();
        }
    });
    public static final Lazy zn = LazyKt.lazy(new Function0() { // from class: wh1.n3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return gv.f();
        }
    });

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final Lazy f9014gv = LazyKt.lazy(new Function0() { // from class: wh1.zn
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return gv.c5();
        }
    });

    public static final Pair c5() {
        return y.s(lh1.y.y());
    }

    public static final String f() {
        return y.i9(lh1.y.y());
    }

    public static final Boolean fb() {
        return y.a(lh1.y.y());
    }

    public final Boolean a(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        String strI9 = i9(application);
        if (Intrinsics.areEqual(strI9, "1")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.areEqual(strI9, "0")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final Pair<String, String> gv() {
        return (Pair) f9014gv.getValue();
    }

    public final String i9(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return s(application).getFirst();
    }

    public final Pair<String, String> s(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        Pair<String, String> pair = f9015v;
        if (pair != null) {
            return pair;
        }
        String strZn = oh1.zn.y.zn(application);
        if (strZn == null) {
            return TuplesKt.to("unknown", null);
        }
        Pair<String, String> pair2 = Intrinsics.areEqual(strZn, "6af5c6cdbc72047fae04fe4c9ddddc3b") ? TuplesKt.to("0", null) : TuplesKt.to("1", strZn);
        f9015v = pair2;
        return pair2;
    }

    public final String v() {
        return (String) zn.getValue();
    }
}
