package oj1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d extends gv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nj1.s f7143a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(nj1.y json, Function1<? super nj1.s, Unit> nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        en("primitive");
    }

    @Override // oj1.gv
    public nj1.s kp() {
        nj1.s sVar = this.f7143a;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }

    @Override // oj1.gv
    public void rb(String key, nj1.s element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        if (key != "primitive") {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
        }
        if (this.f7143a != null) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
        this.f7143a = element;
    }
}
