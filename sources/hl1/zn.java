package hl1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zn {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final il1.y f5344gv;
    public final HashSet<gl1.y> n3;
    public final xk1.y y;
    public final Map<String, il1.y> zn;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final y f5343v = new y(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gl1.zn f5342a = gl1.n3.y("_");

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final gl1.zn y() {
            return zn.f5342a;
        }

        public y() {
        }
    }

    public zn(xk1.y _koin) {
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this.y = _koin;
        HashSet<gl1.y> hashSet = new HashSet<>();
        this.n3 = hashSet;
        Map<String, il1.y> mapGv = ml1.y.y.gv();
        this.zn = mapGv;
        il1.y yVar = new il1.y(f5342a, "_", true, _koin);
        this.f5344gv = yVar;
        hashSet.add(yVar.fb());
        mapGv.put(yVar.v(), yVar);
    }

    public final void gv(List<el1.y> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Iterator<T> it = modules.iterator();
        while (it.hasNext()) {
            zn((el1.y) it.next());
        }
    }

    public final il1.y n3() {
        return this.f5344gv;
    }

    public final void zn(el1.y yVar) {
        this.n3.addAll(yVar.gv());
    }
}
