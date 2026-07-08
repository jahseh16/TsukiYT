package nj1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import oj1.q9;

/* JADX INFO: loaded from: classes.dex */
public final class w extends f3 {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f6972fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f6973s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Object body, boolean z) {
        super(null);
        Intrinsics.checkNotNullParameter(body, "body");
        this.f6972fb = z;
        this.f6973s = body.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(w.class), Reflection.getOrCreateKotlinClass(obj.getClass()))) {
            return false;
        }
        w wVar = (w) obj;
        return zn() == wVar.zn() && Intrinsics.areEqual(y(), wVar.y());
    }

    public int hashCode() {
        return (o0.n3.y(zn()) * 31) + y().hashCode();
    }

    @Override // nj1.f3
    public String toString() {
        if (!zn()) {
            return y();
        }
        StringBuilder sb = new StringBuilder();
        q9.zn(sb, y());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // nj1.f3
    public String y() {
        return this.f6973s;
    }

    public boolean zn() {
        return this.f6972fb;
    }
}
