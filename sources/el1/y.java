package el1;

import cl1.gv;
import cl1.zn;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final HashSet<gl1.y> f3345gv;
    public HashSet<gv<?>> n3;
    public final boolean y;
    public final HashMap<String, zn<?>> zn;

    public y() {
        this(false, 1, null);
    }

    public static /* synthetic */ void a(y yVar, String str, zn znVar, boolean z, int i, Object obj) throws bl1.n3 {
        if ((i & 4) != 0) {
            z = false;
        }
        yVar.v(str, znVar, z);
    }

    public final HashSet<gl1.y> gv() {
        return this.f3345gv;
    }

    public final HashSet<gv<?>> n3() {
        return this.n3;
    }

    public final void v(String mapping, zn<?> factory, boolean z) throws bl1.n3 {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(factory, "factory");
        if (!z && this.zn.containsKey(mapping)) {
            n3.y(factory, mapping);
        }
        this.zn.put(mapping, factory);
    }

    public final boolean y() {
        return this.y;
    }

    public final HashMap<String, zn<?>> zn() {
        return this.zn;
    }

    public y(boolean z) {
        this.y = z;
        this.n3 = new HashSet<>();
        this.zn = new HashMap<>();
        this.f3345gv = new HashSet<>();
    }

    public /* synthetic */ y(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
