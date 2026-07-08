package oj1;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b extends gv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<nj1.s> f7140a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(nj1.y json, Function1<? super nj1.s, Unit> nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.f7140a = new ArrayList<>();
    }

    @Override // oj1.gv
    public nj1.s kp() {
        return new nj1.n3(this.f7140a);
    }

    @Override // oj1.gv
    public void rb(String key, nj1.s element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f7140a.add(Integer.parseInt(key), element);
    }

    @Override // mj1.eb
    public String u(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i);
    }
}
