package oj1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x extends zn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj1.n3 f7171a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f7172fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7173s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(nj1.y json, nj1.n3 value) {
        super(json, value, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7171a = value;
        this.f7172fb = rb().size();
        this.f7173s = -1;
    }

    @Override // oj1.zn
    public nj1.s dm(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return rb().get(Integer.parseInt(tag));
    }

    @Override // mj1.rs
    public String jz(kj1.a desc, int i) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        return String.valueOf(i);
    }

    @Override // oj1.zn
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public nj1.n3 rb() {
        return this.f7171a;
    }

    @Override // lj1.zn
    public int x4(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = this.f7173s;
        if (i >= this.f7172fb - 1) {
            return -1;
        }
        int i5 = i + 1;
        this.f7173s = i5;
        return i5;
    }
}
