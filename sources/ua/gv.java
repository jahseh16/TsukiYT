package ua;

import v0.d;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class gv implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8367a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f8368gv;
    public final int n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8369v;
    public final int y;
    public final int zn;

    public gv(int i, int i5, int i8, int i10, int i11, int i12) {
        this.y = i;
        this.n3 = i5;
        this.zn = i8;
        this.f8368gv = i10;
        this.f8369v = i11;
        this.f8367a = i12;
    }

    public static gv zn(d dVar) {
        int iR = dVar.r();
        dVar.ut(12);
        int iR2 = dVar.r();
        int iR3 = dVar.r();
        int iR4 = dVar.r();
        dVar.ut(4);
        int iR5 = dVar.r();
        int iR6 = dVar.r();
        dVar.ut(8);
        return new gv(iR, iR2, iR3, iR4, iR5, iR6);
    }

    @Override // ua.y
    public int getType() {
        return 1752331379;
    }

    public int n3() {
        int i = this.y;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        r.c5("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.y));
        return -1;
    }

    public long y() {
        return ut.x5(this.f8369v, ((long) this.zn) * 1000000, this.f8368gv);
    }
}
