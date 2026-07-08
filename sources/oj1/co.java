package oj1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class co extends f {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f7142gv;
    public final nj1.y zn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(hw writer, nj1.y json) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.zn = json;
    }

    @Override // oj1.f
    public void n3() {
        wz(true);
        this.f7142gv++;
    }

    @Override // oj1.f
    public void w() {
        this.f7142gv--;
    }

    @Override // oj1.f
    public void xc() {
        v(' ');
    }

    @Override // oj1.f
    public void zn() {
        wz(false);
        i9("\n");
        int i = this.f7142gv;
        for (int i5 = 0; i5 < i; i5++) {
            i9(this.zn.v().c5());
        }
    }
}
