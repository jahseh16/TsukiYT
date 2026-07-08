package oj1;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k5 extends ud {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nj1.r f7155f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<String> f7156t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final int f7157tl;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public int f7158wz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(nj1.y json, nj1.r value) {
        super(json, value, null, null, 12, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7155f = value;
        List<String> list = CollectionsKt.toList(rb().keySet());
        this.f7156t = list;
        this.f7157tl = list.size() * 2;
        this.f7158wz = -1;
    }

    @Override // oj1.ud, oj1.zn
    public nj1.s dm(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return this.f7158wz % 2 == 0 ? nj1.i9.zn(tag) : (nj1.s) MapsKt.getValue(rb(), tag);
    }

    @Override // oj1.ud, mj1.rs
    public String jz(kj1.a desc, int i) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        return this.f7156t.get(i / 2);
    }

    @Override // oj1.ud, oj1.zn
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public nj1.r rb() {
        return this.f7155f;
    }

    @Override // oj1.ud, lj1.zn
    public int x4(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = this.f7158wz;
        if (i >= this.f7157tl - 1) {
            return -1;
        }
        int i5 = i + 1;
        this.f7158wz = i5;
        return i5;
    }

    @Override // oj1.ud, oj1.zn, lj1.zn
    public void zn(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }
}
