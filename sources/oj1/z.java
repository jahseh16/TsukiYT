package oj1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    public static final f y(hw sb, nj1.y json) {
        Intrinsics.checkNotNullParameter(sb, "sb");
        Intrinsics.checkNotNullParameter(json, "json");
        return json.v().s() ? new co(sb, json) : new f(sb);
    }
}
