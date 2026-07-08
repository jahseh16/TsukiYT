package vk1;

import ap.j5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qk.v;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final C0188y zn = new C0188y(null);
    public final v n3;
    public final j5 y;

    /* JADX INFO: renamed from: vk1.y$y, reason: collision with other inner class name */
    public static final class C0188y {
        public /* synthetic */ C0188y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y y(j5 storeOwner, v vVar) {
            Intrinsics.checkNotNullParameter(storeOwner, "storeOwner");
            return new y(storeOwner, vVar);
        }

        public C0188y() {
        }
    }

    public y(j5 storeOwner, v vVar) {
        Intrinsics.checkNotNullParameter(storeOwner, "storeOwner");
        this.y = storeOwner;
        this.n3 = vVar;
    }

    public final j5 n3() {
        return this.y;
    }

    public final v y() {
        return this.n3;
    }
}
