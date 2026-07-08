package z3;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public final class i9 implements t {
    public final /* synthetic */ z n3;
    public final /* synthetic */ Set y;
    public final /* synthetic */ ZipFile zn;

    public i9(wz wzVar, Set set, z zVar, ZipFile zipFile) {
        this.y = set;
        this.n3 = zVar;
        this.zn = zipFile;
    }

    @Override // z3.t
    public final void y(tl tlVar, File file, boolean z) throws IOException {
        this.y.add(file);
        if (z) {
            return;
        }
        Log.i("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", this.n3.n3(), tlVar.y, this.n3.y().getAbsolutePath(), tlVar.n3.getName(), file.getAbsolutePath()));
        ZipFile zipFile = this.zn;
        ZipEntry zipEntry = tlVar.n3;
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                a.tl(file);
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable unused2) {
                }
            }
            throw th2;
        }
    }
}
