package h6;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class n3 implements xc {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long f5313gv;
    public final long n3;
    public final long zn;

    public n3(long j, long j4) {
        this.n3 = j;
        this.zn = j4;
        a();
    }

    public void a() {
        this.f5313gv = this.n3 - 1;
    }

    public final long gv() {
        return this.f5313gv;
    }

    @Override // h6.xc
    public boolean next() {
        this.f5313gv++;
        return !v();
    }

    public boolean v() {
        return this.f5313gv > this.zn;
    }

    public final void zn() {
        long j = this.f5313gv;
        if (j < this.n3 || j > this.zn) {
            throw new NoSuchElementException();
        }
    }
}
