package wj1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long f9026gv;
    public final boolean n3;
    public final String y;
    public gv zn;

    public y(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.y = name;
        this.n3 = z;
        this.f9026gv = -1L;
    }

    public abstract long a();

    public final void fb(long j) {
        this.f9026gv = j;
    }

    public final gv gv() {
        return this.zn;
    }

    public final String n3() {
        return this.y;
    }

    public String toString() {
        return this.y;
    }

    public final void v(gv queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        gv gvVar = this.zn;
        if (gvVar == queue) {
            return;
        }
        if (gvVar != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.zn = queue;
    }

    public final boolean y() {
        return this.n3;
    }

    public final long zn() {
        return this.f9026gv;
    }

    public /* synthetic */ y(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
