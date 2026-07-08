package kj1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes.dex */
public abstract class i9 {

    public static final class n3 extends i9 {
        public static final n3 y = new n3();

        public n3() {
            super(null);
        }
    }

    public static final class y extends i9 {
        public static final y y = new y();

        public y() {
            super(null);
        }
    }

    public /* synthetic */ i9(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        String simpleName = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        Intrinsics.checkNotNull(simpleName);
        return simpleName;
    }

    public i9() {
    }
}
