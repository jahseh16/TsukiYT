package v0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public final File n3;
    public final File y;

    public static final class y extends OutputStream {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f8754v = false;
        public final FileOutputStream y;

        public y(File file) throws FileNotFoundException {
            this.y = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f8754v) {
                return;
            }
            this.f8754v = true;
            flush();
            try {
                this.y.getFD().sync();
            } catch (IOException e4) {
                r.i9("AtomicFile", "Failed to sync file descriptor:", e4);
            }
            this.y.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.y.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.y.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.y.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i5) throws IOException {
            this.y.write(bArr, i, i5);
        }
    }

    public n3(File file) {
        this.y = file;
        this.n3 = new File(file.getPath() + ".bak");
    }

    public OutputStream a() throws IOException {
        if (this.y.exists()) {
            if (this.n3.exists()) {
                this.y.delete();
            } else if (!this.y.renameTo(this.n3)) {
                r.c5("AtomicFile", "Couldn't rename file " + this.y + " to backup file " + this.n3);
            }
        }
        try {
            return new y(this.y);
        } catch (FileNotFoundException e4) {
            File parentFile = this.y.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.y, e4);
            }
            try {
                return new y(this.y);
            } catch (FileNotFoundException e5) {
                throw new IOException("Couldn't create " + this.y, e5);
            }
        }
    }

    public InputStream gv() throws FileNotFoundException {
        v();
        return new FileInputStream(this.y);
    }

    public void n3(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.n3.delete();
    }

    public final void v() {
        if (this.n3.exists()) {
            this.y.delete();
            this.n3.renameTo(this.y);
        }
    }

    public void y() {
        this.y.delete();
        this.n3.delete();
    }

    public boolean zn() {
        return this.y.exists() || this.n3.exists();
    }
}
