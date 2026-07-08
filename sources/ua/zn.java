package ua;

import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements y {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f8390gv;
    public final int n3;
    public final int y;
    public final int zn;

    public zn(int i, int i5, int i8, int i10) {
        this.y = i;
        this.n3 = i5;
        this.zn = i8;
        this.f8390gv = i10;
    }

    public static zn n3(d dVar) {
        int iR = dVar.r();
        dVar.ut(8);
        int iR2 = dVar.r();
        int iR3 = dVar.r();
        dVar.ut(4);
        int iR4 = dVar.r();
        dVar.ut(12);
        return new zn(iR, iR2, iR3, iR4);
    }

    @Override // ua.y
    public int getType() {
        return 1751742049;
    }

    public boolean y() {
        return (this.n3 & 16) == 16;
    }
}
