package r0;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class xc extends InputStream {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f7591t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p f7592v;
    public final tl y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7590s = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7588f = false;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final byte[] f7589fb = new byte[1];

    public xc(tl tlVar, p pVar) {
        this.y = tlVar;
        this.f7592v = pVar;
    }

    public void a() throws IOException {
        y();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f7588f) {
            return;
        }
        this.y.close();
        this.f7588f = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f7589fb) == -1) {
            return -1;
        }
        return this.f7589fb[0] & 255;
    }

    public final void y() throws IOException {
        if (this.f7590s) {
            return;
        }
        this.y.y(this.f7592v);
        this.f7590s = true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i5) throws IOException {
        v0.y.fb(!this.f7588f);
        y();
        int i8 = this.y.read(bArr, i, i5);
        if (i8 == -1) {
            return -1;
        }
        this.f7591t += (long) i8;
        return i8;
    }
}
