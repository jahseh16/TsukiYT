package oj1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ta extends zn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj1.f3 f7164a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(nj1.y json, nj1.f3 value) {
        super(json, value, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7164a = value;
        k("primitive");
    }

    @Override // oj1.zn
    public nj1.s dm(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag == "primitive") {
            return rb();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // oj1.zn
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public nj1.f3 rb() {
        return this.f7164a;
    }

    @Override // lj1.zn
    public int x4(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return 0;
    }
}
