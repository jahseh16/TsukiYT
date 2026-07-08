package t0;

import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import r0.f;
import t0.y;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements r0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public File f8129a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public long f8130c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public OutputStream f8131fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public r0.p f8132gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public co f8133i9;
    public final long n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f8134s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f8135v;
    public final t0.y y;
    public final int zn;

    /* JADX INFO: renamed from: t0.n3$n3, reason: collision with other inner class name */
    public static final class C0173n3 implements f.y {
        public t0.y y;
        public long n3 = 5242880;
        public int zn = 20480;

        public C0173n3 n3(t0.y yVar) {
            this.y = yVar;
            return this;
        }

        @Override // r0.f.y
        public r0.f y() {
            return new n3((t0.y) v0.y.v(this.y), this.n3, this.zn);
        }

        public C0173n3 zn(long j) {
            this.n3 = j;
            return this;
        }
    }

    public static final class y extends y.C0174y {
        public y(IOException iOException) {
            super(iOException);
        }
    }

    public n3(t0.y yVar, long j, int i) {
        v0.y.s(j > 0 || j == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j != -1 && j < 2097152) {
            v0.r.c5("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.y = (t0.y) v0.y.v(yVar);
        this.n3 = j == -1 ? Long.MAX_VALUE : j;
        this.zn = i;
    }

    @Override // r0.f
    public void close() throws y {
        if (this.f8132gv == null) {
            return;
        }
        try {
            n3();
        } catch (IOException e4) {
            throw new y(e4);
        }
    }

    public final void n3() throws IOException {
        OutputStream outputStream = this.f8131fb;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            ut.wz(this.f8131fb);
            this.f8131fb = null;
            File file = (File) ut.i9(this.f8129a);
            this.f8129a = null;
            this.y.i9(file, this.f8134s);
        } catch (Throwable th) {
            ut.wz(this.f8131fb);
            this.f8131fb = null;
            File file2 = (File) ut.i9(this.f8129a);
            this.f8129a = null;
            file2.delete();
            throw th;
        }
    }

    @Override // r0.f
    public void write(byte[] bArr, int i, int i5) throws y {
        r0.p pVar = this.f8132gv;
        if (pVar == null) {
            return;
        }
        int i8 = 0;
        while (i8 < i5) {
            try {
                if (this.f8134s == this.f8135v) {
                    n3();
                    zn(pVar);
                }
                int iMin = (int) Math.min(i5 - i8, this.f8135v - this.f8134s);
                ((OutputStream) ut.i9(this.f8131fb)).write(bArr, i + i8, iMin);
                i8 += iMin;
                long j = iMin;
                this.f8134s += j;
                this.f8130c5 += j;
            } catch (IOException e4) {
                throw new y(e4);
            }
        }
    }

    @Override // r0.f
    public void y(r0.p pVar) throws y {
        v0.y.v(pVar.f7519c5);
        if (pVar.f7524s == -1 && pVar.gv(2)) {
            this.f8132gv = null;
            return;
        }
        this.f8132gv = pVar;
        this.f8135v = pVar.gv(4) ? this.n3 : Long.MAX_VALUE;
        this.f8130c5 = 0L;
        try {
            zn(pVar);
        } catch (IOException e4) {
            throw new y(e4);
        }
    }

    public final void zn(r0.p pVar) throws IOException {
        long j = pVar.f7524s;
        this.f8129a = this.y.y((String) ut.i9(pVar.f7519c5), pVar.f7521fb + this.f8130c5, j != -1 ? Math.min(j - this.f8130c5, this.f8135v) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f8129a);
        if (this.zn > 0) {
            co coVar = this.f8133i9;
            if (coVar == null) {
                this.f8133i9 = new co(fileOutputStream, this.zn);
            } else {
                coVar.y(fileOutputStream);
            }
            this.f8131fb = this.f8133i9;
        } else {
            this.f8131fb = fileOutputStream;
        }
        this.f8134s = 0L;
    }
}
