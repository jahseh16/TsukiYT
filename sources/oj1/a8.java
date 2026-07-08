package oj1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class a8 extends gv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, nj1.s> f7139a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(nj1.y json, Function1<? super nj1.s, Unit> nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.f7139a = new LinkedHashMap();
    }

    public final Map<String, nj1.s> g3() {
        return this.f7139a;
    }

    @Override // mj1.qj, lj1.gv
    public <T> void i4(kj1.a descriptor, int i, ij1.f<? super T> serializer, T t3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (t3 != null || this.f7148gv.a()) {
            super.i4(descriptor, i, serializer, t3);
        }
    }

    @Override // oj1.gv
    public nj1.s kp() {
        return new nj1.r(this.f7139a);
    }

    @Override // oj1.gv
    public void rb(String key, nj1.s element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f7139a.put(key, element);
    }
}
