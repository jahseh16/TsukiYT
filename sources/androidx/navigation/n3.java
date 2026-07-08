package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Object f967gv;
    public final boolean n3;
    public final wz<Object> y;
    public final boolean zn;

    public static final class y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public boolean f968gv;
        public boolean n3;
        public wz<Object> y;
        public Object zn;

        public final <T> y gv(wz<T> type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.y = type;
            return this;
        }

        public final y n3(Object obj) {
            this.zn = obj;
            this.f968gv = true;
            return this;
        }

        public final n3 y() {
            wz<Object> wzVarZn = this.y;
            if (wzVarZn == null) {
                wzVarZn = wz.zn.zn(this.zn);
                Intrinsics.checkNotNull(wzVarZn, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new n3(wzVarZn, this.n3, this.zn, this.f968gv);
        }

        public final y zn(boolean z) {
            this.n3 = z;
            return this;
        }
    }

    public n3(wz<Object> type, boolean z, Object obj, boolean z5) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!type.zn() && z) {
            throw new IllegalArgumentException((type.n3() + " does not allow nullable values").toString());
        }
        if (!z && z5 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.n3() + " has null value but is not nullable.").toString());
        }
        this.y = type;
        this.n3 = z;
        this.f967gv = obj;
        this.zn = z5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(n3.class, obj.getClass())) {
            return false;
        }
        n3 n3Var = (n3) obj;
        if (this.n3 != n3Var.n3 || this.zn != n3Var.zn || !Intrinsics.areEqual(this.y, n3Var.y)) {
            return false;
        }
        Object obj2 = this.f967gv;
        return obj2 != null ? Intrinsics.areEqual(obj2, n3Var.f967gv) : n3Var.f967gv == null;
    }

    public final void gv(String name, Bundle bundle) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (this.zn) {
            this.y.s(bundle, name, this.f967gv);
        }
    }

    public int hashCode() {
        int iHashCode = ((((this.y.hashCode() * 31) + (this.n3 ? 1 : 0)) * 31) + (this.zn ? 1 : 0)) * 31;
        Object obj = this.f967gv;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final boolean n3() {
        return this.zn;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(n3.class.getSimpleName());
        sb.append(" Type: " + this.y);
        sb.append(" Nullable: " + this.n3);
        if (this.zn) {
            sb.append(" DefaultValue: " + this.f967gv);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public final boolean v(String name, Bundle bundle) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (!this.n3 && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        try {
            this.y.y(bundle, name);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final wz<Object> y() {
        return this.y;
    }

    public final boolean zn() {
        return this.n3;
    }
}
