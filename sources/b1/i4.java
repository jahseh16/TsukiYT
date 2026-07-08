package b1;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class i4 implements tl {
    public final tl y;

    public i4(tl tlVar) {
        this.y = tlVar;
    }

    @Override // b1.tl
    public long f() {
        return this.y.f();
    }

    @Override // b1.tl
    public long getLength() {
        return this.y.getLength();
    }

    @Override // b1.tl
    public long getPosition() {
        return this.y.getPosition();
    }

    @Override // b1.tl
    public boolean i9(byte[] bArr, int i, int i5, boolean z) throws IOException {
        return this.y.i9(bArr, i, i5, z);
    }

    @Override // b1.tl
    public boolean mt(int i, boolean z) throws IOException {
        return this.y.mt(i, z);
    }

    @Override // b1.tl, r0.c5
    public int read(byte[] bArr, int i, int i5) throws IOException {
        return this.y.read(bArr, i, i5);
    }

    @Override // b1.tl
    public void readFully(byte[] bArr, int i, int i5) throws IOException {
        this.y.readFully(bArr, i, i5);
    }

    @Override // b1.tl
    public void s() {
        this.y.s();
    }

    @Override // b1.tl
    public void tl(int i) throws IOException {
        this.y.tl(i);
    }

    @Override // b1.tl
    public boolean v(byte[] bArr, int i, int i5, boolean z) throws IOException {
        return this.y.v(bArr, i, i5, z);
    }

    @Override // b1.tl
    public void w(int i) throws IOException {
        this.y.w(i);
    }

    @Override // b1.tl
    public int wz(int i) throws IOException {
        return this.y.wz(i);
    }

    @Override // b1.tl
    public int xc(byte[] bArr, int i, int i5) throws IOException {
        return this.y.xc(bArr, i, i5);
    }

    @Override // b1.tl
    public void z(byte[] bArr, int i, int i5) throws IOException {
        this.y.z(bArr, i, i5);
    }
}
