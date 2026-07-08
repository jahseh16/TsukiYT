package r6;

import ia.gv;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final boolean f7725gv;
    public final ia.s n3;
    public final y y;
    public final gv zn;

    public enum y {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public s(y yVar, ia.s sVar, gv gvVar, boolean z) {
        this.y = yVar;
        this.n3 = sVar;
        this.zn = gvVar;
        this.f7725gv = z;
    }

    public boolean gv() {
        return this.f7725gv;
    }

    public ia.s n3() {
        return this.n3;
    }

    public y y() {
        return this.y;
    }

    public gv zn() {
        return this.zn;
    }
}
