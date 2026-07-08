package yj1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a y = new a();

    public static final boolean n3(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.areEqual(method, "GET") || Intrinsics.areEqual(method, "HEAD")) ? false : true;
    }

    public static final boolean v(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.areEqual(method, "POST") || Intrinsics.areEqual(method, "PUT") || Intrinsics.areEqual(method, "PATCH") || Intrinsics.areEqual(method, "PROPPATCH") || Intrinsics.areEqual(method, "REPORT");
    }

    public final boolean gv(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.areEqual(method, "PROPFIND");
    }

    public final boolean y(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.areEqual(method, "POST") || Intrinsics.areEqual(method, "PATCH") || Intrinsics.areEqual(method, "PUT") || Intrinsics.areEqual(method, "DELETE") || Intrinsics.areEqual(method, "MOVE");
    }

    public final boolean zn(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return !Intrinsics.areEqual(method, "PROPFIND");
    }
}
