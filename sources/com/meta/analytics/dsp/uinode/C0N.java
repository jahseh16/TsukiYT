package com.meta.analytics.dsp.uinode;

import com.google.protobuf.Reader;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0N, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0N extends BufferedInputStream {
    public int A00;
    public int A01;
    public boolean A02;

    public C0N(InputStream inputStream) {
        super(inputStream);
        this.A00 = Reader.READ_DONE;
    }

    public final boolean A00() {
        return this.A02;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.A00 = i;
        super.mark(i);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = this.A01;
        if (i + 1 > this.A00) {
            this.A02 = true;
            return -1;
        }
        this.A01 = i + 1;
        return super.read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        if (this.A01 + bArr.length > this.A00) {
            this.A02 = true;
            return -1;
        }
        return super.read(bArr);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i5) throws IOException {
        if (this.A01 + i5 > this.A00) {
            this.A02 = true;
            return -1;
        }
        int i8 = super.read(bArr, i, i5);
        int read = this.A01;
        this.A01 = read + i8;
        return i8;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.A00 = Reader.READ_DONE;
        super.reset();
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) throws IOException {
        int i = this.A01;
        if (((long) i) + j > this.A00) {
            this.A02 = true;
            return 0L;
        }
        this.A01 = (int) (((long) i) + j);
        return super.skip(j);
    }
}
