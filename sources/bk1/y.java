package bk1;

import hk1.en;
import hk1.k;
import hk1.x;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface y {
    public static final C0039y y = C0039y.y;
    public static final y n3 = new C0039y.C0040y();

    /* JADX INFO: renamed from: bk1.y$y, reason: collision with other inner class name */
    public static final class C0039y {
        public static final /* synthetic */ C0039y y = new C0039y();

        /* JADX INFO: renamed from: bk1.y$y$y, reason: collision with other inner class name */
        public static final class C0040y implements y {
            @Override // bk1.y
            public k a(File file) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return x.c5(file, false, 1, (Object) null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return x.c5(file, false, 1, (Object) null);
                }
            }

            @Override // bk1.y
            public void fb(File from, File to) throws IOException {
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to, "to");
                s(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // bk1.y
            public long gv(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.length();
            }

            @Override // bk1.y
            public boolean n3(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.exists();
            }

            @Override // bk1.y
            public void s(File file) throws IOException {
                Intrinsics.checkNotNullParameter(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException(Intrinsics.stringPlus("failed to delete ", file));
                }
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }

            @Override // bk1.y
            public en v(File file) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(file, "file");
                return x.i9(file);
            }

            @Override // bk1.y
            public void y(File directory) throws IOException {
                Intrinsics.checkNotNullParameter(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException(Intrinsics.stringPlus("not a readable directory: ", directory));
                }
                int length = fileArrListFiles.length;
                int i = 0;
                while (i < length) {
                    File file = fileArrListFiles[i];
                    i++;
                    if (file.isDirectory()) {
                        Intrinsics.checkNotNullExpressionValue(file, "file");
                        y(file);
                    }
                    if (!file.delete()) {
                        throw new IOException(Intrinsics.stringPlus("failed to delete ", file));
                    }
                }
            }

            @Override // bk1.y
            public k zn(File file) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return x.y(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return x.y(file);
                }
            }
        }
    }

    k a(File file) throws FileNotFoundException;

    void fb(File file, File file2) throws IOException;

    long gv(File file);

    boolean n3(File file);

    void s(File file) throws IOException;

    en v(File file) throws FileNotFoundException;

    void y(File file) throws IOException;

    k zn(File file) throws FileNotFoundException;
}
