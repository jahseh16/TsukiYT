package oq;

import b1.i4;
import b1.tl;

/* JADX INFO: loaded from: classes.dex */
public final class zn extends i4 {
    public final long n3;

    public zn(tl tlVar, long j) {
        super(tlVar);
        v0.y.y(tlVar.getPosition() >= j);
        this.n3 = j;
    }

    @Override // b1.i4, b1.tl
    public long f() {
        return super.f() - this.n3;
    }

    @Override // b1.i4, b1.tl
    public long getLength() {
        return super.getLength() - this.n3;
    }

    @Override // b1.i4, b1.tl
    public long getPosition() {
        return super.getPosition() - this.n3;
    }
}
