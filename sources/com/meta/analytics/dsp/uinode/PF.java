package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PF extends InputStream {
    public int A00;
    public long A01;
    public InterfaceC0615Gu A02;
    public final Uri A03;
    public final C1063Ym A04;
    public final InterfaceC0614Gt A05;
    public final String A06;

    public PF(C1063Ym c1063Ym, Uri uri, InterfaceC0614Gt interfaceC0614Gt) throws IOException {
        this.A04 = c1063Ym;
        this.A05 = interfaceC0614Gt;
        this.A03 = uri;
        this.A06 = R0.A08(c1063Ym, uri);
        A00(0);
    }

    private void A00(int i) throws IOException {
        InterfaceC0615Gu interfaceC0615Gu = this.A02;
        if (interfaceC0615Gu != null) {
            interfaceC0615Gu.close();
        }
        this.A02 = this.A05.A4X();
        this.A01 = (int) this.A02.ADl(new C0619Gy(this.A03, i, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b4 = new byte[1];
        return read(b4);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i5) throws IOException {
        int i8 = this.A02.read(bArr, i, i5);
        int read = this.A00;
        this.A00 = read + i8;
        return i8;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long j4 = this.A01;
        int i = this.A00;
        long skipped = j4 - ((long) i);
        if (skipped <= 0) {
            return 0L;
        }
        if (j > skipped) {
            j = skipped;
        }
        int i5 = (int) (((long) i) + j);
        this.A00 = i5;
        A00(i5);
        return j;
    }
}
