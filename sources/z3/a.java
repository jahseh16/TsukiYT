package z3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import v3.rs;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Context n3;
    public final long y;
    public File zn;

    public a(Context context) throws PackageManager.NameNotFoundException {
        this.n3 = context;
        this.y = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public static String f3(String str) {
        return String.valueOf(str).concat(".apk");
    }

    public static File p(File file, String str) throws IOException {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    public static File r(File file) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                return file;
            }
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
        file.mkdirs();
        if (file.isDirectory()) {
            return file;
        }
        String strValueOf = String.valueOf(file.getAbsolutePath());
        throw new IOException(strValueOf.length() != 0 ? "Unable to create directory: ".concat(strValueOf) : new String("Unable to create directory: "));
    }

    public static void t(File file) throws IOException {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                t(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", file.getAbsolutePath()));
        }
    }

    public static void tl(File file) {
        file.setWritable(false, true);
        file.setWritable(false, false);
    }

    public static boolean w(File file) {
        return !file.canWrite();
    }

    public final File a(File file) throws IOException {
        return p(z(), file.getName());
    }

    public final Set c5(String str) throws IOException {
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = co(str).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    public final File co(String str) throws IOException {
        File fileP = p(mt(), str);
        r(fileP);
        return fileP;
    }

    public final void f() throws IOException {
        File fileX4 = x4();
        String[] list = fileX4.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.y))) {
                    File file = new File(fileX4, str);
                    String string = file.toString();
                    long j = this.y;
                    StringBuilder sb = new StringBuilder(string.length() + 118);
                    sb.append("FileStorage: removing directory for different version code (directory = ");
                    sb.append(string);
                    sb.append(", current version code = ");
                    sb.append(j);
                    sb.append(")");
                    Log.d("SplitCompat", sb.toString());
                    t(file);
                }
            }
        }
    }

    public final File fb(String str) throws IOException {
        return p(z(), f3(str));
    }

    public final File gv() throws IOException {
        return new File(i4(), "lock.tmp");
    }

    public final File i4() throws IOException {
        File file = new File(x4(), Long.toString(this.y));
        r(file);
        return file;
    }

    public final Set i9() throws IOException {
        File fileZ = z();
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = fileZ.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile() && file.getName().endsWith(".apk") && w(file)) {
                    hashSet.add(new zn(file, file.getName().substring(0, r6.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public final File mt() throws IOException {
        File file = new File(i4(), "native-libraries");
        r(file);
        return file;
    }

    public final File n3() throws IOException {
        File file = new File(i4(), "unverified-splits");
        r(file);
        return file;
    }

    public final List s() throws IOException {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = mt().listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    public final File v(String str) throws IOException {
        return p(n3(), f3(str));
    }

    public final void wz(String str) throws IOException {
        t(co(str));
    }

    public final File x4() throws IOException {
        if (this.zn == null) {
            Context context = this.n3;
            if (context == null) {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
            this.zn = context.getFilesDir();
        }
        File file = new File(this.zn, "splitcompat");
        r(file);
        return file;
    }

    public final void xc(File file) throws IOException {
        rs.n3(file.getParentFile().getParentFile().equals(mt()), "File to remove is not a native library");
        t(file);
    }

    public final File y(String str) throws IOException {
        File file = new File(i4(), "dex");
        r(file);
        File fileP = p(file, str);
        r(fileP);
        return fileP;
    }

    public final File z() throws IOException {
        File file = new File(i4(), "verified-splits");
        r(file);
        return file;
    }

    public final File zn(String str, String str2) throws IOException {
        return p(co(str), str2);
    }
}
