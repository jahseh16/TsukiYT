package b1;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface tl extends r0.c5 {
    long f();

    long getLength();

    long getPosition();

    boolean i9(byte[] bArr, int i, int i5, boolean z) throws IOException;

    boolean mt(int i, boolean z) throws IOException;

    @Override // r0.c5
    int read(byte[] bArr, int i, int i5) throws IOException;

    void readFully(byte[] bArr, int i, int i5) throws IOException;

    void s();

    void tl(int i) throws IOException;

    boolean v(byte[] bArr, int i, int i5, boolean z) throws IOException;

    void w(int i) throws IOException;

    int wz(int i) throws IOException;

    int xc(byte[] bArr, int i, int i5) throws IOException;

    void z(byte[] bArr, int i, int i5) throws IOException;
}
