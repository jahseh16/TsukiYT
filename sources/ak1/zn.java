package ak1;

import hk1.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hk1.s f191a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final hk1.s f192c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final hk1.s f193fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final y f194gv = new y(null);

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final hk1.s f195i9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final hk1.s f196s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final hk1.s f197v;
    public final hk1.s n3;
    public final hk1.s y;
    public final int zn;

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public y() {
        }
    }

    static {
        s.y yVar = hk1.s.fb;
        f197v = yVar.gv(":");
        f191a = yVar.gv(":status");
        f193fb = yVar.gv(":method");
        f196s = yVar.gv(":path");
        f192c5 = yVar.gv(":scheme");
        f195i9 = yVar.gv(":authority");
    }

    public zn(hk1.s name, hk1.s value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.y = name;
        this.n3 = value;
        this.zn = name.ct() + 32 + value.ct();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn)) {
            return false;
        }
        zn znVar = (zn) obj;
        return Intrinsics.areEqual(this.y, znVar.y) && Intrinsics.areEqual(this.n3, znVar.n3);
    }

    public int hashCode() {
        return (this.y.hashCode() * 31) + this.n3.hashCode();
    }

    public final hk1.s n3() {
        return this.n3;
    }

    public String toString() {
        return this.y.yg() + ": " + this.n3.yg();
    }

    public final hk1.s y() {
        return this.y;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zn(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        s.y yVar = hk1.s.fb;
        this(yVar.gv(name), yVar.gv(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zn(hk1.s name, String value) {
        this(name, hk1.s.fb.gv(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
